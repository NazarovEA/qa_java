import com.example.Feline;
import com.example.Cat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)


public class CatTest {
    @Mock
    Feline feline;

    @Test
    feline.getSound("Мяу"); // вызвали метод объекта с аргументом
    Mockito.verify(feline).getSound("Мяу");


}
