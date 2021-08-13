package com.eight.gytManage.pojo;


import java.sql.Timestamp;
import java.time.LocalDateTime;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TbNatmehaMedRecords {
	// itemid ：
	private Long itemid;
	// creater ：
	private String creater;
	// itemcreateat ：
	private Timestamp itemcreateat;
	// updater ：
	private String updater;
	// itemupdateat ：
	private Timestamp itemupdateat;
	// 门诊记录表编号
	private String outpatFormNo;
	// 身份证号
	private String idcardNo;
	// 就诊机构名称
	private String visitOrgName;
	// 就诊日期时间
	private LocalDateTime visitDtime;
	// 健康问题评估
	private String healthProblemEval;
	// 就诊医师
	private String respDoctorName;
	// 门诊诊断名称
	private String outpatDiagName;
	// 诊断日期
	private LocalDateTime diagDate;
	// 入院科室名称
	private String inDeptName;
	// 入院日期时间
	private LocalDateTime inDtime;
	// 出院日期时间
	private LocalDateTime outDtime;
	// 住院原因
	private String inReasonCode;
	// 床号
	private String inBed;
	// 出院科室名称
	private String outDeptName;
	// 其他医学处置
	private String otherMedicalTreatment;
	// 就诊科室名称
	private String visitDeptName;

	// 无参构造器
	public TbNatmehaMedRecords() {
	}

	// 有参构造器，进行属性值的初始化
	public TbNatmehaMedRecords(Long itemid, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat, String outpatFormNo, String idcardNo, String visitOrgName, LocalDateTime visitDtime, String healthProblemEval, String respDoctorName, String outpatDiagName, LocalDateTime diagDate, String inDeptName, LocalDateTime inDtime, LocalDateTime outDtime, String inReasonCode, String inBed, String outDeptName, String otherMedicalTreatment, String visitDeptName) {
		this.itemid = itemid;
		this.creater = creater;
		this.itemcreateat = itemcreateat;
		this.updater = updater;
		this.itemupdateat = itemupdateat;
		this.outpatFormNo = outpatFormNo;
		this.idcardNo = idcardNo;
		this.visitOrgName = visitOrgName;
		this.visitDtime = visitDtime;
		this.healthProblemEval = healthProblemEval;
		this.respDoctorName = respDoctorName;
		this.outpatDiagName = outpatDiagName;
		this.diagDate = diagDate;
		this.inDeptName = inDeptName;
		this.inDtime = inDtime;
		this.outDtime = outDtime;
		this.inReasonCode = inReasonCode;
		this.inBed = inBed;
		this.outDeptName = outDeptName;
		this.otherMedicalTreatment = otherMedicalTreatment;
		this.visitDeptName = visitDeptName;
	}

	// 获取 itemid 的属性值
	public Long getItemid() {
		return itemid;
	}

	// 设置 itemid 的属性值
	public void setItemid(Long itemid) {
		this.itemid = itemid;
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

	// 获取 门诊记录表编号 的属性值
	public String getOutpatFormNo() {
		return outpatFormNo;
	}

	// 设置 门诊记录表编号 的属性值
	public void setOutpatFormNo(String outpatFormNo) {
		this.outpatFormNo = outpatFormNo;
	}

	// 获取 身份证号 的属性值
	public String getIdcardNo() {
		return idcardNo;
	}

	// 设置 身份证号 的属性值
	public void setIdcardNo(String idcardNo) {
		this.idcardNo = idcardNo;
	}

	// 获取 就诊机构名称 的属性值
	public String getVisitOrgName() {
		return visitOrgName;
	}

	// 设置 就诊机构名称 的属性值
	public void setVisitOrgName(String visitOrgName) {
		this.visitOrgName = visitOrgName;
	}

	// 获取 就诊日期时间 的属性值
	public LocalDateTime getVisitDtime() {
		return visitDtime;
	}

	// 设置 就诊日期时间 的属性值
	public void setVisitDtime(LocalDateTime visitDtime) {
		this.visitDtime = visitDtime;
	}

	// 获取 健康问题评估 的属性值
	public String getHealthProblemEval() {
		return healthProblemEval;
	}

	// 设置 健康问题评估 的属性值
	public void setHealthProblemEval(String healthProblemEval) {
		this.healthProblemEval = healthProblemEval;
	}

	// 获取 就诊医师 的属性值
	public String getRespDoctorName() {
		return respDoctorName;
	}

	// 设置 就诊医师 的属性值
	public void setRespDoctorName(String respDoctorName) {
		this.respDoctorName = respDoctorName;
	}

	// 获取 门诊诊断名称 的属性值
	public String getOutpatDiagName() {
		return outpatDiagName;
	}

	// 设置 门诊诊断名称 的属性值
	public void setOutpatDiagName(String outpatDiagName) {
		this.outpatDiagName = outpatDiagName;
	}

	// 获取 诊断日期 的属性值
	public LocalDateTime getDiagDate() {
		return diagDate;
	}

	// 设置 诊断日期 的属性值
	public void setDiagDate(LocalDateTime diagDate) {
		this.diagDate = diagDate;
	}

	// 获取 入院科室名称 的属性值
	public String getInDeptName() {
		return inDeptName;
	}

	// 设置 入院科室名称 的属性值
	public void setInDeptName(String inDeptName) {
		this.inDeptName = inDeptName;
	}

	// 获取 入院日期时间 的属性值
	public LocalDateTime getInDtime() {
		return inDtime;
	}

	// 设置 入院日期时间 的属性值
	public void setInDtime(LocalDateTime inDtime) {
		this.inDtime = inDtime;
	}

	// 获取 出院日期时间 的属性值
	public LocalDateTime getOutDtime() {
		return outDtime;
	}

	// 设置 出院日期时间 的属性值
	public void setOutDtime(LocalDateTime outDtime) {
		this.outDtime = outDtime;
	}

	// 获取 住院原因 的属性值
	public String getInReasonCode() {
		return inReasonCode;
	}

	// 设置 住院原因 的属性值
	public void setInReasonCode(String inReasonCode) {
		this.inReasonCode = inReasonCode;
	}

	// 获取 床号 的属性值
	public String getInBed() {
		return inBed;
	}

	// 设置 床号 的属性值
	public void setInBed(String inBed) {
		this.inBed = inBed;
	}

	// 获取 出院科室名称 的属性值
	public String getOutDeptName() {
		return outDeptName;
	}

	// 设置 出院科室名称 的属性值
	public void setOutDeptName(String outDeptName) {
		this.outDeptName = outDeptName;
	}

	// 获取 其他医学处置 的属性值
	public String getOtherMedicalTreatment() {
		return otherMedicalTreatment;
	}

	// 设置 其他医学处置 的属性值
	public void setOtherMedicalTreatment(String otherMedicalTreatment) {
		this.otherMedicalTreatment = otherMedicalTreatment;
	}

	// 获取 就诊科室名称 的属性值
	public String getVisitDeptName() {
		return visitDeptName;
	}

	// 设置 就诊科室名称 的属性值
	public void setVisitDeptName(String visitDeptName) {
		this.visitDeptName = visitDeptName;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "TbNatmehaMedRecords {" + 
				", itemid='" + itemid + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				", outpatFormNo='" + outpatFormNo + '\'' + 
				", idcardNo='" + idcardNo + '\'' + 
				", visitOrgName='" + visitOrgName + '\'' + 
				", visitDtime='" + visitDtime + '\'' + 
				", healthProblemEval='" + healthProblemEval + '\'' + 
				", respDoctorName='" + respDoctorName + '\'' + 
				", outpatDiagName='" + outpatDiagName + '\'' + 
				", diagDate='" + diagDate + '\'' + 
				", inDeptName='" + inDeptName + '\'' + 
				", inDtime='" + inDtime + '\'' + 
				", outDtime='" + outDtime + '\'' + 
				", inReasonCode='" + inReasonCode + '\'' + 
				", inBed='" + inBed + '\'' + 
				", outDeptName='" + outDeptName + '\'' + 
				", otherMedicalTreatment='" + otherMedicalTreatment + '\'' + 
				", visitDeptName='" + visitDeptName + '\'' + 
				"}";
	}
}