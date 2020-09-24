package spring.aop.demo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {

	public void addAccount() {
		System.out.println(getClass() + ":: Saving to account table");
	}
}
