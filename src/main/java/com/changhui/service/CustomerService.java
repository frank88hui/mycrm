package com.changhui.service;

import com.changhui.pojo.Customer;
import com.changhui.pojo.QueryVo;
import com.changhui.utils.Page;

public interface CustomerService {

    Page<Customer> findCustomerListByCondition(QueryVo queryVo);

    Customer selectCustomerById(Integer id) ;

    void updateCustomer(Customer customer);

    void deleteCustomer(Long id);
}
