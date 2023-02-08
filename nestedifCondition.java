public class nestedifCondition {
    public static void main(String[] args) {
        int n = 10;
        if( n != 0){
            if( n %2 == 0){
                System.out.println("this number is even");
            }else{
                System.out.println("this number is odd");
            }
        }else{
            System.out.println("this number is zero");
        }
    }
}
// output : this number is even