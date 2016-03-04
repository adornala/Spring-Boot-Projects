package home.Springboot.ServiceController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import home.Springboot.Repository.SecurityRepository;

@Controller
public class securitycontroller{
	@Autowired
	private SecurityRepository repository;
	
	
	/*@RequestMapping(value = "/results", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Security>> getallResult(){
		List<Security> security = repository.findAll();
		return new ResponseEntity<>(security, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/results/{username}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Security>> getallResultbyid(@PathVariable("username")String id){
		List<Security> security = repository.findByusername(id);
		return new ResponseEntity<>(security, HttpStatus.OK);
	}
}	*/
	
	@RequestMapping(value="/home")
	public String searchform(Model model){
		return "searchform";
	}
	
	@RequestMapping(value = "/results", method = RequestMethod.GET)
	public String showAllUsers(Model model){
		model.addAttribute("users", repository.findAll());
		return "results :: resultslist";
	}
	@RequestMapping(value = "/results/{id}", method = RequestMethod.GET)
	public String showAllUsers(Model model,@PathVariable String id){
		model.addAttribute("users", repository.findOne(id));
		return "results :: resultslist";
	}
	
/*	@RequestMapping(value = "/results/{username}", method = RequestMethod.GET)
	public String showbyusername(Model model, @PathVariable("username") String username){
		model.addAttribute("users", repository.findByusername(username));
		return "result";
	}*/
}





















/*package home.Springboot.Trail1.ServiceController;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import home.Springboot.Trail1.Method.Security;
import home.Springboot.Trail1.Service.SecurityService;

@RestController
@RequestMapping("/api/Security")
public class SecurityController {
	private static Logger Log = LoggerFactory.getLogger(SecurityController.class);
	
	private final SecurityService  service;
	
	@Autowired
	public SecurityController(SecurityService service) {
		this.service = service;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	SecurityDTO create(@RequestBody @Valid SecurityDTO SecurityEntry){
		Log.info("Created a new Security with information: {} ", SecurityEntry);
		SecurityDTO created = service.create(SecurityEntry);
		Log.info("Created a new Security entry with information: {}", created);
		return created;
	}
	  @RequestMapping(path = "/Entries" , method = RequestMethod.GET)
	    List<Security> findAll() {
	        Log.info("Finding all Security entries total Size");

	        List<Security> todoEntries = service.findAll();
	        Log.info("Found {} todo entries", todoEntries.size());

	        return todoEntries;
	    }

	    @RequestMapping(value = "/Entries/{id}", method = RequestMethod.GET)
	    List<Security> findByUsername(@PathVariable("id") String username) {
	        Log.info("Finding Security entry with id: {}", username);
	        List<Security> todoEntry = service.findByusername(username);
	        Log.info("Found todo entry with information: {}", todoEntry);
	        return todoEntry;
	    }
	    
	    @ExceptionHandler
	    @ResponseStatus(HttpStatus.NOT_FOUND)
	    public void handleTodoNotFound(SecurityNotFoundException ex) {
	        Log.error("Handling error with message: {}", ex.getMessage());
	    }
}
*/