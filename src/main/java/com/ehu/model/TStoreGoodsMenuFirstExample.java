package com.ehu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TStoreGoodsMenuFirstExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TStoreGoodsMenuFirstExample() {
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

        public Criteria andSgmfidIsNull() {
            addCriterion("sgmfid is null");
            return (Criteria) this;
        }

        public Criteria andSgmfidIsNotNull() {
            addCriterion("sgmfid is not null");
            return (Criteria) this;
        }

        public Criteria andSgmfidEqualTo(Integer value) {
            addCriterion("sgmfid =", value, "sgmfid");
            return (Criteria) this;
        }

        public Criteria andSgmfidNotEqualTo(Integer value) {
            addCriterion("sgmfid <>", value, "sgmfid");
            return (Criteria) this;
        }

        public Criteria andSgmfidGreaterThan(Integer value) {
            addCriterion("sgmfid >", value, "sgmfid");
            return (Criteria) this;
        }

        public Criteria andSgmfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sgmfid >=", value, "sgmfid");
            return (Criteria) this;
        }

        public Criteria andSgmfidLessThan(Integer value) {
            addCriterion("sgmfid <", value, "sgmfid");
            return (Criteria) this;
        }

        public Criteria andSgmfidLessThanOrEqualTo(Integer value) {
            addCriterion("sgmfid <=", value, "sgmfid");
            return (Criteria) this;
        }

        public Criteria andSgmfidIn(List<Integer> values) {
            addCriterion("sgmfid in", values, "sgmfid");
            return (Criteria) this;
        }

        public Criteria andSgmfidNotIn(List<Integer> values) {
            addCriterion("sgmfid not in", values, "sgmfid");
            return (Criteria) this;
        }

        public Criteria andSgmfidBetween(Integer value1, Integer value2) {
            addCriterion("sgmfid between", value1, value2, "sgmfid");
            return (Criteria) this;
        }

        public Criteria andSgmfidNotBetween(Integer value1, Integer value2) {
            addCriterion("sgmfid not between", value1, value2, "sgmfid");
            return (Criteria) this;
        }

        public Criteria andSgmfNameIsNull() {
            addCriterion("sgmf_name is null");
            return (Criteria) this;
        }

        public Criteria andSgmfNameIsNotNull() {
            addCriterion("sgmf_name is not null");
            return (Criteria) this;
        }

        public Criteria andSgmfNameEqualTo(String value) {
            addCriterion("sgmf_name =", value, "sgmfName");
            return (Criteria) this;
        }

        public Criteria andSgmfNameNotEqualTo(String value) {
            addCriterion("sgmf_name <>", value, "sgmfName");
            return (Criteria) this;
        }

        public Criteria andSgmfNameGreaterThan(String value) {
            addCriterion("sgmf_name >", value, "sgmfName");
            return (Criteria) this;
        }

        public Criteria andSgmfNameGreaterThanOrEqualTo(String value) {
            addCriterion("sgmf_name >=", value, "sgmfName");
            return (Criteria) this;
        }

        public Criteria andSgmfNameLessThan(String value) {
            addCriterion("sgmf_name <", value, "sgmfName");
            return (Criteria) this;
        }

        public Criteria andSgmfNameLessThanOrEqualTo(String value) {
            addCriterion("sgmf_name <=", value, "sgmfName");
            return (Criteria) this;
        }

        public Criteria andSgmfNameLike(String value) {
            addCriterion("sgmf_name like", value, "sgmfName");
            return (Criteria) this;
        }

        public Criteria andSgmfNameNotLike(String value) {
            addCriterion("sgmf_name not like", value, "sgmfName");
            return (Criteria) this;
        }

        public Criteria andSgmfNameIn(List<String> values) {
            addCriterion("sgmf_name in", values, "sgmfName");
            return (Criteria) this;
        }

        public Criteria andSgmfNameNotIn(List<String> values) {
            addCriterion("sgmf_name not in", values, "sgmfName");
            return (Criteria) this;
        }

        public Criteria andSgmfNameBetween(String value1, String value2) {
            addCriterion("sgmf_name between", value1, value2, "sgmfName");
            return (Criteria) this;
        }

        public Criteria andSgmfNameNotBetween(String value1, String value2) {
            addCriterion("sgmf_name not between", value1, value2, "sgmfName");
            return (Criteria) this;
        }

        public Criteria andSgmfSortIsNull() {
            addCriterion("sgmf_sort is null");
            return (Criteria) this;
        }

        public Criteria andSgmfSortIsNotNull() {
            addCriterion("sgmf_sort is not null");
            return (Criteria) this;
        }

        public Criteria andSgmfSortEqualTo(Integer value) {
            addCriterion("sgmf_sort =", value, "sgmfSort");
            return (Criteria) this;
        }

        public Criteria andSgmfSortNotEqualTo(Integer value) {
            addCriterion("sgmf_sort <>", value, "sgmfSort");
            return (Criteria) this;
        }

        public Criteria andSgmfSortGreaterThan(Integer value) {
            addCriterion("sgmf_sort >", value, "sgmfSort");
            return (Criteria) this;
        }

        public Criteria andSgmfSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sgmf_sort >=", value, "sgmfSort");
            return (Criteria) this;
        }

        public Criteria andSgmfSortLessThan(Integer value) {
            addCriterion("sgmf_sort <", value, "sgmfSort");
            return (Criteria) this;
        }

        public Criteria andSgmfSortLessThanOrEqualTo(Integer value) {
            addCriterion("sgmf_sort <=", value, "sgmfSort");
            return (Criteria) this;
        }

        public Criteria andSgmfSortIn(List<Integer> values) {
            addCriterion("sgmf_sort in", values, "sgmfSort");
            return (Criteria) this;
        }

        public Criteria andSgmfSortNotIn(List<Integer> values) {
            addCriterion("sgmf_sort not in", values, "sgmfSort");
            return (Criteria) this;
        }

        public Criteria andSgmfSortBetween(Integer value1, Integer value2) {
            addCriterion("sgmf_sort between", value1, value2, "sgmfSort");
            return (Criteria) this;
        }

        public Criteria andSgmfSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sgmf_sort not between", value1, value2, "sgmfSort");
            return (Criteria) this;
        }

        public Criteria andSgmfTypeIsNull() {
            addCriterion("sgmf_type is null");
            return (Criteria) this;
        }

        public Criteria andSgmfTypeIsNotNull() {
            addCriterion("sgmf_type is not null");
            return (Criteria) this;
        }

        public Criteria andSgmfTypeEqualTo(Integer value) {
            addCriterion("sgmf_type =", value, "sgmfType");
            return (Criteria) this;
        }

        public Criteria andSgmfTypeNotEqualTo(Integer value) {
            addCriterion("sgmf_type <>", value, "sgmfType");
            return (Criteria) this;
        }

        public Criteria andSgmfTypeGreaterThan(Integer value) {
            addCriterion("sgmf_type >", value, "sgmfType");
            return (Criteria) this;
        }

        public Criteria andSgmfTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sgmf_type >=", value, "sgmfType");
            return (Criteria) this;
        }

        public Criteria andSgmfTypeLessThan(Integer value) {
            addCriterion("sgmf_type <", value, "sgmfType");
            return (Criteria) this;
        }

        public Criteria andSgmfTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sgmf_type <=", value, "sgmfType");
            return (Criteria) this;
        }

        public Criteria andSgmfTypeIn(List<Integer> values) {
            addCriterion("sgmf_type in", values, "sgmfType");
            return (Criteria) this;
        }

        public Criteria andSgmfTypeNotIn(List<Integer> values) {
            addCriterion("sgmf_type not in", values, "sgmfType");
            return (Criteria) this;
        }

        public Criteria andSgmfTypeBetween(Integer value1, Integer value2) {
            addCriterion("sgmf_type between", value1, value2, "sgmfType");
            return (Criteria) this;
        }

        public Criteria andSgmfTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sgmf_type not between", value1, value2, "sgmfType");
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

        public Criteria andSgmfIconIsNull() {
            addCriterion("sgmf_icon is null");
            return (Criteria) this;
        }

        public Criteria andSgmfIconIsNotNull() {
            addCriterion("sgmf_icon is not null");
            return (Criteria) this;
        }

        public Criteria andSgmfIconEqualTo(String value) {
            addCriterion("sgmf_icon =", value, "sgmfIcon");
            return (Criteria) this;
        }

        public Criteria andSgmfIconNotEqualTo(String value) {
            addCriterion("sgmf_icon <>", value, "sgmfIcon");
            return (Criteria) this;
        }

        public Criteria andSgmfIconGreaterThan(String value) {
            addCriterion("sgmf_icon >", value, "sgmfIcon");
            return (Criteria) this;
        }

        public Criteria andSgmfIconGreaterThanOrEqualTo(String value) {
            addCriterion("sgmf_icon >=", value, "sgmfIcon");
            return (Criteria) this;
        }

        public Criteria andSgmfIconLessThan(String value) {
            addCriterion("sgmf_icon <", value, "sgmfIcon");
            return (Criteria) this;
        }

        public Criteria andSgmfIconLessThanOrEqualTo(String value) {
            addCriterion("sgmf_icon <=", value, "sgmfIcon");
            return (Criteria) this;
        }

        public Criteria andSgmfIconLike(String value) {
            addCriterion("sgmf_icon like", value, "sgmfIcon");
            return (Criteria) this;
        }

        public Criteria andSgmfIconNotLike(String value) {
            addCriterion("sgmf_icon not like", value, "sgmfIcon");
            return (Criteria) this;
        }

        public Criteria andSgmfIconIn(List<String> values) {
            addCriterion("sgmf_icon in", values, "sgmfIcon");
            return (Criteria) this;
        }

        public Criteria andSgmfIconNotIn(List<String> values) {
            addCriterion("sgmf_icon not in", values, "sgmfIcon");
            return (Criteria) this;
        }

        public Criteria andSgmfIconBetween(String value1, String value2) {
            addCriterion("sgmf_icon between", value1, value2, "sgmfIcon");
            return (Criteria) this;
        }

        public Criteria andSgmfIconNotBetween(String value1, String value2) {
            addCriterion("sgmf_icon not between", value1, value2, "sgmfIcon");
            return (Criteria) this;
        }

        public Criteria andIsRedpaperUsableIsNull() {
            addCriterion("is_redpaper_usable is null");
            return (Criteria) this;
        }

        public Criteria andIsRedpaperUsableIsNotNull() {
            addCriterion("is_redpaper_usable is not null");
            return (Criteria) this;
        }

        public Criteria andIsRedpaperUsableEqualTo(Integer value) {
            addCriterion("is_redpaper_usable =", value, "isRedpaperUsable");
            return (Criteria) this;
        }

        public Criteria andIsRedpaperUsableNotEqualTo(Integer value) {
            addCriterion("is_redpaper_usable <>", value, "isRedpaperUsable");
            return (Criteria) this;
        }

        public Criteria andIsRedpaperUsableGreaterThan(Integer value) {
            addCriterion("is_redpaper_usable >", value, "isRedpaperUsable");
            return (Criteria) this;
        }

        public Criteria andIsRedpaperUsableGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_redpaper_usable >=", value, "isRedpaperUsable");
            return (Criteria) this;
        }

        public Criteria andIsRedpaperUsableLessThan(Integer value) {
            addCriterion("is_redpaper_usable <", value, "isRedpaperUsable");
            return (Criteria) this;
        }

        public Criteria andIsRedpaperUsableLessThanOrEqualTo(Integer value) {
            addCriterion("is_redpaper_usable <=", value, "isRedpaperUsable");
            return (Criteria) this;
        }

        public Criteria andIsRedpaperUsableIn(List<Integer> values) {
            addCriterion("is_redpaper_usable in", values, "isRedpaperUsable");
            return (Criteria) this;
        }

        public Criteria andIsRedpaperUsableNotIn(List<Integer> values) {
            addCriterion("is_redpaper_usable not in", values, "isRedpaperUsable");
            return (Criteria) this;
        }

        public Criteria andIsRedpaperUsableBetween(Integer value1, Integer value2) {
            addCriterion("is_redpaper_usable between", value1, value2, "isRedpaperUsable");
            return (Criteria) this;
        }

        public Criteria andIsRedpaperUsableNotBetween(Integer value1, Integer value2) {
            addCriterion("is_redpaper_usable not between", value1, value2, "isRedpaperUsable");
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