package com.eight.gytManage.pojo;


import java.time.LocalDateTime;
import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TbNatmehaSignalSource {
	// itemid ：
	private Long itemid;
	// 唯一标识UUID
	private String itemcode;
	// 医生code
	private String doctorCode;
	// 挂号类别
	private String registerType;
	// 就诊时间
	private LocalDateTime registerDate;
	// 预约量
	private Integer registerCount;
	// 状态
	private String status;
	// userCode ：
	private String userCode;
	// creater ：
	private String creater;
	// itemcreateat ：
	private Timestamp itemcreateat;
	// updater ：
	private String updater;
	// itemupdateat ：
	private Timestamp itemupdateat;

	// 无参构造器
	public TbNatmehaSignalSource() {
	}

	// 有参构造器，进行属性值的初始化
	public TbNatmehaSignalSource(Long itemid, String itemcode, String doctorCode, String registerType, LocalDateTime registerDate, Integer registerCount, String status, String userCode, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.doctorCode = doctorCode;
		this.registerType = registerType;
		this.registerDate = registerDate;
		this.registerCount = registerCount;
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

	// 获取 医生code 的属性值
	public String getDoctorCode() {
		return doctorCode;
	}

	// 设置 医生code 的属性值
	public void setDoctorCode(String doctorCode) {
		this.doctorCode = doctorCode;
	}

	// 获取 挂号类别 的属性值
	public String getRegisterType() {
		return registerType;
	}

	// 设置 挂号类别 的属性值
	public void setRegisterType(String registerType) {
		this.registerType = registerType;
	}

	// 获取 就诊时间 的属性值
	public LocalDateTime getRegisterDate() {
		return registerDate;
	}

	// 设置 就诊时间 的属性值
	public void setRegisterDate(LocalDateTime registerDate) {
		this.registerDate = registerDate;
	}

	// 获取 预约量 的属性值
	public Integer getRegisterCount() {
		return registerCount;
	}

	// 设置 预约量 的属性值
	public void setRegisterCount(Integer registerCount) {
		this.registerCount = registerCount;
	}

	// 获取 状态 的属性值
	public String getStatus() {
		return status;
	}

	// 设置 状态 的属性值
	public void setStatus(String status) {
		this.status = status;
	}

	// 获取 userCode 的属性值
	public String getUserCode() {
		return userCode;
	}

	// 设置 userCode 的属性值
	public void setUserCode(String userCode) {
		this.userCode = userCode;
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
		return "TbNatmehaSignalSource {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", doctorCode='" + doctorCode + '\'' + 
				", registerType='" + registerType + '\'' + 
				", registerDate='" + registerDate + '\'' + 
				", registerCount='" + registerCount + '\'' + 
				", status='" + status + '\'' + 
				", userCode='" + userCode + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}