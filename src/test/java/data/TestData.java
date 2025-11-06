package data;

import config.AuthConfig;
import org.aeonbits.owner.ConfigFactory;

public class TestData {
    protected static AuthConfig authData = ConfigFactory.create(AuthConfig.class);

    public static final String USER_NAME = authData.userName();
    public static final String ACCESS_KEY = authData.accessKey();
}
