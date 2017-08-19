import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		
	
		//Criar objeto da classe Aluno
				Aluno a1 = new Aluno("Luiz", "125478", "M", LocalDate.of(2017,6,30));		
				Disciplina d1 = new Disciplina("Joao", "Portugues", 45);
				Professor p1 = new Professor("Arthur", "457", "Doutorado", "02504177899");
				Turma t1 = new Turma("Turma K", p1, d1);
				
				
				//Adicionar A1 em T1
				t1.adicionarAluno(a1);
				
				
				
				
				System.out.println(t1.getAlunos().get(0).getNome());
				Aluno a2 = new  Aluno("maria", "8888", "F",LocalDate.of(2017,6,30));
				t1.adicionarAluno(a2);
				 
				System.out.println();
				
				System.out.println(a1.getDataComoString());
				
				System.out.println(a1.getRA());
				System.out.println(d1.getCurso());
				System.out.println(p1.getCPF());
				System.out.println(t1.getDisciplina());
				
				
				
				
				
				
				
				
	}
	}


