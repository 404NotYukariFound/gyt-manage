package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class Log {
	// itemid ：
	private Long itemid;
	// uuid
	private String itemcode;
	// 应用id
	private String appCode;
	// 错误标题
	private String logTitle;
	// 日志等级
	private String logLevel;
	// 创建人
	private String creater;
	// itemcreateat ：
	private Timestamp itemcreateat;
	// updater ：
	private String updater;
	// 修改时间
	private Timestamp itemupdateat;

	// 无参构造器
	public Log() {
	}

	// 有参构造器，进行属性值的初始化
	public Log(Long itemid, String itemcode, String appCode, String logTitle, String logLevel, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.appCode = appCode;
		this.logTitle = logTitle;
		this.logLevel = logLevel;
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

	// 获取 uuid 的属性值
	public String getItemcode() {
		return itemcode;
	}

	// 设置 uuid 的属性值
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	// 获取 应用id 的属性值
	public String getappCode() {
		return appCode;
	}

	// 设置 应用id 的属性值
	public void setappCode(String appCode) {
		this.appCode = appCode;
	}

	// 获取 错误标题 的属性值
	public String getLogTitle() {
		return logTitle;
	}

	// 设置 错误标题 的属性值
	public void setLogTitle(String logTitle) {
		this.logTitle = logTitle;
	}

	// 获取 日志等级 的属性值
	public String getLogLevel() {
		return logLevel;
	}

	// 设置 日志等级 的属性值
	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}

	// 获取 创建人 的属性值
	public String getCreater() {
		return creater;
	}

	// 设置 创建人 的属性值
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
		return "Log {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", appCode='" + appCode + '\'' + 
				", logTitle='" + logTitle + '\'' + 
				", logLevel='" + logLevel + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}