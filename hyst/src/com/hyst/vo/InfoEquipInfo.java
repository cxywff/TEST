package com.hyst.vo;
public class InfoEquipInfo{
	/** */
	private int Id;
	/** */
	private String UniqueID;
	/** */
	private String OrgId;
	/** */
	private String StaffId;
	/** */
	private String SBXH;
	/** */
	private String Placement;
	/** */
	private String SecretLevelId;
	/** */
	private String Useage;
	/** */
	private String UseStateId;
	/** */
	private String InfoMemo;
	/** */
	private int IsDelete;
	/** */
	private String ManageAddr;
	/** */
	private java.sql.Timestamp  StartUsingTime;
	/** */
	private String SerialNum;
	/** */
	private String ISOVersionNum;
	/** */
	private String KeepSecretNumber;
	public int getId(){
		return this.Id;
	}
	public String getUniqueID(){
		return this.UniqueID;
	}
	public String getOrgId(){
		return this.OrgId;
	}
	public String getStaffId(){
		return this.StaffId;
	}
	public String getSBXH(){
		return this.SBXH;
	}
	public String getPlacement(){
		return this.Placement;
	}
	public String getSecretLevelId(){
		return this.SecretLevelId;
	}
	public String getUseage(){
		return this.Useage;
	}
	public String getUseStateId(){
		return this.UseStateId;
	}
	public String getInfoMemo(){
		return this.InfoMemo;
	}
	public int getIsDelete(){
		return this.IsDelete;
	}
	public String getManageAddr(){
		return this.ManageAddr;
	}
	public java.sql.Timestamp  getStartUsingTime(){
		return this.StartUsingTime;
	}
	public String getSerialNum(){
		return this.SerialNum;
	}
	public String getISOVersionNum(){
		return this.ISOVersionNum;
	}
	public String getKeepSecretNumber(){
		return this.KeepSecretNumber;
	}
	public void setId(int Id){
		this.Id = Id;
	}
	public void setUniqueID(String UniqueID){
		this.UniqueID = UniqueID;
	}
	public void setOrgId(String OrgId){
		this.OrgId = OrgId;
	}
	public void setStaffId(String StaffId){
		this.StaffId = StaffId;
	}
	public void setSBXH(String SBXH){
		this.SBXH = SBXH;
	}
	public void setPlacement(String Placement){
		this.Placement = Placement;
	}
	public void setSecretLevelId(String SecretLevelId){
		this.SecretLevelId = SecretLevelId;
	}
	public void setUseage(String Useage){
		this.Useage = Useage;
	}
	public void setUseStateId(String UseStateId){
		this.UseStateId = UseStateId;
	}
	public void setInfoMemo(String InfoMemo){
		this.InfoMemo = InfoMemo;
	}
	public void setIsDelete(int IsDelete){
		this.IsDelete = IsDelete;
	}
	public void setManageAddr(String ManageAddr){
		this.ManageAddr = ManageAddr;
	}
	public void setStartUsingTime(java.sql.Timestamp  StartUsingTime){
		this.StartUsingTime = StartUsingTime;
	}
	public void setSerialNum(String SerialNum){
		this.SerialNum = SerialNum;
	}
	public void setISOVersionNum(String ISOVersionNum){
		this.ISOVersionNum = ISOVersionNum;
	}
	public void setKeepSecretNumber(String KeepSecretNumber){
		this.KeepSecretNumber = KeepSecretNumber;
	}
}