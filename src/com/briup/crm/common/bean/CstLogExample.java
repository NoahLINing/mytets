package com.briup.crm.common.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CstLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public CstLogExample() {
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

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogOpIsNull() {
            addCriterion("log_op is null");
            return (Criteria) this;
        }

        public Criteria andLogOpIsNotNull() {
            addCriterion("log_op is not null");
            return (Criteria) this;
        }

        public Criteria andLogOpEqualTo(String value) {
            addCriterion("log_op =", value, "logOp");
            return (Criteria) this;
        }

        public Criteria andLogOpNotEqualTo(String value) {
            addCriterion("log_op <>", value, "logOp");
            return (Criteria) this;
        }

        public Criteria andLogOpGreaterThan(String value) {
            addCriterion("log_op >", value, "logOp");
            return (Criteria) this;
        }

        public Criteria andLogOpGreaterThanOrEqualTo(String value) {
            addCriterion("log_op >=", value, "logOp");
            return (Criteria) this;
        }

        public Criteria andLogOpLessThan(String value) {
            addCriterion("log_op <", value, "logOp");
            return (Criteria) this;
        }

        public Criteria andLogOpLessThanOrEqualTo(String value) {
            addCriterion("log_op <=", value, "logOp");
            return (Criteria) this;
        }

        public Criteria andLogOpLike(String value) {
            addCriterion("log_op like", value, "logOp");
            return (Criteria) this;
        }

        public Criteria andLogOpNotLike(String value) {
            addCriterion("log_op not like", value, "logOp");
            return (Criteria) this;
        }

        public Criteria andLogOpIn(List<String> values) {
            addCriterion("log_op in", values, "logOp");
            return (Criteria) this;
        }

        public Criteria andLogOpNotIn(List<String> values) {
            addCriterion("log_op not in", values, "logOp");
            return (Criteria) this;
        }

        public Criteria andLogOpBetween(String value1, String value2) {
            addCriterion("log_op between", value1, value2, "logOp");
            return (Criteria) this;
        }

        public Criteria andLogOpNotBetween(String value1, String value2) {
            addCriterion("log_op not between", value1, value2, "logOp");
            return (Criteria) this;
        }

        public Criteria andLogEventIsNull() {
            addCriterion("log_event is null");
            return (Criteria) this;
        }

        public Criteria andLogEventIsNotNull() {
            addCriterion("log_event is not null");
            return (Criteria) this;
        }

        public Criteria andLogEventEqualTo(String value) {
            addCriterion("log_event =", value, "logEvent");
            return (Criteria) this;
        }

        public Criteria andLogEventNotEqualTo(String value) {
            addCriterion("log_event <>", value, "logEvent");
            return (Criteria) this;
        }

        public Criteria andLogEventGreaterThan(String value) {
            addCriterion("log_event >", value, "logEvent");
            return (Criteria) this;
        }

        public Criteria andLogEventGreaterThanOrEqualTo(String value) {
            addCriterion("log_event >=", value, "logEvent");
            return (Criteria) this;
        }

        public Criteria andLogEventLessThan(String value) {
            addCriterion("log_event <", value, "logEvent");
            return (Criteria) this;
        }

        public Criteria andLogEventLessThanOrEqualTo(String value) {
            addCriterion("log_event <=", value, "logEvent");
            return (Criteria) this;
        }

        public Criteria andLogEventLike(String value) {
            addCriterion("log_event like", value, "logEvent");
            return (Criteria) this;
        }

        public Criteria andLogEventNotLike(String value) {
            addCriterion("log_event not like", value, "logEvent");
            return (Criteria) this;
        }

        public Criteria andLogEventIn(List<String> values) {
            addCriterion("log_event in", values, "logEvent");
            return (Criteria) this;
        }

        public Criteria andLogEventNotIn(List<String> values) {
            addCriterion("log_event not in", values, "logEvent");
            return (Criteria) this;
        }

        public Criteria andLogEventBetween(String value1, String value2) {
            addCriterion("log_event between", value1, value2, "logEvent");
            return (Criteria) this;
        }

        public Criteria andLogEventNotBetween(String value1, String value2) {
            addCriterion("log_event not between", value1, value2, "logEvent");
            return (Criteria) this;
        }

        public Criteria andLogDateIsNull() {
            addCriterion("log_date is null");
            return (Criteria) this;
        }

        public Criteria andLogDateIsNotNull() {
            addCriterion("log_date is not null");
            return (Criteria) this;
        }

        public Criteria andLogDateEqualTo(Date value) {
            addCriterion("log_date =", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotEqualTo(Date value) {
            addCriterion("log_date <>", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateGreaterThan(Date value) {
            addCriterion("log_date >", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateGreaterThanOrEqualTo(Date value) {
            addCriterion("log_date >=", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateLessThan(Date value) {
            addCriterion("log_date <", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateLessThanOrEqualTo(Date value) {
            addCriterion("log_date <=", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateIn(List<Date> values) {
            addCriterion("log_date in", values, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotIn(List<Date> values) {
            addCriterion("log_date not in", values, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateBetween(Date value1, Date value2) {
            addCriterion("log_date between", value1, value2, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotBetween(Date value1, Date value2) {
            addCriterion("log_date not between", value1, value2, "logDate");
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