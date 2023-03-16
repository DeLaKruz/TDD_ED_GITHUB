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

    @Test
    void SumaTest1_2Devolver3(){
        OperacionesTDD n = new OperacionesTDD();
        int calc = n.sum("1,2");
        assertEquals(3,calc);
    }
    @Test
    void SumaTest1_1_2Devolver4(){
        OperacionesTDD n = new OperacionesTDD();
        int calc = n.sum("1,1,2");
        assertEquals(4,calc);
    }
}