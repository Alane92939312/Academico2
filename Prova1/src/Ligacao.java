import java.time.LocalDateTime;

public class Ligacao {
	
// Atributos
	private int codigo;
	private String numeroDeTelefoneDestino;
	private LocalDateTime dataHoraInicio;
	private LocalDateTime dataHoraFim;
	private String cidadeDeDestino;
	private String uFDeDestino;
	private Cliente cliente;
	
	
	// Metodo construtor
	public Ligacao(int codigo, String numeroDeTelefoneDestino, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim,
			String cidadeDeDestino, String uFDeDestino, Cliente cliente) {
		super();
		this.codigo = codigo;
		this.numeroDeTelefoneDestino = numeroDeTelefoneDestino;
		this.dataHoraInicio = dataHoraInicio;
		this.dataHoraFim = dataHoraFim;
		this.cidadeDeDestino = cidadeDeDestino;
		this.uFDeDestino = uFDeDestino;
		this.cliente = cliente;
	}
	
	
	//Gets sets
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNumeroDeTelefoneDestino() {
		return numeroDeTelefoneDestino;
	}
	public void setNumeroDeTelefoneDestino(String numeroDeTelefoneDestino) {
		this.numeroDeTelefoneDestino = numeroDeTelefoneDestino;
	}
	public LocalDateTime getDataHoraInicio() {
		return dataHoraInicio;
	}
	public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}
	public LocalDateTime getDataHoraFim() {
		return dataHoraFim;
	}
	public void setDataHoraFim(LocalDateTime dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}
	public String getCidadeDeDestino() {
		return cidadeDeDestino;
	}
	public void setCidadeDeDestino(String cidadeDeDestino) {
		this.cidadeDeDestino = cidadeDeDestino;
	}
	public String getuFDeDestino() {
		return uFDeDestino;
	}
	public void setuFDeDestino(String uFDeDestino) {
		this.uFDeDestino = uFDeDestino;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
