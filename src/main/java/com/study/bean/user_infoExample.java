package com.study.bean;

import java.util.ArrayList;
import java.util.List;

public class user_infoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public user_infoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLoginIsNull() {
            addCriterion("login is null");
            return (Criteria) this;
        }

        public Criteria andLoginIsNotNull() {
            addCriterion("login is not null");
            return (Criteria) this;
        }

        public Criteria andLoginEqualTo(String value) {
            addCriterion("login =", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotEqualTo(String value) {
            addCriterion("login <>", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginGreaterThan(String value) {
            addCriterion("login >", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginGreaterThanOrEqualTo(String value) {
            addCriterion("login >=", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginLessThan(String value) {
            addCriterion("login <", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginLessThanOrEqualTo(String value) {
            addCriterion("login <=", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginLike(String value) {
            addCriterion("login like", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotLike(String value) {
            addCriterion("login not like", value, "login");
            return (Criteria) this;
        }

        public Criteria andLoginIn(List<String> values) {
            addCriterion("login in", values, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotIn(List<String> values) {
            addCriterion("login not in", values, "login");
            return (Criteria) this;
        }

        public Criteria andLoginBetween(String value1, String value2) {
            addCriterion("login between", value1, value2, "login");
            return (Criteria) this;
        }

        public Criteria andLoginNotBetween(String value1, String value2) {
            addCriterion("login not between", value1, value2, "login");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andOrigidIsNull() {
            addCriterion("origID is null");
            return (Criteria) this;
        }

        public Criteria andOrigidIsNotNull() {
            addCriterion("origID is not null");
            return (Criteria) this;
        }

        public Criteria andOrigidEqualTo(String value) {
            addCriterion("origID =", value, "origid");
            return (Criteria) this;
        }

        public Criteria andOrigidNotEqualTo(String value) {
            addCriterion("origID <>", value, "origid");
            return (Criteria) this;
        }

        public Criteria andOrigidGreaterThan(String value) {
            addCriterion("origID >", value, "origid");
            return (Criteria) this;
        }

        public Criteria andOrigidGreaterThanOrEqualTo(String value) {
            addCriterion("origID >=", value, "origid");
            return (Criteria) this;
        }

        public Criteria andOrigidLessThan(String value) {
            addCriterion("origID <", value, "origid");
            return (Criteria) this;
        }

        public Criteria andOrigidLessThanOrEqualTo(String value) {
            addCriterion("origID <=", value, "origid");
            return (Criteria) this;
        }

        public Criteria andOrigidLike(String value) {
            addCriterion("origID like", value, "origid");
            return (Criteria) this;
        }

        public Criteria andOrigidNotLike(String value) {
            addCriterion("origID not like", value, "origid");
            return (Criteria) this;
        }

        public Criteria andOrigidIn(List<String> values) {
            addCriterion("origID in", values, "origid");
            return (Criteria) this;
        }

        public Criteria andOrigidNotIn(List<String> values) {
            addCriterion("origID not in", values, "origid");
            return (Criteria) this;
        }

        public Criteria andOrigidBetween(String value1, String value2) {
            addCriterion("origID between", value1, value2, "origid");
            return (Criteria) this;
        }

        public Criteria andOrigidNotBetween(String value1, String value2) {
            addCriterion("origID not between", value1, value2, "origid");
            return (Criteria) this;
        }

        public Criteria andInputuseridIsNull() {
            addCriterion("inputuserID is null");
            return (Criteria) this;
        }

        public Criteria andInputuseridIsNotNull() {
            addCriterion("inputuserID is not null");
            return (Criteria) this;
        }

        public Criteria andInputuseridEqualTo(String value) {
            addCriterion("inputuserID =", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridNotEqualTo(String value) {
            addCriterion("inputuserID <>", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridGreaterThan(String value) {
            addCriterion("inputuserID >", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridGreaterThanOrEqualTo(String value) {
            addCriterion("inputuserID >=", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridLessThan(String value) {
            addCriterion("inputuserID <", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridLessThanOrEqualTo(String value) {
            addCriterion("inputuserID <=", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridLike(String value) {
            addCriterion("inputuserID like", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridNotLike(String value) {
            addCriterion("inputuserID not like", value, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridIn(List<String> values) {
            addCriterion("inputuserID in", values, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridNotIn(List<String> values) {
            addCriterion("inputuserID not in", values, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridBetween(String value1, String value2) {
            addCriterion("inputuserID between", value1, value2, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputuseridNotBetween(String value1, String value2) {
            addCriterion("inputuserID not between", value1, value2, "inputuserid");
            return (Criteria) this;
        }

        public Criteria andInputorgidIsNull() {
            addCriterion("inputorgid is null");
            return (Criteria) this;
        }

        public Criteria andInputorgidIsNotNull() {
            addCriterion("inputorgid is not null");
            return (Criteria) this;
        }

        public Criteria andInputorgidEqualTo(String value) {
            addCriterion("inputorgid =", value, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidNotEqualTo(String value) {
            addCriterion("inputorgid <>", value, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidGreaterThan(String value) {
            addCriterion("inputorgid >", value, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidGreaterThanOrEqualTo(String value) {
            addCriterion("inputorgid >=", value, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidLessThan(String value) {
            addCriterion("inputorgid <", value, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidLessThanOrEqualTo(String value) {
            addCriterion("inputorgid <=", value, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidLike(String value) {
            addCriterion("inputorgid like", value, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidNotLike(String value) {
            addCriterion("inputorgid not like", value, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidIn(List<String> values) {
            addCriterion("inputorgid in", values, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidNotIn(List<String> values) {
            addCriterion("inputorgid not in", values, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidBetween(String value1, String value2) {
            addCriterion("inputorgid between", value1, value2, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputorgidNotBetween(String value1, String value2) {
            addCriterion("inputorgid not between", value1, value2, "inputorgid");
            return (Criteria) this;
        }

        public Criteria andInputtimeIsNull() {
            addCriterion("inputtime is null");
            return (Criteria) this;
        }

        public Criteria andInputtimeIsNotNull() {
            addCriterion("inputtime is not null");
            return (Criteria) this;
        }

        public Criteria andInputtimeEqualTo(String value) {
            addCriterion("inputtime =", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeNotEqualTo(String value) {
            addCriterion("inputtime <>", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeGreaterThan(String value) {
            addCriterion("inputtime >", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeGreaterThanOrEqualTo(String value) {
            addCriterion("inputtime >=", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeLessThan(String value) {
            addCriterion("inputtime <", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeLessThanOrEqualTo(String value) {
            addCriterion("inputtime <=", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeLike(String value) {
            addCriterion("inputtime like", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeNotLike(String value) {
            addCriterion("inputtime not like", value, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeIn(List<String> values) {
            addCriterion("inputtime in", values, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeNotIn(List<String> values) {
            addCriterion("inputtime not in", values, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeBetween(String value1, String value2) {
            addCriterion("inputtime between", value1, value2, "inputtime");
            return (Criteria) this;
        }

        public Criteria andInputtimeNotBetween(String value1, String value2) {
            addCriterion("inputtime not between", value1, value2, "inputtime");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNull() {
            addCriterion("updateuserid is null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIsNotNull() {
            addCriterion("updateuserid is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridEqualTo(String value) {
            addCriterion("updateuserid =", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotEqualTo(String value) {
            addCriterion("updateuserid <>", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThan(String value) {
            addCriterion("updateuserid >", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridGreaterThanOrEqualTo(String value) {
            addCriterion("updateuserid >=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThan(String value) {
            addCriterion("updateuserid <", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLessThanOrEqualTo(String value) {
            addCriterion("updateuserid <=", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridLike(String value) {
            addCriterion("updateuserid like", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotLike(String value) {
            addCriterion("updateuserid not like", value, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridIn(List<String> values) {
            addCriterion("updateuserid in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotIn(List<String> values) {
            addCriterion("updateuserid not in", values, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridBetween(String value1, String value2) {
            addCriterion("updateuserid between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateuseridNotBetween(String value1, String value2) {
            addCriterion("updateuserid not between", value1, value2, "updateuserid");
            return (Criteria) this;
        }

        public Criteria andUpdateorigidIsNull() {
            addCriterion("updateorigid is null");
            return (Criteria) this;
        }

        public Criteria andUpdateorigidIsNotNull() {
            addCriterion("updateorigid is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateorigidEqualTo(String value) {
            addCriterion("updateorigid =", value, "updateorigid");
            return (Criteria) this;
        }

        public Criteria andUpdateorigidNotEqualTo(String value) {
            addCriterion("updateorigid <>", value, "updateorigid");
            return (Criteria) this;
        }

        public Criteria andUpdateorigidGreaterThan(String value) {
            addCriterion("updateorigid >", value, "updateorigid");
            return (Criteria) this;
        }

        public Criteria andUpdateorigidGreaterThanOrEqualTo(String value) {
            addCriterion("updateorigid >=", value, "updateorigid");
            return (Criteria) this;
        }

        public Criteria andUpdateorigidLessThan(String value) {
            addCriterion("updateorigid <", value, "updateorigid");
            return (Criteria) this;
        }

        public Criteria andUpdateorigidLessThanOrEqualTo(String value) {
            addCriterion("updateorigid <=", value, "updateorigid");
            return (Criteria) this;
        }

        public Criteria andUpdateorigidLike(String value) {
            addCriterion("updateorigid like", value, "updateorigid");
            return (Criteria) this;
        }

        public Criteria andUpdateorigidNotLike(String value) {
            addCriterion("updateorigid not like", value, "updateorigid");
            return (Criteria) this;
        }

        public Criteria andUpdateorigidIn(List<String> values) {
            addCriterion("updateorigid in", values, "updateorigid");
            return (Criteria) this;
        }

        public Criteria andUpdateorigidNotIn(List<String> values) {
            addCriterion("updateorigid not in", values, "updateorigid");
            return (Criteria) this;
        }

        public Criteria andUpdateorigidBetween(String value1, String value2) {
            addCriterion("updateorigid between", value1, value2, "updateorigid");
            return (Criteria) this;
        }

        public Criteria andUpdateorigidNotBetween(String value1, String value2) {
            addCriterion("updateorigid not between", value1, value2, "updateorigid");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(String value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(String value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(String value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(String value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(String value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLike(String value) {
            addCriterion("updatetime like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotLike(String value) {
            addCriterion("updatetime not like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<String> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<String> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(String value1, String value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(String value1, String value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
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