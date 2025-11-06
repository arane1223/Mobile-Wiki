package data;

import config.BrowserstackConfig;
import org.aeonbits.owner.ConfigFactory;

public class BrowserstackData {
    protected static BrowserstackConfig browserstackConfig = ConfigFactory.create(BrowserstackConfig.class);

    public static final String USER_NAME = browserstackConfig.userName();
    public static final String ACCESS_KEY = browserstackConfig.accessKey();
    public static final String APP = browserstackConfig.app();
    public static final String DEVICE = browserstackConfig.device();
    public static final String OS_VERSION = browserstackConfig.osVersion();
}
