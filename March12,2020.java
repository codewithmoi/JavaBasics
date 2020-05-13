public class javabasics {
    public static void main(String args[]) {
      /*
      -these are super basic code ment for beginner programmers!!
      -we will cover adding and subtracting
      -we will also cover basic printing
      -we will also discover the difference between int (integer) and double (decimal)
      -we will also touch a bit on casting
      */
      
      //adding and subtracting with ints
        int a = 4;
        int b = 5;
        int sum = a+b;
        int difference = a-b;
        System.out.println("the sum of "+a+" and "+b+" is "+sum);
        System.out.println("the difference of "+a+" and "+b+" is "+difference);
      
      //adding and subtracting with doubles
        double c = 2.0;
        double d = 3.0;
        double sum02 = c+d;
        double difference02 = d-c;
        System.out.println("the sum of "+c+" and "+d+" is "+sum02);
        System.out.println("the difference of "+c+" and "+d+" is "+difference02);
      
      //casting with ints
        int g = (int)-2.0;
        System.out.println("the value of g is "+g);
        int r = (int)(2-3.0);
        System.out.println("the value of r is "+r);
        int x = (int)2.9999999+1;
        System.out.println("the value of x is "+x);
        
      //casting with doubles
      double L = 2+3.0;
      
    }
}
