import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class CatTest {

    @Test
    public void catSound() {
        Cat cat = new Cat(new Feline());
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void getCatFood() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> actualCatFood = cat.getFood();
        List<String> expectedCatFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedCatFood, actualCatFood);
    }
}