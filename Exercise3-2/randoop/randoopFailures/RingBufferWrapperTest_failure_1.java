package randoopFailures;

import junit.framework.*;

public class RingBufferWrapperTest_failure_1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest_failure_1.test1");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    java.lang.Object var1 = var0.dequeue();

  }

}
