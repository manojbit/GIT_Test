
interface interf{
    public void m1();
}


public class Test1 {
    int y=777;
    public void m2(){
        int manoj=22;
        interf interf=() -> {
            int x=888;
            System.out.println(x);
            System.out.println(y);
          //  manoj=87;   //Not allowed
            x=7857;
        };
        interf.m1();
    }

    public static void main(String[] args) {
        Test1 test1= new Test1();
        test1.m2();
    }

}
