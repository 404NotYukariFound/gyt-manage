package com.eight.gytManage.pojo;


import java.sql.Timestamp;
import java.sql.Date;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TbNatmehaPatient {
	// itemid ：
	private Long itemid;
	// 唯一标识UUID
	private String itemcode;
	// 就诊人名称
	private String patientName;
	// 性别
	private String gender;
	// 身份证件类型
	private String idcardType;
	// 证件号码
	private String idcardNo;
	// 电话号码
	private String phone;
	// 关系
	private String relationship;
	// 是否为默认就诊人
	private String defaultPatient;
	// 地址省份code
	private String adressPro;
	// 市级code
	private String adressCity;
	// 地区省份
	private String adressCountry;
	// 地址(手动输入)
	private String adress;
	// 婚姻状况
	private String maritalStatus;
	// 用户code
	private String userCode;
	// 创建人
	private String creater;
	// 创建时间
	private Timestamp itemcreateat;
	// 修改人
	private String updater;
	// 修改时间
	private Timestamp itemupdateat;
	// birthdate ：
	private Date birthdate;

	// 无参构造器
	public TbNatmehaPatient() {
	}

	// 有参构造器，进行属性值的初始化
	public TbNatmehaPatient(Long itemid, String itemcode, String patientName, String gender, String idcardType, String idcardNo, String phone, String relationship, String defaultPatient, String adressPro, String adressCity, String adressCountry, String adress, String maritalStatus, String userCode, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat, Date birthdate) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.patientName = patientName;
		this.gender = gender;
		this.idcardType = idcardType;
		this.idcardNo = idcardNo;
		this.phone = phone;
		this.relationship = relationship;
		this.defaultPatient = defaultPatient;
		this.adressPro = adressPro;
		this.adressCity = adressCity;
		this.adressCountry = adressCountry;
		this.adress = adress;
		this.maritalStatus = maritalStatus;
		this.userCode = userCode;
		this.creater = creater;
		this.itemcreateat = itemcreateat;
		this.updater = updater;
		this.itemupdateat = itemupdateat;
		this.birthdate = birthdate;
	}

	// 获取 itemid 的属性值
	public Long getItemid() {
		return itemid;
	}

	// 设置 itemid 的属性值
	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	// 获取 唯一标识UUID 的属性值
	public String getItemcode() {
		return itemcode;
	}

	// 设置 唯一标识UUID 的属性值
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	// 获取 就诊人名称 的属性值
	public String getPatientName() {
		return patientName;
	}

	// 设置 就诊人名称 的属性值
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	// 获取 性别 的属性值
	public String getGender() {
		return gender;
	}

	// 设置 性别 的属性值
	public void setGender(String gender) {
		this.gender = gender;
	}

	// 获取 身份证件类型 的属性值
	public String getIdcardType() {
		return idcardType;
	}

	// 设置 身份证件类型 的属性值
	public void setIdcardType(String idcardType) {
		this.idcardType = idcardType;
	}

	// 获取 证件号码 的属性值
	public String getIdcardNo() {
		return idcardNo;
	}

	// 设置 证件号码 的属性值
	public void setIdcardNo(String idcardNo) {
		this.idcardNo = idcardNo;
	}

	// 获取 电话号码 的属性值
	public String getPhone() {
		return phone;
	}

	// 设置 电话号码 的属性值
	public void setPhone(String phone) {
		this.phone = phone;
	}

	// 获取 关系 的属性值
	public String getRelationship() {
		return relationship;
	}

	// 设置 关系 的属性值
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	// 获取 是否为默认就诊人 的属性值
	public String getDefaultPatient() {
		return defaultPatient;
	}

	// 设置 是否为默认就诊人 的属性值
	public void setDefaultPatient(String defaultPatient) {
		this.defaultPatient = defaultPatient;
	}

	// 获取 地址省份code 的属性值
	public String getadressPro() {
		return adressPro;
	}

	// 设置 地址省份code 的属性值
	public void setadressPro(String adressPro) {
		this.adressPro = adressPro;
	}

	// 获取 市级code 的属性值
	public String getadressCity() {
		return adressCity;
	}

	// 设置 市级code 的属性值
	public void setadressCity(String adressCity) {
		this.adressCity = adressCity;
	}

	// 获取 地区省份 的属性值
	public String getadressCountry() {
		return adressCountry;
	}

	// 设置 地区省份 的属性值
	public void setadressCountry(String adressCountry) {
		this.adressCountry = adressCountry;
	}

	// 获取 地址(手动输入) 的属性值
	public String getadress() {
		return adress;
	}

	// 设置 地址(手动输入) 的属性值
	public void setadress(String adress) {
		this.adress = adress;
	}

	// 获取 婚姻状况 的属性值
	public String getMaritalStatus() {
		return maritalStatus;
	}

	// 设置 婚姻状况 的属性值
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	// 获取 用户code 的属性值
	public String getUserCode() {
		return userCode;
	}

	// 设置 用户code 的属性值
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	// 获取 创建人 的属性值
	public String getCreater() {
		return creater;
	}

	// 设置 创建人 的属性值
	public void setCreater(String creater) {
		this.creater = creater;
	}

	// 获取 创建时间 的属性值
	public Timestamp getItemcreateat() {
		return itemcreateat;
	}

	// 设置 创建时间 的属性值
	public void setItemcreateat(Timestamp itemcreateat) {
		this.itemcreateat = itemcreateat;
	}

	// 获取 修改人 的属性值
	public String getUpdater() {
		return updater;
	}

	// 设置 修改人 的属性值
	public void setUpdater(String updater) {
		this.updater = updater;
	}

	// 获取 修改时间 的属性值
	public Timestamp getItemupdateat() {
		return itemupdateat;
	}

	// 设置 修改时间 的属性值
	public void setItemupdateat(Timestamp itemupdateat) {
		this.itemupdateat = itemupdateat;
	}

	// 获取 birthdate 的属性值
	public Date getBirthdate() {
		return birthdate;
	}

	// 设置 birthdate 的属性值
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "TbNatmehaPatient {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", patientName='" + patientName + '\'' + 
				", gender='" + gender + '\'' + 
				", idcardType='" + idcardType + '\'' + 
				", idcardNo='" + idcardNo + '\'' + 
				", phone='" + phone + '\'' + 
				", relationship='" + relationship + '\'' + 
				", defaultPatient='" + defaultPatient + '\'' + 
				", adressPro='" + adressPro + '\'' + 
				", adressCity='" + adressCity + '\'' + 
				", adressCountry='" + adressCountry + '\'' + 
				", adress='" + adress + '\'' + 
				", maritalStatus='" + maritalStatus + '\'' + 
				", userCode='" + userCode + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				", birthdate='" + birthdate + '\'' + 
				"}";
	}
}