package com.changhui.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
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

        public Criteria andCust_idIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCust_idIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCust_idEqualTo(Long value) {
            addCriterion("cust_id =", value, "cust_id");
            return (Criteria) this;
        }

        public Criteria andCust_idNotEqualTo(Long value) {
            addCriterion("cust_id <>", value, "cust_id");
            return (Criteria) this;
        }

        public Criteria andCust_idGreaterThan(Long value) {
            addCriterion("cust_id >", value, "cust_id");
            return (Criteria) this;
        }

        public Criteria andCust_idGreaterThanOrEqualTo(Long value) {
            addCriterion("cust_id >=", value, "cust_id");
            return (Criteria) this;
        }

        public Criteria andCust_idLessThan(Long value) {
            addCriterion("cust_id <", value, "cust_id");
            return (Criteria) this;
        }

        public Criteria andCust_idLessThanOrEqualTo(Long value) {
            addCriterion("cust_id <=", value, "cust_id");
            return (Criteria) this;
        }

        public Criteria andCust_idIn(List<Long> values) {
            addCriterion("cust_id in", values, "cust_id");
            return (Criteria) this;
        }

        public Criteria andCust_idNotIn(List<Long> values) {
            addCriterion("cust_id not in", values, "cust_id");
            return (Criteria) this;
        }

        public Criteria andCust_idBetween(Long value1, Long value2) {
            addCriterion("cust_id between", value1, value2, "cust_id");
            return (Criteria) this;
        }

        public Criteria andCust_idNotBetween(Long value1, Long value2) {
            addCriterion("cust_id not between", value1, value2, "cust_id");
            return (Criteria) this;
        }

        public Criteria andCust_nameIsNull() {
            addCriterion("cust_name is null");
            return (Criteria) this;
        }

        public Criteria andCust_nameIsNotNull() {
            addCriterion("cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andCust_nameEqualTo(String value) {
            addCriterion("cust_name =", value, "cust_name");
            return (Criteria) this;
        }

        public Criteria andCust_nameNotEqualTo(String value) {
            addCriterion("cust_name <>", value, "cust_name");
            return (Criteria) this;
        }

        public Criteria andCust_nameGreaterThan(String value) {
            addCriterion("cust_name >", value, "cust_name");
            return (Criteria) this;
        }

        public Criteria andCust_nameGreaterThanOrEqualTo(String value) {
            addCriterion("cust_name >=", value, "cust_name");
            return (Criteria) this;
        }

        public Criteria andCust_nameLessThan(String value) {
            addCriterion("cust_name <", value, "cust_name");
            return (Criteria) this;
        }

        public Criteria andCust_nameLessThanOrEqualTo(String value) {
            addCriterion("cust_name <=", value, "cust_name");
            return (Criteria) this;
        }

        public Criteria andCust_nameLike(String value) {
            addCriterion("cust_name like", value, "cust_name");
            return (Criteria) this;
        }

        public Criteria andCust_nameNotLike(String value) {
            addCriterion("cust_name not like", value, "cust_name");
            return (Criteria) this;
        }

        public Criteria andCust_nameIn(List<String> values) {
            addCriterion("cust_name in", values, "cust_name");
            return (Criteria) this;
        }

        public Criteria andCust_nameNotIn(List<String> values) {
            addCriterion("cust_name not in", values, "cust_name");
            return (Criteria) this;
        }

        public Criteria andCust_nameBetween(String value1, String value2) {
            addCriterion("cust_name between", value1, value2, "cust_name");
            return (Criteria) this;
        }

        public Criteria andCust_nameNotBetween(String value1, String value2) {
            addCriterion("cust_name not between", value1, value2, "cust_name");
            return (Criteria) this;
        }

        public Criteria andCust_user_idIsNull() {
            addCriterion("cust_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCust_user_idIsNotNull() {
            addCriterion("cust_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCust_user_idEqualTo(Long value) {
            addCriterion("cust_user_id =", value, "cust_user_id");
            return (Criteria) this;
        }

        public Criteria andCust_user_idNotEqualTo(Long value) {
            addCriterion("cust_user_id <>", value, "cust_user_id");
            return (Criteria) this;
        }

        public Criteria andCust_user_idGreaterThan(Long value) {
            addCriterion("cust_user_id >", value, "cust_user_id");
            return (Criteria) this;
        }

        public Criteria andCust_user_idGreaterThanOrEqualTo(Long value) {
            addCriterion("cust_user_id >=", value, "cust_user_id");
            return (Criteria) this;
        }

        public Criteria andCust_user_idLessThan(Long value) {
            addCriterion("cust_user_id <", value, "cust_user_id");
            return (Criteria) this;
        }

        public Criteria andCust_user_idLessThanOrEqualTo(Long value) {
            addCriterion("cust_user_id <=", value, "cust_user_id");
            return (Criteria) this;
        }

        public Criteria andCust_user_idIn(List<Long> values) {
            addCriterion("cust_user_id in", values, "cust_user_id");
            return (Criteria) this;
        }

        public Criteria andCust_user_idNotIn(List<Long> values) {
            addCriterion("cust_user_id not in", values, "cust_user_id");
            return (Criteria) this;
        }

        public Criteria andCust_user_idBetween(Long value1, Long value2) {
            addCriterion("cust_user_id between", value1, value2, "cust_user_id");
            return (Criteria) this;
        }

        public Criteria andCust_user_idNotBetween(Long value1, Long value2) {
            addCriterion("cust_user_id not between", value1, value2, "cust_user_id");
            return (Criteria) this;
        }

        public Criteria andCust_create_idIsNull() {
            addCriterion("cust_create_id is null");
            return (Criteria) this;
        }

        public Criteria andCust_create_idIsNotNull() {
            addCriterion("cust_create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCust_create_idEqualTo(Long value) {
            addCriterion("cust_create_id =", value, "cust_create_id");
            return (Criteria) this;
        }

        public Criteria andCust_create_idNotEqualTo(Long value) {
            addCriterion("cust_create_id <>", value, "cust_create_id");
            return (Criteria) this;
        }

        public Criteria andCust_create_idGreaterThan(Long value) {
            addCriterion("cust_create_id >", value, "cust_create_id");
            return (Criteria) this;
        }

        public Criteria andCust_create_idGreaterThanOrEqualTo(Long value) {
            addCriterion("cust_create_id >=", value, "cust_create_id");
            return (Criteria) this;
        }

        public Criteria andCust_create_idLessThan(Long value) {
            addCriterion("cust_create_id <", value, "cust_create_id");
            return (Criteria) this;
        }

        public Criteria andCust_create_idLessThanOrEqualTo(Long value) {
            addCriterion("cust_create_id <=", value, "cust_create_id");
            return (Criteria) this;
        }

        public Criteria andCust_create_idIn(List<Long> values) {
            addCriterion("cust_create_id in", values, "cust_create_id");
            return (Criteria) this;
        }

        public Criteria andCust_create_idNotIn(List<Long> values) {
            addCriterion("cust_create_id not in", values, "cust_create_id");
            return (Criteria) this;
        }

        public Criteria andCust_create_idBetween(Long value1, Long value2) {
            addCriterion("cust_create_id between", value1, value2, "cust_create_id");
            return (Criteria) this;
        }

        public Criteria andCust_create_idNotBetween(Long value1, Long value2) {
            addCriterion("cust_create_id not between", value1, value2, "cust_create_id");
            return (Criteria) this;
        }

        public Criteria andCust_sourceIsNull() {
            addCriterion("cust_source is null");
            return (Criteria) this;
        }

        public Criteria andCust_sourceIsNotNull() {
            addCriterion("cust_source is not null");
            return (Criteria) this;
        }

        public Criteria andCust_sourceEqualTo(String value) {
            addCriterion("cust_source =", value, "cust_source");
            return (Criteria) this;
        }

        public Criteria andCust_sourceNotEqualTo(String value) {
            addCriterion("cust_source <>", value, "cust_source");
            return (Criteria) this;
        }

        public Criteria andCust_sourceGreaterThan(String value) {
            addCriterion("cust_source >", value, "cust_source");
            return (Criteria) this;
        }

        public Criteria andCust_sourceGreaterThanOrEqualTo(String value) {
            addCriterion("cust_source >=", value, "cust_source");
            return (Criteria) this;
        }

        public Criteria andCust_sourceLessThan(String value) {
            addCriterion("cust_source <", value, "cust_source");
            return (Criteria) this;
        }

        public Criteria andCust_sourceLessThanOrEqualTo(String value) {
            addCriterion("cust_source <=", value, "cust_source");
            return (Criteria) this;
        }

        public Criteria andCust_sourceLike(String value) {
            addCriterion("cust_source like", value, "cust_source");
            return (Criteria) this;
        }

        public Criteria andCust_sourceNotLike(String value) {
            addCriterion("cust_source not like", value, "cust_source");
            return (Criteria) this;
        }

        public Criteria andCust_sourceIn(List<String> values) {
            addCriterion("cust_source in", values, "cust_source");
            return (Criteria) this;
        }

        public Criteria andCust_sourceNotIn(List<String> values) {
            addCriterion("cust_source not in", values, "cust_source");
            return (Criteria) this;
        }

        public Criteria andCust_sourceBetween(String value1, String value2) {
            addCriterion("cust_source between", value1, value2, "cust_source");
            return (Criteria) this;
        }

        public Criteria andCust_sourceNotBetween(String value1, String value2) {
            addCriterion("cust_source not between", value1, value2, "cust_source");
            return (Criteria) this;
        }

        public Criteria andCust_industryIsNull() {
            addCriterion("cust_industry is null");
            return (Criteria) this;
        }

        public Criteria andCust_industryIsNotNull() {
            addCriterion("cust_industry is not null");
            return (Criteria) this;
        }

        public Criteria andCust_industryEqualTo(String value) {
            addCriterion("cust_industry =", value, "cust_industry");
            return (Criteria) this;
        }

        public Criteria andCust_industryNotEqualTo(String value) {
            addCriterion("cust_industry <>", value, "cust_industry");
            return (Criteria) this;
        }

        public Criteria andCust_industryGreaterThan(String value) {
            addCriterion("cust_industry >", value, "cust_industry");
            return (Criteria) this;
        }

        public Criteria andCust_industryGreaterThanOrEqualTo(String value) {
            addCriterion("cust_industry >=", value, "cust_industry");
            return (Criteria) this;
        }

        public Criteria andCust_industryLessThan(String value) {
            addCriterion("cust_industry <", value, "cust_industry");
            return (Criteria) this;
        }

        public Criteria andCust_industryLessThanOrEqualTo(String value) {
            addCriterion("cust_industry <=", value, "cust_industry");
            return (Criteria) this;
        }

        public Criteria andCust_industryLike(String value) {
            addCriterion("cust_industry like", value, "cust_industry");
            return (Criteria) this;
        }

        public Criteria andCust_industryNotLike(String value) {
            addCriterion("cust_industry not like", value, "cust_industry");
            return (Criteria) this;
        }

        public Criteria andCust_industryIn(List<String> values) {
            addCriterion("cust_industry in", values, "cust_industry");
            return (Criteria) this;
        }

        public Criteria andCust_industryNotIn(List<String> values) {
            addCriterion("cust_industry not in", values, "cust_industry");
            return (Criteria) this;
        }

        public Criteria andCust_industryBetween(String value1, String value2) {
            addCriterion("cust_industry between", value1, value2, "cust_industry");
            return (Criteria) this;
        }

        public Criteria andCust_industryNotBetween(String value1, String value2) {
            addCriterion("cust_industry not between", value1, value2, "cust_industry");
            return (Criteria) this;
        }

        public Criteria andCust_levelIsNull() {
            addCriterion("cust_level is null");
            return (Criteria) this;
        }

        public Criteria andCust_levelIsNotNull() {
            addCriterion("cust_level is not null");
            return (Criteria) this;
        }

        public Criteria andCust_levelEqualTo(String value) {
            addCriterion("cust_level =", value, "cust_level");
            return (Criteria) this;
        }

        public Criteria andCust_levelNotEqualTo(String value) {
            addCriterion("cust_level <>", value, "cust_level");
            return (Criteria) this;
        }

        public Criteria andCust_levelGreaterThan(String value) {
            addCriterion("cust_level >", value, "cust_level");
            return (Criteria) this;
        }

        public Criteria andCust_levelGreaterThanOrEqualTo(String value) {
            addCriterion("cust_level >=", value, "cust_level");
            return (Criteria) this;
        }

        public Criteria andCust_levelLessThan(String value) {
            addCriterion("cust_level <", value, "cust_level");
            return (Criteria) this;
        }

        public Criteria andCust_levelLessThanOrEqualTo(String value) {
            addCriterion("cust_level <=", value, "cust_level");
            return (Criteria) this;
        }

        public Criteria andCust_levelLike(String value) {
            addCriterion("cust_level like", value, "cust_level");
            return (Criteria) this;
        }

        public Criteria andCust_levelNotLike(String value) {
            addCriterion("cust_level not like", value, "cust_level");
            return (Criteria) this;
        }

        public Criteria andCust_levelIn(List<String> values) {
            addCriterion("cust_level in", values, "cust_level");
            return (Criteria) this;
        }

        public Criteria andCust_levelNotIn(List<String> values) {
            addCriterion("cust_level not in", values, "cust_level");
            return (Criteria) this;
        }

        public Criteria andCust_levelBetween(String value1, String value2) {
            addCriterion("cust_level between", value1, value2, "cust_level");
            return (Criteria) this;
        }

        public Criteria andCust_levelNotBetween(String value1, String value2) {
            addCriterion("cust_level not between", value1, value2, "cust_level");
            return (Criteria) this;
        }

        public Criteria andCust_linkmanIsNull() {
            addCriterion("cust_linkman is null");
            return (Criteria) this;
        }

        public Criteria andCust_linkmanIsNotNull() {
            addCriterion("cust_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andCust_linkmanEqualTo(String value) {
            addCriterion("cust_linkman =", value, "cust_linkman");
            return (Criteria) this;
        }

        public Criteria andCust_linkmanNotEqualTo(String value) {
            addCriterion("cust_linkman <>", value, "cust_linkman");
            return (Criteria) this;
        }

        public Criteria andCust_linkmanGreaterThan(String value) {
            addCriterion("cust_linkman >", value, "cust_linkman");
            return (Criteria) this;
        }

        public Criteria andCust_linkmanGreaterThanOrEqualTo(String value) {
            addCriterion("cust_linkman >=", value, "cust_linkman");
            return (Criteria) this;
        }

        public Criteria andCust_linkmanLessThan(String value) {
            addCriterion("cust_linkman <", value, "cust_linkman");
            return (Criteria) this;
        }

        public Criteria andCust_linkmanLessThanOrEqualTo(String value) {
            addCriterion("cust_linkman <=", value, "cust_linkman");
            return (Criteria) this;
        }

        public Criteria andCust_linkmanLike(String value) {
            addCriterion("cust_linkman like", value, "cust_linkman");
            return (Criteria) this;
        }

        public Criteria andCust_linkmanNotLike(String value) {
            addCriterion("cust_linkman not like", value, "cust_linkman");
            return (Criteria) this;
        }

        public Criteria andCust_linkmanIn(List<String> values) {
            addCriterion("cust_linkman in", values, "cust_linkman");
            return (Criteria) this;
        }

        public Criteria andCust_linkmanNotIn(List<String> values) {
            addCriterion("cust_linkman not in", values, "cust_linkman");
            return (Criteria) this;
        }

        public Criteria andCust_linkmanBetween(String value1, String value2) {
            addCriterion("cust_linkman between", value1, value2, "cust_linkman");
            return (Criteria) this;
        }

        public Criteria andCust_linkmanNotBetween(String value1, String value2) {
            addCriterion("cust_linkman not between", value1, value2, "cust_linkman");
            return (Criteria) this;
        }

        public Criteria andCust_phoneIsNull() {
            addCriterion("cust_phone is null");
            return (Criteria) this;
        }

        public Criteria andCust_phoneIsNotNull() {
            addCriterion("cust_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCust_phoneEqualTo(String value) {
            addCriterion("cust_phone =", value, "cust_phone");
            return (Criteria) this;
        }

        public Criteria andCust_phoneNotEqualTo(String value) {
            addCriterion("cust_phone <>", value, "cust_phone");
            return (Criteria) this;
        }

        public Criteria andCust_phoneGreaterThan(String value) {
            addCriterion("cust_phone >", value, "cust_phone");
            return (Criteria) this;
        }

        public Criteria andCust_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("cust_phone >=", value, "cust_phone");
            return (Criteria) this;
        }

        public Criteria andCust_phoneLessThan(String value) {
            addCriterion("cust_phone <", value, "cust_phone");
            return (Criteria) this;
        }

        public Criteria andCust_phoneLessThanOrEqualTo(String value) {
            addCriterion("cust_phone <=", value, "cust_phone");
            return (Criteria) this;
        }

        public Criteria andCust_phoneLike(String value) {
            addCriterion("cust_phone like", value, "cust_phone");
            return (Criteria) this;
        }

        public Criteria andCust_phoneNotLike(String value) {
            addCriterion("cust_phone not like", value, "cust_phone");
            return (Criteria) this;
        }

        public Criteria andCust_phoneIn(List<String> values) {
            addCriterion("cust_phone in", values, "cust_phone");
            return (Criteria) this;
        }

        public Criteria andCust_phoneNotIn(List<String> values) {
            addCriterion("cust_phone not in", values, "cust_phone");
            return (Criteria) this;
        }

        public Criteria andCust_phoneBetween(String value1, String value2) {
            addCriterion("cust_phone between", value1, value2, "cust_phone");
            return (Criteria) this;
        }

        public Criteria andCust_phoneNotBetween(String value1, String value2) {
            addCriterion("cust_phone not between", value1, value2, "cust_phone");
            return (Criteria) this;
        }

        public Criteria andCust_mobileIsNull() {
            addCriterion("cust_mobile is null");
            return (Criteria) this;
        }

        public Criteria andCust_mobileIsNotNull() {
            addCriterion("cust_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andCust_mobileEqualTo(String value) {
            addCriterion("cust_mobile =", value, "cust_mobile");
            return (Criteria) this;
        }

        public Criteria andCust_mobileNotEqualTo(String value) {
            addCriterion("cust_mobile <>", value, "cust_mobile");
            return (Criteria) this;
        }

        public Criteria andCust_mobileGreaterThan(String value) {
            addCriterion("cust_mobile >", value, "cust_mobile");
            return (Criteria) this;
        }

        public Criteria andCust_mobileGreaterThanOrEqualTo(String value) {
            addCriterion("cust_mobile >=", value, "cust_mobile");
            return (Criteria) this;
        }

        public Criteria andCust_mobileLessThan(String value) {
            addCriterion("cust_mobile <", value, "cust_mobile");
            return (Criteria) this;
        }

        public Criteria andCust_mobileLessThanOrEqualTo(String value) {
            addCriterion("cust_mobile <=", value, "cust_mobile");
            return (Criteria) this;
        }

        public Criteria andCust_mobileLike(String value) {
            addCriterion("cust_mobile like", value, "cust_mobile");
            return (Criteria) this;
        }

        public Criteria andCust_mobileNotLike(String value) {
            addCriterion("cust_mobile not like", value, "cust_mobile");
            return (Criteria) this;
        }

        public Criteria andCust_mobileIn(List<String> values) {
            addCriterion("cust_mobile in", values, "cust_mobile");
            return (Criteria) this;
        }

        public Criteria andCust_mobileNotIn(List<String> values) {
            addCriterion("cust_mobile not in", values, "cust_mobile");
            return (Criteria) this;
        }

        public Criteria andCust_mobileBetween(String value1, String value2) {
            addCriterion("cust_mobile between", value1, value2, "cust_mobile");
            return (Criteria) this;
        }

        public Criteria andCust_mobileNotBetween(String value1, String value2) {
            addCriterion("cust_mobile not between", value1, value2, "cust_mobile");
            return (Criteria) this;
        }

        public Criteria andCust_zipcodeIsNull() {
            addCriterion("cust_zipcode is null");
            return (Criteria) this;
        }

        public Criteria andCust_zipcodeIsNotNull() {
            addCriterion("cust_zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andCust_zipcodeEqualTo(String value) {
            addCriterion("cust_zipcode =", value, "cust_zipcode");
            return (Criteria) this;
        }

        public Criteria andCust_zipcodeNotEqualTo(String value) {
            addCriterion("cust_zipcode <>", value, "cust_zipcode");
            return (Criteria) this;
        }

        public Criteria andCust_zipcodeGreaterThan(String value) {
            addCriterion("cust_zipcode >", value, "cust_zipcode");
            return (Criteria) this;
        }

        public Criteria andCust_zipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("cust_zipcode >=", value, "cust_zipcode");
            return (Criteria) this;
        }

        public Criteria andCust_zipcodeLessThan(String value) {
            addCriterion("cust_zipcode <", value, "cust_zipcode");
            return (Criteria) this;
        }

        public Criteria andCust_zipcodeLessThanOrEqualTo(String value) {
            addCriterion("cust_zipcode <=", value, "cust_zipcode");
            return (Criteria) this;
        }

        public Criteria andCust_zipcodeLike(String value) {
            addCriterion("cust_zipcode like", value, "cust_zipcode");
            return (Criteria) this;
        }

        public Criteria andCust_zipcodeNotLike(String value) {
            addCriterion("cust_zipcode not like", value, "cust_zipcode");
            return (Criteria) this;
        }

        public Criteria andCust_zipcodeIn(List<String> values) {
            addCriterion("cust_zipcode in", values, "cust_zipcode");
            return (Criteria) this;
        }

        public Criteria andCust_zipcodeNotIn(List<String> values) {
            addCriterion("cust_zipcode not in", values, "cust_zipcode");
            return (Criteria) this;
        }

        public Criteria andCust_zipcodeBetween(String value1, String value2) {
            addCriterion("cust_zipcode between", value1, value2, "cust_zipcode");
            return (Criteria) this;
        }

        public Criteria andCust_zipcodeNotBetween(String value1, String value2) {
            addCriterion("cust_zipcode not between", value1, value2, "cust_zipcode");
            return (Criteria) this;
        }

        public Criteria andCust_addressIsNull() {
            addCriterion("cust_address is null");
            return (Criteria) this;
        }

        public Criteria andCust_addressIsNotNull() {
            addCriterion("cust_address is not null");
            return (Criteria) this;
        }

        public Criteria andCust_addressEqualTo(String value) {
            addCriterion("cust_address =", value, "cust_address");
            return (Criteria) this;
        }

        public Criteria andCust_addressNotEqualTo(String value) {
            addCriterion("cust_address <>", value, "cust_address");
            return (Criteria) this;
        }

        public Criteria andCust_addressGreaterThan(String value) {
            addCriterion("cust_address >", value, "cust_address");
            return (Criteria) this;
        }

        public Criteria andCust_addressGreaterThanOrEqualTo(String value) {
            addCriterion("cust_address >=", value, "cust_address");
            return (Criteria) this;
        }

        public Criteria andCust_addressLessThan(String value) {
            addCriterion("cust_address <", value, "cust_address");
            return (Criteria) this;
        }

        public Criteria andCust_addressLessThanOrEqualTo(String value) {
            addCriterion("cust_address <=", value, "cust_address");
            return (Criteria) this;
        }

        public Criteria andCust_addressLike(String value) {
            addCriterion("cust_address like", value, "cust_address");
            return (Criteria) this;
        }

        public Criteria andCust_addressNotLike(String value) {
            addCriterion("cust_address not like", value, "cust_address");
            return (Criteria) this;
        }

        public Criteria andCust_addressIn(List<String> values) {
            addCriterion("cust_address in", values, "cust_address");
            return (Criteria) this;
        }

        public Criteria andCust_addressNotIn(List<String> values) {
            addCriterion("cust_address not in", values, "cust_address");
            return (Criteria) this;
        }

        public Criteria andCust_addressBetween(String value1, String value2) {
            addCriterion("cust_address between", value1, value2, "cust_address");
            return (Criteria) this;
        }

        public Criteria andCust_addressNotBetween(String value1, String value2) {
            addCriterion("cust_address not between", value1, value2, "cust_address");
            return (Criteria) this;
        }

        public Criteria andCust_createtimeIsNull() {
            addCriterion("cust_createtime is null");
            return (Criteria) this;
        }

        public Criteria andCust_createtimeIsNotNull() {
            addCriterion("cust_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCust_createtimeEqualTo(Date value) {
            addCriterion("cust_createtime =", value, "cust_createtime");
            return (Criteria) this;
        }

        public Criteria andCust_createtimeNotEqualTo(Date value) {
            addCriterion("cust_createtime <>", value, "cust_createtime");
            return (Criteria) this;
        }

        public Criteria andCust_createtimeGreaterThan(Date value) {
            addCriterion("cust_createtime >", value, "cust_createtime");
            return (Criteria) this;
        }

        public Criteria andCust_createtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cust_createtime >=", value, "cust_createtime");
            return (Criteria) this;
        }

        public Criteria andCust_createtimeLessThan(Date value) {
            addCriterion("cust_createtime <", value, "cust_createtime");
            return (Criteria) this;
        }

        public Criteria andCust_createtimeLessThanOrEqualTo(Date value) {
            addCriterion("cust_createtime <=", value, "cust_createtime");
            return (Criteria) this;
        }

        public Criteria andCust_createtimeIn(List<Date> values) {
            addCriterion("cust_createtime in", values, "cust_createtime");
            return (Criteria) this;
        }

        public Criteria andCust_createtimeNotIn(List<Date> values) {
            addCriterion("cust_createtime not in", values, "cust_createtime");
            return (Criteria) this;
        }

        public Criteria andCust_createtimeBetween(Date value1, Date value2) {
            addCriterion("cust_createtime between", value1, value2, "cust_createtime");
            return (Criteria) this;
        }

        public Criteria andCust_createtimeNotBetween(Date value1, Date value2) {
            addCriterion("cust_createtime not between", value1, value2, "cust_createtime");
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
    }
}