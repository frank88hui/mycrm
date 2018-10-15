package com.changhui.pojo;

import java.util.ArrayList;
import java.util.List;

public class BaseDictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaseDictExample() {
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

        public Criteria andDict_idIsNull() {
            addCriterion("dict_id is null");
            return (Criteria) this;
        }

        public Criteria andDict_idIsNotNull() {
            addCriterion("dict_id is not null");
            return (Criteria) this;
        }

        public Criteria andDict_idEqualTo(String value) {
            addCriterion("dict_id =", value, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idNotEqualTo(String value) {
            addCriterion("dict_id <>", value, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idGreaterThan(String value) {
            addCriterion("dict_id >", value, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idGreaterThanOrEqualTo(String value) {
            addCriterion("dict_id >=", value, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idLessThan(String value) {
            addCriterion("dict_id <", value, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idLessThanOrEqualTo(String value) {
            addCriterion("dict_id <=", value, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idLike(String value) {
            addCriterion("dict_id like", value, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idNotLike(String value) {
            addCriterion("dict_id not like", value, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idIn(List<String> values) {
            addCriterion("dict_id in", values, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idNotIn(List<String> values) {
            addCriterion("dict_id not in", values, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idBetween(String value1, String value2) {
            addCriterion("dict_id between", value1, value2, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_idNotBetween(String value1, String value2) {
            addCriterion("dict_id not between", value1, value2, "dict_id");
            return (Criteria) this;
        }

        public Criteria andDict_type_codeIsNull() {
            addCriterion("dict_type_code is null");
            return (Criteria) this;
        }

        public Criteria andDict_type_codeIsNotNull() {
            addCriterion("dict_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andDict_type_codeEqualTo(String value) {
            addCriterion("dict_type_code =", value, "dict_type_code");
            return (Criteria) this;
        }

        public Criteria andDict_type_codeNotEqualTo(String value) {
            addCriterion("dict_type_code <>", value, "dict_type_code");
            return (Criteria) this;
        }

        public Criteria andDict_type_codeGreaterThan(String value) {
            addCriterion("dict_type_code >", value, "dict_type_code");
            return (Criteria) this;
        }

        public Criteria andDict_type_codeGreaterThanOrEqualTo(String value) {
            addCriterion("dict_type_code >=", value, "dict_type_code");
            return (Criteria) this;
        }

        public Criteria andDict_type_codeLessThan(String value) {
            addCriterion("dict_type_code <", value, "dict_type_code");
            return (Criteria) this;
        }

        public Criteria andDict_type_codeLessThanOrEqualTo(String value) {
            addCriterion("dict_type_code <=", value, "dict_type_code");
            return (Criteria) this;
        }

        public Criteria andDict_type_codeLike(String value) {
            addCriterion("dict_type_code like", value, "dict_type_code");
            return (Criteria) this;
        }

        public Criteria andDict_type_codeNotLike(String value) {
            addCriterion("dict_type_code not like", value, "dict_type_code");
            return (Criteria) this;
        }

        public Criteria andDict_type_codeIn(List<String> values) {
            addCriterion("dict_type_code in", values, "dict_type_code");
            return (Criteria) this;
        }

        public Criteria andDict_type_codeNotIn(List<String> values) {
            addCriterion("dict_type_code not in", values, "dict_type_code");
            return (Criteria) this;
        }

        public Criteria andDict_type_codeBetween(String value1, String value2) {
            addCriterion("dict_type_code between", value1, value2, "dict_type_code");
            return (Criteria) this;
        }

        public Criteria andDict_type_codeNotBetween(String value1, String value2) {
            addCriterion("dict_type_code not between", value1, value2, "dict_type_code");
            return (Criteria) this;
        }

        public Criteria andDict_type_nameIsNull() {
            addCriterion("dict_type_name is null");
            return (Criteria) this;
        }

        public Criteria andDict_type_nameIsNotNull() {
            addCriterion("dict_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andDict_type_nameEqualTo(String value) {
            addCriterion("dict_type_name =", value, "dict_type_name");
            return (Criteria) this;
        }

        public Criteria andDict_type_nameNotEqualTo(String value) {
            addCriterion("dict_type_name <>", value, "dict_type_name");
            return (Criteria) this;
        }

        public Criteria andDict_type_nameGreaterThan(String value) {
            addCriterion("dict_type_name >", value, "dict_type_name");
            return (Criteria) this;
        }

        public Criteria andDict_type_nameGreaterThanOrEqualTo(String value) {
            addCriterion("dict_type_name >=", value, "dict_type_name");
            return (Criteria) this;
        }

        public Criteria andDict_type_nameLessThan(String value) {
            addCriterion("dict_type_name <", value, "dict_type_name");
            return (Criteria) this;
        }

        public Criteria andDict_type_nameLessThanOrEqualTo(String value) {
            addCriterion("dict_type_name <=", value, "dict_type_name");
            return (Criteria) this;
        }

        public Criteria andDict_type_nameLike(String value) {
            addCriterion("dict_type_name like", value, "dict_type_name");
            return (Criteria) this;
        }

        public Criteria andDict_type_nameNotLike(String value) {
            addCriterion("dict_type_name not like", value, "dict_type_name");
            return (Criteria) this;
        }

        public Criteria andDict_type_nameIn(List<String> values) {
            addCriterion("dict_type_name in", values, "dict_type_name");
            return (Criteria) this;
        }

        public Criteria andDict_type_nameNotIn(List<String> values) {
            addCriterion("dict_type_name not in", values, "dict_type_name");
            return (Criteria) this;
        }

        public Criteria andDict_type_nameBetween(String value1, String value2) {
            addCriterion("dict_type_name between", value1, value2, "dict_type_name");
            return (Criteria) this;
        }

        public Criteria andDict_type_nameNotBetween(String value1, String value2) {
            addCriterion("dict_type_name not between", value1, value2, "dict_type_name");
            return (Criteria) this;
        }

        public Criteria andDict_item_nameIsNull() {
            addCriterion("dict_item_name is null");
            return (Criteria) this;
        }

        public Criteria andDict_item_nameIsNotNull() {
            addCriterion("dict_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andDict_item_nameEqualTo(String value) {
            addCriterion("dict_item_name =", value, "dict_item_name");
            return (Criteria) this;
        }

        public Criteria andDict_item_nameNotEqualTo(String value) {
            addCriterion("dict_item_name <>", value, "dict_item_name");
            return (Criteria) this;
        }

        public Criteria andDict_item_nameGreaterThan(String value) {
            addCriterion("dict_item_name >", value, "dict_item_name");
            return (Criteria) this;
        }

        public Criteria andDict_item_nameGreaterThanOrEqualTo(String value) {
            addCriterion("dict_item_name >=", value, "dict_item_name");
            return (Criteria) this;
        }

        public Criteria andDict_item_nameLessThan(String value) {
            addCriterion("dict_item_name <", value, "dict_item_name");
            return (Criteria) this;
        }

        public Criteria andDict_item_nameLessThanOrEqualTo(String value) {
            addCriterion("dict_item_name <=", value, "dict_item_name");
            return (Criteria) this;
        }

        public Criteria andDict_item_nameLike(String value) {
            addCriterion("dict_item_name like", value, "dict_item_name");
            return (Criteria) this;
        }

        public Criteria andDict_item_nameNotLike(String value) {
            addCriterion("dict_item_name not like", value, "dict_item_name");
            return (Criteria) this;
        }

        public Criteria andDict_item_nameIn(List<String> values) {
            addCriterion("dict_item_name in", values, "dict_item_name");
            return (Criteria) this;
        }

        public Criteria andDict_item_nameNotIn(List<String> values) {
            addCriterion("dict_item_name not in", values, "dict_item_name");
            return (Criteria) this;
        }

        public Criteria andDict_item_nameBetween(String value1, String value2) {
            addCriterion("dict_item_name between", value1, value2, "dict_item_name");
            return (Criteria) this;
        }

        public Criteria andDict_item_nameNotBetween(String value1, String value2) {
            addCriterion("dict_item_name not between", value1, value2, "dict_item_name");
            return (Criteria) this;
        }

        public Criteria andDict_item_codeIsNull() {
            addCriterion("dict_item_code is null");
            return (Criteria) this;
        }

        public Criteria andDict_item_codeIsNotNull() {
            addCriterion("dict_item_code is not null");
            return (Criteria) this;
        }

        public Criteria andDict_item_codeEqualTo(String value) {
            addCriterion("dict_item_code =", value, "dict_item_code");
            return (Criteria) this;
        }

        public Criteria andDict_item_codeNotEqualTo(String value) {
            addCriterion("dict_item_code <>", value, "dict_item_code");
            return (Criteria) this;
        }

        public Criteria andDict_item_codeGreaterThan(String value) {
            addCriterion("dict_item_code >", value, "dict_item_code");
            return (Criteria) this;
        }

        public Criteria andDict_item_codeGreaterThanOrEqualTo(String value) {
            addCriterion("dict_item_code >=", value, "dict_item_code");
            return (Criteria) this;
        }

        public Criteria andDict_item_codeLessThan(String value) {
            addCriterion("dict_item_code <", value, "dict_item_code");
            return (Criteria) this;
        }

        public Criteria andDict_item_codeLessThanOrEqualTo(String value) {
            addCriterion("dict_item_code <=", value, "dict_item_code");
            return (Criteria) this;
        }

        public Criteria andDict_item_codeLike(String value) {
            addCriterion("dict_item_code like", value, "dict_item_code");
            return (Criteria) this;
        }

        public Criteria andDict_item_codeNotLike(String value) {
            addCriterion("dict_item_code not like", value, "dict_item_code");
            return (Criteria) this;
        }

        public Criteria andDict_item_codeIn(List<String> values) {
            addCriterion("dict_item_code in", values, "dict_item_code");
            return (Criteria) this;
        }

        public Criteria andDict_item_codeNotIn(List<String> values) {
            addCriterion("dict_item_code not in", values, "dict_item_code");
            return (Criteria) this;
        }

        public Criteria andDict_item_codeBetween(String value1, String value2) {
            addCriterion("dict_item_code between", value1, value2, "dict_item_code");
            return (Criteria) this;
        }

        public Criteria andDict_item_codeNotBetween(String value1, String value2) {
            addCriterion("dict_item_code not between", value1, value2, "dict_item_code");
            return (Criteria) this;
        }

        public Criteria andDict_sortIsNull() {
            addCriterion("dict_sort is null");
            return (Criteria) this;
        }

        public Criteria andDict_sortIsNotNull() {
            addCriterion("dict_sort is not null");
            return (Criteria) this;
        }

        public Criteria andDict_sortEqualTo(Integer value) {
            addCriterion("dict_sort =", value, "dict_sort");
            return (Criteria) this;
        }

        public Criteria andDict_sortNotEqualTo(Integer value) {
            addCriterion("dict_sort <>", value, "dict_sort");
            return (Criteria) this;
        }

        public Criteria andDict_sortGreaterThan(Integer value) {
            addCriterion("dict_sort >", value, "dict_sort");
            return (Criteria) this;
        }

        public Criteria andDict_sortGreaterThanOrEqualTo(Integer value) {
            addCriterion("dict_sort >=", value, "dict_sort");
            return (Criteria) this;
        }

        public Criteria andDict_sortLessThan(Integer value) {
            addCriterion("dict_sort <", value, "dict_sort");
            return (Criteria) this;
        }

        public Criteria andDict_sortLessThanOrEqualTo(Integer value) {
            addCriterion("dict_sort <=", value, "dict_sort");
            return (Criteria) this;
        }

        public Criteria andDict_sortIn(List<Integer> values) {
            addCriterion("dict_sort in", values, "dict_sort");
            return (Criteria) this;
        }

        public Criteria andDict_sortNotIn(List<Integer> values) {
            addCriterion("dict_sort not in", values, "dict_sort");
            return (Criteria) this;
        }

        public Criteria andDict_sortBetween(Integer value1, Integer value2) {
            addCriterion("dict_sort between", value1, value2, "dict_sort");
            return (Criteria) this;
        }

        public Criteria andDict_sortNotBetween(Integer value1, Integer value2) {
            addCriterion("dict_sort not between", value1, value2, "dict_sort");
            return (Criteria) this;
        }

        public Criteria andDict_enableIsNull() {
            addCriterion("dict_enable is null");
            return (Criteria) this;
        }

        public Criteria andDict_enableIsNotNull() {
            addCriterion("dict_enable is not null");
            return (Criteria) this;
        }

        public Criteria andDict_enableEqualTo(String value) {
            addCriterion("dict_enable =", value, "dict_enable");
            return (Criteria) this;
        }

        public Criteria andDict_enableNotEqualTo(String value) {
            addCriterion("dict_enable <>", value, "dict_enable");
            return (Criteria) this;
        }

        public Criteria andDict_enableGreaterThan(String value) {
            addCriterion("dict_enable >", value, "dict_enable");
            return (Criteria) this;
        }

        public Criteria andDict_enableGreaterThanOrEqualTo(String value) {
            addCriterion("dict_enable >=", value, "dict_enable");
            return (Criteria) this;
        }

        public Criteria andDict_enableLessThan(String value) {
            addCriterion("dict_enable <", value, "dict_enable");
            return (Criteria) this;
        }

        public Criteria andDict_enableLessThanOrEqualTo(String value) {
            addCriterion("dict_enable <=", value, "dict_enable");
            return (Criteria) this;
        }

        public Criteria andDict_enableLike(String value) {
            addCriterion("dict_enable like", value, "dict_enable");
            return (Criteria) this;
        }

        public Criteria andDict_enableNotLike(String value) {
            addCriterion("dict_enable not like", value, "dict_enable");
            return (Criteria) this;
        }

        public Criteria andDict_enableIn(List<String> values) {
            addCriterion("dict_enable in", values, "dict_enable");
            return (Criteria) this;
        }

        public Criteria andDict_enableNotIn(List<String> values) {
            addCriterion("dict_enable not in", values, "dict_enable");
            return (Criteria) this;
        }

        public Criteria andDict_enableBetween(String value1, String value2) {
            addCriterion("dict_enable between", value1, value2, "dict_enable");
            return (Criteria) this;
        }

        public Criteria andDict_enableNotBetween(String value1, String value2) {
            addCriterion("dict_enable not between", value1, value2, "dict_enable");
            return (Criteria) this;
        }

        public Criteria andDict_memoIsNull() {
            addCriterion("dict_memo is null");
            return (Criteria) this;
        }

        public Criteria andDict_memoIsNotNull() {
            addCriterion("dict_memo is not null");
            return (Criteria) this;
        }

        public Criteria andDict_memoEqualTo(String value) {
            addCriterion("dict_memo =", value, "dict_memo");
            return (Criteria) this;
        }

        public Criteria andDict_memoNotEqualTo(String value) {
            addCriterion("dict_memo <>", value, "dict_memo");
            return (Criteria) this;
        }

        public Criteria andDict_memoGreaterThan(String value) {
            addCriterion("dict_memo >", value, "dict_memo");
            return (Criteria) this;
        }

        public Criteria andDict_memoGreaterThanOrEqualTo(String value) {
            addCriterion("dict_memo >=", value, "dict_memo");
            return (Criteria) this;
        }

        public Criteria andDict_memoLessThan(String value) {
            addCriterion("dict_memo <", value, "dict_memo");
            return (Criteria) this;
        }

        public Criteria andDict_memoLessThanOrEqualTo(String value) {
            addCriterion("dict_memo <=", value, "dict_memo");
            return (Criteria) this;
        }

        public Criteria andDict_memoLike(String value) {
            addCriterion("dict_memo like", value, "dict_memo");
            return (Criteria) this;
        }

        public Criteria andDict_memoNotLike(String value) {
            addCriterion("dict_memo not like", value, "dict_memo");
            return (Criteria) this;
        }

        public Criteria andDict_memoIn(List<String> values) {
            addCriterion("dict_memo in", values, "dict_memo");
            return (Criteria) this;
        }

        public Criteria andDict_memoNotIn(List<String> values) {
            addCriterion("dict_memo not in", values, "dict_memo");
            return (Criteria) this;
        }

        public Criteria andDict_memoBetween(String value1, String value2) {
            addCriterion("dict_memo between", value1, value2, "dict_memo");
            return (Criteria) this;
        }

        public Criteria andDict_memoNotBetween(String value1, String value2) {
            addCriterion("dict_memo not between", value1, value2, "dict_memo");
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