package com.ehu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TStoreGoodsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TStoreGoodsInfoExample() {
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

        public Criteria andSgiidIsNull() {
            addCriterion("sgiid is null");
            return (Criteria) this;
        }

        public Criteria andSgiidIsNotNull() {
            addCriterion("sgiid is not null");
            return (Criteria) this;
        }

        public Criteria andSgiidEqualTo(Integer value) {
            addCriterion("sgiid =", value, "sgiid");
            return (Criteria) this;
        }

        public Criteria andSgiidNotEqualTo(Integer value) {
            addCriterion("sgiid <>", value, "sgiid");
            return (Criteria) this;
        }

        public Criteria andSgiidGreaterThan(Integer value) {
            addCriterion("sgiid >", value, "sgiid");
            return (Criteria) this;
        }

        public Criteria andSgiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sgiid >=", value, "sgiid");
            return (Criteria) this;
        }

        public Criteria andSgiidLessThan(Integer value) {
            addCriterion("sgiid <", value, "sgiid");
            return (Criteria) this;
        }

        public Criteria andSgiidLessThanOrEqualTo(Integer value) {
            addCriterion("sgiid <=", value, "sgiid");
            return (Criteria) this;
        }

        public Criteria andSgiidIn(List<Integer> values) {
            addCriterion("sgiid in", values, "sgiid");
            return (Criteria) this;
        }

        public Criteria andSgiidNotIn(List<Integer> values) {
            addCriterion("sgiid not in", values, "sgiid");
            return (Criteria) this;
        }

        public Criteria andSgiidBetween(Integer value1, Integer value2) {
            addCriterion("sgiid between", value1, value2, "sgiid");
            return (Criteria) this;
        }

        public Criteria andSgiidNotBetween(Integer value1, Integer value2) {
            addCriterion("sgiid not between", value1, value2, "sgiid");
            return (Criteria) this;
        }

        public Criteria andSgiNameIsNull() {
            addCriterion("sgi_name is null");
            return (Criteria) this;
        }

        public Criteria andSgiNameIsNotNull() {
            addCriterion("sgi_name is not null");
            return (Criteria) this;
        }

        public Criteria andSgiNameEqualTo(String value) {
            addCriterion("sgi_name =", value, "sgiName");
            return (Criteria) this;
        }

        public Criteria andSgiNameNotEqualTo(String value) {
            addCriterion("sgi_name <>", value, "sgiName");
            return (Criteria) this;
        }

        public Criteria andSgiNameGreaterThan(String value) {
            addCriterion("sgi_name >", value, "sgiName");
            return (Criteria) this;
        }

        public Criteria andSgiNameGreaterThanOrEqualTo(String value) {
            addCriterion("sgi_name >=", value, "sgiName");
            return (Criteria) this;
        }

        public Criteria andSgiNameLessThan(String value) {
            addCriterion("sgi_name <", value, "sgiName");
            return (Criteria) this;
        }

        public Criteria andSgiNameLessThanOrEqualTo(String value) {
            addCriterion("sgi_name <=", value, "sgiName");
            return (Criteria) this;
        }

        public Criteria andSgiNameLike(String value) {
            addCriterion("sgi_name like", value, "sgiName");
            return (Criteria) this;
        }

        public Criteria andSgiNameNotLike(String value) {
            addCriterion("sgi_name not like", value, "sgiName");
            return (Criteria) this;
        }

        public Criteria andSgiNameIn(List<String> values) {
            addCriterion("sgi_name in", values, "sgiName");
            return (Criteria) this;
        }

        public Criteria andSgiNameNotIn(List<String> values) {
            addCriterion("sgi_name not in", values, "sgiName");
            return (Criteria) this;
        }

        public Criteria andSgiNameBetween(String value1, String value2) {
            addCriterion("sgi_name between", value1, value2, "sgiName");
            return (Criteria) this;
        }

        public Criteria andSgiNameNotBetween(String value1, String value2) {
            addCriterion("sgi_name not between", value1, value2, "sgiName");
            return (Criteria) this;
        }

        public Criteria andSgiStandardIsNull() {
            addCriterion("sgi_standard is null");
            return (Criteria) this;
        }

        public Criteria andSgiStandardIsNotNull() {
            addCriterion("sgi_standard is not null");
            return (Criteria) this;
        }

        public Criteria andSgiStandardEqualTo(String value) {
            addCriterion("sgi_standard =", value, "sgiStandard");
            return (Criteria) this;
        }

        public Criteria andSgiStandardNotEqualTo(String value) {
            addCriterion("sgi_standard <>", value, "sgiStandard");
            return (Criteria) this;
        }

        public Criteria andSgiStandardGreaterThan(String value) {
            addCriterion("sgi_standard >", value, "sgiStandard");
            return (Criteria) this;
        }

        public Criteria andSgiStandardGreaterThanOrEqualTo(String value) {
            addCriterion("sgi_standard >=", value, "sgiStandard");
            return (Criteria) this;
        }

        public Criteria andSgiStandardLessThan(String value) {
            addCriterion("sgi_standard <", value, "sgiStandard");
            return (Criteria) this;
        }

        public Criteria andSgiStandardLessThanOrEqualTo(String value) {
            addCriterion("sgi_standard <=", value, "sgiStandard");
            return (Criteria) this;
        }

        public Criteria andSgiStandardLike(String value) {
            addCriterion("sgi_standard like", value, "sgiStandard");
            return (Criteria) this;
        }

        public Criteria andSgiStandardNotLike(String value) {
            addCriterion("sgi_standard not like", value, "sgiStandard");
            return (Criteria) this;
        }

        public Criteria andSgiStandardIn(List<String> values) {
            addCriterion("sgi_standard in", values, "sgiStandard");
            return (Criteria) this;
        }

        public Criteria andSgiStandardNotIn(List<String> values) {
            addCriterion("sgi_standard not in", values, "sgiStandard");
            return (Criteria) this;
        }

        public Criteria andSgiStandardBetween(String value1, String value2) {
            addCriterion("sgi_standard between", value1, value2, "sgiStandard");
            return (Criteria) this;
        }

        public Criteria andSgiStandardNotBetween(String value1, String value2) {
            addCriterion("sgi_standard not between", value1, value2, "sgiStandard");
            return (Criteria) this;
        }

        public Criteria andSgiBrandIsNull() {
            addCriterion("sgi_brand is null");
            return (Criteria) this;
        }

        public Criteria andSgiBrandIsNotNull() {
            addCriterion("sgi_brand is not null");
            return (Criteria) this;
        }

        public Criteria andSgiBrandEqualTo(String value) {
            addCriterion("sgi_brand =", value, "sgiBrand");
            return (Criteria) this;
        }

        public Criteria andSgiBrandNotEqualTo(String value) {
            addCriterion("sgi_brand <>", value, "sgiBrand");
            return (Criteria) this;
        }

        public Criteria andSgiBrandGreaterThan(String value) {
            addCriterion("sgi_brand >", value, "sgiBrand");
            return (Criteria) this;
        }

        public Criteria andSgiBrandGreaterThanOrEqualTo(String value) {
            addCriterion("sgi_brand >=", value, "sgiBrand");
            return (Criteria) this;
        }

        public Criteria andSgiBrandLessThan(String value) {
            addCriterion("sgi_brand <", value, "sgiBrand");
            return (Criteria) this;
        }

        public Criteria andSgiBrandLessThanOrEqualTo(String value) {
            addCriterion("sgi_brand <=", value, "sgiBrand");
            return (Criteria) this;
        }

        public Criteria andSgiBrandLike(String value) {
            addCriterion("sgi_brand like", value, "sgiBrand");
            return (Criteria) this;
        }

        public Criteria andSgiBrandNotLike(String value) {
            addCriterion("sgi_brand not like", value, "sgiBrand");
            return (Criteria) this;
        }

        public Criteria andSgiBrandIn(List<String> values) {
            addCriterion("sgi_brand in", values, "sgiBrand");
            return (Criteria) this;
        }

        public Criteria andSgiBrandNotIn(List<String> values) {
            addCriterion("sgi_brand not in", values, "sgiBrand");
            return (Criteria) this;
        }

        public Criteria andSgiBrandBetween(String value1, String value2) {
            addCriterion("sgi_brand between", value1, value2, "sgiBrand");
            return (Criteria) this;
        }

        public Criteria andSgiBrandNotBetween(String value1, String value2) {
            addCriterion("sgi_brand not between", value1, value2, "sgiBrand");
            return (Criteria) this;
        }

        public Criteria andSgiIconIsNull() {
            addCriterion("sgi_icon is null");
            return (Criteria) this;
        }

        public Criteria andSgiIconIsNotNull() {
            addCriterion("sgi_icon is not null");
            return (Criteria) this;
        }

        public Criteria andSgiIconEqualTo(String value) {
            addCriterion("sgi_icon =", value, "sgiIcon");
            return (Criteria) this;
        }

        public Criteria andSgiIconNotEqualTo(String value) {
            addCriterion("sgi_icon <>", value, "sgiIcon");
            return (Criteria) this;
        }

        public Criteria andSgiIconGreaterThan(String value) {
            addCriterion("sgi_icon >", value, "sgiIcon");
            return (Criteria) this;
        }

        public Criteria andSgiIconGreaterThanOrEqualTo(String value) {
            addCriterion("sgi_icon >=", value, "sgiIcon");
            return (Criteria) this;
        }

        public Criteria andSgiIconLessThan(String value) {
            addCriterion("sgi_icon <", value, "sgiIcon");
            return (Criteria) this;
        }

        public Criteria andSgiIconLessThanOrEqualTo(String value) {
            addCriterion("sgi_icon <=", value, "sgiIcon");
            return (Criteria) this;
        }

        public Criteria andSgiIconLike(String value) {
            addCriterion("sgi_icon like", value, "sgiIcon");
            return (Criteria) this;
        }

        public Criteria andSgiIconNotLike(String value) {
            addCriterion("sgi_icon not like", value, "sgiIcon");
            return (Criteria) this;
        }

        public Criteria andSgiIconIn(List<String> values) {
            addCriterion("sgi_icon in", values, "sgiIcon");
            return (Criteria) this;
        }

        public Criteria andSgiIconNotIn(List<String> values) {
            addCriterion("sgi_icon not in", values, "sgiIcon");
            return (Criteria) this;
        }

        public Criteria andSgiIconBetween(String value1, String value2) {
            addCriterion("sgi_icon between", value1, value2, "sgiIcon");
            return (Criteria) this;
        }

        public Criteria andSgiIconNotBetween(String value1, String value2) {
            addCriterion("sgi_icon not between", value1, value2, "sgiIcon");
            return (Criteria) this;
        }

        public Criteria andSgiImgIsNull() {
            addCriterion("sgi_img is null");
            return (Criteria) this;
        }

        public Criteria andSgiImgIsNotNull() {
            addCriterion("sgi_img is not null");
            return (Criteria) this;
        }

        public Criteria andSgiImgEqualTo(String value) {
            addCriterion("sgi_img =", value, "sgiImg");
            return (Criteria) this;
        }

        public Criteria andSgiImgNotEqualTo(String value) {
            addCriterion("sgi_img <>", value, "sgiImg");
            return (Criteria) this;
        }

        public Criteria andSgiImgGreaterThan(String value) {
            addCriterion("sgi_img >", value, "sgiImg");
            return (Criteria) this;
        }

        public Criteria andSgiImgGreaterThanOrEqualTo(String value) {
            addCriterion("sgi_img >=", value, "sgiImg");
            return (Criteria) this;
        }

        public Criteria andSgiImgLessThan(String value) {
            addCriterion("sgi_img <", value, "sgiImg");
            return (Criteria) this;
        }

        public Criteria andSgiImgLessThanOrEqualTo(String value) {
            addCriterion("sgi_img <=", value, "sgiImg");
            return (Criteria) this;
        }

        public Criteria andSgiImgLike(String value) {
            addCriterion("sgi_img like", value, "sgiImg");
            return (Criteria) this;
        }

        public Criteria andSgiImgNotLike(String value) {
            addCriterion("sgi_img not like", value, "sgiImg");
            return (Criteria) this;
        }

        public Criteria andSgiImgIn(List<String> values) {
            addCriterion("sgi_img in", values, "sgiImg");
            return (Criteria) this;
        }

        public Criteria andSgiImgNotIn(List<String> values) {
            addCriterion("sgi_img not in", values, "sgiImg");
            return (Criteria) this;
        }

        public Criteria andSgiImgBetween(String value1, String value2) {
            addCriterion("sgi_img between", value1, value2, "sgiImg");
            return (Criteria) this;
        }

        public Criteria andSgiImgNotBetween(String value1, String value2) {
            addCriterion("sgi_img not between", value1, value2, "sgiImg");
            return (Criteria) this;
        }

        public Criteria andSgmsidIsNull() {
            addCriterion("sgmsid is null");
            return (Criteria) this;
        }

        public Criteria andSgmsidIsNotNull() {
            addCriterion("sgmsid is not null");
            return (Criteria) this;
        }

        public Criteria andSgmsidEqualTo(Integer value) {
            addCriterion("sgmsid =", value, "sgmsid");
            return (Criteria) this;
        }

        public Criteria andSgmsidNotEqualTo(Integer value) {
            addCriterion("sgmsid <>", value, "sgmsid");
            return (Criteria) this;
        }

        public Criteria andSgmsidGreaterThan(Integer value) {
            addCriterion("sgmsid >", value, "sgmsid");
            return (Criteria) this;
        }

        public Criteria andSgmsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sgmsid >=", value, "sgmsid");
            return (Criteria) this;
        }

        public Criteria andSgmsidLessThan(Integer value) {
            addCriterion("sgmsid <", value, "sgmsid");
            return (Criteria) this;
        }

        public Criteria andSgmsidLessThanOrEqualTo(Integer value) {
            addCriterion("sgmsid <=", value, "sgmsid");
            return (Criteria) this;
        }

        public Criteria andSgmsidIn(List<Integer> values) {
            addCriterion("sgmsid in", values, "sgmsid");
            return (Criteria) this;
        }

        public Criteria andSgmsidNotIn(List<Integer> values) {
            addCriterion("sgmsid not in", values, "sgmsid");
            return (Criteria) this;
        }

        public Criteria andSgmsidBetween(Integer value1, Integer value2) {
            addCriterion("sgmsid between", value1, value2, "sgmsid");
            return (Criteria) this;
        }

        public Criteria andSgmsidNotBetween(Integer value1, Integer value2) {
            addCriterion("sgmsid not between", value1, value2, "sgmsid");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
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

        public Criteria andValidFlagIsNull() {
            addCriterion("valid_flag is null");
            return (Criteria) this;
        }

        public Criteria andValidFlagIsNotNull() {
            addCriterion("valid_flag is not null");
            return (Criteria) this;
        }

        public Criteria andValidFlagEqualTo(Integer value) {
            addCriterion("valid_flag =", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotEqualTo(Integer value) {
            addCriterion("valid_flag <>", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagGreaterThan(Integer value) {
            addCriterion("valid_flag >", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid_flag >=", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagLessThan(Integer value) {
            addCriterion("valid_flag <", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagLessThanOrEqualTo(Integer value) {
            addCriterion("valid_flag <=", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagIn(List<Integer> values) {
            addCriterion("valid_flag in", values, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotIn(List<Integer> values) {
            addCriterion("valid_flag not in", values, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagBetween(Integer value1, Integer value2) {
            addCriterion("valid_flag between", value1, value2, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("valid_flag not between", value1, value2, "validFlag");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNull() {
            addCriterion("bar_code is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("bar_code =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("bar_code <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("bar_code >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bar_code >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("bar_code <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("bar_code <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("bar_code like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("bar_code not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("bar_code in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("bar_code not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("bar_code between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("bar_code not between", value1, value2, "barCode");
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