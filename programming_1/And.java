package programming;

public class And extends Exp {
    private Exp e1,e2;
    private String S;
    public And(Exp a1,Exp a2) {
        e1=a1;
        e2=a2;
        S="[and "+e1.toSExp()+" "+e2.toSExp()+"]";
    }
    public boolean eval() {
        return e1.eval()&&e2.eval();
    }
    public String toSExp() {
    	
        return S;
    }
}
