import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void getSoundTest() { // сам тест
        Cat cat = new Cat(feline);
        cat.getSound("Мяу"); // вызвали метод объекта с аргументом
        Mockito.verify(feline).getSound("Мяу");
    }
    @Test
    public void getFoodTest() throws Exception {
        Cat cat = new Cat(feline);
       cat.getFood() = cat.getFood(feline.eatMeat());// вызвали метод объекта с аргументом
        Mockito.verify(feline).getFood();
    }
}