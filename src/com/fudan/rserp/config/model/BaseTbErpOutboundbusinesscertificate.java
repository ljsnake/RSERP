package com.fudan.rserp.config.model;

import java.io.Serializable;

/**
 * This is an object that contains data related to the tb_erp_outboundBusinessCertificate table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 * For more information visit <a href="http://hibernatesynch.sourceforge.net">
 * The Hibernate Synchronizer page</a>, or contact
 * <a href="mailto: jhudson8.users.sourceforge.net">Joe Hudson</a>
 *
 * @hibernate.class
 *  table="tb_erp_outboundBusinessCertificate"
 */

public abstract class BaseTbErpOutboundbusinesscertificate   implements Serializable {

	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.Float certificateMoney;
	private java.lang.Integer trackUserID;
	private java.lang.String remark;
	private java.lang.Float certificateCost;
	private java.lang.Integer state;
	private java.lang.Integer copiesNumber;
	private java.lang.String pathOfCopy;
	private java.sql.Date invalidDate;
	private java.sql.Date writeoffsDate;
	private java.lang.String certificateNumber;
	private java.lang.Integer documentNumber;
	private java.lang.Integer contractID;
	private java.sql.Date effectiveDate;
	private java.lang.Integer stateOfCopy;

	// constructors
	public BaseTbErpOutboundbusinesscertificate () {}

	/**
	 * Constructor for primary key
	 */
	public BaseTbErpOutboundbusinesscertificate (java.lang.Integer id) {
		this.setId(id);
	}

	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class=""
     *  column="id"
     */
	public java.lang.Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}

	/**
     * @hibernate.property
     *  column=certificateMoney
	 */
	public java.lang.Float getCertificateMoney () {
		return this.certificateMoney;
	}

	/**
	 * Set the value related to the column: certificateMoney
	 * @param certificateMoney the certificateMoney value
	 */
	public void setCertificateMoney (java.lang.Float certificateMoney) {
		this.certificateMoney = certificateMoney;
	}

	/**
     * @hibernate.property
     *  column=trackUserID
	 */
	public java.lang.Integer getTrackUserID () {
		return this.trackUserID;
	}

	/**
	 * Set the value related to the column: trackUserID
	 * @param trackUserID the trackUserID value
	 */
	public void setTrackUserID (java.lang.Integer trackUserID) {
		this.trackUserID = trackUserID;
	}

	/**
     * @hibernate.property
     *  column=remark
	 */
	public java.lang.String getRemark () {
		return this.remark;
	}

	/**
	 * Set the value related to the column: remark
	 * @param remark the remark value
	 */
	public void setRemark (java.lang.String remark) {
		this.remark = remark;
	}

	/**
     * @hibernate.property
     *  column=certificateCost
	 */
	public java.lang.Float getCertificateCost () {
		return this.certificateCost;
	}

	/**
	 * Set the value related to the column: certificateCost
	 * @param certificateCost the certificateCost value
	 */
	public void setCertificateCost (java.lang.Float certificateCost) {
		this.certificateCost = certificateCost;
	}

	/**
     * @hibernate.property
     *  column=state
	 */
	public java.lang.Integer getState () {
		return this.state;
	}

	/**
	 * Set the value related to the column: state
	 * @param state the state value
	 */
	public void setState (java.lang.Integer state) {
		this.state = state;
	}

	/**
     * @hibernate.property
     *  column=copiesNumber
	 */
	public java.lang.Integer getCopiesNumber () {
		return this.copiesNumber;
	}

	/**
	 * Set the value related to the column: copiesNumber
	 * @param copiesNumber the copiesNumber value
	 */
	public void setCopiesNumber (java.lang.Integer copiesNumber) {
		this.copiesNumber = copiesNumber;
	}

	/**
     * @hibernate.property
     *  column=pathOfCopy
	 */
	public java.lang.String getPathOfCopy () {
		return this.pathOfCopy;
	}

	/**
	 * Set the value related to the column: pathOfCopy
	 * @param pathOfCopy the pathOfCopy value
	 */
	public void setPathOfCopy (java.lang.String pathOfCopy) {
		this.pathOfCopy = pathOfCopy;
	}

	/**
     * @hibernate.property
     *  column=invalidDate
	 */
	public java.sql.Date getInvalidDate () {
		return this.invalidDate;
	}

	/**
	 * Set the value related to the column: invalidDate
	 * @param invalidDate the invalidDate value
	 */
	public void setInvalidDate (java.sql.Date invalidDate) {
		this.invalidDate = invalidDate;
	}

	/**
     * @hibernate.property
     *  column=writeoffsDate
	 */
	public java.sql.Date getWriteoffsDate () {
		return this.writeoffsDate;
	}

	/**
	 * Set the value related to the column: writeoffsDate
	 * @param writeoffsDate the writeoffsDate value
	 */
	public void setWriteoffsDate (java.sql.Date writeoffsDate) {
		this.writeoffsDate = writeoffsDate;
	}

	/**
     * @hibernate.property
     *  column=certificateNumber
	 */
	public java.lang.String getCertificateNumber () {
		return this.certificateNumber;
	}

	/**
	 * Set the value related to the column: certificateNumber
	 * @param certificateNumber the certificateNumber value
	 */
	public void setCertificateNumber (java.lang.String certificateNumber) {
		this.certificateNumber = certificateNumber;
	}

	/**
     * @hibernate.property
     *  column=documentNumber
	 */
	public java.lang.Integer getDocumentNumber () {
		return this.documentNumber;
	}

	/**
	 * Set the value related to the column: documentNumber
	 * @param documentNumber the documentNumber value
	 */
	public void setDocumentNumber (java.lang.Integer documentNumber) {
		this.documentNumber = documentNumber;
	}

	/**
     * @hibernate.property
     *  column=contractID
	 */
	public java.lang.Integer getContractID () {
		return this.contractID;
	}

	/**
	 * Set the value related to the column: contractID
	 * @param contractID the contractID value
	 */
	public void setContractID (java.lang.Integer contractID) {
		this.contractID = contractID;
	}

	/**
     * @hibernate.property
     *  column=effectiveDate
	 */
	public java.sql.Date getEffectiveDate () {
		return this.effectiveDate;
	}

	/**
	 * Set the value related to the column: effectiveDate
	 * @param effectiveDate the effectiveDate value
	 */
	public void setEffectiveDate (java.sql.Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	/**
     * @hibernate.property
     *  column=stateOfCopy
	 */
	public java.lang.Integer getStateOfCopy () {
		return this.stateOfCopy;
	}

	/**
	 * Set the value related to the column: stateOfCopy
	 * @param stateOfCopy the stateOfCopy value
	 */
	public void setStateOfCopy (java.lang.Integer stateOfCopy) {
		this.stateOfCopy = stateOfCopy;
	}


	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.fudan.rserp.config.model.BaseTbErpOutboundbusinesscertificate)) return false;
		else {
			com.fudan.rserp.config.model.BaseTbErpOutboundbusinesscertificate mObj = (com.fudan.rserp.config.model.BaseTbErpOutboundbusinesscertificate) obj;
			if (null == this.getId() || null == mObj.getId()) return false;
			else return (this.getId().equals(mObj.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}

}