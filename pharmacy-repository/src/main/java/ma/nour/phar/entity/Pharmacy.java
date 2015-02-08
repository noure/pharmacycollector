package ma.nour.phar.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
/**
 * A pharmacy has an Id, name, address and tele
 * a pharmacy is totaly specified by her name and address 
 */

@Entity
@Data
public class Pharmacy {

	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	private String address;
	
	private String tele;
}
