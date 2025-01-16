package secondlevelcacheing;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityManager em1 = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Student s = new Student();
	s.setId(3);
	s.setName("C");
	s.setAge(22);
	
	et.begin();
	em.persist(s);
	et.commit();
	
	em.find(Student.class, 1);
	em1 .find(Student.class, 3);
}
}
