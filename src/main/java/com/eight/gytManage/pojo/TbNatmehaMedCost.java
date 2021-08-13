package com.eight.gytManage.pojo;


import java.sql.Date;
import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TbNatmehaMedCost {
	// itemid ：
	private Long itemid;
	// 门诊记录表编号
	private String outpatFormNo;
	// 就诊机构名称
	private String visitOrgName;
	// 就诊科室名称
	private String visitDeptName;
	// 就诊日期时间
	private Date visitDtime;
	// specifications ：
	private String specifications;
	// price ：
	private Double price;
	// num ：
	private String num;
	// 门诊个人承担费用金额（元）
	private Double outpatSelfPayment;
	// 住院个人承担费用金额（元）
	private Double inpatSelfPayment;
	// creater ：
	private String creater;
	// itemcreateat ：
	private Timestamp itemcreateat;
	// updater ：
	private String updater;
	// itemupdateat ：
	private Timestamp itemupdateat;

	// 无参构造器
	public TbNatmehaMedCost() {
	}

	// 有参构造器，进行属性值的初始化
	public TbNatmehaMedCost(Long itemid, String outpatFormNo, String visitOrgName, String visitDeptName, Date visitDtime, String specifications, Double price, String num, Double outpatSelfPayment, Double inpatSelfPayment, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.outpatFormNo = outpatFormNo;
		this.visitOrgName = visitOrgName;
		this.visitDeptName = visitDeptName;
		this.visitDtime = visitDtime;
		this.specifications = specifications;
		this.price = price;
		this.num = num;
		this.outpatSelfPayment = outpatSelfPayment;
		this.inpatSelfPayment = inpatSelfPayment;
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

	// 获取 门诊记录表编号 的属性值
	public String getOutpatFormNo() {
		return outpatFormNo;
	}

	// 设置 门诊记录表编号 的属性值
	public void setOutpatFormNo(String outpatFormNo) {
		this.outpatFormNo = outpatFormNo;
	}

	// 获取 就诊机构名称 的属性值
	public String getVisitOrgName() {
		return visitOrgName;
	}

	// 设置 就诊机构名称 的属性值
	public void setVisitOrgName(String visitOrgName) {
		this.visitOrgName = visitOrgName;
	}

	// 获取 就诊科室名称 的属性值
	public String getVisitDeptName() {
		return visitDeptName;
	}

	// 设置 就诊科室名称 的属性值
	public void setVisitDeptName(String visitDeptName) {
		this.visitDeptName = visitDeptName;
	}

	// 获取 就诊日期时间 的属性值
	public Date getVisitDtime() {
		return visitDtime;
	}

	// 设置 就诊日期时间 的属性值
	public void setVisitDtime(Date visitDtime) {
		this.visitDtime = visitDtime;
	}

	// 获取 specifications 的属性值
	public String getSpecifications() {
		return specifications;
	}

	// 设置 specifications 的属性值
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	// 获取 price 的属性值
	public Double getPrice() {
		return price;
	}

	// 设置 price 的属性值
	public void setPrice(Double price) {
		this.price = price;
	}

	// 获取 num 的属性值
	public String getNum() {
		return num;
	}

	// 设置 num 的属性值
	public void setNum(String num) {
		this.num = num;
	}

	// 获取 门诊个人承担费用金额（元） 的属性值
	public Double getOutpatSelfPayment() {
		return outpatSelfPayment;
	}

	// 设置 门诊个人承担费用金额（元） 的属性值
	public void setOutpatSelfPayment(Double outpatSelfPayment) {
		this.outpatSelfPayment = outpatSelfPayment;
	}

	// 获取 住院个人承担费用金额（元） 的属性值
	public Double getInpatSelfPayment() {
		return inpatSelfPayment;
	}

	// 设置 住院个人承担费用金额（元） 的属性值
	public void setInpatSelfPayment(Double inpatSelfPayment) {
		this.inpatSelfPayment = inpatSelfPayment;
	}

	// 获取 creater 的属性值
	public String getCreater() {
		return creater;
	}

	// 设置 creater 的属性值
	public void setCreater(String creater) {
		this.creater = creater;
	}

	// 获取 itemcreateat 的属性值
	public Timestamp getItemcreateat() {
		return itemcreateat;
	}

	// 设置 itemcreateat 的属性值
	public void setItemcreateat(Timestamp itemcreateat) {
		this.itemcreateat = itemcreateat;
	}

	// 获取 updater 的属性值
	public String getUpdater() {
		return updater;
	}

	// 设置 updater 的属性值
	public void setUpdater(String updater) {
		this.updater = updater;
	}

	// 获取 itemupdateat 的属性值
	public Timestamp getItemupdateat() {
		return itemupdateat;
	}

	// 设置 itemupdateat 的属性值
	public void setItemupdateat(Timestamp itemupdateat) {
		this.itemupdateat = itemupdateat;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "TbNatmehaMedCost {" + 
				", itemid='" + itemid + '\'' + 
				", outpatFormNo='" + outpatFormNo + '\'' + 
				", visitOrgName='" + visitOrgName + '\'' + 
				", visitDeptName='" + visitDeptName + '\'' + 
				", visitDtime='" + visitDtime + '\'' + 
				", specifications='" + specifications + '\'' + 
				", price='" + price + '\'' + 
				", num='" + num + '\'' + 
				", outpatSelfPayment='" + outpatSelfPayment + '\'' + 
				", inpatSelfPayment='" + inpatSelfPayment + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}