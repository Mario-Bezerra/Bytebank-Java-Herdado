
public class TesteAutenticação {

	public static void main(String[] args) {
		
		Autenticavel g = new Gerente();
		g.setSenha(2222);

		Autenticavel c = new Cliente();
		c.setSenha(2444);

		Autenticavel adm = new Administrador();
		adm.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(c);
		si.autentica(adm);
		
	}

}
