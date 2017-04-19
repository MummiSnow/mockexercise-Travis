package exercise;

import Utils.Mailer;
import exercise.fakedatabase.UserFacadeFake;
import exercise.realdatabase.UserFacadeRealDB;

import static org.mockito.Mockito.mock;

/**
 * Created by MJPS on 19/04/2017.
 */
public class AuthenticatorTestIT extends AuthenticatorTest {
	
	@Override
	public Authenticator makeAuthenticator() {
		Mailer mailer = mock(Mailer.class);
		//env variable that automatically selects the database
		if (System.getenv("TRAVIS") != null) {
			return new Authenticator(new UserFacadeRealDB("pu_mySql_travis_Integration"),mailer);
		}
		return new Authenticator(new UserFacadeRealDB("pu_localDB"), mailer);
	}
}
