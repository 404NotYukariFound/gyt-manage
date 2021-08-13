package com.eight.gytManage.pojo;


import java.sql.Date;
import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TbNatmehaHealthRecords {
	// itemid ：
	private Long itemid;
	// 唯一标识UUID
	private String itemcode;
	// 真实姓名
	private String name;
	// 性别
	private String gender;
	// 出生日期
	private Date birth;
	// 电话号码
	private String phone;
	// 地址省份code
	private String adressPro;
	// 市级code
	private String adressCity;
	// 地区省份
	private String adressCountry;
	// 地址(手动输入)
	private String adress;
	// 民族
	private String nation;
	// 血型
	private String bloodType;
	// 文化程度
	private String education;
	// 职业
	private String occupation;
	// 身高
	private Double height;
	// 体重
	private Double weight;
	// BMI
	private String bmi;
	// 疾病史
	private String diseaseHistory;
	// 过敏
	private String allergy;
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

	// 无参构造器
	public TbNatmehaHealthRecords() {
	}

	// 有参构造器，进行属性值的初始化
	public TbNatmehaHealthRecords(Long itemid, String itemcode, String name, String gender, Date birth, String phone, String adressPro, String adressCity, String adressCountry, String adress, String nation, String bloodType, String education, String occupation, Double height, Double weight, String bmi, String diseaseHistory, String allergy, String userCode, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.name = name;
		this.gender = gender;
		this.birth = birth;
		this.phone = phone;
		this.adressPro = adressPro;
		this.adressCity = adressCity;
		this.adressCountry = adressCountry;
		this.adress = adress;
		this.nation = nation;
		this.bloodType = bloodType;
		this.education = education;
		this.occupation = occupation;
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
		this.diseaseHistory = diseaseHistory;
		this.allergy = allergy;
		this.userCode = userCode;
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

	// 获取 唯一标识UUID 的属性值
	public String getItemcode() {
		return itemcode;
	}

	// 设置 唯一标识UUID 的属性值
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	// 获取 真实姓名 的属性值
	public String getName() {
		return name;
	}

	// 设置 真实姓名 的属性值
	public void setName(String name) {
		this.name = name;
	}

	// 获取 性别 的属性值
	public String getGender() {
		return gender;
	}

	// 设置 性别 的属性值
	public void setGender(String gender) {
		this.gender = gender;
	}

	// 获取 出生日期 的属性值
	public Date getBirth() {
		return birth;
	}

	// 设置 出生日期 的属性值
	public void setBirth(Date birth) {
		this.birth = birth;
	}

	// 获取 电话号码 的属性值
	public String getPhone() {
		return phone;
	}

	// 设置 电话号码 的属性值
	public void setPhone(String phone) {
		this.phone = phone;
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

	// 获取 民族 的属性值
	public String getNation() {
		return nation;
	}

	// 设置 民族 的属性值
	public void setNation(String nation) {
		this.nation = nation;
	}

	// 获取 血型 的属性值
	public String getBloodType() {
		return bloodType;
	}

	// 设置 血型 的属性值
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	// 获取 文化程度 的属性值
	public String getEducation() {
		return education;
	}

	// 设置 文化程度 的属性值
	public void setEducation(String education) {
		this.education = education;
	}

	// 获取 职业 的属性值
	public String getOccupation() {
		return occupation;
	}

	// 设置 职业 的属性值
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	// 获取 身高 的属性值
	public Double getHeight() {
		return height;
	}

	// 设置 身高 的属性值
	public void setHeight(Double height) {
		this.height = height;
	}

	// 获取 体重 的属性值
	public Double getWeight() {
		return weight;
	}

	// 设置 体重 的属性值
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	// 获取 BMI 的属性值
	public String getBmi() {
		return bmi;
	}

	// 设置 BMI 的属性值
	public void setBmi(String bmi) {
		this.bmi = bmi;
	}

	// 获取 疾病史 的属性值
	public String getDiseaseHistory() {
		return diseaseHistory;
	}

	// 设置 疾病史 的属性值
	public void setDiseaseHistory(String diseaseHistory) {
		this.diseaseHistory = diseaseHistory;
	}

	// 获取 过敏 的属性值
	public String getallergy() {
		return allergy;
	}

	// 设置 过敏 的属性值
	public void setallergy(String allergy) {
		this.allergy = allergy;
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

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "TbNatmehaHealthRecords {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", name='" + name + '\'' + 
				", gender='" + gender + '\'' + 
				", birth='" + birth + '\'' + 
				", phone='" + phone + '\'' + 
				", adressPro='" + adressPro + '\'' + 
				", adressCity='" + adressCity + '\'' + 
				", adressCountry='" + adressCountry + '\'' + 
				", adress='" + adress + '\'' + 
				", nation='" + nation + '\'' + 
				", bloodType='" + bloodType + '\'' + 
				", education='" + education + '\'' + 
				", occupation='" + occupation + '\'' + 
				", height='" + height + '\'' + 
				", weight='" + weight + '\'' + 
				", bmi='" + bmi + '\'' + 
				", diseaseHistory='" + diseaseHistory + '\'' + 
				", allergy='" + allergy + '\'' + 
				", userCode='" + userCode + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}