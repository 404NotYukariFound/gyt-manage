package com.eight.gytManage.pojo;


import java.sql.Date;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TbNatmehaHealthChildren {
	// itemid ：
	private Long itemid;
	// 唯一标识UUID
	private String itemcode;
	// baseinfo中patient_id
	private String patientId;
	// 新生儿姓名
	private String newbornName;
	// 新生儿性别
	private String newbornSex;
	// 新生儿出生日期
	private Date newbornBirthDate;
	// 总检结论
	private String examSummary;
	// 新生儿身份证件类别
	private String newbornIdType;
	// 新生儿身份证件号码
	private String newbornIdNo;
	// 父亲姓名
	private String fatherName;
	// 母亲姓名
	private String motherName;
	// 出生体重(g)
	private BigDecimal birthWeight;
	// 出生身长
	private BigDecimal birthLength;
	// 体重
	private BigDecimal weight;
	// 身长
	private BigDecimal length;
	// 喂养方式类别
	private String feedWay;
	// 药物使用途径
	private String drugRoute;
	// 每天吃奶次数
	private Integer dailyFeedingTimes;
	// 每天吃奶量（mL)
	private Integer dailyFeedingamount;
	// 既往患病种类
	private Integer stoolTimes;
	// 随访医生名称
	private String visitDoctorName;
	// 本次访问日期
	private LocalDateTime thisVisitDate;
	// 下次访问日期
	private LocalDateTime nextVisitDate;
	// 创建人
	private String creater;
	// 创建时间
	private Timestamp itemcreateat;
	// 修改人
	private String updater;
	// 修改时间
	private Timestamp itemupdateat;

	// 无参构造器
	public TbNatmehaHealthChildren() {
	}

	// 有参构造器，进行属性值的初始化
	public TbNatmehaHealthChildren(Long itemid, String itemcode, String patientId, String newbornName, String newbornSex, Date newbornBirthDate, String examSummary, String newbornIdType, String newbornIdNo, String fatherName, String motherName, BigDecimal birthWeight, BigDecimal birthLength, BigDecimal weight, BigDecimal length, String feedWay, String drugRoute, Integer dailyFeedingTimes, Integer dailyFeedingamount, Integer stoolTimes, String visitDoctorName, LocalDateTime thisVisitDate, LocalDateTime nextVisitDate, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.patientId = patientId;
		this.newbornName = newbornName;
		this.newbornSex = newbornSex;
		this.newbornBirthDate = newbornBirthDate;
		this.examSummary = examSummary;
		this.newbornIdType = newbornIdType;
		this.newbornIdNo = newbornIdNo;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.birthWeight = birthWeight;
		this.birthLength = birthLength;
		this.weight = weight;
		this.length = length;
		this.feedWay = feedWay;
		this.drugRoute = drugRoute;
		this.dailyFeedingTimes = dailyFeedingTimes;
		this.dailyFeedingamount = dailyFeedingamount;
		this.stoolTimes = stoolTimes;
		this.visitDoctorName = visitDoctorName;
		this.thisVisitDate = thisVisitDate;
		this.nextVisitDate = nextVisitDate;
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

	// 获取 baseinfo中patient_id 的属性值
	public String getPatientId() {
		return patientId;
	}

	// 设置 baseinfo中patient_id 的属性值
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	// 获取 新生儿姓名 的属性值
	public String getNewbornName() {
		return newbornName;
	}

	// 设置 新生儿姓名 的属性值
	public void setNewbornName(String newbornName) {
		this.newbornName = newbornName;
	}

	// 获取 新生儿性别 的属性值
	public String getNewbornSex() {
		return newbornSex;
	}

	// 设置 新生儿性别 的属性值
	public void setNewbornSex(String newbornSex) {
		this.newbornSex = newbornSex;
	}

	// 获取 新生儿出生日期 的属性值
	public Date getNewbornBirthDate() {
		return newbornBirthDate;
	}

	// 设置 新生儿出生日期 的属性值
	public void setNewbornBirthDate(Date newbornBirthDate) {
		this.newbornBirthDate = newbornBirthDate;
	}

	// 获取 总检结论 的属性值
	public String getExamSummary() {
		return examSummary;
	}

	// 设置 总检结论 的属性值
	public void setExamSummary(String examSummary) {
		this.examSummary = examSummary;
	}

	// 获取 新生儿身份证件类别 的属性值
	public String getNewbornIdType() {
		return newbornIdType;
	}

	// 设置 新生儿身份证件类别 的属性值
	public void setNewbornIdType(String newbornIdType) {
		this.newbornIdType = newbornIdType;
	}

	// 获取 新生儿身份证件号码 的属性值
	public String getNewbornIdNo() {
		return newbornIdNo;
	}

	// 设置 新生儿身份证件号码 的属性值
	public void setNewbornIdNo(String newbornIdNo) {
		this.newbornIdNo = newbornIdNo;
	}

	// 获取 父亲姓名 的属性值
	public String getFatherName() {
		return fatherName;
	}

	// 设置 父亲姓名 的属性值
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	// 获取 母亲姓名 的属性值
	public String getMotherName() {
		return motherName;
	}

	// 设置 母亲姓名 的属性值
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	// 获取 出生体重(g) 的属性值
	public BigDecimal getBirthWeight() {
		return birthWeight;
	}

	// 设置 出生体重(g) 的属性值
	public void setBirthWeight(BigDecimal birthWeight) {
		this.birthWeight = birthWeight;
	}

	// 获取 出生身长 的属性值
	public BigDecimal getBirthLength() {
		return birthLength;
	}

	// 设置 出生身长 的属性值
	public void setBirthLength(BigDecimal birthLength) {
		this.birthLength = birthLength;
	}

	// 获取 体重 的属性值
	public BigDecimal getWeight() {
		return weight;
	}

	// 设置 体重 的属性值
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	// 获取 身长 的属性值
	public BigDecimal getLength() {
		return length;
	}

	// 设置 身长 的属性值
	public void setLength(BigDecimal length) {
		this.length = length;
	}

	// 获取 喂养方式类别 的属性值
	public String getFeedWay() {
		return feedWay;
	}

	// 设置 喂养方式类别 的属性值
	public void setFeedWay(String feedWay) {
		this.feedWay = feedWay;
	}

	// 获取 药物使用途径 的属性值
	public String getDrugRoute() {
		return drugRoute;
	}

	// 设置 药物使用途径 的属性值
	public void setDrugRoute(String drugRoute) {
		this.drugRoute = drugRoute;
	}

	// 获取 每天吃奶次数 的属性值
	public Integer getDailyFeedingTimes() {
		return dailyFeedingTimes;
	}

	// 设置 每天吃奶次数 的属性值
	public void setDailyFeedingTimes(Integer dailyFeedingTimes) {
		this.dailyFeedingTimes = dailyFeedingTimes;
	}

	// 获取 每天吃奶量（mL) 的属性值
	public Integer getDailyFeedingamount() {
		return dailyFeedingamount;
	}

	// 设置 每天吃奶量（mL) 的属性值
	public void setDailyFeedingamount(Integer dailyFeedingamount) {
		this.dailyFeedingamount = dailyFeedingamount;
	}

	// 获取 既往患病种类 的属性值
	public Integer getStoolTimes() {
		return stoolTimes;
	}

	// 设置 既往患病种类 的属性值
	public void setStoolTimes(Integer stoolTimes) {
		this.stoolTimes = stoolTimes;
	}

	// 获取 随访医生名称 的属性值
	public String getVisitDoctorName() {
		return visitDoctorName;
	}

	// 设置 随访医生名称 的属性值
	public void setVisitDoctorName(String visitDoctorName) {
		this.visitDoctorName = visitDoctorName;
	}

	// 获取 本次访问日期 的属性值
	public LocalDateTime getThisVisitDate() {
		return thisVisitDate;
	}

	// 设置 本次访问日期 的属性值
	public void setThisVisitDate(LocalDateTime thisVisitDate) {
		this.thisVisitDate = thisVisitDate;
	}

	// 获取 下次访问日期 的属性值
	public LocalDateTime getNextVisitDate() {
		return nextVisitDate;
	}

	// 设置 下次访问日期 的属性值
	public void setNextVisitDate(LocalDateTime nextVisitDate) {
		this.nextVisitDate = nextVisitDate;
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
		return "TbNatmehaHealthChildren {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", patientId='" + patientId + '\'' + 
				", newbornName='" + newbornName + '\'' + 
				", newbornSex='" + newbornSex + '\'' + 
				", newbornBirthDate='" + newbornBirthDate + '\'' + 
				", examSummary='" + examSummary + '\'' + 
				", newbornIdType='" + newbornIdType + '\'' + 
				", newbornIdNo='" + newbornIdNo + '\'' + 
				", fatherName='" + fatherName + '\'' + 
				", motherName='" + motherName + '\'' + 
				", birthWeight='" + birthWeight + '\'' + 
				", birthLength='" + birthLength + '\'' + 
				", weight='" + weight + '\'' + 
				", length='" + length + '\'' + 
				", feedWay='" + feedWay + '\'' + 
				", drugRoute='" + drugRoute + '\'' + 
				", dailyFeedingTimes='" + dailyFeedingTimes + '\'' + 
				", dailyFeedingamount='" + dailyFeedingamount + '\'' + 
				", stoolTimes='" + stoolTimes + '\'' + 
				", visitDoctorName='" + visitDoctorName + '\'' + 
				", thisVisitDate='" + thisVisitDate + '\'' + 
				", nextVisitDate='" + nextVisitDate + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}