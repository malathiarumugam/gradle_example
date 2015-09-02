package dog;

public class Dog extends Animal {
  public Dog(String breed) {
    this.breed = breed;
  }
  public boolean equals(Object obj) {
    if(!(obj instanceof Dog)) {
      return false;
    }
    if(obj == this) {
      return true;
    }
    Dog rhs = (Dog)obj;
    if(this.breed.compareTo(rhs.getBreed()) == 0) {
      return true;
    }
    return false;
  }
  public int hashCode() {
    return this.breed.hashCode();
  }
  public String getBreed() {
    return breed;
  }
  private String breed;
}
