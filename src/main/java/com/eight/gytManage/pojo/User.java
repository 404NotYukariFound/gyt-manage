package com.eight.gytManage.pojo;

import java.sql.Timestamp;
import java.sql.Date;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class User {
	// itemid ：
	private Long itemid;
	// 唯一标识UUID
	private String itemcode;
	// 机构id(关联organization表中的itemID）
	private String orgCode;
	// 登陆账号
	private String username;
	// 密码
	private String password;
	// 盐
	private String salt;
	// 用户名
	private String name;
	// 性别
	private String gender;
	// 肖像
	private byte[] portrait;
	// 身份证件类型
	private String idcardType;
	// 证件号码
	private String idcardNo;
	// email
	private String email;
	// state ：
	private String state;
	// 电话号码
	private String mobilephone;
	// 创建人
	private String creater;
	// 创建时间
	private Timestamp itemcreateat;
	// 修改人
	private String updater;
	// 修改时间
	private Timestamp itemupdateat;
	// 地级机构id
	private String cityid;
	// 类型（0：普通，1：管理员）
	private Integer type;
	// 出生日期
	private Date birth;
	// wxOpenid ：
	private String wxOpenid;

	// 无参构造器
	public User() {
	}

	// 有参构造器，进行属性值的初始化
	public User(Long itemid, String itemcode, String orgCode, String username, String password, String salt, String name, String gender, byte[] portrait, String idcardType, String idcardNo, String email, String state, String mobilephone, String creater, Timestamp itemcreateat, String updater, Timestamp itemupdateat, String cityid, Integer type, Date birth, String wxOpenid) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.orgCode = orgCode;
		this.username = username;
		this.password = password;
		this.salt = salt;
		this.name = name;
		this.gender = gender;
		this.portrait = portrait;
		this.idcardType = idcardType;
		this.idcardNo = idcardNo;
		this.email = email;
		this.state = state;
		this.mobilephone = mobilephone;
		this.creater = creater;
		this.itemcreateat = itemcreateat;
		this.updater = updater;
		this.itemupdateat = itemupdateat;
		this.cityid = cityid;
		this.type = type;
		this.birth = birth;
		this.wxOpenid = wxOpenid;
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

	// 获取 机构id(关联organization表中的itemID） 的属性值
	public String getOrgCode() {
		return orgCode;
	}

	// 设置 机构id(关联organization表中的itemID） 的属性值
	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	// 获取 登陆账号 的属性值
	public String getUsername() {
		return username;
	}

	// 设置 登陆账号 的属性值
	public void setUsername(String username) {
		this.username = username;
	}

	// 获取 密码 的属性值
	public String getPassword() {
		return password;
	}

	// 设置 密码 的属性值
	public void setPassword(String password) {
		this.password = password;
	}

	// 获取 盐 的属性值
	public String getSalt() {
		return salt;
	}

	// 设置 盐 的属性值
	public void setSalt(String salt) {
		this.salt = salt;
	}

	// 获取 用户名 的属性值
	public String getName() {
		return name;
	}

	// 设置 用户名 的属性值
	public void setName(String name) {
		this.name = name;
	}

	// 获取 性别 的属性值
	public String getGender() {
		return gender;
	}

	// 设置 性别 的属性值
	public void setGender(String gender) {
		this.gender = gender;
	}

	// 获取 肖像 的属性值
	public byte[] getPortrait() {
		return portrait;
	}

	// 设置 肖像 的属性值
	public void setPortrait(byte[] portrait) {
		this.portrait = portrait;
	}

	// 获取 身份证件类型 的属性值
	public String getIdcardType() {
		return idcardType;
	}

	// 设置 身份证件类型 的属性值
	public void setIdcardType(String idcardType) {
		this.idcardType = idcardType;
	}

	// 获取 证件号码 的属性值
	public String getIdcardNo() {
		return idcardNo;
	}

	// 设置 证件号码 的属性值
	public void setIdcardNo(String idcardNo) {
		this.idcardNo = idcardNo;
	}

	// 获取 email 的属性值
	public String getEmail() {
		return email;
	}

	// 设置 email 的属性值
	public void setEmail(String email) {
		this.email = email;
	}

	// 获取 state 的属性值
	public String getState() {
		return state;
	}

	// 设置 state 的属性值
	public void setState(String state) {
		this.state = state;
	}

	// 获取 电话号码 的属性值
	public String getMobilephone() {
		return mobilephone;
	}

	// 设置 电话号码 的属性值
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
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

	// 获取 地级机构id 的属性值
	public String getCityid() {
		return cityid;
	}

	// 设置 地级机构id 的属性值
	public void setCityid(String cityid) {
		this.cityid = cityid;
	}

	// 获取 类型（0：普通，1：管理员） 的属性值
	public Integer getType() {
		return type;
	}

	// 设置 类型（0：普通，1：管理员） 的属性值
	public void setType(Integer type) {
		this.type = type;
	}

	// 获取 出生日期 的属性值
	public Date getBirth() {
		return birth;
	}

	// 设置 出生日期 的属性值
	public void setBirth(Date birth) {
		this.birth = birth;
	}

	// 获取 wxOpenid 的属性值
	public String getWxOpenid() {
		return wxOpenid;
	}

	// 设置 wxOpenid 的属性值
	public void setWxOpenid(String wxOpenid) {
		this.wxOpenid = wxOpenid;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "User {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", orgCode='" + orgCode + '\'' + 
				", username='" + username + '\'' + 
				", password='" + password + '\'' + 
				", salt='" + salt + '\'' + 
				", name='" + name + '\'' + 
				", gender='" + gender + '\'' + 
				", portrait='" + portrait + '\'' + 
				", idcardType='" + idcardType + '\'' + 
				", idcardNo='" + idcardNo + '\'' + 
				", email='" + email + '\'' + 
				", state='" + state + '\'' + 
				", mobilephone='" + mobilephone + '\'' + 
				", creater='" + creater + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				", updater='" + updater + '\'' + 
				", itemupdateat='" + itemupdateat + '\'' + 
				", cityid='" + cityid + '\'' + 
				", type='" + type + '\'' + 
				", birth='" + birth + '\'' + 
				", wxOpenid='" + wxOpenid + '\'' + 
				"}";
	}
}