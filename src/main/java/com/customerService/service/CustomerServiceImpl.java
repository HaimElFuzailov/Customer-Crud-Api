package com.customerService.service;

import com.customerService.model.Customer;
import com.customerService.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.createCustomer(customer);
    }

    @Override
    public void updateCustomerById(Long customerId, Customer customer) {
        customerRepository.updateCustomerById(customerId, customer);
    }

    @Override
    public void deleteCustomerById(Long id) {
        deleteCustomerById(id);
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.getCustomerById(id);
    }

    @Override
    public List<Customer> getCustomersByFirstName(String firstName) {
        return customerRepository.getCustomersByFirstName(firstName);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }

    @Override
    public List<Long> getCustomerIdsByFirstName(String firstName) {
        return customerRepository.getCustomerIdsByFirstName(firstName);
    }
}


