package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class Role {
	// 自增id
	private Long itemid;
	// 唯一标识UUID
	private String itemcode;
	// 角色名称
	private String roleName;
	// 角色说明
	private String roleDescription;
	// 应用id
	private String appCode;
	// 类型（0：普通，1：管理员）
	private Integer roleType;
	// creater ：
	private String creater;
	// itemcreateat ：
	private Timestamp itemcreateat;
	// updater ：
	private String updater;
	// itemupdateat ：
	private Timestamp itemupdateat;

	// 无参构造器
	public Role() {
	}

	// 有参构造器，进行属性值的初始化
	public Role(Long itemid, String itemcode, String roleName, String roleDescription, String appCode, Integer roleType, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.roleName = roleName;
		this.roleDescription = roleDescription;
		this.appCode = appCode;
		this.roleType = roleType;
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

	// 获取 唯一标识UUID 的属性值
	public String getItemcode() {
		return itemcode;
	}

	// 设置 唯一标识UUID 的属性值
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	// 获取 角色名称 的属性值
	public String getRoleName() {
		return roleName;
	}

	// 设置 角色名称 的属性值
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	// 获取 角色说明 的属性值
	public String getRoleDescription() {
		return roleDescription;
	}

	// 设置 角色说明 的属性值
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	// 获取 应用id 的属性值
	public String getappCode() {
		return appCode;
	}

	// 设置 应用id 的属性值
	public void setappCode(String appCode) {
		this.appCode = appCode;
	}

	// 获取 类型（0：普通，1：管理员） 的属性值
	public Integer getRoleType() {
		return roleType;
	}

	// 设置 类型（0：普通，1：管理员） 的属性值
	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
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
		return "Role {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", roleName='" + roleName + '\'' + 
				", roleDescription='" + roleDescription + '\'' + 
				", appCode='" + appCode + '\'' + 
				", roleType='" + roleType + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}