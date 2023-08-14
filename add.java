public class add{
    public static void main (String [] args){
        int x  =12 ;
        int y= 23;
        while(y!= 0){
            int c = x&y;
            x = x^y;
            y=c<<1;
        }
        System.out.println("x is"+x);
    }
}