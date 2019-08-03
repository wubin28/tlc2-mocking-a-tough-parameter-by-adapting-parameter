package kata.taminglegacycode.tlc2;

import javax.servlet.http.HttpServletRequest;

public class ServletParameterSource implements ParameterSource {
    private final HttpServletRequest request;

    public ServletParameterSource(HttpServletRequest request) {
        this.request = request;
    }

    @Override
    public String getParameterForName(String pageStateName) {
        String[] values = request.getParameterValues(pageStateName);
        if (values == null || values.length < 1)
            return null;
        return values[0];
    }
}
