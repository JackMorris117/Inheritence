import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Colin", 122334, 30000.00);
    }
    @Test
    public void CanGetName(){
        assertEquals("Colin", databaseAdmin.getName());
    }
    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(10.00);
        assertEquals(30010.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        databaseAdmin.payBonus();
        assertEquals(30300, databaseAdmin.getSalary(),0.01);
    }
}


