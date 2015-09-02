package validate;

public class Validate {
  public Validate() {}
  public boolean stringIsEmpty(String str) {
    return str == null || str.isEmpty();
  }
  public boolean stringIsNumeric(String str) {
    try {
      Double.parseDouble(str);
    } catch (Exception e) {
      return false;
    }
    return true;
  }
}
