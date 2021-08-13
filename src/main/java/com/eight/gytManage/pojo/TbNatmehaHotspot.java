package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TbNatmehaHotspot {
	// 自增id
	private Long itemid;
	// UUID
	private String itemcode;
	// 热点名称
	private String hotspotTitle;
	// 介绍
	private String hotspotContent;
	// 数据状态
	private String dataStatus;
	// 数据类型(用来区分处中药常识以外几项）
	private String dataType;
	// userCode ：
	private String userCode;
	// 创建者
	private String creater;
	// 创建时间
	private Timestamp itemcreateat;
	// 修改人
	private String updater;
	// 修改时间
	private Timestamp itemupdateat;

	// 无参构造器
	public TbNatmehaHotspot() {
	}

	// 有参构造器，进行属性值的初始化
	public TbNatmehaHotspot(Long itemid, String itemcode, String hotspotTitle, String hotspotContent, String dataStatus, String dataType, String userCode, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.hotspotTitle = hotspotTitle;
		this.hotspotContent = hotspotContent;
		this.dataStatus = dataStatus;
		this.dataType = dataType;
		this.userCode = userCode;
		this.creater = creater;
		this.itemcreateat = itemcreateat;
		this.updater = updater;
		this.itemupdateat = itemupdateat;
	}

	// 获取 自增id 的属性值
	public Long getItemid() {
		return itemid;
	}

	// 设置 自增id 的属性值
	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	// 获取 UUID 的属性值
	public String getItemcode() {
		return itemcode;
	}

	// 设置 UUID 的属性值
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	// 获取 热点名称 的属性值
	public String getHotspotTitle() {
		return hotspotTitle;
	}

	// 设置 热点名称 的属性值
	public void setHotspotTitle(String hotspotTitle) {
		this.hotspotTitle = hotspotTitle;
	}

	// 获取 介绍 的属性值
	public String getHotspotContent() {
		return hotspotContent;
	}

	// 设置 介绍 的属性值
	public void setHotspotContent(String hotspotContent) {
		this.hotspotContent = hotspotContent;
	}

	// 获取 数据状态 的属性值
	public String getDataStatus() {
		return dataStatus;
	}

	// 设置 数据状态 的属性值
	public void setDataStatus(String dataStatus) {
		this.dataStatus = dataStatus;
	}

	// 获取 数据类型(用来区分处中药常识以外几项） 的属性值
	public String getDataType() {
		return dataType;
	}

	// 设置 数据类型(用来区分处中药常识以外几项） 的属性值
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	// 获取 userCode 的属性值
	public String getUserCode() {
		return userCode;
	}

	// 设置 userCode 的属性值
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	// 获取 创建者 的属性值
	public String getCreater() {
		return creater;
	}

	// 设置 创建者 的属性值
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
		return "TbNatmehaHotspot {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", hotspotTitle='" + hotspotTitle + '\'' + 
				", hotspotContent='" + hotspotContent + '\'' + 
				", dataStatus='" + dataStatus + '\'' + 
				", dataType='" + dataType + '\'' + 
				", userCode='" + userCode + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}