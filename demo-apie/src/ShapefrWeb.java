public interface ShapefrWeb { //=Shape2
  //Problems:
  // no attribute for interface!!! not good!!!不能轉彎
  // Before Java 8, no static & no default method
  double areafrweb();

  default double calculate(){
    return areafrweb() + 3;
  }

}
