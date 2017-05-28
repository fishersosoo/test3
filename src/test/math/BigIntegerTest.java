package test.math;

import org.junit.Test;
import math.math.BigInteger;


import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * BigInteger Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>2017年4月27日09:15:13</pre>
 */
public class BigIntegerTest {


    /**
     * Method: add(BigInteger val)
     */
    @Test
    public void testAddVal1() throws Exception {
//TODO: Test goes here...
        assertEquals(new BigInteger("1"), new BigInteger("1").add(new BigInteger("0")));
    }
    /**
     * Method: add(BigInteger val)
     */
    @Test
    public void testAddVal2() throws Exception {
        assertEquals(new BigInteger("1"), new BigInteger("0").add(new BigInteger("1")));
    }
    /**
     * Method: add(BigInteger val)
     */
    @Test
    public void testAddVal3() throws Exception {
        assertEquals(new BigInteger("2"), new BigInteger("1").add(new BigInteger("1")));
    }
    /**
     * Method: add(BigInteger val)
     */
    @Test
    public void testAddVal4() throws Exception {
        assertEquals(new BigInteger("0"), new BigInteger("1").add(new BigInteger("-1")));
    }
    /**
     * Method: add(BigInteger val)
     */
    @Test
    public void testAddVal5() throws Exception {
        assertEquals(new BigInteger("1"), new BigInteger("-1").add(new BigInteger("2")));
    }
    /**
     * Method: add(BigInteger val)
     */
    @Test
    public void testAddVal6() throws Exception {
        assertEquals(new BigInteger("-1"), new BigInteger("-2").add(new BigInteger("1")));
    }
    /**
     * Method: subtract(BigInteger val)
     */
    @Test
    public void testSubtract1() throws Exception {
//TODO: Test goes here...
        assertEquals(new BigInteger("1"), new BigInteger("1").subtract(new BigInteger("0")));
    }
    /**
     * Method: subtract(BigInteger val)
     */
    @Test
    public void testSubtract2() throws Exception {
        assertEquals(new BigInteger("-1"), new BigInteger("0").subtract(new BigInteger("1")));
    }
    /**
     * Method: subtract(BigInteger val)
     */
    @Test
    public void testSubtract3() throws Exception {
        assertEquals(new BigInteger("-2"), new BigInteger("-1").subtract(new BigInteger("1")));
    }
    /**
     * Method: subtract(BigInteger val)
     */
    @Test
    public void testSubtract4() throws Exception {
        assertEquals(new BigInteger("0"), new BigInteger("1").subtract(new BigInteger("1")));
    }
    /**
     * Method: subtract(BigInteger val)
     */
    @Test
    public void testSubtract5() throws Exception {
        assertEquals(new BigInteger("-5"), new BigInteger("-2").subtract(new BigInteger("3")));
    }
    /**
     * Method: subtract(BigInteger val)
     */
    @Test
    public void testSubtract6() throws Exception {
        assertEquals(new BigInteger("5"), new BigInteger("3").subtract(new BigInteger("-2")));
    }

    /**
     * Method: javaIncrement(int[] val)
     */
    @Test
    public void testJavaIncrement() throws Exception {
//TODO: Test goes here...
        assertArrayEquals(new int[]{2}, new BigInteger("1").javaIncrement(new int[]{1}));

    }

    /**
     * Method: javaIncrement(int[] val)
     */
    @Test
    public void testJavaIncrement2() throws Exception {
        assertArrayEquals(new int[]{1, 0}, new BigInteger("1").javaIncrement(new int[]{0xffffffff}));
    }
    /**
     * private static int intArrayCmpToLen(int[] arg1, int[] arg2, int len)
     */
    @Test
    public void testIntArrayCmpToLen1() throws Exception {
//TODO: Test goes here...
        assertEquals(0, BigInteger.intArrayCmpToLen(null, null, 0));
    }
    /**
     * private static int intArrayCmpToLen(int[] arg1, int[] arg2, int len)
     */
    @Test
    public void testIntArrayCmpToLen2() throws Exception {
        assertEquals(0, BigInteger.intArrayCmpToLen(new int[]{1}, new int[]{1}, 1));
    }
    /**
     * private static int intArrayCmpToLen(int[] arg1, int[] arg2, int len)
     */
    @Test
    public void testIntArrayCmpToLen3() throws Exception {
        assertEquals(-1, BigInteger.intArrayCmpToLen(new int[]{0}, new int[]{1}, 1));
    }
    /**
     * private static int intArrayCmpToLen(int[] arg1, int[] arg2, int len)
     */
    @Test
    public void testIntArrayCmpToLen4() throws Exception {
        assertEquals(1, BigInteger.intArrayCmpToLen(new int[]{1}, new int[]{0}, 1));
    }
}

