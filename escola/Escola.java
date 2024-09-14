package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno leandro = new Aluno();
		leandro.setNome("Leandro");
		leandro.setIdade(29);
		
		System.out.println("O aluno " + leandro.getNome() + " tem " + leandro.getIdade() + " anos ");
		
}
}
