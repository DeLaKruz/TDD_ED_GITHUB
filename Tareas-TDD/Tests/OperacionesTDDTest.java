import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {

    @Test
    void SumaTest_Devolver0(){
        OperacionesTDD n = new OperacionesTDD();
        int calc = n.sum("");
        assertEquals(0,calc);
    }
    @Test
    void SumaTest_Devolver1(){
        OperacionesTDD n = new OperacionesTDD();
        int calc = n.sum("1");
        assertEquals(1,calc);
    }
}