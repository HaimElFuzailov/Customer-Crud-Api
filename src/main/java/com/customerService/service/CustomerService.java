package com.customerService.service;

import com.customerService.model.Customer;

import java.util.List;

public interface CustomerService {

    void createCustomer(Customer customer) throws Exception;

    void updateCustomerById(Long customerId, Customer customer) throws Exception;

    void deleteCustomerById(Long id);

    Customer getCustomerById(Long id);

    List<Customer> getCustomersByFirstName(String firstName);

    List<Customer> getAllCustomers();

    List<Long> getCustomerIdsByFirstName(String firstName);
}
