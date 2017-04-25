package com.ehu.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBreakageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBreakageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

        public Criteria andBreakageIdIsNull() {
            addCriterion("breakage_id is null");
            return (Criteria) this;
        }

        public Criteria andBreakageIdIsNotNull() {
            addCriterion("breakage_id is not null");
            return (Criteria) this;
        }

        public Criteria andBreakageIdEqualTo(Integer value) {
            addCriterion("breakage_id =", value, "breakageId");
            return (Criteria) this;
        }

        public Criteria andBreakageIdNotEqualTo(Integer value) {
            addCriterion("breakage_id <>", value, "breakageId");
            return (Criteria) this;
        }

        public Criteria andBreakageIdGreaterThan(Integer value) {
            addCriterion("breakage_id >", value, "breakageId");
            return (Criteria) this;
        }

        public Criteria andBreakageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("breakage_id >=", value, "breakageId");
            return (Criteria) this;
        }

        public Criteria andBreakageIdLessThan(Integer value) {
            addCriterion("breakage_id <", value, "breakageId");
            return (Criteria) this;
        }

        public Criteria andBreakageIdLessThanOrEqualTo(Integer value) {
            addCriterion("breakage_id <=", value, "breakageId");
            return (Criteria) this;
        }

        public Criteria andBreakageIdIn(List<Integer> values) {
            addCriterion("breakage_id in", values, "breakageId");
            return (Criteria) this;
        }

        public Criteria andBreakageIdNotIn(List<Integer> values) {
            addCriterion("breakage_id not in", values, "breakageId");
            return (Criteria) this;
        }

        public Criteria andBreakageIdBetween(Integer value1, Integer value2) {
            addCriterion("breakage_id between", value1, value2, "breakageId");
            return (Criteria) this;
        }

        public Criteria andBreakageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("breakage_id not between", value1, value2, "breakageId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeIsNull() {
            addCriterion("person_in_charge is null");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeIsNotNull() {
            addCriterion("person_in_charge is not null");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeEqualTo(String value) {
            addCriterion("person_in_charge =", value, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeNotEqualTo(String value) {
            addCriterion("person_in_charge <>", value, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeGreaterThan(String value) {
            addCriterion("person_in_charge >", value, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeGreaterThanOrEqualTo(String value) {
            addCriterion("person_in_charge >=", value, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeLessThan(String value) {
            addCriterion("person_in_charge <", value, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeLessThanOrEqualTo(String value) {
            addCriterion("person_in_charge <=", value, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeLike(String value) {
            addCriterion("person_in_charge like", value, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeNotLike(String value) {
            addCriterion("person_in_charge not like", value, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeIn(List<String> values) {
            addCriterion("person_in_charge in", values, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeNotIn(List<String> values) {
            addCriterion("person_in_charge not in", values, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeBetween(String value1, String value2) {
            addCriterion("person_in_charge between", value1, value2, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andPersonInChargeNotBetween(String value1, String value2) {
            addCriterion("person_in_charge not between", value1, value2, "personInCharge");
            return (Criteria) this;
        }

        public Criteria andBreakagePriceIsNull() {
            addCriterion("breakage_price is null");
            return (Criteria) this;
        }

        public Criteria andBreakagePriceIsNotNull() {
            addCriterion("breakage_price is not null");
            return (Criteria) this;
        }

        public Criteria andBreakagePriceEqualTo(BigDecimal value) {
            addCriterion("breakage_price =", value, "breakagePrice");
            return (Criteria) this;
        }

        public Criteria andBreakagePriceNotEqualTo(BigDecimal value) {
            addCriterion("breakage_price <>", value, "breakagePrice");
            return (Criteria) this;
        }

        public Criteria andBreakagePriceGreaterThan(BigDecimal value) {
            addCriterion("breakage_price >", value, "breakagePrice");
            return (Criteria) this;
        }

        public Criteria andBreakagePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("breakage_price >=", value, "breakagePrice");
            return (Criteria) this;
        }

        public Criteria andBreakagePriceLessThan(BigDecimal value) {
            addCriterion("breakage_price <", value, "breakagePrice");
            return (Criteria) this;
        }

        public Criteria andBreakagePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("breakage_price <=", value, "breakagePrice");
            return (Criteria) this;
        }

        public Criteria andBreakagePriceIn(List<BigDecimal> values) {
            addCriterion("breakage_price in", values, "breakagePrice");
            return (Criteria) this;
        }

        public Criteria andBreakagePriceNotIn(List<BigDecimal> values) {
            addCriterion("breakage_price not in", values, "breakagePrice");
            return (Criteria) this;
        }

        public Criteria andBreakagePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("breakage_price between", value1, value2, "breakagePrice");
            return (Criteria) this;
        }

        public Criteria andBreakagePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("breakage_price not between", value1, value2, "breakagePrice");
            return (Criteria) this;
        }

        public Criteria andBreakageStatusIsNull() {
            addCriterion("breakage_status is null");
            return (Criteria) this;
        }

        public Criteria andBreakageStatusIsNotNull() {
            addCriterion("breakage_status is not null");
            return (Criteria) this;
        }

        public Criteria andBreakageStatusEqualTo(Integer value) {
            addCriterion("breakage_status =", value, "breakageStatus");
            return (Criteria) this;
        }

        public Criteria andBreakageStatusNotEqualTo(Integer value) {
            addCriterion("breakage_status <>", value, "breakageStatus");
            return (Criteria) this;
        }

        public Criteria andBreakageStatusGreaterThan(Integer value) {
            addCriterion("breakage_status >", value, "breakageStatus");
            return (Criteria) this;
        }

        public Criteria andBreakageStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("breakage_status >=", value, "breakageStatus");
            return (Criteria) this;
        }

        public Criteria andBreakageStatusLessThan(Integer value) {
            addCriterion("breakage_status <", value, "breakageStatus");
            return (Criteria) this;
        }

        public Criteria andBreakageStatusLessThanOrEqualTo(Integer value) {
            addCriterion("breakage_status <=", value, "breakageStatus");
            return (Criteria) this;
        }

        public Criteria andBreakageStatusIn(List<Integer> values) {
            addCriterion("breakage_status in", values, "breakageStatus");
            return (Criteria) this;
        }

        public Criteria andBreakageStatusNotIn(List<Integer> values) {
            addCriterion("breakage_status not in", values, "breakageStatus");
            return (Criteria) this;
        }

        public Criteria andBreakageStatusBetween(Integer value1, Integer value2) {
            addCriterion("breakage_status between", value1, value2, "breakageStatus");
            return (Criteria) this;
        }

        public Criteria andBreakageStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("breakage_status not between", value1, value2, "breakageStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIsNull() {
            addCriterion("verify_status is null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIsNotNull() {
            addCriterion("verify_status is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusEqualTo(Integer value) {
            addCriterion("verify_status =", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotEqualTo(Integer value) {
            addCriterion("verify_status <>", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThan(Integer value) {
            addCriterion("verify_status >", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("verify_status >=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThan(Integer value) {
            addCriterion("verify_status <", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("verify_status <=", value, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusIn(List<Integer> values) {
            addCriterion("verify_status in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotIn(List<Integer> values) {
            addCriterion("verify_status not in", values, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusBetween(Integer value1, Integer value2) {
            addCriterion("verify_status between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andVerifyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("verify_status not between", value1, value2, "verifyStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Integer value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Integer value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Integer value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Integer value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Integer> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Integer> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Integer value1, Integer value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPicEvidenceIsNull() {
            addCriterion("pic_evidence is null");
            return (Criteria) this;
        }

        public Criteria andPicEvidenceIsNotNull() {
            addCriterion("pic_evidence is not null");
            return (Criteria) this;
        }

        public Criteria andPicEvidenceEqualTo(String value) {
            addCriterion("pic_evidence =", value, "picEvidence");
            return (Criteria) this;
        }

        public Criteria andPicEvidenceNotEqualTo(String value) {
            addCriterion("pic_evidence <>", value, "picEvidence");
            return (Criteria) this;
        }

        public Criteria andPicEvidenceGreaterThan(String value) {
            addCriterion("pic_evidence >", value, "picEvidence");
            return (Criteria) this;
        }

        public Criteria andPicEvidenceGreaterThanOrEqualTo(String value) {
            addCriterion("pic_evidence >=", value, "picEvidence");
            return (Criteria) this;
        }

        public Criteria andPicEvidenceLessThan(String value) {
            addCriterion("pic_evidence <", value, "picEvidence");
            return (Criteria) this;
        }

        public Criteria andPicEvidenceLessThanOrEqualTo(String value) {
            addCriterion("pic_evidence <=", value, "picEvidence");
            return (Criteria) this;
        }

        public Criteria andPicEvidenceLike(String value) {
            addCriterion("pic_evidence like", value, "picEvidence");
            return (Criteria) this;
        }

        public Criteria andPicEvidenceNotLike(String value) {
            addCriterion("pic_evidence not like", value, "picEvidence");
            return (Criteria) this;
        }

        public Criteria andPicEvidenceIn(List<String> values) {
            addCriterion("pic_evidence in", values, "picEvidence");
            return (Criteria) this;
        }

        public Criteria andPicEvidenceNotIn(List<String> values) {
            addCriterion("pic_evidence not in", values, "picEvidence");
            return (Criteria) this;
        }

        public Criteria andPicEvidenceBetween(String value1, String value2) {
            addCriterion("pic_evidence between", value1, value2, "picEvidence");
            return (Criteria) this;
        }

        public Criteria andPicEvidenceNotBetween(String value1, String value2) {
            addCriterion("pic_evidence not between", value1, value2, "picEvidence");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
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
    }
}