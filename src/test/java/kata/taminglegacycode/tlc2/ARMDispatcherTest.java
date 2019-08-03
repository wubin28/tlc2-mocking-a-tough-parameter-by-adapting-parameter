package kata.taminglegacycode.tlc2;

import org.hamcrest.collection.IsMapContaining;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class ARMDispatcherTest {
    @Test
    public void value_of_page_state_name_should_be_put_in_market_bindings() {
        Map<String, String> marketBindings = new HashMap<>();
        String pageStateName = "normal";
        HttpServletRequest source = mock(HttpServletRequest.class);
        given(source.getParameterValues("normal")).willReturn(new String[]{"9"});
        ARMDispatcher armDispatcher = new ARMDispatcher();

        armDispatcher.populate(source, pageStateName, marketBindings);

        assertThat(marketBindings.size(), is(1));
        assertThat(marketBindings, IsMapContaining.hasValue("9"));    }
}
