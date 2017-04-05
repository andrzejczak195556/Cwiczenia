package transition.technologies.unittesting.basic.collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.junit.Assert.fail;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.aragorn;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.boromir;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.frodo;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.gandalf;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.gimli;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.legolas;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.merry;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.pippin;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.sam;
import static transition.technologies.unittesting.basic.collections.FellowTestFixture.sauron;

import org.junit.Test;

public class FellowshipAssertionTest {

    private Fellowship fellowship = formTheFellowshipOfTheRing();

    
    @Test
    public void frodoShouldBeIn() {
    	//fellowship.hobbits().add(new Fellow("Frodo", Fellow.Race.HOBBIT));

    	//Fellow frodo = new Fellow("Frodo", Fellow.Race.HOBBIT);

    	//assertThat(fellowship).contains(frodo);
    	assertThat(frodo()).isIn(fellowship);
    }

    @Test
    public void sauronShouldNotBeIn() {
        //Fellow squron = new Fellow("Sauron", Fellow.Race.AINUR);

        //assertThat(fellowship).doesNotContain(squron);
        assertThat(sauron()).isNotIn(fellowship);
    }
    
    @Test
	public void shouldFrodoNameBeCorrectAndNotBeASauronAndBeInFellowship() {
    	assertThat(frodo())
                .isIn(fellowship)
                .isNotEqualTo(sauron())
                .hasFieldOrPropertyWithValue("name","Frodo");


	}

    @Test
    public void aragornShouldBeBeforeBoromir() {
    	assertThat(fellowship).containsSubsequence(aragorn(),boromir());
    }

    @Test
    public void shouldNotContainDuplicatedFellows() {
    	assertThat(fellowship).doesNotHaveDuplicates();
    }

    @Test
    public void shouldContainOnlyFellowsWithExpectedNamesInProperOrder() {
    	assertThat(fellowship).containsExactly(
    	        frodo(),
                sam(),
                merry(),
                pippin(),
                gandalf(),
                legolas(),
                gimli(),
                aragorn(),
                boromir());
    	assertThat(fellowship)
                .extracting("name")
                .containsSequence("Frodo","Sam","Merry","Pippin","Gandalf","Legolas","Gimli","Aragorn","Boromir");
    }


    @Test
    public void shouldContainNineFellowsButNoneGiant() {
    	assertThat(fellowship).extracting("race")
                .doesNotContain(Fellow.Race.GIANT)
                .hasSize(9);

    }
    
    @Test
	public void shouldContainTupleForBoromirSamAndLegolas() {
    	// Extracting multiple values at once (using tuple to group them)
    	// Create tuples with name and race name
    	assertThat(fellowship).extracting("name","race")
                .contains(
                        tuple("Boromir",Fellow.Race.MAN)
                        //not finished
                )



	}
    
    
    @Test
	public void shouldContaintFourHobbits() {
    	fail("Not yet implemented");

	}


    private Fellowship formTheFellowshipOfTheRing() {
        return new Fellowship(
                frodo(),
                sam(),
                merry(),
                pippin(),
                gandalf(),
                legolas(),
                gimli(),
                aragorn(),
                boromir());
    }
}
