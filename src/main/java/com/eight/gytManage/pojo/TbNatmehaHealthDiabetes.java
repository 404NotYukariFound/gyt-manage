package com.eight.gytManage.pojo;


import java.time.LocalDateTime;
import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TbNatmehaHealthDiabetes {
	// itemid ：
	private Long itemid;
	// baseinfo中的patient_id
	private String patientId;
	// 责任医师姓名
	private String respDoctorName;
	// 随访方式
	private String visitWay;
	// 本次随访日期
	private LocalDateTime thisFollowupVisitDate;
	// 随访评价结果
	private String visitEvalResult;
	// 下次随访日期
	private LocalDateTime nextFollowupDate;
	// 随访医师姓名
	private String followupVisitDoctorName;
	// 症状名称
	private String symptomName;
	// 创建人
	private String creater;
	// 创建时间
	private Timestamp itemcreateat;
	// 修改人
	private String updater;
	// 修改时间
	private Timestamp itemupdateat;

	// 无参构造器
	public TbNatmehaHealthDiabetes() {
	}

	// 有参构造器，进行属性值的初始化
	public TbNatmehaHealthDiabetes(Long itemid, String patientId, String respDoctorName, String visitWay, LocalDateTime thisFollowupVisitDate, String visitEvalResult, LocalDateTime nextFollowupDate, String followupVisitDoctorName, String symptomName, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.patientId = patientId;
		this.respDoctorName = respDoctorName;
		this.visitWay = visitWay;
		this.thisFollowupVisitDate = thisFollowupVisitDate;
		this.visitEvalResult = visitEvalResult;
		this.nextFollowupDate = nextFollowupDate;
		this.followupVisitDoctorName = followupVisitDoctorName;
		this.symptomName = symptomName;
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

	// 获取 baseinfo中的patient_id 的属性值
	public String getPatientId() {
		return patientId;
	}

	// 设置 baseinfo中的patient_id 的属性值
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	// 获取 责任医师姓名 的属性值
	public String getRespDoctorName() {
		return respDoctorName;
	}

	// 设置 责任医师姓名 的属性值
	public void setRespDoctorName(String respDoctorName) {
		this.respDoctorName = respDoctorName;
	}

	// 获取 随访方式 的属性值
	public String getVisitWay() {
		return visitWay;
	}

	// 设置 随访方式 的属性值
	public void setVisitWay(String visitWay) {
		this.visitWay = visitWay;
	}

	// 获取 本次随访日期 的属性值
	public LocalDateTime getThisFollowupVisitDate() {
		return thisFollowupVisitDate;
	}

	// 设置 本次随访日期 的属性值
	public void setThisFollowupVisitDate(LocalDateTime thisFollowupVisitDate) {
		this.thisFollowupVisitDate = thisFollowupVisitDate;
	}

	// 获取 随访评价结果 的属性值
	public String getVisitEvalResult() {
		return visitEvalResult;
	}

	// 设置 随访评价结果 的属性值
	public void setVisitEvalResult(String visitEvalResult) {
		this.visitEvalResult = visitEvalResult;
	}

	// 获取 下次随访日期 的属性值
	public LocalDateTime getNextFollowupDate() {
		return nextFollowupDate;
	}

	// 设置 下次随访日期 的属性值
	public void setNextFollowupDate(LocalDateTime nextFollowupDate) {
		this.nextFollowupDate = nextFollowupDate;
	}

	// 获取 随访医师姓名 的属性值
	public String getFollowupVisitDoctorName() {
		return followupVisitDoctorName;
	}

	// 设置 随访医师姓名 的属性值
	public void setFollowupVisitDoctorName(String followupVisitDoctorName) {
		this.followupVisitDoctorName = followupVisitDoctorName;
	}

	// 获取 症状名称 的属性值
	public String getSymptomName() {
		return symptomName;
	}

	// 设置 症状名称 的属性值
	public void setSymptomName(String symptomName) {
		this.symptomName = symptomName;
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
		return "TbNatmehaHealthDiabetes {" + 
				", itemid='" + itemid + '\'' + 
				", patientId='" + patientId + '\'' + 
				", respDoctorName='" + respDoctorName + '\'' + 
				", visitWay='" + visitWay + '\'' + 
				", thisFollowupVisitDate='" + thisFollowupVisitDate + '\'' + 
				", visitEvalResult='" + visitEvalResult + '\'' + 
				", nextFollowupDate='" + nextFollowupDate + '\'' + 
				", followupVisitDoctorName='" + followupVisitDoctorName + '\'' + 
				", symptomName='" + symptomName + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}