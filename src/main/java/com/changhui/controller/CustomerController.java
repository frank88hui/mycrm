package com.changhui.controller;

import com.changhui.pojo.BaseDict;
import com.changhui.pojo.Customer;
import com.changhui.pojo.QueryVo;
import com.changhui.service.BaseService;
import com.changhui.service.CustomerService;
import com.changhui.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private BaseService baseService;

    @Autowired
    private CustomerService customerService;

    @Value("${source}")
    private String customerSource;
    @Value("${industry}")
    private String customerIndustry;
    @Value("${level}")
    private String customerLevel;


    @RequestMapping("/list.action")
    public String customerList(Model model, QueryVo queryVo) {


        //查询客户来源
        List<BaseDict> cSource = baseService.findDictitemByCode(customerSource);
        List<BaseDict> cIndustry = baseService.findDictitemByCode(customerIndustry);
        List<BaseDict> cLevel = baseService.findDictitemByCode(customerLevel);


        model.addAttribute("fromType", cSource);
        model.addAttribute("industryType", cIndustry);
        model.addAttribute("levelType", cLevel);

        Page<Customer> page = customerService.findCustomerListByCondition(queryVo);

        model.addAttribute("page", page);

        return "customer";
    }

    @RequestMapping("/edit.action")
    @ResponseBody
    public Customer editCustomer(Integer id, Model model) {
        return customerService.selectCustomerById(id);
    }

    @RequestMapping("/update.action")
    public String updateCustomer(Customer customer, Model model) {
        customerService.updateCustomer(customer);

        return "customer";
    }

    @RequestMapping("/delete.action")
    public String deleteCustomer(Long id) {
        customerService.deleteCustomer(id);

        return "customer";
    }

}
