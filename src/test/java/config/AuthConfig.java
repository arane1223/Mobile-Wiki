package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:auth.properties"
})
public interface AuthConfig extends Config {

    @Key("userName")
    String userName();

    @Key("accessKey")
    String accessKey();
}
