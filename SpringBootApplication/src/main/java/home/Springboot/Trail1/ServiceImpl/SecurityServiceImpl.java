/*package home.Springboot.Trail1.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import home.Springboot.Trail1.Method.Security;
import home.Springboot.Trail1.Repository.SecurityRepository;
import home.Springboot.Trail1.Service.SecurityService;

@Service
final class SecurityServiceImpl implements SecurityService {
	
	private final static Logger Log = LoggerFactory.getLogger(SecurityServiceImpl.class);
	
	private final SecurityRepository repository;
	
	@Autowired
	public SecurityServiceImpl(SecurityRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public SecurityDTO create(SecurityDTO security) {
		Log.info("Create a new Entry with information : {}", security);
		Security persisted = Security.getBuilder().username(security.getPassword()).password(security.getPassword()).build();
		persisted = repository.save(persisted);
		Log.info("Creatred a new Security with information: {}", persisted);
		return convertToDTO(persisted);
	}

	@Override
	public SecurityDTO delete(String id) {
		Log.info("Deleting a Security Entry: {}", id);
		Security deleted = findSecurityByusername(id);
		repository.delete(deleted);
		Log.info("Deleted todo entry with informtation: {}", deleted);
		return convertToDTO(deleted);
	}

	@Override
	public List<Security> findAll() {
		Log.info("Finding All Security Entries");
		List<Security> entries	= repository.findAll();
		Log.info("Found {} Security Entries", entries.size());
		return entries;
	}
	
	private List<SecurityDTO> convertToDTO(List<Security> model){
		return model.stream().map(this::convertToDTO).collect(toList());
	}

	@Override
	public Security findByUsername(String username) {
		Log.info("Find Security Entri by Id : {}", username);
		Security found = findSecurityByusername(username);
		Log.info("Found Security Entry : {}", found);
		return found;
	}

	@Override
	public List<Security> findByusername(String username) {
		Log.info("Find Security Entri by Id : {}", username);
		List<Security> found = findByusername(username);
		Log.info("Found Security Entry : {}", found);
		return found;
	}

	@Override
	public Security update(Securitytodo) {
		Log.info("Updating todo entry with information: {}", todo);
		
		Security updated = findSecurityByusername(todo.getId());
		updated.update(todo.getUsername(),todo.getPassword());
		updated = repository.save(updated);
		
		Log.info("Updated Security entry with information {}", updated);
		return convertToDTO(updated);
	}
	
}
*/