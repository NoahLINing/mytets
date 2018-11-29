package com.briup.crm.common.bean;

import java.util.ArrayList;
import java.util.List;

public class CstServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public CstServiceExample() {
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

        public Criteria andSvrIdIsNull() {
            addCriterion("svr_id is null");
            return (Criteria) this;
        }

        public Criteria andSvrIdIsNotNull() {
            addCriterion("svr_id is not null");
            return (Criteria) this;
        }

        public Criteria andSvrIdEqualTo(Long value) {
            addCriterion("svr_id =", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdNotEqualTo(Long value) {
            addCriterion("svr_id <>", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdGreaterThan(Long value) {
            addCriterion("svr_id >", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdGreaterThanOrEqualTo(Long value) {
            addCriterion("svr_id >=", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdLessThan(Long value) {
            addCriterion("svr_id <", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdLessThanOrEqualTo(Long value) {
            addCriterion("svr_id <=", value, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdIn(List<Long> values) {
            addCriterion("svr_id in", values, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdNotIn(List<Long> values) {
            addCriterion("svr_id not in", values, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdBetween(Long value1, Long value2) {
            addCriterion("svr_id between", value1, value2, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrIdNotBetween(Long value1, Long value2) {
            addCriterion("svr_id not between", value1, value2, "svrId");
            return (Criteria) this;
        }

        public Criteria andSvrTypeIsNull() {
            addCriterion("svr_type is null");
            return (Criteria) this;
        }

        public Criteria andSvrTypeIsNotNull() {
            addCriterion("svr_type is not null");
            return (Criteria) this;
        }

        public Criteria andSvrTypeEqualTo(String value) {
            addCriterion("svr_type =", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeNotEqualTo(String value) {
            addCriterion("svr_type <>", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeGreaterThan(String value) {
            addCriterion("svr_type >", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("svr_type >=", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeLessThan(String value) {
            addCriterion("svr_type <", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeLessThanOrEqualTo(String value) {
            addCriterion("svr_type <=", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeLike(String value) {
            addCriterion("svr_type like", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeNotLike(String value) {
            addCriterion("svr_type not like", value, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeIn(List<String> values) {
            addCriterion("svr_type in", values, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeNotIn(List<String> values) {
            addCriterion("svr_type not in", values, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeBetween(String value1, String value2) {
            addCriterion("svr_type between", value1, value2, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTypeNotBetween(String value1, String value2) {
            addCriterion("svr_type not between", value1, value2, "svrType");
            return (Criteria) this;
        }

        public Criteria andSvrTitleIsNull() {
            addCriterion("svr_title is null");
            return (Criteria) this;
        }

        public Criteria andSvrTitleIsNotNull() {
            addCriterion("svr_title is not null");
            return (Criteria) this;
        }

        public Criteria andSvrTitleEqualTo(String value) {
            addCriterion("svr_title =", value, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleNotEqualTo(String value) {
            addCriterion("svr_title <>", value, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleGreaterThan(String value) {
            addCriterion("svr_title >", value, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleGreaterThanOrEqualTo(String value) {
            addCriterion("svr_title >=", value, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleLessThan(String value) {
            addCriterion("svr_title <", value, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleLessThanOrEqualTo(String value) {
            addCriterion("svr_title <=", value, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleLike(String value) {
            addCriterion("svr_title like", value, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleNotLike(String value) {
            addCriterion("svr_title not like", value, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleIn(List<String> values) {
            addCriterion("svr_title in", values, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleNotIn(List<String> values) {
            addCriterion("svr_title not in", values, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleBetween(String value1, String value2) {
            addCriterion("svr_title between", value1, value2, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrTitleNotBetween(String value1, String value2) {
            addCriterion("svr_title not between", value1, value2, "svrTitle");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameIsNull() {
            addCriterion("svr_cust_name is null");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameIsNotNull() {
            addCriterion("svr_cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameEqualTo(String value) {
            addCriterion("svr_cust_name =", value, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameNotEqualTo(String value) {
            addCriterion("svr_cust_name <>", value, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameGreaterThan(String value) {
            addCriterion("svr_cust_name >", value, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("svr_cust_name >=", value, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameLessThan(String value) {
            addCriterion("svr_cust_name <", value, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameLessThanOrEqualTo(String value) {
            addCriterion("svr_cust_name <=", value, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameLike(String value) {
            addCriterion("svr_cust_name like", value, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameNotLike(String value) {
            addCriterion("svr_cust_name not like", value, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameIn(List<String> values) {
            addCriterion("svr_cust_name in", values, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameNotIn(List<String> values) {
            addCriterion("svr_cust_name not in", values, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameBetween(String value1, String value2) {
            addCriterion("svr_cust_name between", value1, value2, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrCustNameNotBetween(String value1, String value2) {
            addCriterion("svr_cust_name not between", value1, value2, "svrCustName");
            return (Criteria) this;
        }

        public Criteria andSvrStatusIsNull() {
            addCriterion("svr_status is null");
            return (Criteria) this;
        }

        public Criteria andSvrStatusIsNotNull() {
            addCriterion("svr_status is not null");
            return (Criteria) this;
        }

        public Criteria andSvrStatusEqualTo(String value) {
            addCriterion("svr_status =", value, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusNotEqualTo(String value) {
            addCriterion("svr_status <>", value, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusGreaterThan(String value) {
            addCriterion("svr_status >", value, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusGreaterThanOrEqualTo(String value) {
            addCriterion("svr_status >=", value, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusLessThan(String value) {
            addCriterion("svr_status <", value, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusLessThanOrEqualTo(String value) {
            addCriterion("svr_status <=", value, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusLike(String value) {
            addCriterion("svr_status like", value, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusNotLike(String value) {
            addCriterion("svr_status not like", value, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusIn(List<String> values) {
            addCriterion("svr_status in", values, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusNotIn(List<String> values) {
            addCriterion("svr_status not in", values, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusBetween(String value1, String value2) {
            addCriterion("svr_status between", value1, value2, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrStatusNotBetween(String value1, String value2) {
            addCriterion("svr_status not between", value1, value2, "svrStatus");
            return (Criteria) this;
        }

        public Criteria andSvrRequestIsNull() {
            addCriterion("svr_request is null");
            return (Criteria) this;
        }

        public Criteria andSvrRequestIsNotNull() {
            addCriterion("svr_request is not null");
            return (Criteria) this;
        }

        public Criteria andSvrRequestEqualTo(String value) {
            addCriterion("svr_request =", value, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestNotEqualTo(String value) {
            addCriterion("svr_request <>", value, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestGreaterThan(String value) {
            addCriterion("svr_request >", value, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestGreaterThanOrEqualTo(String value) {
            addCriterion("svr_request >=", value, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestLessThan(String value) {
            addCriterion("svr_request <", value, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestLessThanOrEqualTo(String value) {
            addCriterion("svr_request <=", value, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestLike(String value) {
            addCriterion("svr_request like", value, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestNotLike(String value) {
            addCriterion("svr_request not like", value, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestIn(List<String> values) {
            addCriterion("svr_request in", values, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestNotIn(List<String> values) {
            addCriterion("svr_request not in", values, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestBetween(String value1, String value2) {
            addCriterion("svr_request between", value1, value2, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrRequestNotBetween(String value1, String value2) {
            addCriterion("svr_request not between", value1, value2, "svrRequest");
            return (Criteria) this;
        }

        public Criteria andSvrCreateByIsNull() {
            addCriterion("svr_create_by is null");
            return (Criteria) this;
        }

        public Criteria andSvrCreateByIsNotNull() {
            addCriterion("svr_create_by is not null");
            return (Criteria) this;
        }

        public Criteria andSvrCreateByEqualTo(String value) {
            addCriterion("svr_create_by =", value, "svrCreateBy");
            return (Criteria) this;
        }

        public Criteria andSvrCreateByNotEqualTo(String value) {
            addCriterion("svr_create_by <>", value, "svrCreateBy");
            return (Criteria) this;
        }

        public Criteria andSvrCreateByGreaterThan(String value) {
            addCriterion("svr_create_by >", value, "svrCreateBy");
            return (Criteria) this;
        }

        public Criteria andSvrCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("svr_create_by >=", value, "svrCreateBy");
            return (Criteria) this;
        }

        public Criteria andSvrCreateByLessThan(String value) {
            addCriterion("svr_create_by <", value, "svrCreateBy");
            return (Criteria) this;
        }

        public Criteria andSvrCreateByLessThanOrEqualTo(String value) {
            addCriterion("svr_create_by <=", value, "svrCreateBy");
            return (Criteria) this;
        }

        public Criteria andSvrCreateByLike(String value) {
            addCriterion("svr_create_by like", value, "svrCreateBy");
            return (Criteria) this;
        }

        public Criteria andSvrCreateByNotLike(String value) {
            addCriterion("svr_create_by not like", value, "svrCreateBy");
            return (Criteria) this;
        }

        public Criteria andSvrCreateByIn(List<String> values) {
            addCriterion("svr_create_by in", values, "svrCreateBy");
            return (Criteria) this;
        }

        public Criteria andSvrCreateByNotIn(List<String> values) {
            addCriterion("svr_create_by not in", values, "svrCreateBy");
            return (Criteria) this;
        }

        public Criteria andSvrCreateByBetween(String value1, String value2) {
            addCriterion("svr_create_by between", value1, value2, "svrCreateBy");
            return (Criteria) this;
        }

        public Criteria andSvrCreateByNotBetween(String value1, String value2) {
            addCriterion("svr_create_by not between", value1, value2, "svrCreateBy");
            return (Criteria) this;
        }

        public Criteria andSvrDueToIsNull() {
            addCriterion("svr_due_to is null");
            return (Criteria) this;
        }

        public Criteria andSvrDueToIsNotNull() {
            addCriterion("svr_due_to is not null");
            return (Criteria) this;
        }

        public Criteria andSvrDueToEqualTo(String value) {
            addCriterion("svr_due_to =", value, "svrDueTo");
            return (Criteria) this;
        }

        public Criteria andSvrDueToNotEqualTo(String value) {
            addCriterion("svr_due_to <>", value, "svrDueTo");
            return (Criteria) this;
        }

        public Criteria andSvrDueToGreaterThan(String value) {
            addCriterion("svr_due_to >", value, "svrDueTo");
            return (Criteria) this;
        }

        public Criteria andSvrDueToGreaterThanOrEqualTo(String value) {
            addCriterion("svr_due_to >=", value, "svrDueTo");
            return (Criteria) this;
        }

        public Criteria andSvrDueToLessThan(String value) {
            addCriterion("svr_due_to <", value, "svrDueTo");
            return (Criteria) this;
        }

        public Criteria andSvrDueToLessThanOrEqualTo(String value) {
            addCriterion("svr_due_to <=", value, "svrDueTo");
            return (Criteria) this;
        }

        public Criteria andSvrDueToLike(String value) {
            addCriterion("svr_due_to like", value, "svrDueTo");
            return (Criteria) this;
        }

        public Criteria andSvrDueToNotLike(String value) {
            addCriterion("svr_due_to not like", value, "svrDueTo");
            return (Criteria) this;
        }

        public Criteria andSvrDueToIn(List<String> values) {
            addCriterion("svr_due_to in", values, "svrDueTo");
            return (Criteria) this;
        }

        public Criteria andSvrDueToNotIn(List<String> values) {
            addCriterion("svr_due_to not in", values, "svrDueTo");
            return (Criteria) this;
        }

        public Criteria andSvrDueToBetween(String value1, String value2) {
            addCriterion("svr_due_to between", value1, value2, "svrDueTo");
            return (Criteria) this;
        }

        public Criteria andSvrDueToNotBetween(String value1, String value2) {
            addCriterion("svr_due_to not between", value1, value2, "svrDueTo");
            return (Criteria) this;
        }

        public Criteria andSvrDealIsNull() {
            addCriterion("svr_deal is null");
            return (Criteria) this;
        }

        public Criteria andSvrDealIsNotNull() {
            addCriterion("svr_deal is not null");
            return (Criteria) this;
        }

        public Criteria andSvrDealEqualTo(String value) {
            addCriterion("svr_deal =", value, "svrDeal");
            return (Criteria) this;
        }

        public Criteria andSvrDealNotEqualTo(String value) {
            addCriterion("svr_deal <>", value, "svrDeal");
            return (Criteria) this;
        }

        public Criteria andSvrDealGreaterThan(String value) {
            addCriterion("svr_deal >", value, "svrDeal");
            return (Criteria) this;
        }

        public Criteria andSvrDealGreaterThanOrEqualTo(String value) {
            addCriterion("svr_deal >=", value, "svrDeal");
            return (Criteria) this;
        }

        public Criteria andSvrDealLessThan(String value) {
            addCriterion("svr_deal <", value, "svrDeal");
            return (Criteria) this;
        }

        public Criteria andSvrDealLessThanOrEqualTo(String value) {
            addCriterion("svr_deal <=", value, "svrDeal");
            return (Criteria) this;
        }

        public Criteria andSvrDealLike(String value) {
            addCriterion("svr_deal like", value, "svrDeal");
            return (Criteria) this;
        }

        public Criteria andSvrDealNotLike(String value) {
            addCriterion("svr_deal not like", value, "svrDeal");
            return (Criteria) this;
        }

        public Criteria andSvrDealIn(List<String> values) {
            addCriterion("svr_deal in", values, "svrDeal");
            return (Criteria) this;
        }

        public Criteria andSvrDealNotIn(List<String> values) {
            addCriterion("svr_deal not in", values, "svrDeal");
            return (Criteria) this;
        }

        public Criteria andSvrDealBetween(String value1, String value2) {
            addCriterion("svr_deal between", value1, value2, "svrDeal");
            return (Criteria) this;
        }

        public Criteria andSvrDealNotBetween(String value1, String value2) {
            addCriterion("svr_deal not between", value1, value2, "svrDeal");
            return (Criteria) this;
        }

        public Criteria andSvrResultIsNull() {
            addCriterion("svr_result is null");
            return (Criteria) this;
        }

        public Criteria andSvrResultIsNotNull() {
            addCriterion("svr_result is not null");
            return (Criteria) this;
        }

        public Criteria andSvrResultEqualTo(String value) {
            addCriterion("svr_result =", value, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultNotEqualTo(String value) {
            addCriterion("svr_result <>", value, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultGreaterThan(String value) {
            addCriterion("svr_result >", value, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultGreaterThanOrEqualTo(String value) {
            addCriterion("svr_result >=", value, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultLessThan(String value) {
            addCriterion("svr_result <", value, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultLessThanOrEqualTo(String value) {
            addCriterion("svr_result <=", value, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultLike(String value) {
            addCriterion("svr_result like", value, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultNotLike(String value) {
            addCriterion("svr_result not like", value, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultIn(List<String> values) {
            addCriterion("svr_result in", values, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultNotIn(List<String> values) {
            addCriterion("svr_result not in", values, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultBetween(String value1, String value2) {
            addCriterion("svr_result between", value1, value2, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrResultNotBetween(String value1, String value2) {
            addCriterion("svr_result not between", value1, value2, "svrResult");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyIsNull() {
            addCriterion("svr_satisfy is null");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyIsNotNull() {
            addCriterion("svr_satisfy is not null");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyEqualTo(Long value) {
            addCriterion("svr_satisfy =", value, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyNotEqualTo(Long value) {
            addCriterion("svr_satisfy <>", value, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyGreaterThan(Long value) {
            addCriterion("svr_satisfy >", value, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyGreaterThanOrEqualTo(Long value) {
            addCriterion("svr_satisfy >=", value, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyLessThan(Long value) {
            addCriterion("svr_satisfy <", value, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyLessThanOrEqualTo(Long value) {
            addCriterion("svr_satisfy <=", value, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyIn(List<Long> values) {
            addCriterion("svr_satisfy in", values, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyNotIn(List<Long> values) {
            addCriterion("svr_satisfy not in", values, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyBetween(Long value1, Long value2) {
            addCriterion("svr_satisfy between", value1, value2, "svrSatisfy");
            return (Criteria) this;
        }

        public Criteria andSvrSatisfyNotBetween(Long value1, Long value2) {
            addCriterion("svr_satisfy not between", value1, value2, "svrSatisfy");
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