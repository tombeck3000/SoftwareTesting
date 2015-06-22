package randoopFailures;

import junit.framework.*;

public class RingBufferWrapperTest_failure_4 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperTest_failure_4.test1");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    int var4 = var0.size();

  }

}
