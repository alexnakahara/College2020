package exIgor;

public class Aluno {
    
    private int ra;
    private String email;
    private String nome;
    
    public Aluno() {}
    
    public Aluno(int ra, String email, String nome) {
    	this.ra = ra;
    	this.email = email;
    	this.nome = nome;
    }

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
    
}