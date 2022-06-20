package annotated_steps;

import org.junit.jupiter.api.Test;

public class AnnotationStepsTest {

    private final static String REPOSITORY = "eroshenkoam/allure-example";

    private IssueTest steps = new IssueTest();

    @Test
    public void testIssueTab() {
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.checkIssueTab();
    }
}
