package onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompanyDRiver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Company company = new Company();
		company.setName("Google");
		company.setCEO("Sundar Picchai");
		
		Employee employee1 = new Employee();
		employee1.setName("Chaitanya");
		employee1.setExperience(2);
		employee1.setRole("Developer");
		
		Employee employee2 = new Employee();
		employee2.setName("Lokesh");
		employee2.setExperience(1);
		employee2.setRole("Tester");	
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		
		company.setEmployees(employees);
		
		et.begin();
		em.persist(company);
		em.persist(employee1);
		em.persist(employee2);
		et.commit();
		
		
	}
}
