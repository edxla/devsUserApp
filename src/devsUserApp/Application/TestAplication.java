package devsUserApp.Application;

import java.util.ServiceLoader;

import com.devsUsersDB.user.auth.UserDatabaseAuthentication;

public class TestAplication {
	public static void main(String[] args) {
		
		ServiceLoader<UserDatabaseAuthentication> service = ServiceLoader.load(UserDatabaseAuthentication.class);
		//servicios a utilizar segmentar aplicaciones
		service.
		forEach(s-> s.authenticate("Raiden", "Java"));
	
	
	}

}
