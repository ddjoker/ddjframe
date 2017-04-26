package com.ddjokjer.ddjframe.model.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserPreferencesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPreferencesExample() {
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

        public Criteria andTimezoneIdIsNull() {
            addCriterion("timezone_id is null");
            return (Criteria) this;
        }

        public Criteria andTimezoneIdIsNotNull() {
            addCriterion("timezone_id is not null");
            return (Criteria) this;
        }

        public Criteria andTimezoneIdEqualTo(String value) {
            addCriterion("timezone_id =", value, "timezoneId");
            return (Criteria) this;
        }

        public Criteria andTimezoneIdNotEqualTo(String value) {
            addCriterion("timezone_id <>", value, "timezoneId");
            return (Criteria) this;
        }

        public Criteria andTimezoneIdGreaterThan(String value) {
            addCriterion("timezone_id >", value, "timezoneId");
            return (Criteria) this;
        }

        public Criteria andTimezoneIdGreaterThanOrEqualTo(String value) {
            addCriterion("timezone_id >=", value, "timezoneId");
            return (Criteria) this;
        }

        public Criteria andTimezoneIdLessThan(String value) {
            addCriterion("timezone_id <", value, "timezoneId");
            return (Criteria) this;
        }

        public Criteria andTimezoneIdLessThanOrEqualTo(String value) {
            addCriterion("timezone_id <=", value, "timezoneId");
            return (Criteria) this;
        }

        public Criteria andTimezoneIdLike(String value) {
            addCriterion("timezone_id like", value, "timezoneId");
            return (Criteria) this;
        }

        public Criteria andTimezoneIdNotLike(String value) {
            addCriterion("timezone_id not like", value, "timezoneId");
            return (Criteria) this;
        }

        public Criteria andTimezoneIdIn(List<String> values) {
            addCriterion("timezone_id in", values, "timezoneId");
            return (Criteria) this;
        }

        public Criteria andTimezoneIdNotIn(List<String> values) {
            addCriterion("timezone_id not in", values, "timezoneId");
            return (Criteria) this;
        }

        public Criteria andTimezoneIdBetween(String value1, String value2) {
            addCriterion("timezone_id between", value1, value2, "timezoneId");
            return (Criteria) this;
        }

        public Criteria andTimezoneIdNotBetween(String value1, String value2) {
            addCriterion("timezone_id not between", value1, value2, "timezoneId");
            return (Criteria) this;
        }

        public Criteria andLangIdIsNull() {
            addCriterion("lang_id is null");
            return (Criteria) this;
        }

        public Criteria andLangIdIsNotNull() {
            addCriterion("lang_id is not null");
            return (Criteria) this;
        }

        public Criteria andLangIdEqualTo(String value) {
            addCriterion("lang_id =", value, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdNotEqualTo(String value) {
            addCriterion("lang_id <>", value, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdGreaterThan(String value) {
            addCriterion("lang_id >", value, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdGreaterThanOrEqualTo(String value) {
            addCriterion("lang_id >=", value, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdLessThan(String value) {
            addCriterion("lang_id <", value, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdLessThanOrEqualTo(String value) {
            addCriterion("lang_id <=", value, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdLike(String value) {
            addCriterion("lang_id like", value, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdNotLike(String value) {
            addCriterion("lang_id not like", value, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdIn(List<String> values) {
            addCriterion("lang_id in", values, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdNotIn(List<String> values) {
            addCriterion("lang_id not in", values, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdBetween(String value1, String value2) {
            addCriterion("lang_id between", value1, value2, "langId");
            return (Criteria) this;
        }

        public Criteria andLangIdNotBetween(String value1, String value2) {
            addCriterion("lang_id not between", value1, value2, "langId");
            return (Criteria) this;
        }

        public Criteria andSearchModeIsNull() {
            addCriterion("search_mode is null");
            return (Criteria) this;
        }

        public Criteria andSearchModeIsNotNull() {
            addCriterion("search_mode is not null");
            return (Criteria) this;
        }

        public Criteria andSearchModeEqualTo(String value) {
            addCriterion("search_mode =", value, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeNotEqualTo(String value) {
            addCriterion("search_mode <>", value, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeGreaterThan(String value) {
            addCriterion("search_mode >", value, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeGreaterThanOrEqualTo(String value) {
            addCriterion("search_mode >=", value, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeLessThan(String value) {
            addCriterion("search_mode <", value, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeLessThanOrEqualTo(String value) {
            addCriterion("search_mode <=", value, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeLike(String value) {
            addCriterion("search_mode like", value, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeNotLike(String value) {
            addCriterion("search_mode not like", value, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeIn(List<String> values) {
            addCriterion("search_mode in", values, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeNotIn(List<String> values) {
            addCriterion("search_mode not in", values, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeBetween(String value1, String value2) {
            addCriterion("search_mode between", value1, value2, "searchMode");
            return (Criteria) this;
        }

        public Criteria andSearchModeNotBetween(String value1, String value2) {
            addCriterion("search_mode not between", value1, value2, "searchMode");
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