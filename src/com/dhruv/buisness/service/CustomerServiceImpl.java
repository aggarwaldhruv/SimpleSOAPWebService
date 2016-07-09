package com.dhruv.buisness.service;

import com.dhruv.bean.Customer;
import com.dhruv.dao.CustomerDao;
import com.dhruv.dao.CustomerDaoImpl;
/**
 * @author Dhruv Implemented class for Service layer Gets the input as customer id
 *         and interacts with DAO class.
 */
public class CustomerServiceImpl implements CustomerService {

	@Override
	public Customer custSearch(int custId) {
		CustomerDao custDao=new CustomerDaoImpl();
		return	custDao.searchCust(custId);
	}

}
