import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

      String inputtedStringForPuzzle = request.queryParams("userInput");
      VowelPuzzle newVowelPuzzle = new VowelPuzzle();
      String results = newVowelPuzzle.makePuzzle(inputtedStringForPuzzle);

      model.put("finalPuzzle", results);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
