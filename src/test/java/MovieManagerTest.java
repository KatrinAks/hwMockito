import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {


    @Test
    public void allLengthTest() {
        MovieManager manager = new MovieManager(5);

        manager.add("film A");
        manager.add("film B");
        manager.add("film C");
        manager.add("film D");
        manager.add("film E");

        String[] expected = {"film E", "film D", "film C", "film B", "film A"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void limitMoreTest() {
        MovieManager manager = new MovieManager(5);

        manager.add("film A");
        manager.add("film B");
        manager.add("film C");
        manager.add("film D");
        manager.add("film E");
        manager.add("film F");


        String[] expected = {"film F","film E", "film D", "film C", "film B"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void limitEqualsTest() {
        MovieManager manager = new MovieManager(5);

        manager.add("film A");
        manager.add("film B");
        manager.add("film C");
        manager.add("film D");
        manager.add("film E");

        String[] expected = {"film E", "film D", "film C", "film B", "film A"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void limitLessTest() {
        MovieManager manager = new MovieManager(3);

        manager.add("film A");
        manager.add("film B");
        manager.add("film C");


        String[] expected = {"film C", "film B", "film A"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllTest() {
        MovieManager manager = new MovieManager();

        manager.findAll();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneTest() {
        MovieManager manager = new MovieManager();

        manager.add(" film A");

        String[] expected = {" film A"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void addFourTest() {
        MovieManager manager = new MovieManager();

        manager.add("film A");
        manager.add("film B");
        manager.add("film C");
        manager.add("film D");

        String[] expected = {"film A", "film B", "film C", "film D"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        MovieManager manager = new MovieManager();

        manager.add("film A");
        manager.add("film B");
        manager.add("film C");


        String[] expected = {"film C", "film B", "film A"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}



