import dtos.Human;
import exceptions.WalkingException;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class WalkingTest {

    @Test
    public void humanIsNotAbleToWalkTest()
    {
        Human human = new Human();
        human.setBrokenLeg(true);

        try {
            human.walk();
            fail("Human should not be able to walk");
        } catch (
                WalkingException e) {
            System.out.println("Human is not able to walk and it's fine");
        }
    }
}
