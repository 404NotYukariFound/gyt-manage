package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TbNatmehaHealthMedChiManage {
	// itemid ：
	private Long itemid;
	// 姓名
	private String patientId;
	// 责任医师姓名
	private Integer identity1Score;
	// 随访方式
	private Integer identity2Score;
	// 本次随访日期
	private Integer identity3Score;
	// 摄盐量分级
	private Integer identity4Score;
	// 目标摄盐量分级
	private Integer identity5Score;
	// 心理调整评价结果
	private Integer identity6Score;
	// 随访遵医行为评价结果
	private Integer identity7Score;
	// 下次随访日期
	private Integer identity8Score;
	// 随访医师姓名
	private Integer identity9Score;
	// 主要体质
	private String bodyType;
	// 情志调摄指导
	private String guideFeeling;
	// 饮食调养指导
	private String guideFood;
	// 起居调摄指导
	private String guideLife;
	// 运动保健指导
	private String guideSports;
	// 穴位保健指导
	private String guidePoints;
	// 创建人
	private String creater;
	// 创建时间
	private Timestamp itemcreateat;
	// 修改人
	private String updater;
	// 修改时间
	private Timestamp itemupdateat;

	// 无参构造器
	public TbNatmehaHealthMedChiManage() {
	}

	// 有参构造器，进行属性值的初始化
	public TbNatmehaHealthMedChiManage(Long itemid, String patientId, Integer identity1Score, Integer identity2Score, Integer identity3Score, Integer identity4Score, Integer identity5Score, Integer identity6Score, Integer identity7Score, Integer identity8Score, Integer identity9Score, String bodyType, String guideFeeling, String guideFood, String guideLife, String guideSports, String guidePoints, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.patientId = patientId;
		this.identity1Score = identity1Score;
		this.identity2Score = identity2Score;
		this.identity3Score = identity3Score;
		this.identity4Score = identity4Score;
		this.identity5Score = identity5Score;
		this.identity6Score = identity6Score;
		this.identity7Score = identity7Score;
		this.identity8Score = identity8Score;
		this.identity9Score = identity9Score;
		this.bodyType = bodyType;
		this.guideFeeling = guideFeeling;
		this.guideFood = guideFood;
		this.guideLife = guideLife;
		this.guideSports = guideSports;
		this.guidePoints = guidePoints;
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

	// 获取 姓名 的属性值
	public String getPatientId() {
		return patientId;
	}

	// 设置 姓名 的属性值
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	// 获取 责任医师姓名 的属性值
	public Integer getIdentity1Score() {
		return identity1Score;
	}

	// 设置 责任医师姓名 的属性值
	public void setIdentity1Score(Integer identity1Score) {
		this.identity1Score = identity1Score;
	}

	// 获取 随访方式 的属性值
	public Integer getIdentity2Score() {
		return identity2Score;
	}

	// 设置 随访方式 的属性值
	public void setIdentity2Score(Integer identity2Score) {
		this.identity2Score = identity2Score;
	}

	// 获取 本次随访日期 的属性值
	public Integer getIdentity3Score() {
		return identity3Score;
	}

	// 设置 本次随访日期 的属性值
	public void setIdentity3Score(Integer identity3Score) {
		this.identity3Score = identity3Score;
	}

	// 获取 摄盐量分级 的属性值
	public Integer getIdentity4Score() {
		return identity4Score;
	}

	// 设置 摄盐量分级 的属性值
	public void setIdentity4Score(Integer identity4Score) {
		this.identity4Score = identity4Score;
	}

	// 获取 目标摄盐量分级 的属性值
	public Integer getIdentity5Score() {
		return identity5Score;
	}

	// 设置 目标摄盐量分级 的属性值
	public void setIdentity5Score(Integer identity5Score) {
		this.identity5Score = identity5Score;
	}

	// 获取 心理调整评价结果 的属性值
	public Integer getIdentity6Score() {
		return identity6Score;
	}

	// 设置 心理调整评价结果 的属性值
	public void setIdentity6Score(Integer identity6Score) {
		this.identity6Score = identity6Score;
	}

	// 获取 随访遵医行为评价结果 的属性值
	public Integer getIdentity7Score() {
		return identity7Score;
	}

	// 设置 随访遵医行为评价结果 的属性值
	public void setIdentity7Score(Integer identity7Score) {
		this.identity7Score = identity7Score;
	}

	// 获取 下次随访日期 的属性值
	public Integer getIdentity8Score() {
		return identity8Score;
	}

	// 设置 下次随访日期 的属性值
	public void setIdentity8Score(Integer identity8Score) {
		this.identity8Score = identity8Score;
	}

	// 获取 随访医师姓名 的属性值
	public Integer getIdentity9Score() {
		return identity9Score;
	}

	// 设置 随访医师姓名 的属性值
	public void setIdentity9Score(Integer identity9Score) {
		this.identity9Score = identity9Score;
	}

	// 获取 主要体质 的属性值
	public String getBodyType() {
		return bodyType;
	}

	// 设置 主要体质 的属性值
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	// 获取 情志调摄指导 的属性值
	public String getGuideFeeling() {
		return guideFeeling;
	}

	// 设置 情志调摄指导 的属性值
	public void setGuideFeeling(String guideFeeling) {
		this.guideFeeling = guideFeeling;
	}

	// 获取 饮食调养指导 的属性值
	public String getGuideFood() {
		return guideFood;
	}

	// 设置 饮食调养指导 的属性值
	public void setGuideFood(String guideFood) {
		this.guideFood = guideFood;
	}

	// 获取 起居调摄指导 的属性值
	public String getGuideLife() {
		return guideLife;
	}

	// 设置 起居调摄指导 的属性值
	public void setGuideLife(String guideLife) {
		this.guideLife = guideLife;
	}

	// 获取 运动保健指导 的属性值
	public String getGuideSports() {
		return guideSports;
	}

	// 设置 运动保健指导 的属性值
	public void setGuideSports(String guideSports) {
		this.guideSports = guideSports;
	}

	// 获取 穴位保健指导 的属性值
	public String getGuidePoints() {
		return guidePoints;
	}

	// 设置 穴位保健指导 的属性值
	public void setGuidePoints(String guidePoints) {
		this.guidePoints = guidePoints;
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
		return "TbNatmehaHealthMedChiManage {" + 
				", itemid='" + itemid + '\'' + 
				", patientId='" + patientId + '\'' + 
				", identity1Score='" + identity1Score + '\'' + 
				", identity2Score='" + identity2Score + '\'' + 
				", identity3Score='" + identity3Score + '\'' + 
				", identity4Score='" + identity4Score + '\'' + 
				", identity5Score='" + identity5Score + '\'' + 
				", identity6Score='" + identity6Score + '\'' + 
				", identity7Score='" + identity7Score + '\'' + 
				", identity8Score='" + identity8Score + '\'' + 
				", identity9Score='" + identity9Score + '\'' + 
				", bodyType='" + bodyType + '\'' + 
				", guideFeeling='" + guideFeeling + '\'' + 
				", guideFood='" + guideFood + '\'' + 
				", guideLife='" + guideLife + '\'' + 
				", guideSports='" + guideSports + '\'' + 
				", guidePoints='" + guidePoints + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}