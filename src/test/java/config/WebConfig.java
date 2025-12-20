package config;

import org.aeonbits.owner.Config;


@Config.Sources({
        "classpath:${prop}.properties",
        "classpath:local.properties"
})
public interface WebConfig extends Config {

    @Key("base.url")
    String baseUrl();

    @Key("browser")
    String browser();

    @Key("browser.version")
    String browserVersion();

    @Key("is.remote")
    boolean isRemote();

    @Key("remote.url")
    String remoteUrl();

}
