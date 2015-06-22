import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({RingBufferTest.class, RingBufferTestImproved.class, RingBufferTestCoverage.class, RingBufferMutationTest.class})
public class AllTests {

}

