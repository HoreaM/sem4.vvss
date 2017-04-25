import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by horea on 25/04/2017.
 */
public class PrimeTest {
    @Test
    public void primeTwins() throws Exception {
        int[] result;
        result = new int[]{1, 3};
        assertArrayEquals(Prime.primeTwins(-1000), result);
        result = new int[]{1, 3};
        assertArrayEquals(Prime.primeTwins(0), result);
        result = new int[]{11, 13};
        assertArrayEquals(Prime.primeTwins(5), result);
        result = new int[]{137, 139};
        assertArrayEquals(Prime.primeTwins(123), result);
        result = new int[]{-1, -1};
        assertArrayEquals(Prime.primeTwins(2147483647), result);
        result = new int[]{-1, -1};
        assertArrayEquals(Prime.primeTwins(2147483645), result);

    }

}