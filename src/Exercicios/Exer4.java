/* Este c�digo tem o objetivo de receber 10 valores e fatoriar
 * estes n�meros e informar o usu�rio estes valores
 */

package Exercicios;

import javax.swing.JOptionPane;

public class Exer4 {

	public static void main(String[] args) {
		double Val[]= new double[10], Fat[] = new double[10];
		String Final ="";
		
		for(int x =0; x<10; x++) {//1� for que visa receber o valor digitado pelo usu�rio de �nicio
			Val[x] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o " + (x+1) + "� valor", "FatorialPrime", 3));
			
			Fat[x]=1;
			
			for(int y =1; y<=Val[x]; y++){//2� forque visa fazer a fatoria��o at� alcan�armos o valor desejado(Ex: 6! = 1x2x3x4x5x6 = 720(Fatoria��o de 6))
				Fat[x] *= y;  
			}
			
			
			/* Analise da "volta" do loop e atribu���o
			  do valor e seu resultado p�s fatoriar
			 */
			if(x==9) 
				Final += Val[x] + "! = " + Fat[x] ;
			else
				Final += Val[x] + "! = " + Fat[x] + "\n";
				
		}
		JOptionPane.showMessageDialog(null, "Fatorial de Valores\n" + Final);
	}

}
