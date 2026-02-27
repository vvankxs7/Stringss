import java.util.Scanner;

	public class DemoCliente{
		public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		Cliente c = new Cliente();

		String nome;
		float montanteVendas;
		System.out.println("\n\n===Entrada de Dados===\n");
		System.out.println("\nNome: ");
		nome = sc.nextLine();

		System.out.println("\nMontante das Vendas: ");
		montanteVendas = sc.nextFloat();
		
			c.setNome(nome);
			c.setMontanteVendas(montanteVendas);
		
		System.out.println("\n\n===Entrada de Dados===\n");
		System.out.println("\nNome: \n"+c.getNome());
		System.out.println("\nMontante das Vendas: "+c.getMontanteVendas());

		System.out.println("\n\n===Entrada de Dados===\n");
		System.out.println("\nDados do Clientes: \n"+c);

		Cliente c2 = new Cliente();
		Cliente aux;
		sc.nextLine();

		System.out.println("\n\n===Entrada de Dados===\n");
		System.out.println("\nNome: ");
		nome = sc.nextLine();

		System.out.println("\nMontante das Vendas: ");
		montanteVendas = sc.nextFloat();
		
		c2.setNome(nome);
		c2.setMontanteVendas(montanteVendas);

		aux = c;
		c = c2;
		c2 = aux;

		System.out.println("\n\n===Entrada de Dados===\n");
		System.out.println("\nDados do Cliente c: "+c);
		System.out.println("\nDados do Cliente c2: "+c2);

		System.out.println("\n\n===Entrada de Dados===\n");
		if (c.getNome().equals(c2.getNome())){
		System.out.println("\nos nomes sao iguais: ");
		}else{
		System.out.println("\nos nomes são diferentes: ");
		}

		
		sc.close();
	}
}
