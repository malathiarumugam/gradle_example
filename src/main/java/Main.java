import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import dog.*;

public class Main {
  public static void main(String args[]) {
    get("/", (req, res) -> {
      return new ModelAndView(new HashMap(), "templates/layout.vtl");
    }, new VelocityTemplateEngine());
  }
}
