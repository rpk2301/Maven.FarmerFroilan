import com.zipcodewilmington.froilansfarm.Storage;
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

        List<Chicken> chickensInChickenCoop = chickenCoop.getChickens();

        assertEquals("littleChick", chickensInChickenCoop.get(0).getName());

    }

    @Test
    public void testAddPersonToFarmHouse(){
        Farmhouse farmhouse = new Farmhouse();
        Farmer people = new Farmer("Froilan");

        farmhouse.addPerson(people);

        List<Person> peopleInFarm = farmhouse.getpeople();

        assertEquals("Froilan", peopleInFarm.get(0).getName());

    }

    @Test
    public void testAddHorseToStable(){
        Stable stable = new Stable();
        Horse horses = new Horse("bigHorse");

        stable.addHorse(horses);

        List<Horse> horsesInStable = stable.getHorses();

        assertEquals("bigHorse", horsesInStable.get(0).getName());

    }


    @Test
    public void testGetHorse(){
        Stable stable = new Stable();
        Horse horses1 = new Horse("bigHorse");
        Horse horses2 = new Horse("SmallHorse");

        stable.addHorse(horses1);
        stable.addHorse(horses2);

        List<Horse> horsesInStable = stable.getHorses();
        int indexOfHorse2 = horsesInStable.indexOf(horses2);

        assertEquals(1, indexOfHorse2);



    }

    @Test
    public void testGetPerson(){
        Farmhouse farmhouse = new Farmhouse();
        Farmer people1 = new Farmer("Froilan");
        Farmer people2 = new Farmer("Frolinda");

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

        List<Chicken> chickensInFarm = chickenCoop.getChickens();
        int indexOfChicken2 = chickensInFarm.indexOf(chickens2);

        assertEquals(1, indexOfChicken2);


    }


    @Test
    public void testGetFieldChickenCoop() throws NoSuchFieldException, IllegalAccessException {
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken chickens = new Chicken("littleChick");

        chickenCoop.addChicken(chickens);

        Chicken chickensInChickenCoop = chickenCoop.getChicken(0);
        Field nameField = Chicken.class.getDeclaredField("name");
        nameField.setAccessible(true);
        String nameValue = (String) nameField.get(chickensInChickenCoop.getName());

        assertEquals("littleChick", nameValue);

    }

    @Test
    public void testGetFieldFarmHouse() throws NoSuchFieldException, IllegalAccessException {
        Farmhouse farmhouse = new Farmhouse();
        Farmer people = new Farmer("Froilan");

        farmhouse.addPerson(people);

        List<Person> peopleInFarm = farmhouse.getpeople();
        Field nameField = Person.class.getDeclaredField("name");
        nameField.setAccessible(true);
        String nameValue = (String) nameField.get(peopleInFarm.get(0));

        assertEquals("Froilan", nameValue);

    }

    @Test
    public void testGetFieldStable() throws NoSuchFieldException, IllegalAccessException {
        Stable stable = new Stable();
        Horse horses = new Horse("bigHorse");

        stable.addHorse(horses);

        List<Horse> horsesInStable = stable.getHorses();
        Field nameField = Horse.class.getDeclaredField("name");
        nameField.setAccessible(true);
        String nameValue = (String) nameField.get(horsesInStable.get(0));

        assertEquals("bigHorse", nameValue);

    }



}