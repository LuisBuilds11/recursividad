import com.recursividad.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FactorialTest {
    
    // CalcFactorial
    @Test
    void testFactorialDe4() {
        assertEquals(24, Factorial.CalcFactorial(4)); 
    }

    @Test
    void testFactorialDe5() {
        assertEquals(120, Factorial.CalcFactorial(5));
    }

    @Test
    void testFactorialDe0() {
        assertEquals(0, Factorial.CalcFactorial(0)); 
    }



    // MultiplicaRecursivo
    @Test
    void testMultiplica4Por5() {
        assertEquals(20, Factorial.MultiplicaRecursivo(4, 5));
    }

    @Test
    void testMultiplica9Por1() {
        assertEquals(9, Factorial.MultiplicaRecursivo(9, 1));
    }

    @Test
    void testMultiplica7Por0() {
        assertEquals(7, Factorial.MultiplicaRecursivo(7, 0));
    }

}
