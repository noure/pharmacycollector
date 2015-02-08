package ma.nour.phar.service;

import java.util.List;

import ma.nour.phar.entity.User;
import ma.nour.phar.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public void save(User customer) {
		userRepository.save(customer);
	}

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findOne(int id) {
		return userRepository.findOne(id);
	}
}
