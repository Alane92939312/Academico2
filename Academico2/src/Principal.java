import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(Calendar.YEAR, 2011);
		dataNascimento.set(Calendar.MONTH, Calendar.AUGUST);
		dataNascimento.set(Calendar.DAY_OF_MONTH, 10);	
		
	
		//Criar objeto da classe Aluno
				Aluno c1 = new Aluno("Luiz", "125478", "M", dataNascimento);		
				Disciplina d1 = new Disciplina("Joao", "Portugues", 45);
				Professor p1 = new Professor("Arthur", "457", "Doutorado", "02504177899");
				Turma t1 = new Turma("Turma K", p1, d1);
				
				System.out.println(c1.getDataComoString());
				
	}
	}


