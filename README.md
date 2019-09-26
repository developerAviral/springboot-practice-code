# springboot-practice-code
Spring Boot – Assignments


General Instructions:

a.	Use the STS or IntelliJ Idea IDE for these assignments.
b.	Use MySQL or any other appropriate database for the assignments wherever applicable.
c.	Use Maven build tool/ Maven build based applications.

1.	Assignment-1:

Create a Spring Boot Application based on the below requirement:
a.	The application should support two restful URLs.
b.	The first restful URL should display the bank Name as a String
c.	The second restful URL should display the bank Address as a String
d.	We would also be interested to see the list of all the default beans that were created by Spring Boot automatically in the console.
e.	Test the application by executing and viewing the console to see the list of beans and also test both the URLs to verify that they return and display data as expected.


2.	Assignment-2:

Create a Spring Boot Application based on the below requirement:
a.	The application should support two restful URLs.
b.	The first restful URL should display an HTML page that displays the Bank Name as its heading and also a table with around 10 branches of that bank in the city of Bangalore.
c.	The second restful URL should display an HTML page that displays the Bank Name as its heading and also a table with all services provided by the bank
d.	Test the application by testing both the URLs to verify that they return and display data as expected.

3.	Assignment-3:

Add an additional facility to the previous Assignment-2 solution project, as per the below requirement:
a.	A client would also be interested to know the health of this application so when the client uses the ‘/health’ path parameter after the application URL, it should show the health of the application (status of the application) as UP/DOWN.


4.	Assignment-4:

Create a Spring Boot Application as per the requirements below:
a.	The application should display a Form in the landing page (index.page) where the user can enter the ‘Employee’ details like ‘Employee ID’ , ‘Employee Name’ , ‘Employee Email’ and ‘Location’ and upon submission the data should be saved onto a database table
b.	The application should also support a ‘/displayAll’ path which shows the list of all the registered Employees.
c.	The application should also support a ‘/display/<userid>’ path where upon passing of userid as the parameter the details of only the particular Employee holding that Employee ID will be displayed.
d.	Code all the above functionalities required as a RESTful URL.


5.	Assignment-5:
	      Create a Spring Boot Application as per the requirements below:
a.	The application should store in a ‘Map’ the employee details like Employee ID’ , ‘Employee Name’ , ‘Employee Email’ and ‘Location’. (Hint: Map’s key can be ‘Employee ID’ and Value can be the Employee Object)
b.	The application should support all 4 operations of REST like:
a.	GET – using this the client should be able to get details of all registered employees and also be able to get employee details based on Employee ID which can be passed as a Path Parameter
b.	POST – using this method the client should be able to save an Employees details into the Map
c.	PUT – using this method the client should be able to update/modify the Employees details except for Employee ID
d.	DELETE – using this method the client should be able to delete an unwanted Employee record
c.	Test all the above functionalities using Chrome plug-ins/apps like Advanced REST client (ARC) or Postman


	

		
		


