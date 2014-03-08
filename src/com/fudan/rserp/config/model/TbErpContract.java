package com.fudan.rserp.config.model;

import java.util.Date;

public class TbErpContract implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String contractNumber;
	private String contractName;
	private Date signingTime;
	private Date modifiedTime;
	private String modifiedUser;// 修改人[varchar](40)长度太长，建议[nvarchar](20)
	private String version;//版本[varchar](20),到时候会用来做排序，字符串9大于11，建议改为int.
//	private int subcontractorID;
//	private int contractorID;
	private String projectName;
	private String projectAdress;//地址[varchar](30)，建议[nvarchar](40)
	private String projectContent;//内容[varchar](30),建议[nvarchar](100)
	private float contractMoney;
	private float contractCost;
	private Date startDate;
	private Date endDate;
	private int cooperationType;
	private float managementFeePoint;
	private int copiesNumber;
	private String pathOfCopy;//附件路径[varchar](40)，建议[nvarchar](100)
	private int stateOfCopy;
	private int trackUserID;
	
	private TbErpSubcontractor subcontractor;
	private TbErpContractor contractor;
	//是否添加字段trackUserTime?
	
	public TbErpContract() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	public String getContractName() {
		return contractName;
	}
	public void setContractName(String contractName) {
		this.contractName = contractName;
	}
	public Date getSigningTime() {
		return signingTime;
	}
	public void setSigningTime(Date signingTime) {
		this.signingTime = signingTime;
	}
	public Date getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	public String getModifiedUser() {
		return modifiedUser;
	}
	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
//	public int getSubcontractorID() {
//		return subcontractorID;
//	}
//	public void setSubcontractorID(int subcontractorID) {
//		this.subcontractorID = subcontractorID;
//	}
//	public int getContractorID() {
//		return contractorID;
//	}
//	public void setContractorID(int contractorID) {
//		this.contractorID = contractorID;
//	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectAdress() {
		return projectAdress;
	}
	public void setProjectAdress(String projectAdress) {
		this.projectAdress = projectAdress;
	}
	public String getProjectContent() {
		return projectContent;
	}
	public void setProjectContent(String projectContent) {
		this.projectContent = projectContent;
	}
	public float getContractMoney() {
		return contractMoney;
	}
	public void setContractMoney(float contractMoney) {
		this.contractMoney = contractMoney;
	}
	public float getContractCost() {
		return contractCost;
	}
	public void setContractCost(float contractCost) {
		this.contractCost = contractCost;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getCooperationType() {
		return cooperationType;
	}
	public void setCooperationType(int cooperationType) {
		this.cooperationType = cooperationType;
	}
	public float getManagementFeePoint() {
		return managementFeePoint;
	}
	public void setManagementFeePoint(float managementFeePoint) {
		this.managementFeePoint = managementFeePoint;
	}
	public int getCopiesNumber() {
		return copiesNumber;
	}
	public void setCopiesNumber(int copiesNumber) {
		this.copiesNumber = copiesNumber;
	}
	public String getPathOfCopy() {
		return pathOfCopy;
	}
	public void setPathOfCopy(String pathOfCopy) {
		this.pathOfCopy = pathOfCopy;
	}
	public int getStateOfCopy() {
		return stateOfCopy;
	}
	public void setStateOfCopy(int stateOfCopy) {
		this.stateOfCopy = stateOfCopy;
	}
	public int getTrackUserID() {
		return trackUserID;
	}
	public void setTrackUserID(int trackUserID) {
		this.trackUserID = trackUserID;
	}
	public TbErpSubcontractor getSubcontractor() {
		return subcontractor;
	}
	public void setSubcontractor(TbErpSubcontractor subcontractor) {
		this.subcontractor = subcontractor;
	}
	public TbErpContractor getContractor() {
		return contractor;
	}
	public void setContractor(TbErpContractor contractor) {
		this.contractor = contractor;
	}
	
}