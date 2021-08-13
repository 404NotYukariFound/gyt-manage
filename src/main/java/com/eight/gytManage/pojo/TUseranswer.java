package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TUseranswer {
	// itemid ：
	private Long itemid;
	// itemcode ：
	private String itemcode;
	// 患者id
	private String userId;
	// 题目id
	private String qId;
	// 患者答题选项
	private String qOption;
	// 答题时间
	private Timestamp tcmRemark;
	// 体质类型id
	private String typeId;
	// 患者本次答题题目序号
	private String seq;
	// 是否生效（1：是  0：否）
	private String useflag;
	// 预留字段，暂未使用
	private String flag1;
	// 预留字段，暂未使用
	private String flag2;
	// 预留字段，暂未使用
	private String flag3;
	// uptflag ：
	private String uptflag;
	// 体质测评结果itemcode
	private String resultItemcode;

	// 无参构造器
	public TUseranswer() {
	}

	// 有参构造器，进行属性值的初始化
	public TUseranswer(Long itemid, String itemcode, String userId, String qId, String qOption, Timestamp tcmRemark, String typeId, String seq, String useflag, String flag1, String flag2, String flag3, String uptflag, String resultItemcode) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.userId = userId;
		this.qId = qId;
		this.qOption = qOption;
		this.tcmRemark = tcmRemark;
		this.typeId = typeId;
		this.seq = seq;
		this.useflag = useflag;
		this.flag1 = flag1;
		this.flag2 = flag2;
		this.flag3 = flag3;
		this.uptflag = uptflag;
		this.resultItemcode = resultItemcode;
	}

	// 获取 itemid 的属性值
	public Long getItemid() {
		return itemid;
	}

	// 设置 itemid 的属性值
	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	// 获取 itemcode 的属性值
	public String getItemcode() {
		return itemcode;
	}

	// 设置 itemcode 的属性值
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	// 获取 患者id 的属性值
	public String getUserId() {
		return userId;
	}

	// 设置 患者id 的属性值
	public void setUserId(String userId) {
		this.userId = userId;
	}

	// 获取 题目id 的属性值
	public String getqId() {
		return qId;
	}

	// 设置 题目id 的属性值
	public void setqId(String qId) {
		this.qId = qId;
	}

	// 获取 患者答题选项 的属性值
	public String getqOption() {
		return qOption;
	}

	// 设置 患者答题选项 的属性值
	public void setqOption(String qOption) {
		this.qOption = qOption;
	}

	// 获取 答题时间 的属性值
	public Timestamp getTcmRemark() {
		return tcmRemark;
	}

	// 设置 答题时间 的属性值
	public void setTcmRemark(Timestamp tcmRemark) {
		this.tcmRemark = tcmRemark;
	}

	// 获取 体质类型id 的属性值
	public String getTypeId() {
		return typeId;
	}

	// 设置 体质类型id 的属性值
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	// 获取 患者本次答题题目序号 的属性值
	public String getSeq() {
		return seq;
	}

	// 设置 患者本次答题题目序号 的属性值
	public void setSeq(String seq) {
		this.seq = seq;
	}

	// 获取 是否生效（1：是  0：否） 的属性值
	public String getUseflag() {
		return useflag;
	}

	// 设置 是否生效（1：是  0：否） 的属性值
	public void setUseflag(String useflag) {
		this.useflag = useflag;
	}

	// 获取 预留字段，暂未使用 的属性值
	public String getFlag1() {
		return flag1;
	}

	// 设置 预留字段，暂未使用 的属性值
	public void setFlag1(String flag1) {
		this.flag1 = flag1;
	}

	// 获取 预留字段，暂未使用 的属性值
	public String getFlag2() {
		return flag2;
	}

	// 设置 预留字段，暂未使用 的属性值
	public void setFlag2(String flag2) {
		this.flag2 = flag2;
	}

	// 获取 预留字段，暂未使用 的属性值
	public String getFlag3() {
		return flag3;
	}

	// 设置 预留字段，暂未使用 的属性值
	public void setFlag3(String flag3) {
		this.flag3 = flag3;
	}

	// 获取 uptflag 的属性值
	public String getUptflag() {
		return uptflag;
	}

	// 设置 uptflag 的属性值
	public void setUptflag(String uptflag) {
		this.uptflag = uptflag;
	}

	// 获取 体质测评结果itemcode 的属性值
	public String getResultItemcode() {
		return resultItemcode;
	}

	// 设置 体质测评结果itemcode 的属性值
	public void setResultItemcode(String resultItemcode) {
		this.resultItemcode = resultItemcode;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "TUseranswer {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", userId='" + userId + '\'' + 
				", qId='" + qId + '\'' + 
				", qOption='" + qOption + '\'' + 
				", tcmRemark='" + tcmRemark + '\'' + 
				", typeId='" + typeId + '\'' + 
				", seq='" + seq + '\'' + 
				", useflag='" + useflag + '\'' + 
				", flag1='" + flag1 + '\'' + 
				", flag2='" + flag2 + '\'' + 
				", flag3='" + flag3 + '\'' + 
				", uptflag='" + uptflag + '\'' + 
				", resultItemcode='" + resultItemcode + '\'' + 
				"}";
	}
}