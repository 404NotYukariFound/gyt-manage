package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class UserRoleRef {
	// itemid ：
	private Long itemid;
	// 唯一标识UUID
	private String itemcode;
	// 关联user表itemCode字段
	private String userCode;
	// 应用系统code
	private String appCode;
	// 关联role表itemCode字段（应用系统角色）
	private String roleCode;
	// 平台角色
	private String platRole;
	// 创建人
	private String creater;
	// 创建时间
	private Timestamp itemcreateat;
	// 修改人
	private String updater;
	// 修改时间
	private Timestamp itemupdateat;

	// 无参构造器
	public UserRoleRef() {
	}

	// 有参构造器，进行属性值的初始化
	public UserRoleRef(Long itemid, String itemcode, String userCode, String appCode, String roleCode, String platRole, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.userCode = userCode;
		this.appCode = appCode;
		this.roleCode = roleCode;
		this.platRole = platRole;
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

	// 获取 关联user表itemCode字段 的属性值
	public String getUserCode() {
		return userCode;
	}

	// 设置 关联user表itemCode字段 的属性值
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	// 获取 应用系统code 的属性值
	public String getappCode() {
		return appCode;
	}

	// 设置 应用系统code 的属性值
	public void setappCode(String appCode) {
		this.appCode = appCode;
	}

	// 获取 关联role表itemCode字段（应用系统角色） 的属性值
	public String getRoleCode() {
		return roleCode;
	}

	// 设置 关联role表itemCode字段（应用系统角色） 的属性值
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	// 获取 平台角色 的属性值
	public String getPlatRole() {
		return platRole;
	}

	// 设置 平台角色 的属性值
	public void setPlatRole(String platRole) {
		this.platRole = platRole;
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
		return "UserRoleRef {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", userCode='" + userCode + '\'' + 
				", appCode='" + appCode + '\'' + 
				", roleCode='" + roleCode + '\'' + 
				", platRole='" + platRole + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}