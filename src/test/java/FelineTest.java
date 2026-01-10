import com.example.Feline;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
@Test
    public void eatRightMeatTest() throws Exception {
    Feline feline = new Feline();
    List<String> expectedFood = Collections.singletonList("Рыба");
    List<String> actualFood = feline.eatMeat();
    assertEquals("Кошачьи едят правильную пищу", expectedFood, actualFood);
    }
    @Test
    public void eatNotRightMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals("Кошачьи едят не правильную пищу", expectedFood, actualFood);
    }
@Test
    public void getFamilyTest() {
    Feline feline = new Feline();
    String expectedFamily = "Кошачьи";
    String actualFamily = feline.getFamily();
    assertEquals("не верное определение семейства", expectedFamily, actualFamily);
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
    assertEquals(3, feline.getKittens(3));
    }

    @Test
    public void getCountLessKittensTest() {
        Feline feline = new Feline();
        int expectedKittensCount = 1;
        int actualKittensCount = feline.getKittens(0);
        assertEquals("не верное кол-во котят", expectedKittensCount, actualKittensCount);
    }
}
