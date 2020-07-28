import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Mike", 122334, 20000.00);
    }
    @Test
    public void CanGetName(){
        assertEquals("Mike", developer.getName());
    }
    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(10.00);
        assertEquals(20010.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        developer.payBonus();
        assertEquals(20200, developer.getSalary(),0.01);
    }
}
