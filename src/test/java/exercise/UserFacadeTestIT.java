package exercise;

import exercise.fakedatabase.UserFacadeFake;
import exercise.realdatabase.UserFacadeRealDB;

/**
 * Created by MJPS on 19/04/2017.
 */
public class UserFacadeTestIT extends UserFacadeTest{
	
	@Override
	public IUserFacade makeUserFacade() {
		//env variable that automatically selects the database
		if (System.getenv("TRAVIS") != null) {
			return new UserFacadeRealDB("pu_mySql_travis_Integration");
		}
		return new UserFacadeRealDB("pu_localDB");
	}
}
