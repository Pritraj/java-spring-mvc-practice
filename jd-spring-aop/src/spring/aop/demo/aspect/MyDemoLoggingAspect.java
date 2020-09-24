package spring.aop.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	//collection of advice before and after
	
	@Before("execution(public void addAccount())")
	public void beforeAddAccount() {
		System.out.println("===> I am running before addAccount using DeloLoggingAspect ===> \n");
	}
}
