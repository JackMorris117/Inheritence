import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;
    @Before
    public void before(){
        manager = new Manager("Jack", "York", 122334, 20000.00);

    }
    @Test
    public void canGetName(){
        assertEquals("Jack", manager.getName());
    }
    @Test
    public void canSetName(){
        manager.setName("John");
        assertEquals("John", manager.getName());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("York", manager.getDeptName());
    }
    @Test
    public void canGetSalary(){
        assertEquals(20000.00, manager.getSalary(), 0.01);

    }
    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(10.00);
        assertEquals(20010.00, manager.getSalary(), 0.01);
    }
    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(20200, manager.getSalary(),0.01);
    }
}
