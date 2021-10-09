package programming_2;

public class Main {

	public static void main(String[] args) {
		Interpreter intp = new Interpreter();
		//2
		System.out.println("(Boolean) (new And(new Lit(true), new Lit(false))).accept(intp): "+(Boolean) (new And(new Lit(true), new Lit(false))).accept(intp));
		System.out.println("(Boolean) (new And(new Lit(true), new Lit(true))).accept(intp): "+(Boolean) (new And(new Lit(true), new Lit(true))).accept(intp));
		System.out.println("(Boolean) (new Or(new Lit(true), new Lit(false))).accept(intp): "+(Boolean) (new Or(new Lit(true), new Lit(false))).accept(intp));
		System.out.println("(Boolean) (new Or(new Lit(false), new Lit(false))).accept(intp): "+(Boolean) (new Or(new Lit(false), new Lit(false))).accept(intp));
		System.out.println("(Boolean) (new Lit(true)).accept(intp): "+(Boolean) (new Lit(true)).accept(intp));
		//2-1
		SExpPrinter prt = new SExpPrinter();
		System.out.println("(new Lit(true)).accept(prt): "+(new Lit(true)).accept(prt));
		System.out.println("(new Lit(false)).accept(prt): "+(new Lit(false)).accept(prt));
		//2-2
		System.out.println("(new Not((new Lit(false)))).accept(intp): "+(new Not((new Lit(false)))).accept(intp));
		System.out.println("(new Not((new Lit(false)))).accept(prt): "+(new Not((new Lit(false)))).accept(prt));
		System.out.println("(new And(new Lit(true), new Lit(false))).accept(prt): "+(new And(new Lit(true), new Lit(false))).accept(prt));
		System.out.println("(new Or(new Lit(true), new Lit(false))).accept(prt): "+(new Or(new Lit(true), new Lit(false))).accept(prt));
		System.out.println("(new Or(new Lit(true), new And(new Lit(true), new Lit(false)))).accept(prt): "+(new Or(new Lit(true), new And(new Lit(true), new Lit(false)))).accept(prt));
	}

}
