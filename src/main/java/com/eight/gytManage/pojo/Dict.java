package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class Dict {
	// 自增id
	private Long itemid;
	// 唯一标识UUID
	private String itemcode;
	// 字典名称
	private String dictName;
	// 字典编码
	private String dictCode;
	// dictIstree ：
	private String dictIstree;
	// 描述
	private String dictDescription;
	// 创建人
	private String creater;
	// 创建时间
	private Timestamp itemcreateat;
	// 修改人
	private String updater;
	// 修改时间
	private Timestamp itemupdateat;

	// 无参构造器
	public Dict() {
	}

	// 有参构造器，进行属性值的初始化
	public Dict(Long itemid, String itemcode, String dictName, String dictCode, String dictIstree, String dictDescription, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.dictName = dictName;
		this.dictCode = dictCode;
		this.dictIstree = dictIstree;
		this.dictDescription = dictDescription;
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

	// 获取 字典名称 的属性值
	public String getDictName() {
		return dictName;
	}

	// 设置 字典名称 的属性值
	public void setDictName(String dictName) {
		this.dictName = dictName;
	}

	// 获取 字典编码 的属性值
	public String getDictCode() {
		return dictCode;
	}

	// 设置 字典编码 的属性值
	public void setDictCode(String dictCode) {
		this.dictCode = dictCode;
	}

	// 获取 dictIstree 的属性值
	public String getDictIstree() {
		return dictIstree;
	}

	// 设置 dictIstree 的属性值
	public void setDictIstree(String dictIstree) {
		this.dictIstree = dictIstree;
	}

	// 获取 描述 的属性值
	public String getDictDescription() {
		return dictDescription;
	}

	// 设置 描述 的属性值
	public void setDictDescription(String dictDescription) {
		this.dictDescription = dictDescription;
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
		return "Dict {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", dictName='" + dictName + '\'' + 
				", dictCode='" + dictCode + '\'' + 
				", dictIstree='" + dictIstree + '\'' + 
				", dictDescription='" + dictDescription + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}