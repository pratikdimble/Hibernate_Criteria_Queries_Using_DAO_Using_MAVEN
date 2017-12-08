package com.pratik.user;

import java.util.List;


import com.pratik.DAO.DAO_Factory;
import com.pratik.DAO.DAO_Interface;
import com.pratik.domain.product;
import com.pratik.utility.HibernateUtil;

public class ClientApp {

	public static void main(String[] args) {

			//use DAO
		DAO_Interface dao=DAO_Factory.getInstance();
		//call method and get the list
		List<product> list=dao.list();
		//display the list
			list.forEach(row->{
				System.out.println(row);
			});
			//close the session factory
			HibernateUtil.closeFactory();
	}
	

}
