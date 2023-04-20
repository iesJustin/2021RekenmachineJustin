import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void testAdd() {
        //arrange
        JavaFXApp javaFXApp = new JavaFXApp();
        int number1 = 2;
        int number2 = 3;
        //act
        int verwacht = 5;
        int actual = javaFXApp.computeAdd(number1,number2);
        //assert
        assertEquals(verwacht,actual);
    }
}