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
}
