package drivers;

public class CustomDriverSelector {
    public static String choose() {
        String deviceHost = System.getProperty("deviceHost", "emulation");
        switch (deviceHost) {
            case "browserstack":
                return "drivers.BrowserstackDriver";
            case "real":
                System.setProperty("env", "local-real");
                return "drivers.LocalDriver";
            case "emulation":
            default:
                System.setProperty("env", "local-emul");
                return "drivers.LocalDriver";
        }
    }
}
