package main;


import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bin="";
		int dec=0;
		boolean validateInput=false;
		while(validateInput==false) {
			try {
				dec=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero decimal para converter para numero binario"));
				validateInput=true;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Formato invalido, por favor digitar novamente");
				validateInput=false;
			}
		}
		while(true) {
			if (dec==1) {
				bin=bin.concat(String.valueOf(dec));
				bin=new StringBuilder(bin).reverse().toString();
				break;
				}
			bin=bin.concat(String.valueOf(dec%2));
			dec=dec/2;			
		}
		JOptionPane.showMessageDialog(null,"Resultado: "+ bin);
	}

	}

