package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_1.test1");


    exercise03.RingBufferWrapper var0 = new exercise03.RingBufferWrapper();
    var0.enqueue((java.lang.Object)'a');
    var0.enqueue((java.lang.Object)10.0f);

  }

}
