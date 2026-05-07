package Main;

import database.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		databaseConnection i1=databaseConnection.getInstance();
		databaseConnection i2=databaseConnection.getInstance();
		if(i1==i2) {System.out.println("Both the instances are same");}
		
	}

}
