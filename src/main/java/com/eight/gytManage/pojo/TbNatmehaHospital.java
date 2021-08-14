package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TbNatmehaHospital {
	// 自增id
	private Long itemid;
	// UUID
	private String itemcode;
	// 国医堂名称
	private String hospitalName;
	// 医院等级
	private String hospitalLevel;
	// 预约量
	private Integer hospitalBooking;
	// 评分
	private Double hospitalSource;
	// 距离（暂定）
	private Integer hospitalDistance;
	// 医院电话
	private String hospitalPhone;
	// 医院地址省份
	private String hospitalPro;
	// 医院地址市
	private String hospitalCity;
	// 地址省份
	private String hospitalCountry;
	// 医院详细地址
	private String hospitaladress;
	// 简介
	private byte[] introduce;
	// 数据状态
	private String status;
	// 创建者
	private String creater;
	// 创建时间
	private Timestamp itemcreateat;
	// 修改人
	private String updater;
	// 修改时间
	private Timestamp itemupdateat;

	// 无参构造器
	public TbNatmehaHospital() {
	}

	// 有参构造器，进行属性值的初始化
	public TbNatmehaHospital(Long itemid, String itemcode, String hospitalName, String hospitalLevel, Integer hospitalBooking, Double hospitalSource, Integer hospitalDistance, String hospitalPhone, String hospitalPro, String hospitalCity, String hospitalCountry, String hospitaladress, byte[] introduce, String status, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.hospitalName = hospitalName;
		this.hospitalLevel = hospitalLevel;
		this.hospitalBooking = hospitalBooking;
		this.hospitalSource = hospitalSource;
		this.hospitalDistance = hospitalDistance;
		this.hospitalPhone = hospitalPhone;
		this.hospitalPro = hospitalPro;
		this.hospitalCity = hospitalCity;
		this.hospitalCountry = hospitalCountry;
		this.hospitaladress = hospitaladress;
		this.introduce = introduce;
		this.status = status;
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

	// 获取 国医堂名称 的属性值
	public String getHospitalName() {
		return hospitalName;
	}

	// 设置 国医堂名称 的属性值
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	// 获取 医院等级 的属性值
	public String getHospitalLevel() {
		return hospitalLevel;
	}

	// 设置 医院等级 的属性值
	public void setHospitalLevel(String hospitalLevel) {
		this.hospitalLevel = hospitalLevel;
	}

	// 获取 预约量 的属性值
	public Integer getHospitalBooking() {
		return hospitalBooking;
	}

	// 设置 预约量 的属性值
	public void setHospitalBooking(Integer hospitalBooking) {
		this.hospitalBooking = hospitalBooking;
	}

	// 获取 评分 的属性值
	public Double getHospitalSource() {
		return hospitalSource;
	}

	// 设置 评分 的属性值
	public void setHospitalSource(Double hospitalSource) {
		this.hospitalSource = hospitalSource;
	}

	// 获取 距离（暂定） 的属性值
	public Integer getHospitalDistance() {
		return hospitalDistance;
	}

	// 设置 距离（暂定） 的属性值
	public void setHospitalDistance(Integer hospitalDistance) {
		this.hospitalDistance = hospitalDistance;
	}

	// 获取 医院电话 的属性值
	public String getHospitalPhone() {
		return hospitalPhone;
	}

	// 设置 医院电话 的属性值
	public void setHospitalPhone(String hospitalPhone) {
		this.hospitalPhone = hospitalPhone;
	}

	// 获取 医院地址省份 的属性值
	public String getHospitalPro() {
		return hospitalPro;
	}

	// 设置 医院地址省份 的属性值
	public void setHospitalPro(String hospitalPro) {
		this.hospitalPro = hospitalPro;
	}

	// 获取 医院地址市 的属性值
	public String getHospitalCity() {
		return hospitalCity;
	}

	// 设置 医院地址市 的属性值
	public void setHospitalCity(String hospitalCity) {
		this.hospitalCity = hospitalCity;
	}

	// 获取 地址省份 的属性值
	public String getHospitalCountry() {
		return hospitalCountry;
	}

	// 设置 地址省份 的属性值
	public void setHospitalCountry(String hospitalCountry) {
		this.hospitalCountry = hospitalCountry;
	}

	// 获取 医院详细地址 的属性值
	public String getHospitaladress() {
		return hospitaladress;
	}

	// 设置 医院详细地址 的属性值
	public void setHospitaladress(String hospitaladress) {
		this.hospitaladress = hospitaladress;
	}

	// 获取 简介 的属性值
	public byte[] getIntroduce() {
		return introduce;
	}

	// 设置 简介 的属性值
	public void setIntroduce(byte[] introduce) {
		this.introduce = introduce;
	}

	// 获取 数据状态 的属性值
	public String getStatus() {
		return status;
	}

	// 设置 数据状态 的属性值
	public void setStatus(String status) {
		this.status = status;
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
		return "TbNatmehaHospital {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", hospitalName='" + hospitalName + '\'' + 
				", hospitalLevel='" + hospitalLevel + '\'' + 
				", hospitalBooking='" + hospitalBooking + '\'' + 
				", hospitalSource='" + hospitalSource + '\'' + 
				", hospitalDistance='" + hospitalDistance + '\'' + 
				", hospitalPhone='" + hospitalPhone + '\'' + 
				", hospitalPro='" + hospitalPro + '\'' + 
				", hospitalCity='" + hospitalCity + '\'' + 
				", hospitalCountry='" + hospitalCountry + '\'' + 
				", hospitaladress='" + hospitaladress + '\'' + 
				", introduce='" + introduce + '\'' + 
				", status='" + status + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				"}";
	}
}