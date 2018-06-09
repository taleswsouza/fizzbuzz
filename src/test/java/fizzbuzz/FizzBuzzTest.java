package fizzbuzz;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
    
    private FizzBuzz fizzBuzz;
    
    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }
    
    @Test
    public void test1() {
        assertEquals("1", fizzBuzz.test(1));
    }
    
    @Test
    public void test2() {
        assertEquals("2", fizzBuzz.test(2));
    }


    @Test
    public void test3() {
        assertEquals("Fizz", fizzBuzz.test(3));
    }

    @Test
    public void test4() {
        assertEquals("4", fizzBuzz.test(4));
    }

    @Test
    public void test5() {
        assertEquals("Buzz", fizzBuzz.test(5));
    }

    @Test
    public void test6() {
        assertEquals("Fizz", fizzBuzz.test(6));
    }

    @Test
    public void test15() {
        assertEquals("Fizz Buzz", fizzBuzz.test(15));
    }

    @Test
    public void test1a36() {
        String esperado = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34, Buzz, Fizz, ";
        String retorno = "";
        for (int i = 1; i <= 36; i++) {
            retorno += fizzBuzz.test(i) + ", ";
        }
        assertEquals(esperado, retorno);
    }
}
