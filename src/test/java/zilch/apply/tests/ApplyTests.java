package zilch.apply.tests;

import org.testng.annotations.Test;
import zilch.apply.base.BaseTest;

public class ApplyTests extends BaseTest {

    @Test()
    public void loginBlankEmailTest() {

        applyPage.clickEmail();
    }
}
