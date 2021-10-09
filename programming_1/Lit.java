package programming;

public class Lit extends Exp {
    private boolean val;
    private String str;
    public Lit(boolean val) {
        this.val = val;
        if(val)
        	this.str ="T";
        else
        	this.str ="F";
        
    }
    
    public boolean eval() {
        return this.val;
    }
    public String toSExp() {
        return this.str;
    }
}