package com.ehu.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TSupplierGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSupplierGoodsExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
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

        public Criteria andStandardIsNull() {
            addCriterion("standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("standard not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardValueIsNull() {
            addCriterion("standard_value is null");
            return (Criteria) this;
        }

        public Criteria andStandardValueIsNotNull() {
            addCriterion("standard_value is not null");
            return (Criteria) this;
        }

        public Criteria andStandardValueEqualTo(BigDecimal value) {
            addCriterion("standard_value =", value, "standardValue");
            return (Criteria) this;
        }

        public Criteria andStandardValueNotEqualTo(BigDecimal value) {
            addCriterion("standard_value <>", value, "standardValue");
            return (Criteria) this;
        }

        public Criteria andStandardValueGreaterThan(BigDecimal value) {
            addCriterion("standard_value >", value, "standardValue");
            return (Criteria) this;
        }

        public Criteria andStandardValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_value >=", value, "standardValue");
            return (Criteria) this;
        }

        public Criteria andStandardValueLessThan(BigDecimal value) {
            addCriterion("standard_value <", value, "standardValue");
            return (Criteria) this;
        }

        public Criteria andStandardValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("standard_value <=", value, "standardValue");
            return (Criteria) this;
        }

        public Criteria andStandardValueIn(List<BigDecimal> values) {
            addCriterion("standard_value in", values, "standardValue");
            return (Criteria) this;
        }

        public Criteria andStandardValueNotIn(List<BigDecimal> values) {
            addCriterion("standard_value not in", values, "standardValue");
            return (Criteria) this;
        }

        public Criteria andStandardValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standard_value between", value1, value2, "standardValue");
            return (Criteria) this;
        }

        public Criteria andStandardValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("standard_value not between", value1, value2, "standardValue");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityIsNull() {
            addCriterion("min_order_quantity is null");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityIsNotNull() {
            addCriterion("min_order_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityEqualTo(Integer value) {
            addCriterion("min_order_quantity =", value, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityNotEqualTo(Integer value) {
            addCriterion("min_order_quantity <>", value, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityGreaterThan(Integer value) {
            addCriterion("min_order_quantity >", value, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_order_quantity >=", value, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityLessThan(Integer value) {
            addCriterion("min_order_quantity <", value, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("min_order_quantity <=", value, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityIn(List<Integer> values) {
            addCriterion("min_order_quantity in", values, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityNotIn(List<Integer> values) {
            addCriterion("min_order_quantity not in", values, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityBetween(Integer value1, Integer value2) {
            addCriterion("min_order_quantity between", value1, value2, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andMinOrderQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("min_order_quantity not between", value1, value2, "minOrderQuantity");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("`cost_price` is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("`cost_price` is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(BigDecimal value) {
            addCriterion("`cost_price` =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("`cost_price` <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(BigDecimal value) {
            addCriterion("`cost_price` >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("`cost_price` >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(BigDecimal value) {
            addCriterion("`cost_price` <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("`cost_price` <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<BigDecimal> values) {
            addCriterion("`cost_price` in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("`cost_price` not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("`cost_price` between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("`cost_price` not between", value1, value2, "costPrice");
            return (Criteria) this;
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

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(Integer value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(Integer value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(Integer value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(Integer value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(Integer value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<Integer> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<Integer> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(Integer value1, Integer value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
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