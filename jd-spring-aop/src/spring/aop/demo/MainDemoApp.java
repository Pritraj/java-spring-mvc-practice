package spring.aop.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.aop.demo.dao.AccountDao;
import spring.aop.demo.dao.MembershipDao;

public class MainDemoApp {

	public static void main(String[] args) {
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		// get the bean from container
		AccountDao accountDao = context.getBean("accountDao", AccountDao.class);
		MembershipDao membershipDao = context.getBean("membershipDao", MembershipDao.class);
		// call the business method
		
		membershipDao.addAccount();
		membershipDao.addSilly("Boy");
		accountDao.addAccount();
		//close the context
		
		context.close();

	}

}
