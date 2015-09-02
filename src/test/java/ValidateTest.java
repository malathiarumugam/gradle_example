import static org.junit.Assert.*;
import org.junit.*;
import validate.Validate;

public class ValidateTest {
  private Validate validate;
  @Before
  public void setUp() {
    this.validate = new Validate();
  }
  @Test
  public void assertIsEmpty() {
    assertTrue(this.validate.stringIsEmpty(""));
  }
  @Test
  public void assertIsNumeric() {
    assertTrue(this.validate.stringIsNumeric("123"));
  }
  @Test
  public void assertIsNotNumeric() {
    assertTrue(!this.validate.stringIsNumeric("abc"));
  }
}
