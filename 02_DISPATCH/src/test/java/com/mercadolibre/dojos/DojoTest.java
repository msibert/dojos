package com.mercadolibre.dojos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the dojo.
 */
public class DojoTest {


    @Before
    public void setup() {
    }

    @Test
    public void getClassRoomLabel() {
        ClassRoom room = new ClassRoom("Lab A");
        Assert.assertNotNull(room);
        Assert.assertEquals("Lab A",room.getLabel());
    }

    @Test
    public void getClassRoomLabelForLabB() {
        ClassRoom room = new ClassRoom("Lab B");
        Assert.assertNotNull(room);
        Assert.assertEquals("Lab B",room.getLabel());
    }

    @Test
    public void getClassRooms() {
        ClassRoomStorage roomStorage = new ClassRoomStorage();
        roomStorage.add(new ClassRoom("Lab A"));
        Assert.assertNotNull(roomStorage);
        Assert.assertTrue(roomStorage.isClassRoomAvaliable(new ClassRoom("Lab A")));
    }

    @Test
    public void getClassRooms2() {
        ClassRoomStorage roomStorage = new ClassRoomStorage();
        roomStorage.add(new ClassRoom("Lab A"));
        roomStorage.add(new ClassRoom("Lab B"));
        Assert.assertNotNull(roomStorage);
        Assert.assertTrue(roomStorage.isClassRoomAvaliable(new ClassRoom("Lab B")));
    }

    @Test
    public void getClassRooms3() {
        ClassRoomStorage roomStorage = new ClassRoomStorage();
        roomStorage.add(new ClassRoom("Lab A"));
        roomStorage.add(new ClassRoom("Lab B"));
        Assert.assertNotNull(roomStorage);
        Assert.assertFalse(roomStorage.isClassRoomAvaliable(new ClassRoom("Lab C")));
    }

    @Test
    public void getClassRooms4() {
        ClassRoomStorage roomStorage = new ClassRoomStorage();
        roomStorage.add(new ClassRoom("Lab A"));
        roomStorage.add(null);
        Assert.assertNotNull(roomStorage);
        Assert.assertFalse(roomStorage.isClassRoomAvaliable(new ClassRoom("Lab C")));
    }


    @Test
    public void selectClassrom() {
        ClassRoomStorage roomStorage = new ClassRoomStorage();

        ClassRoom option0 = new ClassRoom("Lab 0");
        option0.has(new PeopleCapacity(5));
        option0.has(new SquareMetersCapacity(50));
        roomStorage.add(option0);

        ClassRoom option1 = new ClassRoom("Lab A");
        option1.has(new PeopleCapacity(10));
        option1.has(new SquareMetersCapacity(50));
        roomStorage.add(option1);

        Assert.assertNotNull(roomStorage);
        //roomStorage.add(new ClassRoom("Lab B", Arrays.asList(new PeopleCapacity(20), new SquareMetersCapacity(75))));
        CauSystem system = new CauSystem(roomStorage);
        ClassRoom classRoom = system.havingAtLeast(new PeopleCapacity(8)).findFirst();
        Assert.assertNotNull(classRoom);
        Assert.assertEquals("Lab A",classRoom.getLabel());
    }

    @Test
    public void selectClassrom2Options() {
        ClassRoomStorage roomStorage = new ClassRoomStorage();

        ClassRoom option0 = new ClassRoom("Lab 0");
        option0.has(new PeopleCapacity(5));
        option0.has(new SquareMetersCapacity(25));
        roomStorage.add(option0);

        ClassRoom option1 = new ClassRoom("Lab A");
        option1.has(new PeopleCapacity(10));
        option1.has(new SquareMetersCapacity(50));
        roomStorage.add(option1);

        Assert.assertNotNull(roomStorage);
        CauSystem system = new CauSystem(roomStorage);
        ClassRoom classRoom = system
                .havingAtLeast(new PeopleCapacity(8))
                .havingAtLeast(new SquareMetersCapacity(40))
                .findFirst();
        Assert.assertNotNull(classRoom);
        Assert.assertEquals("Lab A",classRoom.getLabel());
    }

    @Test
    public void selectClassrom3Options() {
        ClassRoomStorage roomStorage = new ClassRoomStorage();

        ClassRoom option0 = new ClassRoom("Lab 0");
        option0.has(new PeopleCapacity(5));
        option0.has(new SquareMetersCapacity(25));
        roomStorage.add(option0);

        ClassRoom option1 = new ClassRoom("Lab A");
        option1.has(new PeopleCapacity(10));
        option1.has(new SquareMetersCapacity(50));
        roomStorage.add(option1);

        Assert.assertNotNull(roomStorage);

        CauSystem system = new CauSystem(roomStorage);
        ClassRoom classRoom = system
                .havingAtLeast(new PeopleCapacity(5))
                .havingAtLeast(new SquareMetersCapacity(20))
                .findFirst();
        Assert.assertNotNull(classRoom);
        Assert.assertEquals("Lab 0",classRoom.getLabel());
    }

    @Test
    public void selectClassrom4Options() {
        ClassRoomStorage roomStorage = new ClassRoomStorage();

        ClassRoom option0 = new ClassRoom("Lab 0");
        option0.has(new PeopleCapacity(5));
        option0.has(new SquareMetersCapacity(25));
        roomStorage.add(option0);

        ClassRoom option1 = new ClassRoom("Lab A");
        option1.has(new PeopleCapacity(10));
        option1.has(new SquareMetersCapacity(50));
        roomStorage.add(option1);

        Assert.assertNotNull(roomStorage);

        CauSystem system = new CauSystem(roomStorage);
        ClassRoom classRoom = system
                .havingAtLeast(new PeopleCapacity(5))
                .havingAtLeast(new SquareMetersCapacity(30))
                .findFirst();
        Assert.assertNotNull(classRoom);
        Assert.assertEquals("Lab A",classRoom.getLabel());
    }
}

