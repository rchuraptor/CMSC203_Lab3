import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * GradeBookTester for testing the GradeBook class.
 */
public class GradeBookTester {

    GradeBook g1;
    GradeBook g2;

    // Method that runs before each test case
    @Before
    public void setUp() {
        g1 = new GradeBook(5);
        g2 = new GradeBook(5);
        g1.addScore(50);
        g1.addScore(75);
        g2.addScore(85);
        g2.addScore(60);
    }

    // Method that runs after each test case
    @After
    public void tearDown() {
        g1 = null;
        g2 = null;
    }

    @Test
    public void testAddScore() {
        assertTrue(g1.toString().equals("50.0 75.0 "));
        assertEquals(2, g1.getScoreSize());
    }

    @Test
    public void testSum() {
        assertEquals(125.0, g1.sum(), 0.0001);
    }

    @Test
    public void testMinimum() {
        assertEquals(50.0, g1.minimum(), 0.0001);
    }

    @Test
    public void testFinalScore() {
        assertEquals(75.0, g1.finalScore(), 0.0001);  // 125 - 50 = 75
    }

    @Test
    public void testAddScoreForG2() {
        assertTrue(g2.toString().equals("85.0 60.0 "));
        assertEquals(2, g2.getScoreSize());
    }

    @Test
    public void testSumForG2() {
        assertEquals(145.0, g2.sum(), 0.0001);
    }

    @Test
    public void testMinimumForG2() {
        assertEquals(60.0, g2.minimum(), 0.0001);
    }

    @Test
    public void testFinalScoreForG2() {
        assertEquals(85.0, g2.finalScore(), 0.0001);  // 145 - 60 = 85
    }
}
