package in.abhishekiit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.abhishekiit.entity.ContactDetails;

public interface ContactDetailsRepository extends JpaRepository<ContactDetails,Long> {
	
	public ContactDetails findById(long id);

}
