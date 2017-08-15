public class JavaOperatorsDemo {
    public static void main(String[] args) {
        int x = 1;
        System.out.println(x++);
        if((4 > x) ^ (++x + 2) > 3) {
            x++;
        }
        
        if((4 > ++x) ^ !(++x == 5)) {
            x++;
        }        
        
        System.out.println("x again 2 is " + x);
    }
}