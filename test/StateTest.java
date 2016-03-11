import guestinfo.State;
import org.junit.Assert;
import org.junit.Test;

public class StateTest {
    @Test
    public void state_name_should_return_name_of_state() throws Exception {
        State state = new State("Karnataka");
        Assert.assertEquals("Karnataka",state.stateName());
    }
}
