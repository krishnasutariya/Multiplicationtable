package LearnJava;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    //using scanner 
		Scanner input = new Scanner (System.in);
	    System.out.print("Input No: ");
	    int a = input.nextInt();
		
	    for(int i=1;i<=10;i++)
	    {
	    	int b = a * i;
	    	System.out.println(a  + "*" + i + "=" +  b);
	    }
	    
	}

}
