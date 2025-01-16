package Springcore.constructorinjecton;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MobileDriver {

	public static void main(String[] args) {
		ClassPathResource cpr = new ClassPathResource("constructorinjection.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		
		Mobile mob = (Mobile) bf.getBean("mysim");
		sim.
	}
}
