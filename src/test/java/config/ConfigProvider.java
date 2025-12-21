package config;

import org.aeonbits.owner.ConfigFactory;

public final class ConfigProvider {

    private ConfigProvider() {}
    
    private static final WebConfig webConfig = ConfigFactory.create(
            WebConfig.class, System.getProperties()
    );

    public static WebConfig webConfig() {
        return webConfig;
    }
}
