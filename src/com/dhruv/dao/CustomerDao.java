package com.dhruv.dao;

import com.dhruv.bean.Customer;

/**
 * @author Dhruv Interface class for DAO layer . Gets the input as customer id
 *         and interacts with Database.For the time , values are hard coded.
 */
public interface CustomerDao {
	public Customer searchCust(int CustId);
}
