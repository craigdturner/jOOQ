/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ContactCreditCard", schema = "Sales", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"ContactID", "CreditCardID"})
})
public class Contactcreditcard implements java.io.Serializable {

	private static final long serialVersionUID = 1498520360;

	private java.lang.Integer  contactid;
	private java.lang.Integer  creditcardid;
	private java.sql.Timestamp modifieddate;

	@javax.persistence.Column(name = "ContactID")
	public java.lang.Integer getContactid() {
		return this.contactid;
	}

	public void setContactid(java.lang.Integer contactid) {
		this.contactid = contactid;
	}

	@javax.persistence.Column(name = "CreditCardID")
	public java.lang.Integer getCreditcardid() {
		return this.creditcardid;
	}

	public void setCreditcardid(java.lang.Integer creditcardid) {
		this.creditcardid = creditcardid;
	}

	@javax.persistence.Column(name = "ModifiedDate")
	public java.sql.Timestamp getModifieddate() {
		return this.modifieddate;
	}

	public void setModifieddate(java.sql.Timestamp modifieddate) {
		this.modifieddate = modifieddate;
	}
}