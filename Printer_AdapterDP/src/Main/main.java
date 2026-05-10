package Main;

import New.PrinterAdapter;
import New.printer;
import Old.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OldPrinter op=new OldPrinter();
		printer p=new PrinterAdapter(op);
		p.print();

	}

}
