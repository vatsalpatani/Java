public class SwitchCase {
    public static void main(String[] args) {
        char code = 'r';
        switch(code){
            case 'r' : System.out.println("Red");
                        break;
            case 'g' : System.out.println("Green");
                        break;
            case 'b' : System.out.println("Blue");
                        break;
            default : System.out.println("Invalid");
        }
    }
}
// output : Red