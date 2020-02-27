package healthycoderapp;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class DietPlannerTest {

    @Test
    void should_return_Exception(){
        //Coder coder = new Coder(1.76,78,23,Gender.MALE);
        //DietPlan actual = new DietPlanner(30,30,30).calculateDiet(coder);

        Executable executable = () -> new DietPlanner(30,30,30);
        assertThrows(RuntimeException.class,executable);

    }

    @Test
    void should_check_Calculate_Diet(){
        Coder coder = new Coder(1.76,78,23,Gender.MALE);
        DietPlan actual = new DietPlanner(40,30,30).calculateDiet(coder);
        DietPlan expected = new DietPlan(2240,224,75,168);
        assertAll(
                () -> assertEquals(actual.getCalories(), expected.getCalories() ),
                () -> assertEquals(actual.getCarbohydrate(), expected.getCarbohydrate() ),
                () -> assertEquals(actual.getFat(), expected.getFat() ),
                () -> assertEquals(actual.getProtein(), expected.getProtein() )
        );
    }
}
