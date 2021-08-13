package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TbNatmehaDoctor {
	// 自增id
	private Long itemid;
	// UUID
	private String itemcode;
	// 医生姓名
	private String doctorName;
	// 医生职称
	private String doctorTitle;
	// 擅长治疗
	private String doctorTreatment;
	// 评分
	private Double doctorSorce;
	// 科室code（默认都为中医科）
	private String deptCode;
	// 挂号类别
	private String numType;
	// 用户code
	private String userCode;
	// 创建者
	private String creater;
	// 创建时间
	private Timestamp itemcreateat;
	// 修改人
	private String updater;
	// 修改时间
	private Timestamp itemupdateat;
	// 机构（医院）itemcode
	private String orgCode;

	// 无参构造器
	public TbNatmehaDoctor() {
	}

	// 有参构造器，进行属性值的初始化
	public TbNatmehaDoctor(Long itemid, String itemcode, String doctorName, String doctorTitle, String doctorTreatment, Double doctorSorce, String deptCode, String numType, String userCode, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat, String orgCode) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.doctorName = doctorName;
		this.doctorTitle = doctorTitle;
		this.doctorTreatment = doctorTreatment;
		this.doctorSorce = doctorSorce;
		this.deptCode = deptCode;
		this.numType = numType;
		this.userCode = userCode;
		this.creater = creater;
		this.itemcreateat = itemcreateat;
		this.updater = updater;
		this.itemupdateat = itemupdateat;
		this.orgCode = orgCode;
	}

	// 获取 自增id 的属性值
	public Long getItemid() {
		return itemid;
	}

	// 设置 自增id 的属性值
	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	// 获取 UUID 的属性值
	public String getItemcode() {
		return itemcode;
	}

	// 设置 UUID 的属性值
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	// 获取 医生姓名 的属性值
	public String getDoctorName() {
		return doctorName;
	}

	// 设置 医生姓名 的属性值
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	// 获取 医生职称 的属性值
	public String getDoctorTitle() {
		return doctorTitle;
	}

	// 设置 医生职称 的属性值
	public void setDoctorTitle(String doctorTitle) {
		this.doctorTitle = doctorTitle;
	}

	// 获取 擅长治疗 的属性值
	public String getDoctorTreatment() {
		return doctorTreatment;
	}

	// 设置 擅长治疗 的属性值
	public void setDoctorTreatment(String doctorTreatment) {
		this.doctorTreatment = doctorTreatment;
	}

	// 获取 评分 的属性值
	public Double getDoctorSorce() {
		return doctorSorce;
	}

	// 设置 评分 的属性值
	public void setDoctorSorce(Double doctorSorce) {
		this.doctorSorce = doctorSorce;
	}

	// 获取 科室code（默认都为中医科） 的属性值
	public String getDeptCode() {
		return deptCode;
	}

	// 设置 科室code（默认都为中医科） 的属性值
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	// 获取 挂号类别 的属性值
	public String getNumType() {
		return numType;
	}

	// 设置 挂号类别 的属性值
	public void setNumType(String numType) {
		this.numType = numType;
	}

	// 获取 用户code 的属性值
	public String getUserCode() {
		return userCode;
	}

	// 设置 用户code 的属性值
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	// 获取 创建者 的属性值
	public String getCreater() {
		return creater;
	}

	// 设置 创建者 的属性值
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

	// 获取 机构（医院）itemcode 的属性值
	public String getOrgCode() {
		return orgCode;
	}

	// 设置 机构（医院）itemcode 的属性值
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "TbNatmehaDoctor {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", doctorName='" + doctorName + '\'' + 
				", doctorTitle='" + doctorTitle + '\'' + 
				", doctorTreatment='" + doctorTreatment + '\'' + 
				", doctorSorce='" + doctorSorce + '\'' + 
				", deptCode='" + deptCode + '\'' + 
				", numType='" + numType + '\'' + 
				", userCode='" + userCode + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				", orgCode='" + orgCode + '\'' + 
				"}";
	}
}