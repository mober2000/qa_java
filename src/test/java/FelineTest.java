import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void felineEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> felineFood = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), felineFood);
    }

    @Test
    public void getFelineFamily() {
        Feline feline = new Feline();
        String felineFamily = feline.getFamily();
        assertEquals("Кошачьи", felineFamily);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int kittensCount = feline.getKittens();
        assertEquals(1, kittensCount);
    }
}