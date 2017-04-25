package com.ehu.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TStoreMerchantGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TStoreMerchantGoodsExample() {
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

        public Criteria andSmiidIsNull() {
            addCriterion("smiid is null");
            return (Criteria) this;
        }

        public Criteria andSmiidIsNotNull() {
            addCriterion("smiid is not null");
            return (Criteria) this;
        }

        public Criteria andSmiidEqualTo(Integer value) {
            addCriterion("smiid =", value, "smiid");
            return (Criteria) this;
        }

        public Criteria andSmiidNotEqualTo(Integer value) {
            addCriterion("smiid <>", value, "smiid");
            return (Criteria) this;
        }

        public Criteria andSmiidGreaterThan(Integer value) {
            addCriterion("smiid >", value, "smiid");
            return (Criteria) this;
        }

        public Criteria andSmiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("smiid >=", value, "smiid");
            return (Criteria) this;
        }

        public Criteria andSmiidLessThan(Integer value) {
            addCriterion("smiid <", value, "smiid");
            return (Criteria) this;
        }

        public Criteria andSmiidLessThanOrEqualTo(Integer value) {
            addCriterion("smiid <=", value, "smiid");
            return (Criteria) this;
        }

        public Criteria andSmiidIn(List<Integer> values) {
            addCriterion("smiid in", values, "smiid");
            return (Criteria) this;
        }

        public Criteria andSmiidNotIn(List<Integer> values) {
            addCriterion("smiid not in", values, "smiid");
            return (Criteria) this;
        }

        public Criteria andSmiidBetween(Integer value1, Integer value2) {
            addCriterion("smiid between", value1, value2, "smiid");
            return (Criteria) this;
        }

        public Criteria andSmiidNotBetween(Integer value1, Integer value2) {
            addCriterion("smiid not between", value1, value2, "smiid");
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

        public Criteria andSmgDescribeIsNull() {
            addCriterion("smg_describe is null");
            return (Criteria) this;
        }

        public Criteria andSmgDescribeIsNotNull() {
            addCriterion("smg_describe is not null");
            return (Criteria) this;
        }

        public Criteria andSmgDescribeEqualTo(String value) {
            addCriterion("smg_describe =", value, "smgDescribe");
            return (Criteria) this;
        }

        public Criteria andSmgDescribeNotEqualTo(String value) {
            addCriterion("smg_describe <>", value, "smgDescribe");
            return (Criteria) this;
        }

        public Criteria andSmgDescribeGreaterThan(String value) {
            addCriterion("smg_describe >", value, "smgDescribe");
            return (Criteria) this;
        }

        public Criteria andSmgDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("smg_describe >=", value, "smgDescribe");
            return (Criteria) this;
        }

        public Criteria andSmgDescribeLessThan(String value) {
            addCriterion("smg_describe <", value, "smgDescribe");
            return (Criteria) this;
        }

        public Criteria andSmgDescribeLessThanOrEqualTo(String value) {
            addCriterion("smg_describe <=", value, "smgDescribe");
            return (Criteria) this;
        }

        public Criteria andSmgDescribeLike(String value) {
            addCriterion("smg_describe like", value, "smgDescribe");
            return (Criteria) this;
        }

        public Criteria andSmgDescribeNotLike(String value) {
            addCriterion("smg_describe not like", value, "smgDescribe");
            return (Criteria) this;
        }

        public Criteria andSmgDescribeIn(List<String> values) {
            addCriterion("smg_describe in", values, "smgDescribe");
            return (Criteria) this;
        }

        public Criteria andSmgDescribeNotIn(List<String> values) {
            addCriterion("smg_describe not in", values, "smgDescribe");
            return (Criteria) this;
        }

        public Criteria andSmgDescribeBetween(String value1, String value2) {
            addCriterion("smg_describe between", value1, value2, "smgDescribe");
            return (Criteria) this;
        }

        public Criteria andSmgDescribeNotBetween(String value1, String value2) {
            addCriterion("smg_describe not between", value1, value2, "smgDescribe");
            return (Criteria) this;
        }

        public Criteria andSmgSaleCountIsNull() {
            addCriterion("smg_sale_count is null");
            return (Criteria) this;
        }

        public Criteria andSmgSaleCountIsNotNull() {
            addCriterion("smg_sale_count is not null");
            return (Criteria) this;
        }

        public Criteria andSmgSaleCountEqualTo(Integer value) {
            addCriterion("smg_sale_count =", value, "smgSaleCount");
            return (Criteria) this;
        }

        public Criteria andSmgSaleCountNotEqualTo(Integer value) {
            addCriterion("smg_sale_count <>", value, "smgSaleCount");
            return (Criteria) this;
        }

        public Criteria andSmgSaleCountGreaterThan(Integer value) {
            addCriterion("smg_sale_count >", value, "smgSaleCount");
            return (Criteria) this;
        }

        public Criteria andSmgSaleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("smg_sale_count >=", value, "smgSaleCount");
            return (Criteria) this;
        }

        public Criteria andSmgSaleCountLessThan(Integer value) {
            addCriterion("smg_sale_count <", value, "smgSaleCount");
            return (Criteria) this;
        }

        public Criteria andSmgSaleCountLessThanOrEqualTo(Integer value) {
            addCriterion("smg_sale_count <=", value, "smgSaleCount");
            return (Criteria) this;
        }

        public Criteria andSmgSaleCountIn(List<Integer> values) {
            addCriterion("smg_sale_count in", values, "smgSaleCount");
            return (Criteria) this;
        }

        public Criteria andSmgSaleCountNotIn(List<Integer> values) {
            addCriterion("smg_sale_count not in", values, "smgSaleCount");
            return (Criteria) this;
        }

        public Criteria andSmgSaleCountBetween(Integer value1, Integer value2) {
            addCriterion("smg_sale_count between", value1, value2, "smgSaleCount");
            return (Criteria) this;
        }

        public Criteria andSmgSaleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("smg_sale_count not between", value1, value2, "smgSaleCount");
            return (Criteria) this;
        }

        public Criteria andSmgPriceIsNull() {
            addCriterion("smg_price is null");
            return (Criteria) this;
        }

        public Criteria andSmgPriceIsNotNull() {
            addCriterion("smg_price is not null");
            return (Criteria) this;
        }

        public Criteria andSmgPriceEqualTo(BigDecimal value) {
            addCriterion("smg_price =", value, "smgPrice");
            return (Criteria) this;
        }

        public Criteria andSmgPriceNotEqualTo(BigDecimal value) {
            addCriterion("smg_price <>", value, "smgPrice");
            return (Criteria) this;
        }

        public Criteria andSmgPriceGreaterThan(BigDecimal value) {
            addCriterion("smg_price >", value, "smgPrice");
            return (Criteria) this;
        }

        public Criteria andSmgPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("smg_price >=", value, "smgPrice");
            return (Criteria) this;
        }

        public Criteria andSmgPriceLessThan(BigDecimal value) {
            addCriterion("smg_price <", value, "smgPrice");
            return (Criteria) this;
        }

        public Criteria andSmgPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("smg_price <=", value, "smgPrice");
            return (Criteria) this;
        }

        public Criteria andSmgPriceIn(List<BigDecimal> values) {
            addCriterion("smg_price in", values, "smgPrice");
            return (Criteria) this;
        }

        public Criteria andSmgPriceNotIn(List<BigDecimal> values) {
            addCriterion("smg_price not in", values, "smgPrice");
            return (Criteria) this;
        }

        public Criteria andSmgPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("smg_price between", value1, value2, "smgPrice");
            return (Criteria) this;
        }

        public Criteria andSmgPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("smg_price not between", value1, value2, "smgPrice");
            return (Criteria) this;
        }

        public Criteria andSmgStatusIsNull() {
            addCriterion("smg_status is null");
            return (Criteria) this;
        }

        public Criteria andSmgStatusIsNotNull() {
            addCriterion("smg_status is not null");
            return (Criteria) this;
        }

        public Criteria andSmgStatusEqualTo(Integer value) {
            addCriterion("smg_status =", value, "smgStatus");
            return (Criteria) this;
        }

        public Criteria andSmgStatusNotEqualTo(Integer value) {
            addCriterion("smg_status <>", value, "smgStatus");
            return (Criteria) this;
        }

        public Criteria andSmgStatusGreaterThan(Integer value) {
            addCriterion("smg_status >", value, "smgStatus");
            return (Criteria) this;
        }

        public Criteria andSmgStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("smg_status >=", value, "smgStatus");
            return (Criteria) this;
        }

        public Criteria andSmgStatusLessThan(Integer value) {
            addCriterion("smg_status <", value, "smgStatus");
            return (Criteria) this;
        }

        public Criteria andSmgStatusLessThanOrEqualTo(Integer value) {
            addCriterion("smg_status <=", value, "smgStatus");
            return (Criteria) this;
        }

        public Criteria andSmgStatusIn(List<Integer> values) {
            addCriterion("smg_status in", values, "smgStatus");
            return (Criteria) this;
        }

        public Criteria andSmgStatusNotIn(List<Integer> values) {
            addCriterion("smg_status not in", values, "smgStatus");
            return (Criteria) this;
        }

        public Criteria andSmgStatusBetween(Integer value1, Integer value2) {
            addCriterion("smg_status between", value1, value2, "smgStatus");
            return (Criteria) this;
        }

        public Criteria andSmgStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("smg_status not between", value1, value2, "smgStatus");
            return (Criteria) this;
        }

        public Criteria andAvgCostIsNull() {
            addCriterion("avg_cost is null");
            return (Criteria) this;
        }

        public Criteria andAvgCostIsNotNull() {
            addCriterion("avg_cost is not null");
            return (Criteria) this;
        }

        public Criteria andAvgCostEqualTo(BigDecimal value) {
            addCriterion("avg_cost =", value, "avgCost");
            return (Criteria) this;
        }

        public Criteria andAvgCostNotEqualTo(BigDecimal value) {
            addCriterion("avg_cost <>", value, "avgCost");
            return (Criteria) this;
        }

        public Criteria andAvgCostGreaterThan(BigDecimal value) {
            addCriterion("avg_cost >", value, "avgCost");
            return (Criteria) this;
        }

        public Criteria andAvgCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_cost >=", value, "avgCost");
            return (Criteria) this;
        }

        public Criteria andAvgCostLessThan(BigDecimal value) {
            addCriterion("avg_cost <", value, "avgCost");
            return (Criteria) this;
        }

        public Criteria andAvgCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_cost <=", value, "avgCost");
            return (Criteria) this;
        }

        public Criteria andAvgCostIn(List<BigDecimal> values) {
            addCriterion("avg_cost in", values, "avgCost");
            return (Criteria) this;
        }

        public Criteria andAvgCostNotIn(List<BigDecimal> values) {
            addCriterion("avg_cost not in", values, "avgCost");
            return (Criteria) this;
        }

        public Criteria andAvgCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_cost between", value1, value2, "avgCost");
            return (Criteria) this;
        }

        public Criteria andAvgCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_cost not between", value1, value2, "avgCost");
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

        public Criteria andInventoryIsNull() {
            addCriterion("inventory is null");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNotNull() {
            addCriterion("inventory is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryEqualTo(BigDecimal value) {
            addCriterion("inventory =", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotEqualTo(BigDecimal value) {
            addCriterion("inventory <>", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThan(BigDecimal value) {
            addCriterion("inventory >", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("inventory >=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThan(BigDecimal value) {
            addCriterion("inventory <", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("inventory <=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryIn(List<BigDecimal> values) {
            addCriterion("inventory in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotIn(List<BigDecimal> values) {
            addCriterion("inventory not in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inventory between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("inventory not between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("cost_price is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(BigDecimal value) {
            addCriterion("cost_price =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("cost_price <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(BigDecimal value) {
            addCriterion("cost_price >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(BigDecimal value) {
            addCriterion("cost_price <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_price <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<BigDecimal> values) {
            addCriterion("cost_price in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("cost_price not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_price not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andAmtAlarmThresholdIsNull() {
            addCriterion("amt_alarm_threshold is null");
            return (Criteria) this;
        }

        public Criteria andAmtAlarmThresholdIsNotNull() {
            addCriterion("amt_alarm_threshold is not null");
            return (Criteria) this;
        }

        public Criteria andAmtAlarmThresholdEqualTo(BigDecimal value) {
            addCriterion("amt_alarm_threshold =", value, "amtAlarmThreshold");
            return (Criteria) this;
        }

        public Criteria andAmtAlarmThresholdNotEqualTo(BigDecimal value) {
            addCriterion("amt_alarm_threshold <>", value, "amtAlarmThreshold");
            return (Criteria) this;
        }

        public Criteria andAmtAlarmThresholdGreaterThan(BigDecimal value) {
            addCriterion("amt_alarm_threshold >", value, "amtAlarmThreshold");
            return (Criteria) this;
        }

        public Criteria andAmtAlarmThresholdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amt_alarm_threshold >=", value, "amtAlarmThreshold");
            return (Criteria) this;
        }

        public Criteria andAmtAlarmThresholdLessThan(BigDecimal value) {
            addCriterion("amt_alarm_threshold <", value, "amtAlarmThreshold");
            return (Criteria) this;
        }

        public Criteria andAmtAlarmThresholdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amt_alarm_threshold <=", value, "amtAlarmThreshold");
            return (Criteria) this;
        }

        public Criteria andAmtAlarmThresholdIn(List<BigDecimal> values) {
            addCriterion("amt_alarm_threshold in", values, "amtAlarmThreshold");
            return (Criteria) this;
        }

        public Criteria andAmtAlarmThresholdNotIn(List<BigDecimal> values) {
            addCriterion("amt_alarm_threshold not in", values, "amtAlarmThreshold");
            return (Criteria) this;
        }

        public Criteria andAmtAlarmThresholdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amt_alarm_threshold between", value1, value2, "amtAlarmThreshold");
            return (Criteria) this;
        }

        public Criteria andAmtAlarmThresholdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amt_alarm_threshold not between", value1, value2, "amtAlarmThreshold");
            return (Criteria) this;
        }

        public Criteria andShelfLifeIsNull() {
            addCriterion("shelf_life is null");
            return (Criteria) this;
        }

        public Criteria andShelfLifeIsNotNull() {
            addCriterion("shelf_life is not null");
            return (Criteria) this;
        }

        public Criteria andShelfLifeEqualTo(String value) {
            addCriterion("shelf_life =", value, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeNotEqualTo(String value) {
            addCriterion("shelf_life <>", value, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeGreaterThan(String value) {
            addCriterion("shelf_life >", value, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeGreaterThanOrEqualTo(String value) {
            addCriterion("shelf_life >=", value, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeLessThan(String value) {
            addCriterion("shelf_life <", value, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeLessThanOrEqualTo(String value) {
            addCriterion("shelf_life <=", value, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeLike(String value) {
            addCriterion("shelf_life like", value, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeNotLike(String value) {
            addCriterion("shelf_life not like", value, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeIn(List<String> values) {
            addCriterion("shelf_life in", values, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeNotIn(List<String> values) {
            addCriterion("shelf_life not in", values, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeBetween(String value1, String value2) {
            addCriterion("shelf_life between", value1, value2, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andShelfLifeNotBetween(String value1, String value2) {
            addCriterion("shelf_life not between", value1, value2, "shelfLife");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Float value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Float value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Float value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Float value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Float value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Float value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Float> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Float> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Float value1, Float value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Float value1, Float value2) {
            addCriterion("priority not between", value1, value2, "priority");
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