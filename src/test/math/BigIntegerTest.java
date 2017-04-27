package test.math;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
* BigInteger Tester.
*
* @author <Authors name>
* @since <pre>2017年4月27日09:15:13</pre>
* @version 1.0
*/
public class BigIntegerTest {

@Before
public void before() throws Exception {
}

@After
public void after() throws Exception {
}


/**
*
* Method: add(BigInteger val)
*
*/
@Test
public void testAddVal() throws Exception {
//TODO: Test goes here...
    assertEquals(new BigInteger("1"),new BigInteger("1").add(new BigInteger("0")));
    assertEquals(new BigInteger("1"),new BigInteger("0").add(new BigInteger("1")));
    assertEquals(new BigInteger("2"),new BigInteger("1").add(new BigInteger("1")));
    assertEquals(new BigInteger("0"),new BigInteger("1").add(new BigInteger("-1")));
    assertEquals(new BigInteger("1"),new BigInteger("-1").add(new BigInteger("2")));
    assertEquals(new BigInteger("-1"),new BigInteger("-2").add(new BigInteger("1")));
}

/**
*
* Method: subtract(BigInteger val)
*
*/
@Test
public void testSubtract() throws Exception {
//TODO: Test goes here...
    assertEquals(new BigInteger("1"),new BigInteger("1").subtract(new BigInteger("0")));
    assertEquals(new BigInteger("-1"),new BigInteger("0").subtract(new BigInteger("1")));
    assertEquals(new BigInteger("-2"),new BigInteger("-1").subtract(new BigInteger("1")));
    assertEquals(new BigInteger("0"),new BigInteger("1").subtract(new BigInteger("1")));
    assertEquals(new BigInteger("-5"),new BigInteger("-2").subtract(new BigInteger("3")));
    assertEquals(new BigInteger("5"),new BigInteger("3").subtract(new BigInteger("-2")));

}

/**
*
* Method: multiply(BigInteger val)
*
*/
@Test
public void testMultiplyVal() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: multiply(long v)
*
*/
@Test
public void testMultiplyV() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: divide(BigInteger val)
*
*/
@Test
public void testDivide() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: divideAndRemainder(BigInteger val)
*
*/
@Test
public void testDivideAndRemainder() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: remainder(BigInteger val)
*
*/
@Test
public void testRemainder() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: pow(int exponent)
*
*/
@Test
public void testPow() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: gcd(BigInteger val)
*
*/
@Test
public void testGcd() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: bitLengthForInt(int n)
*
*/
@Test
public void testBitLengthForInt() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: primitiveRightShift(int[] a, int len, int n)
*
*/
@Test
public void testPrimitiveRightShift() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: primitiveLeftShift(int[] a, int len, int n)
*
*/
@Test
public void testPrimitiveLeftShift() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: abs()
*
*/
@Test
public void testAbs() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: negate()
*
*/
@Test
public void testNegate() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: signum()
*
*/
@Test
public void testSignum() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: mod(BigInteger m)
*
*/
@Test
public void testMod() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: modPow(BigInteger exponent, BigInteger m)
*
*/
@Test
public void testModPow() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: mulAdd(int[] out, int[] in, int offset, int len, int k)
*
*/
@Test
public void testMulAdd() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: addOne(int[] a, int offset, int mlen, int carry)
*
*/
@Test
public void testAddOne() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: modInverse(BigInteger m)
*
*/
@Test
public void testModInverse() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: shiftLeft(int n)
*
*/
@Test
public void testShiftLeft() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: shiftRight(int n)
*
*/
@Test
public void testShiftRight() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: javaIncrement(int[] val)
*
*/
@Test
public void testJavaIncrement() throws Exception {
//TODO: Test goes here...
    int[] b={2,3};
    javaIncrement(b);
assertEquals(int[] a={2},);
}

/**
*
* Method: and(BigInteger val)
*
*/
@Test
public void testAnd() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: or(BigInteger val)
*
*/
@Test
public void testOr() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: xor(BigInteger val)
*
*/
@Test
public void testXor() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: not()
*
*/
@Test
public void testNot() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: andNot(BigInteger val)
*
*/
@Test
public void testAndNot() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: testBit(int n)
*
*/
@Test
public void testTestBit() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: setBit(int n)
*
*/
@Test
public void testSetBit() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: clearBit(int n)
*
*/
@Test
public void testClearBit() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: flipBit(int n)
*
*/
@Test
public void testFlipBit() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: getLowestSetBit()
*
*/
@Test
public void testGetLowestSetBit() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: bitLength()
*
*/
@Test
public void testBitLength() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: bitCount()
*
*/
@Test
public void testBitCount() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: isProbablePrime(int certainty)
*
*/
@Test
public void testIsProbablePrime() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: compareTo(BigInteger val)
*
*/
@Test
public void testCompareTo() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: compareMagnitude(BigInteger val)
*
*/
@Test
public void testCompareMagnitudeVal() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: equals(Object x)
*
*/
@Test
public void testEquals() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: min(BigInteger val)
*
*/
@Test
public void testMin() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: max(BigInteger val)
*
*/
@Test
public void testMax() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: hashCode()
*
*/
@Test
public void testHashCode() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: toString(int radix)
*
*/
@Test
public void testToStringRadix() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: toString()
*
*/
@Test
public void testToString() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: toByteArray()
*
*/
@Test
public void testToByteArray() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: intValue()
*
*/
@Test
public void testIntValue() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: longValue()
*
*/
@Test
public void testLongValue() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: floatValue()
*
*/
@Test
public void testFloatValue() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: doubleValue()
*
*/
@Test
public void testDoubleValue() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: longValueExact()
*
*/
@Test
public void testLongValueExact() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: intValueExact()
*
*/
@Test
public void testIntValueExact() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: shortValueExact()
*
*/
@Test
public void testShortValueExact() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: byteValueExact()
*
*/
@Test
public void testByteValueExact() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: putSign(BigInteger bi, int sign)
*
*/
@Test
public void testPutSign() throws Exception {
//TODO: Test goes here...
}

/**
*
* Method: putMag(BigInteger bi, int[] magnitude)
*
*/
@Test
public void testPutMag() throws Exception {
//TODO: Test goes here...
}


/**
*
* Method: parseInt(char[] source, int start, int end)
*
*/
@Test
public void testParseInt() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("parseInt", char[].class, int.class, int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: destructiveMulAdd(int[] x, int y, int z)
*
*/
@Test
public void testDestructiveMulAdd() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("destructiveMulAdd", int[].class, int.class, int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: randomBits(int numBits, Random rnd)
*
*/
@Test
public void testRandomBits() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("randomBits", int.class, Random.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: smallPrime(int bitLength, int certainty, Random rnd)
*
*/
@Test
public void testSmallPrime() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("smallPrime", int.class, int.class, Random.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: largePrime(int bitLength, int certainty, Random rnd)
*
*/
@Test
public void testLargePrime() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("largePrime", int.class, int.class, Random.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: getPrimeSearchLen(int bitLength)
*
*/
@Test
public void testGetPrimeSearchLen() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("getPrimeSearchLen", int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: passesLucasLehmer()
*
*/
@Test
public void testPassesLucasLehmer() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("passesLucasLehmer");
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: jacobiSymbol(int p, BigInteger n)
*
*/
@Test
public void testJacobiSymbol() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("jacobiSymbol", int.class, BigInteger.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: lucasLehmerSequence(int z, BigInteger k, BigInteger n)
*
*/
@Test
public void testLucasLehmerSequence() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("lucasLehmerSequence", int.class, BigInteger.class, BigInteger.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: passesMillerRabin(int iterations, Random rnd)
*
*/
@Test
public void testPassesMillerRabin() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("passesMillerRabin", int.class, Random.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: checkRange()
*
*/
@Test
public void testCheckRange() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("checkRange");
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: reportOverflow()
*
*/
@Test
public void testReportOverflow() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("reportOverflow");
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}



/**
*
* Method: add(int[] x, long val)
*
*/
@Test
public void testAddForXVal() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("add", int[].class, long.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: add(int[] x, int[] y)
*
*/
@Test
public void testAddForXY() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("add", int[].class, int[].class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: subtract(long val, int[] little)
*
*/
@Test
public void testSubtractForValLittle() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("subtract", long.class, int[].class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: subtract(int[] big, long val)
*
*/
@Test
public void testSubtractForBigVal() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("subtract", int[].class, long.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: subtract(int[] big, int[] little)
*
*/
@Test
public void testSubtractForBigLittle() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("subtract", int[].class, int[].class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: multiplyByInt(int[] x, int y, int sign)
*
*/
@Test
public void testMultiplyByInt() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("multiplyByInt", int[].class, int.class, int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: multiplyToLen(int[] x, int xlen, int[] y, int ylen, int[] z)
*
*/
@Test
public void testMultiplyToLen() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("multiplyToLen", int[].class, int.class, int[].class, int.class, int[].class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: multiplyKaratsuba(BigInteger x, BigInteger y)
*
*/
@Test
public void testMultiplyKaratsuba() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("multiplyKaratsuba", BigInteger.class, BigInteger.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: multiplyToomCook3(BigInteger a, BigInteger b)
*
*/
@Test
public void testMultiplyToomCook3() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("multiplyToomCook3", BigInteger.class, BigInteger.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: getToomSlice(int lowerSize, int upperSize, int slice, int fullsize)
*
*/
@Test
public void testGetToomSlice() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("getToomSlice", int.class, int.class, int.class, int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: exactDivideBy3()
*
*/
@Test
public void testExactDivideBy3() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("exactDivideBy3");
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: getLower(int n)
*
*/
@Test
public void testGetLower() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("getLower", int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: getUpper(int n)
*
*/
@Test
public void testGetUpper() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("getUpper", int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: square()
*
*/
@Test
public void testSquare() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("square");
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: squareToLen(int[] x, int len, int[] z)
*
*/
@Test
public void testSquareToLen() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("squareToLen", int[].class, int.class, int[].class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: squareKaratsuba()
*
*/
@Test
public void testSquareKaratsuba() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("squareKaratsuba");
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: squareToomCook3()
*
*/
@Test
public void testSquareToomCook3() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("squareToomCook3");
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: divideKnuth(BigInteger val)
*
*/
@Test
public void testDivideKnuth() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("divideKnuth", BigInteger.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: divideAndRemainderKnuth(BigInteger val)
*
*/
@Test
public void testDivideAndRemainderKnuth() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("divideAndRemainderKnuth", BigInteger.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: remainderKnuth(BigInteger val)
*
*/
@Test
public void testRemainderKnuth() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("remainderKnuth", BigInteger.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: divideBurnikelZiegler(BigInteger val)
*
*/
@Test
public void testDivideBurnikelZiegler() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("divideBurnikelZiegler", BigInteger.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: remainderBurnikelZiegler(BigInteger val)
*
*/
@Test
public void testRemainderBurnikelZiegler() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("remainderBurnikelZiegler", BigInteger.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: divideAndRemainderBurnikelZiegler(BigInteger val)
*
*/
@Test
public void testDivideAndRemainderBurnikelZiegler() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("divideAndRemainderBurnikelZiegler", BigInteger.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: leftShift(int[] a, int len, int n)
*
*/
@Test
public void testLeftShift() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("leftShift", int[].class, int.class, int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: bitLength(int[] val, int len)
*
*/



/**
*
* Method: oddModPow(BigInteger y, BigInteger z)
*
*/
@Test
public void testOddModPow() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("oddModPow", BigInteger.class, BigInteger.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: montReduce(int[] n, int[] mod, int mlen, int inv)
*
*/
@Test
public void testMontReduce() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("montReduce", int[].class, int[].class, int.class, int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: intArrayCmpToLen(int[] arg1, int[] arg2, int len)
*
*/
@Test
public void testIntArrayCmpToLen() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("intArrayCmpToLen", int[].class, int[].class, int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: subN(int[] a, int[] b, int len)
*
*/
@Test
public void testSubN() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("subN", int[].class, int[].class, int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: modPow2(BigInteger exponent, int p)
*
*/
@Test
public void testModPow2() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("modPow2", BigInteger.class, int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: mod2(int p)
*
*/
@Test
public void testMod2() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("mod2", int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}



/**
*
* Method: shiftRightImpl(int n)
*
*/
@Test
public void testShiftRightImpl() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("shiftRightImpl", int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: smallToString(int radix)
*
*/
@Test
public void testSmallToString() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("smallToString", int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}



/**
*
* Method: getRadixConversionCache(int radix, int exponent)
*
*/
@Test
public void testGetRadixConversionCache() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("getRadixConversionCache", int.class, int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: stripLeadingZeroInts(int val[])
*
*/
@Test
public void testStripLeadingZeroInts() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("stripLeadingZeroInts", int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: trustedStripLeadingZeroInts(int val[])
*
*/
@Test
public void testTrustedStripLeadingZeroInts() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("trustedStripLeadingZeroInts", int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: stripLeadingZeroBytes(byte a[])
*
*/
@Test
public void testStripLeadingZeroBytes() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("stripLeadingZeroBytes", byte.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: makePositive(byte a[])
*
*/
@Test
public void testMakePositiveA() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("makePositive", byte.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: intLength()
*
*/
@Test
public void testIntLength() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("intLength");
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: signBit()
*
*/
@Test
public void testSignBit() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("signBit");
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: signInt()
*
*/
@Test
public void testSignInt() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("signInt");
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: getInt(int n)
*
*/
@Test
public void testGetInt() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("getInt", int.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: firstNonzeroIntNum()
*
*/
@Test
public void testFirstNonzeroIntNum() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("firstNonzeroIntNum");
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: readObject(ObjectInputStream s)
*
*/
@Test
public void testReadObject() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("readObject", ObjectInputStream.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: writeObject(ObjectOutputStream s)
*
*/
@Test
public void testWriteObject() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("writeObject", ObjectOutputStream.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

/**
*
* Method: magSerializedForm()
*
*/
@Test
public void testMagSerializedForm() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = BigInteger.getClass().getMethod("magSerializedForm");
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
}

}
