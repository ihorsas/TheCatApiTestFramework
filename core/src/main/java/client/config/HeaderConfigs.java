package client.config;

import java.util.HashMap;
import java.util.Map;

public class HeaderConfigs {

    public static Map<String, String> getAuthorizedHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("x-api-key", "820b9c47-eae6-4660-9fdd-91644a5aaf47");
        return headers;
    }
}
