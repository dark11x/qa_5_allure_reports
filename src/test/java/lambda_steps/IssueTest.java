package lambda_steps;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class IssueTest {
    @Test
    public void searchForIssue() {
        step("Открываем главную страницу", () -> {
            open("https://github.com/");
        });
        step("Ищем репозиторий", () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys("eroshenkoam/allure-example");
            $(".header-search-input").submit();
        });
        step("Переходим в репозиторий eroshenkoam/allure-example", () -> {
            $(By.linkText("eroshenkoam/allure-example")).click();
        });
        step("Проверим что вкладка Issues существует", () -> {
            $(withText("Issues")).should(Condition.exist);
        });
    }
}
