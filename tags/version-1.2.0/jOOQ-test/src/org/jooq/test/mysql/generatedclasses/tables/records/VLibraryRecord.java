/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.records;

import org.jooq.Result;
import org.jooq.impl.RecordImpl;
import org.jooq.test.mysql.generatedclasses.tables.VLibrary;


/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
public class VLibraryRecord extends RecordImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 */
	public void setAuthor(String value) {
		setValue(VLibrary.AUTHOR, value);
	}

	/**
	 * An uncommented item
	 */
	public String getAuthor() {
		return getValue(VLibrary.AUTHOR);
	}

	/**
	 * The book's title
	 */
	public void setTitle(String value) {
		setValue(VLibrary.TITLE, value);
	}

	/**
	 * The book's title
	 */
	public String getTitle() {
		return getValue(VLibrary.TITLE);
	}

	public VLibraryRecord(Result result) {
		super(result);
	}
}
