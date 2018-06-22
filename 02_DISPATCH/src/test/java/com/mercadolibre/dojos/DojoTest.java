package com.mercadolibre.dojos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

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

}
