package New;

import Old.OldPrinter;

public class PrinterAdapter implements printer {

	private OldPrinter op;
	public PrinterAdapter(OldPrinter o)
	{
		this.op=o;
	}
	public void print() {
		// TODO Auto-generated method stub
		op.oldPrint();

	}

}
