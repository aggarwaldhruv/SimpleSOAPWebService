package com.dhruv.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.dhruv.bean.Customer;
import com.dhruv.buisness.service.CustomerService;
import com.dhruv.buisness.service.CustomerServiceImpl;

/**
 * @author Dhruv Class interacts with Client and produces the outputs
 *         correspondingly . Using Annotations for Soap Web services.
 */

@WebService
public class CustomerWSImpl implements CustomerWS {

	/**
	 * Receives Customer Id and search for it and produces the results
	 * 
	 * @param CustId
	 */
	@WebMethod
	@Override
	public Customer searchCust(int CustId) {
		CustomerService custService = new CustomerServiceImpl();
		return custService.custSearch(CustId);
	}
}
