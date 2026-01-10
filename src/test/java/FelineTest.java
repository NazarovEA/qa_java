import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineTest {
@Test
    public void eatMeatTest() throws Exception {
    Feline feline = new Feline();

    }
@Test
    public void getFamilyTest() {
    Feline feline = new Feline();
    }
@Test
    public void getKittensTest() {
    Feline feline = new Feline();
    int expectedKittensCount = 1;
    int actualKittensCount = feline.getKittens();
    assertEquals("не верное кол-во котят", expectedKittensCount, actualKittensCount);
    }
@Test
    public void getCountManyKittensTest() {
    Feline feline = new Feline();
    int expectedKittensCount = 1;
    int actualKittensCount = feline.getKittens(2);
    assertEquals("не верное кол-во котят", expectedKittensCount, actualKittensCount);
    }

}
