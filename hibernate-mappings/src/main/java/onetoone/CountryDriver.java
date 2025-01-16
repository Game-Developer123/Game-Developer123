package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CountryDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Country country1 = new Country();
		country1.setId(1);
		country1.setName("India");
		country1.setPopulation("143 Crores");
		
		Country country2 = new Country();
		country2.setId(2);
		country2.setName("USA");
		country2.setPopulation("30 Crores");
		
		Primeminister pm = new Primeminister();
		pm.setId(1);
		pm.setName("Modi ji");
		pm.setAge(10);
		
		Primeminister pm1 = new Primeminister();
		pm1.setId(2);
		pm1.setName("Trump");
		pm1.setAge(20);
		
		country1.setPrimeminister(pm);
		country2.setPrimeminister(pm1);
		
		et.begin();
		em.persist(country1);
		em.persist(country2);
		em.persist(pm);
		em.persist(pm1);
		et.commit();

	}
}
