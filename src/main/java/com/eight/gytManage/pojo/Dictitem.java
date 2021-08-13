package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class Dictitem {
	// 自增id
	private Long itemid;
	// 唯一标识UUID
	private String itemcode;
	// 关联dict表中的itemCode字段
	private String dictCode;
	// 字典项编码
	private String ditemCode;
	// 字典项的值
	private String ditemValue;
	// 父级CODE，关联本表的itemCode
	private String ditemPcode;
	// 创建人
	private String creater;
	// 创建时间
	private Timestamp itemcreateat;
	// 修改人
	private String updater;
	// 修改时间
	private Timestamp itemupdateat;

	// 无参构造器
	public Dictitem() {
	}

	// 有参构造器，进行属性值的初始化
	public Dictitem(Long itemid, String itemcode, String dictCode, String ditemCode, String ditemValue, String ditemPcode, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.dictCode = dictCode;
		this.ditemCode = ditemCode;
		this.ditemValue = ditemValue;
		this.ditemPcode = ditemPcode;
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

	// 获取 关联dict表中的itemCode字段 的属性值
	public String getDictCode() {
		return dictCode;
	}

	// 设置 关联dict表中的itemCode字段 的属性值
	public void setDictCode(String dictCode) {
		this.dictCode = dictCode;
	}

	// 获取 字典项编码 的属性值
	public String getDitemCode() {
		return ditemCode;
	}

	// 设置 字典项编码 的属性值
	public void setDitemCode(String ditemCode) {
		this.ditemCode = ditemCode;
	}

	// 获取 字典项的值 的属性值
	public String getDitemValue() {
		return ditemValue;
	}

	// 设置 字典项的值 的属性值
	public void setDitemValue(String ditemValue) {
		this.ditemValue = ditemValue;
	}

	// 获取 父级CODE，关联本表的itemCode 的属性值
	public String getDitemPcode() {
		return ditemPcode;
	}

	// 设置 父级CODE，关联本表的itemCode 的属性值
	public void setDitemPcode(String ditemPcode) {
		this.ditemPcode = ditemPcode;
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
		return "Dictitem {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", dictCode='" + dictCode + '\'' + 
				", ditemCode='" + ditemCode + '\'' + 
				", ditemValue='" + ditemValue + '\'' + 
				", ditemPcode='" + ditemPcode + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}