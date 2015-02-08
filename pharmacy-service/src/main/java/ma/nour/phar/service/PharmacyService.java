package ma.nour.phar.service;

import java.util.List;

import ma.nour.phar.entity.Pharmacy;
import ma.nour.phar.repository.PharmacyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PharmacyService {

	@Autowired
	private PharmacyRepository pharmacyRepository;

	public void save(Pharmacy pharmacie) {
		pharmacyRepository.save(pharmacie);
	}

	public List<Pharmacy> findAll() {
		return pharmacyRepository.findAll();
	}

	public Pharmacy findOne(int id) {
		return pharmacyRepository.findOne(id);
	}

	public Pharmacy findByName(String name) {
		return pharmacyRepository.findByName(name);

	}

}
