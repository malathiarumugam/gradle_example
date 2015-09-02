import static org.junit.Assert.*;
import org.junit.*;
import java.util.Arrays;
import dog.*;

public class DogTest {
  private Dog dog[];
  @Before
  public void setUp() {
    System.out.println("@Befores setUp");
    int n = 32, i;
    this.dog = new Dog[n];
    this.dog[0] = new Dog("bulldog");
    this.dog[1] = new Dog("alpine");
    for(i = 2; i < n; i++) {
      this.dog[i] = new Dog("husky");
    }
  }
  @Test
  public void assertNotEqualsBreed() {
      assertTrue(!this.dog[0].equals(dog[1]));
  }
  @Test
  public void assertNotEqualsHashCode() {
      assertTrue(this.dog[0].hashCode() != this.dog[1].hashCode());
  }
  @Test
  public void assertHashCodeNotZero() {
      assertTrue(this.dog[0].hashCode() > 0);
  }
  @Test
  public void assertEqualsBreed() {
      assertTrue(this.dog[2].equals(this.dog[3]));
  }
  @Test
  public void assertFirst() {
      Arrays.sort(this.dog, new DogComparator());
      assertTrue(this.dog[0].getBreed() == "alpine");
  }
}
