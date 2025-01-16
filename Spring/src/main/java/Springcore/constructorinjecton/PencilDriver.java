package Springcore.constructorinjecton;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PencilDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathResource cpr = new ClassPathResource("constructorinjection.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		Pencil pencil = (Pencil) bf.getBean("myPencil");
		Pencil pencil1 = (Pencil) bf.getBean("myPencil");
		System.out.println(pencil);
		System.out.println(pencil1);
	}

}
