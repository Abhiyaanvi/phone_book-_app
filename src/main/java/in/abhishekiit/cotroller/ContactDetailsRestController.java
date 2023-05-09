package in.abhishekiit.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.abhishekiit.entity.ContactDetails;
import in.abhishekiit.service.ContactDetailsService;

@RestController
public class ContactDetailsRestController {
	
	@Autowired
	private ContactDetailsService service;
	
    @PostMapping(value="/api",consumes = {"application/json"},
    		produces= {"application/json"})
	public ResponseEntity<ContactDetails>createContact(@RequestBody ContactDetails details){
    	ContactDetails newdetails = service.createContact(details);	
		return new ResponseEntity<>(details,HttpStatus.CREATED);
	}
	
    @GetMapping(value="/api/contacts",produces= {"application/json"})
    public List<ContactDetails> getAllContacts() {
    	
    	 List<ContactDetails> allContact = service.getAllContact();
    	 
    	 return allContact;
    }
	
    @GetMapping(value="/api/{id}",produces= {"application/json"})
    public ContactDetails getContactById(@PathVariable("id") long id) {
    	ContactDetails details = service.getContactById(id);
    	return details;
    }
    
    @PutMapping(value = "/api/{id}")
    public ResponseEntity<ContactDetails> updateContact(@RequestBody ContactDetails details, @PathVariable("id") long id) {
    	ContactDetails update = service.updateDetailById(details, id);
    	return new ResponseEntity<>(update,HttpStatus.OK);
    }
    
    @DeleteMapping("/api/{id}")
    public ResponseEntity<String> deleteContactById(@PathVariable("id") long id) {
    	service.deleteById(id);
    	return new ResponseEntity<>("contact Deleted successfully",HttpStatus.OK);
    }
}
