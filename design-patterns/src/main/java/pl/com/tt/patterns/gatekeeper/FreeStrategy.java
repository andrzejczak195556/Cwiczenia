package pl.com.tt.patterns.gatekeeper;

/**
 * Created by miszel on 4/19/17.
 */
public class FreeStrategy implements GateKeepingStrategy {
    public String isAccessGranted() {
        return "You Can Go Mate";
    }
}
