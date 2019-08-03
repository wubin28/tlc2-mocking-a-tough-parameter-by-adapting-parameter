package kata.taminglegacycode.tlc2;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class ARMDispatcher {

    public void populate(HttpServletRequest request, String pageStateName, Map<String, String> marketBindings) {
        String[] values = request.getParameterValues(pageStateName);
        if (values != null && values.length > 0) {
            marketBindings.put(pageStateName + getDateStamp(), values[0]);
        }
    }

    private String getDateStamp() {
        return null;
    }
}
