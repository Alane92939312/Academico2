import java.time.LocalDate;

public class Cliente {

	private String nome;
	private String  cpf;
	private LocalDate dataDeNascimento;
	private String numeroDeTelefone;
	private String cidade;
	private String uf;
	
	
	
	//Metodo construtor
	public Cliente(String nome, String cpf, LocalDate dataDeNascimento, String numeroDeTelefone, String cidade,
			String uf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
		this.numeroDeTelefone = numeroDeTelefone;
		this.cidade = cidade;
		this.uf = uf;
	}
	
	//Gets e sets
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getNumeroDeTelefone() {
		return numeroDeTelefone;
	}
	public void setNumeroDeTelefone(String numeroDeTelefone) {
		this.numeroDeTelefone = numeroDeTelefone;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
	//Metodo para retonar dataNascimento como String
			public String getDataComoString(){
				return dataDeNascimento.getDayOfMonth()+ "/"+
						dataDeNascimento.getMonthValue() + "/"+
						dataDeNascimento.getYear();
			
			}
		
			
	
}
