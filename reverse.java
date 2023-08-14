public class reverse{
    public static void main(String[] args){
        String a = "APPLE";
        System.out.println("Reverse :");
        for(int i =a.length(); i>0 ; --i){
            System.out.println(a.charAt(i-1));
        }
    }
}