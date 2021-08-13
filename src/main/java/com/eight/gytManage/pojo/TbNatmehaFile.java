package com.eight.gytManage.pojo;


import java.sql.Timestamp;


/**
 * @Author Kele-Bing
 * @Create 2021-08-13 12:33:31
 * @Version 1.0
 */
public class TbNatmehaFile {
	// 自增id
	private Long itemid;
	// 唯一标识
	private String itemcode;
	// 数据源itemcode
	private String dataCode;
	// 上传人
	private String uploader;
	// 上传人的id
	private String uploaderCode;
	// 附件名称
	private String fileName;
	// 附件文件类型 文档或图片
	private String fileType;
	// fileSize ：
	private Double fileSize;
	// 附件路径
	private String filePath;
	// itemcreateat ：
	private Timestamp itemcreateat;

	// 无参构造器
	public TbNatmehaFile() {
	}

	// 有参构造器，进行属性值的初始化
	public TbNatmehaFile(Long itemid, String itemcode, String dataCode, String uploader, String uploaderCode, String fileName, String fileType, Double fileSize, String filePath, Timestamp itemcreateat) {
		this.itemid = itemid;
		this.itemcode = itemcode;
		this.dataCode = dataCode;
		this.uploader = uploader;
		this.uploaderCode = uploaderCode;
		this.fileName = fileName;
		this.fileType = fileType;
		this.fileSize = fileSize;
		this.filePath = filePath;
		this.itemcreateat = itemcreateat;
	}

	// 获取 自增id 的属性值
	public Long getItemid() {
		return itemid;
	}

	// 设置 自增id 的属性值
	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}

	// 获取 唯一标识 的属性值
	public String getItemcode() {
		return itemcode;
	}

	// 设置 唯一标识 的属性值
	public void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}

	// 获取 数据源itemcode 的属性值
	public String getDataCode() {
		return dataCode;
	}

	// 设置 数据源itemcode 的属性值
	public void setDataCode(String dataCode) {
		this.dataCode = dataCode;
	}

	// 获取 上传人 的属性值
	public String getUploader() {
		return uploader;
	}

	// 设置 上传人 的属性值
	public void setUploader(String uploader) {
		this.uploader = uploader;
	}

	// 获取 上传人的id 的属性值
	public String getUploaderCode() {
		return uploaderCode;
	}

	// 设置 上传人的id 的属性值
	public void setUploaderCode(String uploaderCode) {
		this.uploaderCode = uploaderCode;
	}

	// 获取 附件名称 的属性值
	public String getFileName() {
		return fileName;
	}

	// 设置 附件名称 的属性值
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	// 获取 附件文件类型 文档或图片 的属性值
	public String getFileType() {
		return fileType;
	}

	// 设置 附件文件类型 文档或图片 的属性值
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	// 获取 fileSize 的属性值
	public Double getFileSize() {
		return fileSize;
	}

	// 设置 fileSize 的属性值
	public void setFileSize(Double fileSize) {
		this.fileSize = fileSize;
	}

	// 获取 附件路径 的属性值
	public String getFilePath() {
		return filePath;
	}

	// 设置 附件路径 的属性值
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	// 获取 itemcreateat 的属性值
	public Timestamp getItemcreateat() {
		return itemcreateat;
	}

	// 设置 itemcreateat 的属性值
	public void setItemcreateat(Timestamp itemcreateat) {
		this.itemcreateat = itemcreateat;
	}

	// 重写toString方法，使用该方法可以在控制台打印属性的数据
	@Override
	public String toString(){
		return "TbNatmehaFile {" + 
				", itemid='" + itemid + '\'' + 
				", itemcode='" + itemcode + '\'' + 
				", dataCode='" + dataCode + '\'' + 
				", uploader='" + uploader + '\'' + 
				", uploaderCode='" + uploaderCode + '\'' + 
				", fileName='" + fileName + '\'' + 
				", fileType='" + fileType + '\'' + 
				", fileSize='" + fileSize + '\'' + 
				", filePath='" + filePath + '\'' + 
				", itemcreateat='" + itemcreateat + '\'' + 
				"}";
	}
}