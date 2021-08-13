package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class UserTzResult {
	// itemid ：
	private Long itemid;
	// itemcode ：
	private String itemcode;
	// 患者usercode
	private String userCode;
	// 体质判定结果
	private String tzDetermine;
	// 答题时间
	private Timestamp tcmRemark;
	// 体质判定结果:倾向是（基本是）
	private String tzTendency;

	// 无参构造器
	public UserTzResult() {
	}

	// 有参构造器，进行属性值的初始化
	public UserTzResult(Long itemid, String itemcode, String userCode, String tzDetermine, Timestamp tcmRemark, String tzTendency) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.userCode = userCode;
		this.tzDetermine = tzDetermine;
		this.tcmRemark = tcmRemark;
		this.tzTendency = tzTendency;
	}

	// 获取 itemid 的属性值
	public Long getItemid() {
		return itemid;
	}

	// 设置 itemid 的属性值
	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	// 获取 itemcode 的属性值
	public String getItemcode() {
		return itemcode;
	}

	// 设置 itemcode 的属性值
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	// 获取 患者usercode 的属性值
	public String getUserCode() {
		return userCode;
	}

	// 设置 患者usercode 的属性值
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	// 获取 体质判定结果 的属性值
	public String getTzDetermine() {
		return tzDetermine;
	}

	// 设置 体质判定结果 的属性值
	public void setTzDetermine(String tzDetermine) {
		this.tzDetermine = tzDetermine;
	}

	// 获取 答题时间 的属性值
	public Timestamp getTcmRemark() {
		return tcmRemark;
	}

	// 设置 答题时间 的属性值
	public void setTcmRemark(Timestamp tcmRemark) {
		this.tcmRemark = tcmRemark;
	}

	// 获取 体质判定结果:倾向是（基本是） 的属性值
	public String getTzTendency() {
		return tzTendency;
	}

	// 设置 体质判定结果:倾向是（基本是） 的属性值
	public void setTzTendency(String tzTendency) {
		this.tzTendency = tzTendency;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "UserTzResult {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", userCode='" + userCode + '\'' + 
				", tzDetermine='" + tzDetermine + '\'' + 
				", tcmRemark='" + tcmRemark + '\'' + 
				", tzTendency='" + tzTendency + '\'' + 
				"}";
	}
}