import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busstop;
    Person person1;
    Person person2;
    Person person3;
    Bus bus;

    @Before
    public void before() {
        bus = new Bus("Princes Street", 5);
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
        busstop = new BusStop("Princes Street");
    }

    @Test
    public void canAddPerson(){
        busstop.addPerson(person1);
        assertEquals(1, busstop.countQueueWaiting());
    }

    @Test
    public void canRemovePerson(){
        busstop.addPerson(person1);
        busstop.removePerson();
        assertEquals(0, busstop.countQueueWaiting());
    }

}
