import com.devsUsersDB.user.auth.UserDatabaseAuthentication;

module com.amazarashi.devsUserApp {
	requires com.amazarashi.devsUsersDB;
	//Interfax
	uses UserDatabaseAuthentication;
}