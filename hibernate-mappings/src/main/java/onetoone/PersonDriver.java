package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDriver {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	
	Person person = new Person();
	person.setName("Chaitanya");
	person.setAge(22);
	
	Pan pan = new Pan();
	pan.setPannumber("ABC123");
	pan.setAddress("Bangalore");
	
	person.setPancard(pan);
	pan.setPerson(person);
	
	et.begin();
	em.persist(pan);
	em.persist(person);
	et.commit();
}
}
