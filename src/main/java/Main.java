import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import dog.*;

public class Main {
  public static void main(String args[]) {
    String layout = "templates/layout.vtl";
    get("/", (req, res) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/dogs.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
