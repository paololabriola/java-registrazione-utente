package jana60;

public class Utente {

	String nome, cognome, email, password;
	int eta;
	public Utente(String nome, String cognome, String email, String password, int eta) throws Exception{
		
		super();
		
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.eta = eta;
	
		this.validaEmail();
		this.validaPassword();
		this.validaEta();
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public void validaEmail()  throws Exception {
		
			if(!email.contains("@") || !email.contains("."))
				throw new Exception("La e-mail deve contenere il carattere @ e il carattere . in essa.");
			
	}
	
	public void validaPassword() throws Exception {
		
		if(password.length() < 8 || password.length() > 12)
			throw new Exception("La password deve essere compresa tra gli 8 e i 12 caratteri.");
		
	}
	
	public void validaEta() throws Exception {
		
		if(eta < 18)
			throw new Exception("L'utente deve essere maggiorenne.");
		
	}
	
	@Override
	public String toString() {
		
		return "Nome utente: " + nome + "\nCognome utente: " + cognome + "\nE-mail: " + email + "\nPassword: " + password + "\nEtà utente: " + eta;
		
	}
	
}
