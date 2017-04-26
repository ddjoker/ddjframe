package com.ddjokjer.ddjframe.model.user;

import java.util.Date;

public class UserPreferences {
    private String usrGuid;

    private String timezoneId;

    private String langId;

    private String searchMode;

    private String recordFlag;

    private String updatedBy;

    private Date updatedDt;

    public String getUsrGuid() {
        return usrGuid;
    }

    public void setUsrGuid(String usrGuid) {
        this.usrGuid = usrGuid == null ? null : usrGuid.trim();
    }

    public String getTimezoneId() {
        return timezoneId;
    }

    public void setTimezoneId(String timezoneId) {
        this.timezoneId = timezoneId == null ? null : timezoneId.trim();
    }

    public String getLangId() {
        return langId;
    }

    public void setLangId(String langId) {
        this.langId = langId == null ? null : langId.trim();
    }

    public String getSearchMode() {
        return searchMode;
    }

    public void setSearchMode(String searchMode) {
        this.searchMode = searchMode == null ? null : searchMode.trim();
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