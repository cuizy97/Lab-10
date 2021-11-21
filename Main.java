class Main {
  public static void main(String[] args) {
    // new Sugar object named tree with tree shape:
    Sugar tree = new Sugar ("tree");
    // cut out 10 tree shapes:
    tree.cutOut(tree.getShape(), 10);
    // bake tree object:
    tree.bake(350, 12);
    // decorate tree object:
    tree.decorateCookie();

    // new Sugar object called aCookie:
    Sugar aCookie = new Sugar();
    aCookie.decorateCookie();

  }
}