# pets
<HTML>
<HEAD>
<TITLE>Proyecto_github</TITLE>
</HEAD>
<BODY>
<P>Hola Mundo</P>
</BODY>
</HTML>

import java.util.Scanner;

public class peces {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		long peces = 200;
		int dias  = 0;
		for ( int i=1;i <=48;i++) {
			peces = (peces*2)- 100;
			dias = dias+15;
			System.out.println(i +" "+peces +" "+ dias );
			
		}
		
	}

}

