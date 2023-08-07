package com.zipcodewilmington.froilansfarm;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StorageTest {

    @Test
    public void testAddPersonToChickenCoop(){
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chickens = new Chicken("littleChick");

        chickenCoop.addChicken(chickens);

        List<Chicken> chickensInChickenCoop = ChickenCoop.getChicken();

        assertEquals("littleChick", chickensInChickenCoop.get(0).getname());

    }

    @Test
    public void testAddPersonToFarmHouse(){
        Farmhouse farmhouse = new Farmhouse();
        Person people = new Person("Froilan");

        farmhouse.addPerson(people);

        List<Person> peopleInFarm = farmhouse.getpeople();

        assertEquals("Froilan", peopleInFarm.get(0).getname());

    }

    @Test
    public void testAddHorseToStable(){
        Stable stable = new Stable();
        Horse horses = new Horse("bigHorse");

        stable.addHorse(horses);

        List<Horse> horsesInStable = stable.gethorses();

        assertEquals("bigHorse", horsesInStable.get(0).getname());

    }

    @Test
    public void testAddToStorage(){
        Storage storage = new Storage();
        T t = new T("ChickenCoop1");

        storage.addT(t);

        List<T> tInStorage = storage.gett();

        assertEquals("ChickenCoop1", tInStorage.get(0).getstorageName());

    }

    @Test
    public void testGetHorse(){
        Stable stable = new Stable();
        Horse horses1 = new Horse("bigHorse");
        Horse horses2 = new Horse("SmallHorse");

        stable.addHorse(horses1);
        stable.addHorse(horses2);

        List<Horse> horsesInStable = stable.gethorses();
        int indexOfHorse2 = horsesInStable.indexOf(horses2);

        assertEquals(1, indexOfHorse2);



    }

    @Test
    public void testGetPerson(){
        Farmhouse farmhouse = new Farmhouse();
        Person people1 = new Person("Froilan");
        Person people2 = new Person("Frolinda");

        farmhouse.addPerson(people1);
        farmhouse.addPerson(people2);

        List<Person> peopleInFarm = farmhouse.getpeople();
        int indexOfPerson2 = peopleInFarm.indexOf(people2);

        assertEquals(1, indexOfPerson2);


    }

    @Test
    public void testGetChicken(){
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chickens1 = new Chicken("Chick1");
        Chicken chickens2 = new Chicken("Chick2");

        chickenCoop.addChicken(chickens1);
        chickenCoop.addChicken(chickens2);

        List<Chicken> chickensInFarm = chickenCoop.getchickens();
        int indexOfChicken2 = ChickensInFarm.indexOf(chickens2);

        assertEquals(1, indexOfChicken2);


    }

    @Test
    public void testGetStorage(){
        Storage storage = new Storage();
        T t1 = new T("ChickenCoop");
        T t2 = new T("Stable");

        storage.addT(t1);
        storage.addT(t2);

        List<T> tInStorage = storage.gett();
        int indexOfStable = tInStorage.indexOf(t2);

        assertEquals(1, indexOfStable);

    }

    @Test
    public void testGetFieldChickenCoop(){
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chickens = new Chicken("littleChick");

        chickenCoop.addChicken(chickens);

        List<Chicken> chickensInChickenCoop = ChickenCoop.getChicken();
        Field nameField = Chicken.class.getDeclaredField("name");
        nameField.setAccessible(true);
        String nameValue = (String) nameField.get(chickensInChickenCoop.get(0));

        assertEquals("littleChick", nameValue);

    }

    @Test
    public void testGetFieldFarmHouse(){
        Farmhouse farmhouse = new Farmhouse();
        Person people = new Person("Froilan");

        farmhouse.addPerson(people);

        List<Person> peopleInFarm = farmhouse.getpeople();
        Field nameField = Person.class.getDeclaredField("name");
        nameField.setAccessible(true);
        String nameValue = (String) nameField.get(peopleInFarm.get(0));

        assertEquals("Froilan", nameValue);

    }

    @Test
    public void testGetFieldStable(){
        Stable stable = new Stable();
        Horse horses = new Horse("bigHorse");

        stable.addHorse(horses);

        List<Horse> horsesInStable = stable.gethorses();
        Field nameField = Horse.class.getDeclaredField("name");
        nameField.setAccessible(true);
        String nameValue = (String) nameField.get(horsesInStable.get(0));

        assertEquals("bigHorse", nameValue);

    }

    @Test
    public void testGetFieldStorage() throws NoSuchFieldException, IllegalAccessException{
        Storage storage = new Storage();
        T t = new T("ChickenCoop1");

        storage.addT(t);

        List<T> tInStorage = storage.gett();
        Field nameField = T.class.getDeclaredField("name");
        nameField.setAccessible(true);
        String nameValue =(String) nameField.get(tInStorage.get(0));

        assertEquals("ChickenCoop1", nameValue);

    }

}