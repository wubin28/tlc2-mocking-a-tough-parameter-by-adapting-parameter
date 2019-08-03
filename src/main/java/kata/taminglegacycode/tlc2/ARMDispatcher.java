package kata.taminglegacycode.tlc2;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class ARMDispatcher {

    public void execute(HttpServletRequest httpServletRequest) {
        Map<String, String> marketBindings = new HashMap<>();
        String pageStateName = "normal";
        populate(httpServletRequest, pageStateName, marketBindings);
    }

    public void populate(HttpServletRequest httpServletRequest, String pageStateName, Map<String, String> marketBindings) {
        String[] values = httpServletRequest.getParameterValues(pageStateName);
        if (values != null && values.length > 0) {
            marketBindings.put(pageStateName + getDateStamp(), values[0]);
        }
    }

    private String getDateStamp() {
        return null;
    }
}
