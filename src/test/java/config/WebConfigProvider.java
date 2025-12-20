package config;

import org.aeonbits.owner.ConfigFactory;

public class WebConfigProvider {
    private static final WebConfig webConfig = ConfigFactory.create(
            WebConfig.class, System.getProperties()
    );

    public static WebConfig webConfig() {
        return webConfig;
    }
}
