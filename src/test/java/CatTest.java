import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.testng.annotations.Test;

@ExtendWith(MockitoExtension.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getSoundTest() { // сам тест
        cat.getSound("Мяу"); // вызвали метод объекта с аргументом
        Mockito.verify(feline).getSound("Мяу");
    }
    @Test
    public void getFoodTest() throws Exception {
        cat.getFood(predator.eatMeat()); // вызвали метод объекта с аргументом
        Mockito.verify(feline).getSound(predator.eatMeat());
    }
}