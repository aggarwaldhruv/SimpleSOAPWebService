package com.dhruv.buisness.service;

import com.dhruv.bean.Customer;

/**
 * @author Dhruv Interface class for Service layer Gets the input as customer id
 *         and interacts with DAO class.
 */
public interface CustomerService {
	public Customer custSearch(int custId);
}
