package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class Resource {
	// 自增id
	private Long itemid;
	// 唯一标识UUID
	private String itemcode;
	// 权限名称
	private String resourceName;
	// 权限类型
	private String resourceType;
	// 父级id
	private String resourcePcode;
	// 等级
	private String resourceLevel;
	// 权限访问地址
	private String resourceUrl;
	// 权限描述
	private String resourceDescription;
	// 排序
	private Integer sort;
	// 创建人
	private String creater;
	// 创建时间
	private Timestamp itemcreateat;
	// 修改人
	private String updater;
	// 修改时间
	private Timestamp itemupdateat;

	// 无参构造器
	public Resource() {
	}

	// 有参构造器，进行属性值的初始化
	public Resource(Long itemid, String itemcode, String resourceName, String resourceType, String resourcePcode, String resourceLevel, String resourceUrl, String resourceDescription, Integer sort, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.resourceName = resourceName;
		this.resourceType = resourceType;
		this.resourcePcode = resourcePcode;
		this.resourceLevel = resourceLevel;
		this.resourceUrl = resourceUrl;
		this.resourceDescription = resourceDescription;
		this.sort = sort;
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

	// 获取 权限名称 的属性值
	public String getResourceName() {
		return resourceName;
	}

	// 设置 权限名称 的属性值
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	// 获取 权限类型 的属性值
	public String getResourceType() {
		return resourceType;
	}

	// 设置 权限类型 的属性值
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	// 获取 父级id 的属性值
	public String getResourcePcode() {
		return resourcePcode;
	}

	// 设置 父级id 的属性值
	public void setResourcePcode(String resourcePcode) {
		this.resourcePcode = resourcePcode;
	}

	// 获取 等级 的属性值
	public String getResourceLevel() {
		return resourceLevel;
	}

	// 设置 等级 的属性值
	public void setResourceLevel(String resourceLevel) {
		this.resourceLevel = resourceLevel;
	}

	// 获取 权限访问地址 的属性值
	public String getResourceUrl() {
		return resourceUrl;
	}

	// 设置 权限访问地址 的属性值
	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}

	// 获取 权限描述 的属性值
	public String getResourceDescription() {
		return resourceDescription;
	}

	// 设置 权限描述 的属性值
	public void setResourceDescription(String resourceDescription) {
		this.resourceDescription = resourceDescription;
	}

	// 获取 排序 的属性值
	public Integer getSort() {
		return sort;
	}

	// 设置 排序 的属性值
	public void setSort(Integer sort) {
		this.sort = sort;
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
		return "Resource {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", resourceName='" + resourceName + '\'' + 
				", resourceType='" + resourceType + '\'' + 
				", resourcePcode='" + resourcePcode + '\'' + 
				", resourceLevel='" + resourceLevel + '\'' + 
				", resourceUrl='" + resourceUrl + '\'' + 
				", resourceDescription='" + resourceDescription + '\'' + 
				", sort='" + sort + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}