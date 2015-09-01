import static spark.Spark.*;
import dog.*;

public class Main {
  public static void main(String args[]) {
    get("/hello", (req, res) -> "Hello from Main.java");
  }
}
