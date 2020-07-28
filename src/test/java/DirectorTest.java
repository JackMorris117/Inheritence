import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;
    @Before
    public void before(){
        director = new Director("Gene", "York", 122334, 500000.00, 10000.00);

    }
    @Test
    public void canGetName(){
        assertEquals("Gene", director.getName());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("York", director.getDeptName());
    }
    @Test
    public void canGetSalary(){
        assertEquals(500000.00, director.getSalary(), 0.01);

    }
    @Test
    public void canRaiseSalary() {
        director.raiseSalary(10.00);
        assertEquals(500010.00, director.getSalary(), 0.01);
    }
    @Test
    public void canGetBudget(){
        assertEquals(10000.00, director.getBudget(),0.01);
    }
    @Test
    public void canPayBonus(){
        director.payBonus();
        assertEquals(505000.00, director.getSalary(),0.01);
    }
}
