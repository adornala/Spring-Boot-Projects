package home.Springboot.Method;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Security.findAll", query="SELECT s FROM Security s")
public class Security implements Serializable {
	private static final long serialVersionUID = 1L;
	
	static final int MAX_LENGTH_PASSWORD = 25;
    static final int MAX_LENGTH_USERNAME = 15;
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	private String password;

	private String username;

	public Security() {
	}

	/*private Security(Builder builder){
		this.username = builder.username;
		this.password = builder.password;
	}
	
	public static Builder getBuilder() {
        return new Builder();
    }*/
	
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Security [id=" + id + ", password=" + password + ", username=" + username + "]";
	}
	
	/*public static class Builder{
		private String username;
		
		private String password;

		public Builder() {
			super();
		}

		public Builder username(String username) {
			this.username = username;
			return this;
		}

		public Builder password(String password) {
			this.password = password;
			return this;
		}
		
		public Security build(){
			Security build = new Security(this);
			//build.checkusernameandpassword(build.getUsername(), build.getPassword());
			return build;
		}
		*/
		
		
		
		
		
	//}

/*	public void checkusernameandpassword(String username, String password) {
		
	}

	public void update(String username, String password) {
		checkusernameandpassword(username, password);
		this.username = username;
		this.password = password;
	}*/

}