import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class Tests {
    @Test
    void Devolver1EnCadena(){
        FizzBuzz numCalc = new FizzBuzz();
        String numACalc = numCalc.pedirNumero(1);
        assertEquals("1",numACalc);
    }
    @Test
    void Devolver2EnCadena(){
        FizzBuzz numCalc = new FizzBuzz();
        String numACalc = numCalc.pedirNumero(2);
        assertEquals("2",numACalc);
    }

    @Test
    void Testear3(){
        FizzBuzz numCalc = new FizzBuzz();
        String numACalc = numCalc.pedirNumero(3);
        assertEquals("Fizz",numACalc);
    }

    @Test
    void TesteoNum4_5(){
        FizzBuzz numCalc = new FizzBuzz();
        String numACalc = numCalc.pedirNumero(4);
        String numACalc2 = numCalc.pedirNumero(5);
        assertEquals("4",numACalc);
        assertEquals("Buzz",numACalc2);
    }
    @Test
    void TesteoNum6(){
        FizzBuzz numCalc = new FizzBuzz();
        String numACalc = numCalc.pedirNumero(6);
        assertEquals("Fizz",numACalc);
    }
}
