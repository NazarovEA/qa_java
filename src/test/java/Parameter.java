import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class Parameter {
    String sex;
    boolean hasMane;
    public Parameter (String sex, boolean hasMane){
        this.hasMane = hasMane;
        this.sex = sex;
    }
    @Mock
    Feline feline;
    @Parameterized.Parameters()
    public static Object[][] getData() {
        return new Object[][] {
                {"Самка", false},
                {"Самец", true}
        };
    }
    @Test
    public void haveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(hasMane, lion.doesHaveMane());
    }
}
