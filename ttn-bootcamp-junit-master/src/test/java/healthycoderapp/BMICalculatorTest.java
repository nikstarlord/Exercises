package healthycoderapp;
import junit.runner.Version;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @BeforeAll
    static  void beforeAll(){
        System.out.println("initialization....");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Ending....");
    }

    void should_Return_True(){


        //given
        double weight=89.0;
        double height=1.72;


        //when
        boolean recommend=BMICalculator.isDietRecommended(weight,height);
        //assertTrue(BMICalculator.isDietRecommended(129.0,1.75));

        //then
        assertTrue(recommend);
    }

    @Test
    void should_Return_False(){

        //given
        double weight = 50.0;
        double height = 1.92;

        //when
        boolean rec  = BMICalculator.isDietRecommended(weight,height);

        //then

        assertFalse(rec);
    }

    @Test
    void should_return_coder_with_worstBMI(){

        List<Coder> coders = new ArrayList<Coder>();
        coders.add(new Coder(1.80,60.0));
        coders.add(new Coder(1.82,98.0));
        coders.add(new Coder(1.82,97.0));

        Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);


        assertAll(
                () -> assertEquals(1.82, coderWorstBMI.getHeight()),
                () -> assertEquals(98.0, coderWorstBMI.getWeight())
        );

    }

    @Test
    void should_Check_Exceptions(){

        double height = 0;
        double weight = 89.0;

        Executable executable = () -> BMICalculator.isDietRecommended(weight,height);

        assertThrows(ArithmeticException.class, executable);

    }



}