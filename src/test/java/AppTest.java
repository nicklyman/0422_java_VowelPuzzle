import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }
  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("W-RD P-ZZL-!!!");
  }
  @Test
  public void containsVowels() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("tree");
    submit(".btn");
    assertThat(pageSource()).contains("tr--");
  }
  @Test
  public void containsMultipleWordsAndVowels() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("That is a tall tree!");
    submit(".btn");
    assertThat(pageSource()).contains("Th-t -s - t-ll tr--!");
  }
  @Test
  public void containsMultipleWordsAndCapitalVowels() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("THAT IS A TALL TREE!");
    submit(".btn");
    assertThat(pageSource()).contains("TH-T -S - T-LL TR--!");
  }
  @Test
  public void resultsRootTest() {
    goTo("http://localhost:4567/");
    fill("#userInput").with("It is Friday!");
    submit(".btn");
    assertThat(pageSource()).contains("Can you figure the word puzzle out?!?");
  }
}
