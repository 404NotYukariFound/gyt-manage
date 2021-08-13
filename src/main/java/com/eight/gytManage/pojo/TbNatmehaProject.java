package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TbNatmehaProject {
	// 自增id
	private Long itemid;
	// UUID
	private String itemcode;
	// 开展项目、功效特色名称
	private String name;
	// 项目、功效特色简介
	private String content;
	// 数据区分
	private String dataType;
	// 功效特色价格
	private Integer price;
	// 数据状态
	private String dataStatus;
	// userCode ：
	private String userCode;
	// 浏览次数
	private Integer visitNum;
	// 创建者
	private String creater;
	// 创建时间
	private Timestamp itemcreateat;
	// 修改人
	private String updater;
	// 修改时间
	private Timestamp itemupdateat;
	// 评分
	private Double projectSorce;

	// 无参构造器
	public TbNatmehaProject() {
	}

	// 有参构造器，进行属性值的初始化
	public TbNatmehaProject(Long itemid, String itemcode, String name, String content, String dataType, Integer price, String dataStatus, String userCode, Integer visitNum, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat, Double projectSorce) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.name = name;
		this.content = content;
		this.dataType = dataType;
		this.price = price;
		this.dataStatus = dataStatus;
		this.userCode = userCode;
		this.visitNum = visitNum;
		this.creater = creater;
		this.itemcreateat = itemcreateat;
		this.updater = updater;
		this.itemupdateat = itemupdateat;
		this.projectSorce = projectSorce;
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

	// 获取 开展项目、功效特色名称 的属性值
	public String getName() {
		return name;
	}

	// 设置 开展项目、功效特色名称 的属性值
	public void setName(String name) {
		this.name = name;
	}

	// 获取 项目、功效特色简介 的属性值
	public String getContent() {
		return content;
	}

	// 设置 项目、功效特色简介 的属性值
	public void setContent(String content) {
		this.content = content;
	}

	// 获取 数据区分 的属性值
	public String getDataType() {
		return dataType;
	}

	// 设置 数据区分 的属性值
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	// 获取 功效特色价格 的属性值
	public Integer getPrice() {
		return price;
	}

	// 设置 功效特色价格 的属性值
	public void setPrice(Integer price) {
		this.price = price;
	}

	// 获取 数据状态 的属性值
	public String getDataStatus() {
		return dataStatus;
	}

	// 设置 数据状态 的属性值
	public void setDataStatus(String dataStatus) {
		this.dataStatus = dataStatus;
	}

	// 获取 userCode 的属性值
	public String getUserCode() {
		return userCode;
	}

	// 设置 userCode 的属性值
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	// 获取 浏览次数 的属性值
	public Integer getVisitNum() {
		return visitNum;
	}

	// 设置 浏览次数 的属性值
	public void setVisitNum(Integer visitNum) {
		this.visitNum = visitNum;
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

	// 获取 评分 的属性值
	public Double getProjectSorce() {
		return projectSorce;
	}

	// 设置 评分 的属性值
	public void setProjectSorce(Double projectSorce) {
		this.projectSorce = projectSorce;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "TbNatmehaProject {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", name='" + name + '\'' + 
				", content='" + content + '\'' + 
				", dataType='" + dataType + '\'' + 
				", price='" + price + '\'' + 
				", dataStatus='" + dataStatus + '\'' + 
				", userCode='" + userCode + '\'' + 
				", visitNum='" + visitNum + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				", projectSorce='" + projectSorce + '\'' + 
				"}";
	}
}