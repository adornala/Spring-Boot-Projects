package home.Springboot.Trail1.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import home.Springboot.Trail1.Method.Security;

public interface SecurityRepository extends CrudRepository<Security , String> {
	//void delete(Security deleted);
	List<Security> findAll();
	List<Security> findByusername(String username);
	//Security save(Security save);

	List<Security> findByPassword(String password);
}
