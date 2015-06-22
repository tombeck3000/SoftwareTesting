package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_2.test1");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.enqueue((java.lang.Object)10.0f);
    boolean var5 = var0.isEmpty();

  }

}
