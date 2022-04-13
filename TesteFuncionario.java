
public class TesteFuncionario {
	
	public static void main(String[] args) {

	Funcionario f1 = new Gerente();
	
	f1.setNome("Mario Bezerra");
	f1.setCpf("6546546546");
	f1.setSalario(2500);
	
	System.out.println(f1.getNome());
	System.out.println(f1.getCpf());
	System.out.println(f1.getSalario());
	
	
	}
}
