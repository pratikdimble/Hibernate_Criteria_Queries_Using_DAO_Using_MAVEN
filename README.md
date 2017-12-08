# -Hibernate_Criteria_Queries
Hibernate provides alternate ways of manipulating objects and in turn data available in RDBMS tables. One of the methods is Criteria API, which allows you to build up a criteria query object programmatically where you can apply filtration rules and logical conditions.

The Hibernate Session interface provides createCriteria() method, which can be used to create a Criteria object that returns instances of the persistence object's class when your application executes a criteria query.

Following is the simplest example of a criteria query is one, which will simply return every object that corresponds to the Employee class.

Criteria cr = session.createCriteria(Employee.class);
List results = cr.list();

Restrictions with Criteria

You can use add() method available for Criteria object to add restriction for a criteria query. Following is the example to add a restriction to return the records with salary is equal to 2000 −

Criteria cr = session.createCriteria(Employee.class);
cr.add(Restrictions.eq("salary", 2000));
List results = cr.list();
