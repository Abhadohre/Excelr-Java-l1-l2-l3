public class add5{
    public static void main(String args[]){
        int a=0;
        int t= 100;
        for(int i=1; i<=t; i++){
            if(i%5==0){
                System.out.println(i+" ");
                a+=i;
            }
        }
        System.out.println("sum"+a);
    }
}