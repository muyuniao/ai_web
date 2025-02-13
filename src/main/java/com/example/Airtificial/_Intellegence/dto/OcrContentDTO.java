package com.example.Airtificial._Intellegence.dto;

import java.util.Date;

public class OcrContentDTO {
    private Integer id;
    private String content;
    private String type;
    private Date createTime;
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public OcrContentDTO() {
    }

    public OcrContentDTO(Integer id, String content, Date createTime, String type, Date updateTime) {
        this.id = id;
        this.content = content;
        this.createTime = createTime;
        this.type = type;
        this.updateTime = updateTime;
    }
}
