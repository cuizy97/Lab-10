class Cookie {
  // instance variables with access controls:
  private int number;
  private int bakeTemp;
  private int bakeTime;
  private boolean baked;

  //two constructors:
  public Cookie(){
    this.number = 0;
    this.bakeTemp = 0;
    this.bakeTime = 0;
    this.baked = false;
  }
  public Cookie(int num, int temp, int time){
    this.number = num;
    this.bakeTemp = temp;
    this.bakeTime = time;
    this.baked = false;
  }
  // accessor for isReady():
  public boolean isReady() {
    return this.baked;
  }
  // mutator for number available:
  public void setNum(int num){
    this.number = num;
  }
  // method to bake cookies:
  public void bake(int temp, int time) {
    this.bakeTemp = temp;
    this.bakeTime = time;
    System.out.println(this.number + " cookies were baked at " + 
    this.bakeTemp + " degrees F for " + this.bakeTime + " minutes.");
    this.baked = true; // cookies have been baked. set to true
  }




}