package com.example.Airtificial._Intellegence.dto;
import java.util.Date;

public class OcrContent {
    private String content;
    private String type;
    private Date createTime;
    private Date updateTime;

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

    public OcrContent() {
    }

    public OcrContent(String content, String type, Date createTime, Date updateTime) {
        this.content = content;
        this.type = type;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
