package programming_2;

abstract class Exp {
	  public abstract Object accept(Visitor v);
	  
}

class Lit extends Exp {
	 public boolean val;
	 public String S;
	 public Lit(boolean val) {
		 this.val = val;
		 if(val)
			 this.S = "T";
		 else
			 this.S = "F";
	 }
	  public Object accept(Visitor v) {
	    return v.visit(this);
	  }
}

interface Visitor {
	  public Object visit(Lit e);
	  public Object visit(And e);
	  public Object visit(Or e);
	  public Object visit(Not e);
}

class Interpreter implements Visitor {
	public Object visit(Lit n) {
		return n.val;
	}
	public Object visit(And n) {
		    return (Boolean)n.e1.accept(this)&&(Boolean)n.e2.accept(this);
	}
	public Object visit(Or n) {
	    return (Boolean)n.e1.accept(this)||(Boolean)n.e2.accept(this);
	}
	public Object visit(Not n) {
	    return !(Boolean)n.e1.accept(this);
	}
}
class SExpPrinter implements Visitor {
	public Object visit(Lit n) {
		return n.S;
	}
	public Object visit(And n) {
		    return "[and "+(String)n.e1.accept(this)+" "+(String)n.e2.accept(this)+"]";
	}
	public Object visit(Or n) {
		return "[or "+(String)n.e1.accept(this)+" "+(String)n.e2.accept(this)+"]";
	}
	public Object visit(Not n) {
		return "[not "+(String)n.e1.accept(this)+"]";
	}
}
class And extends Exp{
		public Exp e1,e2;
		public And(Exp a1,Exp a2) {
			e1 = a1;
			e2 = a2;
		}
		public Object accept(Visitor v) {
		    return v.visit(this);
		}
}
class Or extends Exp{
	public Exp e1,e2;
	public Or(Exp a1,Exp a2) {
		e1 = a1;
		e2 = a2;
	}
	public Object accept(Visitor v) {
	    return v.visit(this);
	}
}
class Not extends Exp{
	public Exp e1;
	public Not(Exp a1) {
		e1 = a1;
	}
	public Object accept(Visitor v) {
	    return v.visit(this);
	}
}