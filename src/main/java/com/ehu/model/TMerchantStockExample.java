package com.ehu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMerchantStockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMerchantStockExample() {
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

        public Criteria andMerchantStockIdIsNull() {
            addCriterion("merchant_stock_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantStockIdIsNotNull() {
            addCriterion("merchant_stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantStockIdEqualTo(Integer value) {
            addCriterion("merchant_stock_id =", value, "merchantStockId");
            return (Criteria) this;
        }

        public Criteria andMerchantStockIdNotEqualTo(Integer value) {
            addCriterion("merchant_stock_id <>", value, "merchantStockId");
            return (Criteria) this;
        }

        public Criteria andMerchantStockIdGreaterThan(Integer value) {
            addCriterion("merchant_stock_id >", value, "merchantStockId");
            return (Criteria) this;
        }

        public Criteria andMerchantStockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchant_stock_id >=", value, "merchantStockId");
            return (Criteria) this;
        }

        public Criteria andMerchantStockIdLessThan(Integer value) {
            addCriterion("merchant_stock_id <", value, "merchantStockId");
            return (Criteria) this;
        }

        public Criteria andMerchantStockIdLessThanOrEqualTo(Integer value) {
            addCriterion("merchant_stock_id <=", value, "merchantStockId");
            return (Criteria) this;
        }

        public Criteria andMerchantStockIdIn(List<Integer> values) {
            addCriterion("merchant_stock_id in", values, "merchantStockId");
            return (Criteria) this;
        }

        public Criteria andMerchantStockIdNotIn(List<Integer> values) {
            addCriterion("merchant_stock_id not in", values, "merchantStockId");
            return (Criteria) this;
        }

        public Criteria andMerchantStockIdBetween(Integer value1, Integer value2) {
            addCriterion("merchant_stock_id between", value1, value2, "merchantStockId");
            return (Criteria) this;
        }

        public Criteria andMerchantStockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("merchant_stock_id not between", value1, value2, "merchantStockId");
            return (Criteria) this;
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

        public Criteria andFirstInTimeIsNull() {
            addCriterion("first_in_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstInTimeIsNotNull() {
            addCriterion("first_in_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstInTimeEqualTo(Date value) {
            addCriterion("first_in_time =", value, "firstInTime");
            return (Criteria) this;
        }

        public Criteria andFirstInTimeNotEqualTo(Date value) {
            addCriterion("first_in_time <>", value, "firstInTime");
            return (Criteria) this;
        }

        public Criteria andFirstInTimeGreaterThan(Date value) {
            addCriterion("first_in_time >", value, "firstInTime");
            return (Criteria) this;
        }

        public Criteria andFirstInTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("first_in_time >=", value, "firstInTime");
            return (Criteria) this;
        }

        public Criteria andFirstInTimeLessThan(Date value) {
            addCriterion("first_in_time <", value, "firstInTime");
            return (Criteria) this;
        }

        public Criteria andFirstInTimeLessThanOrEqualTo(Date value) {
            addCriterion("first_in_time <=", value, "firstInTime");
            return (Criteria) this;
        }

        public Criteria andFirstInTimeIn(List<Date> values) {
            addCriterion("first_in_time in", values, "firstInTime");
            return (Criteria) this;
        }

        public Criteria andFirstInTimeNotIn(List<Date> values) {
            addCriterion("first_in_time not in", values, "firstInTime");
            return (Criteria) this;
        }

        public Criteria andFirstInTimeBetween(Date value1, Date value2) {
            addCriterion("first_in_time between", value1, value2, "firstInTime");
            return (Criteria) this;
        }

        public Criteria andFirstInTimeNotBetween(Date value1, Date value2) {
            addCriterion("first_in_time not between", value1, value2, "firstInTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeIsNull() {
            addCriterion("last_out_time is null");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeIsNotNull() {
            addCriterion("last_out_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeEqualTo(Date value) {
            addCriterion("last_out_time =", value, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeNotEqualTo(Date value) {
            addCriterion("last_out_time <>", value, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeGreaterThan(Date value) {
            addCriterion("last_out_time >", value, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_out_time >=", value, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeLessThan(Date value) {
            addCriterion("last_out_time <", value, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_out_time <=", value, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeIn(List<Date> values) {
            addCriterion("last_out_time in", values, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeNotIn(List<Date> values) {
            addCriterion("last_out_time not in", values, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeBetween(Date value1, Date value2) {
            addCriterion("last_out_time between", value1, value2, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andLastOutTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_out_time not between", value1, value2, "lastOutTime");
            return (Criteria) this;
        }

        public Criteria andStockQuantityIsNull() {
            addCriterion("stock_quantity is null");
            return (Criteria) this;
        }

        public Criteria andStockQuantityIsNotNull() {
            addCriterion("stock_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andStockQuantityEqualTo(Integer value) {
            addCriterion("stock_quantity =", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityNotEqualTo(Integer value) {
            addCriterion("stock_quantity <>", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityGreaterThan(Integer value) {
            addCriterion("stock_quantity >", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_quantity >=", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityLessThan(Integer value) {
            addCriterion("stock_quantity <", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("stock_quantity <=", value, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityIn(List<Integer> values) {
            addCriterion("stock_quantity in", values, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityNotIn(List<Integer> values) {
            addCriterion("stock_quantity not in", values, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityBetween(Integer value1, Integer value2) {
            addCriterion("stock_quantity between", value1, value2, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andStockQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_quantity not between", value1, value2, "stockQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityIsNull() {
            addCriterion("send_quantity is null");
            return (Criteria) this;
        }

        public Criteria andSendQuantityIsNotNull() {
            addCriterion("send_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andSendQuantityEqualTo(Integer value) {
            addCriterion("send_quantity =", value, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityNotEqualTo(Integer value) {
            addCriterion("send_quantity <>", value, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityGreaterThan(Integer value) {
            addCriterion("send_quantity >", value, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_quantity >=", value, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityLessThan(Integer value) {
            addCriterion("send_quantity <", value, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("send_quantity <=", value, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityIn(List<Integer> values) {
            addCriterion("send_quantity in", values, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityNotIn(List<Integer> values) {
            addCriterion("send_quantity not in", values, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityBetween(Integer value1, Integer value2) {
            addCriterion("send_quantity between", value1, value2, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andSendQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("send_quantity not between", value1, value2, "sendQuantity");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNull() {
            addCriterion("merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(Integer value) {
            addCriterion("merchant_id =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(Integer value) {
            addCriterion("merchant_id <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(Integer value) {
            addCriterion("merchant_id >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchant_id >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(Integer value) {
            addCriterion("merchant_id <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(Integer value) {
            addCriterion("merchant_id <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<Integer> values) {
            addCriterion("merchant_id in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<Integer> values) {
            addCriterion("merchant_id not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(Integer value1, Integer value2) {
            addCriterion("merchant_id between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("merchant_id not between", value1, value2, "merchantId");
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