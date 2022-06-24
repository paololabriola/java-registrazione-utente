package jana60;

import java.util.Scanner;

public class Registrazione {

	public static void main(String[] args) throws Exception {
		
		boolean procedi = false;
		int eta;
		String mail, password, cognome, nome;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			try {   
				
				System.out.print("Inserisci il nome dell'utente: ");
				nome = scan.nextLine();
			
				System.out.print("Inserisci il cognome dell'utente: ");
				cognome = scan.nextLine();
				
				System.out.print("Inserisci la mail dell'utente: ");
				mail = scan.nextLine();
			    	  
				System.out.print("Inserisci la password dell'utente: ");
				password = scan.nextLine();
				
				System.out.print("Inserisci l'età dell'utente: ");
				eta = Integer.parseInt(scan.nextLine());
				
				Utente utente1 = new Utente(nome, cognome, mail, password, eta);
				procedi = true;
				
				System.out.println("Hai creato un nuovo utente correttamente.");
				System.out.println(utente1.toString());
			      
			} catch(NumberFormatException numberFormatException) {
				
				System.out.println("Hai inserito un carattere non valido, l'età deve essere un numero intero.");
				System.out.println(numberFormatException.getMessage());
				
			}
			
			catch(Exception e) {
				
				System.out.println("Impossibile registrare l'utente. Riprova.");
				System.out.println(e.getMessage());
				
			}
			
		}while(!procedi);
		
		scan.close();
		
	}
	
}
