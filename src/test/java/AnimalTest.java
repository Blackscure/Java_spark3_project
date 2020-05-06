import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTest {
    @Test
    public void instantiatesAnimal_true() {
        Animal  testAnimal = new Animal( "Tiger");
        assertEquals(true, testAnimal instanceof Animal);
   }


    @Test
    public void getAnimalName() {
        Animal  testAnimal = new Animal("Tiger", "endangered");
        assertEquals("Tiger",  testAnimal.getName());
    }

    @Test
   public void getsAnimalType() {
       assertEquals("Endagered",  Animal.getType());
   }
}
