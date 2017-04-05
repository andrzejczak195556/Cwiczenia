package transition.technologies.unittesting.basic.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SimpleCalculatorTest {

	private SimpleCalculator sut;
	private static final int POSITIVE_NUMBER = 2;
	private static final int ZERO = 0;
	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Before
	public void initialize(){
		sut = new SimpleCalculator();
	}
	
	
	@Test
	public void shouldAddTwoPositiveNumbers(){
		//given
		//when
		double result = sut.add(2, 3);
		//then
		assertEquals(5, result, 0.00001);
	}

	@Test
	public void testDivide_WhenDividedBy_0_Should_throw_Exception() throws CannotDivideByZeroException {
		exception.expect(CannotDivideByZeroException.class);

		sut.divide(POSITIVE_NUMBER,ZERO);

	}
}
