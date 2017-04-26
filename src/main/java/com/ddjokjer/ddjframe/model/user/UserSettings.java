package com.ddjokjer.ddjframe.model.user;

import java.util.Date;

public class UserSettings {
    private String usrGuid;

    private Boolean enableSync;

    private String loginMode;

    private String recordFlag;

    private String updatedBy;

    private Date updatedDt;

    public String getUsrGuid() {
        return usrGuid;
    }

    public void setUsrGuid(String usrGuid) {
        this.usrGuid = usrGuid == null ? null : usrGuid.trim();
    }

    public Boolean getEnableSync() {
        return enableSync;
    }

    public void setEnableSync(Boolean enableSync) {
        this.enableSync = enableSync;
    }

    public String getLoginMode() {
        return loginMode;
    }

    public void setLoginMode(String loginMode) {
        this.loginMode = loginMode == null ? null : loginMode.trim();
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