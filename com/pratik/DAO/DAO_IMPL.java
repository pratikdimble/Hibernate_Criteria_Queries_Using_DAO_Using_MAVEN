package com.pratik.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.pratik.domain.product;
import com.pratik.utility.HibernateUtil;

public class DAO_IMPL implements DAO_Interface {

@Override
public List<product> list() {
	Session ses=null;
	//get the session
	ses=HibernateUtil.getSession();
	//create criteria
	Criteria c=ses.createCriteria(product.class);
	//execute the Criteria
	List<product> list=c.list();
	//close the session
	HibernateUtil.closeSession(ses);
	return list;
}
	
	//all restriction criteria app
	@Override
	public void restricions() {
		Session ses=null;
		//get the session
		ses=HibernateUtil.getSession();
		
			System.out.println("\n\tPRICE Less than 500");
			//create criteria
		Criteria c=ses.createCriteria(product.class);
		//create criterion objects for the restriction methods
		Criterion lt=Restrictions.lt("price", 500f);
		//add restriction to criteria
		c.add(lt);
		//execute the Criteria
		List<product> list=c.list();
		//display the list
			list.forEach(row->{
				System.out.println(row);
			});
			
		System.out.println("\n\tPRICE Greater than 500");
		
		Criteria c1=ses.createCriteria(product.class);
		
		Criterion gt=Restrictions.gt("price", 500f);
		c1.add(gt);
		List<product> list1=c1.list();
			list1.forEach(row->{
				System.out.println(row);
			});
			
	System.out.println("\n\tPRICE Less than or Equal 500");
			Criteria c2=ses.createCriteria(product.class);
			
			Criterion le=Restrictions.le("price", 500f);
			c2.add(le);
			List<product> list2=c2.list();
				list2.forEach(row->{
					System.out.println(row);
				});
				
				System.out.println("\n\tPRICE Greater than or Equal 500");
						Criteria c3=ses.createCriteria(product.class);
						
						Criterion ge=Restrictions.ge("price", 500f);
						c3.add(ge);
						List<product> list3=c3.list();
							list3.forEach(row->{
								System.out.println(row);
							});
							
							
									Criteria c4=ses.createCriteria(product.class);
									
									Criterion eq=Restrictions.eq("price", 500f);
									c4.add(eq);
									List<product> list4=c4.list();
									System.out.println("\n\tPRICE  Equal 500");
										list4.forEach(row->{
											System.out.println(row);
										});
										//close the session
										HibernateUtil.closeSession(ses);
	}//method list close

}//class close
