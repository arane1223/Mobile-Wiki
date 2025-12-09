package drivers;

public class CustomDriverSelector {
    public static String choose() {
        String deviceHost = System.getProperty("deviceHost", "emulation");

        if ("browserstack".equals(deviceHost)) {
            return "drivers.BrowserstackDriver";
        }

        System.setProperty("env", deviceHost.equals("real") ? "local-real" : "local-emul");
        return "drivers.LocalDriver";
    }
}
