package com.ddjokjer.ddjframe.model.user.login;

import java.util.Date;

public class UserLoginKey {
    private String usrGuid;

    private String keyUid;

    private String keySeed;

    private Boolean keyFlag;

    private String createdBy;

    private Date createdDt;

    private String recordFlag;

    private String updatedBy;

    private Date updatedDt;

    public String getUsrGuid() {
        return usrGuid;
    }

    public void setUsrGuid(String usrGuid) {
        this.usrGuid = usrGuid == null ? null : usrGuid.trim();
    }

    public String getKeyUid() {
        return keyUid;
    }

    public void setKeyUid(String keyUid) {
        this.keyUid = keyUid == null ? null : keyUid.trim();
    }

    public String getKeySeed() {
        return keySeed;
    }

    public void setKeySeed(String keySeed) {
        this.keySeed = keySeed == null ? null : keySeed.trim();
    }

    public Boolean getKeyFlag() {
        return keyFlag;
    }

    public void setKeyFlag(Boolean keyFlag) {
        this.keyFlag = keyFlag;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    public String getRecordFlag() {
        return recordFlag;
    }

    public void setRecordFlag(String recordFlag) {
        this.recordFlag = recordFlag == null ? null : recordFlag.trim();
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedDt() {
        return updatedDt;
    }

    public void setUpdatedDt(Date updatedDt) {
        this.updatedDt = updatedDt;
    }
}