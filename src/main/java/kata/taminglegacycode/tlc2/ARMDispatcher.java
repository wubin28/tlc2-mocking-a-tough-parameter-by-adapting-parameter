package kata.taminglegacycode.tlc2;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class ARMDispatcher {

    public void execute(HttpServletRequest httpServletRequest) {
        Map<String, String> marketBindings = new HashMap<>();
        String pageStateName = "normal";
        populate(new ServletParameterSource(httpServletRequest), pageStateName, marketBindings);
    }

    public void populate(ParameterSource source, String pageStateName, Map<String, String> marketBindings) {
        String value = source.getParameterForName(pageStateName);
        if (value != null) {
            marketBindings.put(pageStateName + getDateStamp(), value);
        }
    }

    private String getDateStamp() {
        return null;
    }
}
