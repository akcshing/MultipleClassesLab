import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    Person person2;
    Person person3;
    Person person4;
    Person person5;
    Person person6;
    BusStop busstop;

    @Before
    public void before() {
        bus = new Bus("Princes Street", 5);
        person = new Person();
        person2 = new Person();
        person3 = new Person();
        person4 = new Person();
        person5 = new Person();
        person6 = new Person();
        busstop = new BusStop("Princes Street");
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassengerWhenNotFull() {
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void refusesToAddPassengersWhenFull(){
        bus.addPassenger(person);
        bus.addPassenger(person2);
        bus.addPassenger(person3);
        bus.addPassenger(person4);
        bus.addPassenger(person5);
        bus.addPassenger(person6);
        assertEquals(5, bus.passengerCount());
    }

    @Test
    public void canRemovePassengers(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canPickUpPassengers(){
        busstop.addPerson(person);
        bus.pickUpPasseneger(busstop);
        assertEquals(0, busstop.countQueueWaiting());
        assertEquals(1, bus.passengerCount());
    }
}
