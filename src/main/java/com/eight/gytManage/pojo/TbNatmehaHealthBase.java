package com.eight.gytManage.pojo;


import java.sql.Date;
import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TbNatmehaHealthBase {
	// itemid ：
	private Long itemid;
	// patientId ：
	private String patientId;
	// 真实姓名
	private String name;
	// 证件类型代码
	private String idType;
	// 身份证件号码
	private String idNo;
	// 性别(0-未知的性别、1-男性、2-女性、9-未说明的性别)
	private String sex;
	// 出生日期
	private Date birthDate;
	// 文化程度
	private String education;
	// 户口性质
	private String accoProperty;
	// 婚姻状况
	private String marriage;
	// 移动电话
	private String mobilePhone;
	// 民族
	private String nationality;
	// 出生详细地址
	private String birthPlace;
	// 既往患病种类
	private String pastSicknessType;
	// 家族性疾病名称
	private String familyDisease;
	// 患者与本人关系
	private String patientRelation;
	// 创建人
	private String creater;
	// 创建时间
	private Timestamp itemcreateat;
	// 修改人
	private String updater;
	// 修改时间
	private Timestamp itemupdateat;

	// 无参构造器
	public TbNatmehaHealthBase() {
	}

	// 有参构造器，进行属性值的初始化
	public TbNatmehaHealthBase(Long itemid, String patientId, String name, String idType, String idNo, String sex, Date birthDate, String education, String accoProperty, String marriage, String mobilePhone, String nationality, String birthPlace, String pastSicknessType, String familyDisease, String patientRelation, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.patientId = patientId;
		this.name = name;
		this.idType = idType;
		this.idNo = idNo;
		this.sex = sex;
		this.birthDate = birthDate;
		this.education = education;
		this.accoProperty = accoProperty;
		this.marriage = marriage;
		this.mobilePhone = mobilePhone;
		this.nationality = nationality;
		this.birthPlace = birthPlace;
		this.pastSicknessType = pastSicknessType;
		this.familyDisease = familyDisease;
		this.patientRelation = patientRelation;
		this.creater = creater;
		this.itemcreateat = itemcreateat;
		this.updater = updater;
		this.itemupdateat = itemupdateat;
	}

	// 获取 itemid 的属性值
	public Long getItemid() {
		return itemid;
	}

	// 设置 itemid 的属性值
	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	// 获取 patientId 的属性值
	public String getPatientId() {
		return patientId;
	}

	// 设置 patientId 的属性值
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	// 获取 真实姓名 的属性值
	public String getName() {
		return name;
	}

	// 设置 真实姓名 的属性值
	public void setName(String name) {
		this.name = name;
	}

	// 获取 证件类型代码 的属性值
	public String getIdType() {
		return idType;
	}

	// 设置 证件类型代码 的属性值
	public void setIdType(String idType) {
		this.idType = idType;
	}

	// 获取 身份证件号码 的属性值
	public String getIdNo() {
		return idNo;
	}

	// 设置 身份证件号码 的属性值
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	// 获取 性别(0-未知的性别、1-男性、2-女性、9-未说明的性别) 的属性值
	public String getSex() {
		return sex;
	}

	// 设置 性别(0-未知的性别、1-男性、2-女性、9-未说明的性别) 的属性值
	public void setSex(String sex) {
		this.sex = sex;
	}

	// 获取 出生日期 的属性值
	public Date getBirthDate() {
		return birthDate;
	}

	// 设置 出生日期 的属性值
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	// 获取 文化程度 的属性值
	public String getEducation() {
		return education;
	}

	// 设置 文化程度 的属性值
	public void setEducation(String education) {
		this.education = education;
	}

	// 获取 户口性质 的属性值
	public String getaccoProperty() {
		return accoProperty;
	}

	// 设置 户口性质 的属性值
	public void setaccoProperty(String accoProperty) {
		this.accoProperty = accoProperty;
	}

	// 获取 婚姻状况 的属性值
	public String getMarriage() {
		return marriage;
	}

	// 设置 婚姻状况 的属性值
	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	// 获取 移动电话 的属性值
	public String getMobilePhone() {
		return mobilePhone;
	}

	// 设置 移动电话 的属性值
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	// 获取 民族 的属性值
	public String getNationality() {
		return nationality;
	}

	// 设置 民族 的属性值
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	// 获取 出生详细地址 的属性值
	public String getBirthPlace() {
		return birthPlace;
	}

	// 设置 出生详细地址 的属性值
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	// 获取 既往患病种类 的属性值
	public String getPastSicknessType() {
		return pastSicknessType;
	}

	// 设置 既往患病种类 的属性值
	public void setPastSicknessType(String pastSicknessType) {
		this.pastSicknessType = pastSicknessType;
	}

	// 获取 家族性疾病名称 的属性值
	public String getFamilyDisease() {
		return familyDisease;
	}

	// 设置 家族性疾病名称 的属性值
	public void setFamilyDisease(String familyDisease) {
		this.familyDisease = familyDisease;
	}

	// 获取 患者与本人关系 的属性值
	public String getPatientRelation() {
		return patientRelation;
	}

	// 设置 患者与本人关系 的属性值
	public void setPatientRelation(String patientRelation) {
		this.patientRelation = patientRelation;
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

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "TbNatmehaHealthBase {" + 
				", itemid='" + itemid + '\'' + 
				", patientId='" + patientId + '\'' + 
				", name='" + name + '\'' + 
				", idType='" + idType + '\'' + 
				", idNo='" + idNo + '\'' + 
				", sex='" + sex + '\'' + 
				", birthDate='" + birthDate + '\'' + 
				", education='" + education + '\'' + 
				", accoProperty='" + accoProperty + '\'' + 
				", marriage='" + marriage + '\'' + 
				", mobilePhone='" + mobilePhone + '\'' + 
				", nationality='" + nationality + '\'' + 
				", birthPlace='" + birthPlace + '\'' + 
				", pastSicknessType='" + pastSicknessType + '\'' + 
				", familyDisease='" + familyDisease + '\'' + 
				", patientRelation='" + patientRelation + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}