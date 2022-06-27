package demo.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseDemoTest {

    @Test
    public void should_return_hello_world() {
        BaseDemo baseDemo = new BaseDemo();

        String expected = "Hello World";

        assertEquals(expected, baseDemo.print());
    }

    @Test
    public void should_return_2_add_3(){
        BaseDemo baseDemo = new BaseDemo();
        assertEquals(5,baseDemo.sum(2,3));
    }

    @Test
    public void should_return_1(){
        BaseDemo baseDemo = new BaseDemo();
        assertEquals(1,baseDemo.sum(-2,3));
    }
}
