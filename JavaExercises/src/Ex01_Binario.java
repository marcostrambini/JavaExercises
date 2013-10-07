import java.util.Scanner;


public class Ex01_Binario {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int risposta = 0;
		
		do{
		System.out.println("Inserisci un numero: ");
	    risposta = scanner.nextInt();
		}while (risposta<0);
		
		System.out.print("hai inserito il numero "+risposta);
		
		String binario = "";
		
		do{
			binario = risposta%2 + binario;
			risposta /=2;
		}while (risposta>0);
		
		System.out.println(" -> in binario: "+binario);
		
	}

}
