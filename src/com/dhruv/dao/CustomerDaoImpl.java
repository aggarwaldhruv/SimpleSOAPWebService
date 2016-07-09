package com.dhruv.dao;

/**
 * @author Dhruv Implemented class for DAO layer . Gets the input as customer id
 *         and interacts with Database.For the time , values are hard coded.
 */

import java.util.ArrayList;
import java.util.List;

import com.dhruv.bean.Customer;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public Customer searchCust(int custId) {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		Customer c4 = new Customer();
		Customer c5 = new Customer();

		c1.setAge(10);
		c1.setId(1);
		c1.setName("Abc");
		c2.setAge(10);
		c2.setId(1);
		c2.setName("Abc");
		c3.setAge(10);
		c3.setId(1);
		c3.setName("Abc");
		c4.setAge(10);
		c4.setId(1);
		c4.setName("Abc");
		c5.setAge(10);
		c5.setId(1);
		c5.setName("Abc");

		List<Customer> list = new ArrayList<>();

		list.add(c5);
		list.add(c4);
		list.add(c3);
		list.add(c2);
		list.add(c1);

		for (Customer cust : list) {
			if (cust.getId() == custId) {
				return cust;
			}
		}

		return null;
	}

}
