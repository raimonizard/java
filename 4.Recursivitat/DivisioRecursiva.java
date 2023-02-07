public class DivisioRecursiva {
  public static void main(String[] args){
    int divisio = divisioRecursiva(6, 2);
    System.out.println(divisio);
}

  public static int divisioRecursiva(int a, int b) {
      if (a < b) { // Cas Base
          return 0;
      }else {
          return 1 + divisioRecursiva(a - b, b); // Cas recursiu
      }
  }

  public static int divisioRecursiva2(int a, int b) {
      if (a - b < 0) { // Cas Base
          return 0;
      } else {
          return 1 + divisioRecursiva2(a - b, b); // Cas recursiu
      }
  }
}
