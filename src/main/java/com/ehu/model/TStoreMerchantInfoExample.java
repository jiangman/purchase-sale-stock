package com.ehu.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TStoreMerchantInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TStoreMerchantInfoExample() {
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

        public Criteria andSmiNameIsNull() {
            addCriterion("smi_name is null");
            return (Criteria) this;
        }

        public Criteria andSmiNameIsNotNull() {
            addCriterion("smi_name is not null");
            return (Criteria) this;
        }

        public Criteria andSmiNameEqualTo(String value) {
            addCriterion("smi_name =", value, "smiName");
            return (Criteria) this;
        }

        public Criteria andSmiNameNotEqualTo(String value) {
            addCriterion("smi_name <>", value, "smiName");
            return (Criteria) this;
        }

        public Criteria andSmiNameGreaterThan(String value) {
            addCriterion("smi_name >", value, "smiName");
            return (Criteria) this;
        }

        public Criteria andSmiNameGreaterThanOrEqualTo(String value) {
            addCriterion("smi_name >=", value, "smiName");
            return (Criteria) this;
        }

        public Criteria andSmiNameLessThan(String value) {
            addCriterion("smi_name <", value, "smiName");
            return (Criteria) this;
        }

        public Criteria andSmiNameLessThanOrEqualTo(String value) {
            addCriterion("smi_name <=", value, "smiName");
            return (Criteria) this;
        }

        public Criteria andSmiNameLike(String value) {
            addCriterion("smi_name like", value, "smiName");
            return (Criteria) this;
        }

        public Criteria andSmiNameNotLike(String value) {
            addCriterion("smi_name not like", value, "smiName");
            return (Criteria) this;
        }

        public Criteria andSmiNameIn(List<String> values) {
            addCriterion("smi_name in", values, "smiName");
            return (Criteria) this;
        }

        public Criteria andSmiNameNotIn(List<String> values) {
            addCriterion("smi_name not in", values, "smiName");
            return (Criteria) this;
        }

        public Criteria andSmiNameBetween(String value1, String value2) {
            addCriterion("smi_name between", value1, value2, "smiName");
            return (Criteria) this;
        }

        public Criteria andSmiNameNotBetween(String value1, String value2) {
            addCriterion("smi_name not between", value1, value2, "smiName");
            return (Criteria) this;
        }

        public Criteria andSmiAvatarIsNull() {
            addCriterion("smi_avatar is null");
            return (Criteria) this;
        }

        public Criteria andSmiAvatarIsNotNull() {
            addCriterion("smi_avatar is not null");
            return (Criteria) this;
        }

        public Criteria andSmiAvatarEqualTo(String value) {
            addCriterion("smi_avatar =", value, "smiAvatar");
            return (Criteria) this;
        }

        public Criteria andSmiAvatarNotEqualTo(String value) {
            addCriterion("smi_avatar <>", value, "smiAvatar");
            return (Criteria) this;
        }

        public Criteria andSmiAvatarGreaterThan(String value) {
            addCriterion("smi_avatar >", value, "smiAvatar");
            return (Criteria) this;
        }

        public Criteria andSmiAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("smi_avatar >=", value, "smiAvatar");
            return (Criteria) this;
        }

        public Criteria andSmiAvatarLessThan(String value) {
            addCriterion("smi_avatar <", value, "smiAvatar");
            return (Criteria) this;
        }

        public Criteria andSmiAvatarLessThanOrEqualTo(String value) {
            addCriterion("smi_avatar <=", value, "smiAvatar");
            return (Criteria) this;
        }

        public Criteria andSmiAvatarLike(String value) {
            addCriterion("smi_avatar like", value, "smiAvatar");
            return (Criteria) this;
        }

        public Criteria andSmiAvatarNotLike(String value) {
            addCriterion("smi_avatar not like", value, "smiAvatar");
            return (Criteria) this;
        }

        public Criteria andSmiAvatarIn(List<String> values) {
            addCriterion("smi_avatar in", values, "smiAvatar");
            return (Criteria) this;
        }

        public Criteria andSmiAvatarNotIn(List<String> values) {
            addCriterion("smi_avatar not in", values, "smiAvatar");
            return (Criteria) this;
        }

        public Criteria andSmiAvatarBetween(String value1, String value2) {
            addCriterion("smi_avatar between", value1, value2, "smiAvatar");
            return (Criteria) this;
        }

        public Criteria andSmiAvatarNotBetween(String value1, String value2) {
            addCriterion("smi_avatar not between", value1, value2, "smiAvatar");
            return (Criteria) this;
        }

        public Criteria andSmiGoodsCountIsNull() {
            addCriterion("smi_goods_count is null");
            return (Criteria) this;
        }

        public Criteria andSmiGoodsCountIsNotNull() {
            addCriterion("smi_goods_count is not null");
            return (Criteria) this;
        }

        public Criteria andSmiGoodsCountEqualTo(Integer value) {
            addCriterion("smi_goods_count =", value, "smiGoodsCount");
            return (Criteria) this;
        }

        public Criteria andSmiGoodsCountNotEqualTo(Integer value) {
            addCriterion("smi_goods_count <>", value, "smiGoodsCount");
            return (Criteria) this;
        }

        public Criteria andSmiGoodsCountGreaterThan(Integer value) {
            addCriterion("smi_goods_count >", value, "smiGoodsCount");
            return (Criteria) this;
        }

        public Criteria andSmiGoodsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("smi_goods_count >=", value, "smiGoodsCount");
            return (Criteria) this;
        }

        public Criteria andSmiGoodsCountLessThan(Integer value) {
            addCriterion("smi_goods_count <", value, "smiGoodsCount");
            return (Criteria) this;
        }

        public Criteria andSmiGoodsCountLessThanOrEqualTo(Integer value) {
            addCriterion("smi_goods_count <=", value, "smiGoodsCount");
            return (Criteria) this;
        }

        public Criteria andSmiGoodsCountIn(List<Integer> values) {
            addCriterion("smi_goods_count in", values, "smiGoodsCount");
            return (Criteria) this;
        }

        public Criteria andSmiGoodsCountNotIn(List<Integer> values) {
            addCriterion("smi_goods_count not in", values, "smiGoodsCount");
            return (Criteria) this;
        }

        public Criteria andSmiGoodsCountBetween(Integer value1, Integer value2) {
            addCriterion("smi_goods_count between", value1, value2, "smiGoodsCount");
            return (Criteria) this;
        }

        public Criteria andSmiGoodsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("smi_goods_count not between", value1, value2, "smiGoodsCount");
            return (Criteria) this;
        }

        public Criteria andSmiSendUpIsNull() {
            addCriterion("smi_send_up is null");
            return (Criteria) this;
        }

        public Criteria andSmiSendUpIsNotNull() {
            addCriterion("smi_send_up is not null");
            return (Criteria) this;
        }

        public Criteria andSmiSendUpEqualTo(BigDecimal value) {
            addCriterion("smi_send_up =", value, "smiSendUp");
            return (Criteria) this;
        }

        public Criteria andSmiSendUpNotEqualTo(BigDecimal value) {
            addCriterion("smi_send_up <>", value, "smiSendUp");
            return (Criteria) this;
        }

        public Criteria andSmiSendUpGreaterThan(BigDecimal value) {
            addCriterion("smi_send_up >", value, "smiSendUp");
            return (Criteria) this;
        }

        public Criteria andSmiSendUpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("smi_send_up >=", value, "smiSendUp");
            return (Criteria) this;
        }

        public Criteria andSmiSendUpLessThan(BigDecimal value) {
            addCriterion("smi_send_up <", value, "smiSendUp");
            return (Criteria) this;
        }

        public Criteria andSmiSendUpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("smi_send_up <=", value, "smiSendUp");
            return (Criteria) this;
        }

        public Criteria andSmiSendUpIn(List<BigDecimal> values) {
            addCriterion("smi_send_up in", values, "smiSendUp");
            return (Criteria) this;
        }

        public Criteria andSmiSendUpNotIn(List<BigDecimal> values) {
            addCriterion("smi_send_up not in", values, "smiSendUp");
            return (Criteria) this;
        }

        public Criteria andSmiSendUpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("smi_send_up between", value1, value2, "smiSendUp");
            return (Criteria) this;
        }

        public Criteria andSmiSendUpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("smi_send_up not between", value1, value2, "smiSendUp");
            return (Criteria) this;
        }

        public Criteria andSmiDistributionIsNull() {
            addCriterion("smi_distribution is null");
            return (Criteria) this;
        }

        public Criteria andSmiDistributionIsNotNull() {
            addCriterion("smi_distribution is not null");
            return (Criteria) this;
        }

        public Criteria andSmiDistributionEqualTo(BigDecimal value) {
            addCriterion("smi_distribution =", value, "smiDistribution");
            return (Criteria) this;
        }

        public Criteria andSmiDistributionNotEqualTo(BigDecimal value) {
            addCriterion("smi_distribution <>", value, "smiDistribution");
            return (Criteria) this;
        }

        public Criteria andSmiDistributionGreaterThan(BigDecimal value) {
            addCriterion("smi_distribution >", value, "smiDistribution");
            return (Criteria) this;
        }

        public Criteria andSmiDistributionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("smi_distribution >=", value, "smiDistribution");
            return (Criteria) this;
        }

        public Criteria andSmiDistributionLessThan(BigDecimal value) {
            addCriterion("smi_distribution <", value, "smiDistribution");
            return (Criteria) this;
        }

        public Criteria andSmiDistributionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("smi_distribution <=", value, "smiDistribution");
            return (Criteria) this;
        }

        public Criteria andSmiDistributionIn(List<BigDecimal> values) {
            addCriterion("smi_distribution in", values, "smiDistribution");
            return (Criteria) this;
        }

        public Criteria andSmiDistributionNotIn(List<BigDecimal> values) {
            addCriterion("smi_distribution not in", values, "smiDistribution");
            return (Criteria) this;
        }

        public Criteria andSmiDistributionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("smi_distribution between", value1, value2, "smiDistribution");
            return (Criteria) this;
        }

        public Criteria andSmiDistributionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("smi_distribution not between", value1, value2, "smiDistribution");
            return (Criteria) this;
        }

        public Criteria andSmiWithFreeIsNull() {
            addCriterion("smi_with_free is null");
            return (Criteria) this;
        }

        public Criteria andSmiWithFreeIsNotNull() {
            addCriterion("smi_with_free is not null");
            return (Criteria) this;
        }

        public Criteria andSmiWithFreeEqualTo(BigDecimal value) {
            addCriterion("smi_with_free =", value, "smiWithFree");
            return (Criteria) this;
        }

        public Criteria andSmiWithFreeNotEqualTo(BigDecimal value) {
            addCriterion("smi_with_free <>", value, "smiWithFree");
            return (Criteria) this;
        }

        public Criteria andSmiWithFreeGreaterThan(BigDecimal value) {
            addCriterion("smi_with_free >", value, "smiWithFree");
            return (Criteria) this;
        }

        public Criteria andSmiWithFreeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("smi_with_free >=", value, "smiWithFree");
            return (Criteria) this;
        }

        public Criteria andSmiWithFreeLessThan(BigDecimal value) {
            addCriterion("smi_with_free <", value, "smiWithFree");
            return (Criteria) this;
        }

        public Criteria andSmiWithFreeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("smi_with_free <=", value, "smiWithFree");
            return (Criteria) this;
        }

        public Criteria andSmiWithFreeIn(List<BigDecimal> values) {
            addCriterion("smi_with_free in", values, "smiWithFree");
            return (Criteria) this;
        }

        public Criteria andSmiWithFreeNotIn(List<BigDecimal> values) {
            addCriterion("smi_with_free not in", values, "smiWithFree");
            return (Criteria) this;
        }

        public Criteria andSmiWithFreeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("smi_with_free between", value1, value2, "smiWithFree");
            return (Criteria) this;
        }

        public Criteria andSmiWithFreeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("smi_with_free not between", value1, value2, "smiWithFree");
            return (Criteria) this;
        }

        public Criteria andSmiShippingTimeIsNull() {
            addCriterion("smi_shipping_time is null");
            return (Criteria) this;
        }

        public Criteria andSmiShippingTimeIsNotNull() {
            addCriterion("smi_shipping_time is not null");
            return (Criteria) this;
        }

        public Criteria andSmiShippingTimeEqualTo(String value) {
            addCriterion("smi_shipping_time =", value, "smiShippingTime");
            return (Criteria) this;
        }

        public Criteria andSmiShippingTimeNotEqualTo(String value) {
            addCriterion("smi_shipping_time <>", value, "smiShippingTime");
            return (Criteria) this;
        }

        public Criteria andSmiShippingTimeGreaterThan(String value) {
            addCriterion("smi_shipping_time >", value, "smiShippingTime");
            return (Criteria) this;
        }

        public Criteria andSmiShippingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("smi_shipping_time >=", value, "smiShippingTime");
            return (Criteria) this;
        }

        public Criteria andSmiShippingTimeLessThan(String value) {
            addCriterion("smi_shipping_time <", value, "smiShippingTime");
            return (Criteria) this;
        }

        public Criteria andSmiShippingTimeLessThanOrEqualTo(String value) {
            addCriterion("smi_shipping_time <=", value, "smiShippingTime");
            return (Criteria) this;
        }

        public Criteria andSmiShippingTimeLike(String value) {
            addCriterion("smi_shipping_time like", value, "smiShippingTime");
            return (Criteria) this;
        }

        public Criteria andSmiShippingTimeNotLike(String value) {
            addCriterion("smi_shipping_time not like", value, "smiShippingTime");
            return (Criteria) this;
        }

        public Criteria andSmiShippingTimeIn(List<String> values) {
            addCriterion("smi_shipping_time in", values, "smiShippingTime");
            return (Criteria) this;
        }

        public Criteria andSmiShippingTimeNotIn(List<String> values) {
            addCriterion("smi_shipping_time not in", values, "smiShippingTime");
            return (Criteria) this;
        }

        public Criteria andSmiShippingTimeBetween(String value1, String value2) {
            addCriterion("smi_shipping_time between", value1, value2, "smiShippingTime");
            return (Criteria) this;
        }

        public Criteria andSmiShippingTimeNotBetween(String value1, String value2) {
            addCriterion("smi_shipping_time not between", value1, value2, "smiShippingTime");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId1IsNull() {
            addCriterion("smi_show_goods_id1 is null");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId1IsNotNull() {
            addCriterion("smi_show_goods_id1 is not null");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId1EqualTo(Integer value) {
            addCriterion("smi_show_goods_id1 =", value, "smiShowGoodsId1");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId1NotEqualTo(Integer value) {
            addCriterion("smi_show_goods_id1 <>", value, "smiShowGoodsId1");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId1GreaterThan(Integer value) {
            addCriterion("smi_show_goods_id1 >", value, "smiShowGoodsId1");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId1GreaterThanOrEqualTo(Integer value) {
            addCriterion("smi_show_goods_id1 >=", value, "smiShowGoodsId1");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId1LessThan(Integer value) {
            addCriterion("smi_show_goods_id1 <", value, "smiShowGoodsId1");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId1LessThanOrEqualTo(Integer value) {
            addCriterion("smi_show_goods_id1 <=", value, "smiShowGoodsId1");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId1In(List<Integer> values) {
            addCriterion("smi_show_goods_id1 in", values, "smiShowGoodsId1");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId1NotIn(List<Integer> values) {
            addCriterion("smi_show_goods_id1 not in", values, "smiShowGoodsId1");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId1Between(Integer value1, Integer value2) {
            addCriterion("smi_show_goods_id1 between", value1, value2, "smiShowGoodsId1");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId1NotBetween(Integer value1, Integer value2) {
            addCriterion("smi_show_goods_id1 not between", value1, value2, "smiShowGoodsId1");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId2IsNull() {
            addCriterion("smi_show_goods_id2 is null");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId2IsNotNull() {
            addCriterion("smi_show_goods_id2 is not null");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId2EqualTo(Integer value) {
            addCriterion("smi_show_goods_id2 =", value, "smiShowGoodsId2");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId2NotEqualTo(Integer value) {
            addCriterion("smi_show_goods_id2 <>", value, "smiShowGoodsId2");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId2GreaterThan(Integer value) {
            addCriterion("smi_show_goods_id2 >", value, "smiShowGoodsId2");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("smi_show_goods_id2 >=", value, "smiShowGoodsId2");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId2LessThan(Integer value) {
            addCriterion("smi_show_goods_id2 <", value, "smiShowGoodsId2");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId2LessThanOrEqualTo(Integer value) {
            addCriterion("smi_show_goods_id2 <=", value, "smiShowGoodsId2");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId2In(List<Integer> values) {
            addCriterion("smi_show_goods_id2 in", values, "smiShowGoodsId2");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId2NotIn(List<Integer> values) {
            addCriterion("smi_show_goods_id2 not in", values, "smiShowGoodsId2");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId2Between(Integer value1, Integer value2) {
            addCriterion("smi_show_goods_id2 between", value1, value2, "smiShowGoodsId2");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId2NotBetween(Integer value1, Integer value2) {
            addCriterion("smi_show_goods_id2 not between", value1, value2, "smiShowGoodsId2");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId3IsNull() {
            addCriterion("smi_show_goods_id3 is null");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId3IsNotNull() {
            addCriterion("smi_show_goods_id3 is not null");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId3EqualTo(Integer value) {
            addCriterion("smi_show_goods_id3 =", value, "smiShowGoodsId3");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId3NotEqualTo(Integer value) {
            addCriterion("smi_show_goods_id3 <>", value, "smiShowGoodsId3");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId3GreaterThan(Integer value) {
            addCriterion("smi_show_goods_id3 >", value, "smiShowGoodsId3");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId3GreaterThanOrEqualTo(Integer value) {
            addCriterion("smi_show_goods_id3 >=", value, "smiShowGoodsId3");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId3LessThan(Integer value) {
            addCriterion("smi_show_goods_id3 <", value, "smiShowGoodsId3");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId3LessThanOrEqualTo(Integer value) {
            addCriterion("smi_show_goods_id3 <=", value, "smiShowGoodsId3");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId3In(List<Integer> values) {
            addCriterion("smi_show_goods_id3 in", values, "smiShowGoodsId3");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId3NotIn(List<Integer> values) {
            addCriterion("smi_show_goods_id3 not in", values, "smiShowGoodsId3");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId3Between(Integer value1, Integer value2) {
            addCriterion("smi_show_goods_id3 between", value1, value2, "smiShowGoodsId3");
            return (Criteria) this;
        }

        public Criteria andSmiShowGoodsId3NotBetween(Integer value1, Integer value2) {
            addCriterion("smi_show_goods_id3 not between", value1, value2, "smiShowGoodsId3");
            return (Criteria) this;
        }

        public Criteria andSmiAddressIsNull() {
            addCriterion("smi_address is null");
            return (Criteria) this;
        }

        public Criteria andSmiAddressIsNotNull() {
            addCriterion("smi_address is not null");
            return (Criteria) this;
        }

        public Criteria andSmiAddressEqualTo(String value) {
            addCriterion("smi_address =", value, "smiAddress");
            return (Criteria) this;
        }

        public Criteria andSmiAddressNotEqualTo(String value) {
            addCriterion("smi_address <>", value, "smiAddress");
            return (Criteria) this;
        }

        public Criteria andSmiAddressGreaterThan(String value) {
            addCriterion("smi_address >", value, "smiAddress");
            return (Criteria) this;
        }

        public Criteria andSmiAddressGreaterThanOrEqualTo(String value) {
            addCriterion("smi_address >=", value, "smiAddress");
            return (Criteria) this;
        }

        public Criteria andSmiAddressLessThan(String value) {
            addCriterion("smi_address <", value, "smiAddress");
            return (Criteria) this;
        }

        public Criteria andSmiAddressLessThanOrEqualTo(String value) {
            addCriterion("smi_address <=", value, "smiAddress");
            return (Criteria) this;
        }

        public Criteria andSmiAddressLike(String value) {
            addCriterion("smi_address like", value, "smiAddress");
            return (Criteria) this;
        }

        public Criteria andSmiAddressNotLike(String value) {
            addCriterion("smi_address not like", value, "smiAddress");
            return (Criteria) this;
        }

        public Criteria andSmiAddressIn(List<String> values) {
            addCriterion("smi_address in", values, "smiAddress");
            return (Criteria) this;
        }

        public Criteria andSmiAddressNotIn(List<String> values) {
            addCriterion("smi_address not in", values, "smiAddress");
            return (Criteria) this;
        }

        public Criteria andSmiAddressBetween(String value1, String value2) {
            addCriterion("smi_address between", value1, value2, "smiAddress");
            return (Criteria) this;
        }

        public Criteria andSmiAddressNotBetween(String value1, String value2) {
            addCriterion("smi_address not between", value1, value2, "smiAddress");
            return (Criteria) this;
        }

        public Criteria andSmiPhoneIsNull() {
            addCriterion("smi_phone is null");
            return (Criteria) this;
        }

        public Criteria andSmiPhoneIsNotNull() {
            addCriterion("smi_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSmiPhoneEqualTo(String value) {
            addCriterion("smi_phone =", value, "smiPhone");
            return (Criteria) this;
        }

        public Criteria andSmiPhoneNotEqualTo(String value) {
            addCriterion("smi_phone <>", value, "smiPhone");
            return (Criteria) this;
        }

        public Criteria andSmiPhoneGreaterThan(String value) {
            addCriterion("smi_phone >", value, "smiPhone");
            return (Criteria) this;
        }

        public Criteria andSmiPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("smi_phone >=", value, "smiPhone");
            return (Criteria) this;
        }

        public Criteria andSmiPhoneLessThan(String value) {
            addCriterion("smi_phone <", value, "smiPhone");
            return (Criteria) this;
        }

        public Criteria andSmiPhoneLessThanOrEqualTo(String value) {
            addCriterion("smi_phone <=", value, "smiPhone");
            return (Criteria) this;
        }

        public Criteria andSmiPhoneLike(String value) {
            addCriterion("smi_phone like", value, "smiPhone");
            return (Criteria) this;
        }

        public Criteria andSmiPhoneNotLike(String value) {
            addCriterion("smi_phone not like", value, "smiPhone");
            return (Criteria) this;
        }

        public Criteria andSmiPhoneIn(List<String> values) {
            addCriterion("smi_phone in", values, "smiPhone");
            return (Criteria) this;
        }

        public Criteria andSmiPhoneNotIn(List<String> values) {
            addCriterion("smi_phone not in", values, "smiPhone");
            return (Criteria) this;
        }

        public Criteria andSmiPhoneBetween(String value1, String value2) {
            addCriterion("smi_phone between", value1, value2, "smiPhone");
            return (Criteria) this;
        }

        public Criteria andSmiPhoneNotBetween(String value1, String value2) {
            addCriterion("smi_phone not between", value1, value2, "smiPhone");
            return (Criteria) this;
        }

        public Criteria andSmiNoticeIsNull() {
            addCriterion("smi_notice is null");
            return (Criteria) this;
        }

        public Criteria andSmiNoticeIsNotNull() {
            addCriterion("smi_notice is not null");
            return (Criteria) this;
        }

        public Criteria andSmiNoticeEqualTo(String value) {
            addCriterion("smi_notice =", value, "smiNotice");
            return (Criteria) this;
        }

        public Criteria andSmiNoticeNotEqualTo(String value) {
            addCriterion("smi_notice <>", value, "smiNotice");
            return (Criteria) this;
        }

        public Criteria andSmiNoticeGreaterThan(String value) {
            addCriterion("smi_notice >", value, "smiNotice");
            return (Criteria) this;
        }

        public Criteria andSmiNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("smi_notice >=", value, "smiNotice");
            return (Criteria) this;
        }

        public Criteria andSmiNoticeLessThan(String value) {
            addCriterion("smi_notice <", value, "smiNotice");
            return (Criteria) this;
        }

        public Criteria andSmiNoticeLessThanOrEqualTo(String value) {
            addCriterion("smi_notice <=", value, "smiNotice");
            return (Criteria) this;
        }

        public Criteria andSmiNoticeLike(String value) {
            addCriterion("smi_notice like", value, "smiNotice");
            return (Criteria) this;
        }

        public Criteria andSmiNoticeNotLike(String value) {
            addCriterion("smi_notice not like", value, "smiNotice");
            return (Criteria) this;
        }

        public Criteria andSmiNoticeIn(List<String> values) {
            addCriterion("smi_notice in", values, "smiNotice");
            return (Criteria) this;
        }

        public Criteria andSmiNoticeNotIn(List<String> values) {
            addCriterion("smi_notice not in", values, "smiNotice");
            return (Criteria) this;
        }

        public Criteria andSmiNoticeBetween(String value1, String value2) {
            addCriterion("smi_notice between", value1, value2, "smiNotice");
            return (Criteria) this;
        }

        public Criteria andSmiNoticeNotBetween(String value1, String value2) {
            addCriterion("smi_notice not between", value1, value2, "smiNotice");
            return (Criteria) this;
        }

        public Criteria andSmiLongitudeIsNull() {
            addCriterion("smi_longitude is null");
            return (Criteria) this;
        }

        public Criteria andSmiLongitudeIsNotNull() {
            addCriterion("smi_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andSmiLongitudeEqualTo(Double value) {
            addCriterion("smi_longitude =", value, "smiLongitude");
            return (Criteria) this;
        }

        public Criteria andSmiLongitudeNotEqualTo(Double value) {
            addCriterion("smi_longitude <>", value, "smiLongitude");
            return (Criteria) this;
        }

        public Criteria andSmiLongitudeGreaterThan(Double value) {
            addCriterion("smi_longitude >", value, "smiLongitude");
            return (Criteria) this;
        }

        public Criteria andSmiLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("smi_longitude >=", value, "smiLongitude");
            return (Criteria) this;
        }

        public Criteria andSmiLongitudeLessThan(Double value) {
            addCriterion("smi_longitude <", value, "smiLongitude");
            return (Criteria) this;
        }

        public Criteria andSmiLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("smi_longitude <=", value, "smiLongitude");
            return (Criteria) this;
        }

        public Criteria andSmiLongitudeIn(List<Double> values) {
            addCriterion("smi_longitude in", values, "smiLongitude");
            return (Criteria) this;
        }

        public Criteria andSmiLongitudeNotIn(List<Double> values) {
            addCriterion("smi_longitude not in", values, "smiLongitude");
            return (Criteria) this;
        }

        public Criteria andSmiLongitudeBetween(Double value1, Double value2) {
            addCriterion("smi_longitude between", value1, value2, "smiLongitude");
            return (Criteria) this;
        }

        public Criteria andSmiLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("smi_longitude not between", value1, value2, "smiLongitude");
            return (Criteria) this;
        }

        public Criteria andSmiLatitudeIsNull() {
            addCriterion("smi_latitude is null");
            return (Criteria) this;
        }

        public Criteria andSmiLatitudeIsNotNull() {
            addCriterion("smi_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andSmiLatitudeEqualTo(Double value) {
            addCriterion("smi_latitude =", value, "smiLatitude");
            return (Criteria) this;
        }

        public Criteria andSmiLatitudeNotEqualTo(Double value) {
            addCriterion("smi_latitude <>", value, "smiLatitude");
            return (Criteria) this;
        }

        public Criteria andSmiLatitudeGreaterThan(Double value) {
            addCriterion("smi_latitude >", value, "smiLatitude");
            return (Criteria) this;
        }

        public Criteria andSmiLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("smi_latitude >=", value, "smiLatitude");
            return (Criteria) this;
        }

        public Criteria andSmiLatitudeLessThan(Double value) {
            addCriterion("smi_latitude <", value, "smiLatitude");
            return (Criteria) this;
        }

        public Criteria andSmiLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("smi_latitude <=", value, "smiLatitude");
            return (Criteria) this;
        }

        public Criteria andSmiLatitudeIn(List<Double> values) {
            addCriterion("smi_latitude in", values, "smiLatitude");
            return (Criteria) this;
        }

        public Criteria andSmiLatitudeNotIn(List<Double> values) {
            addCriterion("smi_latitude not in", values, "smiLatitude");
            return (Criteria) this;
        }

        public Criteria andSmiLatitudeBetween(Double value1, Double value2) {
            addCriterion("smi_latitude between", value1, value2, "smiLatitude");
            return (Criteria) this;
        }

        public Criteria andSmiLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("smi_latitude not between", value1, value2, "smiLatitude");
            return (Criteria) this;
        }

        public Criteria andSmiStatusIsNull() {
            addCriterion("smi_status is null");
            return (Criteria) this;
        }

        public Criteria andSmiStatusIsNotNull() {
            addCriterion("smi_status is not null");
            return (Criteria) this;
        }

        public Criteria andSmiStatusEqualTo(Integer value) {
            addCriterion("smi_status =", value, "smiStatus");
            return (Criteria) this;
        }

        public Criteria andSmiStatusNotEqualTo(Integer value) {
            addCriterion("smi_status <>", value, "smiStatus");
            return (Criteria) this;
        }

        public Criteria andSmiStatusGreaterThan(Integer value) {
            addCriterion("smi_status >", value, "smiStatus");
            return (Criteria) this;
        }

        public Criteria andSmiStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("smi_status >=", value, "smiStatus");
            return (Criteria) this;
        }

        public Criteria andSmiStatusLessThan(Integer value) {
            addCriterion("smi_status <", value, "smiStatus");
            return (Criteria) this;
        }

        public Criteria andSmiStatusLessThanOrEqualTo(Integer value) {
            addCriterion("smi_status <=", value, "smiStatus");
            return (Criteria) this;
        }

        public Criteria andSmiStatusIn(List<Integer> values) {
            addCriterion("smi_status in", values, "smiStatus");
            return (Criteria) this;
        }

        public Criteria andSmiStatusNotIn(List<Integer> values) {
            addCriterion("smi_status not in", values, "smiStatus");
            return (Criteria) this;
        }

        public Criteria andSmiStatusBetween(Integer value1, Integer value2) {
            addCriterion("smi_status between", value1, value2, "smiStatus");
            return (Criteria) this;
        }

        public Criteria andSmiStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("smi_status not between", value1, value2, "smiStatus");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountIsNull() {
            addCriterion("alipay_account is null");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountIsNotNull() {
            addCriterion("alipay_account is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountEqualTo(String value) {
            addCriterion("alipay_account =", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotEqualTo(String value) {
            addCriterion("alipay_account <>", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountGreaterThan(String value) {
            addCriterion("alipay_account >", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountGreaterThanOrEqualTo(String value) {
            addCriterion("alipay_account >=", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountLessThan(String value) {
            addCriterion("alipay_account <", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountLessThanOrEqualTo(String value) {
            addCriterion("alipay_account <=", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountLike(String value) {
            addCriterion("alipay_account like", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotLike(String value) {
            addCriterion("alipay_account not like", value, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountIn(List<String> values) {
            addCriterion("alipay_account in", values, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotIn(List<String> values) {
            addCriterion("alipay_account not in", values, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountBetween(String value1, String value2) {
            addCriterion("alipay_account between", value1, value2, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andAlipayAccountNotBetween(String value1, String value2) {
            addCriterion("alipay_account not between", value1, value2, "alipayAccount");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidIsNull() {
            addCriterion("wechat_openid is null");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidIsNotNull() {
            addCriterion("wechat_openid is not null");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidEqualTo(String value) {
            addCriterion("wechat_openid =", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidNotEqualTo(String value) {
            addCriterion("wechat_openid <>", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidGreaterThan(String value) {
            addCriterion("wechat_openid >", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_openid >=", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidLessThan(String value) {
            addCriterion("wechat_openid <", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidLessThanOrEqualTo(String value) {
            addCriterion("wechat_openid <=", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidLike(String value) {
            addCriterion("wechat_openid like", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidNotLike(String value) {
            addCriterion("wechat_openid not like", value, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidIn(List<String> values) {
            addCriterion("wechat_openid in", values, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidNotIn(List<String> values) {
            addCriterion("wechat_openid not in", values, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidBetween(String value1, String value2) {
            addCriterion("wechat_openid between", value1, value2, "wechatOpenid");
            return (Criteria) this;
        }

        public Criteria andWechatOpenidNotBetween(String value1, String value2) {
            addCriterion("wechat_openid not between", value1, value2, "wechatOpenid");
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

        public Criteria andSgoSaleCountIsNull() {
            addCriterion("sgo_sale_count is null");
            return (Criteria) this;
        }

        public Criteria andSgoSaleCountIsNotNull() {
            addCriterion("sgo_sale_count is not null");
            return (Criteria) this;
        }

        public Criteria andSgoSaleCountEqualTo(Integer value) {
            addCriterion("sgo_sale_count =", value, "sgoSaleCount");
            return (Criteria) this;
        }

        public Criteria andSgoSaleCountNotEqualTo(Integer value) {
            addCriterion("sgo_sale_count <>", value, "sgoSaleCount");
            return (Criteria) this;
        }

        public Criteria andSgoSaleCountGreaterThan(Integer value) {
            addCriterion("sgo_sale_count >", value, "sgoSaleCount");
            return (Criteria) this;
        }

        public Criteria andSgoSaleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sgo_sale_count >=", value, "sgoSaleCount");
            return (Criteria) this;
        }

        public Criteria andSgoSaleCountLessThan(Integer value) {
            addCriterion("sgo_sale_count <", value, "sgoSaleCount");
            return (Criteria) this;
        }

        public Criteria andSgoSaleCountLessThanOrEqualTo(Integer value) {
            addCriterion("sgo_sale_count <=", value, "sgoSaleCount");
            return (Criteria) this;
        }

        public Criteria andSgoSaleCountIn(List<Integer> values) {
            addCriterion("sgo_sale_count in", values, "sgoSaleCount");
            return (Criteria) this;
        }

        public Criteria andSgoSaleCountNotIn(List<Integer> values) {
            addCriterion("sgo_sale_count not in", values, "sgoSaleCount");
            return (Criteria) this;
        }

        public Criteria andSgoSaleCountBetween(Integer value1, Integer value2) {
            addCriterion("sgo_sale_count between", value1, value2, "sgoSaleCount");
            return (Criteria) this;
        }

        public Criteria andSgoSaleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sgo_sale_count not between", value1, value2, "sgoSaleCount");
            return (Criteria) this;
        }

        public Criteria andMctGuidIsNull() {
            addCriterion("mct_guid is null");
            return (Criteria) this;
        }

        public Criteria andMctGuidIsNotNull() {
            addCriterion("mct_guid is not null");
            return (Criteria) this;
        }

        public Criteria andMctGuidEqualTo(Integer value) {
            addCriterion("mct_guid =", value, "mctGuid");
            return (Criteria) this;
        }

        public Criteria andMctGuidNotEqualTo(Integer value) {
            addCriterion("mct_guid <>", value, "mctGuid");
            return (Criteria) this;
        }

        public Criteria andMctGuidGreaterThan(Integer value) {
            addCriterion("mct_guid >", value, "mctGuid");
            return (Criteria) this;
        }

        public Criteria andMctGuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mct_guid >=", value, "mctGuid");
            return (Criteria) this;
        }

        public Criteria andMctGuidLessThan(Integer value) {
            addCriterion("mct_guid <", value, "mctGuid");
            return (Criteria) this;
        }

        public Criteria andMctGuidLessThanOrEqualTo(Integer value) {
            addCriterion("mct_guid <=", value, "mctGuid");
            return (Criteria) this;
        }

        public Criteria andMctGuidIn(List<Integer> values) {
            addCriterion("mct_guid in", values, "mctGuid");
            return (Criteria) this;
        }

        public Criteria andMctGuidNotIn(List<Integer> values) {
            addCriterion("mct_guid not in", values, "mctGuid");
            return (Criteria) this;
        }

        public Criteria andMctGuidBetween(Integer value1, Integer value2) {
            addCriterion("mct_guid between", value1, value2, "mctGuid");
            return (Criteria) this;
        }

        public Criteria andMctGuidNotBetween(Integer value1, Integer value2) {
            addCriterion("mct_guid not between", value1, value2, "mctGuid");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNull() {
            addCriterion("invite_code is null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIsNotNull() {
            addCriterion("invite_code is not null");
            return (Criteria) this;
        }

        public Criteria andInviteCodeEqualTo(Integer value) {
            addCriterion("invite_code =", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotEqualTo(Integer value) {
            addCriterion("invite_code <>", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThan(Integer value) {
            addCriterion("invite_code >", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("invite_code >=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThan(Integer value) {
            addCriterion("invite_code <", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeLessThanOrEqualTo(Integer value) {
            addCriterion("invite_code <=", value, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeIn(List<Integer> values) {
            addCriterion("invite_code in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotIn(List<Integer> values) {
            addCriterion("invite_code not in", values, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeBetween(Integer value1, Integer value2) {
            addCriterion("invite_code between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andInviteCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("invite_code not between", value1, value2, "inviteCode");
            return (Criteria) this;
        }

        public Criteria andIsalongstreetIsNull() {
            addCriterion("isAlongStreet is null");
            return (Criteria) this;
        }

        public Criteria andIsalongstreetIsNotNull() {
            addCriterion("isAlongStreet is not null");
            return (Criteria) this;
        }

        public Criteria andIsalongstreetEqualTo(String value) {
            addCriterion("isAlongStreet =", value, "isalongstreet");
            return (Criteria) this;
        }

        public Criteria andIsalongstreetNotEqualTo(String value) {
            addCriterion("isAlongStreet <>", value, "isalongstreet");
            return (Criteria) this;
        }

        public Criteria andIsalongstreetGreaterThan(String value) {
            addCriterion("isAlongStreet >", value, "isalongstreet");
            return (Criteria) this;
        }

        public Criteria andIsalongstreetGreaterThanOrEqualTo(String value) {
            addCriterion("isAlongStreet >=", value, "isalongstreet");
            return (Criteria) this;
        }

        public Criteria andIsalongstreetLessThan(String value) {
            addCriterion("isAlongStreet <", value, "isalongstreet");
            return (Criteria) this;
        }

        public Criteria andIsalongstreetLessThanOrEqualTo(String value) {
            addCriterion("isAlongStreet <=", value, "isalongstreet");
            return (Criteria) this;
        }

        public Criteria andIsalongstreetLike(String value) {
            addCriterion("isAlongStreet like", value, "isalongstreet");
            return (Criteria) this;
        }

        public Criteria andIsalongstreetNotLike(String value) {
            addCriterion("isAlongStreet not like", value, "isalongstreet");
            return (Criteria) this;
        }

        public Criteria andIsalongstreetIn(List<String> values) {
            addCriterion("isAlongStreet in", values, "isalongstreet");
            return (Criteria) this;
        }

        public Criteria andIsalongstreetNotIn(List<String> values) {
            addCriterion("isAlongStreet not in", values, "isalongstreet");
            return (Criteria) this;
        }

        public Criteria andIsalongstreetBetween(String value1, String value2) {
            addCriterion("isAlongStreet between", value1, value2, "isalongstreet");
            return (Criteria) this;
        }

        public Criteria andIsalongstreetNotBetween(String value1, String value2) {
            addCriterion("isAlongStreet not between", value1, value2, "isalongstreet");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeIsNull() {
            addCriterion("industry_code is null");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeIsNotNull() {
            addCriterion("industry_code is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeEqualTo(String value) {
            addCriterion("industry_code =", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotEqualTo(String value) {
            addCriterion("industry_code <>", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeGreaterThan(String value) {
            addCriterion("industry_code >", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("industry_code >=", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeLessThan(String value) {
            addCriterion("industry_code <", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeLessThanOrEqualTo(String value) {
            addCriterion("industry_code <=", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeLike(String value) {
            addCriterion("industry_code like", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotLike(String value) {
            addCriterion("industry_code not like", value, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeIn(List<String> values) {
            addCriterion("industry_code in", values, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotIn(List<String> values) {
            addCriterion("industry_code not in", values, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeBetween(String value1, String value2) {
            addCriterion("industry_code between", value1, value2, "industryCode");
            return (Criteria) this;
        }

        public Criteria andIndustryCodeNotBetween(String value1, String value2) {
            addCriterion("industry_code not between", value1, value2, "industryCode");
            return (Criteria) this;
        }

        public Criteria andSmiCodeIsNull() {
            addCriterion("smi_code is null");
            return (Criteria) this;
        }

        public Criteria andSmiCodeIsNotNull() {
            addCriterion("smi_code is not null");
            return (Criteria) this;
        }

        public Criteria andSmiCodeEqualTo(String value) {
            addCriterion("smi_code =", value, "smiCode");
            return (Criteria) this;
        }

        public Criteria andSmiCodeNotEqualTo(String value) {
            addCriterion("smi_code <>", value, "smiCode");
            return (Criteria) this;
        }

        public Criteria andSmiCodeGreaterThan(String value) {
            addCriterion("smi_code >", value, "smiCode");
            return (Criteria) this;
        }

        public Criteria andSmiCodeGreaterThanOrEqualTo(String value) {
            addCriterion("smi_code >=", value, "smiCode");
            return (Criteria) this;
        }

        public Criteria andSmiCodeLessThan(String value) {
            addCriterion("smi_code <", value, "smiCode");
            return (Criteria) this;
        }

        public Criteria andSmiCodeLessThanOrEqualTo(String value) {
            addCriterion("smi_code <=", value, "smiCode");
            return (Criteria) this;
        }

        public Criteria andSmiCodeLike(String value) {
            addCriterion("smi_code like", value, "smiCode");
            return (Criteria) this;
        }

        public Criteria andSmiCodeNotLike(String value) {
            addCriterion("smi_code not like", value, "smiCode");
            return (Criteria) this;
        }

        public Criteria andSmiCodeIn(List<String> values) {
            addCriterion("smi_code in", values, "smiCode");
            return (Criteria) this;
        }

        public Criteria andSmiCodeNotIn(List<String> values) {
            addCriterion("smi_code not in", values, "smiCode");
            return (Criteria) this;
        }

        public Criteria andSmiCodeBetween(String value1, String value2) {
            addCriterion("smi_code between", value1, value2, "smiCode");
            return (Criteria) this;
        }

        public Criteria andSmiCodeNotBetween(String value1, String value2) {
            addCriterion("smi_code not between", value1, value2, "smiCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIsNull() {
            addCriterion("county_code is null");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIsNotNull() {
            addCriterion("county_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountyCodeEqualTo(String value) {
            addCriterion("county_code =", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotEqualTo(String value) {
            addCriterion("county_code <>", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeGreaterThan(String value) {
            addCriterion("county_code >", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("county_code >=", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLessThan(String value) {
            addCriterion("county_code <", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLessThanOrEqualTo(String value) {
            addCriterion("county_code <=", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeLike(String value) {
            addCriterion("county_code like", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotLike(String value) {
            addCriterion("county_code not like", value, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeIn(List<String> values) {
            addCriterion("county_code in", values, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotIn(List<String> values) {
            addCriterion("county_code not in", values, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeBetween(String value1, String value2) {
            addCriterion("county_code between", value1, value2, "countyCode");
            return (Criteria) this;
        }

        public Criteria andCountyCodeNotBetween(String value1, String value2) {
            addCriterion("county_code not between", value1, value2, "countyCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("area_code is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("area_code is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("area_code =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("area_code <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("area_code >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("area_code >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("area_code <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("area_code <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("area_code like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("area_code not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("area_code in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("area_code not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("area_code between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("area_code not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeIsNull() {
            addCriterion("merchant_code is null");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeIsNotNull() {
            addCriterion("merchant_code is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeEqualTo(String value) {
            addCriterion("merchant_code =", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeNotEqualTo(String value) {
            addCriterion("merchant_code <>", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeGreaterThan(String value) {
            addCriterion("merchant_code >", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeGreaterThanOrEqualTo(String value) {
            addCriterion("merchant_code >=", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeLessThan(String value) {
            addCriterion("merchant_code <", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeLessThanOrEqualTo(String value) {
            addCriterion("merchant_code <=", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeLike(String value) {
            addCriterion("merchant_code like", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeNotLike(String value) {
            addCriterion("merchant_code not like", value, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeIn(List<String> values) {
            addCriterion("merchant_code in", values, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeNotIn(List<String> values) {
            addCriterion("merchant_code not in", values, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeBetween(String value1, String value2) {
            addCriterion("merchant_code between", value1, value2, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andMerchantCodeNotBetween(String value1, String value2) {
            addCriterion("merchant_code not between", value1, value2, "merchantCode");
            return (Criteria) this;
        }

        public Criteria andPlanidIsNull() {
            addCriterion("planid is null");
            return (Criteria) this;
        }

        public Criteria andPlanidIsNotNull() {
            addCriterion("planid is not null");
            return (Criteria) this;
        }

        public Criteria andPlanidEqualTo(Integer value) {
            addCriterion("planid =", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotEqualTo(Integer value) {
            addCriterion("planid <>", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThan(Integer value) {
            addCriterion("planid >", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("planid >=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThan(Integer value) {
            addCriterion("planid <", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThanOrEqualTo(Integer value) {
            addCriterion("planid <=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidIn(List<Integer> values) {
            addCriterion("planid in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotIn(List<Integer> values) {
            addCriterion("planid not in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidBetween(Integer value1, Integer value2) {
            addCriterion("planid between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotBetween(Integer value1, Integer value2) {
            addCriterion("planid not between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andMctTypeIsNull() {
            addCriterion("mct_type is null");
            return (Criteria) this;
        }

        public Criteria andMctTypeIsNotNull() {
            addCriterion("mct_type is not null");
            return (Criteria) this;
        }

        public Criteria andMctTypeEqualTo(Integer value) {
            addCriterion("mct_type =", value, "mctType");
            return (Criteria) this;
        }

        public Criteria andMctTypeNotEqualTo(Integer value) {
            addCriterion("mct_type <>", value, "mctType");
            return (Criteria) this;
        }

        public Criteria andMctTypeGreaterThan(Integer value) {
            addCriterion("mct_type >", value, "mctType");
            return (Criteria) this;
        }

        public Criteria andMctTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mct_type >=", value, "mctType");
            return (Criteria) this;
        }

        public Criteria andMctTypeLessThan(Integer value) {
            addCriterion("mct_type <", value, "mctType");
            return (Criteria) this;
        }

        public Criteria andMctTypeLessThanOrEqualTo(Integer value) {
            addCriterion("mct_type <=", value, "mctType");
            return (Criteria) this;
        }

        public Criteria andMctTypeIn(List<Integer> values) {
            addCriterion("mct_type in", values, "mctType");
            return (Criteria) this;
        }

        public Criteria andMctTypeNotIn(List<Integer> values) {
            addCriterion("mct_type not in", values, "mctType");
            return (Criteria) this;
        }

        public Criteria andMctTypeBetween(Integer value1, Integer value2) {
            addCriterion("mct_type between", value1, value2, "mctType");
            return (Criteria) this;
        }

        public Criteria andMctTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("mct_type not between", value1, value2, "mctType");
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