import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestArrays {
    Arrays arrays;
    @Before
    public void beforeArr(){
        arrays = new Arrays();
    }
    @Test
    public void testNewArr(){
        int[] ints = arrays.newArr(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7});
        Assert.assertArrayEquals(new int[]{1,7},ints);
        Assert.assertArrayEquals(new int[]{},arrays.newArr(new int[]{4}));
        Assert.assertArrayEquals(new int[]{},arrays.newArr(new int[]{5,7,4,1,5,4,4}));
        Assert.assertArrayEquals(new int[]{7,8,6,3},arrays.newArr(new int[]{1,5,8,4,7,8,6,3}));
    }
    @Test
    public void testCheckArr(){
        Assert.assertTrue(arrays.checkArr(new int[]{1,4,1,4,1,4}));
        Assert.assertFalse(arrays.checkArr(new int[]{1,4,1,5,1,4}));
        Assert.assertFalse(arrays.checkArr(new int[]{1,1,1,1,1,1,}));
        Assert.assertFalse(arrays.checkArr(new int[]{4,4,4,4,4,4}));
    }
}
