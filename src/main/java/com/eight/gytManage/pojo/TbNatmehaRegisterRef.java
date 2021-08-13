package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TbNatmehaRegisterRef {
	// itemid ：
	private Long itemid;
	// 唯一标识UUID
	private String itemcode;
	// 预约号码
	private Integer registerNum;
	// 号源code
	private String sourceCode;
	// 用户code
	private String userCode;
	// 就诊人code
	private String patientCode;
	// 就诊状态
	private String registerStatus;
	// 匿名评价
	private Boolean anonymous;
	// 总体评分
	private Double overallSource;
	// 诊疗效果评分
	private Double effectSource;
	// 诊疗环境评分
	private Double environmentSource;
	// 服务态度评分
	private Double serviceSource;
	// 所患疾病
	private String illness;
	// 就诊评分
	private Double source;
	// creater ：
	private String creater;
	// itemcreateat ：
	private Timestamp itemcreateat;
	// updater ：
	private String updater;
	// itemupdateat ：
	private Timestamp itemupdateat;

	// 无参构造器
	public TbNatmehaRegisterRef() {
	}

	// 有参构造器，进行属性值的初始化
	public TbNatmehaRegisterRef(Long itemid, String itemcode, Integer registerNum, String sourceCode, String userCode, String patientCode, String registerStatus, Boolean anonymous, Double overallSource, Double effectSource, Double environmentSource, Double serviceSource, String illness, Double source, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.registerNum = registerNum;
		this.sourceCode = sourceCode;
		this.userCode = userCode;
		this.patientCode = patientCode;
		this.registerStatus = registerStatus;
		this.anonymous = anonymous;
		this.overallSource = overallSource;
		this.effectSource = effectSource;
		this.environmentSource = environmentSource;
		this.serviceSource = serviceSource;
		this.illness = illness;
		this.source = source;
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

	// 获取 预约号码 的属性值
	public Integer getRegisterNum() {
		return registerNum;
	}

	// 设置 预约号码 的属性值
	public void setRegisterNum(Integer registerNum) {
		this.registerNum = registerNum;
	}

	// 获取 号源code 的属性值
	public String getSourceCode() {
		return sourceCode;
	}

	// 设置 号源code 的属性值
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	// 获取 用户code 的属性值
	public String getUserCode() {
		return userCode;
	}

	// 设置 用户code 的属性值
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	// 获取 就诊人code 的属性值
	public String getPatientCode() {
		return patientCode;
	}

	// 设置 就诊人code 的属性值
	public void setPatientCode(String patientCode) {
		this.patientCode = patientCode;
	}

	// 获取 就诊状态 的属性值
	public String getRegisterStatus() {
		return registerStatus;
	}

	// 设置 就诊状态 的属性值
	public void setRegisterStatus(String registerStatus) {
		this.registerStatus = registerStatus;
	}

	// 获取 匿名评价 的属性值
	public Boolean getanonymous() {
		return anonymous;
	}

	// 设置 匿名评价 的属性值
	public void setanonymous(Boolean anonymous) {
		this.anonymous = anonymous;
	}

	// 获取 总体评分 的属性值
	public Double getOverallSource() {
		return overallSource;
	}

	// 设置 总体评分 的属性值
	public void setOverallSource(Double overallSource) {
		this.overallSource = overallSource;
	}

	// 获取 诊疗效果评分 的属性值
	public Double getEffectSource() {
		return effectSource;
	}

	// 设置 诊疗效果评分 的属性值
	public void setEffectSource(Double effectSource) {
		this.effectSource = effectSource;
	}

	// 获取 诊疗环境评分 的属性值
	public Double getEnvironmentSource() {
		return environmentSource;
	}

	// 设置 诊疗环境评分 的属性值
	public void setEnvironmentSource(Double environmentSource) {
		this.environmentSource = environmentSource;
	}

	// 获取 服务态度评分 的属性值
	public Double getServiceSource() {
		return serviceSource;
	}

	// 设置 服务态度评分 的属性值
	public void setServiceSource(Double serviceSource) {
		this.serviceSource = serviceSource;
	}

	// 获取 所患疾病 的属性值
	public String getIllness() {
		return illness;
	}

	// 设置 所患疾病 的属性值
	public void setIllness(String illness) {
		this.illness = illness;
	}

	// 获取 就诊评分 的属性值
	public Double getSource() {
		return source;
	}

	// 设置 就诊评分 的属性值
	public void setSource(Double source) {
		this.source = source;
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
		return "TbNatmehaRegisterRef {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", registerNum='" + registerNum + '\'' + 
				", sourceCode='" + sourceCode + '\'' + 
				", userCode='" + userCode + '\'' + 
				", patientCode='" + patientCode + '\'' + 
				", registerStatus='" + registerStatus + '\'' + 
				", anonymous='" + anonymous + '\'' + 
				", overallSource='" + overallSource + '\'' + 
				", effectSource='" + effectSource + '\'' + 
				", environmentSource='" + environmentSource + '\'' + 
				", serviceSource='" + serviceSource + '\'' + 
				", illness='" + illness + '\'' + 
				", source='" + source + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}