package in.abhishekiit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.abhishekiit.entity.ContactDetails;
import in.abhishekiit.repository.ContactDetailsRepository;

@Service
public class ContactDeatilsServiceImpl  implements ContactDetailsService {
	
	@Autowired
	private ContactDetailsRepository contactRepo;

	@Override
	public ContactDetails createContact(ContactDetails details) {
		
		return contactRepo.save(details);
	}

	@Override
	public List<ContactDetails> getAllContact() {
	     
		return contactRepo.findAll();
	}

	@Override
	public ContactDetails getContactById(long id) {
	
		return contactRepo.findById(id);
	}

	@Override
	public ContactDetails updateDetailById(ContactDetails details, long id) {
		
		 ContactDetails Details = contactRepo.findById(id);
		
		 return Details;
	}

	@Override
	public void deleteById(long id) {
	
		
		ContactDetails contactDetails = contactRepo.findById(id);
		contactRepo.delete(contactDetails);
		
	}

	
	
	

}
