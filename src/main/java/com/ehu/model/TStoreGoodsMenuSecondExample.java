package com.ehu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TStoreGoodsMenuSecondExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TStoreGoodsMenuSecondExample() {
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

        public Criteria andSgmsNameIsNull() {
            addCriterion("sgms_name is null");
            return (Criteria) this;
        }

        public Criteria andSgmsNameIsNotNull() {
            addCriterion("sgms_name is not null");
            return (Criteria) this;
        }

        public Criteria andSgmsNameEqualTo(String value) {
            addCriterion("sgms_name =", value, "sgmsName");
            return (Criteria) this;
        }

        public Criteria andSgmsNameNotEqualTo(String value) {
            addCriterion("sgms_name <>", value, "sgmsName");
            return (Criteria) this;
        }

        public Criteria andSgmsNameGreaterThan(String value) {
            addCriterion("sgms_name >", value, "sgmsName");
            return (Criteria) this;
        }

        public Criteria andSgmsNameGreaterThanOrEqualTo(String value) {
            addCriterion("sgms_name >=", value, "sgmsName");
            return (Criteria) this;
        }

        public Criteria andSgmsNameLessThan(String value) {
            addCriterion("sgms_name <", value, "sgmsName");
            return (Criteria) this;
        }

        public Criteria andSgmsNameLessThanOrEqualTo(String value) {
            addCriterion("sgms_name <=", value, "sgmsName");
            return (Criteria) this;
        }

        public Criteria andSgmsNameLike(String value) {
            addCriterion("sgms_name like", value, "sgmsName");
            return (Criteria) this;
        }

        public Criteria andSgmsNameNotLike(String value) {
            addCriterion("sgms_name not like", value, "sgmsName");
            return (Criteria) this;
        }

        public Criteria andSgmsNameIn(List<String> values) {
            addCriterion("sgms_name in", values, "sgmsName");
            return (Criteria) this;
        }

        public Criteria andSgmsNameNotIn(List<String> values) {
            addCriterion("sgms_name not in", values, "sgmsName");
            return (Criteria) this;
        }

        public Criteria andSgmsNameBetween(String value1, String value2) {
            addCriterion("sgms_name between", value1, value2, "sgmsName");
            return (Criteria) this;
        }

        public Criteria andSgmsNameNotBetween(String value1, String value2) {
            addCriterion("sgms_name not between", value1, value2, "sgmsName");
            return (Criteria) this;
        }

        public Criteria andSgmsSortIsNull() {
            addCriterion("sgms_sort is null");
            return (Criteria) this;
        }

        public Criteria andSgmsSortIsNotNull() {
            addCriterion("sgms_sort is not null");
            return (Criteria) this;
        }

        public Criteria andSgmsSortEqualTo(Integer value) {
            addCriterion("sgms_sort =", value, "sgmsSort");
            return (Criteria) this;
        }

        public Criteria andSgmsSortNotEqualTo(Integer value) {
            addCriterion("sgms_sort <>", value, "sgmsSort");
            return (Criteria) this;
        }

        public Criteria andSgmsSortGreaterThan(Integer value) {
            addCriterion("sgms_sort >", value, "sgmsSort");
            return (Criteria) this;
        }

        public Criteria andSgmsSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sgms_sort >=", value, "sgmsSort");
            return (Criteria) this;
        }

        public Criteria andSgmsSortLessThan(Integer value) {
            addCriterion("sgms_sort <", value, "sgmsSort");
            return (Criteria) this;
        }

        public Criteria andSgmsSortLessThanOrEqualTo(Integer value) {
            addCriterion("sgms_sort <=", value, "sgmsSort");
            return (Criteria) this;
        }

        public Criteria andSgmsSortIn(List<Integer> values) {
            addCriterion("sgms_sort in", values, "sgmsSort");
            return (Criteria) this;
        }

        public Criteria andSgmsSortNotIn(List<Integer> values) {
            addCriterion("sgms_sort not in", values, "sgmsSort");
            return (Criteria) this;
        }

        public Criteria andSgmsSortBetween(Integer value1, Integer value2) {
            addCriterion("sgms_sort between", value1, value2, "sgmsSort");
            return (Criteria) this;
        }

        public Criteria andSgmsSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sgms_sort not between", value1, value2, "sgmsSort");
            return (Criteria) this;
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