package com.pratik.user;


import com.pratik.DAO.DAO_Factory;
import com.pratik.DAO.DAO_Interface;
import com.pratik.utility.HibernateUtil;

public class ClientApp_LT_GT_LE_GE_EQ {

	public static void main(String[] args) {

		//use DAO
		DAO_Interface dao=DAO_Factory.getInstance();
		//call method
			dao.restricions();
			//close the session factory
			HibernateUtil.closeFactory();

	}

}
