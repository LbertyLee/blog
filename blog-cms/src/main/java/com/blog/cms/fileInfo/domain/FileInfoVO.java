package com.blog.cms.fileInfo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 文件信息签证官
 *
 * @author lihong
 * @date 2023/04/28
 */
public class FileInfoVO {

    private static final long serialVersionUID = 1L;

    /*** 文件id*/
    private String id;

    /*** 文件访问地址*/
    private String url;

    /*** 文件名称*/
    private String filename;

    /*** 基础存储路径*/
    private String basePath;

    /*** 存储路径*/
    private String path;

    /*** 文件扩展名*/
    private String ext;

    /*** MIME 类型*/
    private String contentType;

    /*** 缩略图访问路径*/
    private String thUrl;

    /*** 缩略图名称*/
    private String thFilename;

    /*** 缩略图 MIME 类型*/
    private String thContentType;

    /*** 文件所属对象id*/
    private String objectId;

    /*** 文件所属对象类型，例如用户头像，评价图片*/
    private String objectType;


    /*** 创建时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public FileInfoVO(){

    }
    public FileInfoVO(String id, String url, String filename, String basePath, String path, String ext, String contentType, String thUrl, String thFilename, String thContentType, String objectId, String objectType, Date createTime) {
        this.id = id;
        this.url = url;
        this.filename = filename;
        this.basePath = basePath;
        this.path = path;
        this.ext = ext;
        this.contentType = contentType;
        this.thUrl = thUrl;
        this.thFilename = thFilename;
        this.thContentType = thContentType;
        this.objectId = objectId;
        this.objectType = objectType;
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getThUrl() {
        return thUrl;
    }

    public void setThUrl(String thUrl) {
        this.thUrl = thUrl;
    }

    public String getThFilename() {
        return thFilename;
    }

    public void setThFilename(String thFilename) {
        this.thFilename = thFilename;
    }

    public String getThContentType() {
        return thContentType;
    }

    public void setThContentType(String thContentType) {
        this.thContentType = thContentType;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
