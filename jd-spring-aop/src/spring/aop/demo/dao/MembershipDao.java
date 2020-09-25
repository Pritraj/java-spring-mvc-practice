package spring.aop.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDao {

	public void addAccount() {
		System.out.println(getClass() + ":: Saving to membership.Account table");
	}
	
	public String addSilly(String str) {
		System.out.println(getClass() + ":: Saving to membership.Silly table");
		return str;
	}
	
}
