package org.emp;

import org.Project.Project;
import org.client.Client;
import org.company.Company;

public class Employee {
	public void empName() {
		System.out.println("Dinesh");

	}
public static void main(String[] args) {
	Employee e = new Employee();
	e.empName();
	Company c = new Company();
	c.companyName();
	Client i = new Client();
	i.clientName();
	Project p =new Project();
	p.projectName();
}
}
