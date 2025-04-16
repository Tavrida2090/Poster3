import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void test() {
        MovieManager manager = new MovieManager();

        manager.addMovie("FilmI");
        manager.addMovie("FilmII");
        manager.addMovie("FilmIII");

        String[] expected = {"FilmI", "FilmII", "FilmIII"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("FilmI");
        manager.addMovie("FilmII");
        manager.addMovie("FilmIII");

        String[] expected = {"FilmIII", "FilmII", "FilmI"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
