package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties",
        "classpath:local-real.properties"
})
public interface LocalConfig extends Config {

    @Key("platformVersion")
    String platformVersion();

    @Key("deviceName")
    String deviceName();
}
