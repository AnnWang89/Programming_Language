package programming;

public class Not extends Exp {
    private Exp e1;
    private String S;
    public Not(Exp a1) {
        e1=a1;
        S="[not "+e1.toSExp()+"]";
    }
    public boolean eval() {
        return !e1.eval();
    }
    public String toSExp() {  	
        return S;
    }
}