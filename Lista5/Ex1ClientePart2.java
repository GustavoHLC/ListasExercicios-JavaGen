package Lista5;

public class Ex1ClientePart2 {
	public static void main(String[] args) {
		
		Ex1ClientePart1 cli = new Ex1ClientePart1();
		cli.setNomeCliente("Paulo");
		cli.setIdadeCliente(25);
		cli.setCpfCliente(123456789);
		

		System.out.println("Nome do cliente: " + cli.getNomeCliente());
		System.out.println("Idade do Cliente: " + cli.getIdadeCliente());
		System.out.println("CPF do cliente: " + cli.getCpfCliente());
	}
}
