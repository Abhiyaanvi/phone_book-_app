package in.abhishekiit.service;

import java.util.List;

import in.abhishekiit.entity.ContactDetails;

public interface ContactDetailsService {

	public ContactDetails createContact(ContactDetails details);
	
     public List<ContactDetails> getAllContact();
     
     public ContactDetails getContactById(long id);
     
     public ContactDetails updateDetailById(ContactDetails details, long id);
     
     public void deleteById(long id);
	
}
