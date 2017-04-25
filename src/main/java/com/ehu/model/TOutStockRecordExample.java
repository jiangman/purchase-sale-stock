package com.ehu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TOutStockRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TOutStockRecordExample() {
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

        public Criteria andOutRecordIdIsNull() {
            addCriterion("out_record_id is null");
            return (Criteria) this;
        }

        public Criteria andOutRecordIdIsNotNull() {
            addCriterion("out_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutRecordIdEqualTo(Integer value) {
            addCriterion("out_record_id =", value, "outRecordId");
            return (Criteria) this;
        }

        public Criteria andOutRecordIdNotEqualTo(Integer value) {
            addCriterion("out_record_id <>", value, "outRecordId");
            return (Criteria) this;
        }

        public Criteria andOutRecordIdGreaterThan(Integer value) {
            addCriterion("out_record_id >", value, "outRecordId");
            return (Criteria) this;
        }

        public Criteria andOutRecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_record_id >=", value, "outRecordId");
            return (Criteria) this;
        }

        public Criteria andOutRecordIdLessThan(Integer value) {
            addCriterion("out_record_id <", value, "outRecordId");
            return (Criteria) this;
        }

        public Criteria andOutRecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("out_record_id <=", value, "outRecordId");
            return (Criteria) this;
        }

        public Criteria andOutRecordIdIn(List<Integer> values) {
            addCriterion("out_record_id in", values, "outRecordId");
            return (Criteria) this;
        }

        public Criteria andOutRecordIdNotIn(List<Integer> values) {
            addCriterion("out_record_id not in", values, "outRecordId");
            return (Criteria) this;
        }

        public Criteria andOutRecordIdBetween(Integer value1, Integer value2) {
            addCriterion("out_record_id between", value1, value2, "outRecordId");
            return (Criteria) this;
        }

        public Criteria andOutRecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("out_record_id not between", value1, value2, "outRecordId");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
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

        public Criteria andOutQuantityIsNull() {
            addCriterion("out_quantity is null");
            return (Criteria) this;
        }

        public Criteria andOutQuantityIsNotNull() {
            addCriterion("out_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andOutQuantityEqualTo(Integer value) {
            addCriterion("out_quantity =", value, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andOutQuantityNotEqualTo(Integer value) {
            addCriterion("out_quantity <>", value, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andOutQuantityGreaterThan(Integer value) {
            addCriterion("out_quantity >", value, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andOutQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_quantity >=", value, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andOutQuantityLessThan(Integer value) {
            addCriterion("out_quantity <", value, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andOutQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("out_quantity <=", value, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andOutQuantityIn(List<Integer> values) {
            addCriterion("out_quantity in", values, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andOutQuantityNotIn(List<Integer> values) {
            addCriterion("out_quantity not in", values, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andOutQuantityBetween(Integer value1, Integer value2) {
            addCriterion("out_quantity between", value1, value2, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andOutQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("out_quantity not between", value1, value2, "outQuantity");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNull() {
            addCriterion("out_time is null");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNotNull() {
            addCriterion("out_time is not null");
            return (Criteria) this;
        }

        public Criteria andOutTimeEqualTo(Date value) {
            addCriterion("out_time =", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotEqualTo(Date value) {
            addCriterion("out_time <>", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThan(Date value) {
            addCriterion("out_time >", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("out_time >=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThan(Date value) {
            addCriterion("out_time <", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThanOrEqualTo(Date value) {
            addCriterion("out_time <=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeIn(List<Date> values) {
            addCriterion("out_time in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotIn(List<Date> values) {
            addCriterion("out_time not in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeBetween(Date value1, Date value2) {
            addCriterion("out_time between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotBetween(Date value1, Date value2) {
            addCriterion("out_time not between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(Integer value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(Integer value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(Integer value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(Integer value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<Integer> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<Integer> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(Integer value1, Integer value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andBatchIsNull() {
            addCriterion("batch is null");
            return (Criteria) this;
        }

        public Criteria andBatchIsNotNull() {
            addCriterion("batch is not null");
            return (Criteria) this;
        }

        public Criteria andBatchEqualTo(String value) {
            addCriterion("batch =", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotEqualTo(String value) {
            addCriterion("batch <>", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThan(String value) {
            addCriterion("batch >", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchGreaterThanOrEqualTo(String value) {
            addCriterion("batch >=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThan(String value) {
            addCriterion("batch <", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLessThanOrEqualTo(String value) {
            addCriterion("batch <=", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchLike(String value) {
            addCriterion("batch like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotLike(String value) {
            addCriterion("batch not like", value, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchIn(List<String> values) {
            addCriterion("batch in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotIn(List<String> values) {
            addCriterion("batch not in", values, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchBetween(String value1, String value2) {
            addCriterion("batch between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andBatchNotBetween(String value1, String value2) {
            addCriterion("batch not between", value1, value2, "batch");
            return (Criteria) this;
        }

        public Criteria andProductionTimeIsNull() {
            addCriterion("production_time is null");
            return (Criteria) this;
        }

        public Criteria andProductionTimeIsNotNull() {
            addCriterion("production_time is not null");
            return (Criteria) this;
        }

        public Criteria andProductionTimeEqualTo(Date value) {
            addCriterion("production_time =", value, "productionTime");
            return (Criteria) this;
        }

        public Criteria andProductionTimeNotEqualTo(Date value) {
            addCriterion("production_time <>", value, "productionTime");
            return (Criteria) this;
        }

        public Criteria andProductionTimeGreaterThan(Date value) {
            addCriterion("production_time >", value, "productionTime");
            return (Criteria) this;
        }

        public Criteria andProductionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("production_time >=", value, "productionTime");
            return (Criteria) this;
        }

        public Criteria andProductionTimeLessThan(Date value) {
            addCriterion("production_time <", value, "productionTime");
            return (Criteria) this;
        }

        public Criteria andProductionTimeLessThanOrEqualTo(Date value) {
            addCriterion("production_time <=", value, "productionTime");
            return (Criteria) this;
        }

        public Criteria andProductionTimeIn(List<Date> values) {
            addCriterion("production_time in", values, "productionTime");
            return (Criteria) this;
        }

        public Criteria andProductionTimeNotIn(List<Date> values) {
            addCriterion("production_time not in", values, "productionTime");
            return (Criteria) this;
        }

        public Criteria andProductionTimeBetween(Date value1, Date value2) {
            addCriterion("production_time between", value1, value2, "productionTime");
            return (Criteria) this;
        }

        public Criteria andProductionTimeNotBetween(Date value1, Date value2) {
            addCriterion("production_time not between", value1, value2, "productionTime");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNull() {
            addCriterion("stock_id is null");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNotNull() {
            addCriterion("stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockIdEqualTo(Integer value) {
            addCriterion("stock_id =", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotEqualTo(Integer value) {
            addCriterion("stock_id <>", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThan(Integer value) {
            addCriterion("stock_id >", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_id >=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThan(Integer value) {
            addCriterion("stock_id <", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThanOrEqualTo(Integer value) {
            addCriterion("stock_id <=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdIn(List<Integer> values) {
            addCriterion("stock_id in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotIn(List<Integer> values) {
            addCriterion("stock_id not in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdBetween(Integer value1, Integer value2) {
            addCriterion("stock_id between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_id not between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdIsNull() {
            addCriterion("purchase_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdIsNotNull() {
            addCriterion("purchase_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdEqualTo(Integer value) {
            addCriterion("purchase_order_id =", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdNotEqualTo(Integer value) {
            addCriterion("purchase_order_id <>", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdGreaterThan(Integer value) {
            addCriterion("purchase_order_id >", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("purchase_order_id >=", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdLessThan(Integer value) {
            addCriterion("purchase_order_id <", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("purchase_order_id <=", value, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdIn(List<Integer> values) {
            addCriterion("purchase_order_id in", values, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdNotIn(List<Integer> values) {
            addCriterion("purchase_order_id not in", values, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("purchase_order_id between", value1, value2, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andPurchaseOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("purchase_order_id not between", value1, value2, "purchaseOrderId");
            return (Criteria) this;
        }

        public Criteria andOutTypeIsNull() {
            addCriterion("out_type is null");
            return (Criteria) this;
        }

        public Criteria andOutTypeIsNotNull() {
            addCriterion("out_type is not null");
            return (Criteria) this;
        }

        public Criteria andOutTypeEqualTo(Integer value) {
            addCriterion("out_type =", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeNotEqualTo(Integer value) {
            addCriterion("out_type <>", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeGreaterThan(Integer value) {
            addCriterion("out_type >", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_type >=", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeLessThan(Integer value) {
            addCriterion("out_type <", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeLessThanOrEqualTo(Integer value) {
            addCriterion("out_type <=", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeIn(List<Integer> values) {
            addCriterion("out_type in", values, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeNotIn(List<Integer> values) {
            addCriterion("out_type not in", values, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeBetween(Integer value1, Integer value2) {
            addCriterion("out_type between", value1, value2, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("out_type not between", value1, value2, "outType");
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

        public Criteria andPickerIsNull() {
            addCriterion("picker is null");
            return (Criteria) this;
        }

        public Criteria andPickerIsNotNull() {
            addCriterion("picker is not null");
            return (Criteria) this;
        }

        public Criteria andPickerEqualTo(String value) {
            addCriterion("picker =", value, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerNotEqualTo(String value) {
            addCriterion("picker <>", value, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerGreaterThan(String value) {
            addCriterion("picker >", value, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerGreaterThanOrEqualTo(String value) {
            addCriterion("picker >=", value, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerLessThan(String value) {
            addCriterion("picker <", value, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerLessThanOrEqualTo(String value) {
            addCriterion("picker <=", value, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerLike(String value) {
            addCriterion("picker like", value, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerNotLike(String value) {
            addCriterion("picker not like", value, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerIn(List<String> values) {
            addCriterion("picker in", values, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerNotIn(List<String> values) {
            addCriterion("picker not in", values, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerBetween(String value1, String value2) {
            addCriterion("picker between", value1, value2, "picker");
            return (Criteria) this;
        }

        public Criteria andPickerNotBetween(String value1, String value2) {
            addCriterion("picker not between", value1, value2, "picker");
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