package pl.comcleancode;

/**
 * Created by miszel on 3/22/17.
 */
public class EmployeesNotFoundException extends Throwable {
    private String message;
    public EmployeesNotFoundException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage()
    {
        return this.message;
    }
}
