/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class T_986_2Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.cubrid.generatedclasses.tables.records.T_986_2Record> {

	private static final long serialVersionUID = 255910198;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setRef(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.T_986_2.REF, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getRef() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.T_986_2.REF);
	}

	/**
	 * Create a detached T_986_2Record
	 */
	public T_986_2Record() {
		super(org.jooq.test.cubrid.generatedclasses.tables.T_986_2.T_986_2);
	}
}