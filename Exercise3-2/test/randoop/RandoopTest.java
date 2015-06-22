package randoop;
import junit.framework.*;
import junit.textui.*;

public class RandoopTest extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public RandoopTest(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(RandoopTest0.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_1.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_2.class));
    result.addTest(new TestSuite(randoopFailures.RandoopTest_failure_3.class));
    return result;
  }

}
