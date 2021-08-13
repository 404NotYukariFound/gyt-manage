package com.eight.gytManage.pojo;




/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TKnowledgeTcmQuestion {
	// qId ：
	private String qId;
	// typeId ：
	private String typeId;
	// qNumber ：
	private String qNumber;
	// qText ：
	private String qText;
	// optionsText ：
	private String optionsText;
	// optionsValue ：
	private String optionsValue;
	// delFlag ：
	private String delFlag;
	// feaId ：
	private String feaId;
	// qSex ：
	private String qSex;

	// 无参构造器
	public TKnowledgeTcmQuestion() {
	}

	// 有参构造器，进行属性值的初始化
	public TKnowledgeTcmQuestion(String qId, String typeId, String qNumber, String qText, String optionsText, String optionsValue, String delFlag, String feaId, String qSex) {
		this.qId = qId;
		this.typeId = typeId;
		this.qNumber = qNumber;
		this.qText = qText;
		this.optionsText = optionsText;
		this.optionsValue = optionsValue;
		this.delFlag = delFlag;
		this.feaId = feaId;
		this.qSex = qSex;
	}

	// 获取 qId 的属性值
	public String getqId() {
		return qId;
	}

	// 设置 qId 的属性值
	public void setqId(String qId) {
		this.qId = qId;
	}

	// 获取 typeId 的属性值
	public String getTypeId() {
		return typeId;
	}

	// 设置 typeId 的属性值
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	// 获取 qNumber 的属性值
	public String getqNumber() {
		return qNumber;
	}

	// 设置 qNumber 的属性值
	public void setqNumber(String qNumber) {
		this.qNumber = qNumber;
	}

	// 获取 qText 的属性值
	public String getqText() {
		return qText;
	}

	// 设置 qText 的属性值
	public void setqText(String qText) {
		this.qText = qText;
	}

	// 获取 optionsText 的属性值
	public String getOptionsText() {
		return optionsText;
	}

	// 设置 optionsText 的属性值
	public void setOptionsText(String optionsText) {
		this.optionsText = optionsText;
	}

	// 获取 optionsValue 的属性值
	public String getOptionsValue() {
		return optionsValue;
	}

	// 设置 optionsValue 的属性值
	public void setOptionsValue(String optionsValue) {
		this.optionsValue = optionsValue;
	}

	// 获取 delFlag 的属性值
	public String getDelFlag() {
		return delFlag;
	}

	// 设置 delFlag 的属性值
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	// 获取 feaId 的属性值
	public String getFeaId() {
		return feaId;
	}

	// 设置 feaId 的属性值
	public void setFeaId(String feaId) {
		this.feaId = feaId;
	}

	// 获取 qSex 的属性值
	public String getqSex() {
		return qSex;
	}

	// 设置 qSex 的属性值
	public void setqSex(String qSex) {
		this.qSex = qSex;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "TKnowledgeTcmQuestion {" + 
				", qId='" + qId + '\'' + 
				", typeId='" + typeId + '\'' + 
				", qNumber='" + qNumber + '\'' + 
				", qText='" + qText + '\'' + 
				", optionsText='" + optionsText + '\'' + 
				", optionsValue='" + optionsValue + '\'' + 
				", delFlag='" + delFlag + '\'' + 
				", feaId='" + feaId + '\'' + 
				", qSex='" + qSex + '\'' + 
				"}";
	}
}