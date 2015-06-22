package exercise03;

import junit.framework.*;

public class RingBufferTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test1");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test2");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    java.lang.Object var7 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)0+ "'", var7.equals((short)0));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test3");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      exercise03.RingBuffer var1 = new exercise03.RingBuffer((-1));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test4");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test5");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    boolean var9 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test6");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    java.lang.Object var20 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test7");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test8");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var21.iterator();
    java.util.Spliterator var24 = var21.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var25 = var21.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test9");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Spliterator var4 = var1.spliterator();
    exercise03.RingBuffer var6 = new exercise03.RingBuffer(100);
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    var6.enqueue((java.lang.Object)(short)0);
    boolean var12 = var6.isEmpty();
    java.util.Iterator var13 = var6.iterator();
    java.lang.Object var14 = var6.dequeue();
    java.util.Spliterator var15 = var6.spliterator();
    var1.enqueue((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + (short)0+ "'", var14.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test10");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    var10.enqueue((java.lang.Object)10);
    java.util.Spliterator var25 = var10.spliterator();
    java.util.Spliterator var26 = var10.spliterator();
    boolean var27 = var10.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test11");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Spliterator var23 = var21.spliterator();
    int var24 = var21.size();
    boolean var25 = var21.isEmpty();
    java.util.Iterator var26 = var21.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var27 = var21.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test12");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    java.lang.Object var13 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + (short)0+ "'", var13.equals((short)0));

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test13");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Spliterator var8 = var1.spliterator();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    java.util.Spliterator var13 = var10.spliterator();
    boolean var14 = var10.isEmpty();
    var1.enqueue((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test14");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    java.util.Spliterator var9 = var1.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    java.util.Spliterator var18 = var11.spliterator();
    var1.enqueue((java.lang.Object)var18);
    java.util.Spliterator var20 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test15");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test16");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    int var7 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test17");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var23 = var21.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test18");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var21.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var24 = var21.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test19");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    int var2 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test20");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    boolean var10 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test21");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)0);
    int var4 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test22");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    java.lang.Object var7 = var1.dequeue();
    java.util.Spliterator var8 = var1.spliterator();
    int var9 = var1.size();
    java.util.Spliterator var10 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)0+ "'", var7.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test23");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    java.util.Spliterator var11 = var1.spliterator();
    java.util.Spliterator var12 = var1.spliterator();
    boolean var13 = var1.isEmpty();
    boolean var14 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test24");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test25");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Iterator var4 = var1.iterator();
    java.lang.Object var5 = var1.dequeue();
    int var6 = var1.size();
    int var7 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1+ "'", var5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test26");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    exercise03.RingBuffer var24 = new exercise03.RingBuffer(100);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    boolean var27 = var24.isEmpty();
    var24.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var30 = var24.spliterator();
    boolean var31 = var24.isEmpty();
    exercise03.RingBuffer var33 = new exercise03.RingBuffer(100);
    boolean var34 = var33.isEmpty();
    boolean var35 = var33.isEmpty();
    boolean var36 = var33.isEmpty();
    var33.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var39 = var33.spliterator();
    java.util.Iterator var40 = var33.iterator();
    var24.enqueue((java.lang.Object)var33);
    java.util.Spliterator var42 = var33.spliterator();
    exercise03.RingBuffer var44 = new exercise03.RingBuffer(100);
    var33.enqueue((java.lang.Object)var44);
    java.util.Iterator var46 = var33.iterator();
    var10.enqueue((java.lang.Object)var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test27");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    boolean var19 = var10.isEmpty();
    java.util.Spliterator var20 = var10.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test28");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test29");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var21.iterator();
    int var24 = var21.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var25 = var21.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test30");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    boolean var13 = var8.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test31");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    java.lang.Object var7 = var1.dequeue();
    java.util.Spliterator var8 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)0+ "'", var7.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test32");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    int var2 = var1.size();
    int var3 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test33");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    boolean var10 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (short)0+ "'", var9.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test34");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    boolean var10 = var1.isEmpty();
    java.util.Spliterator var11 = var1.spliterator();
    java.util.Spliterator var12 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (short)0+ "'", var9.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test35");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(0);
    int var2 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test36");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    boolean var12 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test37");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test38");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    exercise03.RingBuffer var4 = new exercise03.RingBuffer(100);
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    boolean var7 = var4.isEmpty();
    var4.enqueue((java.lang.Object)(short)0);
    java.lang.Object var10 = var4.dequeue();
    java.util.Spliterator var11 = var4.spliterator();
    var1.enqueue((java.lang.Object)var11);
    int var13 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (short)0+ "'", var10.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test39");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var10.iterator();
    java.util.Iterator var24 = var10.iterator();
    int var25 = var10.size();
    java.util.Iterator var26 = var10.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test40");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test41");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Iterator var4 = var1.iterator();
    java.lang.Object var5 = var1.dequeue();
    int var6 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1+ "'", var5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test42");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    java.lang.Object var7 = var1.dequeue();
    java.util.Iterator var8 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)0+ "'", var7.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test43");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    java.util.Iterator var10 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (short)0+ "'", var9.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test44");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    exercise03.RingBuffer var24 = new exercise03.RingBuffer(100);
    java.util.Iterator var25 = var24.iterator();
    java.util.Spliterator var26 = var24.spliterator();
    boolean var27 = var24.isEmpty();
    var10.enqueue((java.lang.Object)var27);
    int var29 = var10.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 3);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test45");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test46");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test47");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (short)0+ "'", var9.equals((short)0));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test48");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Spliterator var23 = var21.spliterator();
    int var24 = var21.size();
    java.util.Spliterator var25 = var21.spliterator();
    java.util.Spliterator var26 = var21.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test49");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var4 = var1.spliterator();
    boolean var5 = var1.isEmpty();
    java.lang.Object var6 = var1.dequeue();
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    boolean var11 = var8.isEmpty();
    var8.enqueue((java.lang.Object)(-1.0d));
    java.util.Iterator var14 = var8.iterator();
    int var15 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 1+ "'", var6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test50");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    boolean var19 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test51");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    java.util.Spliterator var11 = var1.spliterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    boolean var20 = var13.isEmpty();
    exercise03.RingBuffer var22 = new exercise03.RingBuffer(100);
    boolean var23 = var22.isEmpty();
    boolean var24 = var22.isEmpty();
    boolean var25 = var22.isEmpty();
    var22.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var28 = var22.spliterator();
    java.util.Iterator var29 = var22.iterator();
    var13.enqueue((java.lang.Object)var22);
    java.util.Spliterator var31 = var22.spliterator();
    exercise03.RingBuffer var33 = new exercise03.RingBuffer(100);
    var22.enqueue((java.lang.Object)var33);
    java.util.Spliterator var35 = var33.spliterator();
    java.util.Spliterator var36 = var33.spliterator();
    var1.enqueue((java.lang.Object)var33);
    boolean var38 = var33.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test52");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var4 = var1.spliterator();
    java.lang.Object var5 = var1.dequeue();
    java.util.Iterator var6 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1+ "'", var5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test53");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    boolean var10 = var1.isEmpty();
    java.util.Spliterator var11 = var1.spliterator();
    java.util.Spliterator var12 = var1.spliterator();
    boolean var13 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (short)0+ "'", var9.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test54");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var14 = var1.spliterator();
    java.lang.Object var15 = var1.dequeue();
    int var16 = var1.size();
    boolean var17 = var1.isEmpty();
    java.util.Iterator var18 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + (-1.0d)+ "'", var15.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test55");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(2);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    java.util.Iterator var4 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test56");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    boolean var18 = var11.isEmpty();
    int var19 = var11.size();
    java.lang.Object var20 = var11.dequeue();
    java.util.Spliterator var21 = var11.spliterator();
    var1.enqueue((java.lang.Object)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + (-1.0d)+ "'", var20.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test57");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var14 = var1.spliterator();
    java.lang.Object var15 = var1.dequeue();
    int var16 = var1.size();
    java.util.Spliterator var17 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + (-1.0d)+ "'", var15.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test58");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    boolean var7 = var1.isEmpty();
    java.lang.Object var8 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (short)0+ "'", var8.equals((short)0));

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test59");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(1);
    int var2 = var1.size();
    exercise03.RingBuffer var4 = new exercise03.RingBuffer(100);
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    boolean var7 = var4.isEmpty();
    var4.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var10 = var4.spliterator();
    boolean var11 = var4.isEmpty();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Iterator var20 = var13.iterator();
    var4.enqueue((java.lang.Object)var13);
    java.util.Spliterator var22 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    int var24 = var13.size();
    java.util.Iterator var25 = var13.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test60");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    var8.enqueue((java.lang.Object)10.0f);
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    java.util.Iterator var17 = var16.iterator();
    java.util.Spliterator var18 = var16.spliterator();
    boolean var19 = var16.isEmpty();
    var8.enqueue((java.lang.Object)var16);
    java.lang.Object var21 = var8.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + 1+ "'", var21.equals(1));

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test61");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    int var6 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test62");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(1);
    int var2 = var1.size();
    exercise03.RingBuffer var4 = new exercise03.RingBuffer(100);
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    boolean var7 = var4.isEmpty();
    var4.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var10 = var4.spliterator();
    boolean var11 = var4.isEmpty();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Iterator var20 = var13.iterator();
    var4.enqueue((java.lang.Object)var13);
    java.util.Spliterator var22 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    java.util.Iterator var24 = var13.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test63");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    boolean var18 = var11.isEmpty();
    exercise03.RingBuffer var20 = new exercise03.RingBuffer(100);
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    boolean var23 = var20.isEmpty();
    var20.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var26 = var20.spliterator();
    java.util.Iterator var27 = var20.iterator();
    var11.enqueue((java.lang.Object)var20);
    java.util.Spliterator var29 = var20.spliterator();
    exercise03.RingBuffer var31 = new exercise03.RingBuffer(100);
    var20.enqueue((java.lang.Object)var31);
    var20.enqueue((java.lang.Object)10);
    java.util.Spliterator var35 = var20.spliterator();
    java.util.Spliterator var36 = var20.spliterator();
    var1.enqueue((java.lang.Object)var36);
    java.util.Iterator var38 = var1.iterator();
    exercise03.RingBuffer var40 = new exercise03.RingBuffer(2);
    java.util.Spliterator var41 = var40.spliterator();
    var1.enqueue((java.lang.Object)var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test64");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise03.RingBuffer var7 = new exercise03.RingBuffer(100);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    boolean var10 = var7.isEmpty();
    var7.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var13 = var7.spliterator();
    boolean var14 = var7.isEmpty();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var22 = var16.spliterator();
    java.util.Iterator var23 = var16.iterator();
    var7.enqueue((java.lang.Object)var16);
    java.lang.Object var25 = var7.dequeue();
    var1.enqueue((java.lang.Object)var7);
    java.util.Iterator var27 = var1.iterator();
    java.lang.Object var28 = var1.dequeue();
    int var29 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + (-1.0d)+ "'", var25.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + 1+ "'", var28.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test65");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Iterator var8 = var1.iterator();
    java.util.Spliterator var9 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test66");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    var8.enqueue((java.lang.Object)10.0f);
    java.lang.Object var15 = var8.dequeue();
    java.util.Spliterator var16 = var8.spliterator();
    exercise03.RingBuffer var18 = new exercise03.RingBuffer(100);
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    boolean var21 = var18.isEmpty();
    var18.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var24 = var18.spliterator();
    var18.enqueue((java.lang.Object)100L);
    java.lang.Object var27 = var18.dequeue();
    java.util.Spliterator var28 = var18.spliterator();
    exercise03.RingBuffer var30 = new exercise03.RingBuffer(100);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    boolean var33 = var30.isEmpty();
    var30.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var36 = var30.spliterator();
    boolean var37 = var30.isEmpty();
    exercise03.RingBuffer var39 = new exercise03.RingBuffer(100);
    boolean var40 = var39.isEmpty();
    boolean var41 = var39.isEmpty();
    boolean var42 = var39.isEmpty();
    var39.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var45 = var39.spliterator();
    java.util.Iterator var46 = var39.iterator();
    var30.enqueue((java.lang.Object)var39);
    java.util.Spliterator var48 = var39.spliterator();
    exercise03.RingBuffer var50 = new exercise03.RingBuffer(100);
    var39.enqueue((java.lang.Object)var50);
    java.util.Spliterator var52 = var50.spliterator();
    java.util.Spliterator var53 = var50.spliterator();
    var18.enqueue((java.lang.Object)var50);
    var8.enqueue((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 1+ "'", var15.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + (-1.0d)+ "'", var27.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test67");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Spliterator var8 = var1.spliterator();
    java.util.Spliterator var9 = var1.spliterator();
    int var10 = var1.size();
    int var11 = var1.size();
    int var12 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test68");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test69");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    var10.enqueue((java.lang.Object)10);
    boolean var25 = var10.isEmpty();
    int var26 = var10.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 3);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test70");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.util.Spliterator var7 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test71");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(1);
    int var2 = var1.size();
    int var3 = var1.size();
    int var4 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test72");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    java.util.Spliterator var9 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test73");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    java.lang.Object var10 = var1.dequeue();
    exercise03.RingBuffer var12 = new exercise03.RingBuffer(100);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    var12.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var19 = new exercise03.RingBuffer(100);
    var19.enqueue((java.lang.Object)1);
    int var22 = var19.size();
    var12.enqueue((java.lang.Object)var19);
    java.util.Iterator var24 = var19.iterator();
    java.util.Iterator var25 = var19.iterator();
    java.util.Spliterator var26 = var19.spliterator();
    var1.enqueue((java.lang.Object)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test74");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var4 = var1.spliterator();
    java.lang.Object var5 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1+ "'", var5.equals(1));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test75");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    java.util.Iterator var20 = var10.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test76");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Spliterator var23 = var21.spliterator();
    int var24 = var21.size();
    boolean var25 = var21.isEmpty();
    boolean var26 = var21.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test77");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Iterator var19 = var1.iterator();
    java.util.Iterator var20 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test78");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    java.util.Iterator var11 = var1.iterator();
    java.util.Spliterator var12 = var1.spliterator();
    boolean var13 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test79");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    java.util.Spliterator var9 = var1.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    java.util.Spliterator var14 = var11.spliterator();
    boolean var15 = var11.isEmpty();
    var11.enqueue((java.lang.Object)'#');
    var1.enqueue((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test80");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    java.lang.Object var10 = var1.dequeue();
    java.util.Spliterator var11 = var1.spliterator();
    java.util.Spliterator var12 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test81");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    java.util.Spliterator var6 = var1.spliterator();
    java.lang.Object var7 = var1.dequeue();
    boolean var8 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1+ "'", var7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test82");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    java.util.Spliterator var11 = var1.spliterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    boolean var20 = var13.isEmpty();
    exercise03.RingBuffer var22 = new exercise03.RingBuffer(100);
    boolean var23 = var22.isEmpty();
    boolean var24 = var22.isEmpty();
    boolean var25 = var22.isEmpty();
    var22.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var28 = var22.spliterator();
    java.util.Iterator var29 = var22.iterator();
    var13.enqueue((java.lang.Object)var22);
    java.util.Spliterator var31 = var22.spliterator();
    exercise03.RingBuffer var33 = new exercise03.RingBuffer(100);
    var22.enqueue((java.lang.Object)var33);
    java.util.Spliterator var35 = var33.spliterator();
    java.util.Spliterator var36 = var33.spliterator();
    var1.enqueue((java.lang.Object)var33);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var38 = var33.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test83");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    exercise03.RingBuffer var9 = new exercise03.RingBuffer(100);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var9.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var15 = var9.spliterator();
    var9.enqueue((java.lang.Object)100L);
    java.lang.Object var18 = var9.dequeue();
    var1.enqueue(var18);
    java.util.Iterator var20 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + (-1.0d)+ "'", var18.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test84");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    exercise03.RingBuffer var4 = new exercise03.RingBuffer(100);
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    boolean var7 = var4.isEmpty();
    var4.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var10 = var4.spliterator();
    boolean var11 = var4.isEmpty();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Iterator var20 = var13.iterator();
    var4.enqueue((java.lang.Object)var13);
    java.util.Spliterator var22 = var13.spliterator();
    exercise03.RingBuffer var24 = new exercise03.RingBuffer(100);
    var13.enqueue((java.lang.Object)var24);
    java.util.Spliterator var26 = var24.spliterator();
    int var27 = var24.size();
    boolean var28 = var24.isEmpty();
    var1.enqueue((java.lang.Object)var28);
    boolean var30 = var1.isEmpty();
    java.util.Iterator var31 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test85");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    java.util.Spliterator var11 = var1.spliterator();
    int var12 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test86");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    var1.enqueue((java.lang.Object)(short)10);
    java.lang.Object var6 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 1+ "'", var6.equals(1));

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test87");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    java.util.Spliterator var6 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test88");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    java.util.Iterator var11 = var1.iterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    var13.enqueue((java.lang.Object)100L);
    java.lang.Object var22 = var13.dequeue();
    java.util.Iterator var23 = var13.iterator();
    java.util.Spliterator var24 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    boolean var26 = var13.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + (-1.0d)+ "'", var22.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test89");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    exercise03.RingBuffer var9 = new exercise03.RingBuffer(100);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var9.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var15 = var9.spliterator();
    var9.enqueue((java.lang.Object)100L);
    java.lang.Object var18 = var9.dequeue();
    var1.enqueue(var18);
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    boolean var24 = var21.isEmpty();
    var21.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var27 = var21.spliterator();
    boolean var28 = var21.isEmpty();
    int var29 = var21.size();
    java.lang.Object var30 = var21.dequeue();
    var1.enqueue((java.lang.Object)var21);
    boolean var32 = var21.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var33 = var21.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + (-1.0d)+ "'", var18.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + (-1.0d)+ "'", var30.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test90");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)0);
    var1.enqueue((java.lang.Object)(short)100);
    int var6 = var1.size();
    java.util.Spliterator var7 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test91");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.util.Spliterator var10 = var1.spliterator();
    java.util.Spliterator var11 = var1.spliterator();
    boolean var12 = var1.isEmpty();
    java.util.Spliterator var13 = var1.spliterator();
    java.util.Spliterator var14 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test92");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    java.util.Iterator var13 = var8.iterator();
    java.util.Iterator var14 = var8.iterator();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var22 = var16.spliterator();
    var16.enqueue((java.lang.Object)100L);
    java.lang.Object var25 = var16.dequeue();
    var16.enqueue((java.lang.Object)"");
    java.util.Iterator var28 = var16.iterator();
    var8.enqueue((java.lang.Object)var28);
    boolean var30 = var8.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + (-1.0d)+ "'", var25.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test93");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    var11.enqueue((java.lang.Object)1);
    java.util.Spliterator var14 = var11.spliterator();
    int var15 = var11.size();
    java.util.Spliterator var16 = var11.spliterator();
    var1.enqueue((java.lang.Object)var11);
    java.lang.Object var18 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + (-1.0d)+ "'", var18.equals((-1.0d)));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test94");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test95");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.util.Iterator var11 = var1.iterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(short)0);
    boolean var19 = var13.isEmpty();
    java.util.Iterator var20 = var13.iterator();
    java.lang.Object var21 = var13.dequeue();
    boolean var22 = var13.isEmpty();
    java.util.Spliterator var23 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    int var25 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + (short)0+ "'", var21.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test96");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    java.util.Spliterator var6 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test97");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(10);
    int var2 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test98");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(1);
    int var2 = var1.size();
    int var3 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test99");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var14 = var1.spliterator();
    java.lang.Object var15 = var1.dequeue();
    exercise03.RingBuffer var17 = new exercise03.RingBuffer(100);
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    boolean var20 = var17.isEmpty();
    var17.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var23 = var17.spliterator();
    boolean var24 = var17.isEmpty();
    exercise03.RingBuffer var26 = new exercise03.RingBuffer(100);
    var26.enqueue((java.lang.Object)1);
    var17.enqueue((java.lang.Object)1);
    java.util.Spliterator var30 = var17.spliterator();
    java.lang.Object var31 = var17.dequeue();
    java.util.Spliterator var32 = var17.spliterator();
    var1.enqueue((java.lang.Object)var32);
    exercise03.RingBuffer var35 = new exercise03.RingBuffer(100);
    boolean var36 = var35.isEmpty();
    boolean var37 = var35.isEmpty();
    boolean var38 = var35.isEmpty();
    var35.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var41 = var35.spliterator();
    exercise03.RingBuffer var43 = new exercise03.RingBuffer(100);
    boolean var44 = var43.isEmpty();
    boolean var45 = var43.isEmpty();
    boolean var46 = var43.isEmpty();
    var43.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var49 = var43.spliterator();
    var43.enqueue((java.lang.Object)100L);
    java.lang.Object var52 = var43.dequeue();
    var35.enqueue(var52);
    exercise03.RingBuffer var55 = new exercise03.RingBuffer(100);
    boolean var56 = var55.isEmpty();
    boolean var57 = var55.isEmpty();
    boolean var58 = var55.isEmpty();
    var55.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var61 = var55.spliterator();
    boolean var62 = var55.isEmpty();
    int var63 = var55.size();
    java.lang.Object var64 = var55.dequeue();
    var35.enqueue((java.lang.Object)var55);
    java.lang.Object var66 = var35.dequeue();
    java.util.Iterator var67 = var35.iterator();
    var1.enqueue((java.lang.Object)var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + (-1.0d)+ "'", var15.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + (-1.0d)+ "'", var31.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + (-1.0d)+ "'", var52.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + (-1.0d)+ "'", var64.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + (-1.0d)+ "'", var66.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test100");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    java.util.Spliterator var9 = var1.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    java.util.Spliterator var18 = var11.spliterator();
    var1.enqueue((java.lang.Object)var18);
    boolean var20 = var1.isEmpty();
    exercise03.RingBuffer var22 = new exercise03.RingBuffer(100);
    var22.enqueue((java.lang.Object)1);
    int var25 = var22.size();
    int var26 = var22.size();
    var1.enqueue((java.lang.Object)var26);
    boolean var28 = var1.isEmpty();
    boolean var29 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test101");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    exercise03.RingBuffer var12 = new exercise03.RingBuffer(100);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    var12.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var18 = var12.spliterator();
    boolean var19 = var12.isEmpty();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    boolean var24 = var21.isEmpty();
    var21.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var27 = var21.spliterator();
    java.util.Iterator var28 = var21.iterator();
    var12.enqueue((java.lang.Object)var21);
    java.util.Spliterator var30 = var21.spliterator();
    var1.enqueue((java.lang.Object)var21);
    exercise03.RingBuffer var33 = new exercise03.RingBuffer(100);
    boolean var34 = var33.isEmpty();
    boolean var35 = var33.isEmpty();
    boolean var36 = var33.isEmpty();
    var33.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var39 = var33.spliterator();
    java.util.Iterator var40 = var33.iterator();
    var1.enqueue((java.lang.Object)var33);
    exercise03.RingBuffer var43 = new exercise03.RingBuffer(100);
    boolean var44 = var43.isEmpty();
    boolean var45 = var43.isEmpty();
    boolean var46 = var43.isEmpty();
    var43.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var49 = var43.spliterator();
    boolean var50 = var43.isEmpty();
    exercise03.RingBuffer var52 = new exercise03.RingBuffer(100);
    boolean var53 = var52.isEmpty();
    boolean var54 = var52.isEmpty();
    boolean var55 = var52.isEmpty();
    var52.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var58 = var52.spliterator();
    java.util.Iterator var59 = var52.iterator();
    var43.enqueue((java.lang.Object)var52);
    java.util.Spliterator var61 = var52.spliterator();
    exercise03.RingBuffer var63 = new exercise03.RingBuffer(100);
    var52.enqueue((java.lang.Object)var63);
    int var65 = var63.size();
    var1.enqueue((java.lang.Object)var63);
    int var67 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 4);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test102");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    java.util.Spliterator var9 = var1.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    java.util.Spliterator var18 = var11.spliterator();
    var1.enqueue((java.lang.Object)var18);
    boolean var20 = var1.isEmpty();
    exercise03.RingBuffer var22 = new exercise03.RingBuffer(100);
    var22.enqueue((java.lang.Object)1);
    int var25 = var22.size();
    int var26 = var22.size();
    var1.enqueue((java.lang.Object)var26);
    exercise03.RingBuffer var29 = new exercise03.RingBuffer(100);
    java.util.Spliterator var30 = var29.spliterator();
    var1.enqueue((java.lang.Object)var29);
    int var32 = var1.size();
    boolean var33 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test103");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var10.iterator();
    var10.enqueue((java.lang.Object)0L);
    java.util.Spliterator var26 = var10.spliterator();
    java.lang.Object var27 = var10.dequeue();
    int var28 = var10.size();
    int var29 = var10.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + (-1.0d)+ "'", var27.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test104");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var21.iterator();
    int var24 = var21.size();
    exercise03.RingBuffer var26 = new exercise03.RingBuffer(100);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    boolean var29 = var26.isEmpty();
    var26.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var32 = var26.spliterator();
    boolean var33 = var26.isEmpty();
    exercise03.RingBuffer var35 = new exercise03.RingBuffer(100);
    boolean var36 = var35.isEmpty();
    boolean var37 = var35.isEmpty();
    boolean var38 = var35.isEmpty();
    var35.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var41 = var35.spliterator();
    java.util.Iterator var42 = var35.iterator();
    var26.enqueue((java.lang.Object)var35);
    java.lang.Object var44 = var26.dequeue();
    int var45 = var26.size();
    java.lang.Object var46 = var26.dequeue();
    var21.enqueue((java.lang.Object)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var48 = var26.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + (-1.0d)+ "'", var44.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test105");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    exercise03.RingBuffer var9 = new exercise03.RingBuffer(100);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var9.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var15 = var9.spliterator();
    var9.enqueue((java.lang.Object)100L);
    java.lang.Object var18 = var9.dequeue();
    var1.enqueue(var18);
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    boolean var24 = var21.isEmpty();
    var21.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var27 = var21.spliterator();
    boolean var28 = var21.isEmpty();
    int var29 = var21.size();
    java.lang.Object var30 = var21.dequeue();
    var1.enqueue((java.lang.Object)var21);
    boolean var32 = var21.isEmpty();
    boolean var33 = var21.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + (-1.0d)+ "'", var18.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + (-1.0d)+ "'", var30.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test106");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    java.lang.Object var20 = new java.lang.Object();
    var1.enqueue(var20);
    var1.enqueue((java.lang.Object)3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test107");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise03.RingBuffer var7 = new exercise03.RingBuffer(100);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    boolean var10 = var7.isEmpty();
    var7.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var13 = var7.spliterator();
    boolean var14 = var7.isEmpty();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var22 = var16.spliterator();
    java.util.Iterator var23 = var16.iterator();
    var7.enqueue((java.lang.Object)var16);
    java.util.Spliterator var25 = var16.spliterator();
    exercise03.RingBuffer var27 = new exercise03.RingBuffer(100);
    var16.enqueue((java.lang.Object)var27);
    java.util.Iterator var29 = var27.iterator();
    int var30 = var27.size();
    java.util.Spliterator var31 = var27.spliterator();
    exercise03.RingBuffer var33 = new exercise03.RingBuffer(100);
    boolean var34 = var33.isEmpty();
    boolean var35 = var33.isEmpty();
    boolean var36 = var33.isEmpty();
    var33.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var40 = new exercise03.RingBuffer(100);
    var40.enqueue((java.lang.Object)1);
    int var43 = var40.size();
    var33.enqueue((java.lang.Object)var40);
    var40.enqueue((java.lang.Object)10.0f);
    var27.enqueue((java.lang.Object)var40);
    var1.enqueue((java.lang.Object)var27);
    boolean var49 = var27.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test108");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    var1.enqueue((java.lang.Object)"");
    java.util.Iterator var13 = var1.iterator();
    java.lang.Object var14 = var1.dequeue();
    int var15 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 100L+ "'", var14.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test109");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    int var9 = var1.size();
    java.util.Spliterator var10 = var1.spliterator();
    java.util.Spliterator var11 = var1.spliterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Spliterator var20 = var13.spliterator();
    java.util.Spliterator var21 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    boolean var23 = var13.isEmpty();
    exercise03.RingBuffer var25 = new exercise03.RingBuffer(100);
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    boolean var28 = var25.isEmpty();
    var25.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var31 = var25.spliterator();
    boolean var32 = var25.isEmpty();
    exercise03.RingBuffer var34 = new exercise03.RingBuffer(100);
    boolean var35 = var34.isEmpty();
    boolean var36 = var34.isEmpty();
    boolean var37 = var34.isEmpty();
    var34.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var40 = var34.spliterator();
    java.util.Iterator var41 = var34.iterator();
    var25.enqueue((java.lang.Object)var34);
    java.util.Spliterator var43 = var34.spliterator();
    exercise03.RingBuffer var45 = new exercise03.RingBuffer(100);
    var34.enqueue((java.lang.Object)var45);
    int var47 = var45.size();
    var13.enqueue((java.lang.Object)var45);
    boolean var49 = var13.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test110");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.util.Spliterator var9 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test111");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var10.iterator();
    exercise03.RingBuffer var25 = new exercise03.RingBuffer(2);
    java.util.Iterator var26 = var25.iterator();
    java.util.Iterator var27 = var25.iterator();
    var10.enqueue((java.lang.Object)var27);
    boolean var29 = var10.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test112");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(3);
    java.util.Iterator var2 = var1.iterator();
    java.util.Iterator var3 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test113");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    java.util.Spliterator var2 = var1.spliterator();
    java.util.Iterator var3 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test114");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    java.util.Spliterator var7 = var1.spliterator();
    exercise03.RingBuffer var9 = new exercise03.RingBuffer(100);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var9.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var15 = var9.spliterator();
    boolean var16 = var9.isEmpty();
    exercise03.RingBuffer var18 = new exercise03.RingBuffer(100);
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    boolean var21 = var18.isEmpty();
    var18.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var24 = var18.spliterator();
    java.util.Iterator var25 = var18.iterator();
    var9.enqueue((java.lang.Object)var18);
    var1.enqueue((java.lang.Object)var9);
    boolean var28 = var9.isEmpty();
    int var29 = var9.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test115");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    boolean var23 = var21.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var24 = var21.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test116");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Spliterator var8 = var1.spliterator();
    java.util.Spliterator var9 = var1.spliterator();
    int var10 = var1.size();
    exercise03.RingBuffer var12 = new exercise03.RingBuffer(100);
    boolean var13 = var12.isEmpty();
    exercise03.RingBuffer var15 = new exercise03.RingBuffer(100);
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    boolean var18 = var15.isEmpty();
    var15.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var21 = var15.spliterator();
    boolean var22 = var15.isEmpty();
    exercise03.RingBuffer var24 = new exercise03.RingBuffer(100);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    boolean var27 = var24.isEmpty();
    var24.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var30 = var24.spliterator();
    java.util.Iterator var31 = var24.iterator();
    var15.enqueue((java.lang.Object)var24);
    java.util.Spliterator var33 = var24.spliterator();
    exercise03.RingBuffer var35 = new exercise03.RingBuffer(100);
    var24.enqueue((java.lang.Object)var35);
    java.util.Spliterator var37 = var35.spliterator();
    int var38 = var35.size();
    boolean var39 = var35.isEmpty();
    var12.enqueue((java.lang.Object)var39);
    var1.enqueue((java.lang.Object)var39);
    java.util.Spliterator var42 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test117");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    java.lang.Object var10 = var1.dequeue();
    java.util.Iterator var11 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (short)0+ "'", var10.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test118");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    java.util.Spliterator var8 = var1.spliterator();
    java.util.Spliterator var9 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test119");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var10.iterator();
    int var24 = var10.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 2);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test120");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    java.util.Spliterator var11 = var1.spliterator();
    java.util.Spliterator var12 = var1.spliterator();
    boolean var13 = var1.isEmpty();
    java.util.Iterator var14 = var1.iterator();
    int var15 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test121");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    java.util.Spliterator var9 = var1.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    java.util.Spliterator var18 = var11.spliterator();
    var1.enqueue((java.lang.Object)var18);
    boolean var20 = var1.isEmpty();
    exercise03.RingBuffer var22 = new exercise03.RingBuffer(100);
    var22.enqueue((java.lang.Object)1);
    int var25 = var22.size();
    int var26 = var22.size();
    var1.enqueue((java.lang.Object)var26);
    boolean var28 = var1.isEmpty();
    java.lang.Object var29 = var1.dequeue();
    boolean var30 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test122");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    int var9 = var1.size();
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test123");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    exercise03.RingBuffer var5 = new exercise03.RingBuffer(100);
    boolean var6 = var5.isEmpty();
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    boolean var11 = var8.isEmpty();
    var8.enqueue((java.lang.Object)(short)0);
    java.lang.Object var14 = var8.dequeue();
    java.util.Spliterator var15 = var8.spliterator();
    var5.enqueue((java.lang.Object)var15);
    var1.enqueue((java.lang.Object)var5);
    int var18 = var1.size();
    java.util.Iterator var19 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + (short)0+ "'", var14.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test124");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    int var20 = var1.size();
    java.util.Spliterator var21 = var1.spliterator();
    int var22 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test125");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    java.lang.Object var12 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (-1.0d)+ "'", var12.equals((-1.0d)));

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test126");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var10.iterator();
    java.util.Iterator var24 = var10.iterator();
    int var25 = var10.size();
    int var26 = var10.size();
    java.lang.Object var27 = var10.dequeue();
    java.lang.Object var28 = var10.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + (-1.0d)+ "'", var27.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test127");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    int var9 = var1.size();
    java.util.Spliterator var10 = var1.spliterator();
    java.util.Spliterator var11 = var1.spliterator();
    java.util.Iterator var12 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test128");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.lang.Object var4 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 1+ "'", var4.equals(1));

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test129");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    java.util.Iterator var11 = var1.iterator();
    java.util.Spliterator var12 = var1.spliterator();
    int var13 = var1.size();
    exercise03.RingBuffer var15 = new exercise03.RingBuffer(100);
    var15.enqueue((java.lang.Object)1);
    java.util.Spliterator var18 = var15.spliterator();
    java.util.Spliterator var19 = var15.spliterator();
    int var20 = var15.size();
    var1.enqueue((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test130");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    java.util.Spliterator var10 = var1.spliterator();
    int var11 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (short)0+ "'", var9.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test131");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    int var20 = var1.size();
    java.util.Spliterator var21 = var1.spliterator();
    java.lang.Object var22 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test132");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(1);
    int var2 = var1.size();
    exercise03.RingBuffer var4 = new exercise03.RingBuffer(100);
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    boolean var7 = var4.isEmpty();
    var4.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var10 = var4.spliterator();
    boolean var11 = var4.isEmpty();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Iterator var20 = var13.iterator();
    var4.enqueue((java.lang.Object)var13);
    java.util.Spliterator var22 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    int var24 = var13.size();
    boolean var25 = var13.isEmpty();
    int var26 = var13.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test133");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    java.util.Spliterator var20 = var1.spliterator();
    java.util.Spliterator var21 = var1.spliterator();
    exercise03.RingBuffer var23 = new exercise03.RingBuffer(100);
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    boolean var26 = var23.isEmpty();
    var23.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var29 = var23.spliterator();
    java.util.Spliterator var30 = var23.spliterator();
    java.util.Spliterator var31 = var23.spliterator();
    int var32 = var23.size();
    java.util.Iterator var33 = var23.iterator();
    exercise03.RingBuffer var35 = new exercise03.RingBuffer(100);
    boolean var36 = var35.isEmpty();
    boolean var37 = var35.isEmpty();
    boolean var38 = var35.isEmpty();
    var35.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var41 = var35.spliterator();
    java.lang.Object var42 = var35.dequeue();
    int var43 = var35.size();
    java.util.Spliterator var44 = var35.spliterator();
    java.util.Spliterator var45 = var35.spliterator();
    java.util.Iterator var46 = var35.iterator();
    var23.enqueue((java.lang.Object)var46);
    var1.enqueue((java.lang.Object)var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + (-1.0d)+ "'", var42.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test134");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    int var6 = var1.size();
    java.util.Iterator var7 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test135");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    exercise03.RingBuffer var12 = new exercise03.RingBuffer(100);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    var12.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var18 = var12.spliterator();
    boolean var19 = var12.isEmpty();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    boolean var24 = var21.isEmpty();
    var21.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var27 = var21.spliterator();
    java.util.Iterator var28 = var21.iterator();
    var12.enqueue((java.lang.Object)var21);
    java.util.Spliterator var30 = var21.spliterator();
    var1.enqueue((java.lang.Object)var21);
    exercise03.RingBuffer var33 = new exercise03.RingBuffer(100);
    boolean var34 = var33.isEmpty();
    boolean var35 = var33.isEmpty();
    boolean var36 = var33.isEmpty();
    var33.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var39 = var33.spliterator();
    java.util.Iterator var40 = var33.iterator();
    var1.enqueue((java.lang.Object)var33);
    exercise03.RingBuffer var43 = new exercise03.RingBuffer(100);
    boolean var44 = var43.isEmpty();
    boolean var45 = var43.isEmpty();
    boolean var46 = var43.isEmpty();
    var43.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var49 = var43.spliterator();
    boolean var50 = var43.isEmpty();
    exercise03.RingBuffer var52 = new exercise03.RingBuffer(100);
    boolean var53 = var52.isEmpty();
    boolean var54 = var52.isEmpty();
    boolean var55 = var52.isEmpty();
    var52.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var58 = var52.spliterator();
    java.util.Iterator var59 = var52.iterator();
    var43.enqueue((java.lang.Object)var52);
    java.util.Spliterator var61 = var52.spliterator();
    exercise03.RingBuffer var63 = new exercise03.RingBuffer(100);
    var52.enqueue((java.lang.Object)var63);
    int var65 = var63.size();
    var1.enqueue((java.lang.Object)var63);
    exercise03.RingBuffer var68 = new exercise03.RingBuffer(2);
    var1.enqueue((java.lang.Object)var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test136");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Spliterator var8 = var1.spliterator();
    java.util.Spliterator var9 = var1.spliterator();
    java.util.Iterator var10 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test137");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test138");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(4);
    exercise03.RingBuffer var3 = new exercise03.RingBuffer(100);
    boolean var4 = var3.isEmpty();
    boolean var5 = var3.isEmpty();
    boolean var6 = var3.isEmpty();
    var3.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var9 = var3.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    var11.enqueue((java.lang.Object)100L);
    java.lang.Object var20 = var11.dequeue();
    var3.enqueue(var20);
    exercise03.RingBuffer var23 = new exercise03.RingBuffer(100);
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    boolean var26 = var23.isEmpty();
    var23.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var29 = var23.spliterator();
    boolean var30 = var23.isEmpty();
    int var31 = var23.size();
    java.lang.Object var32 = var23.dequeue();
    var3.enqueue((java.lang.Object)var23);
    exercise03.RingBuffer var35 = new exercise03.RingBuffer(100);
    java.util.Iterator var36 = var35.iterator();
    java.util.Spliterator var37 = var35.spliterator();
    boolean var38 = var35.isEmpty();
    exercise03.RingBuffer var40 = new exercise03.RingBuffer(100);
    java.util.Iterator var41 = var40.iterator();
    var35.enqueue((java.lang.Object)var40);
    exercise03.RingBuffer var44 = new exercise03.RingBuffer(100);
    var44.enqueue((java.lang.Object)1);
    boolean var47 = var44.isEmpty();
    exercise03.RingBuffer var49 = new exercise03.RingBuffer(100);
    boolean var50 = var49.isEmpty();
    boolean var51 = var49.isEmpty();
    java.util.Spliterator var52 = var49.spliterator();
    var44.enqueue((java.lang.Object)var49);
    var35.enqueue((java.lang.Object)var44);
    var3.enqueue((java.lang.Object)var35);
    var1.enqueue((java.lang.Object)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + (-1.0d)+ "'", var20.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + (-1.0d)+ "'", var32.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test139");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise03.RingBuffer var7 = new exercise03.RingBuffer(100);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    boolean var10 = var7.isEmpty();
    var7.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var13 = var7.spliterator();
    boolean var14 = var7.isEmpty();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var22 = var16.spliterator();
    java.util.Iterator var23 = var16.iterator();
    var7.enqueue((java.lang.Object)var16);
    java.lang.Object var25 = var7.dequeue();
    var1.enqueue((java.lang.Object)var7);
    java.lang.Object var27 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + (-1.0d)+ "'", var25.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + 1+ "'", var27.equals(1));

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test140");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    var1.enqueue((java.lang.Object)"");
    java.util.Iterator var13 = var1.iterator();
    java.util.Spliterator var14 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test141");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var14 = var1.spliterator();
    java.lang.Object var15 = var1.dequeue();
    java.util.Spliterator var16 = var1.spliterator();
    boolean var17 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + (-1.0d)+ "'", var15.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test142");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    int var20 = var1.size();
    java.lang.Object var21 = var1.dequeue();
    boolean var22 = var1.isEmpty();
    int var23 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test143");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    java.util.Spliterator var5 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test144");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var14 = var1.spliterator();
    java.util.Spliterator var15 = var1.spliterator();
    exercise03.RingBuffer var17 = new exercise03.RingBuffer(100);
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    boolean var20 = var17.isEmpty();
    var17.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var23 = var17.spliterator();
    boolean var24 = var17.isEmpty();
    exercise03.RingBuffer var26 = new exercise03.RingBuffer(100);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    boolean var29 = var26.isEmpty();
    var26.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var32 = var26.spliterator();
    java.util.Iterator var33 = var26.iterator();
    var17.enqueue((java.lang.Object)var26);
    java.util.Spliterator var35 = var26.spliterator();
    exercise03.RingBuffer var37 = new exercise03.RingBuffer(100);
    var26.enqueue((java.lang.Object)var37);
    java.util.Spliterator var39 = var37.spliterator();
    java.util.Spliterator var40 = var37.spliterator();
    var1.enqueue((java.lang.Object)var37);
    java.util.Iterator var42 = var37.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test145");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Spliterator var8 = var1.spliterator();
    java.lang.Object var9 = var1.dequeue();
    java.util.Spliterator var10 = var1.spliterator();
    java.util.Spliterator var11 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0d)+ "'", var9.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test146");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    java.lang.Object var10 = var1.dequeue();
    java.util.Iterator var11 = var1.iterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(short)0);
    boolean var19 = var13.isEmpty();
    java.util.Iterator var20 = var13.iterator();
    java.lang.Object var21 = var13.dequeue();
    boolean var22 = var13.isEmpty();
    java.util.Spliterator var23 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    exercise03.RingBuffer var26 = new exercise03.RingBuffer(100);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    boolean var29 = var26.isEmpty();
    var26.enqueue((java.lang.Object)(short)0);
    boolean var32 = var26.isEmpty();
    java.util.Iterator var33 = var26.iterator();
    java.lang.Object var34 = var26.dequeue();
    exercise03.RingBuffer var36 = new exercise03.RingBuffer(100);
    boolean var37 = var36.isEmpty();
    boolean var38 = var36.isEmpty();
    boolean var39 = var36.isEmpty();
    var36.enqueue((java.lang.Object)(short)0);
    boolean var42 = var36.isEmpty();
    java.util.Iterator var43 = var36.iterator();
    java.lang.Object var44 = var36.dequeue();
    java.util.Spliterator var45 = var36.spliterator();
    var26.enqueue((java.lang.Object)var36);
    var13.enqueue((java.lang.Object)var36);
    int var48 = var36.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + (short)0+ "'", var21.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + (short)0+ "'", var34.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + (short)0+ "'", var44.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test147");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    java.util.Spliterator var10 = var1.spliterator();
    int var11 = var1.size();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.lang.Object var20 = var13.dequeue();
    java.util.Spliterator var21 = var13.spliterator();
    exercise03.RingBuffer var23 = new exercise03.RingBuffer(100);
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    boolean var26 = var23.isEmpty();
    var23.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var29 = var23.spliterator();
    java.util.Spliterator var30 = var23.spliterator();
    var13.enqueue((java.lang.Object)var30);
    var1.enqueue((java.lang.Object)var30);
    java.lang.Object var33 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (short)0+ "'", var9.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + (-1.0d)+ "'", var20.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test148");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    int var4 = var1.size();
    int var5 = var1.size();
    java.lang.Object var6 = var1.dequeue();
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 1+ "'", var6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test149");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)0);
    var1.enqueue((java.lang.Object)(short)100);
    boolean var6 = var1.isEmpty();
    java.lang.Object var7 = var1.dequeue();
    java.util.Iterator var8 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0+ "'", var7.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test150");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    exercise03.RingBuffer var9 = new exercise03.RingBuffer(100);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var9.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var15 = var9.spliterator();
    var9.enqueue((java.lang.Object)100L);
    java.lang.Object var18 = var9.dequeue();
    var1.enqueue(var18);
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    boolean var24 = var21.isEmpty();
    var21.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var27 = var21.spliterator();
    boolean var28 = var21.isEmpty();
    int var29 = var21.size();
    java.lang.Object var30 = var21.dequeue();
    var1.enqueue((java.lang.Object)var21);
    exercise03.RingBuffer var33 = new exercise03.RingBuffer(100);
    java.util.Iterator var34 = var33.iterator();
    java.util.Spliterator var35 = var33.spliterator();
    boolean var36 = var33.isEmpty();
    exercise03.RingBuffer var38 = new exercise03.RingBuffer(100);
    java.util.Iterator var39 = var38.iterator();
    var33.enqueue((java.lang.Object)var38);
    exercise03.RingBuffer var42 = new exercise03.RingBuffer(100);
    var42.enqueue((java.lang.Object)1);
    boolean var45 = var42.isEmpty();
    exercise03.RingBuffer var47 = new exercise03.RingBuffer(100);
    boolean var48 = var47.isEmpty();
    boolean var49 = var47.isEmpty();
    java.util.Spliterator var50 = var47.spliterator();
    var42.enqueue((java.lang.Object)var47);
    var33.enqueue((java.lang.Object)var42);
    var1.enqueue((java.lang.Object)var33);
    exercise03.RingBuffer var55 = new exercise03.RingBuffer(100);
    boolean var56 = var55.isEmpty();
    boolean var57 = var55.isEmpty();
    boolean var58 = var55.isEmpty();
    var55.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var61 = var55.spliterator();
    java.util.Iterator var62 = var55.iterator();
    int var63 = var55.size();
    java.lang.Object var64 = var55.dequeue();
    var33.enqueue(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + (-1.0d)+ "'", var18.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + (-1.0d)+ "'", var30.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + (-1.0d)+ "'", var64.equals((-1.0d)));

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test151");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    var8.enqueue((java.lang.Object)10.0f);
    java.lang.Object var15 = var8.dequeue();
    java.util.Spliterator var16 = var8.spliterator();
    exercise03.RingBuffer var18 = new exercise03.RingBuffer(100);
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    boolean var21 = var18.isEmpty();
    var18.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var25 = new exercise03.RingBuffer(100);
    var25.enqueue((java.lang.Object)1);
    int var28 = var25.size();
    var18.enqueue((java.lang.Object)var25);
    var25.enqueue((java.lang.Object)10.0f);
    exercise03.RingBuffer var33 = new exercise03.RingBuffer(100);
    java.util.Iterator var34 = var33.iterator();
    java.util.Spliterator var35 = var33.spliterator();
    boolean var36 = var33.isEmpty();
    var25.enqueue((java.lang.Object)var33);
    var8.enqueue((java.lang.Object)var25);
    boolean var39 = var8.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 1+ "'", var15.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test152");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test153");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var21.iterator();
    int var24 = var21.size();
    java.util.Spliterator var25 = var21.spliterator();
    exercise03.RingBuffer var27 = new exercise03.RingBuffer(100);
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    boolean var30 = var27.isEmpty();
    var27.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var34 = new exercise03.RingBuffer(100);
    var34.enqueue((java.lang.Object)1);
    int var37 = var34.size();
    var27.enqueue((java.lang.Object)var34);
    var34.enqueue((java.lang.Object)10.0f);
    var21.enqueue((java.lang.Object)var34);
    int var42 = var34.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 2);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test154");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    java.lang.Object var7 = var1.dequeue();
    java.util.Spliterator var8 = var1.spliterator();
    int var9 = var1.size();
    java.util.Spliterator var10 = var1.spliterator();
    boolean var11 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)0+ "'", var7.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test155");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    java.util.Spliterator var10 = var1.spliterator();
    java.util.Spliterator var11 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test156");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Iterator var4 = var1.iterator();
    java.lang.Object var5 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1+ "'", var5.equals(1));

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test157");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var14 = var1.spliterator();
    java.lang.Object var15 = var1.dequeue();
    java.lang.Object var16 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + (-1.0d)+ "'", var15.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 1+ "'", var16.equals(1));

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test158");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    java.util.Spliterator var9 = var1.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    java.util.Spliterator var18 = var11.spliterator();
    var1.enqueue((java.lang.Object)var18);
    boolean var20 = var1.isEmpty();
    exercise03.RingBuffer var22 = new exercise03.RingBuffer(100);
    var22.enqueue((java.lang.Object)1);
    int var25 = var22.size();
    int var26 = var22.size();
    var1.enqueue((java.lang.Object)var26);
    int var28 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 2);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test159");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var10.iterator();
    var10.enqueue((java.lang.Object)0L);
    java.util.Spliterator var26 = var10.spliterator();
    java.lang.Object var27 = var10.dequeue();
    int var28 = var10.size();
    java.util.Spliterator var29 = var10.spliterator();
    java.util.Iterator var30 = var10.iterator();
    exercise03.RingBuffer var32 = new exercise03.RingBuffer(100);
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    boolean var35 = var32.isEmpty();
    var32.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var38 = var32.spliterator();
    int var39 = var32.size();
    java.util.Iterator var40 = var32.iterator();
    var10.enqueue((java.lang.Object)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + (-1.0d)+ "'", var27.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test160");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var14 = var1.spliterator();
    java.lang.Object var15 = var1.dequeue();
    exercise03.RingBuffer var17 = new exercise03.RingBuffer(100);
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    boolean var20 = var17.isEmpty();
    var17.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var23 = var17.spliterator();
    boolean var24 = var17.isEmpty();
    exercise03.RingBuffer var26 = new exercise03.RingBuffer(100);
    var26.enqueue((java.lang.Object)1);
    var17.enqueue((java.lang.Object)1);
    java.util.Spliterator var30 = var17.spliterator();
    java.lang.Object var31 = var17.dequeue();
    java.util.Spliterator var32 = var17.spliterator();
    var1.enqueue((java.lang.Object)var32);
    exercise03.RingBuffer var35 = new exercise03.RingBuffer(100);
    boolean var36 = var35.isEmpty();
    boolean var37 = var35.isEmpty();
    boolean var38 = var35.isEmpty();
    var35.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var41 = var35.spliterator();
    boolean var42 = var35.isEmpty();
    exercise03.RingBuffer var44 = new exercise03.RingBuffer(100);
    boolean var45 = var44.isEmpty();
    boolean var46 = var44.isEmpty();
    boolean var47 = var44.isEmpty();
    var44.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var50 = var44.spliterator();
    java.util.Iterator var51 = var44.iterator();
    var35.enqueue((java.lang.Object)var44);
    java.lang.Object var53 = var35.dequeue();
    int var54 = var35.size();
    java.lang.Object var55 = var35.dequeue();
    boolean var56 = var35.isEmpty();
    java.util.Iterator var57 = var35.iterator();
    var1.enqueue((java.lang.Object)var35);
    java.util.Iterator var59 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + (-1.0d)+ "'", var15.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + (-1.0d)+ "'", var31.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + (-1.0d)+ "'", var53.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test161");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    exercise03.RingBuffer var12 = new exercise03.RingBuffer(100);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    var12.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var18 = var12.spliterator();
    boolean var19 = var12.isEmpty();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    boolean var24 = var21.isEmpty();
    var21.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var27 = var21.spliterator();
    java.util.Iterator var28 = var21.iterator();
    var12.enqueue((java.lang.Object)var21);
    java.util.Spliterator var30 = var21.spliterator();
    var1.enqueue((java.lang.Object)var21);
    java.util.Iterator var32 = var21.iterator();
    boolean var33 = var21.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test162");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    java.util.Spliterator var11 = var1.spliterator();
    java.util.Spliterator var12 = var1.spliterator();
    boolean var13 = var1.isEmpty();
    java.util.Iterator var14 = var1.iterator();
    java.lang.Object var15 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 100L+ "'", var15.equals(100L));

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test163");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer var3 = new exercise03.RingBuffer(100);
    boolean var4 = var3.isEmpty();
    boolean var5 = var3.isEmpty();
    boolean var6 = var3.isEmpty();
    var3.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var9 = var3.spliterator();
    boolean var10 = var3.isEmpty();
    exercise03.RingBuffer var12 = new exercise03.RingBuffer(100);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    var12.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var18 = var12.spliterator();
    java.util.Iterator var19 = var12.iterator();
    var3.enqueue((java.lang.Object)var12);
    java.util.Spliterator var21 = var12.spliterator();
    exercise03.RingBuffer var23 = new exercise03.RingBuffer(100);
    var12.enqueue((java.lang.Object)var23);
    java.util.Iterator var25 = var23.iterator();
    int var26 = var23.size();
    exercise03.RingBuffer var28 = new exercise03.RingBuffer(100);
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    boolean var31 = var28.isEmpty();
    var28.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var34 = var28.spliterator();
    boolean var35 = var28.isEmpty();
    exercise03.RingBuffer var37 = new exercise03.RingBuffer(100);
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    boolean var40 = var37.isEmpty();
    var37.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var43 = var37.spliterator();
    java.util.Iterator var44 = var37.iterator();
    var28.enqueue((java.lang.Object)var37);
    java.lang.Object var46 = var28.dequeue();
    int var47 = var28.size();
    java.lang.Object var48 = var28.dequeue();
    var23.enqueue((java.lang.Object)var28);
    exercise03.RingBuffer var51 = new exercise03.RingBuffer(100);
    var51.enqueue((java.lang.Object)1);
    java.util.Iterator var54 = var51.iterator();
    var28.enqueue((java.lang.Object)var54);
    var1.enqueue((java.lang.Object)var54);
    java.util.Iterator var57 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + (-1.0d)+ "'", var46.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test164");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    exercise03.RingBuffer var12 = new exercise03.RingBuffer(100);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    var12.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var18 = var12.spliterator();
    boolean var19 = var12.isEmpty();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    boolean var24 = var21.isEmpty();
    var21.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var27 = var21.spliterator();
    java.util.Iterator var28 = var21.iterator();
    var12.enqueue((java.lang.Object)var21);
    java.util.Spliterator var30 = var21.spliterator();
    var1.enqueue((java.lang.Object)var21);
    boolean var32 = var21.isEmpty();
    int var33 = var21.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test165");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    java.util.Spliterator var11 = var1.spliterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    boolean var20 = var13.isEmpty();
    exercise03.RingBuffer var22 = new exercise03.RingBuffer(100);
    boolean var23 = var22.isEmpty();
    boolean var24 = var22.isEmpty();
    boolean var25 = var22.isEmpty();
    var22.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var28 = var22.spliterator();
    java.util.Iterator var29 = var22.iterator();
    var13.enqueue((java.lang.Object)var22);
    java.util.Spliterator var31 = var22.spliterator();
    exercise03.RingBuffer var33 = new exercise03.RingBuffer(100);
    var22.enqueue((java.lang.Object)var33);
    java.util.Spliterator var35 = var33.spliterator();
    java.util.Spliterator var36 = var33.spliterator();
    var1.enqueue((java.lang.Object)var33);
    boolean var38 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test166");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    boolean var7 = var1.isEmpty();
    exercise03.RingBuffer var9 = new exercise03.RingBuffer(100);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var9.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var15 = var9.spliterator();
    java.util.Spliterator var16 = var9.spliterator();
    java.lang.Object var17 = var9.dequeue();
    var1.enqueue((java.lang.Object)var9);
    boolean var19 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + (-1.0d)+ "'", var17.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test167");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    int var9 = var1.size();
    java.util.Spliterator var10 = var1.spliterator();
    int var11 = var1.size();
    java.util.Spliterator var12 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test168");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    java.util.Iterator var11 = var1.iterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    var13.enqueue((java.lang.Object)100L);
    java.lang.Object var22 = var13.dequeue();
    java.util.Iterator var23 = var13.iterator();
    java.util.Spliterator var24 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    java.util.Iterator var26 = var13.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + (-1.0d)+ "'", var22.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test169");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    int var20 = var1.size();
    java.util.Spliterator var21 = var1.spliterator();
    exercise03.RingBuffer var23 = new exercise03.RingBuffer(100);
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    boolean var26 = var23.isEmpty();
    var23.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var29 = var23.spliterator();
    boolean var30 = var23.isEmpty();
    exercise03.RingBuffer var32 = new exercise03.RingBuffer(100);
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    boolean var35 = var32.isEmpty();
    var32.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var38 = var32.spliterator();
    java.util.Iterator var39 = var32.iterator();
    var23.enqueue((java.lang.Object)var32);
    java.util.Spliterator var41 = var32.spliterator();
    exercise03.RingBuffer var43 = new exercise03.RingBuffer(100);
    var32.enqueue((java.lang.Object)var43);
    java.util.Spliterator var45 = var43.spliterator();
    int var46 = var43.size();
    java.util.Spliterator var47 = var43.spliterator();
    java.util.Iterator var48 = var43.iterator();
    boolean var49 = var43.isEmpty();
    exercise03.RingBuffer var51 = new exercise03.RingBuffer(100);
    boolean var52 = var51.isEmpty();
    boolean var53 = var51.isEmpty();
    boolean var54 = var51.isEmpty();
    var51.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var57 = var51.spliterator();
    java.util.Spliterator var58 = var51.spliterator();
    java.lang.Object var59 = var51.dequeue();
    java.util.Spliterator var60 = var51.spliterator();
    var43.enqueue((java.lang.Object)var60);
    var1.enqueue((java.lang.Object)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + (-1.0d)+ "'", var59.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test170");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    boolean var10 = var1.isEmpty();
    exercise03.RingBuffer var12 = new exercise03.RingBuffer(100);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    var12.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var18 = var12.spliterator();
    boolean var19 = var12.isEmpty();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    boolean var24 = var21.isEmpty();
    var21.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var27 = var21.spliterator();
    java.util.Iterator var28 = var21.iterator();
    var12.enqueue((java.lang.Object)var21);
    java.lang.Object var30 = var12.dequeue();
    java.lang.Object var31 = new java.lang.Object();
    var12.enqueue(var31);
    java.util.Spliterator var33 = var12.spliterator();
    boolean var34 = var12.isEmpty();
    java.lang.Object var35 = var12.dequeue();
    var1.enqueue(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + (-1.0d)+ "'", var30.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test171");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    int var6 = var1.size();
    java.util.Spliterator var7 = var1.spliterator();
    int var8 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test172");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    java.util.Iterator var13 = var8.iterator();
    java.util.Iterator var14 = var8.iterator();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var22 = var16.spliterator();
    var16.enqueue((java.lang.Object)100L);
    java.lang.Object var25 = var16.dequeue();
    var16.enqueue((java.lang.Object)"");
    java.util.Iterator var28 = var16.iterator();
    var8.enqueue((java.lang.Object)var28);
    java.util.Spliterator var30 = var8.spliterator();
    boolean var31 = var8.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + (-1.0d)+ "'", var25.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test173");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var14 = var1.spliterator();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var23 = new exercise03.RingBuffer(100);
    var23.enqueue((java.lang.Object)1);
    int var26 = var23.size();
    var16.enqueue((java.lang.Object)var23);
    java.util.Iterator var28 = var23.iterator();
    java.util.Iterator var29 = var23.iterator();
    java.util.Spliterator var30 = var23.spliterator();
    var1.enqueue((java.lang.Object)var23);
    exercise03.RingBuffer var33 = new exercise03.RingBuffer(100);
    boolean var34 = var33.isEmpty();
    boolean var35 = var33.isEmpty();
    boolean var36 = var33.isEmpty();
    var33.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var39 = var33.spliterator();
    boolean var40 = var33.isEmpty();
    exercise03.RingBuffer var42 = new exercise03.RingBuffer(100);
    boolean var43 = var42.isEmpty();
    boolean var44 = var42.isEmpty();
    boolean var45 = var42.isEmpty();
    var42.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var48 = var42.spliterator();
    java.util.Iterator var49 = var42.iterator();
    var33.enqueue((java.lang.Object)var42);
    java.util.Spliterator var51 = var42.spliterator();
    exercise03.RingBuffer var53 = new exercise03.RingBuffer(100);
    var42.enqueue((java.lang.Object)var53);
    java.util.Spliterator var55 = var53.spliterator();
    int var56 = var53.size();
    java.util.Spliterator var57 = var53.spliterator();
    var23.enqueue((java.lang.Object)var53);
    java.util.Iterator var59 = var53.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test174");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    exercise03.RingBuffer var9 = new exercise03.RingBuffer(100);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var9.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    var16.enqueue((java.lang.Object)1);
    int var19 = var16.size();
    var9.enqueue((java.lang.Object)var16);
    var16.enqueue((java.lang.Object)10.0f);
    java.lang.Object var23 = var16.dequeue();
    java.util.Iterator var24 = var16.iterator();
    boolean var25 = var16.isEmpty();
    var1.enqueue((java.lang.Object)var25);
    java.util.Spliterator var27 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + 1+ "'", var23.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test175");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    var8.enqueue((java.lang.Object)10.0f);
    java.lang.Object var15 = var8.dequeue();
    java.lang.Object var16 = var8.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 1+ "'", var15.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 10.0f+ "'", var16.equals(10.0f));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test176");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Spliterator var8 = var1.spliterator();
    java.util.Spliterator var9 = var1.spliterator();
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.lang.Object var20 = var13.dequeue();
    int var21 = var13.size();
    java.util.Spliterator var22 = var13.spliterator();
    java.util.Spliterator var23 = var13.spliterator();
    java.util.Iterator var24 = var13.iterator();
    var1.enqueue((java.lang.Object)var24);
    exercise03.RingBuffer var27 = new exercise03.RingBuffer(100);
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    boolean var30 = var27.isEmpty();
    var27.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var33 = var27.spliterator();
    boolean var34 = var27.isEmpty();
    exercise03.RingBuffer var36 = new exercise03.RingBuffer(100);
    boolean var37 = var36.isEmpty();
    boolean var38 = var36.isEmpty();
    boolean var39 = var36.isEmpty();
    var36.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var42 = var36.spliterator();
    java.util.Iterator var43 = var36.iterator();
    var27.enqueue((java.lang.Object)var36);
    java.util.Spliterator var45 = var36.spliterator();
    exercise03.RingBuffer var47 = new exercise03.RingBuffer(100);
    var36.enqueue((java.lang.Object)var47);
    var1.enqueue((java.lang.Object)var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + (-1.0d)+ "'", var20.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test177");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    int var9 = var1.size();
    java.util.Spliterator var10 = var1.spliterator();
    java.util.Spliterator var11 = var1.spliterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Spliterator var20 = var13.spliterator();
    java.util.Spliterator var21 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    boolean var23 = var13.isEmpty();
    exercise03.RingBuffer var25 = new exercise03.RingBuffer(100);
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    boolean var28 = var25.isEmpty();
    var25.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var31 = var25.spliterator();
    boolean var32 = var25.isEmpty();
    exercise03.RingBuffer var34 = new exercise03.RingBuffer(100);
    boolean var35 = var34.isEmpty();
    boolean var36 = var34.isEmpty();
    boolean var37 = var34.isEmpty();
    var34.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var40 = var34.spliterator();
    java.util.Iterator var41 = var34.iterator();
    var25.enqueue((java.lang.Object)var34);
    java.util.Spliterator var43 = var34.spliterator();
    exercise03.RingBuffer var45 = new exercise03.RingBuffer(100);
    var34.enqueue((java.lang.Object)var45);
    int var47 = var45.size();
    var13.enqueue((java.lang.Object)var45);
    java.util.Spliterator var49 = var13.spliterator();
    exercise03.RingBuffer var51 = new exercise03.RingBuffer(100);
    boolean var52 = var51.isEmpty();
    boolean var53 = var51.isEmpty();
    boolean var54 = var51.isEmpty();
    var51.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var57 = var51.spliterator();
    java.lang.Object var58 = var51.dequeue();
    java.util.Spliterator var59 = var51.spliterator();
    exercise03.RingBuffer var61 = new exercise03.RingBuffer(100);
    boolean var62 = var61.isEmpty();
    boolean var63 = var61.isEmpty();
    boolean var64 = var61.isEmpty();
    var61.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var67 = var61.spliterator();
    java.util.Spliterator var68 = var61.spliterator();
    var51.enqueue((java.lang.Object)var68);
    boolean var70 = var51.isEmpty();
    exercise03.RingBuffer var72 = new exercise03.RingBuffer(100);
    var72.enqueue((java.lang.Object)1);
    int var75 = var72.size();
    int var76 = var72.size();
    var51.enqueue((java.lang.Object)var76);
    boolean var78 = var51.isEmpty();
    java.lang.Object var79 = var51.dequeue();
    var13.enqueue(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + (-1.0d)+ "'", var58.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test178");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    int var20 = var1.size();
    java.lang.Object var21 = var1.dequeue();
    exercise03.RingBuffer var23 = new exercise03.RingBuffer(100);
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    boolean var26 = var23.isEmpty();
    var23.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var29 = var23.spliterator();
    boolean var30 = var23.isEmpty();
    boolean var31 = var23.isEmpty();
    int var32 = var23.size();
    java.util.Iterator var33 = var23.iterator();
    var1.enqueue((java.lang.Object)var23);
    java.lang.Object var35 = var1.dequeue();
    java.util.Iterator var36 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test179");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Spliterator var8 = var1.spliterator();
    java.lang.Object var9 = var1.dequeue();
    int var10 = var1.size();
    java.util.Spliterator var11 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0d)+ "'", var9.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test180");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    java.lang.Object var9 = var1.dequeue();
    java.util.Spliterator var10 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (short)0+ "'", var9.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test181");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test182");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    java.util.Spliterator var9 = var1.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    java.util.Spliterator var18 = var11.spliterator();
    var1.enqueue((java.lang.Object)var18);
    boolean var20 = var1.isEmpty();
    exercise03.RingBuffer var22 = new exercise03.RingBuffer(100);
    var22.enqueue((java.lang.Object)1);
    int var25 = var22.size();
    int var26 = var22.size();
    var1.enqueue((java.lang.Object)var26);
    boolean var28 = var1.isEmpty();
    java.lang.Object var29 = var1.dequeue();
    java.util.Spliterator var30 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test183");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    int var20 = var1.size();
    java.lang.Object var21 = var1.dequeue();
    exercise03.RingBuffer var23 = new exercise03.RingBuffer(100);
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    boolean var26 = var23.isEmpty();
    var23.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var29 = var23.spliterator();
    boolean var30 = var23.isEmpty();
    boolean var31 = var23.isEmpty();
    int var32 = var23.size();
    java.util.Iterator var33 = var23.iterator();
    var1.enqueue((java.lang.Object)var23);
    java.lang.Object var35 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var36 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test184");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(1);
    int var2 = var1.size();
    exercise03.RingBuffer var4 = new exercise03.RingBuffer(100);
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    boolean var7 = var4.isEmpty();
    var4.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var10 = var4.spliterator();
    boolean var11 = var4.isEmpty();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Iterator var20 = var13.iterator();
    var4.enqueue((java.lang.Object)var13);
    java.util.Spliterator var22 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    java.lang.Object var24 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test185");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Spliterator var8 = var1.spliterator();
    java.util.Spliterator var9 = var1.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    java.util.Spliterator var14 = var11.spliterator();
    boolean var15 = var11.isEmpty();
    var1.enqueue((java.lang.Object)var11);
    int var17 = var11.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test186");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    java.util.Spliterator var11 = var1.spliterator();
    java.util.Spliterator var12 = var1.spliterator();
    int var13 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test187");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    var1.enqueue((java.lang.Object)true);
    boolean var6 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test188");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    java.util.Iterator var7 = var1.iterator();
    exercise03.RingBuffer var9 = new exercise03.RingBuffer(100);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var9.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var15 = var9.spliterator();
    java.lang.Object var16 = var9.dequeue();
    int var17 = var9.size();
    java.util.Spliterator var18 = var9.spliterator();
    boolean var19 = var9.isEmpty();
    java.util.Spliterator var20 = var9.spliterator();
    var1.enqueue((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + (-1.0d)+ "'", var16.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test189");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    java.util.Spliterator var9 = var1.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    java.util.Spliterator var18 = var11.spliterator();
    var1.enqueue((java.lang.Object)var18);
    boolean var20 = var1.isEmpty();
    exercise03.RingBuffer var22 = new exercise03.RingBuffer(100);
    var22.enqueue((java.lang.Object)1);
    int var25 = var22.size();
    int var26 = var22.size();
    var1.enqueue((java.lang.Object)var26);
    exercise03.RingBuffer var29 = new exercise03.RingBuffer(100);
    java.util.Spliterator var30 = var29.spliterator();
    var1.enqueue((java.lang.Object)var29);
    boolean var32 = var1.isEmpty();
    exercise03.RingBuffer var34 = new exercise03.RingBuffer(100);
    boolean var35 = var34.isEmpty();
    boolean var36 = var34.isEmpty();
    boolean var37 = var34.isEmpty();
    var34.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var40 = var34.spliterator();
    boolean var41 = var34.isEmpty();
    exercise03.RingBuffer var43 = new exercise03.RingBuffer(100);
    boolean var44 = var43.isEmpty();
    boolean var45 = var43.isEmpty();
    boolean var46 = var43.isEmpty();
    var43.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var49 = var43.spliterator();
    java.util.Iterator var50 = var43.iterator();
    var34.enqueue((java.lang.Object)var43);
    java.util.Spliterator var52 = var43.spliterator();
    exercise03.RingBuffer var54 = new exercise03.RingBuffer(100);
    var43.enqueue((java.lang.Object)var54);
    java.util.Iterator var56 = var43.iterator();
    var43.enqueue((java.lang.Object)0L);
    var1.enqueue((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test190");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    java.util.Spliterator var9 = var1.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    java.util.Spliterator var18 = var11.spliterator();
    var1.enqueue((java.lang.Object)var18);
    boolean var20 = var1.isEmpty();
    exercise03.RingBuffer var22 = new exercise03.RingBuffer(100);
    var22.enqueue((java.lang.Object)1);
    int var25 = var22.size();
    int var26 = var22.size();
    var1.enqueue((java.lang.Object)var26);
    exercise03.RingBuffer var29 = new exercise03.RingBuffer(100);
    java.util.Spliterator var30 = var29.spliterator();
    var1.enqueue((java.lang.Object)var29);
    int var32 = var1.size();
    int var33 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 3);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test191");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var21.iterator();
    exercise03.RingBuffer var25 = new exercise03.RingBuffer(100);
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    boolean var28 = var25.isEmpty();
    var25.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var31 = var25.spliterator();
    boolean var32 = var25.isEmpty();
    exercise03.RingBuffer var34 = new exercise03.RingBuffer(100);
    boolean var35 = var34.isEmpty();
    boolean var36 = var34.isEmpty();
    boolean var37 = var34.isEmpty();
    var34.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var40 = var34.spliterator();
    java.util.Iterator var41 = var34.iterator();
    var25.enqueue((java.lang.Object)var34);
    java.util.Spliterator var43 = var34.spliterator();
    exercise03.RingBuffer var45 = new exercise03.RingBuffer(100);
    var34.enqueue((java.lang.Object)var45);
    java.util.Iterator var47 = var34.iterator();
    java.util.Iterator var48 = var34.iterator();
    var21.enqueue((java.lang.Object)var34);
    boolean var50 = var21.isEmpty();
    java.util.Iterator var51 = var21.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test192");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    exercise03.RingBuffer var6 = new exercise03.RingBuffer(100);
    java.util.Iterator var7 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    boolean var13 = var10.isEmpty();
    exercise03.RingBuffer var15 = new exercise03.RingBuffer(100);
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    java.util.Spliterator var18 = var15.spliterator();
    var10.enqueue((java.lang.Object)var15);
    var1.enqueue((java.lang.Object)var10);
    java.util.Iterator var21 = var10.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test193");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Spliterator var8 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test194");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    int var19 = var1.size();
    boolean var20 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test195");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var4 = var1.spliterator();
    boolean var5 = var1.isEmpty();
    java.lang.Object var6 = var1.dequeue();
    int var7 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 1+ "'", var6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test196");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var14 = var1.spliterator();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var23 = new exercise03.RingBuffer(100);
    var23.enqueue((java.lang.Object)1);
    int var26 = var23.size();
    var16.enqueue((java.lang.Object)var23);
    java.util.Iterator var28 = var23.iterator();
    java.util.Iterator var29 = var23.iterator();
    java.util.Spliterator var30 = var23.spliterator();
    var1.enqueue((java.lang.Object)var23);
    boolean var32 = var23.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test197");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(1);
    int var2 = var1.size();
    exercise03.RingBuffer var4 = new exercise03.RingBuffer(100);
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    boolean var7 = var4.isEmpty();
    var4.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var10 = var4.spliterator();
    boolean var11 = var4.isEmpty();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Iterator var20 = var13.iterator();
    var4.enqueue((java.lang.Object)var13);
    java.util.Spliterator var22 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    int var24 = var1.size();
    java.util.Spliterator var25 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test198");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    var8.enqueue((java.lang.Object)10.0f);
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var23 = new exercise03.RingBuffer(100);
    var23.enqueue((java.lang.Object)1);
    int var26 = var23.size();
    var16.enqueue((java.lang.Object)var23);
    java.util.Iterator var28 = var23.iterator();
    java.lang.Object var29 = var23.dequeue();
    boolean var30 = var23.isEmpty();
    java.util.Spliterator var31 = var23.spliterator();
    var8.enqueue((java.lang.Object)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + 1+ "'", var29.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test199");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    java.util.Spliterator var11 = var1.spliterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    boolean var20 = var13.isEmpty();
    exercise03.RingBuffer var22 = new exercise03.RingBuffer(100);
    boolean var23 = var22.isEmpty();
    boolean var24 = var22.isEmpty();
    boolean var25 = var22.isEmpty();
    var22.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var28 = var22.spliterator();
    java.util.Iterator var29 = var22.iterator();
    var13.enqueue((java.lang.Object)var22);
    java.util.Spliterator var31 = var22.spliterator();
    exercise03.RingBuffer var33 = new exercise03.RingBuffer(100);
    var22.enqueue((java.lang.Object)var33);
    java.util.Spliterator var35 = var33.spliterator();
    java.util.Spliterator var36 = var33.spliterator();
    var1.enqueue((java.lang.Object)var33);
    int var38 = var33.size();
    exercise03.RingBuffer var40 = new exercise03.RingBuffer(100);
    boolean var41 = var40.isEmpty();
    boolean var42 = var40.isEmpty();
    boolean var43 = var40.isEmpty();
    var40.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var46 = var40.spliterator();
    boolean var47 = var40.isEmpty();
    int var48 = var40.size();
    java.lang.Object var49 = var40.dequeue();
    var33.enqueue((java.lang.Object)var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var51 = var40.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + (-1.0d)+ "'", var49.equals((-1.0d)));

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test200");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var10.iterator();
    java.util.Iterator var24 = var10.iterator();
    int var25 = var10.size();
    int var26 = var10.size();
    exercise03.RingBuffer var28 = new exercise03.RingBuffer(100);
    java.util.Iterator var29 = var28.iterator();
    java.util.Spliterator var30 = var28.spliterator();
    java.util.Iterator var31 = var28.iterator();
    var10.enqueue((java.lang.Object)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test201");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    exercise03.RingBuffer var4 = new exercise03.RingBuffer(100);
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    boolean var7 = var4.isEmpty();
    var4.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var10 = var4.spliterator();
    boolean var11 = var4.isEmpty();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Iterator var20 = var13.iterator();
    var4.enqueue((java.lang.Object)var13);
    java.util.Spliterator var22 = var13.spliterator();
    exercise03.RingBuffer var24 = new exercise03.RingBuffer(100);
    var13.enqueue((java.lang.Object)var24);
    java.util.Spliterator var26 = var24.spliterator();
    int var27 = var24.size();
    boolean var28 = var24.isEmpty();
    var1.enqueue((java.lang.Object)var28);
    int var30 = var1.size();
    boolean var31 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test202");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    exercise03.RingBuffer var4 = new exercise03.RingBuffer(100);
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    boolean var7 = var4.isEmpty();
    var4.enqueue((java.lang.Object)(short)0);
    java.lang.Object var10 = var4.dequeue();
    java.util.Spliterator var11 = var4.spliterator();
    var1.enqueue((java.lang.Object)var11);
    java.lang.Object var13 = var1.dequeue();
    java.util.Iterator var14 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (short)0+ "'", var10.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test203");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    java.lang.Object var20 = new java.lang.Object();
    var1.enqueue(var20);
    java.lang.Object var22 = var1.dequeue();
    java.util.Iterator var23 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test204");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    int var20 = var1.size();
    java.lang.Object var21 = var1.dequeue();
    boolean var22 = var1.isEmpty();
    java.util.Spliterator var23 = var1.spliterator();
    java.util.Iterator var24 = var1.iterator();
    int var25 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test205");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise03.RingBuffer var7 = new exercise03.RingBuffer(100);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    boolean var10 = var7.isEmpty();
    var7.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var13 = var7.spliterator();
    boolean var14 = var7.isEmpty();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var22 = var16.spliterator();
    java.util.Iterator var23 = var16.iterator();
    var7.enqueue((java.lang.Object)var16);
    java.lang.Object var25 = var7.dequeue();
    var1.enqueue((java.lang.Object)var7);
    java.util.Iterator var27 = var1.iterator();
    java.util.Iterator var28 = var1.iterator();
    exercise03.RingBuffer var30 = new exercise03.RingBuffer(100);
    var30.enqueue((java.lang.Object)1);
    int var33 = var30.size();
    int var34 = var30.size();
    exercise03.RingBuffer var36 = new exercise03.RingBuffer(100);
    boolean var37 = var36.isEmpty();
    boolean var38 = var36.isEmpty();
    boolean var39 = var36.isEmpty();
    var36.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var42 = var36.spliterator();
    boolean var43 = var36.isEmpty();
    boolean var44 = var36.isEmpty();
    int var45 = var36.size();
    java.util.Iterator var46 = var36.iterator();
    java.lang.Object var47 = var36.dequeue();
    var30.enqueue((java.lang.Object)var36);
    boolean var49 = var36.isEmpty();
    var1.enqueue((java.lang.Object)var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + (-1.0d)+ "'", var25.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + (-1.0d)+ "'", var47.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test206");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var14 = var1.spliterator();
    java.util.Spliterator var15 = var1.spliterator();
    exercise03.RingBuffer var17 = new exercise03.RingBuffer(100);
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    boolean var20 = var17.isEmpty();
    var17.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var23 = var17.spliterator();
    boolean var24 = var17.isEmpty();
    exercise03.RingBuffer var26 = new exercise03.RingBuffer(100);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    boolean var29 = var26.isEmpty();
    var26.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var32 = var26.spliterator();
    java.util.Iterator var33 = var26.iterator();
    var17.enqueue((java.lang.Object)var26);
    java.util.Spliterator var35 = var26.spliterator();
    exercise03.RingBuffer var37 = new exercise03.RingBuffer(100);
    var26.enqueue((java.lang.Object)var37);
    java.util.Spliterator var39 = var37.spliterator();
    java.util.Spliterator var40 = var37.spliterator();
    var1.enqueue((java.lang.Object)var37);
    java.util.Iterator var42 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test207");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    java.lang.Object var9 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0d)+ "'", var9.equals((-1.0d)));

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test208");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise03.RingBuffer var7 = new exercise03.RingBuffer(100);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    boolean var10 = var7.isEmpty();
    var7.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var13 = var7.spliterator();
    boolean var14 = var7.isEmpty();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var22 = var16.spliterator();
    java.util.Iterator var23 = var16.iterator();
    var7.enqueue((java.lang.Object)var16);
    java.lang.Object var25 = var7.dequeue();
    var1.enqueue((java.lang.Object)var7);
    boolean var27 = var7.isEmpty();
    exercise03.RingBuffer var29 = new exercise03.RingBuffer(100);
    boolean var30 = var29.isEmpty();
    boolean var31 = var29.isEmpty();
    boolean var32 = var29.isEmpty();
    var29.enqueue((java.lang.Object)(-1.0d));
    java.util.Iterator var35 = var29.iterator();
    boolean var36 = var29.isEmpty();
    boolean var37 = var29.isEmpty();
    var7.enqueue((java.lang.Object)var29);
    java.util.Iterator var39 = var7.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + (-1.0d)+ "'", var25.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test209");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var14 = var1.spliterator();
    java.lang.Object var15 = var1.dequeue();
    exercise03.RingBuffer var17 = new exercise03.RingBuffer(100);
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    boolean var20 = var17.isEmpty();
    var17.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var23 = var17.spliterator();
    boolean var24 = var17.isEmpty();
    exercise03.RingBuffer var26 = new exercise03.RingBuffer(100);
    var26.enqueue((java.lang.Object)1);
    var17.enqueue((java.lang.Object)1);
    java.util.Spliterator var30 = var17.spliterator();
    java.lang.Object var31 = var17.dequeue();
    java.util.Spliterator var32 = var17.spliterator();
    var1.enqueue((java.lang.Object)var32);
    boolean var34 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + (-1.0d)+ "'", var15.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + (-1.0d)+ "'", var31.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test210");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    java.util.Spliterator var9 = var1.spliterator();
    java.util.Iterator var10 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test211");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test212");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    int var4 = var1.size();
    int var5 = var1.size();
    java.lang.Object var6 = var1.dequeue();
    int var7 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 1+ "'", var6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test213");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(4);
    java.util.Spliterator var2 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test214");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    var8.enqueue((java.lang.Object)10.0f);
    java.lang.Object var15 = var8.dequeue();
    java.util.Spliterator var16 = var8.spliterator();
    java.util.Iterator var17 = var8.iterator();
    java.lang.Object var18 = var8.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 1+ "'", var15.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 10.0f+ "'", var18.equals(10.0f));

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test215");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(1);
    int var2 = var1.size();
    java.util.Iterator var3 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test216");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    int var10 = var1.size();
    java.lang.Object var11 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + (-1.0d)+ "'", var11.equals((-1.0d)));

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test217");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var14 = var1.spliterator();
    java.util.Spliterator var15 = var1.spliterator();
    exercise03.RingBuffer var17 = new exercise03.RingBuffer(100);
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    boolean var20 = var17.isEmpty();
    var17.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var23 = var17.spliterator();
    boolean var24 = var17.isEmpty();
    exercise03.RingBuffer var26 = new exercise03.RingBuffer(100);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    boolean var29 = var26.isEmpty();
    var26.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var32 = var26.spliterator();
    java.util.Iterator var33 = var26.iterator();
    var17.enqueue((java.lang.Object)var26);
    java.util.Spliterator var35 = var26.spliterator();
    exercise03.RingBuffer var37 = new exercise03.RingBuffer(100);
    var26.enqueue((java.lang.Object)var37);
    java.util.Spliterator var39 = var37.spliterator();
    java.util.Spliterator var40 = var37.spliterator();
    var1.enqueue((java.lang.Object)var37);
    java.util.Spliterator var42 = var1.spliterator();
    java.util.Spliterator var43 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test218");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    int var4 = var1.size();
    int var5 = var1.size();
    exercise03.RingBuffer var7 = new exercise03.RingBuffer(100);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    boolean var10 = var7.isEmpty();
    var7.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var13 = var7.spliterator();
    boolean var14 = var7.isEmpty();
    boolean var15 = var7.isEmpty();
    int var16 = var7.size();
    java.util.Iterator var17 = var7.iterator();
    java.lang.Object var18 = var7.dequeue();
    var1.enqueue((java.lang.Object)var7);
    java.util.Iterator var20 = var7.iterator();
    java.util.Spliterator var21 = var7.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + (-1.0d)+ "'", var18.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test219");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Spliterator var4 = var1.spliterator();
    boolean var5 = var1.isEmpty();
    var1.enqueue((java.lang.Object)'#');
    int var8 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test220");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(3);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test221");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    int var4 = var1.size();
    exercise03.RingBuffer var6 = new exercise03.RingBuffer(100);
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    java.util.Spliterator var9 = var6.spliterator();
    var6.enqueue((java.lang.Object)0);
    java.lang.Object var12 = var6.dequeue();
    var1.enqueue((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 0+ "'", var12.equals(0));

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test222");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    boolean var4 = var1.isEmpty();
    exercise03.RingBuffer var6 = new exercise03.RingBuffer(100);
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    java.util.Spliterator var9 = var6.spliterator();
    var1.enqueue((java.lang.Object)var6);
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 2);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test223");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    boolean var11 = var8.isEmpty();
    var8.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var14 = var8.spliterator();
    boolean var15 = var8.isEmpty();
    exercise03.RingBuffer var17 = new exercise03.RingBuffer(100);
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    boolean var20 = var17.isEmpty();
    var17.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var23 = var17.spliterator();
    java.util.Iterator var24 = var17.iterator();
    var8.enqueue((java.lang.Object)var17);
    java.util.Spliterator var26 = var17.spliterator();
    exercise03.RingBuffer var28 = new exercise03.RingBuffer(100);
    var17.enqueue((java.lang.Object)var28);
    java.util.Iterator var30 = var28.iterator();
    int var31 = var28.size();
    java.util.Spliterator var32 = var28.spliterator();
    var1.enqueue((java.lang.Object)var32);
    boolean var34 = var1.isEmpty();
    java.lang.Object var35 = var1.dequeue();
    exercise03.RingBuffer var37 = new exercise03.RingBuffer(100);
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    boolean var40 = var37.isEmpty();
    var37.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var43 = var37.spliterator();
    var37.enqueue((java.lang.Object)100L);
    java.lang.Object var46 = var37.dequeue();
    java.util.Spliterator var47 = var37.spliterator();
    exercise03.RingBuffer var49 = new exercise03.RingBuffer(100);
    boolean var50 = var49.isEmpty();
    boolean var51 = var49.isEmpty();
    boolean var52 = var49.isEmpty();
    var49.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var55 = var49.spliterator();
    boolean var56 = var49.isEmpty();
    exercise03.RingBuffer var58 = new exercise03.RingBuffer(100);
    boolean var59 = var58.isEmpty();
    boolean var60 = var58.isEmpty();
    boolean var61 = var58.isEmpty();
    var58.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var64 = var58.spliterator();
    java.util.Iterator var65 = var58.iterator();
    var49.enqueue((java.lang.Object)var58);
    java.util.Spliterator var67 = var58.spliterator();
    exercise03.RingBuffer var69 = new exercise03.RingBuffer(100);
    var58.enqueue((java.lang.Object)var69);
    java.util.Spliterator var71 = var69.spliterator();
    java.util.Spliterator var72 = var69.spliterator();
    var37.enqueue((java.lang.Object)var69);
    int var74 = var69.size();
    exercise03.RingBuffer var76 = new exercise03.RingBuffer(100);
    boolean var77 = var76.isEmpty();
    boolean var78 = var76.isEmpty();
    boolean var79 = var76.isEmpty();
    var76.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var82 = var76.spliterator();
    boolean var83 = var76.isEmpty();
    int var84 = var76.size();
    java.lang.Object var85 = var76.dequeue();
    var69.enqueue((java.lang.Object)var76);
    var1.enqueue((java.lang.Object)var69);
    int var88 = var69.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + (-1.0d)+ "'", var35.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + (-1.0d)+ "'", var46.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + (-1.0d)+ "'", var85.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == 1);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test224");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    boolean var7 = var1.isEmpty();
    exercise03.RingBuffer var9 = new exercise03.RingBuffer(100);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var9.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var15 = var9.spliterator();
    java.util.Spliterator var16 = var9.spliterator();
    java.lang.Object var17 = var9.dequeue();
    var1.enqueue((java.lang.Object)var9);
    exercise03.RingBuffer var20 = new exercise03.RingBuffer(100);
    var20.enqueue((java.lang.Object)1);
    int var23 = var20.size();
    java.util.Iterator var24 = var20.iterator();
    var20.enqueue((java.lang.Object)0.0f);
    java.util.Iterator var27 = var20.iterator();
    java.util.Iterator var28 = var20.iterator();
    var9.enqueue((java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + (-1.0d)+ "'", var17.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test225");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    java.lang.Object var10 = var1.dequeue();
    int var11 = var1.size();
    java.util.Iterator var12 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test226");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    int var20 = var1.size();
    int var21 = var1.size();
    java.lang.Object var22 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var23 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test227");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    java.lang.Object var10 = var1.dequeue();
    int var11 = var1.size();
    var1.enqueue((java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test228");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var21.iterator();
    int var24 = var21.size();
    java.util.Spliterator var25 = var21.spliterator();
    exercise03.RingBuffer var27 = new exercise03.RingBuffer(100);
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    boolean var30 = var27.isEmpty();
    var27.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var34 = new exercise03.RingBuffer(100);
    var34.enqueue((java.lang.Object)1);
    int var37 = var34.size();
    var27.enqueue((java.lang.Object)var34);
    var34.enqueue((java.lang.Object)10.0f);
    var21.enqueue((java.lang.Object)var34);
    java.util.Spliterator var42 = var34.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test229");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var10.iterator();
    java.util.Iterator var24 = var10.iterator();
    boolean var25 = var10.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test230");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    java.util.Spliterator var11 = var1.spliterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    boolean var20 = var13.isEmpty();
    exercise03.RingBuffer var22 = new exercise03.RingBuffer(100);
    boolean var23 = var22.isEmpty();
    boolean var24 = var22.isEmpty();
    boolean var25 = var22.isEmpty();
    var22.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var28 = var22.spliterator();
    java.util.Iterator var29 = var22.iterator();
    var13.enqueue((java.lang.Object)var22);
    java.util.Spliterator var31 = var22.spliterator();
    exercise03.RingBuffer var33 = new exercise03.RingBuffer(100);
    var22.enqueue((java.lang.Object)var33);
    java.util.Spliterator var35 = var33.spliterator();
    java.util.Spliterator var36 = var33.spliterator();
    var1.enqueue((java.lang.Object)var33);
    int var38 = var33.size();
    exercise03.RingBuffer var40 = new exercise03.RingBuffer(100);
    boolean var41 = var40.isEmpty();
    boolean var42 = var40.isEmpty();
    boolean var43 = var40.isEmpty();
    var40.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var46 = var40.spliterator();
    boolean var47 = var40.isEmpty();
    int var48 = var40.size();
    java.lang.Object var49 = var40.dequeue();
    var33.enqueue((java.lang.Object)var40);
    boolean var51 = var40.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + (-1.0d)+ "'", var49.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test231");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    var8.enqueue((java.lang.Object)10.0f);
    java.lang.Object var15 = var8.dequeue();
    java.util.Iterator var16 = var8.iterator();
    java.lang.Object var17 = var8.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 1+ "'", var15.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10.0f+ "'", var17.equals(10.0f));

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test232");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    int var20 = var1.size();
    java.lang.Object var21 = var1.dequeue();
    boolean var22 = var1.isEmpty();
    java.util.Iterator var23 = var1.iterator();
    java.util.Iterator var24 = var1.iterator();
    java.util.Iterator var25 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test233");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    java.lang.Object var7 = var1.dequeue();
    java.util.Spliterator var8 = var1.spliterator();
    int var9 = var1.size();
    java.util.Spliterator var10 = var1.spliterator();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)0+ "'", var7.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test234");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    exercise03.RingBuffer var24 = new exercise03.RingBuffer(100);
    java.util.Iterator var25 = var24.iterator();
    java.util.Spliterator var26 = var24.spliterator();
    boolean var27 = var24.isEmpty();
    var10.enqueue((java.lang.Object)var27);
    boolean var29 = var10.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test235");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    java.util.Spliterator var10 = var1.spliterator();
    int var11 = var1.size();
    java.util.Iterator var12 = var1.iterator();
    java.util.Spliterator var13 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (short)0+ "'", var9.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test236");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    java.lang.Object var10 = var1.dequeue();
    exercise03.RingBuffer var12 = new exercise03.RingBuffer(100);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    var12.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var18 = var12.spliterator();
    var12.enqueue((java.lang.Object)100L);
    java.lang.Object var21 = var12.dequeue();
    java.util.Iterator var22 = var12.iterator();
    java.util.Spliterator var23 = var12.spliterator();
    int var24 = var12.size();
    java.util.Iterator var25 = var12.iterator();
    var1.enqueue((java.lang.Object)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + (-1.0d)+ "'", var21.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test237");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var14 = var1.spliterator();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var23 = new exercise03.RingBuffer(100);
    var23.enqueue((java.lang.Object)1);
    int var26 = var23.size();
    var16.enqueue((java.lang.Object)var23);
    java.util.Iterator var28 = var23.iterator();
    java.util.Iterator var29 = var23.iterator();
    java.util.Spliterator var30 = var23.spliterator();
    var1.enqueue((java.lang.Object)var23);
    exercise03.RingBuffer var33 = new exercise03.RingBuffer(100);
    boolean var34 = var33.isEmpty();
    boolean var35 = var33.isEmpty();
    boolean var36 = var33.isEmpty();
    var33.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var39 = var33.spliterator();
    var33.enqueue((java.lang.Object)100L);
    java.lang.Object var42 = var33.dequeue();
    java.util.Spliterator var43 = var33.spliterator();
    java.util.Spliterator var44 = var33.spliterator();
    var1.enqueue((java.lang.Object)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + (-1.0d)+ "'", var42.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test238");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    java.util.Spliterator var11 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test239");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    var1.enqueue((java.lang.Object)true);
    java.lang.Object var6 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + true+ "'", var6.equals(true));

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test240");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    var8.enqueue((java.lang.Object)10.0f);
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    java.util.Iterator var17 = var16.iterator();
    java.util.Spliterator var18 = var16.spliterator();
    boolean var19 = var16.isEmpty();
    var8.enqueue((java.lang.Object)var16);
    java.util.Iterator var21 = var8.iterator();
    boolean var22 = var8.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test241");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    int var9 = var1.size();
    java.util.Spliterator var10 = var1.spliterator();
    java.util.Spliterator var11 = var1.spliterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Spliterator var20 = var13.spliterator();
    java.util.Spliterator var21 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    java.util.Iterator var23 = var13.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test242");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    java.lang.Object var9 = var1.dequeue();
    java.util.Iterator var10 = var1.iterator();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0d)+ "'", var9.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test243");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    exercise03.RingBuffer var5 = new exercise03.RingBuffer(100);
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    boolean var8 = var5.isEmpty();
    var5.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var11 = var5.spliterator();
    boolean var12 = var5.isEmpty();
    exercise03.RingBuffer var14 = new exercise03.RingBuffer(100);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    boolean var17 = var14.isEmpty();
    var14.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var20 = var14.spliterator();
    java.util.Iterator var21 = var14.iterator();
    var5.enqueue((java.lang.Object)var14);
    java.lang.Object var23 = var5.dequeue();
    int var24 = var5.size();
    int var25 = var5.size();
    var1.enqueue((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + (-1.0d)+ "'", var23.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test244");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    boolean var7 = var1.isEmpty();
    java.lang.Object var8 = var1.dequeue();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.lang.Object var17 = var10.dequeue();
    int var18 = var10.size();
    java.util.Spliterator var19 = var10.spliterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var21 = var10.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + (-1.0d)+ "'", var17.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test245");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    exercise03.RingBuffer var24 = new exercise03.RingBuffer(100);
    java.util.Iterator var25 = var24.iterator();
    java.util.Spliterator var26 = var24.spliterator();
    boolean var27 = var24.isEmpty();
    var10.enqueue((java.lang.Object)var27);
    exercise03.RingBuffer var30 = new exercise03.RingBuffer(100);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    boolean var33 = var30.isEmpty();
    var30.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var36 = var30.spliterator();
    boolean var37 = var30.isEmpty();
    exercise03.RingBuffer var39 = new exercise03.RingBuffer(100);
    boolean var40 = var39.isEmpty();
    boolean var41 = var39.isEmpty();
    boolean var42 = var39.isEmpty();
    var39.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var45 = var39.spliterator();
    java.util.Iterator var46 = var39.iterator();
    var30.enqueue((java.lang.Object)var39);
    java.lang.Object var48 = var30.dequeue();
    int var49 = var30.size();
    java.lang.Object var50 = var30.dequeue();
    exercise03.RingBuffer var52 = new exercise03.RingBuffer(100);
    boolean var53 = var52.isEmpty();
    boolean var54 = var52.isEmpty();
    boolean var55 = var52.isEmpty();
    var52.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var58 = var52.spliterator();
    boolean var59 = var52.isEmpty();
    boolean var60 = var52.isEmpty();
    int var61 = var52.size();
    java.util.Iterator var62 = var52.iterator();
    var30.enqueue((java.lang.Object)var52);
    java.lang.Object var64 = var30.dequeue();
    var10.enqueue((java.lang.Object)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + (-1.0d)+ "'", var48.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test246");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise03.RingBuffer var7 = new exercise03.RingBuffer(100);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    boolean var10 = var7.isEmpty();
    var7.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var13 = var7.spliterator();
    boolean var14 = var7.isEmpty();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var22 = var16.spliterator();
    java.util.Iterator var23 = var16.iterator();
    var7.enqueue((java.lang.Object)var16);
    java.lang.Object var25 = var7.dequeue();
    var1.enqueue((java.lang.Object)var7);
    java.util.Iterator var27 = var1.iterator();
    int var28 = var1.size();
    java.lang.Object var29 = var1.dequeue();
    java.util.Iterator var30 = var1.iterator();
    java.util.Iterator var31 = var1.iterator();
    java.util.Iterator var32 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + (-1.0d)+ "'", var25.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + 1+ "'", var29.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test247");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var21.iterator();
    int var24 = var21.size();
    exercise03.RingBuffer var26 = new exercise03.RingBuffer(100);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    boolean var29 = var26.isEmpty();
    var26.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var32 = var26.spliterator();
    boolean var33 = var26.isEmpty();
    exercise03.RingBuffer var35 = new exercise03.RingBuffer(100);
    boolean var36 = var35.isEmpty();
    boolean var37 = var35.isEmpty();
    boolean var38 = var35.isEmpty();
    var35.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var41 = var35.spliterator();
    java.util.Iterator var42 = var35.iterator();
    var26.enqueue((java.lang.Object)var35);
    java.lang.Object var44 = var26.dequeue();
    int var45 = var26.size();
    java.lang.Object var46 = var26.dequeue();
    var21.enqueue((java.lang.Object)var26);
    boolean var48 = var21.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + (-1.0d)+ "'", var44.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test248");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    java.util.Iterator var11 = var1.iterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    var13.enqueue((java.lang.Object)100L);
    java.lang.Object var22 = var13.dequeue();
    java.util.Iterator var23 = var13.iterator();
    java.util.Spliterator var24 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    int var26 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + (-1.0d)+ "'", var22.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 2);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test249");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(0);
    java.util.Iterator var2 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test250");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    int var9 = var1.size();
    java.util.Spliterator var10 = var1.spliterator();
    java.util.Spliterator var11 = var1.spliterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Spliterator var20 = var13.spliterator();
    java.util.Spliterator var21 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    boolean var23 = var13.isEmpty();
    exercise03.RingBuffer var25 = new exercise03.RingBuffer(100);
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    boolean var28 = var25.isEmpty();
    var25.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var31 = var25.spliterator();
    boolean var32 = var25.isEmpty();
    exercise03.RingBuffer var34 = new exercise03.RingBuffer(100);
    boolean var35 = var34.isEmpty();
    boolean var36 = var34.isEmpty();
    boolean var37 = var34.isEmpty();
    var34.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var40 = var34.spliterator();
    java.util.Iterator var41 = var34.iterator();
    var25.enqueue((java.lang.Object)var34);
    java.util.Spliterator var43 = var34.spliterator();
    exercise03.RingBuffer var45 = new exercise03.RingBuffer(100);
    var34.enqueue((java.lang.Object)var45);
    int var47 = var45.size();
    var13.enqueue((java.lang.Object)var45);
    java.util.Spliterator var49 = var13.spliterator();
    java.util.Iterator var50 = var13.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test251");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Iterator var4 = var1.iterator();
    java.lang.Object var5 = var1.dequeue();
    exercise03.RingBuffer var7 = new exercise03.RingBuffer(100);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    boolean var10 = var7.isEmpty();
    var7.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var13 = var7.spliterator();
    boolean var14 = var7.isEmpty();
    boolean var15 = var7.isEmpty();
    exercise03.RingBuffer var17 = new exercise03.RingBuffer(100);
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    boolean var20 = var17.isEmpty();
    var17.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var23 = var17.spliterator();
    boolean var24 = var17.isEmpty();
    exercise03.RingBuffer var26 = new exercise03.RingBuffer(100);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    boolean var29 = var26.isEmpty();
    var26.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var32 = var26.spliterator();
    java.util.Iterator var33 = var26.iterator();
    var17.enqueue((java.lang.Object)var26);
    java.util.Spliterator var35 = var26.spliterator();
    exercise03.RingBuffer var37 = new exercise03.RingBuffer(100);
    var26.enqueue((java.lang.Object)var37);
    var26.enqueue((java.lang.Object)10);
    java.util.Spliterator var41 = var26.spliterator();
    java.util.Spliterator var42 = var26.spliterator();
    var7.enqueue((java.lang.Object)var42);
    java.util.Iterator var44 = var7.iterator();
    var1.enqueue((java.lang.Object)var44);
    java.util.Spliterator var46 = var1.spliterator();
    int var47 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1+ "'", var5.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test252");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    int var20 = var1.size();
    java.lang.Object var21 = var1.dequeue();
    boolean var22 = var1.isEmpty();
    java.util.Spliterator var23 = var1.spliterator();
    java.util.Iterator var24 = var1.iterator();
    boolean var25 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test253");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    exercise03.RingBuffer var4 = new exercise03.RingBuffer(100);
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    boolean var7 = var4.isEmpty();
    var4.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var10 = var4.spliterator();
    boolean var11 = var4.isEmpty();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Iterator var20 = var13.iterator();
    var4.enqueue((java.lang.Object)var13);
    java.util.Spliterator var22 = var13.spliterator();
    exercise03.RingBuffer var24 = new exercise03.RingBuffer(100);
    var13.enqueue((java.lang.Object)var24);
    java.util.Spliterator var26 = var24.spliterator();
    int var27 = var24.size();
    boolean var28 = var24.isEmpty();
    var1.enqueue((java.lang.Object)var28);
    boolean var30 = var1.isEmpty();
    java.util.Spliterator var31 = var1.spliterator();
    java.lang.Object var32 = var1.dequeue();
    boolean var33 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + true+ "'", var32.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test254");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    int var4 = var1.size();
    int var5 = var1.size();
    exercise03.RingBuffer var7 = new exercise03.RingBuffer(100);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    boolean var10 = var7.isEmpty();
    var7.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var13 = var7.spliterator();
    boolean var14 = var7.isEmpty();
    boolean var15 = var7.isEmpty();
    int var16 = var7.size();
    java.util.Iterator var17 = var7.iterator();
    java.lang.Object var18 = var7.dequeue();
    var1.enqueue((java.lang.Object)var7);
    java.util.Iterator var20 = var7.iterator();
    boolean var21 = var7.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + (-1.0d)+ "'", var18.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test255");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(1);
    int var2 = var1.size();
    exercise03.RingBuffer var4 = new exercise03.RingBuffer(100);
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    boolean var7 = var4.isEmpty();
    var4.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var10 = var4.spliterator();
    boolean var11 = var4.isEmpty();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Iterator var20 = var13.iterator();
    var4.enqueue((java.lang.Object)var13);
    java.util.Spliterator var22 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    boolean var24 = var13.isEmpty();
    int var25 = var13.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test256");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Spliterator var8 = var1.spliterator();
    java.util.Spliterator var9 = var1.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    java.util.Spliterator var14 = var11.spliterator();
    boolean var15 = var11.isEmpty();
    var1.enqueue((java.lang.Object)var11);
    boolean var17 = var11.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var18 = var11.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test257");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    java.util.Spliterator var9 = var1.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    java.util.Spliterator var18 = var11.spliterator();
    var1.enqueue((java.lang.Object)var18);
    boolean var20 = var1.isEmpty();
    java.lang.Object var21 = var1.dequeue();
    boolean var22 = var1.isEmpty();
    int var23 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test258");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    int var20 = var1.size();
    java.lang.Object var21 = var1.dequeue();
    boolean var22 = var1.isEmpty();
    java.util.Spliterator var23 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var24 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test259");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Spliterator var8 = var1.spliterator();
    java.util.Spliterator var9 = var1.spliterator();
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.lang.Object var20 = var13.dequeue();
    int var21 = var13.size();
    java.util.Spliterator var22 = var13.spliterator();
    java.util.Spliterator var23 = var13.spliterator();
    java.util.Iterator var24 = var13.iterator();
    var1.enqueue((java.lang.Object)var24);
    java.lang.Object var26 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + (-1.0d)+ "'", var20.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + (-1.0d)+ "'", var26.equals((-1.0d)));

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test260");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test261");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    var1.enqueue((java.lang.Object)(short)10);
    exercise03.RingBuffer var7 = new exercise03.RingBuffer(10);
    var1.enqueue((java.lang.Object)var7);
    java.lang.Object var9 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 1+ "'", var9.equals(1));

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test262");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    java.util.Spliterator var9 = var1.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    java.util.Spliterator var18 = var11.spliterator();
    var1.enqueue((java.lang.Object)var18);
    boolean var20 = var1.isEmpty();
    exercise03.RingBuffer var22 = new exercise03.RingBuffer(100);
    var22.enqueue((java.lang.Object)1);
    boolean var25 = var22.isEmpty();
    exercise03.RingBuffer var27 = new exercise03.RingBuffer(100);
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    java.util.Spliterator var30 = var27.spliterator();
    var22.enqueue((java.lang.Object)var27);
    var1.enqueue((java.lang.Object)var22);
    boolean var33 = var1.isEmpty();
    java.lang.Object var34 = var1.dequeue();
    exercise03.RingBuffer var36 = new exercise03.RingBuffer(100);
    boolean var37 = var36.isEmpty();
    boolean var38 = var36.isEmpty();
    boolean var39 = var36.isEmpty();
    var36.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var42 = var36.spliterator();
    boolean var43 = var36.isEmpty();
    exercise03.RingBuffer var45 = new exercise03.RingBuffer(100);
    var45.enqueue((java.lang.Object)1);
    var36.enqueue((java.lang.Object)1);
    java.util.Spliterator var49 = var36.spliterator();
    var1.enqueue((java.lang.Object)var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test263");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    int var10 = var1.size();
    java.util.Spliterator var11 = var1.spliterator();
    boolean var12 = var1.isEmpty();
    boolean var13 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test264");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    boolean var11 = var8.isEmpty();
    var8.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var14 = var8.spliterator();
    boolean var15 = var8.isEmpty();
    exercise03.RingBuffer var17 = new exercise03.RingBuffer(100);
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    boolean var20 = var17.isEmpty();
    var17.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var23 = var17.spliterator();
    java.util.Iterator var24 = var17.iterator();
    var8.enqueue((java.lang.Object)var17);
    java.util.Spliterator var26 = var17.spliterator();
    exercise03.RingBuffer var28 = new exercise03.RingBuffer(100);
    var17.enqueue((java.lang.Object)var28);
    java.util.Iterator var30 = var28.iterator();
    int var31 = var28.size();
    java.util.Spliterator var32 = var28.spliterator();
    var1.enqueue((java.lang.Object)var32);
    boolean var34 = var1.isEmpty();
    java.lang.Object var35 = var1.dequeue();
    exercise03.RingBuffer var37 = new exercise03.RingBuffer(100);
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    boolean var40 = var37.isEmpty();
    var37.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var43 = var37.spliterator();
    var37.enqueue((java.lang.Object)100L);
    java.lang.Object var46 = var37.dequeue();
    java.util.Spliterator var47 = var37.spliterator();
    exercise03.RingBuffer var49 = new exercise03.RingBuffer(100);
    boolean var50 = var49.isEmpty();
    boolean var51 = var49.isEmpty();
    boolean var52 = var49.isEmpty();
    var49.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var55 = var49.spliterator();
    boolean var56 = var49.isEmpty();
    exercise03.RingBuffer var58 = new exercise03.RingBuffer(100);
    boolean var59 = var58.isEmpty();
    boolean var60 = var58.isEmpty();
    boolean var61 = var58.isEmpty();
    var58.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var64 = var58.spliterator();
    java.util.Iterator var65 = var58.iterator();
    var49.enqueue((java.lang.Object)var58);
    java.util.Spliterator var67 = var58.spliterator();
    exercise03.RingBuffer var69 = new exercise03.RingBuffer(100);
    var58.enqueue((java.lang.Object)var69);
    java.util.Spliterator var71 = var69.spliterator();
    java.util.Spliterator var72 = var69.spliterator();
    var37.enqueue((java.lang.Object)var69);
    int var74 = var69.size();
    exercise03.RingBuffer var76 = new exercise03.RingBuffer(100);
    boolean var77 = var76.isEmpty();
    boolean var78 = var76.isEmpty();
    boolean var79 = var76.isEmpty();
    var76.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var82 = var76.spliterator();
    boolean var83 = var76.isEmpty();
    int var84 = var76.size();
    java.lang.Object var85 = var76.dequeue();
    var69.enqueue((java.lang.Object)var76);
    var1.enqueue((java.lang.Object)var69);
    java.lang.Object var88 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + (-1.0d)+ "'", var35.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + (-1.0d)+ "'", var46.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var82);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + (-1.0d)+ "'", var85.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var88);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test265");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    boolean var6 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test266");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var14 = var1.spliterator();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var23 = new exercise03.RingBuffer(100);
    var23.enqueue((java.lang.Object)1);
    int var26 = var23.size();
    var16.enqueue((java.lang.Object)var23);
    java.util.Iterator var28 = var23.iterator();
    java.util.Iterator var29 = var23.iterator();
    java.util.Spliterator var30 = var23.spliterator();
    var1.enqueue((java.lang.Object)var23);
    java.util.Spliterator var32 = var23.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test267");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    java.util.Spliterator var9 = var1.spliterator();
    java.util.Spliterator var10 = var1.spliterator();
    exercise03.RingBuffer var12 = new exercise03.RingBuffer(100);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    var12.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var18 = var12.spliterator();
    java.lang.Object var19 = var12.dequeue();
    int var20 = var12.size();
    java.util.Spliterator var21 = var12.spliterator();
    java.util.Spliterator var22 = var12.spliterator();
    exercise03.RingBuffer var24 = new exercise03.RingBuffer(100);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    boolean var27 = var24.isEmpty();
    var24.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var30 = var24.spliterator();
    java.util.Spliterator var31 = var24.spliterator();
    java.util.Spliterator var32 = var24.spliterator();
    var12.enqueue((java.lang.Object)var24);
    boolean var34 = var24.isEmpty();
    exercise03.RingBuffer var36 = new exercise03.RingBuffer(100);
    boolean var37 = var36.isEmpty();
    boolean var38 = var36.isEmpty();
    boolean var39 = var36.isEmpty();
    var36.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var42 = var36.spliterator();
    boolean var43 = var36.isEmpty();
    exercise03.RingBuffer var45 = new exercise03.RingBuffer(100);
    boolean var46 = var45.isEmpty();
    boolean var47 = var45.isEmpty();
    boolean var48 = var45.isEmpty();
    var45.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var51 = var45.spliterator();
    java.util.Iterator var52 = var45.iterator();
    var36.enqueue((java.lang.Object)var45);
    java.util.Spliterator var54 = var45.spliterator();
    exercise03.RingBuffer var56 = new exercise03.RingBuffer(100);
    var45.enqueue((java.lang.Object)var56);
    int var58 = var56.size();
    var24.enqueue((java.lang.Object)var56);
    int var60 = var24.size();
    var1.enqueue((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 2);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test268");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    java.util.Spliterator var9 = var1.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    java.util.Spliterator var18 = var11.spliterator();
    var1.enqueue((java.lang.Object)var18);
    boolean var20 = var1.isEmpty();
    exercise03.RingBuffer var22 = new exercise03.RingBuffer(100);
    var22.enqueue((java.lang.Object)1);
    int var25 = var22.size();
    int var26 = var22.size();
    var1.enqueue((java.lang.Object)var26);
    exercise03.RingBuffer var29 = new exercise03.RingBuffer(100);
    java.util.Spliterator var30 = var29.spliterator();
    var1.enqueue((java.lang.Object)var29);
    boolean var32 = var1.isEmpty();
    java.util.Iterator var33 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test269");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(1);
    int var2 = var1.size();
    exercise03.RingBuffer var4 = new exercise03.RingBuffer(100);
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    boolean var7 = var4.isEmpty();
    var4.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var10 = var4.spliterator();
    boolean var11 = var4.isEmpty();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Iterator var20 = var13.iterator();
    var4.enqueue((java.lang.Object)var13);
    java.util.Spliterator var22 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    java.util.Iterator var24 = var1.iterator();
    int var25 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test270");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    java.util.Spliterator var6 = var1.spliterator();
    java.lang.Object var7 = var1.dequeue();
    java.util.Spliterator var8 = var1.spliterator();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    java.util.Iterator var13 = var10.iterator();
    java.lang.Object var14 = var10.dequeue();
    boolean var15 = var10.isEmpty();
    var1.enqueue((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1+ "'", var7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 1+ "'", var14.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test271");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Spliterator var23 = var21.spliterator();
    int var24 = var21.size();
    java.util.Spliterator var25 = var21.spliterator();
    exercise03.RingBuffer var27 = new exercise03.RingBuffer(100);
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    boolean var30 = var27.isEmpty();
    var27.enqueue((java.lang.Object)(short)0);
    boolean var33 = var27.isEmpty();
    java.util.Iterator var34 = var27.iterator();
    java.lang.Object var35 = var27.dequeue();
    boolean var36 = var27.isEmpty();
    java.util.Spliterator var37 = var27.spliterator();
    java.util.Spliterator var38 = var27.spliterator();
    var21.enqueue((java.lang.Object)var27);
    int var40 = var27.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + (short)0+ "'", var35.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test272");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    java.lang.Object var9 = var1.dequeue();
    java.util.Iterator var10 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (short)0+ "'", var9.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test273");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise03.RingBuffer var7 = new exercise03.RingBuffer(100);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    boolean var10 = var7.isEmpty();
    var7.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var13 = var7.spliterator();
    boolean var14 = var7.isEmpty();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var22 = var16.spliterator();
    java.util.Iterator var23 = var16.iterator();
    var7.enqueue((java.lang.Object)var16);
    java.lang.Object var25 = var7.dequeue();
    var1.enqueue((java.lang.Object)var7);
    boolean var27 = var1.isEmpty();
    java.lang.Object var28 = var1.dequeue();
    exercise03.RingBuffer var30 = new exercise03.RingBuffer(100);
    var30.enqueue((java.lang.Object)1);
    java.util.Iterator var33 = var30.iterator();
    java.util.Iterator var34 = var30.iterator();
    var1.enqueue((java.lang.Object)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + (-1.0d)+ "'", var25.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + 1+ "'", var28.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test274");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var14 = var1.spliterator();
    java.util.Spliterator var15 = var1.spliterator();
    exercise03.RingBuffer var17 = new exercise03.RingBuffer(100);
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    boolean var20 = var17.isEmpty();
    var17.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var23 = var17.spliterator();
    boolean var24 = var17.isEmpty();
    exercise03.RingBuffer var26 = new exercise03.RingBuffer(100);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    boolean var29 = var26.isEmpty();
    var26.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var32 = var26.spliterator();
    java.util.Iterator var33 = var26.iterator();
    var17.enqueue((java.lang.Object)var26);
    java.util.Spliterator var35 = var26.spliterator();
    exercise03.RingBuffer var37 = new exercise03.RingBuffer(100);
    var26.enqueue((java.lang.Object)var37);
    java.util.Spliterator var39 = var37.spliterator();
    java.util.Spliterator var40 = var37.spliterator();
    var1.enqueue((java.lang.Object)var37);
    java.util.Spliterator var42 = var37.spliterator();
    java.util.Iterator var43 = var37.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test275");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(1);
    int var2 = var1.size();
    exercise03.RingBuffer var4 = new exercise03.RingBuffer(100);
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    boolean var7 = var4.isEmpty();
    var4.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var10 = var4.spliterator();
    boolean var11 = var4.isEmpty();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Iterator var20 = var13.iterator();
    var4.enqueue((java.lang.Object)var13);
    java.util.Spliterator var22 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    int var24 = var1.size();
    int var25 = var1.size();
    java.util.Spliterator var26 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test276");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    java.lang.Object var20 = new java.lang.Object();
    var1.enqueue(var20);
    java.lang.Object var22 = var1.dequeue();
    exercise03.RingBuffer var24 = new exercise03.RingBuffer(100);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    boolean var27 = var24.isEmpty();
    var24.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var31 = new exercise03.RingBuffer(100);
    var31.enqueue((java.lang.Object)1);
    int var34 = var31.size();
    var24.enqueue((java.lang.Object)var31);
    java.util.Iterator var36 = var31.iterator();
    java.lang.Object var37 = var31.dequeue();
    boolean var38 = var31.isEmpty();
    var1.enqueue((java.lang.Object)var31);
    boolean var40 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + 1+ "'", var37.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test277");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    exercise03.RingBuffer var6 = new exercise03.RingBuffer(100);
    java.util.Iterator var7 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    boolean var13 = var10.isEmpty();
    exercise03.RingBuffer var15 = new exercise03.RingBuffer(100);
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    java.util.Spliterator var18 = var15.spliterator();
    var10.enqueue((java.lang.Object)var15);
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var21 = var1.dequeue();
    java.util.Spliterator var22 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test278");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise03.RingBuffer var7 = new exercise03.RingBuffer(100);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    boolean var10 = var7.isEmpty();
    var7.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var13 = var7.spliterator();
    boolean var14 = var7.isEmpty();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var22 = var16.spliterator();
    java.util.Iterator var23 = var16.iterator();
    var7.enqueue((java.lang.Object)var16);
    java.lang.Object var25 = var7.dequeue();
    var1.enqueue((java.lang.Object)var7);
    java.util.Iterator var27 = var1.iterator();
    java.util.Iterator var28 = var1.iterator();
    java.lang.Object var29 = var1.dequeue();
    boolean var30 = var1.isEmpty();
    int var31 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + (-1.0d)+ "'", var25.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + 1+ "'", var29.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test279");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Spliterator var23 = var21.spliterator();
    java.util.Spliterator var24 = var21.spliterator();
    var21.enqueue((java.lang.Object)10L);
    boolean var27 = var21.isEmpty();
    java.lang.Object var28 = var21.dequeue();
    boolean var29 = var21.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + 10L+ "'", var28.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test280");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    java.lang.Object var6 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 1+ "'", var6.equals(1));

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test281");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var10.iterator();
    var10.enqueue((java.lang.Object)0L);
    java.util.Spliterator var26 = var10.spliterator();
    java.lang.Object var27 = var10.dequeue();
    java.util.Iterator var28 = var10.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + (-1.0d)+ "'", var27.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test282");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Spliterator var5 = var1.spliterator();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    java.lang.Object var8 = var1.dequeue();
    java.util.Iterator var9 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 1+ "'", var8.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test283");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    java.lang.Object var12 = var1.dequeue();
    boolean var13 = var1.isEmpty();
    boolean var14 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (-1.0d)+ "'", var12.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test284");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)0);
    var1.enqueue((java.lang.Object)(short)100);
    int var6 = var1.size();
    java.lang.Object var7 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0+ "'", var7.equals(0));

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test285");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    int var20 = var1.size();
    java.lang.Object var21 = var1.dequeue();
    boolean var22 = var1.isEmpty();
    exercise03.RingBuffer var24 = new exercise03.RingBuffer(100);
    boolean var25 = var24.isEmpty();
    exercise03.RingBuffer var27 = new exercise03.RingBuffer(100);
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    boolean var30 = var27.isEmpty();
    var27.enqueue((java.lang.Object)(short)0);
    java.lang.Object var33 = var27.dequeue();
    java.util.Spliterator var34 = var27.spliterator();
    var24.enqueue((java.lang.Object)var34);
    var1.enqueue((java.lang.Object)var24);
    java.util.Spliterator var37 = var1.spliterator();
    java.util.Iterator var38 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + (short)0+ "'", var33.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test286");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    exercise03.RingBuffer var24 = new exercise03.RingBuffer(100);
    java.util.Iterator var25 = var24.iterator();
    java.util.Spliterator var26 = var24.spliterator();
    boolean var27 = var24.isEmpty();
    var10.enqueue((java.lang.Object)var27);
    java.lang.Object var29 = var10.dequeue();
    boolean var30 = var10.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + (-1.0d)+ "'", var29.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test287");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test288");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Iterator var19 = var1.iterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    boolean var24 = var21.isEmpty();
    var21.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var27 = var21.spliterator();
    boolean var28 = var21.isEmpty();
    exercise03.RingBuffer var30 = new exercise03.RingBuffer(100);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    boolean var33 = var30.isEmpty();
    var30.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var36 = var30.spliterator();
    java.util.Iterator var37 = var30.iterator();
    var21.enqueue((java.lang.Object)var30);
    java.lang.Object var39 = var21.dequeue();
    int var40 = var21.size();
    java.util.Spliterator var41 = var21.spliterator();
    var1.enqueue((java.lang.Object)var21);
    java.util.Iterator var43 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + (-1.0d)+ "'", var39.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test289");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    var8.enqueue((java.lang.Object)10.0f);
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    java.util.Iterator var17 = var16.iterator();
    java.util.Spliterator var18 = var16.spliterator();
    boolean var19 = var16.isEmpty();
    var8.enqueue((java.lang.Object)var16);
    exercise03.RingBuffer var22 = new exercise03.RingBuffer(100);
    boolean var23 = var22.isEmpty();
    boolean var24 = var22.isEmpty();
    boolean var25 = var22.isEmpty();
    var22.enqueue((java.lang.Object)(-1.0d));
    boolean var28 = var22.isEmpty();
    var8.enqueue((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test290");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test291");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    int var9 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test292");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    int var20 = var1.size();
    int var21 = var1.size();
    java.lang.Object var22 = var1.dequeue();
    int var23 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test293");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test294");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    java.util.Iterator var13 = var8.iterator();
    java.util.Iterator var14 = var8.iterator();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var22 = var16.spliterator();
    var16.enqueue((java.lang.Object)100L);
    java.lang.Object var25 = var16.dequeue();
    var16.enqueue((java.lang.Object)"");
    java.util.Iterator var28 = var16.iterator();
    var8.enqueue((java.lang.Object)var28);
    java.util.Spliterator var30 = var8.spliterator();
    int var31 = var8.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + (-1.0d)+ "'", var25.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 2);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test295");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    int var20 = var1.size();
    java.lang.Object var21 = var1.dequeue();
    boolean var22 = var1.isEmpty();
    exercise03.RingBuffer var24 = new exercise03.RingBuffer(100);
    boolean var25 = var24.isEmpty();
    exercise03.RingBuffer var27 = new exercise03.RingBuffer(100);
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    boolean var30 = var27.isEmpty();
    var27.enqueue((java.lang.Object)(short)0);
    java.lang.Object var33 = var27.dequeue();
    java.util.Spliterator var34 = var27.spliterator();
    var24.enqueue((java.lang.Object)var34);
    var1.enqueue((java.lang.Object)var24);
    exercise03.RingBuffer var38 = new exercise03.RingBuffer(100);
    boolean var39 = var38.isEmpty();
    boolean var40 = var38.isEmpty();
    boolean var41 = var38.isEmpty();
    var38.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var44 = var38.spliterator();
    boolean var45 = var38.isEmpty();
    exercise03.RingBuffer var47 = new exercise03.RingBuffer(100);
    boolean var48 = var47.isEmpty();
    boolean var49 = var47.isEmpty();
    boolean var50 = var47.isEmpty();
    var47.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var53 = var47.spliterator();
    java.util.Iterator var54 = var47.iterator();
    var38.enqueue((java.lang.Object)var47);
    var1.enqueue((java.lang.Object)var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + (short)0+ "'", var33.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test296");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var4 = var1.spliterator();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test297");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    java.util.Spliterator var9 = var1.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    java.util.Spliterator var18 = var11.spliterator();
    var1.enqueue((java.lang.Object)var18);
    boolean var20 = var1.isEmpty();
    exercise03.RingBuffer var22 = new exercise03.RingBuffer(100);
    var22.enqueue((java.lang.Object)1);
    int var25 = var22.size();
    int var26 = var22.size();
    var1.enqueue((java.lang.Object)var26);
    exercise03.RingBuffer var29 = new exercise03.RingBuffer(100);
    java.util.Spliterator var30 = var29.spliterator();
    var1.enqueue((java.lang.Object)var29);
    java.util.Spliterator var32 = var29.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test298");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    int var9 = var1.size();
    java.util.Spliterator var10 = var1.spliterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test299");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Spliterator var8 = var1.spliterator();
    java.lang.Object var9 = var1.dequeue();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0d)+ "'", var9.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test300");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    int var4 = var1.size();
    int var5 = var1.size();
    java.lang.Object var6 = var1.dequeue();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 1+ "'", var6.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test301");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var21.iterator();
    exercise03.RingBuffer var25 = new exercise03.RingBuffer(100);
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    boolean var28 = var25.isEmpty();
    var25.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var31 = var25.spliterator();
    boolean var32 = var25.isEmpty();
    exercise03.RingBuffer var34 = new exercise03.RingBuffer(100);
    boolean var35 = var34.isEmpty();
    boolean var36 = var34.isEmpty();
    boolean var37 = var34.isEmpty();
    var34.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var40 = var34.spliterator();
    java.util.Iterator var41 = var34.iterator();
    var25.enqueue((java.lang.Object)var34);
    java.util.Spliterator var43 = var34.spliterator();
    exercise03.RingBuffer var45 = new exercise03.RingBuffer(100);
    var34.enqueue((java.lang.Object)var45);
    java.util.Iterator var47 = var34.iterator();
    java.util.Iterator var48 = var34.iterator();
    var21.enqueue((java.lang.Object)var34);
    boolean var50 = var21.isEmpty();
    boolean var51 = var21.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test302");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.lang.Object var9 = var1.dequeue();
    java.util.Spliterator var10 = var1.spliterator();
    int var11 = var1.size();
    java.util.Iterator var12 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (short)0+ "'", var9.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test303");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    var1.enqueue((java.lang.Object)"");
    java.util.Iterator var13 = var1.iterator();
    java.lang.Object var14 = var1.dequeue();
    java.util.Iterator var15 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 100L+ "'", var14.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test304");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Spliterator var23 = var21.spliterator();
    java.util.Spliterator var24 = var21.spliterator();
    var21.enqueue((java.lang.Object)10L);
    java.util.Iterator var27 = var21.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test305");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    int var12 = var1.size();
    java.util.Spliterator var13 = var1.spliterator();
    exercise03.RingBuffer var15 = new exercise03.RingBuffer(100);
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    boolean var18 = var15.isEmpty();
    var15.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var21 = var15.spliterator();
    boolean var22 = var15.isEmpty();
    exercise03.RingBuffer var24 = new exercise03.RingBuffer(100);
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    boolean var27 = var24.isEmpty();
    var24.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var30 = var24.spliterator();
    java.util.Iterator var31 = var24.iterator();
    var15.enqueue((java.lang.Object)var24);
    java.util.Spliterator var33 = var24.spliterator();
    exercise03.RingBuffer var35 = new exercise03.RingBuffer(100);
    var24.enqueue((java.lang.Object)var35);
    java.util.Iterator var37 = var24.iterator();
    java.util.Iterator var38 = var24.iterator();
    int var39 = var24.size();
    int var40 = var24.size();
    java.lang.Object var41 = var24.dequeue();
    var1.enqueue((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + (-1.0d)+ "'", var41.equals((-1.0d)));

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test306");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    java.lang.Object var10 = var1.dequeue();
    boolean var11 = var1.isEmpty();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    var13.enqueue((java.lang.Object)1);
    java.util.Iterator var16 = var13.iterator();
    java.util.Iterator var17 = var13.iterator();
    exercise03.RingBuffer var19 = new exercise03.RingBuffer(100);
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    var19.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var25 = var19.spliterator();
    boolean var26 = var19.isEmpty();
    exercise03.RingBuffer var28 = new exercise03.RingBuffer(100);
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    boolean var31 = var28.isEmpty();
    var28.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var34 = var28.spliterator();
    java.util.Iterator var35 = var28.iterator();
    var19.enqueue((java.lang.Object)var28);
    java.lang.Object var37 = var19.dequeue();
    var13.enqueue((java.lang.Object)var19);
    java.util.Iterator var39 = var13.iterator();
    java.util.Iterator var40 = var13.iterator();
    java.lang.Object var41 = var13.dequeue();
    java.util.Iterator var42 = var13.iterator();
    var1.enqueue((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + (-1.0d)+ "'", var37.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + 1+ "'", var41.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test307");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Spliterator var23 = var21.spliterator();
    java.util.Spliterator var24 = var21.spliterator();
    var21.enqueue((java.lang.Object)10L);
    boolean var27 = var21.isEmpty();
    java.util.Spliterator var28 = var21.spliterator();
    exercise03.RingBuffer var30 = new exercise03.RingBuffer(100);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    boolean var33 = var30.isEmpty();
    var30.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var36 = var30.spliterator();
    java.lang.Object var37 = var30.dequeue();
    java.util.Spliterator var38 = var30.spliterator();
    exercise03.RingBuffer var40 = new exercise03.RingBuffer(100);
    boolean var41 = var40.isEmpty();
    boolean var42 = var40.isEmpty();
    boolean var43 = var40.isEmpty();
    var40.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var46 = var40.spliterator();
    java.util.Spliterator var47 = var40.spliterator();
    var30.enqueue((java.lang.Object)var47);
    boolean var49 = var30.isEmpty();
    java.lang.Object var50 = var30.dequeue();
    var21.enqueue(var50);
    java.lang.Object var52 = var21.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + (-1.0d)+ "'", var37.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + 10L+ "'", var52.equals(10L));

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test308");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    exercise03.RingBuffer var4 = new exercise03.RingBuffer(100);
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    boolean var7 = var4.isEmpty();
    var4.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var10 = var4.spliterator();
    boolean var11 = var4.isEmpty();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Iterator var20 = var13.iterator();
    var4.enqueue((java.lang.Object)var13);
    java.util.Spliterator var22 = var13.spliterator();
    exercise03.RingBuffer var24 = new exercise03.RingBuffer(100);
    var13.enqueue((java.lang.Object)var24);
    java.util.Spliterator var26 = var24.spliterator();
    int var27 = var24.size();
    boolean var28 = var24.isEmpty();
    var1.enqueue((java.lang.Object)var28);
    boolean var30 = var1.isEmpty();
    java.lang.Object var31 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + true+ "'", var31.equals(true));

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test309");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    int var20 = var1.size();
    java.lang.Object var21 = var1.dequeue();
    boolean var22 = var1.isEmpty();
    java.util.Spliterator var23 = var1.spliterator();
    exercise03.RingBuffer var25 = new exercise03.RingBuffer(100);
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    boolean var28 = var25.isEmpty();
    var25.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var31 = var25.spliterator();
    java.lang.Object var32 = var25.dequeue();
    int var33 = var25.size();
    java.util.Spliterator var34 = var25.spliterator();
    java.util.Spliterator var35 = var25.spliterator();
    exercise03.RingBuffer var37 = new exercise03.RingBuffer(100);
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    boolean var40 = var37.isEmpty();
    var37.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var43 = var37.spliterator();
    java.util.Spliterator var44 = var37.spliterator();
    java.util.Spliterator var45 = var37.spliterator();
    var25.enqueue((java.lang.Object)var37);
    boolean var47 = var37.isEmpty();
    exercise03.RingBuffer var49 = new exercise03.RingBuffer(100);
    boolean var50 = var49.isEmpty();
    boolean var51 = var49.isEmpty();
    boolean var52 = var49.isEmpty();
    var49.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var55 = var49.spliterator();
    boolean var56 = var49.isEmpty();
    exercise03.RingBuffer var58 = new exercise03.RingBuffer(100);
    boolean var59 = var58.isEmpty();
    boolean var60 = var58.isEmpty();
    boolean var61 = var58.isEmpty();
    var58.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var64 = var58.spliterator();
    java.util.Iterator var65 = var58.iterator();
    var49.enqueue((java.lang.Object)var58);
    java.util.Spliterator var67 = var58.spliterator();
    exercise03.RingBuffer var69 = new exercise03.RingBuffer(100);
    var58.enqueue((java.lang.Object)var69);
    int var71 = var69.size();
    var37.enqueue((java.lang.Object)var69);
    var1.enqueue((java.lang.Object)var37);
    java.util.Iterator var74 = var37.iterator();
    java.util.Iterator var75 = var37.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + (-1.0d)+ "'", var32.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test310");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Spliterator var8 = var1.spliterator();
    java.util.Spliterator var9 = var1.spliterator();
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    java.util.Iterator var12 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test311");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Spliterator var23 = var21.spliterator();
    int var24 = var21.size();
    boolean var25 = var21.isEmpty();
    java.util.Iterator var26 = var21.iterator();
    exercise03.RingBuffer var28 = new exercise03.RingBuffer(100);
    var28.enqueue((java.lang.Object)1);
    int var31 = var28.size();
    int var32 = var28.size();
    java.lang.Object var33 = var28.dequeue();
    var21.enqueue((java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + 1+ "'", var33.equals(1));

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test312");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test313");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    int var10 = var1.size();
    exercise03.RingBuffer var12 = new exercise03.RingBuffer(100);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    var12.enqueue((java.lang.Object)(-1.0d));
    java.util.Iterator var18 = var12.iterator();
    java.util.Iterator var19 = var12.iterator();
    int var20 = var12.size();
    var1.enqueue((java.lang.Object)var12);
    exercise03.RingBuffer var23 = new exercise03.RingBuffer(100);
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    boolean var26 = var23.isEmpty();
    var23.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var30 = new exercise03.RingBuffer(100);
    var30.enqueue((java.lang.Object)1);
    int var33 = var30.size();
    var23.enqueue((java.lang.Object)var30);
    java.util.Iterator var35 = var30.iterator();
    java.util.Iterator var36 = var30.iterator();
    exercise03.RingBuffer var38 = new exercise03.RingBuffer(100);
    boolean var39 = var38.isEmpty();
    boolean var40 = var38.isEmpty();
    boolean var41 = var38.isEmpty();
    var38.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var44 = var38.spliterator();
    var38.enqueue((java.lang.Object)100L);
    java.lang.Object var47 = var38.dequeue();
    var38.enqueue((java.lang.Object)"");
    java.util.Iterator var50 = var38.iterator();
    var30.enqueue((java.lang.Object)var50);
    var12.enqueue((java.lang.Object)var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + (-1.0d)+ "'", var47.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test314");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    int var9 = var1.size();
    java.util.Spliterator var10 = var1.spliterator();
    int var11 = var1.size();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(short)0);
    java.util.Spliterator var19 = var13.spliterator();
    java.lang.Object var20 = var13.dequeue();
    java.util.Spliterator var21 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + (short)0+ "'", var20.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test315");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var4 = var1.spliterator();
    int var5 = var1.size();
    java.util.Spliterator var6 = var1.spliterator();
    java.lang.Object var7 = var1.dequeue();
    java.util.Spliterator var8 = var1.spliterator();
    java.util.Spliterator var9 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1+ "'", var7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test316");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise03.RingBuffer var7 = new exercise03.RingBuffer(100);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    boolean var10 = var7.isEmpty();
    var7.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var13 = var7.spliterator();
    boolean var14 = var7.isEmpty();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var22 = var16.spliterator();
    java.util.Iterator var23 = var16.iterator();
    var7.enqueue((java.lang.Object)var16);
    java.lang.Object var25 = var7.dequeue();
    var1.enqueue((java.lang.Object)var7);
    java.util.Iterator var27 = var1.iterator();
    int var28 = var1.size();
    java.lang.Object var29 = var1.dequeue();
    java.util.Iterator var30 = var1.iterator();
    java.util.Iterator var31 = var1.iterator();
    java.util.Spliterator var32 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + (-1.0d)+ "'", var25.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + 1+ "'", var29.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test317");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Spliterator var8 = var1.spliterator();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    boolean var17 = var10.isEmpty();
    boolean var18 = var10.isEmpty();
    int var19 = var10.size();
    java.util.Spliterator var20 = var10.spliterator();
    boolean var21 = var10.isEmpty();
    var1.enqueue((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test318");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    java.util.Spliterator var9 = var1.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    java.util.Spliterator var18 = var11.spliterator();
    var1.enqueue((java.lang.Object)var18);
    boolean var20 = var1.isEmpty();
    exercise03.RingBuffer var22 = new exercise03.RingBuffer(100);
    var22.enqueue((java.lang.Object)1);
    int var25 = var22.size();
    int var26 = var22.size();
    var1.enqueue((java.lang.Object)var26);
    java.util.Spliterator var28 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test319");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test320");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    boolean var7 = var1.isEmpty();
    java.lang.Object var8 = var1.dequeue();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.lang.Object var17 = var10.dequeue();
    int var18 = var10.size();
    java.util.Spliterator var19 = var10.spliterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var21 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + (-1.0d)+ "'", var17.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test321");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    java.util.Spliterator var9 = var1.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    java.util.Spliterator var18 = var11.spliterator();
    var1.enqueue((java.lang.Object)var18);
    boolean var20 = var1.isEmpty();
    exercise03.RingBuffer var22 = new exercise03.RingBuffer(100);
    var22.enqueue((java.lang.Object)1);
    boolean var25 = var22.isEmpty();
    exercise03.RingBuffer var27 = new exercise03.RingBuffer(100);
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    java.util.Spliterator var30 = var27.spliterator();
    var22.enqueue((java.lang.Object)var27);
    var1.enqueue((java.lang.Object)var22);
    boolean var33 = var1.isEmpty();
    java.lang.Object var34 = var1.dequeue();
    java.util.Spliterator var35 = var1.spliterator();
    exercise03.RingBuffer var37 = new exercise03.RingBuffer(100);
    int var38 = var37.size();
    var1.enqueue((java.lang.Object)var37);
    exercise03.RingBuffer var41 = new exercise03.RingBuffer(100);
    boolean var42 = var41.isEmpty();
    boolean var43 = var41.isEmpty();
    boolean var44 = var41.isEmpty();
    var41.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var47 = var41.spliterator();
    java.lang.Object var48 = var41.dequeue();
    java.util.Spliterator var49 = var41.spliterator();
    exercise03.RingBuffer var51 = new exercise03.RingBuffer(100);
    boolean var52 = var51.isEmpty();
    boolean var53 = var51.isEmpty();
    boolean var54 = var51.isEmpty();
    var51.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var57 = var51.spliterator();
    java.util.Spliterator var58 = var51.spliterator();
    var41.enqueue((java.lang.Object)var58);
    boolean var60 = var41.isEmpty();
    java.lang.Object var61 = var41.dequeue();
    var37.enqueue((java.lang.Object)var41);
    exercise03.RingBuffer var64 = new exercise03.RingBuffer(100);
    boolean var65 = var64.isEmpty();
    boolean var66 = var64.isEmpty();
    boolean var67 = var64.isEmpty();
    var64.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var70 = var64.spliterator();
    exercise03.RingBuffer var72 = new exercise03.RingBuffer(100);
    boolean var73 = var72.isEmpty();
    boolean var74 = var72.isEmpty();
    boolean var75 = var72.isEmpty();
    var72.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var78 = var72.spliterator();
    var72.enqueue((java.lang.Object)100L);
    java.lang.Object var81 = var72.dequeue();
    var64.enqueue(var81);
    exercise03.RingBuffer var84 = new exercise03.RingBuffer(100);
    boolean var85 = var84.isEmpty();
    boolean var86 = var84.isEmpty();
    boolean var87 = var84.isEmpty();
    var84.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var90 = var84.spliterator();
    boolean var91 = var84.isEmpty();
    int var92 = var84.size();
    java.lang.Object var93 = var84.dequeue();
    var64.enqueue((java.lang.Object)var84);
    boolean var95 = var64.isEmpty();
    java.util.Spliterator var96 = var64.spliterator();
    var41.enqueue((java.lang.Object)var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + (-1.0d)+ "'", var48.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var78);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + (-1.0d)+ "'", var81.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var93 + "' != '" + (-1.0d)+ "'", var93.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var96);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test322");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    int var9 = var1.size();
    java.util.Spliterator var10 = var1.spliterator();
    java.util.Spliterator var11 = var1.spliterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Spliterator var20 = var13.spliterator();
    java.util.Spliterator var21 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    boolean var23 = var13.isEmpty();
    exercise03.RingBuffer var25 = new exercise03.RingBuffer(100);
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    boolean var28 = var25.isEmpty();
    var25.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var31 = var25.spliterator();
    boolean var32 = var25.isEmpty();
    exercise03.RingBuffer var34 = new exercise03.RingBuffer(100);
    boolean var35 = var34.isEmpty();
    boolean var36 = var34.isEmpty();
    boolean var37 = var34.isEmpty();
    var34.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var40 = var34.spliterator();
    java.util.Iterator var41 = var34.iterator();
    var25.enqueue((java.lang.Object)var34);
    java.util.Spliterator var43 = var34.spliterator();
    exercise03.RingBuffer var45 = new exercise03.RingBuffer(100);
    var34.enqueue((java.lang.Object)var45);
    int var47 = var45.size();
    var13.enqueue((java.lang.Object)var45);
    int var49 = var13.size();
    exercise03.RingBuffer var51 = new exercise03.RingBuffer(100);
    var51.enqueue((java.lang.Object)1);
    java.util.Spliterator var54 = var51.spliterator();
    var13.enqueue((java.lang.Object)var54);
    exercise03.RingBuffer var57 = new exercise03.RingBuffer(100);
    boolean var58 = var57.isEmpty();
    exercise03.RingBuffer var60 = new exercise03.RingBuffer(100);
    boolean var61 = var60.isEmpty();
    boolean var62 = var60.isEmpty();
    boolean var63 = var60.isEmpty();
    var60.enqueue((java.lang.Object)(short)0);
    java.lang.Object var66 = var60.dequeue();
    java.util.Spliterator var67 = var60.spliterator();
    var57.enqueue((java.lang.Object)var67);
    java.lang.Object var69 = var57.dequeue();
    var13.enqueue((java.lang.Object)var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + (short)0+ "'", var66.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var69);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test323");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var10.iterator();
    exercise03.RingBuffer var25 = new exercise03.RingBuffer(2);
    java.util.Iterator var26 = var25.iterator();
    java.util.Iterator var27 = var25.iterator();
    var10.enqueue((java.lang.Object)var27);
    exercise03.RingBuffer var30 = new exercise03.RingBuffer(100);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    boolean var33 = var30.isEmpty();
    var30.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var36 = var30.dequeue();
    java.util.Spliterator var37 = var30.spliterator();
    var10.enqueue((java.lang.Object)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + (-1.0d)+ "'", var36.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test324");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    java.util.Spliterator var9 = var1.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    java.util.Spliterator var18 = var11.spliterator();
    var1.enqueue((java.lang.Object)var18);
    boolean var20 = var1.isEmpty();
    java.util.Iterator var21 = var1.iterator();
    java.lang.Object var22 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test325");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    int var9 = var1.size();
    java.util.Spliterator var10 = var1.spliterator();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test326");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    exercise03.RingBuffer var6 = new exercise03.RingBuffer(100);
    java.util.Iterator var7 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    boolean var13 = var10.isEmpty();
    exercise03.RingBuffer var15 = new exercise03.RingBuffer(100);
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    java.util.Spliterator var18 = var15.spliterator();
    var10.enqueue((java.lang.Object)var15);
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var21 = var1.dequeue();
    java.lang.Object var22 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test327");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)0);
    java.lang.Object var4 = var1.dequeue();
    java.util.Spliterator var5 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0+ "'", var4.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test328");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test329");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    int var9 = var1.size();
    java.util.Spliterator var10 = var1.spliterator();
    java.util.Spliterator var11 = var1.spliterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Spliterator var20 = var13.spliterator();
    java.util.Spliterator var21 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    boolean var23 = var13.isEmpty();
    exercise03.RingBuffer var25 = new exercise03.RingBuffer(100);
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    boolean var28 = var25.isEmpty();
    var25.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var31 = var25.spliterator();
    boolean var32 = var25.isEmpty();
    exercise03.RingBuffer var34 = new exercise03.RingBuffer(100);
    boolean var35 = var34.isEmpty();
    boolean var36 = var34.isEmpty();
    boolean var37 = var34.isEmpty();
    var34.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var40 = var34.spliterator();
    java.util.Iterator var41 = var34.iterator();
    var25.enqueue((java.lang.Object)var34);
    java.util.Spliterator var43 = var34.spliterator();
    exercise03.RingBuffer var45 = new exercise03.RingBuffer(100);
    var34.enqueue((java.lang.Object)var45);
    int var47 = var45.size();
    var13.enqueue((java.lang.Object)var45);
    int var49 = var13.size();
    exercise03.RingBuffer var51 = new exercise03.RingBuffer(100);
    var51.enqueue((java.lang.Object)1);
    java.util.Spliterator var54 = var51.spliterator();
    var13.enqueue((java.lang.Object)var54);
    boolean var56 = var13.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test330");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var21.iterator();
    exercise03.RingBuffer var25 = new exercise03.RingBuffer(100);
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    boolean var28 = var25.isEmpty();
    var25.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var31 = var25.spliterator();
    boolean var32 = var25.isEmpty();
    exercise03.RingBuffer var34 = new exercise03.RingBuffer(100);
    boolean var35 = var34.isEmpty();
    boolean var36 = var34.isEmpty();
    boolean var37 = var34.isEmpty();
    var34.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var40 = var34.spliterator();
    java.util.Iterator var41 = var34.iterator();
    var25.enqueue((java.lang.Object)var34);
    java.util.Spliterator var43 = var34.spliterator();
    exercise03.RingBuffer var45 = new exercise03.RingBuffer(100);
    var34.enqueue((java.lang.Object)var45);
    java.util.Iterator var47 = var34.iterator();
    java.util.Iterator var48 = var34.iterator();
    var21.enqueue((java.lang.Object)var34);
    java.util.Iterator var50 = var21.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test331");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    int var9 = var1.size();
    java.util.Spliterator var10 = var1.spliterator();
    java.util.Spliterator var11 = var1.spliterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    java.util.Spliterator var20 = var13.spliterator();
    java.util.Spliterator var21 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    boolean var23 = var13.isEmpty();
    exercise03.RingBuffer var25 = new exercise03.RingBuffer(100);
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    boolean var28 = var25.isEmpty();
    var25.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var31 = var25.spliterator();
    boolean var32 = var25.isEmpty();
    exercise03.RingBuffer var34 = new exercise03.RingBuffer(100);
    boolean var35 = var34.isEmpty();
    boolean var36 = var34.isEmpty();
    boolean var37 = var34.isEmpty();
    var34.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var40 = var34.spliterator();
    java.util.Iterator var41 = var34.iterator();
    var25.enqueue((java.lang.Object)var34);
    java.util.Spliterator var43 = var34.spliterator();
    exercise03.RingBuffer var45 = new exercise03.RingBuffer(100);
    var34.enqueue((java.lang.Object)var45);
    int var47 = var45.size();
    var13.enqueue((java.lang.Object)var45);
    java.util.Spliterator var49 = var13.spliterator();
    exercise03.RingBuffer var51 = new exercise03.RingBuffer(100);
    boolean var52 = var51.isEmpty();
    boolean var53 = var51.isEmpty();
    boolean var54 = var51.isEmpty();
    var51.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var57 = var51.spliterator();
    java.util.Spliterator var58 = var51.spliterator();
    java.util.Spliterator var59 = var51.spliterator();
    int var60 = var51.size();
    java.util.Iterator var61 = var51.iterator();
    var13.enqueue((java.lang.Object)var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test332");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    exercise03.RingBuffer var12 = new exercise03.RingBuffer(100);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    var12.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var18 = var12.spliterator();
    boolean var19 = var12.isEmpty();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    boolean var24 = var21.isEmpty();
    var21.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var27 = var21.spliterator();
    java.util.Iterator var28 = var21.iterator();
    var12.enqueue((java.lang.Object)var21);
    java.util.Spliterator var30 = var21.spliterator();
    var1.enqueue((java.lang.Object)var21);
    int var32 = var21.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test333");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    java.util.Iterator var13 = var8.iterator();
    java.util.Iterator var14 = var8.iterator();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var22 = var16.spliterator();
    var16.enqueue((java.lang.Object)100L);
    java.lang.Object var25 = var16.dequeue();
    var16.enqueue((java.lang.Object)"");
    java.util.Iterator var28 = var16.iterator();
    var8.enqueue((java.lang.Object)var28);
    java.lang.Object var30 = var8.dequeue();
    java.lang.Object var31 = var8.dequeue();
    int var32 = var8.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + (-1.0d)+ "'", var25.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + 1+ "'", var30.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test334");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    int var19 = var1.size();
    java.util.Spliterator var20 = var1.spliterator();
    int var21 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 2);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test335");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    var8.enqueue((java.lang.Object)10.0f);
    java.lang.Object var15 = var8.dequeue();
    java.util.Spliterator var16 = var8.spliterator();
    exercise03.RingBuffer var18 = new exercise03.RingBuffer(100);
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    boolean var21 = var18.isEmpty();
    var18.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var25 = new exercise03.RingBuffer(100);
    var25.enqueue((java.lang.Object)1);
    int var28 = var25.size();
    var18.enqueue((java.lang.Object)var25);
    var25.enqueue((java.lang.Object)10.0f);
    exercise03.RingBuffer var33 = new exercise03.RingBuffer(100);
    java.util.Iterator var34 = var33.iterator();
    java.util.Spliterator var35 = var33.spliterator();
    boolean var36 = var33.isEmpty();
    var25.enqueue((java.lang.Object)var33);
    var8.enqueue((java.lang.Object)var25);
    java.util.Spliterator var39 = var25.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 1+ "'", var15.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test336");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    java.util.Iterator var13 = var8.iterator();
    java.util.Iterator var14 = var8.iterator();
    java.util.Spliterator var15 = var8.spliterator();
    exercise03.RingBuffer var17 = new exercise03.RingBuffer(100);
    var17.enqueue((java.lang.Object)1);
    java.util.Spliterator var20 = var17.spliterator();
    var8.enqueue((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test337");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    java.util.Spliterator var9 = var1.spliterator();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    java.util.Spliterator var18 = var11.spliterator();
    var1.enqueue((java.lang.Object)var18);
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    boolean var24 = var21.isEmpty();
    var21.enqueue((java.lang.Object)(short)0);
    boolean var27 = var21.isEmpty();
    boolean var28 = var21.isEmpty();
    java.lang.Object var29 = var21.dequeue();
    java.util.Iterator var30 = var21.iterator();
    var1.enqueue((java.lang.Object)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + (short)0+ "'", var29.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test338");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)1);
    var1.enqueue((java.lang.Object)1);
    java.util.Spliterator var14 = var1.spliterator();
    java.lang.Object var15 = var1.dequeue();
    int var16 = var1.size();
    boolean var17 = var1.isEmpty();
    java.lang.Object var18 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + (-1.0d)+ "'", var15.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 1+ "'", var18.equals(1));

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test339");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    boolean var7 = var1.isEmpty();
    exercise03.RingBuffer var9 = new exercise03.RingBuffer(100);
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    var9.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var15 = var9.spliterator();
    java.util.Spliterator var16 = var9.spliterator();
    java.lang.Object var17 = var9.dequeue();
    var1.enqueue((java.lang.Object)var9);
    int var19 = var9.size();
    boolean var20 = var9.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + (-1.0d)+ "'", var17.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test340");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var10.iterator();
    var10.enqueue((java.lang.Object)0L);
    java.util.Spliterator var26 = var10.spliterator();
    java.lang.Object var27 = var10.dequeue();
    exercise03.RingBuffer var29 = new exercise03.RingBuffer(100);
    boolean var30 = var29.isEmpty();
    boolean var31 = var29.isEmpty();
    boolean var32 = var29.isEmpty();
    var29.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var35 = var29.spliterator();
    boolean var36 = var29.isEmpty();
    exercise03.RingBuffer var38 = new exercise03.RingBuffer(100);
    boolean var39 = var38.isEmpty();
    boolean var40 = var38.isEmpty();
    boolean var41 = var38.isEmpty();
    var38.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var44 = var38.spliterator();
    java.util.Iterator var45 = var38.iterator();
    var29.enqueue((java.lang.Object)var38);
    java.lang.Object var47 = var29.dequeue();
    int var48 = var29.size();
    java.lang.Object var49 = var29.dequeue();
    exercise03.RingBuffer var51 = new exercise03.RingBuffer(100);
    boolean var52 = var51.isEmpty();
    boolean var53 = var51.isEmpty();
    boolean var54 = var51.isEmpty();
    var51.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var57 = var51.spliterator();
    boolean var58 = var51.isEmpty();
    boolean var59 = var51.isEmpty();
    int var60 = var51.size();
    java.util.Iterator var61 = var51.iterator();
    var29.enqueue((java.lang.Object)var51);
    java.lang.Object var63 = var29.dequeue();
    var10.enqueue(var63);
    java.lang.Object var65 = var10.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + (-1.0d)+ "'", var27.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + (-1.0d)+ "'", var47.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test341");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Spliterator var23 = var21.spliterator();
    java.util.Spliterator var24 = var21.spliterator();
    var21.enqueue((java.lang.Object)10L);
    boolean var27 = var21.isEmpty();
    java.util.Spliterator var28 = var21.spliterator();
    java.lang.Object var29 = var21.dequeue();
    exercise03.RingBuffer var31 = new exercise03.RingBuffer(100);
    var31.enqueue((java.lang.Object)1);
    java.util.Iterator var34 = var31.iterator();
    java.util.Iterator var35 = var31.iterator();
    boolean var36 = var31.isEmpty();
    exercise03.RingBuffer var38 = new exercise03.RingBuffer(100);
    boolean var39 = var38.isEmpty();
    boolean var40 = var38.isEmpty();
    boolean var41 = var38.isEmpty();
    var38.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var44 = var38.spliterator();
    boolean var45 = var38.isEmpty();
    exercise03.RingBuffer var47 = new exercise03.RingBuffer(100);
    boolean var48 = var47.isEmpty();
    boolean var49 = var47.isEmpty();
    boolean var50 = var47.isEmpty();
    var47.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var53 = var47.spliterator();
    java.util.Iterator var54 = var47.iterator();
    var38.enqueue((java.lang.Object)var47);
    java.lang.Object var56 = var38.dequeue();
    int var57 = var38.size();
    java.lang.Object var58 = var38.dequeue();
    var31.enqueue(var58);
    var21.enqueue((java.lang.Object)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + 10L+ "'", var29.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + (-1.0d)+ "'", var56.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test342");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise03.RingBuffer var7 = new exercise03.RingBuffer(100);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    boolean var10 = var7.isEmpty();
    var7.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var13 = var7.spliterator();
    boolean var14 = var7.isEmpty();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var22 = var16.spliterator();
    java.util.Iterator var23 = var16.iterator();
    var7.enqueue((java.lang.Object)var16);
    java.lang.Object var25 = var7.dequeue();
    var1.enqueue((java.lang.Object)var7);
    boolean var27 = var7.isEmpty();
    exercise03.RingBuffer var29 = new exercise03.RingBuffer(100);
    boolean var30 = var29.isEmpty();
    boolean var31 = var29.isEmpty();
    boolean var32 = var29.isEmpty();
    var29.enqueue((java.lang.Object)(-1.0d));
    java.util.Iterator var35 = var29.iterator();
    boolean var36 = var29.isEmpty();
    boolean var37 = var29.isEmpty();
    var7.enqueue((java.lang.Object)var29);
    boolean var39 = var7.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + (-1.0d)+ "'", var25.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test343");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    int var9 = var1.size();
    java.util.Iterator var10 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test344");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    var8.enqueue((java.lang.Object)10.0f);
    java.lang.Object var15 = var8.dequeue();
    java.util.Spliterator var16 = var8.spliterator();
    java.util.Iterator var17 = var8.iterator();
    int var18 = var8.size();
    boolean var19 = var8.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 1+ "'", var15.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test345");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    java.util.Iterator var13 = var8.iterator();
    java.util.Iterator var14 = var8.iterator();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var22 = var16.spliterator();
    var16.enqueue((java.lang.Object)100L);
    java.lang.Object var25 = var16.dequeue();
    var16.enqueue((java.lang.Object)"");
    java.util.Iterator var28 = var16.iterator();
    var8.enqueue((java.lang.Object)var28);
    java.util.Iterator var30 = var8.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + (-1.0d)+ "'", var25.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test346");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    var8.enqueue((java.lang.Object)1);
    int var11 = var8.size();
    var1.enqueue((java.lang.Object)var8);
    java.util.Iterator var13 = var8.iterator();
    java.lang.Object var14 = var8.dequeue();
    boolean var15 = var8.isEmpty();
    int var16 = var8.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 1+ "'", var14.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test347");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    java.util.Iterator var2 = var1.iterator();
    java.util.Spliterator var3 = var1.spliterator();
    boolean var4 = var1.isEmpty();
    exercise03.RingBuffer var6 = new exercise03.RingBuffer(100);
    java.util.Iterator var7 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var6.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test348");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Spliterator var8 = var1.spliterator();
    java.lang.Object var9 = var1.dequeue();
    boolean var10 = var1.isEmpty();
    java.util.Iterator var11 = var1.iterator();
    boolean var12 = var1.isEmpty();
    java.util.Spliterator var13 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0d)+ "'", var9.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test349");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var19 = var1.dequeue();
    int var20 = var1.size();
    java.lang.Object var21 = var1.dequeue();
    java.util.Spliterator var22 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test350");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    int var10 = var1.size();
    int var11 = var1.size();
    java.lang.Object var12 = var1.dequeue();
    exercise03.RingBuffer var14 = new exercise03.RingBuffer(100);
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    boolean var17 = var14.isEmpty();
    var14.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var20 = var14.spliterator();
    var14.enqueue((java.lang.Object)100L);
    java.lang.Object var23 = var14.dequeue();
    var14.enqueue((java.lang.Object)"");
    java.util.Iterator var26 = var14.iterator();
    var1.enqueue((java.lang.Object)var26);
    exercise03.RingBuffer var29 = new exercise03.RingBuffer(100);
    boolean var30 = var29.isEmpty();
    boolean var31 = var29.isEmpty();
    boolean var32 = var29.isEmpty();
    var29.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var35 = var29.spliterator();
    boolean var36 = var29.isEmpty();
    exercise03.RingBuffer var38 = new exercise03.RingBuffer(100);
    boolean var39 = var38.isEmpty();
    boolean var40 = var38.isEmpty();
    boolean var41 = var38.isEmpty();
    var38.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var44 = var38.spliterator();
    java.util.Iterator var45 = var38.iterator();
    var29.enqueue((java.lang.Object)var38);
    java.util.Spliterator var47 = var38.spliterator();
    exercise03.RingBuffer var49 = new exercise03.RingBuffer(100);
    var38.enqueue((java.lang.Object)var49);
    java.util.Spliterator var51 = var49.spliterator();
    int var52 = var49.size();
    java.util.Spliterator var53 = var49.spliterator();
    int var54 = var49.size();
    int var55 = var49.size();
    var1.enqueue((java.lang.Object)var49);
    boolean var57 = var49.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (-1.0d)+ "'", var12.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + (-1.0d)+ "'", var23.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test351");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    java.util.Iterator var11 = var1.iterator();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var19 = var13.spliterator();
    var13.enqueue((java.lang.Object)100L);
    java.lang.Object var22 = var13.dequeue();
    java.util.Iterator var23 = var13.iterator();
    java.util.Spliterator var24 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    java.lang.Object var26 = var1.dequeue();
    exercise03.RingBuffer var28 = new exercise03.RingBuffer(100);
    exercise03.RingBuffer var30 = new exercise03.RingBuffer(100);
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    boolean var33 = var30.isEmpty();
    var30.enqueue((java.lang.Object)(short)0);
    boolean var36 = var30.isEmpty();
    java.util.Iterator var37 = var30.iterator();
    java.lang.Object var38 = var30.dequeue();
    java.util.Spliterator var39 = var30.spliterator();
    int var40 = var30.size();
    var28.enqueue((java.lang.Object)var40);
    java.util.Iterator var42 = var28.iterator();
    var1.enqueue((java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + (-1.0d)+ "'", var22.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + 100L+ "'", var26.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + (short)0+ "'", var38.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test352");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    java.util.Iterator var11 = var1.iterator();
    java.lang.Object var12 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var1.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 100L+ "'", var12.equals(100L));

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test353");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    exercise03.RingBuffer var12 = new exercise03.RingBuffer(100);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    var12.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var18 = var12.spliterator();
    boolean var19 = var12.isEmpty();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    boolean var24 = var21.isEmpty();
    var21.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var27 = var21.spliterator();
    java.util.Iterator var28 = var21.iterator();
    var12.enqueue((java.lang.Object)var21);
    java.util.Spliterator var30 = var21.spliterator();
    var1.enqueue((java.lang.Object)var21);
    java.util.Iterator var32 = var21.iterator();
    int var33 = var21.size();
    boolean var34 = var21.isEmpty();
    java.util.Spliterator var35 = var21.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test354");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer var3 = new exercise03.RingBuffer(100);
    boolean var4 = var3.isEmpty();
    boolean var5 = var3.isEmpty();
    boolean var6 = var3.isEmpty();
    var3.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var9 = var3.spliterator();
    boolean var10 = var3.isEmpty();
    exercise03.RingBuffer var12 = new exercise03.RingBuffer(100);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    var12.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var18 = var12.spliterator();
    java.util.Iterator var19 = var12.iterator();
    var3.enqueue((java.lang.Object)var12);
    java.util.Spliterator var21 = var12.spliterator();
    exercise03.RingBuffer var23 = new exercise03.RingBuffer(100);
    var12.enqueue((java.lang.Object)var23);
    java.util.Iterator var25 = var23.iterator();
    int var26 = var23.size();
    exercise03.RingBuffer var28 = new exercise03.RingBuffer(100);
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    boolean var31 = var28.isEmpty();
    var28.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var34 = var28.spliterator();
    boolean var35 = var28.isEmpty();
    exercise03.RingBuffer var37 = new exercise03.RingBuffer(100);
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    boolean var40 = var37.isEmpty();
    var37.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var43 = var37.spliterator();
    java.util.Iterator var44 = var37.iterator();
    var28.enqueue((java.lang.Object)var37);
    java.lang.Object var46 = var28.dequeue();
    int var47 = var28.size();
    java.lang.Object var48 = var28.dequeue();
    var23.enqueue((java.lang.Object)var28);
    exercise03.RingBuffer var51 = new exercise03.RingBuffer(100);
    var51.enqueue((java.lang.Object)1);
    java.util.Iterator var54 = var51.iterator();
    var28.enqueue((java.lang.Object)var54);
    var1.enqueue((java.lang.Object)var54);
    boolean var57 = var1.isEmpty();
    boolean var58 = var1.isEmpty();
    boolean var59 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + (-1.0d)+ "'", var46.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test355");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    int var4 = var1.size();
    exercise03.RingBuffer var6 = new exercise03.RingBuffer(100);
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    var6.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var12 = var6.spliterator();
    var6.enqueue((java.lang.Object)100L);
    int var15 = var6.size();
    var1.enqueue((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test356");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Iterator var23 = var21.iterator();
    int var24 = var21.size();
    exercise03.RingBuffer var26 = new exercise03.RingBuffer(100);
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    boolean var29 = var26.isEmpty();
    var26.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var32 = var26.spliterator();
    boolean var33 = var26.isEmpty();
    exercise03.RingBuffer var35 = new exercise03.RingBuffer(100);
    boolean var36 = var35.isEmpty();
    boolean var37 = var35.isEmpty();
    boolean var38 = var35.isEmpty();
    var35.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var41 = var35.spliterator();
    java.util.Iterator var42 = var35.iterator();
    var26.enqueue((java.lang.Object)var35);
    java.lang.Object var44 = var26.dequeue();
    int var45 = var26.size();
    java.lang.Object var46 = var26.dequeue();
    var21.enqueue((java.lang.Object)var26);
    exercise03.RingBuffer var49 = new exercise03.RingBuffer(100);
    var49.enqueue((java.lang.Object)1);
    java.util.Iterator var52 = var49.iterator();
    var26.enqueue((java.lang.Object)var52);
    java.util.Iterator var54 = var26.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + (-1.0d)+ "'", var44.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test357");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    java.util.Spliterator var11 = var1.spliterator();
    java.util.Spliterator var12 = var1.spliterator();
    java.util.Spliterator var13 = var1.spliterator();
    int var14 = var1.size();
    java.lang.Object var15 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 100L+ "'", var15.equals(100L));

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test358");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.util.Spliterator var10 = var1.spliterator();
    java.util.Spliterator var11 = var1.spliterator();
    java.util.Spliterator var12 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test359");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    boolean var4 = var1.isEmpty();
    exercise03.RingBuffer var6 = new exercise03.RingBuffer(100);
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    java.util.Spliterator var9 = var6.spliterator();
    var1.enqueue((java.lang.Object)var6);
    int var11 = var1.size();
    java.util.Iterator var12 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test360");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)0.0f);
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(short)0);
    exercise03.RingBuffer var18 = new exercise03.RingBuffer(100);
    var18.enqueue((java.lang.Object)1);
    int var21 = var18.size();
    var11.enqueue((java.lang.Object)var18);
    var18.enqueue((java.lang.Object)10.0f);
    java.lang.Object var25 = var18.dequeue();
    var1.enqueue(var25);
    java.util.Spliterator var27 = var1.spliterator();
    boolean var28 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + 1+ "'", var25.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test361");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    int var4 = var1.size();
    int var5 = var1.size();
    exercise03.RingBuffer var7 = new exercise03.RingBuffer(100);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    boolean var10 = var7.isEmpty();
    var7.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var13 = var7.spliterator();
    boolean var14 = var7.isEmpty();
    boolean var15 = var7.isEmpty();
    int var16 = var7.size();
    java.util.Iterator var17 = var7.iterator();
    java.lang.Object var18 = var7.dequeue();
    var1.enqueue((java.lang.Object)var7);
    java.lang.Object var20 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + (-1.0d)+ "'", var18.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 1+ "'", var20.equals(1));

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test362");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Spliterator var8 = var1.spliterator();
    int var9 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test363");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    exercise03.RingBuffer var8 = new exercise03.RingBuffer(100);
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    boolean var11 = var8.isEmpty();
    var8.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var14 = var8.spliterator();
    boolean var15 = var8.isEmpty();
    exercise03.RingBuffer var17 = new exercise03.RingBuffer(100);
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    boolean var20 = var17.isEmpty();
    var17.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var23 = var17.spliterator();
    java.util.Iterator var24 = var17.iterator();
    var8.enqueue((java.lang.Object)var17);
    java.lang.Object var26 = var8.dequeue();
    int var27 = var8.size();
    java.lang.Object var28 = var8.dequeue();
    var1.enqueue(var28);
    java.util.Spliterator var30 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + (-1.0d)+ "'", var26.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test364");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)0);
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test365");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    exercise03.RingBuffer var12 = new exercise03.RingBuffer(100);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    var12.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var18 = var12.spliterator();
    boolean var19 = var12.isEmpty();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    boolean var24 = var21.isEmpty();
    var21.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var27 = var21.spliterator();
    java.util.Iterator var28 = var21.iterator();
    var12.enqueue((java.lang.Object)var21);
    java.util.Spliterator var30 = var21.spliterator();
    var1.enqueue((java.lang.Object)var21);
    exercise03.RingBuffer var33 = new exercise03.RingBuffer(100);
    boolean var34 = var33.isEmpty();
    boolean var35 = var33.isEmpty();
    boolean var36 = var33.isEmpty();
    var33.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var39 = var33.spliterator();
    java.util.Iterator var40 = var33.iterator();
    var1.enqueue((java.lang.Object)var33);
    exercise03.RingBuffer var43 = new exercise03.RingBuffer(100);
    boolean var44 = var43.isEmpty();
    boolean var45 = var43.isEmpty();
    boolean var46 = var43.isEmpty();
    var43.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var49 = var43.spliterator();
    boolean var50 = var43.isEmpty();
    exercise03.RingBuffer var52 = new exercise03.RingBuffer(100);
    boolean var53 = var52.isEmpty();
    boolean var54 = var52.isEmpty();
    boolean var55 = var52.isEmpty();
    var52.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var58 = var52.spliterator();
    java.util.Iterator var59 = var52.iterator();
    var43.enqueue((java.lang.Object)var52);
    java.util.Spliterator var61 = var52.spliterator();
    exercise03.RingBuffer var63 = new exercise03.RingBuffer(100);
    var52.enqueue((java.lang.Object)var63);
    int var65 = var63.size();
    var1.enqueue((java.lang.Object)var63);
    java.util.Spliterator var67 = var1.spliterator();
    java.util.Spliterator var68 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var67);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test366");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Spliterator var8 = var1.spliterator();
    java.lang.Object var9 = var1.dequeue();
    exercise03.RingBuffer var11 = new exercise03.RingBuffer(100);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var11.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var17 = var11.spliterator();
    java.util.Iterator var18 = var11.iterator();
    int var19 = var11.size();
    var1.enqueue((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0d)+ "'", var9.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test367");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    int var10 = var1.size();
    int var11 = var1.size();
    java.lang.Object var12 = var1.dequeue();
    boolean var13 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (-1.0d)+ "'", var12.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test368");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    java.lang.Object var10 = var1.dequeue();
    java.util.Iterator var11 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test369");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    java.util.Spliterator var4 = var1.spliterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    java.util.Spliterator var8 = var1.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test370");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    java.lang.Object var10 = var1.dequeue();
    int var11 = var1.size();
    exercise03.RingBuffer var13 = new exercise03.RingBuffer(100);
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    boolean var16 = var13.isEmpty();
    var13.enqueue((java.lang.Object)(-1.0d));
    java.util.Iterator var19 = var13.iterator();
    int var20 = var13.size();
    java.util.Spliterator var21 = var13.spliterator();
    var1.enqueue((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test371");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Spliterator var23 = var21.spliterator();
    java.util.Spliterator var24 = var21.spliterator();
    var21.enqueue((java.lang.Object)10L);
    boolean var27 = var21.isEmpty();
    java.util.Spliterator var28 = var21.spliterator();
    java.util.Spliterator var29 = var21.spliterator();
    java.lang.Object var30 = var21.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + 10L+ "'", var30.equals(10L));

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test372");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    java.util.Spliterator var11 = var1.spliterator();
    boolean var12 = var1.isEmpty();
    boolean var13 = var1.isEmpty();
    boolean var14 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test373");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    var1.enqueue((java.lang.Object)1);
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise03.RingBuffer var7 = new exercise03.RingBuffer(100);
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    boolean var10 = var7.isEmpty();
    var7.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var13 = var7.spliterator();
    boolean var14 = var7.isEmpty();
    exercise03.RingBuffer var16 = new exercise03.RingBuffer(100);
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var22 = var16.spliterator();
    java.util.Iterator var23 = var16.iterator();
    var7.enqueue((java.lang.Object)var16);
    java.lang.Object var25 = var7.dequeue();
    var1.enqueue((java.lang.Object)var7);
    java.util.Iterator var27 = var1.iterator();
    int var28 = var1.size();
    var1.enqueue((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + (-1.0d)+ "'", var25.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 2);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test374");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.util.Spliterator var23 = var21.spliterator();
    java.util.Spliterator var24 = var21.spliterator();
    java.util.Spliterator var25 = var21.spliterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test375");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    var10.enqueue((java.lang.Object)10);
    java.lang.Object var25 = var10.dequeue();
    java.lang.Object var26 = var10.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + (-1.0d)+ "'", var25.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test376");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer var3 = new exercise03.RingBuffer(100);
    boolean var4 = var3.isEmpty();
    boolean var5 = var3.isEmpty();
    boolean var6 = var3.isEmpty();
    var3.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var9 = var3.spliterator();
    boolean var10 = var3.isEmpty();
    exercise03.RingBuffer var12 = new exercise03.RingBuffer(100);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    var12.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var18 = var12.spliterator();
    java.util.Iterator var19 = var12.iterator();
    var3.enqueue((java.lang.Object)var12);
    java.util.Spliterator var21 = var12.spliterator();
    exercise03.RingBuffer var23 = new exercise03.RingBuffer(100);
    var12.enqueue((java.lang.Object)var23);
    java.util.Iterator var25 = var23.iterator();
    int var26 = var23.size();
    exercise03.RingBuffer var28 = new exercise03.RingBuffer(100);
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    boolean var31 = var28.isEmpty();
    var28.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var34 = var28.spliterator();
    boolean var35 = var28.isEmpty();
    exercise03.RingBuffer var37 = new exercise03.RingBuffer(100);
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    boolean var40 = var37.isEmpty();
    var37.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var43 = var37.spliterator();
    java.util.Iterator var44 = var37.iterator();
    var28.enqueue((java.lang.Object)var37);
    java.lang.Object var46 = var28.dequeue();
    int var47 = var28.size();
    java.lang.Object var48 = var28.dequeue();
    var23.enqueue((java.lang.Object)var28);
    exercise03.RingBuffer var51 = new exercise03.RingBuffer(100);
    var51.enqueue((java.lang.Object)1);
    java.util.Iterator var54 = var51.iterator();
    var28.enqueue((java.lang.Object)var54);
    var1.enqueue((java.lang.Object)var54);
    java.util.Spliterator var57 = var1.spliterator();
    java.lang.Object var58 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + (-1.0d)+ "'", var46.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test377");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(10);
    exercise03.RingBuffer var3 = new exercise03.RingBuffer(100);
    boolean var4 = var3.isEmpty();
    boolean var5 = var3.isEmpty();
    boolean var6 = var3.isEmpty();
    var3.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var9 = var3.spliterator();
    boolean var10 = var3.isEmpty();
    exercise03.RingBuffer var12 = new exercise03.RingBuffer(100);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    var12.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var18 = var12.spliterator();
    java.util.Iterator var19 = var12.iterator();
    var3.enqueue((java.lang.Object)var12);
    java.util.Spliterator var21 = var12.spliterator();
    exercise03.RingBuffer var23 = new exercise03.RingBuffer(100);
    var12.enqueue((java.lang.Object)var23);
    java.util.Iterator var25 = var23.iterator();
    int var26 = var23.size();
    exercise03.RingBuffer var28 = new exercise03.RingBuffer(100);
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    boolean var31 = var28.isEmpty();
    var28.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var34 = var28.spliterator();
    boolean var35 = var28.isEmpty();
    exercise03.RingBuffer var37 = new exercise03.RingBuffer(100);
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    boolean var40 = var37.isEmpty();
    var37.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var43 = var37.spliterator();
    java.util.Iterator var44 = var37.iterator();
    var28.enqueue((java.lang.Object)var37);
    java.lang.Object var46 = var28.dequeue();
    int var47 = var28.size();
    java.lang.Object var48 = var28.dequeue();
    var23.enqueue((java.lang.Object)var28);
    exercise03.RingBuffer var51 = new exercise03.RingBuffer(100);
    var51.enqueue((java.lang.Object)1);
    java.util.Iterator var54 = var51.iterator();
    var28.enqueue((java.lang.Object)var54);
    var1.enqueue((java.lang.Object)var54);
    java.util.Spliterator var57 = var1.spliterator();
    exercise03.RingBuffer var59 = new exercise03.RingBuffer(100);
    boolean var60 = var59.isEmpty();
    boolean var61 = var59.isEmpty();
    boolean var62 = var59.isEmpty();
    var59.enqueue((java.lang.Object)(-1.0d));
    java.util.Iterator var65 = var59.iterator();
    java.util.Iterator var66 = var59.iterator();
    var1.enqueue((java.lang.Object)var59);
    java.util.Iterator var68 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + (-1.0d)+ "'", var46.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test378");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    var1.enqueue((java.lang.Object)100L);
    java.lang.Object var10 = var1.dequeue();
    exercise03.RingBuffer var12 = new exercise03.RingBuffer(100);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    var12.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var18 = var12.spliterator();
    boolean var19 = var12.isEmpty();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    boolean var24 = var21.isEmpty();
    var21.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var27 = var21.spliterator();
    java.util.Iterator var28 = var21.iterator();
    var12.enqueue((java.lang.Object)var21);
    java.util.Spliterator var30 = var21.spliterator();
    var1.enqueue((java.lang.Object)var21);
    boolean var32 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test379");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.lang.Object var8 = var1.dequeue();
    int var9 = var1.size();
    java.util.Spliterator var10 = var1.spliterator();
    boolean var11 = var1.isEmpty();
    java.util.Spliterator var12 = var1.spliterator();
    java.util.Iterator var13 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0d)+ "'", var8.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test380");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    boolean var8 = var1.isEmpty();
    exercise03.RingBuffer var10 = new exercise03.RingBuffer(100);
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var16 = var10.spliterator();
    java.util.Iterator var17 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    java.util.Spliterator var19 = var10.spliterator();
    exercise03.RingBuffer var21 = new exercise03.RingBuffer(100);
    var10.enqueue((java.lang.Object)var21);
    java.lang.Object var23 = var10.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + (-1.0d)+ "'", var23.equals((-1.0d)));

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test381");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    exercise03.RingBuffer var3 = new exercise03.RingBuffer(100);
    boolean var4 = var3.isEmpty();
    boolean var5 = var3.isEmpty();
    boolean var6 = var3.isEmpty();
    var3.enqueue((java.lang.Object)(short)0);
    boolean var9 = var3.isEmpty();
    java.util.Iterator var10 = var3.iterator();
    java.lang.Object var11 = var3.dequeue();
    java.util.Spliterator var12 = var3.spliterator();
    int var13 = var3.size();
    var1.enqueue((java.lang.Object)var13);
    java.util.Iterator var15 = var1.iterator();
    boolean var16 = var1.isEmpty();
    boolean var17 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + (short)0+ "'", var11.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRingBufferTest0.test382");


    exercise03.RingBuffer var1 = new exercise03.RingBuffer(100);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    var1.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var7 = var1.spliterator();
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    java.lang.Object var10 = var1.dequeue();
    exercise03.RingBuffer var12 = new exercise03.RingBuffer(100);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    var12.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var18 = var12.spliterator();
    exercise03.RingBuffer var20 = new exercise03.RingBuffer(100);
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    boolean var23 = var20.isEmpty();
    var20.enqueue((java.lang.Object)(-1.0d));
    java.util.Spliterator var26 = var20.spliterator();
    var20.enqueue((java.lang.Object)100L);
    java.lang.Object var29 = var20.dequeue();
    var12.enqueue(var29);
    var1.enqueue((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + (-1.0d)+ "'", var29.equals((-1.0d)));

  }

}
