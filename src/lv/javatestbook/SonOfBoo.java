package lv.javatestbook;

public class SonOfBoo extends Boo{
    public SonOfBoo(){
        super("Boo");
    }
    public SonOfBoo(int i){
        super("Fred");
    }
    public SonOfBoo(String s){
        super(42);
        System.out.println(s);
    }
    public SonOfBoo(int i, String s){}
}
