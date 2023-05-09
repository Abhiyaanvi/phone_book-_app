package in.abhishekiit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name= "userContact")
@Data
public class ContactDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long id;
	public String name;
	public String email;
	public String phno;
	public String adress;
	

}
