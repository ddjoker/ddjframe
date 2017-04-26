package com.ddjokjer.ddjframe.model.user.login;

import java.util.Date;

public class UserLoginDefault {
    private String usrGuid;

    private String loginName;

    private String mainEmail;

    private String phone;

    private String password;

    private String resetLogin;

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

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getMainEmail() {
        return mainEmail;
    }

    public void setMainEmail(String mainEmail) {
        this.mainEmail = mainEmail == null ? null : mainEmail.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getResetLogin() {
        return resetLogin;
    }

    public void setResetLogin(String resetLogin) {
        this.resetLogin = resetLogin == null ? null : resetLogin.trim();
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