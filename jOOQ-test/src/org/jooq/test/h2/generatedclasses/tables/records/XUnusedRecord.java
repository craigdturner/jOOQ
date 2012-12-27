/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XUnusedRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.XUnusedRecord> implements org.jooq.test.h2.generatedclasses.tables.interfaces.IXUnused {

	private static final long serialVersionUID = 1877505283;

	/**
	 * The table column <code>PUBLIC.X_UNUSED.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XUnused.ID, value);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XUnused.ID);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 *
	 * @deprecated [#2040] - 2.7.0 - This method will be no longer be generated in jOOQ 3.0
	 */
	@Deprecated
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.records.XTestCase_64_69Record> fetchXTestCase_64_69List() {
		return create()
			.selectFrom(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69)
			.where(org.jooq.test.h2.generatedclasses.tables.XTestCase_64_69.UNUSED_ID.equal(getValue(org.jooq.test.h2.generatedclasses.tables.XUnused.ID)))
			.fetch();
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.NAME</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XUnused.NAME, value);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.NAME</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public java.lang.String getName() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XUnused.NAME);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.BIG_INTEGER</code>
	 */
	@Override
	public void setBigInteger(java.math.BigInteger value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XUnused.BIG_INTEGER, value);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.BIG_INTEGER</code>
	 */
	@Override
	public java.math.BigInteger getBigInteger() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XUnused.BIG_INTEGER);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.ID_REF</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_UNUSED_SELF
	 * FOREIGN KEY (ID_REF, ID_REF, NAME_REF, NAME_REF)
	 * REFERENCES PUBLIC.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	@Override
	public void setIdRef(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XUnused.ID_REF, value);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.ID_REF</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_UNUSED_SELF
	 * FOREIGN KEY (ID_REF, ID_REF, NAME_REF, NAME_REF)
	 * REFERENCES PUBLIC.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	@Override
	public java.lang.Integer getIdRef() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XUnused.ID_REF);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.NAME_REF</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_UNUSED_SELF
	 * FOREIGN KEY (ID_REF, ID_REF, NAME_REF, NAME_REF)
	 * REFERENCES PUBLIC.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	@Override
	public void setNameRef(java.lang.String value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XUnused.NAME_REF, value);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.NAME_REF</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_UNUSED_SELF
	 * FOREIGN KEY (ID_REF, ID_REF, NAME_REF, NAME_REF)
	 * REFERENCES PUBLIC.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	@Override
	public java.lang.String getNameRef() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XUnused.NAME_REF);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.CLASS</code>
	 */
	@Override
	public void setClass_(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XUnused.CLASS, value);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.CLASS</code>
	 */
	@Override
	public java.lang.Integer getClass_() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XUnused.CLASS);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.FIELDS</code>
	 */
	@Override
	public void setFields_(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XUnused.FIELDS, value);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.FIELDS</code>
	 */
	@Override
	public java.lang.Integer getFields_() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XUnused.FIELDS);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.TABLE</code>
	 */
	@Override
	public void setTable_(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XUnused.TABLE, value);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.TABLE</code>
	 */
	@Override
	public java.lang.Integer getTable_() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XUnused.TABLE);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.CONFIGURATION</code>
	 */
	@Override
	public void setConfiguration_(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XUnused.CONFIGURATION, value);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.CONFIGURATION</code>
	 */
	@Override
	public java.lang.Integer getConfiguration_() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XUnused.CONFIGURATION);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.U_D_T</code>
	 */
	@Override
	public void setUDT(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XUnused.U_D_T, value);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.U_D_T</code>
	 */
	@Override
	public java.lang.Integer getUDT() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XUnused.U_D_T);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.META_DATA</code>
	 */
	@Override
	public void setMetaData(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XUnused.META_DATA, value);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.META_DATA</code>
	 */
	@Override
	public java.lang.Integer getMetaData() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XUnused.META_DATA);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.VALUES</code>
	 */
	@Override
	public void setValues_(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XUnused.VALUES, value);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.VALUES</code>
	 */
	@Override
	public java.lang.Integer getValues_() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XUnused.VALUES);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.TYPE0</code>
	 */
	@Override
	public void setType0(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XUnused.TYPE0, value);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.TYPE0</code>
	 */
	@Override
	public java.lang.Integer getType0() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XUnused.TYPE0);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.PRIMARY_KEY</code>
	 */
	@Override
	public void setPrimaryKey(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XUnused.PRIMARY_KEY, value);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.PRIMARY_KEY</code>
	 */
	@Override
	public java.lang.Integer getPrimaryKey() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XUnused.PRIMARY_KEY);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.PRIMARYKEY</code>
	 */
	@Override
	public void setPrimarykey(java.lang.Integer value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XUnused.PRIMARYKEY, value);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.PRIMARYKEY</code>
	 */
	@Override
	public java.lang.Integer getPrimarykey() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XUnused.PRIMARYKEY);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.FIELD 737</code>
	 */
	@Override
	public void setField_737(java.math.BigDecimal value) {
		setValue(org.jooq.test.h2.generatedclasses.tables.XUnused.FIELD_737, value);
	}

	/**
	 * The table column <code>PUBLIC.X_UNUSED.FIELD 737</code>
	 */
	@Override
	public java.math.BigDecimal getField_737() {
		return getValue(org.jooq.test.h2.generatedclasses.tables.XUnused.FIELD_737);
	}

	/**
	 * Create a detached XUnusedRecord
	 */
	public XUnusedRecord() {
		super(org.jooq.test.h2.generatedclasses.tables.XUnused.X_UNUSED);
	}
}
