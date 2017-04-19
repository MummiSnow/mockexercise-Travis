package exercise;

import exercise.fakedatabase.UserFacadeFake;
import exercise.realdatabase.UserFacadeRealDB;

/**
 * Created by MJPS on 19/04/2017.
 */
public class UserFacadeTestIT extends UserFacadeTest{
	
	@Override
	public IUserFacade makeUserFacade() {
		return new UserFacadeRealDB("pu_locaB");
	}
}
