package ifsa.org;

import exception.InvalidListException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TestNumberServiceTest {
    NumberService numberService;
    public TestNumberServiceTest(){
        numberService=new NumberService();
    }


    @Test
    public void testBiggestNumber(){


        List<Integer> lst= Arrays.asList(1,2,3);

  // NumberService numberService=new NumberService();
   int biggest=numberService.biggestNumber(lst);
        assertEquals(3,biggest);

        List<Integer> lst2= Arrays.asList(7,8,9);

        NumberService numberService2=new NumberService();
        int biggest2=numberService.biggestNumber(lst2);
        assertEquals(9,biggest2);
    }

    @Test
    public void testBiggestWithNegativeNumber(){

        List<Integer> lst3= Arrays.asList(-1,-2,-3);

        NumberService numberService2=new NumberService();
        int biggest3=numberService.biggestNumber(lst3);
        assertEquals(-1,biggest3);

        List<Integer> lst4= Arrays.asList(-3,-2,-1);

        NumberService numberService=new NumberService();
        int biggest4=numberService.biggestNumber(lst4);
        assertEquals(-1,biggest3);

    }

    @Test
    public void testBiggestWithDoublonsNumber(){

        List<Integer> lst5= Arrays.asList(11,2,2,12);

        NumberService numberService=new NumberService();
        int biggest5=numberService.biggestNumber(lst5);
        assertEquals(12,biggest5);

    }

    @Test
    public void testBiggestWithPositiveAndNegatveNumber(){

        List<Integer> lst6= Arrays.asList(-11,-2,2,12);

        NumberService numberService=new NumberService();
        int biggest6=numberService.biggestNumber(lst6);
        assertEquals(12,biggest6);

    }

    @Test(expected = InvalidListException.class)
    public void testBiggestWithNullValue(){

        List<Integer> lst7= Arrays.asList();

        NumberService numberService=new NumberService();
        int biggest7=numberService.biggestNumber(null);
       // assertEquals(12,biggest7);

    }

    @Test
    public void testBiggestWithOneValue(){

        List<Integer> lst8= Arrays.asList(1);

        NumberService numberService=new NumberService();
        int biggest8=numberService.biggestNumber(lst8);
         assertEquals(1,biggest8);

    }

}
