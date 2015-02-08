package ma.nour.phar.entity;

/**
 * this class is just for testing 
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {

	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	
}
