package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import zayavki.ChangeContract;
import zayavki.NewContract;
import zayavki.Receipt;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                Receipt.class,
                NewContract.class,
                ChangeContract.class
        }
)
public class SmokeSuite {
}
