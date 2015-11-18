public class Bill1{
  
  public static int coogie() {
    int bird = 0;
    for (int l=0; l <100000; l++) {
      
      for (int m = 0; m < 100; m++) {
        bird += (l + m + 2);
      }
      
    }
    return bird;
  }
  
  
  public static int noogie() {
    int bird = 0;
    for (int l=0; l <1000; l++) {
      for (int m = 0; m < 100; m++) {
        bird += (l + m);
      }
    }
    return bird;
  }
  
  
  public static void main(String[] args) {
    int bird = 0;
    for (long k = 0; k < 100000000; k++) {
      bird += 2;
    }
    System.out.println(bird);
  }
  
}
