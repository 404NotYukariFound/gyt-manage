package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TbNatmehaHealthPostpartum {
	// itemid ：
	private Long itemid;
	// baseinfo中patient_id
	private String patientId;
	// 健康状况详细描述
	private String healthConditionDescr;
	// 心理状况详细描述
	private String psychologyConditionDescr;
	// 伤口愈合状况
	private String woundHealing;
	// 产妇健康状况评估描述
	private String puerperaHealthEvalDescr;
	// 访视医师姓名
	private String visitDoctorName;
	// 孕产妇健康指导类别
	private String pregHealthGuide;
	// 备注
	private String notes;
	// 创建人
	private String creater;
	// 创建时间
	private Timestamp itemcreateat;
	// 修改人
	private String updater;
	// 修改时间
	private Timestamp itemupdateat;

	// 无参构造器
	public TbNatmehaHealthPostpartum() {
	}

	// 有参构造器，进行属性值的初始化
	public TbNatmehaHealthPostpartum(Long itemid, String patientId, String healthConditionDescr, String psychologyConditionDescr, String woundHealing, String puerperaHealthEvalDescr, String visitDoctorName, String pregHealthGuide, String notes, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.patientId = patientId;
		this.healthConditionDescr = healthConditionDescr;
		this.psychologyConditionDescr = psychologyConditionDescr;
		this.woundHealing = woundHealing;
		this.puerperaHealthEvalDescr = puerperaHealthEvalDescr;
		this.visitDoctorName = visitDoctorName;
		this.pregHealthGuide = pregHealthGuide;
		this.notes = notes;
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

	// 获取 baseinfo中patient_id 的属性值
	public String getPatientId() {
		return patientId;
	}

	// 设置 baseinfo中patient_id 的属性值
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	// 获取 健康状况详细描述 的属性值
	public String getHealthConditionDescr() {
		return healthConditionDescr;
	}

	// 设置 健康状况详细描述 的属性值
	public void setHealthConditionDescr(String healthConditionDescr) {
		this.healthConditionDescr = healthConditionDescr;
	}

	// 获取 心理状况详细描述 的属性值
	public String getPsychologyConditionDescr() {
		return psychologyConditionDescr;
	}

	// 设置 心理状况详细描述 的属性值
	public void setPsychologyConditionDescr(String psychologyConditionDescr) {
		this.psychologyConditionDescr = psychologyConditionDescr;
	}

	// 获取 伤口愈合状况 的属性值
	public String getWoundHealing() {
		return woundHealing;
	}

	// 设置 伤口愈合状况 的属性值
	public void setWoundHealing(String woundHealing) {
		this.woundHealing = woundHealing;
	}

	// 获取 产妇健康状况评估描述 的属性值
	public String getPuerperaHealthEvalDescr() {
		return puerperaHealthEvalDescr;
	}

	// 设置 产妇健康状况评估描述 的属性值
	public void setPuerperaHealthEvalDescr(String puerperaHealthEvalDescr) {
		this.puerperaHealthEvalDescr = puerperaHealthEvalDescr;
	}

	// 获取 访视医师姓名 的属性值
	public String getVisitDoctorName() {
		return visitDoctorName;
	}

	// 设置 访视医师姓名 的属性值
	public void setVisitDoctorName(String visitDoctorName) {
		this.visitDoctorName = visitDoctorName;
	}

	// 获取 孕产妇健康指导类别 的属性值
	public String getPregHealthGuide() {
		return pregHealthGuide;
	}

	// 设置 孕产妇健康指导类别 的属性值
	public void setPregHealthGuide(String pregHealthGuide) {
		this.pregHealthGuide = pregHealthGuide;
	}

	// 获取 备注 的属性值
	public String getNotes() {
		return notes;
	}

	// 设置 备注 的属性值
	public void setNotes(String notes) {
		this.notes = notes;
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
		return "TbNatmehaHealthPostpartum {" + 
				", itemid='" + itemid + '\'' + 
				", patientId='" + patientId + '\'' + 
				", healthConditionDescr='" + healthConditionDescr + '\'' + 
				", psychologyConditionDescr='" + psychologyConditionDescr + '\'' + 
				", woundHealing='" + woundHealing + '\'' + 
				", puerperaHealthEvalDescr='" + puerperaHealthEvalDescr + '\'' + 
				", visitDoctorName='" + visitDoctorName + '\'' + 
				", pregHealthGuide='" + pregHealthGuide + '\'' + 
				", notes='" + notes + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}