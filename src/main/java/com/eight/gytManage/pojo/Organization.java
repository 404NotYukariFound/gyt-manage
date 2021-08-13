package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class Organization {
	// itemid ：
	private Long itemid;
	// 唯一标识UUID
	private String itemcode;
	// 机构名称
	private String orgName;
	// 机构编码
	private String orgCode;
	// 描述
	private String orgDescription;
	// 标识符(用来标识机构类型)
	private String orgIdentify;
	// 备用字段
	private String backup1;
	// 备用字段
	private String backup2;
	// 左值
	private Integer left;
	// 右值
	private Integer right;
	// 层级
	private Integer level;
	// 创建人
	private String creater;
	// 创建时间
	private Timestamp itemcreateat;
	// 修改人
	private String updater;
	// 修改时间
	private Timestamp itemupdateat;

	// 无参构造器
	public Organization() {
	}

	// 有参构造器，进行属性值的初始化
	public Organization(Long itemid, String itemcode, String orgName, String orgCode, String orgDescription, String orgIdentify, String backup1, String backup2, Integer left, Integer right, Integer level, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.orgName = orgName;
		this.orgCode = orgCode;
		this.orgDescription = orgDescription;
		this.orgIdentify = orgIdentify;
		this.backup1 = backup1;
		this.backup2 = backup2;
		this.left = left;
		this.right = right;
		this.level = level;
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

	// 获取 机构名称 的属性值
	public String getOrgName() {
		return orgName;
	}

	// 设置 机构名称 的属性值
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	// 获取 机构编码 的属性值
	public String getOrgCode() {
		return orgCode;
	}

	// 设置 机构编码 的属性值
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	// 获取 描述 的属性值
	public String getOrgDescription() {
		return orgDescription;
	}

	// 设置 描述 的属性值
	public void setOrgDescription(String orgDescription) {
		this.orgDescription = orgDescription;
	}

	// 获取 标识符(用来标识机构类型) 的属性值
	public String getOrgIdentify() {
		return orgIdentify;
	}

	// 设置 标识符(用来标识机构类型) 的属性值
	public void setOrgIdentify(String orgIdentify) {
		this.orgIdentify = orgIdentify;
	}

	// 获取 备用字段 的属性值
	public String getBackup1() {
		return backup1;
	}

	// 设置 备用字段 的属性值
	public void setBackup1(String backup1) {
		this.backup1 = backup1;
	}

	// 获取 备用字段 的属性值
	public String getBackup2() {
		return backup2;
	}

	// 设置 备用字段 的属性值
	public void setBackup2(String backup2) {
		this.backup2 = backup2;
	}

	// 获取 左值 的属性值
	public Integer getLeft() {
		return left;
	}

	// 设置 左值 的属性值
	public void setLeft(Integer left) {
		this.left = left;
	}

	// 获取 右值 的属性值
	public Integer getRight() {
		return right;
	}

	// 设置 右值 的属性值
	public void setRight(Integer right) {
		this.right = right;
	}

	// 获取 层级 的属性值
	public Integer getLevel() {
		return level;
	}

	// 设置 层级 的属性值
	public void setLevel(Integer level) {
		this.level = level;
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
		return "Organization {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", orgName='" + orgName + '\'' + 
				", orgCode='" + orgCode + '\'' + 
				", orgDescription='" + orgDescription + '\'' + 
				", orgIdentify='" + orgIdentify + '\'' + 
				", backup1='" + backup1 + '\'' + 
				", backup2='" + backup2 + '\'' + 
				", left='" + left + '\'' + 
				", right='" + right + '\'' + 
				", level='" + level + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}