// extends Cookie
public class Sugar extends Cookie {
  // instance variables:
  private String shape;
  private boolean decorated;
  // two constructors
  public Sugar() {
    this.shape = "";
    this.decorated = false;
  }
  public Sugar(String aShape) { // @param: aShape
    this.shape = aShape;
    this.decorated = false;
  }
  // accessor for shape:
  public String getShape(){
    return shape;
  }
  // mutator for shape;
  public void setShape(String aShape) { // @param: aShape
    this.shape = aShape;
  }
  
  // method to allow cut out shapes:
  // @param: aShape, number (of how many cookies to cut)
  public void cutOut(String aShape, int number) { 
    //this.shape = aShape;
    System.out.println(number + " cookies were cut into " + aShape);
    this.setNumber(number);
  }

  // method to decorate cookies when baked:
  public void decorateCookie() {
    //boolean check = isReady();
    if (isReady() == true) {
      this.decorated = true;
      System.out.println("The cookies were decorated");
    }
    else {
      System.out.println("Make sure to bake the cookies first");
    }
  }


}