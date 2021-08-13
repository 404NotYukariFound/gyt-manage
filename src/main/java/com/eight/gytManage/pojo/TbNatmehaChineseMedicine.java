package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TbNatmehaChineseMedicine {
	// itemid ：
	private Long itemid;
	// 唯一标识UUID
	private String itemcode;
	// 中药材名称
	private String name;
	// 别名
	private String alias;
	// 功效分类
	private String classification;
	// 采制
	private String harvesting;
	// 性味
	private String taste;
	// 归经
	private String merTropism;
	// 主治
	private String governance;
	// 用法用量
	private String usage;
	// 数据状态
	private String status;
	// 用户code
	private String userCode;
	// 创建人
	private String creater;
	// 创建时间
	private Timestamp itemcreateat;
	// 修改人
	private String updater;
	// 修改时间
	private Timestamp itemupdateat;

	// 无参构造器
	public TbNatmehaChineseMedicine() {
	}

	// 有参构造器，进行属性值的初始化
	public TbNatmehaChineseMedicine(Long itemid, String itemcode, String name, String alias, String classification, String harvesting, String taste, String merTropism, String governance, String usage, String status, String userCode, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.name = name;
		this.alias = alias;
		this.classification = classification;
		this.harvesting = harvesting;
		this.taste = taste;
		this.merTropism = merTropism;
		this.governance = governance;
		this.usage = usage;
		this.status = status;
		this.userCode = userCode;
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

	// 获取 中药材名称 的属性值
	public String getName() {
		return name;
	}

	// 设置 中药材名称 的属性值
	public void setName(String name) {
		this.name = name;
	}

	// 获取 别名 的属性值
	public String getalias() {
		return alias;
	}

	// 设置 别名 的属性值
	public void setalias(String alias) {
		this.alias = alias;
	}

	// 获取 功效分类 的属性值
	public String getClassification() {
		return classification;
	}

	// 设置 功效分类 的属性值
	public void setClassification(String classification) {
		this.classification = classification;
	}

	// 获取 采制 的属性值
	public String getHarvesting() {
		return harvesting;
	}

	// 设置 采制 的属性值
	public void setHarvesting(String harvesting) {
		this.harvesting = harvesting;
	}

	// 获取 性味 的属性值
	public String getTaste() {
		return taste;
	}

	// 设置 性味 的属性值
	public void setTaste(String taste) {
		this.taste = taste;
	}

	// 获取 归经 的属性值
	public String getMerTropism() {
		return merTropism;
	}

	// 设置 归经 的属性值
	public void setMerTropism(String merTropism) {
		this.merTropism = merTropism;
	}

	// 获取 主治 的属性值
	public String getGovernance() {
		return governance;
	}

	// 设置 主治 的属性值
	public void setGovernance(String governance) {
		this.governance = governance;
	}

	// 获取 用法用量 的属性值
	public String getUsage() {
		return usage;
	}

	// 设置 用法用量 的属性值
	public void setUsage(String usage) {
		this.usage = usage;
	}

	// 获取 数据状态 的属性值
	public String getStatus() {
		return status;
	}

	// 设置 数据状态 的属性值
	public void setStatus(String status) {
		this.status = status;
	}

	// 获取 用户code 的属性值
	public String getUserCode() {
		return userCode;
	}

	// 设置 用户code 的属性值
	public void setUserCode(String userCode) {
		this.userCode = userCode;
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
		return "TbNatmehaChineseMedicine {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", name='" + name + '\'' + 
				", alias='" + alias + '\'' + 
				", classification='" + classification + '\'' + 
				", harvesting='" + harvesting + '\'' + 
				", taste='" + taste + '\'' + 
				", merTropism='" + merTropism + '\'' + 
				", governance='" + governance + '\'' + 
				", usage='" + usage + '\'' + 
				", status='" + status + '\'' + 
				", userCode='" + userCode + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}