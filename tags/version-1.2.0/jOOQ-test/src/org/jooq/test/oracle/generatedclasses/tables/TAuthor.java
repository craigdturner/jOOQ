/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables;

import java.sql.Date;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.test.oracle.generatedclasses.OdsTest;
import org.jooq.test.oracle.generatedclasses.tables.records.TAuthorRecord;


/**
 * This class is generated by jOOQ.
 *
 * An entity holding authors of books
 */
public class TAuthor extends TableImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of T_AUTHOR
	 */
	public static final TAuthor T_AUTHOR = new TAuthor();

	/**
	 * The class holding records for this table
	 */
	private static final Class<TAuthorRecord> RECORD_TYPE = TAuthorRecord.class;

	/**
	 * The class holding records for this table
	 */
	@Override
	public Class<TAuthorRecord> getRecordType() {
		return RECORD_TYPE;
	}

	/**
	 * The author ID
	 */
	public static final TableField<Integer> ID = new TableFieldImpl<Integer>("ID", Integer.class, T_AUTHOR);

	/**
	 * The author's first name
	 */
	public static final TableField<String> FIRST_NAME = new TableFieldImpl<String>("FIRST_NAME", String.class, T_AUTHOR);

	/**
	 * The author's last name
	 */
	public static final TableField<String> LAST_NAME = new TableFieldImpl<String>("LAST_NAME", String.class, T_AUTHOR);

	/**
	 * The author's date of birth
	 */
	public static final TableField<Date> DATE_OF_BIRTH = new TableFieldImpl<Date>("DATE_OF_BIRTH", Date.class, T_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private TAuthor() {
		super("T_AUTHOR", OdsTest.ODS_TEST);
	}
}
