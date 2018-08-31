package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.*;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepo = new HibernateCustomerRepositoryImpl();

	
	/* (non-Javadoc)
	 * @see com.pluralsight.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}
}
