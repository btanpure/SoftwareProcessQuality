package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	PushTestCase.class,
	PopTestCase.class,
	IsEmptyTestCase.class
})
public class JunitSuite 
{

}
