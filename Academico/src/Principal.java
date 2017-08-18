
public class Principal {

	public static void main(String[] args) {
		// Variavel
		Aluno a1 = new Aluno("Ana Luiza", "4572896", 25, "Ciencia da Computação", "vespertino", "F");
		
		Disciplina d1 = new Disciplina("LTP1","Ciencia da Computação", 48);
		
		
	//	System.out.println("Nome: " + a1.getNome());
	//	System.out.println("RA: " + a1.getRA());
	//	System.out.println("Idade: " + a1.getIdade());
	//	System.out.println("Curso: " + a1.getCurso());
	//	System.out.println("Turno: " + a1.getTurno());
	//	System.out.println("Sexo: " + a1.getSexo());
		
		System.out.println(a1.imprimirAluno());
		System.out.println(a1.getCurso());
		
	}

}
