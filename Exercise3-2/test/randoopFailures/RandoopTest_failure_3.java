package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_3 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_3.test1");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(-1.0d));
    int var4 = var0.size();

  }

}
