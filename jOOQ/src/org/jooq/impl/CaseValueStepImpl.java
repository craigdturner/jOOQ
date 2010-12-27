/**
 * Copyright (c) 2010, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name of the "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq.impl;

import org.jooq.CaseValueStep;
import org.jooq.CaseWhenStep;
import org.jooq.Field;

class CaseValueStepImpl<V> implements CaseValueStep<V> {

    private final Factory  factory;
    private final Field<V> value;

    CaseValueStepImpl(Factory factory, Field<V> value) {
        this.factory = factory;
        this.value = value;
    }

    private <Z> Field<Z> constant(Z value) {
        return factory.constant(value);
    }

    @Override
    public <T> CaseWhenStep<V, T> when(V compareValue, T result) {
        return when(constant(compareValue), constant(result));
    }

    @Override
    public <T> CaseWhenStep<V, T> when(V compareValue, Field<T> result) {
        return when(constant(compareValue), result);
    }

    @Override
    public <T> CaseWhenStep<V, T> when(Field<V> compareValue, T result) {
        return when(compareValue, constant(result));
    }

    @Override
    public <T> CaseWhenStep<V, T> when(Field<V> compareValue, Field<T> result) {
        return new CaseWhenStepImpl<V, T>(factory, "", result.getType(), value, compareValue, result);
    }
}
