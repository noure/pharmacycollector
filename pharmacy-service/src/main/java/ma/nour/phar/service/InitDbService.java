package ma.nour.phar.service;

import javax.annotation.PostConstruct;

import ma.nour.phar.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitDbService {

	@Autowired
	private UserService userrService;

	@PostConstruct
	public void init() {
		{
			User customer = new User();
			customer.setName("Yaaqoubi");
			userrService.save(customer);
		}
		{
			User customer = new User();
			customer.setName("Toumanari");
			userrService.save(customer);
		}
	}
}
