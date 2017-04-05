package transition.technologies.unittesting.basic.exercises;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class StackExerciseTest {

	@Rule
    public ExpectedException thrown = ExpectedException.none();

	private StackExercise sut;
        private final static String FIRST_ITEM="first";
        private final static String SECCOND_ITEM="last";

	@Before
	public void initializeSut() {
		sut = new StackExercise();		
	}
	
	
	@Test
	public void shouldBeEmptyWhenNothingPushed() {
            assertTrue(sut.isEmpty());

	}
	
	
	@Test
	public void shouldTopReturnLastPushedValue() throws StackEmptyException {
            
            sut.push(FIRST_ITEM);
            sut.push(SECCOND_ITEM);
            
            assertEquals(SECCOND_ITEM, sut.top());
	}

	@Test
	public void shouldNotFailWhen200ElementsPushed() throws StackEmptyException {
             pushValuesToStack(200);
	}
	
	private void pushValuesToStack(int numElements) {
		String ANY_ITEM="item";
		for(int i=0;i<200;i++)
                {
                    
                    sut.push(ANY_ITEM);
                }
	}
	
	@Test
	public void shouldBeEmptyWhenAllPopped() throws StackEmptyException {
		          pushValuesToStack(20);
                          popAllValuesFromStack();
                          
                          assertTrue(sut.isEmpty());
	}
        
        private void popAllValuesFromStack() throws StackEmptyException
        {
            while(!sut.isEmpty())
            {
                sut.pop();
            }
        }
        
	
	@Test(expected = StackEmptyException.class)
	public void shouldThrowStackEmptyExceptionWhenEmptyPopped() throws StackEmptyException {
		sut.pop();
                
	}
	
}
