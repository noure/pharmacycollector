package ma.nour.phar.repository;

import ma.nour.phar.entity.Pharmacy;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Integer> {
		/**
		 * this methode return a pharmacy from the database with qualified name passed in paramater
		 */
	Pharmacy findByName(String name);

}
