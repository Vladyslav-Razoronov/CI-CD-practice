import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Tests {
    @Test
    public void testIsEven(){
        Assert.assertTrue(Tasks.isEven(14));
        Assert.assertTrue(Tasks.isEven(8734));

        Assert.assertFalse(Tasks.isEven(5));
        Assert.assertFalse(Tasks.isEven(-1));
    }

    @Test
    public void testGreeting(){
        Assert.assertEquals(Tasks.createGreeting("Bob"),"Hello, Bob! How are you?");
        Assert.assertEquals(Tasks.createGreeting("Alice"),"Hello, Alice! How are you?");
    }

    @Test
    public void testFilterPositives(){
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5);
        List<Integer> numbers2 = Arrays.asList(-2,14,5,-8,63,18,-3,0);

        Assert.assertEquals(Tasks.filterPositives(numbers1),numbers1);
        Assert.assertEquals(Tasks.filterPositives(numbers2),Arrays.asList(14,5,63,18));
    }
}
