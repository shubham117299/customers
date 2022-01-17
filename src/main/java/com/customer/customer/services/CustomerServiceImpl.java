package com.customer.customer.services;

import com.customer.customer.Dao.CustomerDao;
import com.customer.customer.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerServices{

    @Autowired
    private CustomerDao customerDao;

    //List<Customer> list;

    public CustomerServiceImpl(){
//        list=new ArrayList<>();
//        list.add(new Customer(1,"Customer1","Address1",1111111111));
//        list.add(new Customer(2,"Customer2","Address2",1111111111));
//        list.add(new Customer(3,"Customer3","Address3",1111111111));
//        list.add(new Customer(4,"Customer4","Address4",1111111111));
//        list.add(new Customer(5,"Customer5","Address5",1111111111));

    }

    @Override
    public List<Customer> getCustomer() {

        return customerDao.findAll();
    }
}
