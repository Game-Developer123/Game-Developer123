package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDetails {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	
	Country country = em.find(Country.class, 1);
	System.out.println("Country Name: "+country.getName());
	System.out.println("Country population: "+country.getPopulation());
	
	Primeminister primeminister = country.getPrimeminister();
	System.out.println("Minister Name: "+primeminister.getName());
	System.out.println("Minister Age: "+primeminister.getAge());
}
}
