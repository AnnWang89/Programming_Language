package programming;

public class Main {

	public static void main(String[] args) {
		System.out.println("1 ");
		System.out.println("(new And(new Lit(true), new Lit(false))).eval(): "+(new And(new Lit(true), new Lit(false))).eval());
		System.out.println("(new And(new Lit(true), new Lit(true))).eval(): "+(new And(new Lit(true), new Lit(true))).eval());
		System.out.println("(new Or(new Lit(true), new Lit(false))).eval(): "+(new Or(new Lit(true), new Lit(false))).eval());
		System.out.println("(new Or(new Lit(false), new Lit(false))).eval(): "+(new Or(new Lit(false), new Lit(false))).eval());
		
		System.out.println("1-1");
		System.out.println("(new Not(new Lit(true))).eval(): "+(new Not(new Lit(true))).eval());
		System.out.println("(new Not(new Lit(false))).eval(): "+(new Not(new Lit(false))).eval());
		
		System.out.println("1-2");
		System.out.println("(new Lit(true)).toSExp(): "+(new Lit(true)).toSExp());
		System.out.println("(new Lit(false)).toSExp(): "+(new Lit(false)).toSExp());
		System.out.println("(new Not(new Lit(false))).toSExp(): "+(new Not(new Lit(false))).toSExp());
		System.out.println("(new And(new Lit(true), new Lit(false))).toSExp(): "+(new And(new Lit(true), new Lit(false))).toSExp());
		System.out.println("(new Or(new Lit(true), new Lit(false))).toSExp(): "+(new Or(new Lit(true), new Lit(false))).toSExp());
		System.out.println("(new Or(new Lit(true), new And(new Lit(true), new Lit(false)))).toSExp(): "+(new Or(new Lit(true), new And(new Lit(true), new Lit(false)))).toSExp());
	}

}
