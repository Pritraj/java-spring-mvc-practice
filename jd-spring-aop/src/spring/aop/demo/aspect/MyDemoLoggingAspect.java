package spring.aop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	//collection of advice before and after
	
	
	// expression pattern =>
	// modifier? returnType declaringType? methodName throws?
	// ? => optional ## else mandatory
	

	//@Before("execution(public void updateAccount())")
	//@Before("execution(public void addAccount())")
	//@Before("execution(public void spring.aop.demo.dao.AccountDao.addAccount())")
	//@Before("execution(public void add*())")
	@Before("execution(public * add*())")
	public void beforeAddAccount() {
		System.out.println("\n===> I am running before advice from DemoLoggingAspect ===> \n");
	}
}
