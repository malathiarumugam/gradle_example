import java.util.HashMap;
import java.util.LinkedList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import dog.*;
import validate.Validate;

public class Main {
  public static void main(String args[]) {
    String layout = "templates/layout.vtl";
    LinkedList<Dog> breed = new LinkedList<Dog>();
    Validate validate = new Validate();
    get("/", (req, res) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/dogs.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
    get("/breed", (req, res) -> {
      String _breed = req.queryParams("breed");
      if(validate.stringIsEmpty(_breed)) {
        halt(401, "breed is empty");
      }
      if(validate.stringIsNumeric(_breed)) {
        halt(401, "breed is numeric");
      }
      Dog dog = new Dog(_breed);
      breed.add(dog);
      HashMap model = new HashMap();
      model.put("breed", breed);
      model.put("template", "templates/breed.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
