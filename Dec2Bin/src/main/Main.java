package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bin="";
		int dec=0;
		
		System.out.println("Digite o numero decimal para converter para numero binario");
		Scanner input= new Scanner(System.in);
		dec=input.nextInt();
		
		while(true) {
			bin=bin.concat(String.valueOf(dec%2));
			dec=dec/2;
			
			if (dec==1) {
				bin=bin.concat(String.valueOf(dec));
				bin=new StringBuilder(bin).reverse().toString();
				break;
			}
		}
		
		System.out.println(bin);
		input.close();
	}

}
