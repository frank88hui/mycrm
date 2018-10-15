package com.changhui.dao;

import com.changhui.pojo.Customer;
import com.changhui.pojo.CustomerExample;
import java.util.List;
import com.changhui.pojo.QueryVo;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {
    long countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(Long cust_id);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(Long cust_id);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> getCustomerListWithCondition(QueryVo queryVo);

    int getTotalResult(QueryVo queryVo);

}