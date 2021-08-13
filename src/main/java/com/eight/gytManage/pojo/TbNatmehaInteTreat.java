package com.eight.gytManage.pojo;


import java.sql.Date;
import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TbNatmehaInteTreat {
	// itemid ：
	private Long itemid;
	// 唯一标识UUID
	private String itemcode;
	// 性别
	private String gender;
	// 证件号码
	private Date birth;
	// 不适部位
	private String discomfortSite;
	// 不适症状
	private String symptom;
	// 辅助描述症状
	private String describe;
	// 处于节点位置
	private String position;
	// 节点是否完成
	private String status;
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
	public TbNatmehaInteTreat() {
	}

	// 有参构造器，进行属性值的初始化
	public TbNatmehaInteTreat(Long itemid, String itemcode, String gender, Date birth, String discomfortSite, String symptom, String describe, String position, String status, String userCode, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.gender = gender;
		this.birth = birth;
		this.discomfortSite = discomfortSite;
		this.symptom = symptom;
		this.describe = describe;
		this.position = position;
		this.status = status;
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

	// 获取 性别 的属性值
	public String getGender() {
		return gender;
	}

	// 设置 性别 的属性值
	public void setGender(String gender) {
		this.gender = gender;
	}

	// 获取 证件号码 的属性值
	public Date getBirth() {
		return birth;
	}

	// 设置 证件号码 的属性值
	public void setBirth(Date birth) {
		this.birth = birth;
	}

	// 获取 不适部位 的属性值
	public String getDiscomfortSite() {
		return discomfortSite;
	}

	// 设置 不适部位 的属性值
	public void setDiscomfortSite(String discomfortSite) {
		this.discomfortSite = discomfortSite;
	}

	// 获取 不适症状 的属性值
	public String getSymptom() {
		return symptom;
	}

	// 设置 不适症状 的属性值
	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	// 获取 辅助描述症状 的属性值
	public String getDescribe() {
		return describe;
	}

	// 设置 辅助描述症状 的属性值
	public void setDescribe(String describe) {
		this.describe = describe;
	}

	// 获取 处于节点位置 的属性值
	public String getPosition() {
		return position;
	}

	// 设置 处于节点位置 的属性值
	public void setPosition(String position) {
		this.position = position;
	}

	// 获取 节点是否完成 的属性值
	public String getStatus() {
		return status;
	}

	// 设置 节点是否完成 的属性值
	public void setStatus(String status) {
		this.status = status;
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
		return "TbNatmehaInteTreat {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", gender='" + gender + '\'' + 
				", birth='" + birth + '\'' + 
				", discomfortSite='" + discomfortSite + '\'' + 
				", symptom='" + symptom + '\'' + 
				", describe='" + describe + '\'' + 
				", position='" + position + '\'' + 
				", status='" + status + '\'' + 
				", userCode='" + userCode + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}