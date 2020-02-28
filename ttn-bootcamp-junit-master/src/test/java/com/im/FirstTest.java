package com.im;

//import org.junit.Test;

import junit.runner.Version;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FirstTest {

    /*void canary() {
        assertTrue(true);
        System.out.println("Test Executed......");

    }*/

    @Test
    void should_check_for_average() {
        List<BigDecimal> list = new ArrayList<BigDecimal>();
        list.add(new BigDecimal(10.333));
        list.add(new BigDecimal(10.333));
        list.add(new BigDecimal(10.333));
        list.add(new BigDecimal(10.333));
        list.add(new BigDecimal(10.333));

        BigDecimal result = new First().calculateAverage(list);
        BigDecimal expected = new BigDecimal(10.333);
        assertEquals(result, expected);
    }

    @Test
    void should_check_for_null_exception() {
        List<BigDecimal> list = new ArrayList<BigDecimal>();
        Executable executable = () -> new First().calculateAverage(list);

        assertThrows(RuntimeException.class, executable);

    }

    //@ParameterizedTest
    //@ValueSource(String ={"Nitin","Nikhil","Mahak"})
    @ParameterizedTest
    @CsvSource(value = {"Nikhil", "Nitin", "Nikina"})
    void check_for_palindrome(String val) {
        String str = val;
        boolean actual = new First().isPallindrome(str);
        assertFalse(actual);
        //System.out.println("JUnit version is: " + Version.id());
    }

    @Test
    void check_for_even_element() {
        List<Integer> ls = new ArrayList<Integer>();
        ls.add(234);
        ls.add(239);
        ls.add(238);
        ls.add(237);
        ls.add(236);
        List<Integer> expected = Arrays.asList(239, 237);
        List<Integer> actual = new First().filterEvenElements(ls);
        Integer[] exp = expected.stream().toArray(Integer[]::new);
        Integer[] act = actual.stream().toArray(Integer[]::new);
        //for(Integer e:actual)
        //  System.out.println("values:"+e);
        assertArrayEquals(exp, act);

    }

    @Test
    void check_for_null_String() {
        String str = "";
        boolean expected = true;
        boolean actual = new First().isPallindrome(str);
        assertEquals(expected, actual);
    }

    @Test
    void check_for_Replace_substring(){
        String main = "Nikhl";
        String sub = "i";
        String tar = "ii";
        String expected = "Niikhl";
        String actual = new First().replaceSubString(main,sub,tar);
        assertEquals(expected,actual);
    }

}