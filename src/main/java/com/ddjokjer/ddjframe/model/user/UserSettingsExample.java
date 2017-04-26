package com.ddjokjer.ddjframe.model.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserSettingsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserSettingsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUsrGuidIsNull() {
            addCriterion("usr_guid is null");
            return (Criteria) this;
        }

        public Criteria andUsrGuidIsNotNull() {
            addCriterion("usr_guid is not null");
            return (Criteria) this;
        }

        public Criteria andUsrGuidEqualTo(String value) {
            addCriterion("usr_guid =", value, "usrGuid");
            return (Criteria) this;
        }

        public Criteria andUsrGuidNotEqualTo(String value) {
            addCriterion("usr_guid <>", value, "usrGuid");
            return (Criteria) this;
        }

        public Criteria andUsrGuidGreaterThan(String value) {
            addCriterion("usr_guid >", value, "usrGuid");
            return (Criteria) this;
        }

        public Criteria andUsrGuidGreaterThanOrEqualTo(String value) {
            addCriterion("usr_guid >=", value, "usrGuid");
            return (Criteria) this;
        }

        public Criteria andUsrGuidLessThan(String value) {
            addCriterion("usr_guid <", value, "usrGuid");
            return (Criteria) this;
        }

        public Criteria andUsrGuidLessThanOrEqualTo(String value) {
            addCriterion("usr_guid <=", value, "usrGuid");
            return (Criteria) this;
        }

        public Criteria andUsrGuidLike(String value) {
            addCriterion("usr_guid like", value, "usrGuid");
            return (Criteria) this;
        }

        public Criteria andUsrGuidNotLike(String value) {
            addCriterion("usr_guid not like", value, "usrGuid");
            return (Criteria) this;
        }

        public Criteria andUsrGuidIn(List<String> values) {
            addCriterion("usr_guid in", values, "usrGuid");
            return (Criteria) this;
        }

        public Criteria andUsrGuidNotIn(List<String> values) {
            addCriterion("usr_guid not in", values, "usrGuid");
            return (Criteria) this;
        }

        public Criteria andUsrGuidBetween(String value1, String value2) {
            addCriterion("usr_guid between", value1, value2, "usrGuid");
            return (Criteria) this;
        }

        public Criteria andUsrGuidNotBetween(String value1, String value2) {
            addCriterion("usr_guid not between", value1, value2, "usrGuid");
            return (Criteria) this;
        }

        public Criteria andEnableSyncIsNull() {
            addCriterion("enable_sync is null");
            return (Criteria) this;
        }

        public Criteria andEnableSyncIsNotNull() {
            addCriterion("enable_sync is not null");
            return (Criteria) this;
        }

        public Criteria andEnableSyncEqualTo(Boolean value) {
            addCriterion("enable_sync =", value, "enableSync");
            return (Criteria) this;
        }

        public Criteria andEnableSyncNotEqualTo(Boolean value) {
            addCriterion("enable_sync <>", value, "enableSync");
            return (Criteria) this;
        }

        public Criteria andEnableSyncGreaterThan(Boolean value) {
            addCriterion("enable_sync >", value, "enableSync");
            return (Criteria) this;
        }

        public Criteria andEnableSyncGreaterThanOrEqualTo(Boolean value) {
            addCriterion("enable_sync >=", value, "enableSync");
            return (Criteria) this;
        }

        public Criteria andEnableSyncLessThan(Boolean value) {
            addCriterion("enable_sync <", value, "enableSync");
            return (Criteria) this;
        }

        public Criteria andEnableSyncLessThanOrEqualTo(Boolean value) {
            addCriterion("enable_sync <=", value, "enableSync");
            return (Criteria) this;
        }

        public Criteria andEnableSyncIn(List<Boolean> values) {
            addCriterion("enable_sync in", values, "enableSync");
            return (Criteria) this;
        }

        public Criteria andEnableSyncNotIn(List<Boolean> values) {
            addCriterion("enable_sync not in", values, "enableSync");
            return (Criteria) this;
        }

        public Criteria andEnableSyncBetween(Boolean value1, Boolean value2) {
            addCriterion("enable_sync between", value1, value2, "enableSync");
            return (Criteria) this;
        }

        public Criteria andEnableSyncNotBetween(Boolean value1, Boolean value2) {
            addCriterion("enable_sync not between", value1, value2, "enableSync");
            return (Criteria) this;
        }

        public Criteria andLoginModeIsNull() {
            addCriterion("login_mode is null");
            return (Criteria) this;
        }

        public Criteria andLoginModeIsNotNull() {
            addCriterion("login_mode is not null");
            return (Criteria) this;
        }

        public Criteria andLoginModeEqualTo(String value) {
            addCriterion("login_mode =", value, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeNotEqualTo(String value) {
            addCriterion("login_mode <>", value, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeGreaterThan(String value) {
            addCriterion("login_mode >", value, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeGreaterThanOrEqualTo(String value) {
            addCriterion("login_mode >=", value, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeLessThan(String value) {
            addCriterion("login_mode <", value, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeLessThanOrEqualTo(String value) {
            addCriterion("login_mode <=", value, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeLike(String value) {
            addCriterion("login_mode like", value, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeNotLike(String value) {
            addCriterion("login_mode not like", value, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeIn(List<String> values) {
            addCriterion("login_mode in", values, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeNotIn(List<String> values) {
            addCriterion("login_mode not in", values, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeBetween(String value1, String value2) {
            addCriterion("login_mode between", value1, value2, "loginMode");
            return (Criteria) this;
        }

        public Criteria andLoginModeNotBetween(String value1, String value2) {
            addCriterion("login_mode not between", value1, value2, "loginMode");
            return (Criteria) this;
        }

        public Criteria andRecordFlagIsNull() {
            addCriterion("record_flag is null");
            return (Criteria) this;
        }

        public Criteria andRecordFlagIsNotNull() {
            addCriterion("record_flag is not null");
            return (Criteria) this;
        }

        public Criteria andRecordFlagEqualTo(String value) {
            addCriterion("record_flag =", value, "recordFlag");
            return (Criteria) this;
        }

        public Criteria andRecordFlagNotEqualTo(String value) {
            addCriterion("record_flag <>", value, "recordFlag");
            return (Criteria) this;
        }

        public Criteria andRecordFlagGreaterThan(String value) {
            addCriterion("record_flag >", value, "recordFlag");
            return (Criteria) this;
        }

        public Criteria andRecordFlagGreaterThanOrEqualTo(String value) {
            addCriterion("record_flag >=", value, "recordFlag");
            return (Criteria) this;
        }

        public Criteria andRecordFlagLessThan(String value) {
            addCriterion("record_flag <", value, "recordFlag");
            return (Criteria) this;
        }

        public Criteria andRecordFlagLessThanOrEqualTo(String value) {
            addCriterion("record_flag <=", value, "recordFlag");
            return (Criteria) this;
        }

        public Criteria andRecordFlagLike(String value) {
            addCriterion("record_flag like", value, "recordFlag");
            return (Criteria) this;
        }

        public Criteria andRecordFlagNotLike(String value) {
            addCriterion("record_flag not like", value, "recordFlag");
            return (Criteria) this;
        }

        public Criteria andRecordFlagIn(List<String> values) {
            addCriterion("record_flag in", values, "recordFlag");
            return (Criteria) this;
        }

        public Criteria andRecordFlagNotIn(List<String> values) {
            addCriterion("record_flag not in", values, "recordFlag");
            return (Criteria) this;
        }

        public Criteria andRecordFlagBetween(String value1, String value2) {
            addCriterion("record_flag between", value1, value2, "recordFlag");
            return (Criteria) this;
        }

        public Criteria andRecordFlagNotBetween(String value1, String value2) {
            addCriterion("record_flag not between", value1, value2, "recordFlag");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("updated_by like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("updated_by not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtIsNull() {
            addCriterion("updated_dt is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtIsNotNull() {
            addCriterion("updated_dt is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtEqualTo(Date value) {
            addCriterion("updated_dt =", value, "updatedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtNotEqualTo(Date value) {
            addCriterion("updated_dt <>", value, "updatedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtGreaterThan(Date value) {
            addCriterion("updated_dt >", value, "updatedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_dt >=", value, "updatedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtLessThan(Date value) {
            addCriterion("updated_dt <", value, "updatedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtLessThanOrEqualTo(Date value) {
            addCriterion("updated_dt <=", value, "updatedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtIn(List<Date> values) {
            addCriterion("updated_dt in", values, "updatedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtNotIn(List<Date> values) {
            addCriterion("updated_dt not in", values, "updatedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtBetween(Date value1, Date value2) {
            addCriterion("updated_dt between", value1, value2, "updatedDt");
            return (Criteria) this;
        }

        public Criteria andUpdatedDtNotBetween(Date value1, Date value2) {
            addCriterion("updated_dt not between", value1, value2, "updatedDt");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}