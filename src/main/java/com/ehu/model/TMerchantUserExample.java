package com.ehu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TMerchantUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMerchantUserExample() {
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

        public Criteria andGuidIsNull() {
            addCriterion("guid is null");
            return (Criteria) this;
        }

        public Criteria andGuidIsNotNull() {
            addCriterion("guid is not null");
            return (Criteria) this;
        }

        public Criteria andGuidEqualTo(Integer value) {
            addCriterion("guid =", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotEqualTo(Integer value) {
            addCriterion("guid <>", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThan(Integer value) {
            addCriterion("guid >", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("guid >=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThan(Integer value) {
            addCriterion("guid <", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidLessThanOrEqualTo(Integer value) {
            addCriterion("guid <=", value, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidIn(List<Integer> values) {
            addCriterion("guid in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotIn(List<Integer> values) {
            addCriterion("guid not in", values, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidBetween(Integer value1, Integer value2) {
            addCriterion("guid between", value1, value2, "guid");
            return (Criteria) this;
        }

        public Criteria andGuidNotBetween(Integer value1, Integer value2) {
            addCriterion("guid not between", value1, value2, "guid");
            return (Criteria) this;
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(Long value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(Long value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(Long value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(Long value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(Long value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<Long> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<Long> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(Long value1, Long value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(Long value1, Long value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNull() {
            addCriterion("pass_word is null");
            return (Criteria) this;
        }

        public Criteria andPassWordIsNotNull() {
            addCriterion("pass_word is not null");
            return (Criteria) this;
        }

        public Criteria andPassWordEqualTo(String value) {
            addCriterion("pass_word =", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotEqualTo(String value) {
            addCriterion("pass_word <>", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThan(String value) {
            addCriterion("pass_word >", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordGreaterThanOrEqualTo(String value) {
            addCriterion("pass_word >=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThan(String value) {
            addCriterion("pass_word <", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLessThanOrEqualTo(String value) {
            addCriterion("pass_word <=", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordLike(String value) {
            addCriterion("pass_word like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotLike(String value) {
            addCriterion("pass_word not like", value, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordIn(List<String> values) {
            addCriterion("pass_word in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotIn(List<String> values) {
            addCriterion("pass_word not in", values, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordBetween(String value1, String value2) {
            addCriterion("pass_word between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andPassWordNotBetween(String value1, String value2) {
            addCriterion("pass_word not between", value1, value2, "passWord");
            return (Criteria) this;
        }

        public Criteria andPushTokenIsNull() {
            addCriterion("push_token is null");
            return (Criteria) this;
        }

        public Criteria andPushTokenIsNotNull() {
            addCriterion("push_token is not null");
            return (Criteria) this;
        }

        public Criteria andPushTokenEqualTo(String value) {
            addCriterion("push_token =", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenNotEqualTo(String value) {
            addCriterion("push_token <>", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenGreaterThan(String value) {
            addCriterion("push_token >", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenGreaterThanOrEqualTo(String value) {
            addCriterion("push_token >=", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenLessThan(String value) {
            addCriterion("push_token <", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenLessThanOrEqualTo(String value) {
            addCriterion("push_token <=", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenLike(String value) {
            addCriterion("push_token like", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenNotLike(String value) {
            addCriterion("push_token not like", value, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenIn(List<String> values) {
            addCriterion("push_token in", values, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenNotIn(List<String> values) {
            addCriterion("push_token not in", values, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenBetween(String value1, String value2) {
            addCriterion("push_token between", value1, value2, "pushToken");
            return (Criteria) this;
        }

        public Criteria andPushTokenNotBetween(String value1, String value2) {
            addCriterion("push_token not between", value1, value2, "pushToken");
            return (Criteria) this;
        }

        public Criteria andTermtypIsNull() {
            addCriterion("termtyp is null");
            return (Criteria) this;
        }

        public Criteria andTermtypIsNotNull() {
            addCriterion("termtyp is not null");
            return (Criteria) this;
        }

        public Criteria andTermtypEqualTo(Integer value) {
            addCriterion("termtyp =", value, "termtyp");
            return (Criteria) this;
        }

        public Criteria andTermtypNotEqualTo(Integer value) {
            addCriterion("termtyp <>", value, "termtyp");
            return (Criteria) this;
        }

        public Criteria andTermtypGreaterThan(Integer value) {
            addCriterion("termtyp >", value, "termtyp");
            return (Criteria) this;
        }

        public Criteria andTermtypGreaterThanOrEqualTo(Integer value) {
            addCriterion("termtyp >=", value, "termtyp");
            return (Criteria) this;
        }

        public Criteria andTermtypLessThan(Integer value) {
            addCriterion("termtyp <", value, "termtyp");
            return (Criteria) this;
        }

        public Criteria andTermtypLessThanOrEqualTo(Integer value) {
            addCriterion("termtyp <=", value, "termtyp");
            return (Criteria) this;
        }

        public Criteria andTermtypIn(List<Integer> values) {
            addCriterion("termtyp in", values, "termtyp");
            return (Criteria) this;
        }

        public Criteria andTermtypNotIn(List<Integer> values) {
            addCriterion("termtyp not in", values, "termtyp");
            return (Criteria) this;
        }

        public Criteria andTermtypBetween(Integer value1, Integer value2) {
            addCriterion("termtyp between", value1, value2, "termtyp");
            return (Criteria) this;
        }

        public Criteria andTermtypNotBetween(Integer value1, Integer value2) {
            addCriterion("termtyp not between", value1, value2, "termtyp");
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

        public Criteria andSecretKeyIsNull() {
            addCriterion("secret_key is null");
            return (Criteria) this;
        }

        public Criteria andSecretKeyIsNotNull() {
            addCriterion("secret_key is not null");
            return (Criteria) this;
        }

        public Criteria andSecretKeyEqualTo(String value) {
            addCriterion("secret_key =", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyNotEqualTo(String value) {
            addCriterion("secret_key <>", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyGreaterThan(String value) {
            addCriterion("secret_key >", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyGreaterThanOrEqualTo(String value) {
            addCriterion("secret_key >=", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyLessThan(String value) {
            addCriterion("secret_key <", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyLessThanOrEqualTo(String value) {
            addCriterion("secret_key <=", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyLike(String value) {
            addCriterion("secret_key like", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyNotLike(String value) {
            addCriterion("secret_key not like", value, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyIn(List<String> values) {
            addCriterion("secret_key in", values, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyNotIn(List<String> values) {
            addCriterion("secret_key not in", values, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyBetween(String value1, String value2) {
            addCriterion("secret_key between", value1, value2, "secretKey");
            return (Criteria) this;
        }

        public Criteria andSecretKeyNotBetween(String value1, String value2) {
            addCriterion("secret_key not between", value1, value2, "secretKey");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andHxUsernameIsNull() {
            addCriterion("hx_username is null");
            return (Criteria) this;
        }

        public Criteria andHxUsernameIsNotNull() {
            addCriterion("hx_username is not null");
            return (Criteria) this;
        }

        public Criteria andHxUsernameEqualTo(String value) {
            addCriterion("hx_username =", value, "hxUsername");
            return (Criteria) this;
        }

        public Criteria andHxUsernameNotEqualTo(String value) {
            addCriterion("hx_username <>", value, "hxUsername");
            return (Criteria) this;
        }

        public Criteria andHxUsernameGreaterThan(String value) {
            addCriterion("hx_username >", value, "hxUsername");
            return (Criteria) this;
        }

        public Criteria andHxUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("hx_username >=", value, "hxUsername");
            return (Criteria) this;
        }

        public Criteria andHxUsernameLessThan(String value) {
            addCriterion("hx_username <", value, "hxUsername");
            return (Criteria) this;
        }

        public Criteria andHxUsernameLessThanOrEqualTo(String value) {
            addCriterion("hx_username <=", value, "hxUsername");
            return (Criteria) this;
        }

        public Criteria andHxUsernameLike(String value) {
            addCriterion("hx_username like", value, "hxUsername");
            return (Criteria) this;
        }

        public Criteria andHxUsernameNotLike(String value) {
            addCriterion("hx_username not like", value, "hxUsername");
            return (Criteria) this;
        }

        public Criteria andHxUsernameIn(List<String> values) {
            addCriterion("hx_username in", values, "hxUsername");
            return (Criteria) this;
        }

        public Criteria andHxUsernameNotIn(List<String> values) {
            addCriterion("hx_username not in", values, "hxUsername");
            return (Criteria) this;
        }

        public Criteria andHxUsernameBetween(String value1, String value2) {
            addCriterion("hx_username between", value1, value2, "hxUsername");
            return (Criteria) this;
        }

        public Criteria andHxUsernameNotBetween(String value1, String value2) {
            addCriterion("hx_username not between", value1, value2, "hxUsername");
            return (Criteria) this;
        }

        public Criteria andHxPasswordIsNull() {
            addCriterion("hx_password is null");
            return (Criteria) this;
        }

        public Criteria andHxPasswordIsNotNull() {
            addCriterion("hx_password is not null");
            return (Criteria) this;
        }

        public Criteria andHxPasswordEqualTo(String value) {
            addCriterion("hx_password =", value, "hxPassword");
            return (Criteria) this;
        }

        public Criteria andHxPasswordNotEqualTo(String value) {
            addCriterion("hx_password <>", value, "hxPassword");
            return (Criteria) this;
        }

        public Criteria andHxPasswordGreaterThan(String value) {
            addCriterion("hx_password >", value, "hxPassword");
            return (Criteria) this;
        }

        public Criteria andHxPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("hx_password >=", value, "hxPassword");
            return (Criteria) this;
        }

        public Criteria andHxPasswordLessThan(String value) {
            addCriterion("hx_password <", value, "hxPassword");
            return (Criteria) this;
        }

        public Criteria andHxPasswordLessThanOrEqualTo(String value) {
            addCriterion("hx_password <=", value, "hxPassword");
            return (Criteria) this;
        }

        public Criteria andHxPasswordLike(String value) {
            addCriterion("hx_password like", value, "hxPassword");
            return (Criteria) this;
        }

        public Criteria andHxPasswordNotLike(String value) {
            addCriterion("hx_password not like", value, "hxPassword");
            return (Criteria) this;
        }

        public Criteria andHxPasswordIn(List<String> values) {
            addCriterion("hx_password in", values, "hxPassword");
            return (Criteria) this;
        }

        public Criteria andHxPasswordNotIn(List<String> values) {
            addCriterion("hx_password not in", values, "hxPassword");
            return (Criteria) this;
        }

        public Criteria andHxPasswordBetween(String value1, String value2) {
            addCriterion("hx_password between", value1, value2, "hxPassword");
            return (Criteria) this;
        }

        public Criteria andHxPasswordNotBetween(String value1, String value2) {
            addCriterion("hx_password not between", value1, value2, "hxPassword");
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