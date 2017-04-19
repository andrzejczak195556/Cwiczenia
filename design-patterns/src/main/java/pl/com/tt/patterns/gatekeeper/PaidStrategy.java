package pl.com.tt.patterns.gatekeeper;

/**
 * Created by miszel on 4/19/17.
 */
public class PaidStrategy implements GateKeepingStrategy {
    public String isAccessGranted() {
        return "You Shall NOT Pass For Free!!! Pay up";
    }
}
