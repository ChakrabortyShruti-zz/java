import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBasicFunc{
    @Test
    public void isEven(){
        BasicFunc num = new BasicFunc();
        assertEquals(true,num.isEven(70));
        assertEquals(false,num.isOdd(70));
    }

    @Test
    public void isOdd(){
        BasicFunc num = new BasicFunc();
        assertEquals(false,num.isEven(29));
        assertEquals(true,num.isOdd(29));
    }

    @Test
    public void square(){
        BasicFunc num = new BasicFunc();
        assertEquals(25,num.square(5));
    }

    @Test
    public void cube(){
        BasicFunc num = new BasicFunc();
        assertEquals(125,num.cube(5));
    }

    @Test
    public void cubeForDouble(){
        BasicFunc num = new BasicFunc();
        assertEquals(125.0,num.cubeForDouble(5.0),0);
    }

    @Test
    public void simpleInterest(){
        BasicFunc capital = new BasicFunc();
        assertEquals(2000,capital.simpleInterest(2000,10,10));
    }

    @Test
    public void simpleInterestForDouble(){
        BasicFunc capital = new BasicFunc();
        assertEquals(2000.0,capital.simpleInterestForDouble(2000.0,10,10.0),0.001);
    }
}
