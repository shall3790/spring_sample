package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		// create
		Customer c1 = new Customer();
		c1.setFirstname("Bob");
		c1.setLastname("Jones");
		// add
		customers.add(c1);
		return customers;
	}
}

