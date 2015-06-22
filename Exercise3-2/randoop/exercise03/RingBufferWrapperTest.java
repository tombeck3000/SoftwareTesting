package exercise03;
import junit.framework.*;
import junit.textui.*;

public class RingBufferWrapperTest extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public RingBufferWrapperTest(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(RingBufferWrapperTest0.class));
    result.addTest(new TestSuite(randoopFailures.RingBufferWrapperTest_failure_1.class));
    result.addTest(new TestSuite(randoopFailures.RingBufferWrapperTest_failure_2.class));
    result.addTest(new TestSuite(randoopFailures.RingBufferWrapperTest_failure_3.class));
    result.addTest(new TestSuite(randoopFailures.RingBufferWrapperTest_failure_4.class));
    return result;
  }

}
