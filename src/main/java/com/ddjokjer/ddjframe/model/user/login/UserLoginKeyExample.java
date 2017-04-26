package com.ddjokjer.ddjframe.model.user.login;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserLoginKeyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLoginKeyExample() {
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

        public Criteria andKeyUidIsNull() {
            addCriterion("key_uid is null");
            return (Criteria) this;
        }

        public Criteria andKeyUidIsNotNull() {
            addCriterion("key_uid is not null");
            return (Criteria) this;
        }

        public Criteria andKeyUidEqualTo(String value) {
            addCriterion("key_uid =", value, "keyUid");
            return (Criteria) this;
        }

        public Criteria andKeyUidNotEqualTo(String value) {
            addCriterion("key_uid <>", value, "keyUid");
            return (Criteria) this;
        }

        public Criteria andKeyUidGreaterThan(String value) {
            addCriterion("key_uid >", value, "keyUid");
            return (Criteria) this;
        }

        public Criteria andKeyUidGreaterThanOrEqualTo(String value) {
            addCriterion("key_uid >=", value, "keyUid");
            return (Criteria) this;
        }

        public Criteria andKeyUidLessThan(String value) {
            addCriterion("key_uid <", value, "keyUid");
            return (Criteria) this;
        }

        public Criteria andKeyUidLessThanOrEqualTo(String value) {
            addCriterion("key_uid <=", value, "keyUid");
            return (Criteria) this;
        }

        public Criteria andKeyUidLike(String value) {
            addCriterion("key_uid like", value, "keyUid");
            return (Criteria) this;
        }

        public Criteria andKeyUidNotLike(String value) {
            addCriterion("key_uid not like", value, "keyUid");
            return (Criteria) this;
        }

        public Criteria andKeyUidIn(List<String> values) {
            addCriterion("key_uid in", values, "keyUid");
            return (Criteria) this;
        }

        public Criteria andKeyUidNotIn(List<String> values) {
            addCriterion("key_uid not in", values, "keyUid");
            return (Criteria) this;
        }

        public Criteria andKeyUidBetween(String value1, String value2) {
            addCriterion("key_uid between", value1, value2, "keyUid");
            return (Criteria) this;
        }

        public Criteria andKeyUidNotBetween(String value1, String value2) {
            addCriterion("key_uid not between", value1, value2, "keyUid");
            return (Criteria) this;
        }

        public Criteria andKeySeedIsNull() {
            addCriterion("key_seed is null");
            return (Criteria) this;
        }

        public Criteria andKeySeedIsNotNull() {
            addCriterion("key_seed is not null");
            return (Criteria) this;
        }

        public Criteria andKeySeedEqualTo(String value) {
            addCriterion("key_seed =", value, "keySeed");
            return (Criteria) this;
        }

        public Criteria andKeySeedNotEqualTo(String value) {
            addCriterion("key_seed <>", value, "keySeed");
            return (Criteria) this;
        }

        public Criteria andKeySeedGreaterThan(String value) {
            addCriterion("key_seed >", value, "keySeed");
            return (Criteria) this;
        }

        public Criteria andKeySeedGreaterThanOrEqualTo(String value) {
            addCriterion("key_seed >=", value, "keySeed");
            return (Criteria) this;
        }

        public Criteria andKeySeedLessThan(String value) {
            addCriterion("key_seed <", value, "keySeed");
            return (Criteria) this;
        }

        public Criteria andKeySeedLessThanOrEqualTo(String value) {
            addCriterion("key_seed <=", value, "keySeed");
            return (Criteria) this;
        }

        public Criteria andKeySeedLike(String value) {
            addCriterion("key_seed like", value, "keySeed");
            return (Criteria) this;
        }

        public Criteria andKeySeedNotLike(String value) {
            addCriterion("key_seed not like", value, "keySeed");
            return (Criteria) this;
        }

        public Criteria andKeySeedIn(List<String> values) {
            addCriterion("key_seed in", values, "keySeed");
            return (Criteria) this;
        }

        public Criteria andKeySeedNotIn(List<String> values) {
            addCriterion("key_seed not in", values, "keySeed");
            return (Criteria) this;
        }

        public Criteria andKeySeedBetween(String value1, String value2) {
            addCriterion("key_seed between", value1, value2, "keySeed");
            return (Criteria) this;
        }

        public Criteria andKeySeedNotBetween(String value1, String value2) {
            addCriterion("key_seed not between", value1, value2, "keySeed");
            return (Criteria) this;
        }

        public Criteria andKeyFlagIsNull() {
            addCriterion("key_flag is null");
            return (Criteria) this;
        }

        public Criteria andKeyFlagIsNotNull() {
            addCriterion("key_flag is not null");
            return (Criteria) this;
        }

        public Criteria andKeyFlagEqualTo(Boolean value) {
            addCriterion("key_flag =", value, "keyFlag");
            return (Criteria) this;
        }

        public Criteria andKeyFlagNotEqualTo(Boolean value) {
            addCriterion("key_flag <>", value, "keyFlag");
            return (Criteria) this;
        }

        public Criteria andKeyFlagGreaterThan(Boolean value) {
            addCriterion("key_flag >", value, "keyFlag");
            return (Criteria) this;
        }

        public Criteria andKeyFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("key_flag >=", value, "keyFlag");
            return (Criteria) this;
        }

        public Criteria andKeyFlagLessThan(Boolean value) {
            addCriterion("key_flag <", value, "keyFlag");
            return (Criteria) this;
        }

        public Criteria andKeyFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("key_flag <=", value, "keyFlag");
            return (Criteria) this;
        }

        public Criteria andKeyFlagIn(List<Boolean> values) {
            addCriterion("key_flag in", values, "keyFlag");
            return (Criteria) this;
        }

        public Criteria andKeyFlagNotIn(List<Boolean> values) {
            addCriterion("key_flag not in", values, "keyFlag");
            return (Criteria) this;
        }

        public Criteria andKeyFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("key_flag between", value1, value2, "keyFlag");
            return (Criteria) this;
        }

        public Criteria andKeyFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("key_flag not between", value1, value2, "keyFlag");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("created_by like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("created_by not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedDtIsNull() {
            addCriterion("created_dt is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDtIsNotNull() {
            addCriterion("created_dt is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDtEqualTo(Date value) {
            addCriterion("created_dt =", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtNotEqualTo(Date value) {
            addCriterion("created_dt <>", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtGreaterThan(Date value) {
            addCriterion("created_dt >", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_dt >=", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtLessThan(Date value) {
            addCriterion("created_dt <", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtLessThanOrEqualTo(Date value) {
            addCriterion("created_dt <=", value, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtIn(List<Date> values) {
            addCriterion("created_dt in", values, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtNotIn(List<Date> values) {
            addCriterion("created_dt not in", values, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtBetween(Date value1, Date value2) {
            addCriterion("created_dt between", value1, value2, "createdDt");
            return (Criteria) this;
        }

        public Criteria andCreatedDtNotBetween(Date value1, Date value2) {
            addCriterion("created_dt not between", value1, value2, "createdDt");
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