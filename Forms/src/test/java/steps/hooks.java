package steps;

import helpers.userLogin;
import io.cucumber.java.Before;


public class hooks extends userLogin {

    //static userLogin userOptions = new userLogin();

    @Before
    public void before() {
        //userOptions.loginUser();
        loginUser();
    }
}
