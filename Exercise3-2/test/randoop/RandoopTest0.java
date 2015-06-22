package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var1 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    var0.enqueue((java.lang.Object)"hi!");
    java.lang.Object var6 = var0.dequeue();
    int var7 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    int var8 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    int var4 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var8 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    boolean var9 = var8.isEmpty();
    var8.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var12 = var8.dequeue();
    boolean var13 = var8.isEmpty();
    int var14 = var8.size();
    boolean var15 = var8.isEmpty();
    var0.enqueue((java.lang.Object)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var8.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (-1.0d)+ "'", var12.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    boolean var13 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)100+ "'", var7.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    int var7 = var0.size();
    boolean var8 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10L);
    java.lang.Object var4 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10L+ "'", var4.equals(10L));

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    boolean var13 = var0.isEmpty();
    int var14 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    int var26 = var19.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var27 = var19.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    boolean var12 = var6.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var6.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    int var3 = var0.size();
    boolean var4 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    var0.enqueue((java.lang.Object)"hi!");
    java.lang.Object var6 = var0.dequeue();
    int var7 = var0.size();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    var0.enqueue((java.lang.Object)var10);
    java.lang.Object var12 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + true+ "'", var12.equals(true));

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    boolean var9 = var8.isEmpty();
    var8.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var12 = var8.dequeue();
    boolean var13 = var8.isEmpty();
    int var14 = var8.size();
    boolean var15 = var8.isEmpty();
    var0.enqueue((java.lang.Object)var8);
    int var17 = var8.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var18 = var8.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (-1.0d)+ "'", var12.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    int var5 = var0.size();
    boolean var6 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    var0.enqueue((java.lang.Object)"hi!");
    java.lang.Object var6 = var0.dequeue();
    int var7 = var0.size();
    boolean var8 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)1.0d);
    java.lang.Object var7 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1.0d+ "'", var7.equals(1.0d));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    int var5 = var0.size();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    int var2 = var0.size();
    int var3 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    int var4 = var0.size();
    int var5 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    boolean var26 = var19.isEmpty();
    boolean var27 = var19.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var28 = var19.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    int var9 = var0.size();
    int var10 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var8 = var0.dequeue();
    boolean var9 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var8 = var0.dequeue();
    int var9 = var0.size();
    var0.enqueue((java.lang.Object)(byte)1);
    java.lang.Object var12 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (byte)1+ "'", var12.equals((byte)1));

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    int var5 = var0.size();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    int var3 = var0.size();
    boolean var4 = var0.isEmpty();
    int var5 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    int var2 = var0.size();
    int var3 = var0.size();
    boolean var4 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    int var4 = var0.size();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    var5.enqueue((java.lang.Object)'a');
    java.lang.Object var8 = var5.dequeue();
    var5.enqueue((java.lang.Object)"hi!");
    var0.enqueue((java.lang.Object)var5);
    java.lang.Object var12 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 'a'+ "'", var8.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    int var9 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    int var7 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    int var2 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    boolean var9 = var8.isEmpty();
    var8.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var12 = var8.dequeue();
    boolean var13 = var8.isEmpty();
    int var14 = var8.size();
    boolean var15 = var8.isEmpty();
    var0.enqueue((java.lang.Object)var8);
    int var17 = var8.size();
    boolean var18 = var8.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var19 = var8.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (-1.0d)+ "'", var12.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    int var7 = var0.size();
    int var8 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    int var13 = var0.size();
    boolean var14 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    int var5 = var0.size();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    int var11 = var6.size();
    boolean var12 = var6.isEmpty();
    int var13 = var6.size();
    int var14 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var6.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    int var13 = var0.size();
    int var14 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    var6.enqueue((java.lang.Object)'a');
    java.lang.Object var9 = var6.dequeue();
    var6.enqueue((java.lang.Object)"hi!");
    java.lang.Object var12 = var6.dequeue();
    int var13 = var6.size();
    boolean var14 = var6.isEmpty();
    var0.enqueue((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 'a'+ "'", var9.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    int var7 = var0.size();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    int var9 = var8.size();
    var8.enqueue((java.lang.Object)10L);
    var0.enqueue((java.lang.Object)10L);
    java.lang.Object var13 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10L+ "'", var13.equals(10L));

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    int var7 = var0.size();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    int var10 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    var0.enqueue((java.lang.Object)"hi!");
    java.lang.Object var6 = var0.dequeue();
    int var7 = var0.size();
    int var8 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    int var3 = var0.size();
    int var4 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    int var12 = var6.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var6.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    var0.enqueue((java.lang.Object)100.0f);
    java.lang.Object var7 = var0.dequeue();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    var8.enqueue((java.lang.Object)'a');
    java.lang.Object var11 = var8.dequeue();
    var8.enqueue((java.lang.Object)"hi!");
    java.lang.Object var14 = var8.dequeue();
    int var15 = var8.size();
    exercise03.RingBufferWrapper var16 = new exercise03.RingBufferWrapper();
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    var8.enqueue((java.lang.Object)var18);
    java.lang.Object var20 = var8.dequeue();
    var0.enqueue(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 100.0f+ "'", var7.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 'a'+ "'", var11.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + true+ "'", var20.equals(true));

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    boolean var12 = var6.isEmpty();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    var13.enqueue((java.lang.Object)10.0f);
    java.lang.Object var18 = var13.dequeue();
    var13.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var21 = var13.dequeue();
    int var22 = var13.size();
    var6.enqueue((java.lang.Object)var22);
    java.lang.Object var24 = var6.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 10.0f+ "'", var18.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + (-1.0f)+ "'", var21.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + 0+ "'", var24.equals(0));

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    int var2 = var0.size();
    int var3 = var0.size();
    int var4 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var4 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (short)10+ "'", var4.equals((short)10));

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    boolean var4 = var0.isEmpty();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    var5.enqueue((java.lang.Object)'a');
    java.lang.Object var8 = var5.dequeue();
    var0.enqueue((java.lang.Object)var5);
    java.lang.Object var10 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 'a'+ "'", var8.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    boolean var12 = var6.isEmpty();
    boolean var13 = var6.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var6.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10L);
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var0.dequeue();
    exercise03.RingBufferWrapper var15 = new exercise03.RingBufferWrapper();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    boolean var18 = var15.isEmpty();
    int var19 = var15.size();
    int var20 = var15.size();
    boolean var21 = var15.isEmpty();
    boolean var22 = var15.isEmpty();
    var0.enqueue((java.lang.Object)var15);
    boolean var24 = var15.isEmpty();
    int var25 = var15.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var26 = var15.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10L+ "'", var4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)10+ "'", var7.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0+ "'", var14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    int var13 = var0.size();
    int var14 = var0.size();
    boolean var15 = var0.isEmpty();
    boolean var16 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10L);
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var0.dequeue();
    boolean var15 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10L+ "'", var4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)10+ "'", var7.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0+ "'", var14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    boolean var26 = var19.isEmpty();
    exercise03.RingBufferWrapper var27 = new exercise03.RingBufferWrapper();
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    var27.enqueue((java.lang.Object)10.0f);
    java.lang.Object var32 = var27.dequeue();
    boolean var33 = var27.isEmpty();
    int var34 = var27.size();
    int var35 = var27.size();
    var19.enqueue((java.lang.Object)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var37 = var27.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + 10.0f+ "'", var32.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    int var9 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)100+ "'", var7.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    int var5 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    int var26 = var19.size();
    int var27 = var19.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var28 = var19.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    int var9 = var0.size();
    int var10 = var0.size();
    boolean var11 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    var0.enqueue((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    var9.enqueue((java.lang.Object)'a');
    java.lang.Object var12 = var9.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    java.lang.Object var25 = var13.dequeue();
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    int var27 = var26.size();
    var26.enqueue((java.lang.Object)10);
    java.lang.Object var30 = var26.dequeue();
    boolean var31 = var26.isEmpty();
    exercise03.RingBufferWrapper var32 = new exercise03.RingBufferWrapper();
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    boolean var35 = var32.isEmpty();
    int var36 = var32.size();
    var26.enqueue((java.lang.Object)var32);
    var13.enqueue((java.lang.Object)var32);
    var9.enqueue((java.lang.Object)var13);
    var0.enqueue((java.lang.Object)var13);
    java.lang.Object var41 = var13.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var42 = var13.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)100+ "'", var7.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 'a'+ "'", var12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + 10+ "'", var30.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    int var6 = var5.size();
    var5.enqueue((java.lang.Object)10);
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var10 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 10+ "'", var10.equals(10));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    int var2 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    exercise03.RingBufferWrapper var7 = new exercise03.RingBufferWrapper();
    var7.enqueue((java.lang.Object)'a');
    var0.enqueue((java.lang.Object)var7);
    java.lang.Object var11 = var0.dequeue();
    int var12 = var0.size();
    int var13 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    int var2 = var0.size();
    int var3 = var0.size();
    boolean var4 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    int var13 = var9.size();
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    var14.enqueue((java.lang.Object)10.0f);
    java.lang.Object var19 = var14.dequeue();
    boolean var20 = var14.isEmpty();
    boolean var21 = var14.isEmpty();
    var9.enqueue((java.lang.Object)var14);
    var0.enqueue((java.lang.Object)var14);
    boolean var24 = var14.isEmpty();
    int var25 = var14.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + 10.0f+ "'", var19.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    var5.enqueue((java.lang.Object)10.0f);
    java.lang.Object var10 = var5.dequeue();
    boolean var11 = var5.isEmpty();
    boolean var12 = var5.isEmpty();
    var0.enqueue((java.lang.Object)var5);
    boolean var14 = var5.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var5.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 10.0f+ "'", var10.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    int var9 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    int var4 = var0.size();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    boolean var8 = var5.isEmpty();
    int var9 = var5.size();
    int var10 = var5.size();
    boolean var11 = var5.isEmpty();
    int var12 = var5.size();
    int var13 = var5.size();
    int var14 = var5.size();
    var0.enqueue((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    boolean var26 = var19.isEmpty();
    exercise03.RingBufferWrapper var27 = new exercise03.RingBufferWrapper();
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    var27.enqueue((java.lang.Object)10.0f);
    java.lang.Object var32 = var27.dequeue();
    boolean var33 = var27.isEmpty();
    int var34 = var27.size();
    int var35 = var27.size();
    var19.enqueue((java.lang.Object)var27);
    exercise03.RingBufferWrapper var37 = new exercise03.RingBufferWrapper();
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    boolean var40 = var37.isEmpty();
    int var41 = var37.size();
    int var42 = var37.size();
    exercise03.RingBufferWrapper var43 = new exercise03.RingBufferWrapper();
    boolean var44 = var43.isEmpty();
    var43.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var47 = var43.dequeue();
    boolean var48 = var43.isEmpty();
    var43.enqueue((java.lang.Object)"hi!");
    var37.enqueue((java.lang.Object)"hi!");
    java.lang.Object var52 = var37.dequeue();
    var27.enqueue((java.lang.Object)var37);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var54 = var37.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + 10.0f+ "'", var32.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + (-1.0d)+ "'", var47.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    var19.enqueue((java.lang.Object)(byte)10);
    java.lang.Object var28 = var19.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var29 = var19.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + (byte)10+ "'", var28.equals((byte)10));

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    var5.enqueue((java.lang.Object)10.0f);
    java.lang.Object var10 = var5.dequeue();
    boolean var11 = var5.isEmpty();
    boolean var12 = var5.isEmpty();
    var0.enqueue((java.lang.Object)var5);
    boolean var14 = var5.isEmpty();
    exercise03.RingBufferWrapper var15 = new exercise03.RingBufferWrapper();
    int var16 = var15.size();
    var15.enqueue((java.lang.Object)10);
    java.lang.Object var19 = var15.dequeue();
    boolean var20 = var15.isEmpty();
    int var21 = var15.size();
    var5.enqueue((java.lang.Object)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 10.0f+ "'", var10.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + 10+ "'", var19.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    var0.enqueue((java.lang.Object)(short)100);
    java.lang.Object var10 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (short)100+ "'", var10.equals((short)100));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var9);
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    int var15 = var14.size();
    var14.enqueue((java.lang.Object)10L);
    java.lang.Object var18 = var14.dequeue();
    var14.enqueue((java.lang.Object)(short)10);
    java.lang.Object var21 = var14.dequeue();
    int var22 = var14.size();
    exercise03.RingBufferWrapper var23 = new exercise03.RingBufferWrapper();
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    int var26 = var23.size();
    var14.enqueue((java.lang.Object)var26);
    var9.enqueue((java.lang.Object)var26);
    java.lang.Object var29 = var9.dequeue();
    int var30 = var9.size();
    exercise03.RingBufferWrapper var31 = new exercise03.RingBufferWrapper();
    boolean var32 = var31.isEmpty();
    boolean var33 = var31.isEmpty();
    var31.enqueue((java.lang.Object)10.0f);
    java.lang.Object var36 = var31.dequeue();
    var31.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var39 = var31.dequeue();
    boolean var40 = var31.isEmpty();
    var9.enqueue((java.lang.Object)var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 10L+ "'", var18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + (short)10+ "'", var21.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + 0+ "'", var29.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + 10.0f+ "'", var36.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + (-1.0f)+ "'", var39.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    var19.enqueue((java.lang.Object)(byte)10);
    java.lang.Object var28 = var19.dequeue();
    boolean var29 = var19.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + (byte)10+ "'", var28.equals((byte)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    var5.enqueue((java.lang.Object)10.0f);
    java.lang.Object var10 = var5.dequeue();
    boolean var11 = var5.isEmpty();
    boolean var12 = var5.isEmpty();
    var0.enqueue((java.lang.Object)var5);
    int var14 = var5.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var5.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 10.0f+ "'", var10.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    int var27 = var26.size();
    var26.enqueue((java.lang.Object)10L);
    java.lang.Object var30 = var26.dequeue();
    var26.enqueue((java.lang.Object)(short)10);
    java.lang.Object var33 = var26.dequeue();
    int var34 = var26.size();
    exercise03.RingBufferWrapper var35 = new exercise03.RingBufferWrapper();
    boolean var36 = var35.isEmpty();
    boolean var37 = var35.isEmpty();
    int var38 = var35.size();
    var26.enqueue((java.lang.Object)var38);
    java.lang.Object var40 = var26.dequeue();
    var19.enqueue(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + 10L+ "'", var30.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + (short)10+ "'", var33.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + 0+ "'", var40.equals(0));

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10L);
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var0.dequeue();
    exercise03.RingBufferWrapper var15 = new exercise03.RingBufferWrapper();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    boolean var18 = var15.isEmpty();
    int var19 = var15.size();
    int var20 = var15.size();
    boolean var21 = var15.isEmpty();
    boolean var22 = var15.isEmpty();
    var0.enqueue((java.lang.Object)var15);
    int var24 = var15.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var25 = var15.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10L+ "'", var4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)10+ "'", var7.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0+ "'", var14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    int var9 = var0.size();
    exercise03.RingBufferWrapper var10 = new exercise03.RingBufferWrapper();
    int var11 = var10.size();
    var10.enqueue((java.lang.Object)10);
    java.lang.Object var14 = var10.dequeue();
    boolean var15 = var10.isEmpty();
    exercise03.RingBufferWrapper var16 = new exercise03.RingBufferWrapper();
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    int var20 = var16.size();
    var10.enqueue((java.lang.Object)var16);
    java.lang.Object var22 = var10.dequeue();
    exercise03.RingBufferWrapper var23 = new exercise03.RingBufferWrapper();
    int var24 = var23.size();
    var23.enqueue((java.lang.Object)10);
    java.lang.Object var27 = var23.dequeue();
    boolean var28 = var23.isEmpty();
    exercise03.RingBufferWrapper var29 = new exercise03.RingBufferWrapper();
    boolean var30 = var29.isEmpty();
    boolean var31 = var29.isEmpty();
    boolean var32 = var29.isEmpty();
    int var33 = var29.size();
    var23.enqueue((java.lang.Object)var29);
    var10.enqueue((java.lang.Object)var29);
    exercise03.RingBufferWrapper var36 = new exercise03.RingBufferWrapper();
    boolean var37 = var36.isEmpty();
    boolean var38 = var36.isEmpty();
    var36.enqueue((java.lang.Object)10.0f);
    java.lang.Object var41 = var36.dequeue();
    var36.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var44 = var36.dequeue();
    boolean var45 = var36.isEmpty();
    exercise03.RingBufferWrapper var46 = new exercise03.RingBufferWrapper();
    boolean var47 = var46.isEmpty();
    boolean var48 = var46.isEmpty();
    var46.enqueue((java.lang.Object)10.0f);
    java.lang.Object var51 = var46.dequeue();
    boolean var52 = var46.isEmpty();
    int var53 = var46.size();
    var36.enqueue((java.lang.Object)var53);
    var29.enqueue((java.lang.Object)var36);
    var0.enqueue((java.lang.Object)var29);
    java.lang.Object var57 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)100+ "'", var7.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 10+ "'", var14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + 10+ "'", var27.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + 10.0f+ "'", var41.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + (-1.0f)+ "'", var44.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + 10.0f+ "'", var51.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10L);
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var0.dequeue();
    exercise03.RingBufferWrapper var15 = new exercise03.RingBufferWrapper();
    boolean var16 = var15.isEmpty();
    var15.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var19 = var15.dequeue();
    int var20 = var15.size();
    boolean var21 = var15.isEmpty();
    boolean var22 = var15.isEmpty();
    var0.enqueue((java.lang.Object)var22);
    java.lang.Object var24 = var0.dequeue();
    boolean var25 = var0.isEmpty();
    int var26 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10L+ "'", var4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)10+ "'", var7.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0+ "'", var14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + (-1.0d)+ "'", var19.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + true+ "'", var24.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    int var8 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var26 = var19.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    int var9 = var0.size();
    boolean var10 = var0.isEmpty();
    exercise03.RingBufferWrapper var11 = new exercise03.RingBufferWrapper();
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    var11.enqueue((java.lang.Object)10.0f);
    java.lang.Object var16 = var11.dequeue();
    boolean var17 = var11.isEmpty();
    int var18 = var11.size();
    int var19 = var11.size();
    var0.enqueue((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)100+ "'", var7.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 10.0f+ "'", var16.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var6.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    int var8 = var0.size();
    int var9 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    var9.enqueue((java.lang.Object)'a');
    java.lang.Object var12 = var9.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    java.lang.Object var25 = var13.dequeue();
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    int var27 = var26.size();
    var26.enqueue((java.lang.Object)10);
    java.lang.Object var30 = var26.dequeue();
    boolean var31 = var26.isEmpty();
    exercise03.RingBufferWrapper var32 = new exercise03.RingBufferWrapper();
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    boolean var35 = var32.isEmpty();
    int var36 = var32.size();
    var26.enqueue((java.lang.Object)var32);
    var13.enqueue((java.lang.Object)var32);
    var9.enqueue((java.lang.Object)var13);
    var0.enqueue((java.lang.Object)var13);
    java.lang.Object var41 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)100+ "'", var7.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 'a'+ "'", var12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + 10+ "'", var30.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    int var5 = var0.size();
    boolean var6 = var0.isEmpty();
    exercise03.RingBufferWrapper var7 = new exercise03.RingBufferWrapper();
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    var7.enqueue((java.lang.Object)10.0f);
    java.lang.Object var12 = var7.dequeue();
    int var13 = var7.size();
    boolean var14 = var7.isEmpty();
    int var15 = var7.size();
    boolean var16 = var7.isEmpty();
    boolean var17 = var7.isEmpty();
    var0.enqueue((java.lang.Object)var7);
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    exercise03.RingBufferWrapper var24 = new exercise03.RingBufferWrapper();
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    var24.enqueue((java.lang.Object)10.0f);
    java.lang.Object var29 = var24.dequeue();
    boolean var30 = var24.isEmpty();
    boolean var31 = var24.isEmpty();
    var19.enqueue((java.lang.Object)var24);
    exercise03.RingBufferWrapper var33 = new exercise03.RingBufferWrapper();
    int var34 = var33.size();
    var33.enqueue((java.lang.Object)10);
    java.lang.Object var37 = var33.dequeue();
    boolean var38 = var33.isEmpty();
    exercise03.RingBufferWrapper var39 = new exercise03.RingBufferWrapper();
    boolean var40 = var39.isEmpty();
    boolean var41 = var39.isEmpty();
    boolean var42 = var39.isEmpty();
    int var43 = var39.size();
    var33.enqueue((java.lang.Object)var39);
    java.lang.Object var45 = var33.dequeue();
    exercise03.RingBufferWrapper var46 = new exercise03.RingBufferWrapper();
    int var47 = var46.size();
    var46.enqueue((java.lang.Object)10);
    java.lang.Object var50 = var46.dequeue();
    boolean var51 = var46.isEmpty();
    exercise03.RingBufferWrapper var52 = new exercise03.RingBufferWrapper();
    boolean var53 = var52.isEmpty();
    boolean var54 = var52.isEmpty();
    boolean var55 = var52.isEmpty();
    int var56 = var52.size();
    var46.enqueue((java.lang.Object)var52);
    var33.enqueue((java.lang.Object)var52);
    var52.enqueue((java.lang.Object)(byte)10);
    var24.enqueue((java.lang.Object)(byte)10);
    var7.enqueue((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 10.0f+ "'", var12.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + 10.0f+ "'", var29.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + 10+ "'", var37.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + 10+ "'", var50.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test108");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test109");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)1.0d);
    java.lang.Object var7 = var0.dequeue();
    boolean var8 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 1.0d+ "'", var7.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test110");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    var5.enqueue((java.lang.Object)10.0f);
    java.lang.Object var10 = var5.dequeue();
    boolean var11 = var5.isEmpty();
    boolean var12 = var5.isEmpty();
    var0.enqueue((java.lang.Object)var5);
    int var14 = var5.size();
    boolean var15 = var5.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var5.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 10.0f+ "'", var10.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test111");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    int var9 = var0.size();
    int var10 = var0.size();
    boolean var11 = var0.isEmpty();
    int var12 = var0.size();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    java.lang.Object var25 = var13.dequeue();
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    int var27 = var26.size();
    var26.enqueue((java.lang.Object)10);
    java.lang.Object var30 = var26.dequeue();
    boolean var31 = var26.isEmpty();
    exercise03.RingBufferWrapper var32 = new exercise03.RingBufferWrapper();
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    boolean var35 = var32.isEmpty();
    int var36 = var32.size();
    var26.enqueue((java.lang.Object)var32);
    var13.enqueue((java.lang.Object)var32);
    boolean var39 = var32.isEmpty();
    exercise03.RingBufferWrapper var40 = new exercise03.RingBufferWrapper();
    int var41 = var40.size();
    var40.enqueue((java.lang.Object)10);
    java.lang.Object var44 = var40.dequeue();
    boolean var45 = var40.isEmpty();
    exercise03.RingBufferWrapper var46 = new exercise03.RingBufferWrapper();
    boolean var47 = var46.isEmpty();
    boolean var48 = var46.isEmpty();
    boolean var49 = var46.isEmpty();
    int var50 = var46.size();
    var40.enqueue((java.lang.Object)var46);
    java.lang.Object var52 = var40.dequeue();
    boolean var53 = var40.isEmpty();
    var32.enqueue((java.lang.Object)var53);
    var0.enqueue((java.lang.Object)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)100+ "'", var7.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + 10+ "'", var30.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + 10+ "'", var44.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test112");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    exercise03.RingBufferWrapper var7 = new exercise03.RingBufferWrapper();
    int var8 = var7.size();
    var0.enqueue((java.lang.Object)var7);
    java.lang.Object var10 = var0.dequeue();
    boolean var11 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test113");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    int var2 = var0.size();
    int var3 = var0.size();
    boolean var4 = var0.isEmpty();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    int var6 = var5.size();
    boolean var7 = var5.isEmpty();
    var0.enqueue((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test114");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    int var9 = var0.size();
    boolean var10 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)100+ "'", var7.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test115");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    int var5 = var0.size();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    int var8 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test116");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    var6.enqueue((java.lang.Object)'a');
    java.lang.Object var9 = var6.dequeue();
    var6.enqueue((java.lang.Object)"hi!");
    java.lang.Object var12 = var6.dequeue();
    int var13 = var6.size();
    boolean var14 = var6.isEmpty();
    java.lang.Object var15 = new java.lang.Object();
    var6.enqueue(var15);
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var18 = var6.dequeue();
    int var19 = var6.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var20 = var6.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 'a'+ "'", var9.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test117");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    int var2 = var0.size();
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test118");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    exercise03.RingBufferWrapper var1 = new exercise03.RingBufferWrapper();
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)100.0f);
    java.lang.Object var8 = var1.dequeue();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    var9.enqueue((java.lang.Object)'a');
    java.lang.Object var12 = var9.dequeue();
    var9.enqueue((java.lang.Object)"hi!");
    java.lang.Object var15 = var9.dequeue();
    int var16 = var9.size();
    exercise03.RingBufferWrapper var17 = new exercise03.RingBufferWrapper();
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    var9.enqueue((java.lang.Object)var19);
    java.lang.Object var21 = var9.dequeue();
    var1.enqueue((java.lang.Object)var9);
    int var23 = var9.size();
    var0.enqueue((java.lang.Object)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var25 = var9.dequeue();
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
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 100.0f+ "'", var8.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 'a'+ "'", var12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + true+ "'", var21.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test119");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10L);
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10L+ "'", var4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)10+ "'", var7.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0+ "'", var14.equals(0));

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test120");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test121");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    boolean var9 = var8.isEmpty();
    var8.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var12 = var8.dequeue();
    boolean var13 = var8.isEmpty();
    int var14 = var8.size();
    boolean var15 = var8.isEmpty();
    var0.enqueue((java.lang.Object)var8);
    int var17 = var8.size();
    int var18 = var8.size();
    boolean var19 = var8.isEmpty();
    boolean var20 = var8.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (-1.0d)+ "'", var12.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test122");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    int var2 = var0.size();
    int var3 = var0.size();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test123");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    boolean var27 = var26.isEmpty();
    var26.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var30 = var26.dequeue();
    boolean var31 = var26.isEmpty();
    var26.enqueue((java.lang.Object)"hi!");
    var19.enqueue((java.lang.Object)var26);
    java.lang.Object var35 = var26.dequeue();
    exercise03.RingBufferWrapper var36 = new exercise03.RingBufferWrapper();
    boolean var37 = var36.isEmpty();
    var36.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var40 = var36.dequeue();
    var36.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var43 = var36.dequeue();
    int var44 = var36.size();
    int var45 = var36.size();
    exercise03.RingBufferWrapper var46 = new exercise03.RingBufferWrapper();
    int var47 = var46.size();
    var46.enqueue((java.lang.Object)10);
    java.lang.Object var50 = var46.dequeue();
    boolean var51 = var46.isEmpty();
    exercise03.RingBufferWrapper var52 = new exercise03.RingBufferWrapper();
    boolean var53 = var52.isEmpty();
    boolean var54 = var52.isEmpty();
    boolean var55 = var52.isEmpty();
    int var56 = var52.size();
    var46.enqueue((java.lang.Object)var52);
    java.lang.Object var58 = var46.dequeue();
    exercise03.RingBufferWrapper var59 = new exercise03.RingBufferWrapper();
    int var60 = var59.size();
    var59.enqueue((java.lang.Object)10);
    java.lang.Object var63 = var59.dequeue();
    boolean var64 = var59.isEmpty();
    exercise03.RingBufferWrapper var65 = new exercise03.RingBufferWrapper();
    boolean var66 = var65.isEmpty();
    boolean var67 = var65.isEmpty();
    boolean var68 = var65.isEmpty();
    int var69 = var65.size();
    var59.enqueue((java.lang.Object)var65);
    var46.enqueue((java.lang.Object)var65);
    exercise03.RingBufferWrapper var72 = new exercise03.RingBufferWrapper();
    boolean var73 = var72.isEmpty();
    boolean var74 = var72.isEmpty();
    var72.enqueue((java.lang.Object)10.0f);
    java.lang.Object var77 = var72.dequeue();
    var72.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var80 = var72.dequeue();
    boolean var81 = var72.isEmpty();
    exercise03.RingBufferWrapper var82 = new exercise03.RingBufferWrapper();
    boolean var83 = var82.isEmpty();
    boolean var84 = var82.isEmpty();
    var82.enqueue((java.lang.Object)10.0f);
    java.lang.Object var87 = var82.dequeue();
    boolean var88 = var82.isEmpty();
    int var89 = var82.size();
    var72.enqueue((java.lang.Object)var89);
    var65.enqueue((java.lang.Object)var72);
    var36.enqueue((java.lang.Object)var65);
    var26.enqueue((java.lang.Object)var36);
    java.lang.Object var94 = var26.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + (-1.0d)+ "'", var30.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + (-1.0d)+ "'", var40.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + (byte)100+ "'", var43.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + 10+ "'", var50.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + 10+ "'", var63.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + 10.0f+ "'", var77.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + (-1.0f)+ "'", var80.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + 10.0f+ "'", var87.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test124");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    boolean var26 = var19.isEmpty();
    exercise03.RingBufferWrapper var27 = new exercise03.RingBufferWrapper();
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    var27.enqueue((java.lang.Object)10.0f);
    java.lang.Object var32 = var27.dequeue();
    boolean var33 = var27.isEmpty();
    int var34 = var27.size();
    int var35 = var27.size();
    var19.enqueue((java.lang.Object)var27);
    exercise03.RingBufferWrapper var37 = new exercise03.RingBufferWrapper();
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    boolean var40 = var37.isEmpty();
    int var41 = var37.size();
    int var42 = var37.size();
    exercise03.RingBufferWrapper var43 = new exercise03.RingBufferWrapper();
    boolean var44 = var43.isEmpty();
    var43.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var47 = var43.dequeue();
    boolean var48 = var43.isEmpty();
    var43.enqueue((java.lang.Object)"hi!");
    var37.enqueue((java.lang.Object)"hi!");
    java.lang.Object var52 = var37.dequeue();
    var27.enqueue((java.lang.Object)var37);
    exercise03.RingBufferWrapper var54 = new exercise03.RingBufferWrapper();
    boolean var55 = var54.isEmpty();
    boolean var56 = var54.isEmpty();
    boolean var57 = var54.isEmpty();
    int var58 = var54.size();
    int var59 = var54.size();
    boolean var60 = var54.isEmpty();
    var37.enqueue((java.lang.Object)var54);
    boolean var62 = var54.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var63 = var54.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + 10.0f+ "'", var32.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + (-1.0d)+ "'", var47.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test125");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    boolean var14 = var13.isEmpty();
    var0.enqueue((java.lang.Object)var14);
    java.lang.Object var16 = var0.dequeue();
    int var17 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + true+ "'", var16.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test126");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    boolean var14 = var13.isEmpty();
    var0.enqueue((java.lang.Object)var14);
    java.lang.Object var16 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + true+ "'", var16.equals(true));

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test127");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    int var5 = var0.size();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test128");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var8 = var0.dequeue();
    boolean var9 = var0.isEmpty();
    exercise03.RingBufferWrapper var10 = new exercise03.RingBufferWrapper();
    int var11 = var10.size();
    var10.enqueue((java.lang.Object)10);
    java.lang.Object var14 = var10.dequeue();
    boolean var15 = var10.isEmpty();
    exercise03.RingBufferWrapper var16 = new exercise03.RingBufferWrapper();
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    int var20 = var16.size();
    var10.enqueue((java.lang.Object)var16);
    java.lang.Object var22 = var10.dequeue();
    exercise03.RingBufferWrapper var23 = new exercise03.RingBufferWrapper();
    int var24 = var23.size();
    var23.enqueue((java.lang.Object)10);
    java.lang.Object var27 = var23.dequeue();
    boolean var28 = var23.isEmpty();
    exercise03.RingBufferWrapper var29 = new exercise03.RingBufferWrapper();
    boolean var30 = var29.isEmpty();
    boolean var31 = var29.isEmpty();
    boolean var32 = var29.isEmpty();
    int var33 = var29.size();
    var23.enqueue((java.lang.Object)var29);
    var10.enqueue((java.lang.Object)var29);
    boolean var36 = var29.isEmpty();
    boolean var37 = var29.isEmpty();
    int var38 = var29.size();
    var0.enqueue((java.lang.Object)var29);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var40 = var29.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 10+ "'", var14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + 10+ "'", var27.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test129");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var8 = var0.dequeue();
    int var9 = var0.size();
    var0.enqueue((java.lang.Object)(byte)1);
    java.lang.Object var12 = var0.dequeue();
    boolean var13 = var0.isEmpty();
    boolean var14 = var0.isEmpty();
    exercise03.RingBufferWrapper var15 = new exercise03.RingBufferWrapper();
    var15.enqueue((java.lang.Object)'a');
    java.lang.Object var18 = var15.dequeue();
    int var19 = var15.size();
    exercise03.RingBufferWrapper var20 = new exercise03.RingBufferWrapper();
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    boolean var23 = var20.isEmpty();
    int var24 = var20.size();
    boolean var25 = var20.isEmpty();
    int var26 = var20.size();
    boolean var27 = var20.isEmpty();
    exercise03.RingBufferWrapper var28 = new exercise03.RingBufferWrapper();
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    boolean var31 = var28.isEmpty();
    int var32 = var28.size();
    boolean var33 = var28.isEmpty();
    boolean var34 = var28.isEmpty();
    int var35 = var28.size();
    var20.enqueue((java.lang.Object)var35);
    var15.enqueue((java.lang.Object)var20);
    var0.enqueue((java.lang.Object)var15);
    java.lang.Object var39 = var0.dequeue();
    int var40 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (byte)1+ "'", var12.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 'a'+ "'", var18.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test130");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var9);
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    int var15 = var14.size();
    var14.enqueue((java.lang.Object)10L);
    java.lang.Object var18 = var14.dequeue();
    var14.enqueue((java.lang.Object)(short)10);
    java.lang.Object var21 = var14.dequeue();
    int var22 = var14.size();
    exercise03.RingBufferWrapper var23 = new exercise03.RingBufferWrapper();
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    int var26 = var23.size();
    var14.enqueue((java.lang.Object)var26);
    var9.enqueue((java.lang.Object)var26);
    java.lang.Object var29 = var9.dequeue();
    int var30 = var9.size();
    exercise03.RingBufferWrapper var31 = new exercise03.RingBufferWrapper();
    int var32 = var31.size();
    var31.enqueue((java.lang.Object)10);
    java.lang.Object var35 = var31.dequeue();
    boolean var36 = var31.isEmpty();
    exercise03.RingBufferWrapper var37 = new exercise03.RingBufferWrapper();
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    boolean var40 = var37.isEmpty();
    int var41 = var37.size();
    var31.enqueue((java.lang.Object)var37);
    java.lang.Object var43 = var31.dequeue();
    exercise03.RingBufferWrapper var44 = new exercise03.RingBufferWrapper();
    int var45 = var44.size();
    var44.enqueue((java.lang.Object)10);
    java.lang.Object var48 = var44.dequeue();
    boolean var49 = var44.isEmpty();
    exercise03.RingBufferWrapper var50 = new exercise03.RingBufferWrapper();
    boolean var51 = var50.isEmpty();
    boolean var52 = var50.isEmpty();
    boolean var53 = var50.isEmpty();
    int var54 = var50.size();
    var44.enqueue((java.lang.Object)var50);
    var31.enqueue((java.lang.Object)var50);
    boolean var57 = var50.isEmpty();
    boolean var58 = var50.isEmpty();
    var9.enqueue((java.lang.Object)var58);
    java.lang.Object var60 = var9.dequeue();
    int var61 = var9.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 10L+ "'", var18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + (short)10+ "'", var21.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + 0+ "'", var29.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + 10+ "'", var35.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + 10+ "'", var48.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + true+ "'", var60.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test131");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    boolean var6 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test132");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var8 = var0.dequeue();
    int var9 = var0.size();
    var0.enqueue((java.lang.Object)(byte)1);
    java.lang.Object var12 = var0.dequeue();
    boolean var13 = var0.isEmpty();
    boolean var14 = var0.isEmpty();
    int var15 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (byte)1+ "'", var12.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test133");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    int var13 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test134");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    int var5 = var0.size();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    int var11 = var6.size();
    boolean var12 = var6.isEmpty();
    int var13 = var6.size();
    int var14 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    boolean var16 = var6.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var6.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test135");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    boolean var13 = var0.isEmpty();
    int var14 = var0.size();
    boolean var15 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test136");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    int var3 = var0.size();
    boolean var4 = var0.isEmpty();
    boolean var5 = var0.isEmpty();
    boolean var6 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test137");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    boolean var10 = var0.isEmpty();
    int var11 = var0.size();
    exercise03.RingBufferWrapper var12 = new exercise03.RingBufferWrapper();
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    var12.enqueue((java.lang.Object)10.0f);
    java.lang.Object var17 = var12.dequeue();
    int var18 = var12.size();
    boolean var19 = var12.isEmpty();
    exercise03.RingBufferWrapper var20 = new exercise03.RingBufferWrapper();
    boolean var21 = var20.isEmpty();
    var20.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var24 = var20.dequeue();
    boolean var25 = var20.isEmpty();
    int var26 = var20.size();
    boolean var27 = var20.isEmpty();
    var12.enqueue((java.lang.Object)var20);
    int var29 = var20.size();
    int var30 = var20.size();
    var0.enqueue((java.lang.Object)var20);
    int var32 = var20.size();
    boolean var33 = var20.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10.0f+ "'", var17.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + (-1.0d)+ "'", var24.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test138");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    int var7 = var0.size();
    var0.enqueue((java.lang.Object)10L);
    java.lang.Object var10 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 10L+ "'", var10.equals(10L));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test139");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    int var26 = var19.size();
    boolean var27 = var19.isEmpty();
    exercise03.RingBufferWrapper var28 = new exercise03.RingBufferWrapper();
    var28.enqueue((java.lang.Object)'a');
    java.lang.Object var31 = var28.dequeue();
    int var32 = var28.size();
    exercise03.RingBufferWrapper var33 = new exercise03.RingBufferWrapper();
    var33.enqueue((java.lang.Object)'a');
    java.lang.Object var36 = var33.dequeue();
    var33.enqueue((java.lang.Object)"hi!");
    var28.enqueue((java.lang.Object)var33);
    var19.enqueue((java.lang.Object)var33);
    java.lang.Object var41 = var33.dequeue();
    exercise03.RingBufferWrapper var42 = new exercise03.RingBufferWrapper();
    int var43 = var42.size();
    var42.enqueue((java.lang.Object)10);
    java.lang.Object var46 = var42.dequeue();
    boolean var47 = var42.isEmpty();
    exercise03.RingBufferWrapper var48 = new exercise03.RingBufferWrapper();
    boolean var49 = var48.isEmpty();
    boolean var50 = var48.isEmpty();
    boolean var51 = var48.isEmpty();
    int var52 = var48.size();
    var42.enqueue((java.lang.Object)var48);
    java.lang.Object var54 = var42.dequeue();
    exercise03.RingBufferWrapper var55 = new exercise03.RingBufferWrapper();
    int var56 = var55.size();
    var55.enqueue((java.lang.Object)10);
    java.lang.Object var59 = var55.dequeue();
    boolean var60 = var55.isEmpty();
    exercise03.RingBufferWrapper var61 = new exercise03.RingBufferWrapper();
    boolean var62 = var61.isEmpty();
    boolean var63 = var61.isEmpty();
    boolean var64 = var61.isEmpty();
    int var65 = var61.size();
    var55.enqueue((java.lang.Object)var61);
    var42.enqueue((java.lang.Object)var61);
    exercise03.RingBufferWrapper var68 = new exercise03.RingBufferWrapper();
    boolean var69 = var68.isEmpty();
    var68.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var72 = var68.dequeue();
    boolean var73 = var68.isEmpty();
    var68.enqueue((java.lang.Object)"hi!");
    var61.enqueue((java.lang.Object)var68);
    java.lang.Object var77 = var61.dequeue();
    var33.enqueue(var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + 'a'+ "'", var31.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + 'a'+ "'", var36.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + 10+ "'", var46.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + 10+ "'", var59.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + (-1.0d)+ "'", var72.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var77);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test140");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    int var13 = var0.size();
    int var14 = var0.size();
    boolean var15 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test141");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    int var7 = var0.size();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    boolean var10 = var0.isEmpty();
    boolean var11 = var0.isEmpty();
    boolean var12 = var0.isEmpty();
    int var13 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test142");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    var0.enqueue((java.lang.Object)100.0f);
    java.lang.Object var7 = var0.dequeue();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    var8.enqueue((java.lang.Object)'a');
    java.lang.Object var11 = var8.dequeue();
    var8.enqueue((java.lang.Object)"hi!");
    java.lang.Object var14 = var8.dequeue();
    int var15 = var8.size();
    exercise03.RingBufferWrapper var16 = new exercise03.RingBufferWrapper();
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    var8.enqueue((java.lang.Object)var18);
    java.lang.Object var20 = var8.dequeue();
    var0.enqueue((java.lang.Object)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var22 = var8.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 100.0f+ "'", var7.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 'a'+ "'", var11.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + true+ "'", var20.equals(true));

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test143");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    int var26 = var19.size();
    boolean var27 = var19.isEmpty();
    int var28 = var19.size();
    int var29 = var19.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test144");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    int var5 = var0.size();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    exercise03.RingBufferWrapper var10 = new exercise03.RingBufferWrapper();
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    int var14 = var10.size();
    int var15 = var10.size();
    exercise03.RingBufferWrapper var16 = new exercise03.RingBufferWrapper();
    boolean var17 = var16.isEmpty();
    var16.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var20 = var16.dequeue();
    boolean var21 = var16.isEmpty();
    var10.enqueue((java.lang.Object)var21);
    java.lang.Object var23 = var10.dequeue();
    var0.enqueue((java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var25 = var10.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + (-1.0d)+ "'", var20.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + true+ "'", var23.equals(true));

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test145");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    int var2 = var0.size();
    int var3 = var0.size();
    boolean var4 = var0.isEmpty();
    boolean var5 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test146");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    int var4 = var0.size();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    var5.enqueue((java.lang.Object)'a');
    java.lang.Object var8 = var5.dequeue();
    var5.enqueue((java.lang.Object)"hi!");
    var0.enqueue((java.lang.Object)var5);
    java.lang.Object var12 = var5.dequeue();
    boolean var13 = var5.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 'a'+ "'", var8.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test147");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    var6.enqueue((java.lang.Object)'a');
    java.lang.Object var9 = var6.dequeue();
    var6.enqueue((java.lang.Object)"hi!");
    java.lang.Object var12 = var6.dequeue();
    int var13 = var6.size();
    var0.enqueue((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 'a'+ "'", var9.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test148");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test149");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    var0.enqueue((java.lang.Object)"hi!");
    java.lang.Object var6 = var0.dequeue();
    int var7 = var0.size();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    var0.enqueue((java.lang.Object)var10);
    java.lang.Object var12 = var0.dequeue();
    int var13 = var0.size();
    int var14 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + true+ "'", var12.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test150");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    boolean var2 = var0.isEmpty();
    int var3 = var0.size();
    boolean var4 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test151");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    boolean var6 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test152");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    boolean var26 = var19.isEmpty();
    int var27 = var19.size();
    exercise03.RingBufferWrapper var28 = new exercise03.RingBufferWrapper();
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    var28.enqueue((java.lang.Object)10.0f);
    java.lang.Object var33 = var28.dequeue();
    boolean var34 = var28.isEmpty();
    int var35 = var28.size();
    var28.enqueue((java.lang.Object)(short)100);
    java.lang.Object var38 = var28.dequeue();
    var19.enqueue((java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + 10.0f+ "'", var33.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + (short)100+ "'", var38.equals((short)100));

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test153");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    boolean var27 = var26.isEmpty();
    var26.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var30 = var26.dequeue();
    boolean var31 = var26.isEmpty();
    var26.enqueue((java.lang.Object)"hi!");
    var19.enqueue((java.lang.Object)var26);
    java.lang.Object var35 = var26.dequeue();
    exercise03.RingBufferWrapper var36 = new exercise03.RingBufferWrapper();
    boolean var37 = var36.isEmpty();
    var36.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var40 = var36.dequeue();
    var36.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var43 = var36.dequeue();
    int var44 = var36.size();
    int var45 = var36.size();
    exercise03.RingBufferWrapper var46 = new exercise03.RingBufferWrapper();
    int var47 = var46.size();
    var46.enqueue((java.lang.Object)10);
    java.lang.Object var50 = var46.dequeue();
    boolean var51 = var46.isEmpty();
    exercise03.RingBufferWrapper var52 = new exercise03.RingBufferWrapper();
    boolean var53 = var52.isEmpty();
    boolean var54 = var52.isEmpty();
    boolean var55 = var52.isEmpty();
    int var56 = var52.size();
    var46.enqueue((java.lang.Object)var52);
    java.lang.Object var58 = var46.dequeue();
    exercise03.RingBufferWrapper var59 = new exercise03.RingBufferWrapper();
    int var60 = var59.size();
    var59.enqueue((java.lang.Object)10);
    java.lang.Object var63 = var59.dequeue();
    boolean var64 = var59.isEmpty();
    exercise03.RingBufferWrapper var65 = new exercise03.RingBufferWrapper();
    boolean var66 = var65.isEmpty();
    boolean var67 = var65.isEmpty();
    boolean var68 = var65.isEmpty();
    int var69 = var65.size();
    var59.enqueue((java.lang.Object)var65);
    var46.enqueue((java.lang.Object)var65);
    exercise03.RingBufferWrapper var72 = new exercise03.RingBufferWrapper();
    boolean var73 = var72.isEmpty();
    boolean var74 = var72.isEmpty();
    var72.enqueue((java.lang.Object)10.0f);
    java.lang.Object var77 = var72.dequeue();
    var72.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var80 = var72.dequeue();
    boolean var81 = var72.isEmpty();
    exercise03.RingBufferWrapper var82 = new exercise03.RingBufferWrapper();
    boolean var83 = var82.isEmpty();
    boolean var84 = var82.isEmpty();
    var82.enqueue((java.lang.Object)10.0f);
    java.lang.Object var87 = var82.dequeue();
    boolean var88 = var82.isEmpty();
    int var89 = var82.size();
    var72.enqueue((java.lang.Object)var89);
    var65.enqueue((java.lang.Object)var72);
    var36.enqueue((java.lang.Object)var65);
    var26.enqueue((java.lang.Object)var36);
    java.lang.Object var94 = var36.dequeue();
    int var95 = var36.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + (-1.0d)+ "'", var30.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + (-1.0d)+ "'", var40.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + (byte)100+ "'", var43.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + 10+ "'", var50.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + 10+ "'", var63.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + 10.0f+ "'", var77.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + (-1.0f)+ "'", var80.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + 10.0f+ "'", var87.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == 0);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test154");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    exercise03.RingBufferWrapper var7 = new exercise03.RingBufferWrapper();
    int var8 = var7.size();
    var7.enqueue((java.lang.Object)10);
    java.lang.Object var11 = var7.dequeue();
    boolean var12 = var7.isEmpty();
    var0.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var0.dequeue();
    boolean var15 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 10+ "'", var11.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + true+ "'", var14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test155");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    int var9 = var0.size();
    int var10 = var0.size();
    int var11 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)100+ "'", var7.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test156");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    int var9 = var0.size();
    boolean var10 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 10+ "'", var7.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test157");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    exercise03.RingBufferWrapper var7 = new exercise03.RingBufferWrapper();
    var7.enqueue((java.lang.Object)'a');
    java.lang.Object var10 = var7.dequeue();
    exercise03.RingBufferWrapper var11 = new exercise03.RingBufferWrapper();
    int var12 = var11.size();
    var11.enqueue((java.lang.Object)10);
    java.lang.Object var15 = var11.dequeue();
    boolean var16 = var11.isEmpty();
    exercise03.RingBufferWrapper var17 = new exercise03.RingBufferWrapper();
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    boolean var20 = var17.isEmpty();
    int var21 = var17.size();
    var11.enqueue((java.lang.Object)var17);
    java.lang.Object var23 = var11.dequeue();
    exercise03.RingBufferWrapper var24 = new exercise03.RingBufferWrapper();
    int var25 = var24.size();
    var24.enqueue((java.lang.Object)10);
    java.lang.Object var28 = var24.dequeue();
    boolean var29 = var24.isEmpty();
    exercise03.RingBufferWrapper var30 = new exercise03.RingBufferWrapper();
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    boolean var33 = var30.isEmpty();
    int var34 = var30.size();
    var24.enqueue((java.lang.Object)var30);
    var11.enqueue((java.lang.Object)var30);
    var7.enqueue((java.lang.Object)var11);
    var0.enqueue((java.lang.Object)var11);
    java.lang.Object var39 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var40 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 'a'+ "'", var10.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 10+ "'", var15.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + 10+ "'", var28.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test158");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    int var13 = var0.size();
    int var14 = var0.size();
    boolean var15 = var0.isEmpty();
    int var16 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test159");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    var5.enqueue((java.lang.Object)'a');
    java.lang.Object var8 = var5.dequeue();
    int var9 = var5.size();
    exercise03.RingBufferWrapper var10 = new exercise03.RingBufferWrapper();
    var10.enqueue((java.lang.Object)'a');
    java.lang.Object var13 = var10.dequeue();
    var10.enqueue((java.lang.Object)"hi!");
    var5.enqueue((java.lang.Object)var10);
    java.lang.Object var17 = var5.dequeue();
    var0.enqueue(var17);
    java.lang.Object var19 = var0.dequeue();
    int var20 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 'a'+ "'", var8.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 'a'+ "'", var13.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test160");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    int var2 = var0.size();
    int var3 = var0.size();
    int var4 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test161");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10L);
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var0.dequeue();
    int var15 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10L+ "'", var4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)10+ "'", var7.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0+ "'", var14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test162");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var8 = var0.dequeue();
    boolean var9 = var0.isEmpty();
    int var10 = var0.size();
    boolean var11 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test163");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    boolean var26 = var19.isEmpty();
    boolean var27 = var19.isEmpty();
    boolean var28 = var19.isEmpty();
    boolean var29 = var19.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test164");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test165");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    int var9 = var0.size();
    boolean var10 = var0.isEmpty();
    boolean var11 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test166");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    int var9 = var0.size();
    exercise03.RingBufferWrapper var10 = new exercise03.RingBufferWrapper();
    int var11 = var10.size();
    var10.enqueue((java.lang.Object)10);
    java.lang.Object var14 = var10.dequeue();
    boolean var15 = var10.isEmpty();
    exercise03.RingBufferWrapper var16 = new exercise03.RingBufferWrapper();
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    int var20 = var16.size();
    var10.enqueue((java.lang.Object)var16);
    java.lang.Object var22 = var10.dequeue();
    exercise03.RingBufferWrapper var23 = new exercise03.RingBufferWrapper();
    int var24 = var23.size();
    var23.enqueue((java.lang.Object)10);
    java.lang.Object var27 = var23.dequeue();
    boolean var28 = var23.isEmpty();
    exercise03.RingBufferWrapper var29 = new exercise03.RingBufferWrapper();
    boolean var30 = var29.isEmpty();
    boolean var31 = var29.isEmpty();
    boolean var32 = var29.isEmpty();
    int var33 = var29.size();
    var23.enqueue((java.lang.Object)var29);
    var10.enqueue((java.lang.Object)var29);
    exercise03.RingBufferWrapper var36 = new exercise03.RingBufferWrapper();
    boolean var37 = var36.isEmpty();
    boolean var38 = var36.isEmpty();
    var36.enqueue((java.lang.Object)10.0f);
    java.lang.Object var41 = var36.dequeue();
    var36.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var44 = var36.dequeue();
    boolean var45 = var36.isEmpty();
    exercise03.RingBufferWrapper var46 = new exercise03.RingBufferWrapper();
    boolean var47 = var46.isEmpty();
    boolean var48 = var46.isEmpty();
    var46.enqueue((java.lang.Object)10.0f);
    java.lang.Object var51 = var46.dequeue();
    boolean var52 = var46.isEmpty();
    int var53 = var46.size();
    var36.enqueue((java.lang.Object)var53);
    var29.enqueue((java.lang.Object)var36);
    var0.enqueue((java.lang.Object)var29);
    java.lang.Object var57 = var29.dequeue();
    int var58 = var29.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)100+ "'", var7.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 10+ "'", var14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + 10+ "'", var27.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + 10.0f+ "'", var41.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + (-1.0f)+ "'", var44.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + 10.0f+ "'", var51.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test167");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test168");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)true);
    java.lang.Object var7 = var0.dequeue();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    boolean var9 = var8.isEmpty();
    var8.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var12 = var8.dequeue();
    var8.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var15 = var8.dequeue();
    int var16 = var8.size();
    exercise03.RingBufferWrapper var17 = new exercise03.RingBufferWrapper();
    var17.enqueue((java.lang.Object)'a');
    java.lang.Object var20 = var17.dequeue();
    exercise03.RingBufferWrapper var21 = new exercise03.RingBufferWrapper();
    int var22 = var21.size();
    var21.enqueue((java.lang.Object)10);
    java.lang.Object var25 = var21.dequeue();
    boolean var26 = var21.isEmpty();
    exercise03.RingBufferWrapper var27 = new exercise03.RingBufferWrapper();
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    boolean var30 = var27.isEmpty();
    int var31 = var27.size();
    var21.enqueue((java.lang.Object)var27);
    java.lang.Object var33 = var21.dequeue();
    exercise03.RingBufferWrapper var34 = new exercise03.RingBufferWrapper();
    int var35 = var34.size();
    var34.enqueue((java.lang.Object)10);
    java.lang.Object var38 = var34.dequeue();
    boolean var39 = var34.isEmpty();
    exercise03.RingBufferWrapper var40 = new exercise03.RingBufferWrapper();
    boolean var41 = var40.isEmpty();
    boolean var42 = var40.isEmpty();
    boolean var43 = var40.isEmpty();
    int var44 = var40.size();
    var34.enqueue((java.lang.Object)var40);
    var21.enqueue((java.lang.Object)var40);
    var17.enqueue((java.lang.Object)var21);
    var8.enqueue((java.lang.Object)var21);
    var0.enqueue((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + true+ "'", var7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (-1.0d)+ "'", var12.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + (byte)100+ "'", var15.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 'a'+ "'", var20.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + 10+ "'", var25.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + 10+ "'", var38.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test169");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    int var26 = var19.size();
    boolean var27 = var19.isEmpty();
    exercise03.RingBufferWrapper var28 = new exercise03.RingBufferWrapper();
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    var28.enqueue((java.lang.Object)10.0f);
    java.lang.Object var33 = var28.dequeue();
    int var34 = var28.size();
    int var35 = var28.size();
    var19.enqueue((java.lang.Object)var28);
    int var37 = var28.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + 10.0f+ "'", var33.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test170");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    int var8 = var0.size();
    int var9 = var0.size();
    boolean var10 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test171");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    exercise03.RingBufferWrapper var2 = new exercise03.RingBufferWrapper();
    int var3 = var2.size();
    var2.enqueue((java.lang.Object)10);
    java.lang.Object var6 = var2.dequeue();
    int var7 = var2.size();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    boolean var11 = var8.isEmpty();
    int var12 = var8.size();
    int var13 = var8.size();
    boolean var14 = var8.isEmpty();
    int var15 = var8.size();
    int var16 = var8.size();
    var2.enqueue((java.lang.Object)var8);
    boolean var18 = var8.isEmpty();
    int var19 = var8.size();
    var0.enqueue((java.lang.Object)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var21 = var8.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 10+ "'", var6.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test172");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    int var26 = var19.size();
    boolean var27 = var19.isEmpty();
    exercise03.RingBufferWrapper var28 = new exercise03.RingBufferWrapper();
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    var28.enqueue((java.lang.Object)10.0f);
    java.lang.Object var33 = var28.dequeue();
    int var34 = var28.size();
    int var35 = var28.size();
    var19.enqueue((java.lang.Object)var28);
    java.lang.Object var37 = var19.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + 10.0f+ "'", var33.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test173");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    boolean var4 = var0.isEmpty();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    boolean var6 = var5.isEmpty();
    var5.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var9 = var5.dequeue();
    var5.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var12 = var5.dequeue();
    int var13 = var5.size();
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    var14.enqueue((java.lang.Object)'a');
    java.lang.Object var17 = var14.dequeue();
    exercise03.RingBufferWrapper var18 = new exercise03.RingBufferWrapper();
    int var19 = var18.size();
    var18.enqueue((java.lang.Object)10);
    java.lang.Object var22 = var18.dequeue();
    boolean var23 = var18.isEmpty();
    exercise03.RingBufferWrapper var24 = new exercise03.RingBufferWrapper();
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    boolean var27 = var24.isEmpty();
    int var28 = var24.size();
    var18.enqueue((java.lang.Object)var24);
    java.lang.Object var30 = var18.dequeue();
    exercise03.RingBufferWrapper var31 = new exercise03.RingBufferWrapper();
    int var32 = var31.size();
    var31.enqueue((java.lang.Object)10);
    java.lang.Object var35 = var31.dequeue();
    boolean var36 = var31.isEmpty();
    exercise03.RingBufferWrapper var37 = new exercise03.RingBufferWrapper();
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    boolean var40 = var37.isEmpty();
    int var41 = var37.size();
    var31.enqueue((java.lang.Object)var37);
    var18.enqueue((java.lang.Object)var37);
    var14.enqueue((java.lang.Object)var18);
    var5.enqueue((java.lang.Object)var18);
    java.lang.Object var46 = var18.dequeue();
    var0.enqueue((java.lang.Object)var18);
    boolean var48 = var18.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var49 = var18.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0d)+ "'", var9.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (byte)100+ "'", var12.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 'a'+ "'", var17.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + 10+ "'", var22.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + 10+ "'", var35.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test174");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    exercise03.RingBufferWrapper var1 = new exercise03.RingBufferWrapper();
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)100.0f);
    java.lang.Object var8 = var1.dequeue();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    var9.enqueue((java.lang.Object)'a');
    java.lang.Object var12 = var9.dequeue();
    var9.enqueue((java.lang.Object)"hi!");
    java.lang.Object var15 = var9.dequeue();
    int var16 = var9.size();
    exercise03.RingBufferWrapper var17 = new exercise03.RingBufferWrapper();
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    var9.enqueue((java.lang.Object)var19);
    java.lang.Object var21 = var9.dequeue();
    var1.enqueue((java.lang.Object)var9);
    int var23 = var9.size();
    var0.enqueue((java.lang.Object)var9);
    exercise03.RingBufferWrapper var25 = new exercise03.RingBufferWrapper();
    boolean var26 = var25.isEmpty();
    var25.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var29 = var25.dequeue();
    int var30 = var25.size();
    exercise03.RingBufferWrapper var31 = new exercise03.RingBufferWrapper();
    boolean var32 = var31.isEmpty();
    boolean var33 = var31.isEmpty();
    var31.enqueue((java.lang.Object)10.0f);
    var25.enqueue((java.lang.Object)var31);
    var9.enqueue((java.lang.Object)var25);
    java.lang.Object var38 = var9.dequeue();
    exercise03.RingBufferWrapper var39 = new exercise03.RingBufferWrapper();
    boolean var40 = var39.isEmpty();
    boolean var41 = var39.isEmpty();
    var39.enqueue((java.lang.Object)10.0f);
    java.lang.Object var44 = var39.dequeue();
    int var45 = var39.size();
    boolean var46 = var39.isEmpty();
    exercise03.RingBufferWrapper var47 = new exercise03.RingBufferWrapper();
    boolean var48 = var47.isEmpty();
    var47.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var51 = var47.dequeue();
    boolean var52 = var47.isEmpty();
    int var53 = var47.size();
    boolean var54 = var47.isEmpty();
    var39.enqueue((java.lang.Object)var47);
    int var56 = var47.size();
    int var57 = var47.size();
    var9.enqueue((java.lang.Object)var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 100.0f+ "'", var8.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 'a'+ "'", var12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + true+ "'", var21.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + (-1.0d)+ "'", var29.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + 10.0f+ "'", var44.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + (-1.0d)+ "'", var51.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test175");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    int var8 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test176");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    var0.enqueue((java.lang.Object)(byte)(-1));
    java.lang.Object var15 = var0.dequeue();
    boolean var16 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + (byte)(-1)+ "'", var15.equals((byte)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test177");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    boolean var9 = var8.isEmpty();
    var8.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var12 = var8.dequeue();
    boolean var13 = var8.isEmpty();
    int var14 = var8.size();
    boolean var15 = var8.isEmpty();
    var0.enqueue((java.lang.Object)var8);
    int var17 = var8.size();
    int var18 = var8.size();
    int var19 = var8.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (-1.0d)+ "'", var12.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test178");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    int var7 = var0.size();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    boolean var10 = var0.isEmpty();
    boolean var11 = var0.isEmpty();
    boolean var12 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test179");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    int var8 = var0.size();
    int var9 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test180");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    boolean var13 = var0.isEmpty();
    int var14 = var0.size();
    int var15 = var0.size();
    int var16 = var0.size();
    int var17 = var0.size();
    exercise03.RingBufferWrapper var18 = new exercise03.RingBufferWrapper();
    var18.enqueue((java.lang.Object)'a');
    java.lang.Object var21 = var18.dequeue();
    var18.enqueue((java.lang.Object)"hi!");
    java.lang.Object var24 = var18.dequeue();
    int var25 = var18.size();
    int var26 = var18.size();
    boolean var27 = var18.isEmpty();
    var0.enqueue((java.lang.Object)var27);
    java.lang.Object var29 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + 'a'+ "'", var21.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "hi!"+ "'", var24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + true+ "'", var29.equals(true));

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test181");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    int var13 = var0.size();
    int var14 = var0.size();
    boolean var15 = var0.isEmpty();
    int var16 = var0.size();
    boolean var17 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test182");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    int var3 = var0.size();
    int var4 = var0.size();
    int var5 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test183");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    boolean var27 = var26.isEmpty();
    var26.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var30 = var26.dequeue();
    boolean var31 = var26.isEmpty();
    var26.enqueue((java.lang.Object)"hi!");
    var19.enqueue((java.lang.Object)var26);
    java.lang.Object var35 = var26.dequeue();
    int var36 = var26.size();
    var26.enqueue((java.lang.Object)0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + (-1.0d)+ "'", var30.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test184");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    int var4 = var0.size();
    int var5 = var0.size();
    int var6 = var0.size();
    var0.enqueue((java.lang.Object)1L);
    java.lang.Object var9 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 1L+ "'", var9.equals(1L));

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test185");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var9);
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    int var15 = var14.size();
    var14.enqueue((java.lang.Object)10L);
    java.lang.Object var18 = var14.dequeue();
    var14.enqueue((java.lang.Object)(short)10);
    java.lang.Object var21 = var14.dequeue();
    int var22 = var14.size();
    exercise03.RingBufferWrapper var23 = new exercise03.RingBufferWrapper();
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    int var26 = var23.size();
    var14.enqueue((java.lang.Object)var26);
    var9.enqueue((java.lang.Object)var26);
    java.lang.Object var29 = var9.dequeue();
    exercise03.RingBufferWrapper var30 = new exercise03.RingBufferWrapper();
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    boolean var33 = var30.isEmpty();
    int var34 = var30.size();
    boolean var35 = var30.isEmpty();
    var30.enqueue((java.lang.Object)(short)(-1));
    var9.enqueue((java.lang.Object)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 10L+ "'", var18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + (short)10+ "'", var21.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + 0+ "'", var29.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test186");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var8 = var0.dequeue();
    boolean var9 = var0.isEmpty();
    int var10 = var0.size();
    boolean var11 = var0.isEmpty();
    boolean var12 = var0.isEmpty();
    boolean var13 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test187");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    int var5 = var0.size();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    var6.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var10 = var6.dequeue();
    boolean var11 = var6.isEmpty();
    var6.enqueue((java.lang.Object)"hi!");
    var0.enqueue((java.lang.Object)"hi!");
    java.lang.Object var15 = var0.dequeue();
    exercise03.RingBufferWrapper var16 = new exercise03.RingBufferWrapper();
    int var17 = var16.size();
    var16.enqueue((java.lang.Object)10);
    java.lang.Object var20 = var16.dequeue();
    boolean var21 = var16.isEmpty();
    exercise03.RingBufferWrapper var22 = new exercise03.RingBufferWrapper();
    boolean var23 = var22.isEmpty();
    boolean var24 = var22.isEmpty();
    boolean var25 = var22.isEmpty();
    int var26 = var22.size();
    var16.enqueue((java.lang.Object)var22);
    java.lang.Object var28 = var16.dequeue();
    int var29 = var16.size();
    int var30 = var16.size();
    boolean var31 = var16.isEmpty();
    int var32 = var16.size();
    exercise03.RingBufferWrapper var33 = new exercise03.RingBufferWrapper();
    int var34 = var33.size();
    var33.enqueue((java.lang.Object)10);
    java.lang.Object var37 = var33.dequeue();
    boolean var38 = var33.isEmpty();
    exercise03.RingBufferWrapper var39 = new exercise03.RingBufferWrapper();
    boolean var40 = var39.isEmpty();
    boolean var41 = var39.isEmpty();
    boolean var42 = var39.isEmpty();
    int var43 = var39.size();
    var33.enqueue((java.lang.Object)var39);
    java.lang.Object var45 = var33.dequeue();
    exercise03.RingBufferWrapper var46 = new exercise03.RingBufferWrapper();
    int var47 = var46.size();
    var46.enqueue((java.lang.Object)10);
    java.lang.Object var50 = var46.dequeue();
    boolean var51 = var46.isEmpty();
    exercise03.RingBufferWrapper var52 = new exercise03.RingBufferWrapper();
    boolean var53 = var52.isEmpty();
    boolean var54 = var52.isEmpty();
    boolean var55 = var52.isEmpty();
    int var56 = var52.size();
    var46.enqueue((java.lang.Object)var52);
    var33.enqueue((java.lang.Object)var52);
    exercise03.RingBufferWrapper var59 = new exercise03.RingBufferWrapper();
    boolean var60 = var59.isEmpty();
    var59.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var63 = var59.dequeue();
    boolean var64 = var59.isEmpty();
    var59.enqueue((java.lang.Object)"hi!");
    var52.enqueue((java.lang.Object)var59);
    java.lang.Object var68 = var52.dequeue();
    var16.enqueue(var68);
    java.lang.Object var70 = var16.dequeue();
    var0.enqueue(var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 10+ "'", var20.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + 10+ "'", var37.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + 10+ "'", var50.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + (-1.0d)+ "'", var63.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var70);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test188");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    int var10 = var9.size();
    var9.enqueue((java.lang.Object)10);
    java.lang.Object var13 = var9.dequeue();
    boolean var14 = var9.isEmpty();
    exercise03.RingBufferWrapper var15 = new exercise03.RingBufferWrapper();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    boolean var18 = var15.isEmpty();
    int var19 = var15.size();
    var9.enqueue((java.lang.Object)var15);
    boolean var21 = var15.isEmpty();
    exercise03.RingBufferWrapper var22 = new exercise03.RingBufferWrapper();
    boolean var23 = var22.isEmpty();
    boolean var24 = var22.isEmpty();
    var22.enqueue((java.lang.Object)10.0f);
    java.lang.Object var27 = var22.dequeue();
    var22.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var30 = var22.dequeue();
    int var31 = var22.size();
    var15.enqueue((java.lang.Object)var31);
    var0.enqueue((java.lang.Object)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)100+ "'", var7.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10+ "'", var13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + 10.0f+ "'", var27.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + (-1.0f)+ "'", var30.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test189");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var8 = var0.dequeue();
    int var9 = var0.size();
    exercise03.RingBufferWrapper var10 = new exercise03.RingBufferWrapper();
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    var10.enqueue((java.lang.Object)10.0f);
    java.lang.Object var15 = var10.dequeue();
    int var16 = var10.size();
    int var17 = var10.size();
    var10.enqueue((java.lang.Object)10L);
    var0.enqueue((java.lang.Object)var10);
    java.lang.Object var21 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 10.0f+ "'", var15.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test190");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    int var9 = var0.size();
    exercise03.RingBufferWrapper var10 = new exercise03.RingBufferWrapper();
    boolean var11 = var10.isEmpty();
    var10.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var14 = var10.dequeue();
    var10.enqueue((java.lang.Object)(byte)0);
    var0.enqueue((java.lang.Object)var10);
    java.lang.Object var18 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + (-1.0d)+ "'", var14.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test191");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    int var7 = var0.size();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    int var10 = var9.size();
    var9.enqueue((java.lang.Object)10);
    java.lang.Object var13 = var9.dequeue();
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    var14.enqueue((java.lang.Object)'a');
    java.lang.Object var17 = var14.dequeue();
    int var18 = var14.size();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    var19.enqueue((java.lang.Object)'a');
    java.lang.Object var22 = var19.dequeue();
    var19.enqueue((java.lang.Object)"hi!");
    var14.enqueue((java.lang.Object)var19);
    java.lang.Object var26 = var14.dequeue();
    var9.enqueue(var26);
    var0.enqueue((java.lang.Object)var9);
    java.lang.Object var29 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var30 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10+ "'", var13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 'a'+ "'", var17.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + 'a'+ "'", var22.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test192");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var8 = var0.dequeue();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    var9.enqueue((java.lang.Object)10.0f);
    java.lang.Object var14 = var9.dequeue();
    boolean var15 = var9.isEmpty();
    boolean var16 = var9.isEmpty();
    int var17 = var9.size();
    boolean var18 = var9.isEmpty();
    int var19 = var9.size();
    exercise03.RingBufferWrapper var20 = new exercise03.RingBufferWrapper();
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    boolean var23 = var20.isEmpty();
    int var24 = var20.size();
    int var25 = var20.size();
    boolean var26 = var20.isEmpty();
    boolean var27 = var20.isEmpty();
    boolean var28 = var20.isEmpty();
    var9.enqueue((java.lang.Object)var20);
    var0.enqueue((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 10.0f+ "'", var14.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test193");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    int var5 = var0.size();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    int var9 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test194");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    int var5 = var0.size();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test195");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    int var26 = var19.size();
    boolean var27 = var19.isEmpty();
    exercise03.RingBufferWrapper var28 = new exercise03.RingBufferWrapper();
    var28.enqueue((java.lang.Object)'a');
    java.lang.Object var31 = var28.dequeue();
    int var32 = var28.size();
    exercise03.RingBufferWrapper var33 = new exercise03.RingBufferWrapper();
    var33.enqueue((java.lang.Object)'a');
    java.lang.Object var36 = var33.dequeue();
    var33.enqueue((java.lang.Object)"hi!");
    var28.enqueue((java.lang.Object)var33);
    var19.enqueue((java.lang.Object)var33);
    java.lang.Object var41 = var33.dequeue();
    boolean var42 = var33.isEmpty();
    exercise03.RingBufferWrapper var43 = new exercise03.RingBufferWrapper();
    boolean var44 = var43.isEmpty();
    boolean var45 = var43.isEmpty();
    var43.enqueue((java.lang.Object)10.0f);
    java.lang.Object var48 = var43.dequeue();
    int var49 = var43.size();
    boolean var50 = var43.isEmpty();
    exercise03.RingBufferWrapper var51 = new exercise03.RingBufferWrapper();
    boolean var52 = var51.isEmpty();
    var51.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var55 = var51.dequeue();
    boolean var56 = var51.isEmpty();
    int var57 = var51.size();
    boolean var58 = var51.isEmpty();
    var43.enqueue((java.lang.Object)var51);
    var33.enqueue((java.lang.Object)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + 'a'+ "'", var31.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + 'a'+ "'", var36.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "hi!"+ "'", var41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + 10.0f+ "'", var48.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + (-1.0d)+ "'", var55.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test196");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    int var7 = var0.size();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    int var10 = var0.size();
    boolean var11 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test197");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    boolean var27 = var26.isEmpty();
    var26.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var30 = var26.dequeue();
    boolean var31 = var26.isEmpty();
    var26.enqueue((java.lang.Object)"hi!");
    var19.enqueue((java.lang.Object)var26);
    java.lang.Object var35 = var26.dequeue();
    exercise03.RingBufferWrapper var36 = new exercise03.RingBufferWrapper();
    boolean var37 = var36.isEmpty();
    var36.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var40 = var36.dequeue();
    var36.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var43 = var36.dequeue();
    int var44 = var36.size();
    int var45 = var36.size();
    exercise03.RingBufferWrapper var46 = new exercise03.RingBufferWrapper();
    int var47 = var46.size();
    var46.enqueue((java.lang.Object)10);
    java.lang.Object var50 = var46.dequeue();
    boolean var51 = var46.isEmpty();
    exercise03.RingBufferWrapper var52 = new exercise03.RingBufferWrapper();
    boolean var53 = var52.isEmpty();
    boolean var54 = var52.isEmpty();
    boolean var55 = var52.isEmpty();
    int var56 = var52.size();
    var46.enqueue((java.lang.Object)var52);
    java.lang.Object var58 = var46.dequeue();
    exercise03.RingBufferWrapper var59 = new exercise03.RingBufferWrapper();
    int var60 = var59.size();
    var59.enqueue((java.lang.Object)10);
    java.lang.Object var63 = var59.dequeue();
    boolean var64 = var59.isEmpty();
    exercise03.RingBufferWrapper var65 = new exercise03.RingBufferWrapper();
    boolean var66 = var65.isEmpty();
    boolean var67 = var65.isEmpty();
    boolean var68 = var65.isEmpty();
    int var69 = var65.size();
    var59.enqueue((java.lang.Object)var65);
    var46.enqueue((java.lang.Object)var65);
    exercise03.RingBufferWrapper var72 = new exercise03.RingBufferWrapper();
    boolean var73 = var72.isEmpty();
    boolean var74 = var72.isEmpty();
    var72.enqueue((java.lang.Object)10.0f);
    java.lang.Object var77 = var72.dequeue();
    var72.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var80 = var72.dequeue();
    boolean var81 = var72.isEmpty();
    exercise03.RingBufferWrapper var82 = new exercise03.RingBufferWrapper();
    boolean var83 = var82.isEmpty();
    boolean var84 = var82.isEmpty();
    var82.enqueue((java.lang.Object)10.0f);
    java.lang.Object var87 = var82.dequeue();
    boolean var88 = var82.isEmpty();
    int var89 = var82.size();
    var72.enqueue((java.lang.Object)var89);
    var65.enqueue((java.lang.Object)var72);
    var36.enqueue((java.lang.Object)var65);
    var26.enqueue((java.lang.Object)var36);
    java.lang.Object var94 = var36.dequeue();
    boolean var95 = var36.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + (-1.0d)+ "'", var30.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + (-1.0d)+ "'", var40.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + (byte)100+ "'", var43.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + 10+ "'", var50.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + 10+ "'", var63.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + 10.0f+ "'", var77.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + (-1.0f)+ "'", var80.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + 10.0f+ "'", var87.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == true);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test198");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    var9.enqueue((java.lang.Object)'a');
    java.lang.Object var12 = var9.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    java.lang.Object var25 = var13.dequeue();
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    int var27 = var26.size();
    var26.enqueue((java.lang.Object)10);
    java.lang.Object var30 = var26.dequeue();
    boolean var31 = var26.isEmpty();
    exercise03.RingBufferWrapper var32 = new exercise03.RingBufferWrapper();
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    boolean var35 = var32.isEmpty();
    int var36 = var32.size();
    var26.enqueue((java.lang.Object)var32);
    var13.enqueue((java.lang.Object)var32);
    var9.enqueue((java.lang.Object)var13);
    var0.enqueue((java.lang.Object)var13);
    java.lang.Object var41 = var13.dequeue();
    exercise03.RingBufferWrapper var42 = new exercise03.RingBufferWrapper();
    int var43 = var42.size();
    var42.enqueue((java.lang.Object)10L);
    java.lang.Object var46 = var42.dequeue();
    var42.enqueue((java.lang.Object)(short)10);
    java.lang.Object var49 = var42.dequeue();
    int var50 = var42.size();
    exercise03.RingBufferWrapper var51 = new exercise03.RingBufferWrapper();
    boolean var52 = var51.isEmpty();
    boolean var53 = var51.isEmpty();
    int var54 = var51.size();
    var42.enqueue((java.lang.Object)var54);
    java.lang.Object var56 = var42.dequeue();
    boolean var57 = var42.isEmpty();
    var13.enqueue((java.lang.Object)var57);
    java.lang.Object var59 = var13.dequeue();
    boolean var60 = var13.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)100+ "'", var7.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 'a'+ "'", var12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + 10+ "'", var30.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + 10L+ "'", var46.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + (short)10+ "'", var49.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + 0+ "'", var56.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + true+ "'", var59.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test199");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    boolean var8 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test200");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    int var4 = var0.size();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    var5.enqueue((java.lang.Object)'a');
    java.lang.Object var8 = var5.dequeue();
    var5.enqueue((java.lang.Object)"hi!");
    var0.enqueue((java.lang.Object)var5);
    java.lang.Object var12 = var0.dequeue();
    int var13 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 'a'+ "'", var8.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test201");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    int var13 = var9.size();
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    var14.enqueue((java.lang.Object)10.0f);
    java.lang.Object var19 = var14.dequeue();
    boolean var20 = var14.isEmpty();
    boolean var21 = var14.isEmpty();
    var9.enqueue((java.lang.Object)var14);
    var0.enqueue((java.lang.Object)var14);
    int var24 = var14.size();
    exercise03.RingBufferWrapper var25 = new exercise03.RingBufferWrapper();
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    boolean var28 = var25.isEmpty();
    int var29 = var25.size();
    int var30 = var25.size();
    exercise03.RingBufferWrapper var31 = new exercise03.RingBufferWrapper();
    boolean var32 = var31.isEmpty();
    var31.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var35 = var31.dequeue();
    boolean var36 = var31.isEmpty();
    var31.enqueue((java.lang.Object)"hi!");
    var25.enqueue((java.lang.Object)"hi!");
    java.lang.Object var40 = var25.dequeue();
    boolean var41 = var25.isEmpty();
    var14.enqueue((java.lang.Object)var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + 10.0f+ "'", var19.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + (-1.0d)+ "'", var35.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "hi!"+ "'", var40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test202");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    int var10 = var0.size();
    exercise03.RingBufferWrapper var11 = new exercise03.RingBufferWrapper();
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    int var15 = var11.size();
    int var16 = var11.size();
    boolean var17 = var11.isEmpty();
    boolean var18 = var11.isEmpty();
    boolean var19 = var11.isEmpty();
    var0.enqueue((java.lang.Object)var11);
    int var21 = var11.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test203");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    exercise03.RingBufferWrapper var1 = new exercise03.RingBufferWrapper();
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)100.0f);
    java.lang.Object var8 = var1.dequeue();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    var9.enqueue((java.lang.Object)'a');
    java.lang.Object var12 = var9.dequeue();
    var9.enqueue((java.lang.Object)"hi!");
    java.lang.Object var15 = var9.dequeue();
    int var16 = var9.size();
    exercise03.RingBufferWrapper var17 = new exercise03.RingBufferWrapper();
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    var9.enqueue((java.lang.Object)var19);
    java.lang.Object var21 = var9.dequeue();
    var1.enqueue((java.lang.Object)var9);
    int var23 = var9.size();
    var0.enqueue((java.lang.Object)var9);
    exercise03.RingBufferWrapper var25 = new exercise03.RingBufferWrapper();
    boolean var26 = var25.isEmpty();
    var25.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var29 = var25.dequeue();
    int var30 = var25.size();
    exercise03.RingBufferWrapper var31 = new exercise03.RingBufferWrapper();
    boolean var32 = var31.isEmpty();
    boolean var33 = var31.isEmpty();
    var31.enqueue((java.lang.Object)10.0f);
    var25.enqueue((java.lang.Object)var31);
    var9.enqueue((java.lang.Object)var25);
    java.lang.Object var38 = var9.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var39 = var9.dequeue();
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
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 100.0f+ "'", var8.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 'a'+ "'", var12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + true+ "'", var21.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + (-1.0d)+ "'", var29.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test204");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    exercise03.RingBufferWrapper var7 = new exercise03.RingBufferWrapper();
    int var8 = var7.size();
    var7.enqueue((java.lang.Object)10);
    java.lang.Object var11 = var7.dequeue();
    var7.enqueue((java.lang.Object)1.0d);
    java.lang.Object var14 = var7.dequeue();
    var0.enqueue(var14);
    java.lang.Object var16 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 10+ "'", var11.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 1.0d+ "'", var14.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 1.0d+ "'", var16.equals(1.0d));

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test205");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    int var5 = var0.size();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    int var10 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test206");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test207");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    int var7 = var0.size();
    boolean var8 = var0.isEmpty();
    int var9 = var0.size();
    exercise03.RingBufferWrapper var10 = new exercise03.RingBufferWrapper();
    boolean var11 = var10.isEmpty();
    boolean var12 = var10.isEmpty();
    var10.enqueue((java.lang.Object)10.0f);
    java.lang.Object var15 = var10.dequeue();
    int var16 = var10.size();
    boolean var17 = var10.isEmpty();
    var10.enqueue((java.lang.Object)0);
    var0.enqueue((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 10.0f+ "'", var15.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test208");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    var5.enqueue((java.lang.Object)10.0f);
    java.lang.Object var10 = var5.dequeue();
    boolean var11 = var5.isEmpty();
    boolean var12 = var5.isEmpty();
    var0.enqueue((java.lang.Object)var5);
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    int var15 = var14.size();
    var14.enqueue((java.lang.Object)10);
    java.lang.Object var18 = var14.dequeue();
    boolean var19 = var14.isEmpty();
    exercise03.RingBufferWrapper var20 = new exercise03.RingBufferWrapper();
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    boolean var23 = var20.isEmpty();
    int var24 = var20.size();
    var14.enqueue((java.lang.Object)var20);
    java.lang.Object var26 = var14.dequeue();
    exercise03.RingBufferWrapper var27 = new exercise03.RingBufferWrapper();
    int var28 = var27.size();
    var27.enqueue((java.lang.Object)10);
    java.lang.Object var31 = var27.dequeue();
    boolean var32 = var27.isEmpty();
    exercise03.RingBufferWrapper var33 = new exercise03.RingBufferWrapper();
    boolean var34 = var33.isEmpty();
    boolean var35 = var33.isEmpty();
    boolean var36 = var33.isEmpty();
    int var37 = var33.size();
    var27.enqueue((java.lang.Object)var33);
    var14.enqueue((java.lang.Object)var33);
    var33.enqueue((java.lang.Object)(byte)10);
    var5.enqueue((java.lang.Object)(byte)10);
    java.lang.Object var43 = var5.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var44 = var5.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 10.0f+ "'", var10.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 10+ "'", var18.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + 10+ "'", var31.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + (byte)10+ "'", var43.equals((byte)10));

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test209");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    boolean var10 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)100+ "'", var7.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test210");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    int var8 = var0.size();
    int var9 = var0.size();
    boolean var10 = var0.isEmpty();
    boolean var11 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test211");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10L);
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var0.dequeue();
    boolean var15 = var0.isEmpty();
    int var16 = var0.size();
    boolean var17 = var0.isEmpty();
    boolean var18 = var0.isEmpty();
    int var19 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10L+ "'", var4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)10+ "'", var7.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0+ "'", var14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test212");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    int var7 = var0.size();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    boolean var9 = var8.isEmpty();
    var8.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var12 = var8.dequeue();
    boolean var13 = var8.isEmpty();
    int var14 = var8.size();
    boolean var15 = var8.isEmpty();
    int var16 = var8.size();
    int var17 = var8.size();
    var0.enqueue((java.lang.Object)var8);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var19 = var8.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (-1.0d)+ "'", var12.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test213");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    int var5 = var0.size();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    var6.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var10 = var6.dequeue();
    boolean var11 = var6.isEmpty();
    var6.enqueue((java.lang.Object)"hi!");
    var0.enqueue((java.lang.Object)"hi!");
    java.lang.Object var15 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test214");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    int var5 = var0.size();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    var6.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var10 = var6.dequeue();
    boolean var11 = var6.isEmpty();
    var0.enqueue((java.lang.Object)var11);
    java.lang.Object var13 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + true+ "'", var13.equals(true));

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test215");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    boolean var26 = var19.isEmpty();
    exercise03.RingBufferWrapper var27 = new exercise03.RingBufferWrapper();
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    var27.enqueue((java.lang.Object)10.0f);
    java.lang.Object var32 = var27.dequeue();
    boolean var33 = var27.isEmpty();
    int var34 = var27.size();
    int var35 = var27.size();
    var19.enqueue((java.lang.Object)var27);
    exercise03.RingBufferWrapper var37 = new exercise03.RingBufferWrapper();
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    boolean var40 = var37.isEmpty();
    int var41 = var37.size();
    int var42 = var37.size();
    exercise03.RingBufferWrapper var43 = new exercise03.RingBufferWrapper();
    boolean var44 = var43.isEmpty();
    var43.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var47 = var43.dequeue();
    boolean var48 = var43.isEmpty();
    var43.enqueue((java.lang.Object)"hi!");
    var37.enqueue((java.lang.Object)"hi!");
    java.lang.Object var52 = var37.dequeue();
    var27.enqueue((java.lang.Object)var37);
    boolean var54 = var37.isEmpty();
    int var55 = var37.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + 10.0f+ "'", var32.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + (-1.0d)+ "'", var47.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test216");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10L);
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var0.dequeue();
    boolean var15 = var0.isEmpty();
    int var16 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10L+ "'", var4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)10+ "'", var7.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0+ "'", var14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test217");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    int var3 = var0.size();
    exercise03.RingBufferWrapper var4 = new exercise03.RingBufferWrapper();
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    var4.enqueue((java.lang.Object)10.0f);
    java.lang.Object var9 = var4.dequeue();
    var4.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var12 = var4.dequeue();
    boolean var13 = var4.isEmpty();
    int var14 = var4.size();
    var0.enqueue((java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var4.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 10.0f+ "'", var9.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (-1.0f)+ "'", var12.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test218");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    int var26 = var19.size();
    boolean var27 = var19.isEmpty();
    int var28 = var19.size();
    exercise03.RingBufferWrapper var29 = new exercise03.RingBufferWrapper();
    boolean var30 = var29.isEmpty();
    boolean var31 = var29.isEmpty();
    boolean var32 = var29.isEmpty();
    int var33 = var29.size();
    exercise03.RingBufferWrapper var34 = new exercise03.RingBufferWrapper();
    boolean var35 = var34.isEmpty();
    boolean var36 = var34.isEmpty();
    var34.enqueue((java.lang.Object)10.0f);
    java.lang.Object var39 = var34.dequeue();
    boolean var40 = var34.isEmpty();
    boolean var41 = var34.isEmpty();
    var29.enqueue((java.lang.Object)var34);
    var19.enqueue((java.lang.Object)var29);
    java.lang.Object var44 = var19.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + 10.0f+ "'", var39.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test219");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    var6.enqueue((java.lang.Object)'a');
    java.lang.Object var9 = var6.dequeue();
    var6.enqueue((java.lang.Object)"hi!");
    java.lang.Object var12 = var6.dequeue();
    int var13 = var6.size();
    boolean var14 = var6.isEmpty();
    java.lang.Object var15 = new java.lang.Object();
    var6.enqueue(var15);
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var18 = var6.dequeue();
    int var19 = var6.size();
    exercise03.RingBufferWrapper var20 = new exercise03.RingBufferWrapper();
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    var20.enqueue((java.lang.Object)10.0f);
    java.lang.Object var25 = var20.dequeue();
    boolean var26 = var20.isEmpty();
    int var27 = var20.size();
    int var28 = var20.size();
    int var29 = var20.size();
    int var30 = var20.size();
    int var31 = var20.size();
    int var32 = var20.size();
    exercise03.RingBufferWrapper var33 = new exercise03.RingBufferWrapper();
    int var34 = var33.size();
    var33.enqueue((java.lang.Object)10);
    java.lang.Object var37 = var33.dequeue();
    boolean var38 = var33.isEmpty();
    exercise03.RingBufferWrapper var39 = new exercise03.RingBufferWrapper();
    boolean var40 = var39.isEmpty();
    boolean var41 = var39.isEmpty();
    boolean var42 = var39.isEmpty();
    int var43 = var39.size();
    var33.enqueue((java.lang.Object)var39);
    java.lang.Object var45 = var33.dequeue();
    int var46 = var33.size();
    int var47 = var33.size();
    boolean var48 = var33.isEmpty();
    int var49 = var33.size();
    exercise03.RingBufferWrapper var50 = new exercise03.RingBufferWrapper();
    int var51 = var50.size();
    var50.enqueue((java.lang.Object)10);
    java.lang.Object var54 = var50.dequeue();
    boolean var55 = var50.isEmpty();
    exercise03.RingBufferWrapper var56 = new exercise03.RingBufferWrapper();
    boolean var57 = var56.isEmpty();
    boolean var58 = var56.isEmpty();
    boolean var59 = var56.isEmpty();
    int var60 = var56.size();
    var50.enqueue((java.lang.Object)var56);
    java.lang.Object var62 = var50.dequeue();
    exercise03.RingBufferWrapper var63 = new exercise03.RingBufferWrapper();
    int var64 = var63.size();
    var63.enqueue((java.lang.Object)10);
    java.lang.Object var67 = var63.dequeue();
    boolean var68 = var63.isEmpty();
    exercise03.RingBufferWrapper var69 = new exercise03.RingBufferWrapper();
    boolean var70 = var69.isEmpty();
    boolean var71 = var69.isEmpty();
    boolean var72 = var69.isEmpty();
    int var73 = var69.size();
    var63.enqueue((java.lang.Object)var69);
    var50.enqueue((java.lang.Object)var69);
    exercise03.RingBufferWrapper var76 = new exercise03.RingBufferWrapper();
    boolean var77 = var76.isEmpty();
    var76.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var80 = var76.dequeue();
    boolean var81 = var76.isEmpty();
    var76.enqueue((java.lang.Object)"hi!");
    var69.enqueue((java.lang.Object)var76);
    java.lang.Object var85 = var69.dequeue();
    var33.enqueue(var85);
    var20.enqueue(var85);
    var6.enqueue(var85);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 'a'+ "'", var9.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + 10.0f+ "'", var25.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + 10+ "'", var37.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + 10+ "'", var54.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + 10+ "'", var67.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + (-1.0d)+ "'", var80.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var85);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test220");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    exercise03.RingBufferWrapper var7 = new exercise03.RingBufferWrapper();
    int var8 = var7.size();
    var7.enqueue((java.lang.Object)10L);
    java.lang.Object var11 = var7.dequeue();
    var0.enqueue(var11);
    java.lang.Object var13 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 10L+ "'", var11.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10L+ "'", var13.equals(10L));

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test221");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (short)10+ "'", var5.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test222");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    int var13 = var0.size();
    int var14 = var0.size();
    exercise03.RingBufferWrapper var15 = new exercise03.RingBufferWrapper();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    var15.enqueue((java.lang.Object)10.0f);
    java.lang.Object var20 = var15.dequeue();
    var15.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var23 = var15.dequeue();
    var0.enqueue((java.lang.Object)var15);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var25 = var15.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 10.0f+ "'", var20.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + (-1.0f)+ "'", var23.equals((-1.0f)));

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test223");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (short)10+ "'", var5.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test224");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test225");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    boolean var4 = var0.isEmpty();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    boolean var6 = var5.isEmpty();
    var5.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var9 = var5.dequeue();
    var5.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var12 = var5.dequeue();
    int var13 = var5.size();
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    var14.enqueue((java.lang.Object)'a');
    java.lang.Object var17 = var14.dequeue();
    exercise03.RingBufferWrapper var18 = new exercise03.RingBufferWrapper();
    int var19 = var18.size();
    var18.enqueue((java.lang.Object)10);
    java.lang.Object var22 = var18.dequeue();
    boolean var23 = var18.isEmpty();
    exercise03.RingBufferWrapper var24 = new exercise03.RingBufferWrapper();
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    boolean var27 = var24.isEmpty();
    int var28 = var24.size();
    var18.enqueue((java.lang.Object)var24);
    java.lang.Object var30 = var18.dequeue();
    exercise03.RingBufferWrapper var31 = new exercise03.RingBufferWrapper();
    int var32 = var31.size();
    var31.enqueue((java.lang.Object)10);
    java.lang.Object var35 = var31.dequeue();
    boolean var36 = var31.isEmpty();
    exercise03.RingBufferWrapper var37 = new exercise03.RingBufferWrapper();
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    boolean var40 = var37.isEmpty();
    int var41 = var37.size();
    var31.enqueue((java.lang.Object)var37);
    var18.enqueue((java.lang.Object)var37);
    var14.enqueue((java.lang.Object)var18);
    var5.enqueue((java.lang.Object)var18);
    java.lang.Object var46 = var18.dequeue();
    var0.enqueue((java.lang.Object)var18);
    boolean var48 = var18.isEmpty();
    boolean var49 = var18.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0d)+ "'", var9.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (byte)100+ "'", var12.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 'a'+ "'", var17.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + 10+ "'", var22.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + 10+ "'", var35.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test226");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    boolean var14 = var13.isEmpty();
    var0.enqueue((java.lang.Object)var14);
    java.lang.Object var16 = var0.dequeue();
    boolean var17 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var18 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + true+ "'", var16.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test227");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    int var5 = var0.size();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    int var9 = var0.size();
    exercise03.RingBufferWrapper var10 = new exercise03.RingBufferWrapper();
    int var11 = var10.size();
    var10.enqueue((java.lang.Object)10);
    java.lang.Object var14 = var10.dequeue();
    boolean var15 = var10.isEmpty();
    exercise03.RingBufferWrapper var16 = new exercise03.RingBufferWrapper();
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    int var20 = var16.size();
    var10.enqueue((java.lang.Object)var16);
    java.lang.Object var22 = var10.dequeue();
    exercise03.RingBufferWrapper var23 = new exercise03.RingBufferWrapper();
    int var24 = var23.size();
    var23.enqueue((java.lang.Object)10);
    java.lang.Object var27 = var23.dequeue();
    boolean var28 = var23.isEmpty();
    exercise03.RingBufferWrapper var29 = new exercise03.RingBufferWrapper();
    boolean var30 = var29.isEmpty();
    boolean var31 = var29.isEmpty();
    boolean var32 = var29.isEmpty();
    int var33 = var29.size();
    var23.enqueue((java.lang.Object)var29);
    var10.enqueue((java.lang.Object)var29);
    boolean var36 = var29.isEmpty();
    exercise03.RingBufferWrapper var37 = new exercise03.RingBufferWrapper();
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    var37.enqueue((java.lang.Object)10.0f);
    java.lang.Object var42 = var37.dequeue();
    boolean var43 = var37.isEmpty();
    int var44 = var37.size();
    int var45 = var37.size();
    var29.enqueue((java.lang.Object)var37);
    boolean var47 = var37.isEmpty();
    exercise03.RingBufferWrapper var48 = new exercise03.RingBufferWrapper();
    int var49 = var48.size();
    var48.enqueue((java.lang.Object)10);
    java.lang.Object var52 = var48.dequeue();
    int var53 = var48.size();
    exercise03.RingBufferWrapper var54 = new exercise03.RingBufferWrapper();
    boolean var55 = var54.isEmpty();
    boolean var56 = var54.isEmpty();
    boolean var57 = var54.isEmpty();
    int var58 = var54.size();
    int var59 = var54.size();
    boolean var60 = var54.isEmpty();
    int var61 = var54.size();
    int var62 = var54.size();
    var48.enqueue((java.lang.Object)var54);
    var37.enqueue((java.lang.Object)var48);
    var0.enqueue((java.lang.Object)var37);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 10+ "'", var14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + 10+ "'", var27.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + 10.0f+ "'", var42.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + 10+ "'", var52.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test228");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    var5.enqueue((java.lang.Object)10.0f);
    java.lang.Object var10 = var5.dequeue();
    boolean var11 = var5.isEmpty();
    boolean var12 = var5.isEmpty();
    var0.enqueue((java.lang.Object)var5);
    java.lang.Object var14 = var0.dequeue();
    int var15 = var0.size();
    boolean var16 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 10.0f+ "'", var10.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test229");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var9);
    boolean var14 = var9.isEmpty();
    int var15 = var9.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test230");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    int var7 = var6.size();
    int var8 = var6.size();
    int var9 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    boolean var11 = var6.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var6.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test231");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    int var13 = var9.size();
    boolean var14 = var9.isEmpty();
    int var15 = var9.size();
    exercise03.RingBufferWrapper var16 = new exercise03.RingBufferWrapper();
    var16.enqueue((java.lang.Object)'a');
    var9.enqueue((java.lang.Object)var16);
    java.lang.Object var20 = var9.dequeue();
    var0.enqueue((java.lang.Object)var9);
    java.lang.Object var22 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test232");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    int var4 = var0.size();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    var5.enqueue((java.lang.Object)'a');
    java.lang.Object var8 = var5.dequeue();
    var5.enqueue((java.lang.Object)"hi!");
    var0.enqueue((java.lang.Object)var5);
    java.lang.Object var12 = var5.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    java.lang.Object var25 = var13.dequeue();
    int var26 = var13.size();
    int var27 = var13.size();
    boolean var28 = var13.isEmpty();
    int var29 = var13.size();
    exercise03.RingBufferWrapper var30 = new exercise03.RingBufferWrapper();
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    boolean var33 = var30.isEmpty();
    var30.enqueue((java.lang.Object)(-1.0d));
    var13.enqueue((java.lang.Object)var30);
    var5.enqueue((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 'a'+ "'", var8.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test233");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var4 = var0.dequeue();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    int var6 = var5.size();
    var5.enqueue((java.lang.Object)10);
    java.lang.Object var9 = var5.dequeue();
    boolean var10 = var5.isEmpty();
    int var11 = var5.size();
    exercise03.RingBufferWrapper var12 = new exercise03.RingBufferWrapper();
    int var13 = var12.size();
    var12.enqueue((java.lang.Object)10L);
    java.lang.Object var16 = var12.dequeue();
    var5.enqueue(var16);
    var0.enqueue(var16);
    java.lang.Object var19 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (short)10+ "'", var4.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 10+ "'", var9.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 10L+ "'", var16.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + 10L+ "'", var19.equals(10L));

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test234");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    int var13 = var9.size();
    boolean var14 = var9.isEmpty();
    int var15 = var9.size();
    exercise03.RingBufferWrapper var16 = new exercise03.RingBufferWrapper();
    var16.enqueue((java.lang.Object)'a');
    var9.enqueue((java.lang.Object)var16);
    java.lang.Object var20 = var9.dequeue();
    var0.enqueue((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test235");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    var0.enqueue((java.lang.Object)"hi!");
    java.lang.Object var6 = var0.dequeue();
    int var7 = var0.size();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    var0.enqueue((java.lang.Object)var10);
    java.lang.Object var12 = var0.dequeue();
    int var13 = var0.size();
    boolean var14 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + true+ "'", var12.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test236");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    int var5 = var0.size();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    int var7 = var6.size();
    var6.enqueue((java.lang.Object)10L);
    java.lang.Object var10 = var6.dequeue();
    var6.enqueue((java.lang.Object)(short)10);
    java.lang.Object var13 = var6.dequeue();
    int var14 = var6.size();
    exercise03.RingBufferWrapper var15 = new exercise03.RingBufferWrapper();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    int var18 = var15.size();
    var6.enqueue((java.lang.Object)var18);
    java.lang.Object var20 = var6.dequeue();
    boolean var21 = var6.isEmpty();
    int var22 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 10L+ "'", var10.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + (short)10+ "'", var13.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 0+ "'", var20.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test237");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    int var5 = var0.size();
    boolean var6 = var0.isEmpty();
    exercise03.RingBufferWrapper var7 = new exercise03.RingBufferWrapper();
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    var7.enqueue((java.lang.Object)10.0f);
    java.lang.Object var12 = var7.dequeue();
    int var13 = var7.size();
    boolean var14 = var7.isEmpty();
    int var15 = var7.size();
    boolean var16 = var7.isEmpty();
    boolean var17 = var7.isEmpty();
    var0.enqueue((java.lang.Object)var7);
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    int var24 = var19.size();
    boolean var25 = var19.isEmpty();
    int var26 = var19.size();
    int var27 = var19.size();
    boolean var28 = var19.isEmpty();
    exercise03.RingBufferWrapper var29 = new exercise03.RingBufferWrapper();
    var29.enqueue((java.lang.Object)'a');
    java.lang.Object var32 = var29.dequeue();
    var29.enqueue((java.lang.Object)"hi!");
    java.lang.Object var35 = var29.dequeue();
    int var36 = var29.size();
    int var37 = var29.size();
    var19.enqueue((java.lang.Object)var29);
    java.lang.Object var39 = var19.dequeue();
    var7.enqueue(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 10.0f+ "'", var12.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + 'a'+ "'", var32.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test238");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    int var8 = var0.size();
    int var9 = var0.size();
    boolean var10 = var0.isEmpty();
    int var11 = var0.size();
    boolean var12 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test239");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10L);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10L+ "'", var4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test240");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    int var9 = var0.size();
    int var10 = var0.size();
    var0.enqueue((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test241");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    var6.enqueue((java.lang.Object)'a');
    java.lang.Object var9 = var6.dequeue();
    var6.enqueue((java.lang.Object)"hi!");
    java.lang.Object var12 = var6.dequeue();
    int var13 = var6.size();
    boolean var14 = var6.isEmpty();
    java.lang.Object var15 = new java.lang.Object();
    var6.enqueue(var15);
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var18 = var6.dequeue();
    boolean var19 = var6.isEmpty();
    int var20 = var6.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 'a'+ "'", var9.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test242");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    boolean var12 = var6.isEmpty();
    boolean var13 = var6.isEmpty();
    boolean var14 = var6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test243");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    int var7 = var0.size();
    boolean var8 = var0.isEmpty();
    int var9 = var0.size();
    boolean var10 = var0.isEmpty();
    var0.enqueue((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test244");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10L);
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var0.dequeue();
    boolean var15 = var0.isEmpty();
    exercise03.RingBufferWrapper var16 = new exercise03.RingBufferWrapper();
    boolean var17 = var16.isEmpty();
    int var18 = var16.size();
    int var19 = var16.size();
    boolean var20 = var16.isEmpty();
    var0.enqueue((java.lang.Object)var16);
    java.lang.Object var22 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10L+ "'", var4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)10+ "'", var7.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0+ "'", var14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test245");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    var0.enqueue((java.lang.Object)100.0f);
    java.lang.Object var7 = var0.dequeue();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    var8.enqueue((java.lang.Object)'a');
    java.lang.Object var11 = var8.dequeue();
    var8.enqueue((java.lang.Object)"hi!");
    java.lang.Object var14 = var8.dequeue();
    int var15 = var8.size();
    exercise03.RingBufferWrapper var16 = new exercise03.RingBufferWrapper();
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    var8.enqueue((java.lang.Object)var18);
    java.lang.Object var20 = var8.dequeue();
    var0.enqueue((java.lang.Object)var8);
    int var22 = var8.size();
    exercise03.RingBufferWrapper var23 = new exercise03.RingBufferWrapper();
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    boolean var26 = var23.isEmpty();
    int var27 = var23.size();
    int var28 = var23.size();
    exercise03.RingBufferWrapper var29 = new exercise03.RingBufferWrapper();
    boolean var30 = var29.isEmpty();
    var29.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var33 = var29.dequeue();
    boolean var34 = var29.isEmpty();
    var29.enqueue((java.lang.Object)"hi!");
    var23.enqueue((java.lang.Object)"hi!");
    java.lang.Object var38 = var23.dequeue();
    int var39 = var23.size();
    var8.enqueue((java.lang.Object)var23);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var41 = var23.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 100.0f+ "'", var7.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 'a'+ "'", var11.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + true+ "'", var20.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + (-1.0d)+ "'", var33.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test246");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    int var13 = var0.size();
    int var14 = var0.size();
    exercise03.RingBufferWrapper var15 = new exercise03.RingBufferWrapper();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    var15.enqueue((java.lang.Object)10.0f);
    java.lang.Object var20 = var15.dequeue();
    var15.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var23 = var15.dequeue();
    var0.enqueue((java.lang.Object)var15);
    int var25 = var15.size();
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    int var27 = var26.size();
    var26.enqueue((java.lang.Object)10);
    java.lang.Object var30 = var26.dequeue();
    boolean var31 = var26.isEmpty();
    exercise03.RingBufferWrapper var32 = new exercise03.RingBufferWrapper();
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    boolean var35 = var32.isEmpty();
    int var36 = var32.size();
    var26.enqueue((java.lang.Object)var32);
    java.lang.Object var38 = var26.dequeue();
    exercise03.RingBufferWrapper var39 = new exercise03.RingBufferWrapper();
    int var40 = var39.size();
    var39.enqueue((java.lang.Object)10);
    java.lang.Object var43 = var39.dequeue();
    boolean var44 = var39.isEmpty();
    exercise03.RingBufferWrapper var45 = new exercise03.RingBufferWrapper();
    boolean var46 = var45.isEmpty();
    boolean var47 = var45.isEmpty();
    boolean var48 = var45.isEmpty();
    int var49 = var45.size();
    var39.enqueue((java.lang.Object)var45);
    var26.enqueue((java.lang.Object)var45);
    var45.enqueue((java.lang.Object)(byte)10);
    java.lang.Object var54 = var45.dequeue();
    var15.enqueue((java.lang.Object)var45);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var56 = var45.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 10.0f+ "'", var20.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + (-1.0f)+ "'", var23.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + 10+ "'", var30.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + 10+ "'", var43.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + (byte)10+ "'", var54.equals((byte)10));

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test247");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    boolean var9 = var8.isEmpty();
    var8.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var12 = var8.dequeue();
    boolean var13 = var8.isEmpty();
    int var14 = var8.size();
    boolean var15 = var8.isEmpty();
    var0.enqueue((java.lang.Object)var8);
    int var17 = var8.size();
    boolean var18 = var8.isEmpty();
    int var19 = var8.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (-1.0d)+ "'", var12.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test248");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    var0.enqueue((java.lang.Object)"hi!");
    java.lang.Object var6 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test249");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    boolean var2 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test250");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    int var7 = var0.size();
    int var8 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test251");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    var8.enqueue((java.lang.Object)'a');
    java.lang.Object var11 = var8.dequeue();
    var8.enqueue((java.lang.Object)"hi!");
    java.lang.Object var14 = var8.dequeue();
    var0.enqueue(var14);
    java.lang.Object var16 = var0.dequeue();
    int var17 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 'a'+ "'", var11.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "hi!"+ "'", var16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test252");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    int var5 = var0.size();
    boolean var6 = var0.isEmpty();
    var0.enqueue((java.lang.Object)0.0f);
    java.lang.Object var9 = var0.dequeue();
    int var10 = var0.size();
    exercise03.RingBufferWrapper var11 = new exercise03.RingBufferWrapper();
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    var11.enqueue((java.lang.Object)10.0f);
    java.lang.Object var16 = var11.dequeue();
    boolean var17 = var11.isEmpty();
    boolean var18 = var11.isEmpty();
    int var19 = var11.size();
    var0.enqueue((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 0.0f+ "'", var9.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 10.0f+ "'", var16.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test253");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    int var13 = var9.size();
    boolean var14 = var9.isEmpty();
    int var15 = var9.size();
    exercise03.RingBufferWrapper var16 = new exercise03.RingBufferWrapper();
    var16.enqueue((java.lang.Object)'a');
    var9.enqueue((java.lang.Object)var16);
    java.lang.Object var20 = var9.dequeue();
    var0.enqueue((java.lang.Object)var9);
    boolean var22 = var9.isEmpty();
    boolean var23 = var9.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test254");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (short)10+ "'", var4.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test255");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    int var3 = var0.size();
    exercise03.RingBufferWrapper var4 = new exercise03.RingBufferWrapper();
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    var4.enqueue((java.lang.Object)10.0f);
    java.lang.Object var9 = var4.dequeue();
    var4.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var12 = var4.dequeue();
    boolean var13 = var4.isEmpty();
    int var14 = var4.size();
    var0.enqueue((java.lang.Object)var4);
    int var16 = var4.size();
    int var17 = var4.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 10.0f+ "'", var9.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (-1.0f)+ "'", var12.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test256");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10L);
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var0.dequeue();
    boolean var15 = var0.isEmpty();
    exercise03.RingBufferWrapper var16 = new exercise03.RingBufferWrapper();
    boolean var17 = var16.isEmpty();
    int var18 = var16.size();
    int var19 = var16.size();
    boolean var20 = var16.isEmpty();
    var0.enqueue((java.lang.Object)var16);
    boolean var22 = var16.isEmpty();
    int var23 = var16.size();
    boolean var24 = var16.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10L+ "'", var4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)10+ "'", var7.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0+ "'", var14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test257");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var8 = var0.dequeue();
    int var9 = var0.size();
    var0.enqueue((java.lang.Object)(byte)1);
    java.lang.Object var12 = var0.dequeue();
    boolean var13 = var0.isEmpty();
    boolean var14 = var0.isEmpty();
    boolean var15 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (byte)1+ "'", var12.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test258");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var8 = var0.dequeue();
    boolean var9 = var0.isEmpty();
    int var10 = var0.size();
    boolean var11 = var0.isEmpty();
    exercise03.RingBufferWrapper var12 = new exercise03.RingBufferWrapper();
    var12.enqueue((java.lang.Object)'a');
    java.lang.Object var15 = var12.dequeue();
    int var16 = var12.size();
    boolean var17 = var12.isEmpty();
    var0.enqueue((java.lang.Object)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 'a'+ "'", var15.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test259");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    int var13 = var0.size();
    int var14 = var0.size();
    boolean var15 = var0.isEmpty();
    boolean var16 = var0.isEmpty();
    boolean var17 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test260");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test261");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    int var26 = var19.size();
    int var27 = var19.size();
    boolean var28 = var19.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test262");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    int var2 = var0.size();
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isEmpty();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test263");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    int var13 = var9.size();
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    var14.enqueue((java.lang.Object)10.0f);
    java.lang.Object var19 = var14.dequeue();
    boolean var20 = var14.isEmpty();
    boolean var21 = var14.isEmpty();
    var9.enqueue((java.lang.Object)var14);
    var0.enqueue((java.lang.Object)var14);
    java.lang.Object var24 = var0.dequeue();
    boolean var25 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + 10.0f+ "'", var19.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test264");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    int var7 = var0.size();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    boolean var9 = var8.isEmpty();
    var8.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var12 = var8.dequeue();
    boolean var13 = var8.isEmpty();
    int var14 = var8.size();
    boolean var15 = var8.isEmpty();
    int var16 = var8.size();
    int var17 = var8.size();
    var0.enqueue((java.lang.Object)var8);
    boolean var19 = var8.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (-1.0d)+ "'", var12.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test265");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    int var10 = var9.size();
    var9.enqueue((java.lang.Object)10);
    java.lang.Object var13 = var9.dequeue();
    boolean var14 = var9.isEmpty();
    exercise03.RingBufferWrapper var15 = new exercise03.RingBufferWrapper();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    boolean var18 = var15.isEmpty();
    int var19 = var15.size();
    var9.enqueue((java.lang.Object)var15);
    java.lang.Object var21 = var9.dequeue();
    exercise03.RingBufferWrapper var22 = new exercise03.RingBufferWrapper();
    int var23 = var22.size();
    var22.enqueue((java.lang.Object)10);
    java.lang.Object var26 = var22.dequeue();
    boolean var27 = var22.isEmpty();
    exercise03.RingBufferWrapper var28 = new exercise03.RingBufferWrapper();
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    boolean var31 = var28.isEmpty();
    int var32 = var28.size();
    var22.enqueue((java.lang.Object)var28);
    var9.enqueue((java.lang.Object)var28);
    int var35 = var28.size();
    boolean var36 = var28.isEmpty();
    exercise03.RingBufferWrapper var37 = new exercise03.RingBufferWrapper();
    var37.enqueue((java.lang.Object)'a');
    java.lang.Object var40 = var37.dequeue();
    int var41 = var37.size();
    exercise03.RingBufferWrapper var42 = new exercise03.RingBufferWrapper();
    var42.enqueue((java.lang.Object)'a');
    java.lang.Object var45 = var42.dequeue();
    var42.enqueue((java.lang.Object)"hi!");
    var37.enqueue((java.lang.Object)var42);
    var28.enqueue((java.lang.Object)var42);
    var0.enqueue((java.lang.Object)var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10+ "'", var13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + 10+ "'", var26.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + 'a'+ "'", var40.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + 'a'+ "'", var45.equals('a'));

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test266");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    var0.enqueue((java.lang.Object)"hi!");
    java.lang.Object var6 = var0.dequeue();
    int var7 = var0.size();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    boolean var10 = var0.isEmpty();
    exercise03.RingBufferWrapper var11 = new exercise03.RingBufferWrapper();
    int var12 = var11.size();
    var11.enqueue((java.lang.Object)10);
    java.lang.Object var15 = var11.dequeue();
    boolean var16 = var11.isEmpty();
    exercise03.RingBufferWrapper var17 = new exercise03.RingBufferWrapper();
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    boolean var20 = var17.isEmpty();
    int var21 = var17.size();
    var11.enqueue((java.lang.Object)var17);
    java.lang.Object var23 = var11.dequeue();
    int var24 = var11.size();
    int var25 = var11.size();
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    var26.enqueue((java.lang.Object)10.0f);
    java.lang.Object var31 = var26.dequeue();
    var26.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var34 = var26.dequeue();
    var11.enqueue((java.lang.Object)var26);
    java.lang.Object var36 = var11.dequeue();
    var0.enqueue((java.lang.Object)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var38 = var11.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 10+ "'", var15.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + 10.0f+ "'", var31.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + (-1.0f)+ "'", var34.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test267");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    boolean var13 = var0.isEmpty();
    int var14 = var0.size();
    int var15 = var0.size();
    int var16 = var0.size();
    int var17 = var0.size();
    int var18 = var0.size();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    var19.enqueue((java.lang.Object)(short)10);
    java.lang.Object var24 = var19.dequeue();
    boolean var25 = var19.isEmpty();
    int var26 = var19.size();
    var0.enqueue((java.lang.Object)var19);
    int var28 = var19.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + (short)10+ "'", var24.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test268");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    boolean var4 = var0.isEmpty();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    boolean var6 = var5.isEmpty();
    var5.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var9 = var5.dequeue();
    var5.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var12 = var5.dequeue();
    int var13 = var5.size();
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    var14.enqueue((java.lang.Object)'a');
    java.lang.Object var17 = var14.dequeue();
    exercise03.RingBufferWrapper var18 = new exercise03.RingBufferWrapper();
    int var19 = var18.size();
    var18.enqueue((java.lang.Object)10);
    java.lang.Object var22 = var18.dequeue();
    boolean var23 = var18.isEmpty();
    exercise03.RingBufferWrapper var24 = new exercise03.RingBufferWrapper();
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    boolean var27 = var24.isEmpty();
    int var28 = var24.size();
    var18.enqueue((java.lang.Object)var24);
    java.lang.Object var30 = var18.dequeue();
    exercise03.RingBufferWrapper var31 = new exercise03.RingBufferWrapper();
    int var32 = var31.size();
    var31.enqueue((java.lang.Object)10);
    java.lang.Object var35 = var31.dequeue();
    boolean var36 = var31.isEmpty();
    exercise03.RingBufferWrapper var37 = new exercise03.RingBufferWrapper();
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    boolean var40 = var37.isEmpty();
    int var41 = var37.size();
    var31.enqueue((java.lang.Object)var37);
    var18.enqueue((java.lang.Object)var37);
    var14.enqueue((java.lang.Object)var18);
    var5.enqueue((java.lang.Object)var18);
    java.lang.Object var46 = var18.dequeue();
    var0.enqueue((java.lang.Object)var18);
    boolean var48 = var18.isEmpty();
    int var49 = var18.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var50 = var18.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + (-1.0d)+ "'", var9.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (byte)100+ "'", var12.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 'a'+ "'", var17.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + 10+ "'", var22.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + 10+ "'", var35.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test269");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    var0.enqueue((java.lang.Object)"hi!");
    java.lang.Object var6 = var0.dequeue();
    int var7 = var0.size();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    boolean var10 = var0.isEmpty();
    exercise03.RingBufferWrapper var11 = new exercise03.RingBufferWrapper();
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    int var15 = var11.size();
    exercise03.RingBufferWrapper var16 = new exercise03.RingBufferWrapper();
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    var16.enqueue((java.lang.Object)10.0f);
    java.lang.Object var21 = var16.dequeue();
    boolean var22 = var16.isEmpty();
    boolean var23 = var16.isEmpty();
    var11.enqueue((java.lang.Object)var16);
    int var25 = var16.size();
    var0.enqueue((java.lang.Object)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + 10.0f+ "'", var21.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test270");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    int var10 = var0.size();
    boolean var11 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test271");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    int var7 = var0.size();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    boolean var10 = var0.isEmpty();
    exercise03.RingBufferWrapper var11 = new exercise03.RingBufferWrapper();
    var11.enqueue((java.lang.Object)'a');
    java.lang.Object var14 = var11.dequeue();
    var11.enqueue((java.lang.Object)"hi!");
    java.lang.Object var17 = var11.dequeue();
    int var18 = var11.size();
    int var19 = var11.size();
    boolean var20 = var11.isEmpty();
    var0.enqueue((java.lang.Object)var11);
    boolean var22 = var11.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 'a'+ "'", var14.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "hi!"+ "'", var17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test272");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    boolean var27 = var26.isEmpty();
    var26.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var30 = var26.dequeue();
    boolean var31 = var26.isEmpty();
    var26.enqueue((java.lang.Object)"hi!");
    var19.enqueue((java.lang.Object)var26);
    java.lang.Object var35 = var26.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var36 = var26.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + (-1.0d)+ "'", var30.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "hi!"+ "'", var35.equals("hi!"));

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test273");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    int var5 = var0.size();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    int var9 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test274");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    int var4 = var0.size();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    var5.enqueue((java.lang.Object)'a');
    java.lang.Object var8 = var5.dequeue();
    var5.enqueue((java.lang.Object)"hi!");
    var0.enqueue((java.lang.Object)var5);
    java.lang.Object var12 = var5.dequeue();
    int var13 = var5.size();
    int var14 = var5.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 'a'+ "'", var8.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test275");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    int var13 = var0.size();
    int var14 = var0.size();
    exercise03.RingBufferWrapper var15 = new exercise03.RingBufferWrapper();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    var15.enqueue((java.lang.Object)10.0f);
    java.lang.Object var20 = var15.dequeue();
    var15.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var23 = var15.dequeue();
    var0.enqueue((java.lang.Object)var15);
    int var25 = var15.size();
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    int var27 = var26.size();
    var26.enqueue((java.lang.Object)10);
    java.lang.Object var30 = var26.dequeue();
    boolean var31 = var26.isEmpty();
    exercise03.RingBufferWrapper var32 = new exercise03.RingBufferWrapper();
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    boolean var35 = var32.isEmpty();
    int var36 = var32.size();
    var26.enqueue((java.lang.Object)var32);
    java.lang.Object var38 = var26.dequeue();
    exercise03.RingBufferWrapper var39 = new exercise03.RingBufferWrapper();
    int var40 = var39.size();
    var39.enqueue((java.lang.Object)10);
    java.lang.Object var43 = var39.dequeue();
    boolean var44 = var39.isEmpty();
    exercise03.RingBufferWrapper var45 = new exercise03.RingBufferWrapper();
    boolean var46 = var45.isEmpty();
    boolean var47 = var45.isEmpty();
    boolean var48 = var45.isEmpty();
    int var49 = var45.size();
    var39.enqueue((java.lang.Object)var45);
    var26.enqueue((java.lang.Object)var45);
    var45.enqueue((java.lang.Object)(byte)10);
    java.lang.Object var54 = var45.dequeue();
    var15.enqueue((java.lang.Object)var45);
    java.lang.Object var56 = var15.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 10.0f+ "'", var20.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + (-1.0f)+ "'", var23.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + 10+ "'", var30.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + 10+ "'", var43.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + (byte)10+ "'", var54.equals((byte)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test276");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10L);
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var0.dequeue();
    boolean var15 = var0.isEmpty();
    int var16 = var0.size();
    boolean var17 = var0.isEmpty();
    exercise03.RingBufferWrapper var18 = new exercise03.RingBufferWrapper();
    boolean var19 = var18.isEmpty();
    boolean var20 = var18.isEmpty();
    var18.enqueue((java.lang.Object)10.0f);
    java.lang.Object var23 = var18.dequeue();
    int var24 = var18.size();
    boolean var25 = var18.isEmpty();
    boolean var26 = var18.isEmpty();
    exercise03.RingBufferWrapper var27 = new exercise03.RingBufferWrapper();
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    int var30 = var27.size();
    var18.enqueue((java.lang.Object)var27);
    exercise03.RingBufferWrapper var32 = new exercise03.RingBufferWrapper();
    int var33 = var32.size();
    var32.enqueue((java.lang.Object)10L);
    java.lang.Object var36 = var32.dequeue();
    var32.enqueue((java.lang.Object)(short)10);
    java.lang.Object var39 = var32.dequeue();
    int var40 = var32.size();
    exercise03.RingBufferWrapper var41 = new exercise03.RingBufferWrapper();
    boolean var42 = var41.isEmpty();
    boolean var43 = var41.isEmpty();
    int var44 = var41.size();
    var32.enqueue((java.lang.Object)var44);
    var27.enqueue((java.lang.Object)var44);
    java.lang.Object var47 = var27.dequeue();
    int var48 = var27.size();
    exercise03.RingBufferWrapper var49 = new exercise03.RingBufferWrapper();
    int var50 = var49.size();
    var49.enqueue((java.lang.Object)10);
    java.lang.Object var53 = var49.dequeue();
    boolean var54 = var49.isEmpty();
    exercise03.RingBufferWrapper var55 = new exercise03.RingBufferWrapper();
    boolean var56 = var55.isEmpty();
    boolean var57 = var55.isEmpty();
    boolean var58 = var55.isEmpty();
    int var59 = var55.size();
    var49.enqueue((java.lang.Object)var55);
    java.lang.Object var61 = var49.dequeue();
    exercise03.RingBufferWrapper var62 = new exercise03.RingBufferWrapper();
    int var63 = var62.size();
    var62.enqueue((java.lang.Object)10);
    java.lang.Object var66 = var62.dequeue();
    boolean var67 = var62.isEmpty();
    exercise03.RingBufferWrapper var68 = new exercise03.RingBufferWrapper();
    boolean var69 = var68.isEmpty();
    boolean var70 = var68.isEmpty();
    boolean var71 = var68.isEmpty();
    int var72 = var68.size();
    var62.enqueue((java.lang.Object)var68);
    var49.enqueue((java.lang.Object)var68);
    boolean var75 = var68.isEmpty();
    boolean var76 = var68.isEmpty();
    var27.enqueue((java.lang.Object)var76);
    java.lang.Object var78 = var27.dequeue();
    var0.enqueue((java.lang.Object)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10L+ "'", var4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)10+ "'", var7.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0+ "'", var14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + 10.0f+ "'", var23.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + 10L+ "'", var36.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + (short)10+ "'", var39.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + 0+ "'", var47.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + 10+ "'", var53.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + 10+ "'", var66.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + true+ "'", var78.equals(true));

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test277");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    int var26 = var19.size();
    boolean var27 = var19.isEmpty();
    exercise03.RingBufferWrapper var28 = new exercise03.RingBufferWrapper();
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    var28.enqueue((java.lang.Object)10.0f);
    java.lang.Object var33 = var28.dequeue();
    int var34 = var28.size();
    int var35 = var28.size();
    var19.enqueue((java.lang.Object)var28);
    exercise03.RingBufferWrapper var37 = new exercise03.RingBufferWrapper();
    boolean var38 = var37.isEmpty();
    int var39 = var37.size();
    int var40 = var37.size();
    exercise03.RingBufferWrapper var41 = new exercise03.RingBufferWrapper();
    boolean var42 = var41.isEmpty();
    boolean var43 = var41.isEmpty();
    var41.enqueue((java.lang.Object)10.0f);
    java.lang.Object var46 = var41.dequeue();
    int var47 = var41.size();
    boolean var48 = var41.isEmpty();
    exercise03.RingBufferWrapper var49 = new exercise03.RingBufferWrapper();
    boolean var50 = var49.isEmpty();
    var49.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var53 = var49.dequeue();
    boolean var54 = var49.isEmpty();
    int var55 = var49.size();
    boolean var56 = var49.isEmpty();
    var41.enqueue((java.lang.Object)var49);
    var37.enqueue((java.lang.Object)var41);
    var28.enqueue((java.lang.Object)var37);
    java.lang.Object var60 = var37.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + 10.0f+ "'", var33.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + 10.0f+ "'", var46.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + (-1.0d)+ "'", var53.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var60);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test278");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    int var4 = var0.size();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    var5.enqueue((java.lang.Object)'a');
    java.lang.Object var8 = var5.dequeue();
    var5.enqueue((java.lang.Object)"hi!");
    var0.enqueue((java.lang.Object)var5);
    java.lang.Object var12 = var0.dequeue();
    boolean var13 = var0.isEmpty();
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    boolean var17 = var14.isEmpty();
    int var18 = var14.size();
    var14.enqueue((java.lang.Object)100.0f);
    java.lang.Object var21 = var14.dequeue();
    exercise03.RingBufferWrapper var22 = new exercise03.RingBufferWrapper();
    var22.enqueue((java.lang.Object)'a');
    java.lang.Object var25 = var22.dequeue();
    var22.enqueue((java.lang.Object)"hi!");
    java.lang.Object var28 = var22.dequeue();
    int var29 = var22.size();
    exercise03.RingBufferWrapper var30 = new exercise03.RingBufferWrapper();
    boolean var31 = var30.isEmpty();
    boolean var32 = var30.isEmpty();
    var22.enqueue((java.lang.Object)var32);
    java.lang.Object var34 = var22.dequeue();
    var14.enqueue((java.lang.Object)var22);
    int var36 = var22.size();
    exercise03.RingBufferWrapper var37 = new exercise03.RingBufferWrapper();
    boolean var38 = var37.isEmpty();
    boolean var39 = var37.isEmpty();
    boolean var40 = var37.isEmpty();
    int var41 = var37.size();
    int var42 = var37.size();
    exercise03.RingBufferWrapper var43 = new exercise03.RingBufferWrapper();
    boolean var44 = var43.isEmpty();
    var43.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var47 = var43.dequeue();
    boolean var48 = var43.isEmpty();
    var43.enqueue((java.lang.Object)"hi!");
    var37.enqueue((java.lang.Object)"hi!");
    java.lang.Object var52 = var37.dequeue();
    int var53 = var37.size();
    var22.enqueue((java.lang.Object)var37);
    java.lang.Object var55 = var22.dequeue();
    var0.enqueue((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 'a'+ "'", var8.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + 100.0f+ "'", var21.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + 'a'+ "'", var25.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + true+ "'", var34.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + (-1.0d)+ "'", var47.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "hi!"+ "'", var52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var55);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test279");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    int var7 = var6.size();
    int var8 = var6.size();
    int var9 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    boolean var11 = var6.isEmpty();
    boolean var12 = var6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test280");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    var5.enqueue((java.lang.Object)'a');
    java.lang.Object var8 = var5.dequeue();
    int var9 = var5.size();
    exercise03.RingBufferWrapper var10 = new exercise03.RingBufferWrapper();
    var10.enqueue((java.lang.Object)'a');
    java.lang.Object var13 = var10.dequeue();
    var10.enqueue((java.lang.Object)"hi!");
    var5.enqueue((java.lang.Object)var10);
    java.lang.Object var17 = var5.dequeue();
    var0.enqueue(var17);
    java.lang.Object var19 = var0.dequeue();
    boolean var20 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 'a'+ "'", var8.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 'a'+ "'", var13.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test281");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    var26.enqueue((java.lang.Object)10.0f);
    java.lang.Object var31 = var26.dequeue();
    var26.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var34 = var26.dequeue();
    boolean var35 = var26.isEmpty();
    exercise03.RingBufferWrapper var36 = new exercise03.RingBufferWrapper();
    boolean var37 = var36.isEmpty();
    boolean var38 = var36.isEmpty();
    var36.enqueue((java.lang.Object)10.0f);
    java.lang.Object var41 = var36.dequeue();
    boolean var42 = var36.isEmpty();
    int var43 = var36.size();
    var26.enqueue((java.lang.Object)var43);
    var19.enqueue((java.lang.Object)var26);
    java.lang.Object var46 = var26.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + 10.0f+ "'", var31.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + (-1.0f)+ "'", var34.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + 10.0f+ "'", var41.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + 0+ "'", var46.equals(0));

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test282");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    var6.enqueue((java.lang.Object)'a');
    java.lang.Object var9 = var6.dequeue();
    var6.enqueue((java.lang.Object)"hi!");
    java.lang.Object var12 = var6.dequeue();
    int var13 = var6.size();
    boolean var14 = var6.isEmpty();
    java.lang.Object var15 = new java.lang.Object();
    var6.enqueue(var15);
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var18 = var6.dequeue();
    boolean var19 = var6.isEmpty();
    exercise03.RingBufferWrapper var20 = new exercise03.RingBufferWrapper();
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    var20.enqueue((java.lang.Object)10.0f);
    java.lang.Object var25 = var20.dequeue();
    int var26 = var20.size();
    boolean var27 = var20.isEmpty();
    exercise03.RingBufferWrapper var28 = new exercise03.RingBufferWrapper();
    boolean var29 = var28.isEmpty();
    var28.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var32 = var28.dequeue();
    boolean var33 = var28.isEmpty();
    int var34 = var28.size();
    boolean var35 = var28.isEmpty();
    var20.enqueue((java.lang.Object)var28);
    int var37 = var28.size();
    exercise03.RingBufferWrapper var38 = new exercise03.RingBufferWrapper();
    int var39 = var38.size();
    var38.enqueue((java.lang.Object)(short)10);
    java.lang.Object var42 = var38.dequeue();
    exercise03.RingBufferWrapper var43 = new exercise03.RingBufferWrapper();
    int var44 = var43.size();
    var43.enqueue((java.lang.Object)10);
    java.lang.Object var47 = var43.dequeue();
    boolean var48 = var43.isEmpty();
    int var49 = var43.size();
    exercise03.RingBufferWrapper var50 = new exercise03.RingBufferWrapper();
    int var51 = var50.size();
    var50.enqueue((java.lang.Object)10L);
    java.lang.Object var54 = var50.dequeue();
    var43.enqueue(var54);
    var38.enqueue((java.lang.Object)var43);
    var28.enqueue((java.lang.Object)var38);
    var6.enqueue((java.lang.Object)var38);
    java.lang.Object var59 = var6.dequeue();
    boolean var60 = var6.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 'a'+ "'", var9.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + 10.0f+ "'", var25.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + (-1.0d)+ "'", var32.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + (short)10+ "'", var42.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + 10+ "'", var47.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + 10L+ "'", var54.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test283");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    int var2 = var0.size();
    int var3 = var0.size();
    int var4 = var0.size();
    int var5 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test284");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    exercise03.RingBufferWrapper var5 = new exercise03.RingBufferWrapper();
    int var6 = var5.size();
    var5.enqueue((java.lang.Object)10L);
    java.lang.Object var9 = var5.dequeue();
    var5.enqueue((java.lang.Object)(short)10);
    java.lang.Object var12 = var5.dequeue();
    int var13 = var5.size();
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    int var17 = var14.size();
    var5.enqueue((java.lang.Object)var17);
    java.lang.Object var19 = var5.dequeue();
    boolean var20 = var5.isEmpty();
    exercise03.RingBufferWrapper var21 = new exercise03.RingBufferWrapper();
    boolean var22 = var21.isEmpty();
    int var23 = var21.size();
    int var24 = var21.size();
    boolean var25 = var21.isEmpty();
    var5.enqueue((java.lang.Object)var21);
    var0.enqueue((java.lang.Object)var21);
    exercise03.RingBufferWrapper var28 = new exercise03.RingBufferWrapper();
    var28.enqueue((java.lang.Object)'a');
    java.lang.Object var31 = var28.dequeue();
    boolean var32 = var28.isEmpty();
    exercise03.RingBufferWrapper var33 = new exercise03.RingBufferWrapper();
    var33.enqueue((java.lang.Object)'a');
    java.lang.Object var36 = var33.dequeue();
    var28.enqueue((java.lang.Object)var33);
    var21.enqueue((java.lang.Object)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 10L+ "'", var9.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (short)10+ "'", var12.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + 0+ "'", var19.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + 'a'+ "'", var31.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + 'a'+ "'", var36.equals('a'));

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test285");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    boolean var26 = var19.isEmpty();
    exercise03.RingBufferWrapper var27 = new exercise03.RingBufferWrapper();
    int var28 = var27.size();
    boolean var29 = var27.isEmpty();
    int var30 = var27.size();
    var19.enqueue((java.lang.Object)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test286");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    int var5 = var0.size();
    boolean var6 = var0.isEmpty();
    exercise03.RingBufferWrapper var7 = new exercise03.RingBufferWrapper();
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    var7.enqueue((java.lang.Object)10.0f);
    java.lang.Object var12 = var7.dequeue();
    int var13 = var7.size();
    boolean var14 = var7.isEmpty();
    int var15 = var7.size();
    boolean var16 = var7.isEmpty();
    boolean var17 = var7.isEmpty();
    var0.enqueue((java.lang.Object)var7);
    boolean var19 = var7.isEmpty();
    exercise03.RingBufferWrapper var20 = new exercise03.RingBufferWrapper();
    int var21 = var20.size();
    var20.enqueue((java.lang.Object)10);
    java.lang.Object var24 = var20.dequeue();
    boolean var25 = var20.isEmpty();
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    boolean var29 = var26.isEmpty();
    int var30 = var26.size();
    var20.enqueue((java.lang.Object)var26);
    java.lang.Object var32 = var20.dequeue();
    exercise03.RingBufferWrapper var33 = new exercise03.RingBufferWrapper();
    int var34 = var33.size();
    var33.enqueue((java.lang.Object)10);
    java.lang.Object var37 = var33.dequeue();
    boolean var38 = var33.isEmpty();
    exercise03.RingBufferWrapper var39 = new exercise03.RingBufferWrapper();
    boolean var40 = var39.isEmpty();
    boolean var41 = var39.isEmpty();
    boolean var42 = var39.isEmpty();
    int var43 = var39.size();
    var33.enqueue((java.lang.Object)var39);
    var20.enqueue((java.lang.Object)var39);
    int var46 = var39.size();
    boolean var47 = var39.isEmpty();
    int var48 = var39.size();
    exercise03.RingBufferWrapper var49 = new exercise03.RingBufferWrapper();
    boolean var50 = var49.isEmpty();
    boolean var51 = var49.isEmpty();
    boolean var52 = var49.isEmpty();
    int var53 = var49.size();
    boolean var54 = var49.isEmpty();
    int var55 = var49.size();
    exercise03.RingBufferWrapper var56 = new exercise03.RingBufferWrapper();
    var56.enqueue((java.lang.Object)'a');
    var49.enqueue((java.lang.Object)var56);
    var39.enqueue((java.lang.Object)var56);
    var7.enqueue((java.lang.Object)var56);
    java.lang.Object var62 = var56.dequeue();
    exercise03.RingBufferWrapper var63 = new exercise03.RingBufferWrapper();
    int var64 = var63.size();
    var63.enqueue((java.lang.Object)10);
    java.lang.Object var67 = var63.dequeue();
    boolean var68 = var63.isEmpty();
    exercise03.RingBufferWrapper var69 = new exercise03.RingBufferWrapper();
    boolean var70 = var69.isEmpty();
    boolean var71 = var69.isEmpty();
    boolean var72 = var69.isEmpty();
    int var73 = var69.size();
    var63.enqueue((java.lang.Object)var69);
    java.lang.Object var75 = var63.dequeue();
    boolean var76 = var63.isEmpty();
    int var77 = var63.size();
    int var78 = var63.size();
    int var79 = var63.size();
    int var80 = var63.size();
    int var81 = var63.size();
    exercise03.RingBufferWrapper var82 = new exercise03.RingBufferWrapper();
    boolean var83 = var82.isEmpty();
    boolean var84 = var82.isEmpty();
    var82.enqueue((java.lang.Object)(short)10);
    java.lang.Object var87 = var82.dequeue();
    boolean var88 = var82.isEmpty();
    int var89 = var82.size();
    var63.enqueue((java.lang.Object)var82);
    java.lang.Object var91 = var63.dequeue();
    var56.enqueue((java.lang.Object)var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 10.0f+ "'", var12.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + 10+ "'", var24.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + 10+ "'", var37.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + 'a'+ "'", var62.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + 10+ "'", var67.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + (short)10+ "'", var87.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var91);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test287");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    var0.enqueue((java.lang.Object)(byte)(-1));
    java.lang.Object var15 = var0.dequeue();
    exercise03.RingBufferWrapper var16 = new exercise03.RingBufferWrapper();
    int var17 = var16.size();
    var16.enqueue((java.lang.Object)10);
    java.lang.Object var20 = var16.dequeue();
    boolean var21 = var16.isEmpty();
    exercise03.RingBufferWrapper var22 = new exercise03.RingBufferWrapper();
    boolean var23 = var22.isEmpty();
    boolean var24 = var22.isEmpty();
    boolean var25 = var22.isEmpty();
    int var26 = var22.size();
    var16.enqueue((java.lang.Object)var22);
    java.lang.Object var28 = var16.dequeue();
    exercise03.RingBufferWrapper var29 = new exercise03.RingBufferWrapper();
    int var30 = var29.size();
    var29.enqueue((java.lang.Object)10);
    java.lang.Object var33 = var29.dequeue();
    boolean var34 = var29.isEmpty();
    exercise03.RingBufferWrapper var35 = new exercise03.RingBufferWrapper();
    boolean var36 = var35.isEmpty();
    boolean var37 = var35.isEmpty();
    boolean var38 = var35.isEmpty();
    int var39 = var35.size();
    var29.enqueue((java.lang.Object)var35);
    var16.enqueue((java.lang.Object)var35);
    int var42 = var35.size();
    boolean var43 = var35.isEmpty();
    exercise03.RingBufferWrapper var44 = new exercise03.RingBufferWrapper();
    var44.enqueue((java.lang.Object)'a');
    java.lang.Object var47 = var44.dequeue();
    int var48 = var44.size();
    exercise03.RingBufferWrapper var49 = new exercise03.RingBufferWrapper();
    var49.enqueue((java.lang.Object)'a');
    java.lang.Object var52 = var49.dequeue();
    var49.enqueue((java.lang.Object)"hi!");
    var44.enqueue((java.lang.Object)var49);
    var35.enqueue((java.lang.Object)var49);
    java.lang.Object var57 = var35.dequeue();
    var0.enqueue(var57);
    java.lang.Object var59 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + (byte)(-1)+ "'", var15.equals((byte)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 10+ "'", var20.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + 10+ "'", var33.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + 'a'+ "'", var47.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + 'a'+ "'", var52.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test288");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    exercise03.RingBufferWrapper var1 = new exercise03.RingBufferWrapper();
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    var1.enqueue((java.lang.Object)100.0f);
    java.lang.Object var8 = var1.dequeue();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    var9.enqueue((java.lang.Object)'a');
    java.lang.Object var12 = var9.dequeue();
    var9.enqueue((java.lang.Object)"hi!");
    java.lang.Object var15 = var9.dequeue();
    int var16 = var9.size();
    exercise03.RingBufferWrapper var17 = new exercise03.RingBufferWrapper();
    boolean var18 = var17.isEmpty();
    boolean var19 = var17.isEmpty();
    var9.enqueue((java.lang.Object)var19);
    java.lang.Object var21 = var9.dequeue();
    var1.enqueue((java.lang.Object)var9);
    int var23 = var9.size();
    var0.enqueue((java.lang.Object)var9);
    exercise03.RingBufferWrapper var25 = new exercise03.RingBufferWrapper();
    boolean var26 = var25.isEmpty();
    var25.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var29 = var25.dequeue();
    int var30 = var25.size();
    exercise03.RingBufferWrapper var31 = new exercise03.RingBufferWrapper();
    boolean var32 = var31.isEmpty();
    boolean var33 = var31.isEmpty();
    var31.enqueue((java.lang.Object)10.0f);
    var25.enqueue((java.lang.Object)var31);
    var9.enqueue((java.lang.Object)var25);
    java.lang.Object var38 = var25.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 100.0f+ "'", var8.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 'a'+ "'", var12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "hi!"+ "'", var15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + true+ "'", var21.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + (-1.0d)+ "'", var29.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test289");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10L);
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var0.dequeue();
    int var15 = var0.size();
    int var16 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10L+ "'", var4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)10+ "'", var7.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0+ "'", var14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test290");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    int var4 = var0.size();
    int var5 = var0.size();
    boolean var6 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test291");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10L);
    java.lang.Object var4 = var0.dequeue();
    int var5 = var0.size();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    var6.enqueue((java.lang.Object)10.0f);
    java.lang.Object var11 = var6.dequeue();
    int var12 = var6.size();
    boolean var13 = var6.isEmpty();
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    boolean var15 = var14.isEmpty();
    var14.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var18 = var14.dequeue();
    boolean var19 = var14.isEmpty();
    int var20 = var14.size();
    boolean var21 = var14.isEmpty();
    var6.enqueue((java.lang.Object)var14);
    int var23 = var14.size();
    int var24 = var14.size();
    exercise03.RingBufferWrapper var25 = new exercise03.RingBufferWrapper();
    var25.enqueue((java.lang.Object)'a');
    java.lang.Object var28 = var25.dequeue();
    int var29 = var25.size();
    int var30 = var25.size();
    var14.enqueue((java.lang.Object)var30);
    var0.enqueue((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10L+ "'", var4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 10.0f+ "'", var11.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + (-1.0d)+ "'", var18.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + 'a'+ "'", var28.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test292");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    var0.enqueue((java.lang.Object)"hi!");
    java.lang.Object var6 = var0.dequeue();
    int var7 = var0.size();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    boolean var11 = var8.isEmpty();
    int var12 = var8.size();
    boolean var13 = var8.isEmpty();
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    boolean var15 = var14.isEmpty();
    var14.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var18 = var14.dequeue();
    var14.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var21 = var14.dequeue();
    int var22 = var14.size();
    exercise03.RingBufferWrapper var23 = new exercise03.RingBufferWrapper();
    var23.enqueue((java.lang.Object)'a');
    java.lang.Object var26 = var23.dequeue();
    exercise03.RingBufferWrapper var27 = new exercise03.RingBufferWrapper();
    int var28 = var27.size();
    var27.enqueue((java.lang.Object)10);
    java.lang.Object var31 = var27.dequeue();
    boolean var32 = var27.isEmpty();
    exercise03.RingBufferWrapper var33 = new exercise03.RingBufferWrapper();
    boolean var34 = var33.isEmpty();
    boolean var35 = var33.isEmpty();
    boolean var36 = var33.isEmpty();
    int var37 = var33.size();
    var27.enqueue((java.lang.Object)var33);
    java.lang.Object var39 = var27.dequeue();
    exercise03.RingBufferWrapper var40 = new exercise03.RingBufferWrapper();
    int var41 = var40.size();
    var40.enqueue((java.lang.Object)10);
    java.lang.Object var44 = var40.dequeue();
    boolean var45 = var40.isEmpty();
    exercise03.RingBufferWrapper var46 = new exercise03.RingBufferWrapper();
    boolean var47 = var46.isEmpty();
    boolean var48 = var46.isEmpty();
    boolean var49 = var46.isEmpty();
    int var50 = var46.size();
    var40.enqueue((java.lang.Object)var46);
    var27.enqueue((java.lang.Object)var46);
    var23.enqueue((java.lang.Object)var27);
    var14.enqueue((java.lang.Object)var27);
    var8.enqueue((java.lang.Object)var27);
    var0.enqueue((java.lang.Object)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + (-1.0d)+ "'", var18.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + (byte)100+ "'", var21.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + 'a'+ "'", var26.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + 10+ "'", var31.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + 10+ "'", var44.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test293");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    int var5 = var0.size();
    boolean var6 = var0.isEmpty();
    exercise03.RingBufferWrapper var7 = new exercise03.RingBufferWrapper();
    boolean var8 = var7.isEmpty();
    boolean var9 = var7.isEmpty();
    var7.enqueue((java.lang.Object)10.0f);
    java.lang.Object var12 = var7.dequeue();
    int var13 = var7.size();
    boolean var14 = var7.isEmpty();
    int var15 = var7.size();
    boolean var16 = var7.isEmpty();
    boolean var17 = var7.isEmpty();
    var0.enqueue((java.lang.Object)var7);
    boolean var19 = var7.isEmpty();
    exercise03.RingBufferWrapper var20 = new exercise03.RingBufferWrapper();
    int var21 = var20.size();
    var20.enqueue((java.lang.Object)10);
    java.lang.Object var24 = var20.dequeue();
    boolean var25 = var20.isEmpty();
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    boolean var29 = var26.isEmpty();
    int var30 = var26.size();
    var20.enqueue((java.lang.Object)var26);
    java.lang.Object var32 = var20.dequeue();
    exercise03.RingBufferWrapper var33 = new exercise03.RingBufferWrapper();
    int var34 = var33.size();
    var33.enqueue((java.lang.Object)10);
    java.lang.Object var37 = var33.dequeue();
    boolean var38 = var33.isEmpty();
    exercise03.RingBufferWrapper var39 = new exercise03.RingBufferWrapper();
    boolean var40 = var39.isEmpty();
    boolean var41 = var39.isEmpty();
    boolean var42 = var39.isEmpty();
    int var43 = var39.size();
    var33.enqueue((java.lang.Object)var39);
    var20.enqueue((java.lang.Object)var39);
    int var46 = var39.size();
    boolean var47 = var39.isEmpty();
    int var48 = var39.size();
    exercise03.RingBufferWrapper var49 = new exercise03.RingBufferWrapper();
    boolean var50 = var49.isEmpty();
    boolean var51 = var49.isEmpty();
    boolean var52 = var49.isEmpty();
    int var53 = var49.size();
    boolean var54 = var49.isEmpty();
    int var55 = var49.size();
    exercise03.RingBufferWrapper var56 = new exercise03.RingBufferWrapper();
    var56.enqueue((java.lang.Object)'a');
    var49.enqueue((java.lang.Object)var56);
    var39.enqueue((java.lang.Object)var56);
    var7.enqueue((java.lang.Object)var56);
    java.lang.Object var62 = var7.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 10.0f+ "'", var12.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + 10+ "'", var24.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + 10+ "'", var37.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test294");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    int var9 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 10+ "'", var7.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test295");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    boolean var13 = var0.isEmpty();
    int var14 = var0.size();
    int var15 = var0.size();
    int var16 = var0.size();
    int var17 = var0.size();
    int var18 = var0.size();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    var19.enqueue((java.lang.Object)(short)10);
    java.lang.Object var24 = var19.dequeue();
    boolean var25 = var19.isEmpty();
    int var26 = var19.size();
    var0.enqueue((java.lang.Object)var19);
    exercise03.RingBufferWrapper var28 = new exercise03.RingBufferWrapper();
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    boolean var31 = var28.isEmpty();
    int var32 = var28.size();
    var28.enqueue((java.lang.Object)100.0f);
    java.lang.Object var35 = var28.dequeue();
    exercise03.RingBufferWrapper var36 = new exercise03.RingBufferWrapper();
    var36.enqueue((java.lang.Object)'a');
    java.lang.Object var39 = var36.dequeue();
    var36.enqueue((java.lang.Object)"hi!");
    java.lang.Object var42 = var36.dequeue();
    int var43 = var36.size();
    exercise03.RingBufferWrapper var44 = new exercise03.RingBufferWrapper();
    boolean var45 = var44.isEmpty();
    boolean var46 = var44.isEmpty();
    var36.enqueue((java.lang.Object)var46);
    java.lang.Object var48 = var36.dequeue();
    var28.enqueue((java.lang.Object)var36);
    int var50 = var36.size();
    var36.enqueue((java.lang.Object)'a');
    var19.enqueue((java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + (short)10+ "'", var24.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + 100.0f+ "'", var35.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + 'a'+ "'", var39.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "hi!"+ "'", var42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + true+ "'", var48.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test296");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    boolean var26 = var19.isEmpty();
    int var27 = var19.size();
    int var28 = var19.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test297");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    var0.enqueue((java.lang.Object)"hi!");
    java.lang.Object var6 = var0.dequeue();
    int var7 = var0.size();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    var8.enqueue((java.lang.Object)'a');
    java.lang.Object var11 = var8.dequeue();
    var8.enqueue((java.lang.Object)"hi!");
    java.lang.Object var14 = var8.dequeue();
    int var15 = var8.size();
    int var16 = var8.size();
    boolean var17 = var8.isEmpty();
    boolean var18 = var8.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    int var20 = var19.size();
    var19.enqueue((java.lang.Object)10);
    java.lang.Object var23 = var19.dequeue();
    boolean var24 = var19.isEmpty();
    exercise03.RingBufferWrapper var25 = new exercise03.RingBufferWrapper();
    boolean var26 = var25.isEmpty();
    boolean var27 = var25.isEmpty();
    boolean var28 = var25.isEmpty();
    int var29 = var25.size();
    var19.enqueue((java.lang.Object)var25);
    java.lang.Object var31 = var19.dequeue();
    int var32 = var19.size();
    int var33 = var19.size();
    exercise03.RingBufferWrapper var34 = new exercise03.RingBufferWrapper();
    boolean var35 = var34.isEmpty();
    boolean var36 = var34.isEmpty();
    var34.enqueue((java.lang.Object)10.0f);
    java.lang.Object var39 = var34.dequeue();
    var34.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var42 = var34.dequeue();
    var19.enqueue((java.lang.Object)var34);
    java.lang.Object var44 = var19.dequeue();
    var8.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 'a'+ "'", var11.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "hi!"+ "'", var14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + 10+ "'", var23.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + 10.0f+ "'", var39.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + (-1.0f)+ "'", var42.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test298");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var9);
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    int var15 = var14.size();
    var14.enqueue((java.lang.Object)10L);
    java.lang.Object var18 = var14.dequeue();
    var14.enqueue((java.lang.Object)(short)10);
    java.lang.Object var21 = var14.dequeue();
    int var22 = var14.size();
    exercise03.RingBufferWrapper var23 = new exercise03.RingBufferWrapper();
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    int var26 = var23.size();
    var14.enqueue((java.lang.Object)var26);
    var9.enqueue((java.lang.Object)var26);
    java.lang.Object var29 = var9.dequeue();
    int var30 = var9.size();
    int var31 = var9.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 10L+ "'", var18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + (short)10+ "'", var21.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + 0+ "'", var29.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test299");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    boolean var26 = var19.isEmpty();
    exercise03.RingBufferWrapper var27 = new exercise03.RingBufferWrapper();
    boolean var28 = var27.isEmpty();
    boolean var29 = var27.isEmpty();
    var27.enqueue((java.lang.Object)10.0f);
    java.lang.Object var32 = var27.dequeue();
    boolean var33 = var27.isEmpty();
    int var34 = var27.size();
    int var35 = var27.size();
    var19.enqueue((java.lang.Object)var27);
    java.lang.Object var37 = var19.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + 10.0f+ "'", var32.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test300");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    int var7 = var6.size();
    var6.enqueue((java.lang.Object)10);
    java.lang.Object var10 = var6.dequeue();
    boolean var11 = var6.isEmpty();
    exercise03.RingBufferWrapper var12 = new exercise03.RingBufferWrapper();
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isEmpty();
    int var16 = var12.size();
    var6.enqueue((java.lang.Object)var12);
    java.lang.Object var18 = var6.dequeue();
    int var19 = var6.size();
    int var20 = var6.size();
    exercise03.RingBufferWrapper var21 = new exercise03.RingBufferWrapper();
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    var21.enqueue((java.lang.Object)10.0f);
    java.lang.Object var26 = var21.dequeue();
    var21.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var29 = var21.dequeue();
    var6.enqueue((java.lang.Object)var21);
    int var31 = var21.size();
    exercise03.RingBufferWrapper var32 = new exercise03.RingBufferWrapper();
    int var33 = var32.size();
    var32.enqueue((java.lang.Object)10);
    java.lang.Object var36 = var32.dequeue();
    boolean var37 = var32.isEmpty();
    exercise03.RingBufferWrapper var38 = new exercise03.RingBufferWrapper();
    boolean var39 = var38.isEmpty();
    boolean var40 = var38.isEmpty();
    boolean var41 = var38.isEmpty();
    int var42 = var38.size();
    var32.enqueue((java.lang.Object)var38);
    java.lang.Object var44 = var32.dequeue();
    exercise03.RingBufferWrapper var45 = new exercise03.RingBufferWrapper();
    int var46 = var45.size();
    var45.enqueue((java.lang.Object)10);
    java.lang.Object var49 = var45.dequeue();
    boolean var50 = var45.isEmpty();
    exercise03.RingBufferWrapper var51 = new exercise03.RingBufferWrapper();
    boolean var52 = var51.isEmpty();
    boolean var53 = var51.isEmpty();
    boolean var54 = var51.isEmpty();
    int var55 = var51.size();
    var45.enqueue((java.lang.Object)var51);
    var32.enqueue((java.lang.Object)var51);
    var51.enqueue((java.lang.Object)(byte)10);
    java.lang.Object var60 = var51.dequeue();
    var21.enqueue((java.lang.Object)var51);
    var0.enqueue((java.lang.Object)var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 10+ "'", var10.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + 10.0f+ "'", var26.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + (-1.0f)+ "'", var29.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + 10+ "'", var36.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + 10+ "'", var49.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + (byte)10+ "'", var60.equals((byte)10));

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test301");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    java.lang.Object var3 = var0.dequeue();
    var0.enqueue((java.lang.Object)"hi!");
    java.lang.Object var6 = var0.dequeue();
    int var7 = var0.size();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    var0.enqueue((java.lang.Object)var10);
    java.lang.Object var12 = var0.dequeue();
    boolean var13 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + 'a'+ "'", var3.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + true+ "'", var12.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test302");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    boolean var13 = var0.isEmpty();
    int var14 = var0.size();
    int var15 = var0.size();
    int var16 = var0.size();
    int var17 = var0.size();
    int var18 = var0.size();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    var19.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var23 = var19.dequeue();
    int var24 = var19.size();
    var0.enqueue((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + (-1.0d)+ "'", var23.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test303");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    exercise03.RingBufferWrapper var10 = new exercise03.RingBufferWrapper();
    int var11 = var10.size();
    var10.enqueue((java.lang.Object)10);
    java.lang.Object var14 = var10.dequeue();
    var0.enqueue(var14);
    java.lang.Object var16 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 10+ "'", var14.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 10+ "'", var16.equals(10));

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test304");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    int var26 = var19.size();
    boolean var27 = var19.isEmpty();
    exercise03.RingBufferWrapper var28 = new exercise03.RingBufferWrapper();
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    var28.enqueue((java.lang.Object)10.0f);
    java.lang.Object var33 = var28.dequeue();
    int var34 = var28.size();
    int var35 = var28.size();
    var19.enqueue((java.lang.Object)var28);
    boolean var37 = var28.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + 10.0f+ "'", var33.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test305");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10L);
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    int var9 = var0.size();
    int var10 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10L+ "'", var4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)10+ "'", var7.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test306");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    int var3 = var0.size();
    int var4 = var0.size();
    int var5 = var0.size();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    var6.enqueue((java.lang.Object)'a');
    java.lang.Object var9 = var6.dequeue();
    var6.enqueue((java.lang.Object)"hi!");
    java.lang.Object var12 = var6.dequeue();
    int var13 = var6.size();
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    boolean var15 = var14.isEmpty();
    boolean var16 = var14.isEmpty();
    var6.enqueue((java.lang.Object)var16);
    java.lang.Object var18 = var6.dequeue();
    int var19 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var21 = var6.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 'a'+ "'", var9.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "hi!"+ "'", var12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + true+ "'", var18.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test307");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    boolean var2 = var0.isEmpty();
    exercise03.RingBufferWrapper var3 = new exercise03.RingBufferWrapper();
    var3.enqueue((java.lang.Object)'a');
    java.lang.Object var6 = var3.dequeue();
    var3.enqueue((java.lang.Object)"hi!");
    java.lang.Object var9 = var3.dequeue();
    int var10 = var3.size();
    int var11 = var3.size();
    boolean var12 = var3.isEmpty();
    boolean var13 = var3.isEmpty();
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    int var15 = var14.size();
    var14.enqueue((java.lang.Object)10);
    java.lang.Object var18 = var14.dequeue();
    boolean var19 = var14.isEmpty();
    exercise03.RingBufferWrapper var20 = new exercise03.RingBufferWrapper();
    boolean var21 = var20.isEmpty();
    boolean var22 = var20.isEmpty();
    boolean var23 = var20.isEmpty();
    int var24 = var20.size();
    var14.enqueue((java.lang.Object)var20);
    java.lang.Object var26 = var14.dequeue();
    int var27 = var14.size();
    int var28 = var14.size();
    exercise03.RingBufferWrapper var29 = new exercise03.RingBufferWrapper();
    boolean var30 = var29.isEmpty();
    boolean var31 = var29.isEmpty();
    var29.enqueue((java.lang.Object)10.0f);
    java.lang.Object var34 = var29.dequeue();
    var29.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var37 = var29.dequeue();
    var14.enqueue((java.lang.Object)var29);
    java.lang.Object var39 = var14.dequeue();
    var3.enqueue((java.lang.Object)var14);
    var0.enqueue((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 'a'+ "'", var6.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "hi!"+ "'", var9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 10+ "'", var18.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + 10.0f+ "'", var34.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + (-1.0f)+ "'", var37.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test308");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    var0.enqueue((java.lang.Object)1.0f);
    java.lang.Object var8 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 1.0f+ "'", var8.equals(1.0f));

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test309");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    int var7 = var0.size();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    boolean var9 = var8.isEmpty();
    var8.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var12 = var8.dequeue();
    boolean var13 = var8.isEmpty();
    int var14 = var8.size();
    boolean var15 = var8.isEmpty();
    int var16 = var8.size();
    int var17 = var8.size();
    var0.enqueue((java.lang.Object)var8);
    int var19 = var8.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var20 = var8.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (-1.0d)+ "'", var12.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test310");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    exercise03.RingBufferWrapper var7 = new exercise03.RingBufferWrapper();
    int var8 = var7.size();
    var7.enqueue((java.lang.Object)10);
    java.lang.Object var11 = var7.dequeue();
    boolean var12 = var7.isEmpty();
    var0.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var0.dequeue();
    boolean var15 = var0.isEmpty();
    boolean var16 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 10+ "'", var11.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + true+ "'", var14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test311");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var9);
    int var14 = var9.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var9.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test312");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    int var13 = var0.size();
    int var14 = var0.size();
    boolean var15 = var0.isEmpty();
    int var16 = var0.size();
    exercise03.RingBufferWrapper var17 = new exercise03.RingBufferWrapper();
    int var18 = var17.size();
    var17.enqueue((java.lang.Object)10);
    java.lang.Object var21 = var17.dequeue();
    boolean var22 = var17.isEmpty();
    exercise03.RingBufferWrapper var23 = new exercise03.RingBufferWrapper();
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    boolean var26 = var23.isEmpty();
    int var27 = var23.size();
    var17.enqueue((java.lang.Object)var23);
    java.lang.Object var29 = var17.dequeue();
    exercise03.RingBufferWrapper var30 = new exercise03.RingBufferWrapper();
    int var31 = var30.size();
    var30.enqueue((java.lang.Object)10);
    java.lang.Object var34 = var30.dequeue();
    boolean var35 = var30.isEmpty();
    exercise03.RingBufferWrapper var36 = new exercise03.RingBufferWrapper();
    boolean var37 = var36.isEmpty();
    boolean var38 = var36.isEmpty();
    boolean var39 = var36.isEmpty();
    int var40 = var36.size();
    var30.enqueue((java.lang.Object)var36);
    var17.enqueue((java.lang.Object)var36);
    exercise03.RingBufferWrapper var43 = new exercise03.RingBufferWrapper();
    boolean var44 = var43.isEmpty();
    var43.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var47 = var43.dequeue();
    boolean var48 = var43.isEmpty();
    var43.enqueue((java.lang.Object)"hi!");
    var36.enqueue((java.lang.Object)var43);
    java.lang.Object var52 = var36.dequeue();
    var0.enqueue(var52);
    java.lang.Object var54 = var0.dequeue();
    boolean var55 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + 10+ "'", var21.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + 10+ "'", var34.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + (-1.0d)+ "'", var47.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test313");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    var9.enqueue((java.lang.Object)'a');
    java.lang.Object var12 = var9.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    java.lang.Object var25 = var13.dequeue();
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    int var27 = var26.size();
    var26.enqueue((java.lang.Object)10);
    java.lang.Object var30 = var26.dequeue();
    boolean var31 = var26.isEmpty();
    exercise03.RingBufferWrapper var32 = new exercise03.RingBufferWrapper();
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    boolean var35 = var32.isEmpty();
    int var36 = var32.size();
    var26.enqueue((java.lang.Object)var32);
    var13.enqueue((java.lang.Object)var32);
    var9.enqueue((java.lang.Object)var13);
    var0.enqueue((java.lang.Object)var13);
    java.lang.Object var41 = var13.dequeue();
    exercise03.RingBufferWrapper var42 = new exercise03.RingBufferWrapper();
    int var43 = var42.size();
    var42.enqueue((java.lang.Object)10L);
    java.lang.Object var46 = var42.dequeue();
    var42.enqueue((java.lang.Object)(short)10);
    java.lang.Object var49 = var42.dequeue();
    int var50 = var42.size();
    exercise03.RingBufferWrapper var51 = new exercise03.RingBufferWrapper();
    boolean var52 = var51.isEmpty();
    boolean var53 = var51.isEmpty();
    int var54 = var51.size();
    var42.enqueue((java.lang.Object)var54);
    java.lang.Object var56 = var42.dequeue();
    boolean var57 = var42.isEmpty();
    var13.enqueue((java.lang.Object)var57);
    java.lang.Object var59 = var13.dequeue();
    int var60 = var13.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)100+ "'", var7.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 'a'+ "'", var12.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + 10+ "'", var30.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + 10L+ "'", var46.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + (short)10+ "'", var49.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + 0+ "'", var56.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + true+ "'", var59.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test314");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    int var26 = var19.size();
    boolean var27 = var19.isEmpty();
    exercise03.RingBufferWrapper var28 = new exercise03.RingBufferWrapper();
    var28.enqueue((java.lang.Object)'a');
    java.lang.Object var31 = var28.dequeue();
    int var32 = var28.size();
    exercise03.RingBufferWrapper var33 = new exercise03.RingBufferWrapper();
    var33.enqueue((java.lang.Object)'a');
    java.lang.Object var36 = var33.dequeue();
    var33.enqueue((java.lang.Object)"hi!");
    var28.enqueue((java.lang.Object)var33);
    var19.enqueue((java.lang.Object)var33);
    java.lang.Object var41 = var19.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var42 = var19.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + 'a'+ "'", var31.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + 'a'+ "'", var36.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test315");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var5 = var0.dequeue();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    var6.enqueue((java.lang.Object)10.0f);
    java.lang.Object var11 = var6.dequeue();
    int var12 = var6.size();
    boolean var13 = var6.isEmpty();
    int var14 = var6.size();
    boolean var15 = var6.isEmpty();
    exercise03.RingBufferWrapper var16 = new exercise03.RingBufferWrapper();
    boolean var17 = var16.isEmpty();
    boolean var18 = var16.isEmpty();
    boolean var19 = var16.isEmpty();
    int var20 = var16.size();
    boolean var21 = var16.isEmpty();
    var6.enqueue((java.lang.Object)var16);
    java.lang.Object var23 = var6.dequeue();
    int var24 = var6.size();
    var0.enqueue((java.lang.Object)var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (short)10+ "'", var5.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 10.0f+ "'", var11.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test316");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    var0.enqueue((java.lang.Object)var19);
    boolean var26 = var19.isEmpty();
    boolean var27 = var19.isEmpty();
    boolean var28 = var19.isEmpty();
    exercise03.RingBufferWrapper var29 = new exercise03.RingBufferWrapper();
    var19.enqueue((java.lang.Object)var29);
    exercise03.RingBufferWrapper var31 = new exercise03.RingBufferWrapper();
    boolean var32 = var31.isEmpty();
    boolean var33 = var31.isEmpty();
    var31.enqueue((java.lang.Object)10.0f);
    java.lang.Object var36 = var31.dequeue();
    boolean var37 = var31.isEmpty();
    int var38 = var31.size();
    int var39 = var31.size();
    exercise03.RingBufferWrapper var40 = new exercise03.RingBufferWrapper();
    boolean var41 = var40.isEmpty();
    boolean var42 = var40.isEmpty();
    boolean var43 = var40.isEmpty();
    int var44 = var40.size();
    boolean var45 = var40.isEmpty();
    int var46 = var40.size();
    exercise03.RingBufferWrapper var47 = new exercise03.RingBufferWrapper();
    var47.enqueue((java.lang.Object)'a');
    var40.enqueue((java.lang.Object)var47);
    java.lang.Object var51 = var40.dequeue();
    var31.enqueue((java.lang.Object)var40);
    boolean var53 = var40.isEmpty();
    exercise03.RingBufferWrapper var54 = new exercise03.RingBufferWrapper();
    boolean var55 = var54.isEmpty();
    var54.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var58 = var54.dequeue();
    var40.enqueue((java.lang.Object)var54);
    int var60 = var54.size();
    var29.enqueue((java.lang.Object)var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + 10.0f+ "'", var36.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + (-1.0d)+ "'", var58.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test317");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    int var2 = var0.size();
    int var3 = var0.size();
    var0.enqueue((java.lang.Object)(short)0);
    java.lang.Object var6 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (short)0+ "'", var6.equals((short)0));

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test318");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    exercise03.RingBufferWrapper var7 = new exercise03.RingBufferWrapper();
    int var8 = var7.size();
    var7.enqueue((java.lang.Object)10);
    var0.enqueue((java.lang.Object)var7);
    java.lang.Object var12 = var0.dequeue();
    boolean var13 = var0.isEmpty();
    boolean var14 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test319");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    int var5 = var0.size();
    boolean var6 = var0.isEmpty();
    var0.enqueue((java.lang.Object)0.0f);
    java.lang.Object var9 = var0.dequeue();
    int var10 = var0.size();
    int var11 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 0.0f+ "'", var9.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test320");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10L);
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var0.dequeue();
    boolean var15 = var0.isEmpty();
    exercise03.RingBufferWrapper var16 = new exercise03.RingBufferWrapper();
    boolean var17 = var16.isEmpty();
    int var18 = var16.size();
    int var19 = var16.size();
    boolean var20 = var16.isEmpty();
    var0.enqueue((java.lang.Object)var16);
    boolean var22 = var16.isEmpty();
    boolean var23 = var16.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10L+ "'", var4.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)10+ "'", var7.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0+ "'", var14.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test321");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    exercise03.RingBufferWrapper var7 = new exercise03.RingBufferWrapper();
    int var8 = var7.size();
    var7.enqueue((java.lang.Object)10);
    var0.enqueue((java.lang.Object)var7);
    java.lang.Object var12 = var7.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 10+ "'", var12.equals(10));

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test322");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    boolean var7 = var0.isEmpty();
    boolean var8 = var0.isEmpty();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    int var12 = var9.size();
    var0.enqueue((java.lang.Object)var9);
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    int var15 = var14.size();
    var14.enqueue((java.lang.Object)10L);
    java.lang.Object var18 = var14.dequeue();
    var14.enqueue((java.lang.Object)(short)10);
    java.lang.Object var21 = var14.dequeue();
    int var22 = var14.size();
    exercise03.RingBufferWrapper var23 = new exercise03.RingBufferWrapper();
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    int var26 = var23.size();
    var14.enqueue((java.lang.Object)var26);
    var9.enqueue((java.lang.Object)var26);
    java.lang.Object var29 = var9.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var30 = var9.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 10L+ "'", var18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + (short)10+ "'", var21.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + 0+ "'", var29.equals(0));

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test323");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var8 = var0.dequeue();
    int var9 = var0.size();
    var0.enqueue((java.lang.Object)(byte)1);
    java.lang.Object var12 = var0.dequeue();
    int var13 = var0.size();
    int var14 = var0.size();
    int var15 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + (byte)1+ "'", var12.equals((byte)1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test324");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    int var8 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test325");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    int var5 = var0.size();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    var6.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var10 = var6.dequeue();
    boolean var11 = var6.isEmpty();
    var0.enqueue((java.lang.Object)var11);
    java.lang.Object var13 = var0.dequeue();
    int var14 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + true+ "'", var13.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test326");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var5 = var0.dequeue();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    var6.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var10 = var6.dequeue();
    var6.enqueue((java.lang.Object)(byte)100);
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var14 = var0.dequeue();
    int var15 = var0.size();
    boolean var16 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (short)10+ "'", var5.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test327");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    boolean var13 = var0.isEmpty();
    int var14 = var0.size();
    int var15 = var0.size();
    int var16 = var0.size();
    int var17 = var0.size();
    int var18 = var0.size();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    var19.enqueue((java.lang.Object)(short)10);
    java.lang.Object var24 = var19.dequeue();
    boolean var25 = var19.isEmpty();
    int var26 = var19.size();
    var0.enqueue((java.lang.Object)var19);
    var19.enqueue((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + (short)10+ "'", var24.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test328");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var0.dequeue();
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test329");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    int var10 = var0.size();
    boolean var11 = var0.isEmpty();
    int var12 = var0.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test330");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    boolean var14 = var13.isEmpty();
    var0.enqueue((java.lang.Object)var14);
    java.lang.Object var16 = var0.dequeue();
    exercise03.RingBufferWrapper var17 = new exercise03.RingBufferWrapper();
    int var18 = var17.size();
    var17.enqueue((java.lang.Object)10);
    java.lang.Object var21 = var17.dequeue();
    var17.enqueue((java.lang.Object)10);
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var25 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + true+ "'", var16.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + 10+ "'", var21.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + 10+ "'", var25.equals(10));

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test331");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    boolean var13 = var0.isEmpty();
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    int var15 = var14.size();
    var14.enqueue((java.lang.Object)10L);
    java.lang.Object var18 = var14.dequeue();
    var14.enqueue((java.lang.Object)(short)10);
    java.lang.Object var21 = var14.dequeue();
    int var22 = var14.size();
    exercise03.RingBufferWrapper var23 = new exercise03.RingBufferWrapper();
    boolean var24 = var23.isEmpty();
    boolean var25 = var23.isEmpty();
    int var26 = var23.size();
    var14.enqueue((java.lang.Object)var26);
    java.lang.Object var28 = var14.dequeue();
    exercise03.RingBufferWrapper var29 = new exercise03.RingBufferWrapper();
    boolean var30 = var29.isEmpty();
    var29.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var33 = var29.dequeue();
    int var34 = var29.size();
    boolean var35 = var29.isEmpty();
    boolean var36 = var29.isEmpty();
    var14.enqueue((java.lang.Object)var36);
    var0.enqueue((java.lang.Object)var36);
    java.lang.Object var39 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 10L+ "'", var18.equals(10L));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + (short)10+ "'", var21.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + 0+ "'", var28.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + (-1.0d)+ "'", var33.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + true+ "'", var39.equals(true));

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test332");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    boolean var10 = var0.isEmpty();
    int var11 = var0.size();
    int var12 = var0.size();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    boolean var20 = var19.isEmpty();
    boolean var21 = var19.isEmpty();
    boolean var22 = var19.isEmpty();
    int var23 = var19.size();
    var13.enqueue((java.lang.Object)var19);
    java.lang.Object var25 = var13.dequeue();
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    int var27 = var26.size();
    var26.enqueue((java.lang.Object)10);
    java.lang.Object var30 = var26.dequeue();
    boolean var31 = var26.isEmpty();
    exercise03.RingBufferWrapper var32 = new exercise03.RingBufferWrapper();
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    boolean var35 = var32.isEmpty();
    int var36 = var32.size();
    var26.enqueue((java.lang.Object)var32);
    var13.enqueue((java.lang.Object)var32);
    exercise03.RingBufferWrapper var39 = new exercise03.RingBufferWrapper();
    boolean var40 = var39.isEmpty();
    var39.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var43 = var39.dequeue();
    boolean var44 = var39.isEmpty();
    var39.enqueue((java.lang.Object)"hi!");
    var32.enqueue((java.lang.Object)var39);
    java.lang.Object var48 = var39.dequeue();
    int var49 = var39.size();
    exercise03.RingBufferWrapper var50 = new exercise03.RingBufferWrapper();
    boolean var51 = var50.isEmpty();
    boolean var52 = var50.isEmpty();
    boolean var53 = var50.isEmpty();
    int var54 = var50.size();
    boolean var55 = var50.isEmpty();
    int var56 = var50.size();
    exercise03.RingBufferWrapper var57 = new exercise03.RingBufferWrapper();
    int var58 = var57.size();
    var57.enqueue((java.lang.Object)10);
    java.lang.Object var61 = var57.dequeue();
    boolean var62 = var57.isEmpty();
    var50.enqueue((java.lang.Object)var62);
    java.lang.Object var64 = var50.dequeue();
    boolean var65 = var50.isEmpty();
    exercise03.RingBufferWrapper var66 = new exercise03.RingBufferWrapper();
    var66.enqueue((java.lang.Object)'a');
    java.lang.Object var69 = var66.dequeue();
    var66.enqueue((java.lang.Object)"hi!");
    java.lang.Object var72 = var66.dequeue();
    int var73 = var66.size();
    int var74 = var66.size();
    var50.enqueue((java.lang.Object)var66);
    var39.enqueue((java.lang.Object)var50);
    var0.enqueue((java.lang.Object)var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + 10+ "'", var30.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + (-1.0d)+ "'", var43.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "hi!"+ "'", var48.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + 10+ "'", var61.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + true+ "'", var64.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + 'a'+ "'", var69.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "hi!"+ "'", var72.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test333");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    int var2 = var0.size();
    int var3 = var0.size();
    exercise03.RingBufferWrapper var4 = new exercise03.RingBufferWrapper();
    boolean var5 = var4.isEmpty();
    boolean var6 = var4.isEmpty();
    var4.enqueue((java.lang.Object)10.0f);
    java.lang.Object var9 = var4.dequeue();
    int var10 = var4.size();
    boolean var11 = var4.isEmpty();
    exercise03.RingBufferWrapper var12 = new exercise03.RingBufferWrapper();
    boolean var13 = var12.isEmpty();
    var12.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var16 = var12.dequeue();
    boolean var17 = var12.isEmpty();
    int var18 = var12.size();
    boolean var19 = var12.isEmpty();
    var4.enqueue((java.lang.Object)var12);
    var0.enqueue((java.lang.Object)var4);
    java.lang.Object var22 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 10.0f+ "'", var9.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + (-1.0d)+ "'", var16.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test334");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    boolean var10 = var0.isEmpty();
    int var11 = var0.size();
    int var12 = var0.size();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    int var14 = var13.size();
    var13.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var13.dequeue();
    boolean var18 = var13.isEmpty();
    int var19 = var13.size();
    exercise03.RingBufferWrapper var20 = new exercise03.RingBufferWrapper();
    boolean var21 = var20.isEmpty();
    var20.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var24 = var20.dequeue();
    int var25 = var20.size();
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    var26.enqueue((java.lang.Object)'a');
    java.lang.Object var29 = var26.dequeue();
    var26.enqueue((java.lang.Object)"hi!");
    java.lang.Object var32 = var26.dequeue();
    int var33 = var26.size();
    boolean var34 = var26.isEmpty();
    java.lang.Object var35 = new java.lang.Object();
    var26.enqueue(var35);
    var20.enqueue((java.lang.Object)var26);
    var13.enqueue((java.lang.Object)var26);
    var0.enqueue((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 10+ "'", var17.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + (-1.0d)+ "'", var24.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + 'a'+ "'", var29.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "hi!"+ "'", var32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test335");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    int var6 = var0.size();
    exercise03.RingBufferWrapper var7 = new exercise03.RingBufferWrapper();
    int var8 = var7.size();
    var7.enqueue((java.lang.Object)10);
    java.lang.Object var11 = var7.dequeue();
    boolean var12 = var7.isEmpty();
    var0.enqueue((java.lang.Object)var12);
    java.lang.Object var14 = var0.dequeue();
    boolean var15 = var0.isEmpty();
    exercise03.RingBufferWrapper var16 = new exercise03.RingBufferWrapper();
    var16.enqueue((java.lang.Object)'a');
    java.lang.Object var19 = var16.dequeue();
    var16.enqueue((java.lang.Object)"hi!");
    java.lang.Object var22 = var16.dequeue();
    int var23 = var16.size();
    int var24 = var16.size();
    var0.enqueue((java.lang.Object)var16);
    int var26 = var16.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 10+ "'", var11.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + true+ "'", var14.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + 'a'+ "'", var19.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test336");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    int var9 = var0.size();
    boolean var10 = var0.isEmpty();
    exercise03.RingBufferWrapper var11 = new exercise03.RingBufferWrapper();
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    var11.enqueue((java.lang.Object)10.0f);
    java.lang.Object var16 = var11.dequeue();
    int var17 = var11.size();
    int var18 = var11.size();
    int var19 = var11.size();
    exercise03.RingBufferWrapper var20 = new exercise03.RingBufferWrapper();
    int var21 = var20.size();
    var20.enqueue((java.lang.Object)10);
    java.lang.Object var24 = var20.dequeue();
    exercise03.RingBufferWrapper var25 = new exercise03.RingBufferWrapper();
    var25.enqueue((java.lang.Object)'a');
    java.lang.Object var28 = var25.dequeue();
    int var29 = var25.size();
    exercise03.RingBufferWrapper var30 = new exercise03.RingBufferWrapper();
    var30.enqueue((java.lang.Object)'a');
    java.lang.Object var33 = var30.dequeue();
    var30.enqueue((java.lang.Object)"hi!");
    var25.enqueue((java.lang.Object)var30);
    java.lang.Object var37 = var25.dequeue();
    var20.enqueue(var37);
    var11.enqueue((java.lang.Object)var20);
    var0.enqueue((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 10.0f+ "'", var16.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + 10+ "'", var24.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + 'a'+ "'", var28.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + 'a'+ "'", var33.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test337");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var8 = var0.dequeue();
    boolean var9 = var0.isEmpty();
    int var10 = var0.size();
    exercise03.RingBufferWrapper var11 = new exercise03.RingBufferWrapper();
    int var12 = var11.size();
    boolean var13 = var11.isEmpty();
    boolean var14 = var11.isEmpty();
    var0.enqueue((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + (-1.0f)+ "'", var8.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test338");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(short)10);
    java.lang.Object var5 = var0.dequeue();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    var6.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var10 = var6.dequeue();
    var6.enqueue((java.lang.Object)(byte)100);
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var14 = var6.dequeue();
    exercise03.RingBufferWrapper var15 = new exercise03.RingBufferWrapper();
    int var16 = var15.size();
    var15.enqueue((java.lang.Object)10);
    java.lang.Object var19 = var15.dequeue();
    boolean var20 = var15.isEmpty();
    exercise03.RingBufferWrapper var21 = new exercise03.RingBufferWrapper();
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    boolean var24 = var21.isEmpty();
    int var25 = var21.size();
    var15.enqueue((java.lang.Object)var21);
    int var27 = var21.size();
    int var28 = var21.size();
    var6.enqueue((java.lang.Object)var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + (short)10+ "'", var5.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + (-1.0d)+ "'", var10.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + (byte)100+ "'", var14.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + 10+ "'", var19.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test339");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    exercise03.RingBufferWrapper var10 = new exercise03.RingBufferWrapper();
    var10.enqueue((java.lang.Object)'a');
    java.lang.Object var13 = var10.dequeue();
    int var14 = var10.size();
    boolean var15 = var10.isEmpty();
    boolean var16 = var10.isEmpty();
    boolean var17 = var10.isEmpty();
    var0.enqueue((java.lang.Object)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 'a'+ "'", var13.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test340");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isEmpty();
    exercise03.RingBufferWrapper var6 = new exercise03.RingBufferWrapper();
    boolean var7 = var6.isEmpty();
    boolean var8 = var6.isEmpty();
    boolean var9 = var6.isEmpty();
    int var10 = var6.size();
    var0.enqueue((java.lang.Object)var6);
    java.lang.Object var12 = var0.dequeue();
    int var13 = var0.size();
    int var14 = var0.size();
    exercise03.RingBufferWrapper var15 = new exercise03.RingBufferWrapper();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    var15.enqueue((java.lang.Object)10.0f);
    java.lang.Object var20 = var15.dequeue();
    var15.enqueue((java.lang.Object)(-1.0f));
    java.lang.Object var23 = var15.dequeue();
    var0.enqueue((java.lang.Object)var15);
    int var25 = var15.size();
    exercise03.RingBufferWrapper var26 = new exercise03.RingBufferWrapper();
    int var27 = var26.size();
    var26.enqueue((java.lang.Object)10);
    java.lang.Object var30 = var26.dequeue();
    boolean var31 = var26.isEmpty();
    exercise03.RingBufferWrapper var32 = new exercise03.RingBufferWrapper();
    boolean var33 = var32.isEmpty();
    boolean var34 = var32.isEmpty();
    boolean var35 = var32.isEmpty();
    int var36 = var32.size();
    var26.enqueue((java.lang.Object)var32);
    java.lang.Object var38 = var26.dequeue();
    exercise03.RingBufferWrapper var39 = new exercise03.RingBufferWrapper();
    int var40 = var39.size();
    var39.enqueue((java.lang.Object)10);
    java.lang.Object var43 = var39.dequeue();
    boolean var44 = var39.isEmpty();
    exercise03.RingBufferWrapper var45 = new exercise03.RingBufferWrapper();
    boolean var46 = var45.isEmpty();
    boolean var47 = var45.isEmpty();
    boolean var48 = var45.isEmpty();
    int var49 = var45.size();
    var39.enqueue((java.lang.Object)var45);
    var26.enqueue((java.lang.Object)var45);
    var45.enqueue((java.lang.Object)(byte)10);
    java.lang.Object var54 = var45.dequeue();
    var15.enqueue((java.lang.Object)var45);
    int var56 = var45.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 10+ "'", var4.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 10.0f+ "'", var20.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + (-1.0f)+ "'", var23.equals((-1.0f)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + 10+ "'", var30.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + 10+ "'", var43.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + (byte)10+ "'", var54.equals((byte)10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test341");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    int var6 = var0.size();
    int var7 = var0.size();
    int var8 = var0.size();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    int var10 = var9.size();
    var9.enqueue((java.lang.Object)10);
    java.lang.Object var13 = var9.dequeue();
    exercise03.RingBufferWrapper var14 = new exercise03.RingBufferWrapper();
    var14.enqueue((java.lang.Object)'a');
    java.lang.Object var17 = var14.dequeue();
    int var18 = var14.size();
    exercise03.RingBufferWrapper var19 = new exercise03.RingBufferWrapper();
    var19.enqueue((java.lang.Object)'a');
    java.lang.Object var22 = var19.dequeue();
    var19.enqueue((java.lang.Object)"hi!");
    var14.enqueue((java.lang.Object)var19);
    java.lang.Object var26 = var14.dequeue();
    var9.enqueue(var26);
    var0.enqueue((java.lang.Object)var9);
    java.lang.Object var29 = var9.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10+ "'", var13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 'a'+ "'", var17.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + 'a'+ "'", var22.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test342");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var4 = var0.dequeue();
    var0.enqueue((java.lang.Object)(byte)100);
    java.lang.Object var7 = var0.dequeue();
    int var8 = var0.size();
    int var9 = var0.size();
    int var10 = var0.size();
    boolean var11 = var0.isEmpty();
    exercise03.RingBufferWrapper var12 = new exercise03.RingBufferWrapper();
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    int var15 = var12.size();
    int var16 = var12.size();
    int var17 = var12.size();
    exercise03.RingBufferWrapper var18 = new exercise03.RingBufferWrapper();
    boolean var19 = var18.isEmpty();
    var18.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var22 = var18.dequeue();
    boolean var23 = var18.isEmpty();
    int var24 = var18.size();
    boolean var25 = var18.isEmpty();
    int var26 = var18.size();
    int var27 = var18.size();
    boolean var28 = var18.isEmpty();
    int var29 = var18.size();
    var12.enqueue((java.lang.Object)var29);
    var0.enqueue((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (-1.0d)+ "'", var4.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (byte)100+ "'", var7.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + (-1.0d)+ "'", var22.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test343");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    int var4 = var0.size();
    boolean var5 = var0.isEmpty();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    exercise03.RingBufferWrapper var8 = new exercise03.RingBufferWrapper();
    boolean var9 = var8.isEmpty();
    boolean var10 = var8.isEmpty();
    boolean var11 = var8.isEmpty();
    int var12 = var8.size();
    exercise03.RingBufferWrapper var13 = new exercise03.RingBufferWrapper();
    boolean var14 = var13.isEmpty();
    boolean var15 = var13.isEmpty();
    var13.enqueue((java.lang.Object)10.0f);
    java.lang.Object var18 = var13.dequeue();
    boolean var19 = var13.isEmpty();
    boolean var20 = var13.isEmpty();
    var8.enqueue((java.lang.Object)var13);
    int var22 = var13.size();
    var0.enqueue((java.lang.Object)var13);
    int var24 = var13.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + 10.0f+ "'", var18.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test344");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isEmpty();
    int var7 = var0.size();
    int var8 = var0.size();
    boolean var9 = var0.isEmpty();
    int var10 = var0.size();
    boolean var11 = var0.isEmpty();
    exercise03.RingBufferWrapper var12 = new exercise03.RingBufferWrapper();
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    int var15 = var12.size();
    int var16 = var12.size();
    int var17 = var12.size();
    exercise03.RingBufferWrapper var18 = new exercise03.RingBufferWrapper();
    boolean var19 = var18.isEmpty();
    var18.enqueue((java.lang.Object)(-1.0d));
    java.lang.Object var22 = var18.dequeue();
    boolean var23 = var18.isEmpty();
    int var24 = var18.size();
    boolean var25 = var18.isEmpty();
    int var26 = var18.size();
    int var27 = var18.size();
    boolean var28 = var18.isEmpty();
    int var29 = var18.size();
    var12.enqueue((java.lang.Object)var29);
    var0.enqueue((java.lang.Object)var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 10.0f+ "'", var5.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + (-1.0d)+ "'", var22.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test345");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    int var1 = var0.size();
    int var2 = var0.size();
    int var3 = var0.size();
    var0.enqueue((java.lang.Object)(short)0);
    java.lang.Object var6 = var0.dequeue();
    int var7 = var0.size();
    boolean var8 = var0.isEmpty();
    exercise03.RingBufferWrapper var9 = new exercise03.RingBufferWrapper();
    int var10 = var9.size();
    var9.enqueue((java.lang.Object)10);
    java.lang.Object var13 = var9.dequeue();
    boolean var14 = var9.isEmpty();
    exercise03.RingBufferWrapper var15 = new exercise03.RingBufferWrapper();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    boolean var18 = var15.isEmpty();
    int var19 = var15.size();
    var9.enqueue((java.lang.Object)var15);
    java.lang.Object var21 = var9.dequeue();
    exercise03.RingBufferWrapper var22 = new exercise03.RingBufferWrapper();
    int var23 = var22.size();
    var22.enqueue((java.lang.Object)10);
    java.lang.Object var26 = var22.dequeue();
    boolean var27 = var22.isEmpty();
    exercise03.RingBufferWrapper var28 = new exercise03.RingBufferWrapper();
    boolean var29 = var28.isEmpty();
    boolean var30 = var28.isEmpty();
    boolean var31 = var28.isEmpty();
    int var32 = var28.size();
    var22.enqueue((java.lang.Object)var28);
    var9.enqueue((java.lang.Object)var28);
    boolean var35 = var28.isEmpty();
    exercise03.RingBufferWrapper var36 = new exercise03.RingBufferWrapper();
    boolean var37 = var36.isEmpty();
    boolean var38 = var36.isEmpty();
    var36.enqueue((java.lang.Object)10.0f);
    java.lang.Object var41 = var36.dequeue();
    boolean var42 = var36.isEmpty();
    int var43 = var36.size();
    int var44 = var36.size();
    var28.enqueue((java.lang.Object)var36);
    boolean var46 = var36.isEmpty();
    exercise03.RingBufferWrapper var47 = new exercise03.RingBufferWrapper();
    int var48 = var47.size();
    var47.enqueue((java.lang.Object)10);
    java.lang.Object var51 = var47.dequeue();
    int var52 = var47.size();
    exercise03.RingBufferWrapper var53 = new exercise03.RingBufferWrapper();
    boolean var54 = var53.isEmpty();
    boolean var55 = var53.isEmpty();
    boolean var56 = var53.isEmpty();
    int var57 = var53.size();
    int var58 = var53.size();
    boolean var59 = var53.isEmpty();
    int var60 = var53.size();
    int var61 = var53.size();
    var47.enqueue((java.lang.Object)var53);
    var36.enqueue((java.lang.Object)var47);
    java.lang.Object var64 = var36.dequeue();
    var0.enqueue(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (short)0+ "'", var6.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 10+ "'", var13.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + 10+ "'", var26.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + 10.0f+ "'", var41.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + 10+ "'", var51.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var64);

  }

}
