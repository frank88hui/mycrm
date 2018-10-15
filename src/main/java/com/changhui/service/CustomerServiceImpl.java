package com.changhui.service;

import com.changhui.dao.CustomerMapper;
import com.changhui.pojo.Customer;
import com.changhui.pojo.CustomerExample;
import com.changhui.pojo.QueryVo;
import com.changhui.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;


    public Page<Customer> findCustomerListByCondition(QueryVo queryVo) {

        Page<Customer> customerPage = new Page<>();

        int start = (queryVo.getPage() - 1) * queryVo.getSize();

        queryVo.setStart(start);

        List<Customer> customerList = customerMapper.getCustomerListWithCondition(queryVo);

        //总记录数
        int total = customerMapper.getTotalResult(queryVo);

        customerPage.setRows(customerList);
        customerPage.setPage(queryVo.getPage());
        customerPage.setSize(queryVo.getSize());
        customerPage.setTotal(total);

        return customerPage;
    }

    @Override
    public Customer selectCustomerById(Integer id) {

        return customerMapper.selectByPrimaryKey(id.longValue());
    }

    @Override
    public void updateCustomer(Customer customer) {
        Long cust_id = customer.getCust_id();
        CustomerExample customerExample = new CustomerExample();
        customerExample.createCriteria().andCust_idEqualTo(cust_id);
        customerMapper.updateByExampleSelective(customer,customerExample);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerMapper.deleteByPrimaryKey(id);
    }
}
