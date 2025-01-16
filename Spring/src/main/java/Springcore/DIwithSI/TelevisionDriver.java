package Springcore.DIwithSI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TelevisionDriver {
public static void main(String[] args) {
	ClassPathResource cpr = new ClassPathResource("Mycore.xml");
	BeanFactory bf = new XmlBeanFactory(cpr);
	
	Television tel = (Television) bf.getBean("mytelevision");
	Remote remote = tel.getRem();
	remote.work();
}
}
