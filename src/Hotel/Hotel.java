package Hotel;
import java.util.ArrayList;
import java.util.Scanner;
public class Hotel {
	public static ArrayList<ArrayList<String>> clientes = new ArrayList<>();
	public static ArrayList<ArrayList<String>> quartos = new ArrayList<>();
	
	static void cadCliente(String a, String b, String c, String d, String e, String f, String g) {
		int size = clientes.size();
		ArrayList<String> dadosclientes = new ArrayList<String>();
		dadosclientes.add(a);
		dadosclientes.add(b);
		dadosclientes.add(c);
		dadosclientes.add(d);
		dadosclientes.add(e);
		dadosclientes.add(f);
		dadosclientes.add(g);
		clientes.add(dadosclientes);
		System.out.println("Cliente cadastrado.");
		System.out.println("Nome: "+ clientes.get(size).get(0) +", Data de Nascimento: "+ clientes.get(size).get(1) +", E-mail: "+ clientes.get(size).get(2) +", Telefone: "+ clientes.get(size).get(3) +", Cidade: "+ clientes.get(size).get(4) +", UF: "+ clientes.get(size).get(5) +", Fumante? "+ clientes.get(size).get(6) +".");
		System.out.println("--------------------------------------------------------");
	}
	static void cadQuartos(String a, String b, String c, String d, String e, String f) {
		int size = quartos.size();
		ArrayList<String> dadosQuartos = new ArrayList<String>();
		dadosQuartos.add(a);
		dadosQuartos.add(b);
		dadosQuartos.add(c);
		dadosQuartos.add(d);
		dadosQuartos.add(e);
		dadosQuartos.add(f);
		dadosQuartos.add("0");
		dadosQuartos.add("");
		quartos.add(dadosQuartos);
		System.out.println("Quarto cadastrado.");
		System.out.println("Nome: "+ quartos.get(size).get(0) +", Posição: "+ quartos.get(size).get(1) +", Fumante: "+ quartos.get(size).get(2) +", Valor: "+ quartos.get(size).get(3) +", Quantidade de Quartos: "+ quartos.get(size).get(4) +", Quantidade de Pessoas: "+ quartos.get(size).get(5) +".");
		System.out.println("--------------------------------------------------------");
	}
	static void listCliente() {
		for (int i = 0; i < clientes.size(); i++) {
			for(int j = 0; j < clientes.get(i).size();j++) {
				switch (j) {
					case 0:
						System.out.print((i+1)+" - Nome: "+ clientes.get(i).get(j) +", ");
						break;
					case 1:
						System.out.print("Data de nascimento: "+ clientes.get(i).get(j) +", ");
						break;
					case 2:
						System.out.print("E-mail: "+ clientes.get(i).get(j) +", ");
						break;
					case 3:
						System.out.print("Telefone: "+ clientes.get(i).get(j) +", ");
						break;
					case 4:
						System.out.print("Cidade: "+ clientes.get(i).get(j) +", ");
						break;
					case 5:
						System.out.print("UF: "+ clientes.get(i).get(j) +", ");
						break;
					case 6:
						System.out.print("Fumante: "+ clientes.get(i).get(j) +";");
						break;
				}
			}
			System.out.println();
		}			
	}
	static void listQuartos() {
		for (int i = 0; i < quartos.size(); i++) {
			for(int j = 0; j < quartos.get(i).size();j++) {
				switch (j) {
					case 0:
						System.out.print((i+1)+" - Nome: "+ quartos.get(i).get(j) +", ");
						break;
					case 1:
						System.out.print("Posição: "+ quartos.get(i).get(j) +", ");
						break;
					case 2:
						System.out.print("Fumante: "+ quartos.get(i).get(j) +", ");
						break;
					case 3:
						System.out.print("Valor: "+ quartos.get(i).get(j) +", ");
						break;
					case 4:
						System.out.print("Quantidade de Quartos: "+ quartos.get(i).get(j) +", ");
						break;
					case 5:
						System.out.print("Quantidade de Pessoas: "+ quartos.get(i).get(j) +", ");
						break;
				}
			}
			System.out.println();
		}			
	}
	static void editCliente(int a, int b) {
		Scanner teclado = new Scanner(System.in);
		switch(b) {
			case 1:
				System.out.print("Insira o novo nome:");
				String nome = teclado.nextLine();
				clientes.get(a-1).set((b-1), nome);
				break;
			case 2:
				System.out.print("Insira a nova data de nascimento:");
				String data = teclado.nextLine();
				clientes.get(a-1).set((b-1), data);
				break;
			case 3:
				System.out.print("Insira o novo e-mail:");
				String email = teclado.nextLine();
				clientes.get(a-1).set((b-1), email);
				break;
			case 4:
				System.out.print("Insira o novo telefone:");
				String telefone = teclado.nextLine();
				clientes.get(a-1).set((b-1), telefone);
				break;
			case 5:
				System.out.print("Insira a nova cidade:");
				String cidade = teclado.nextLine();
				clientes.get(a-1).set((b-1), cidade);
				break;
			case 6:
				System.out.print("Insira o novo UF:");
				String uf = teclado.nextLine();
				clientes.get(a-1).set((b-1), uf);
				break;
			case 7:
				System.out.print("Fumante?");
				String fumante = teclado.nextLine();
				clientes.get(a-1).set((b-1), fumante);
				break;
		}
		System.out.println("==================================================");
		System.out.println("=                 Cliente editado                =");
		System.out.println("==================================================");
	}
	static void editQuartos(int a, int b) {
		Scanner teclado = new Scanner(System.in);
		switch(b) {
			case 1:
				System.out.print("Insira o novo nome:");
				String nome = teclado.nextLine();
				quartos.get(a-1).set((b-1), nome);
				break;
			case 2:
				System.out.print("Insira a nova posição:");
				String pos = teclado.nextLine();
				quartos.get(a-1).set((b-1), pos);
				break;
			case 3:
				System.out.print("Fumante?");
				String fumante = teclado.nextLine();
				quartos.get(a-1).set((b-1), fumante);
				break;
			case 4:
				System.out.print("Insira o novo valor:");
				String valor = teclado.nextLine();
				quartos.get(a-1).set((b-1), valor);
				break;
			case 5:
				System.out.print("Insira a nova quantidade de quartos:");
				String qntquartos = teclado.nextLine();
				quartos.get(a-1).set((b-1), qntquartos);
				break;
			case 6:
				System.out.print("Insira a nova quantidade de pessoas:");
				String qntpessoas = teclado.nextLine();
				quartos.get(a-1).set((b-1), qntpessoas);
				break;
		}
		System.out.println("==================================================");
		System.out.println("=                 Quarto Editado                 =");
		System.out.println("==================================================");
	}
	static void listAvailable(){
		System.out.println("==================================================");
		System.out.println("=        Quartos disponíveis para locação        =");
		System.out.println("==================================================");
		for (int i = 0; i < quartos.size(); i++) {
			if (quartos.get(i).get(6) == "0") {
				System.out.print("Quarto: "+(i+1)+" - Nome: "+ quartos.get(i).get(0)+".");
			}
			System.out.println();
		}		
		System.out.println("--------------------------------------------------------");
	}
	static void listUnavailable(){
		System.out.println("==================================================");
		System.out.println("=      Quartos indisponíveis para locação        =");
		System.out.println("==================================================");
		for (int i = 0; i < quartos.size(); i++) {
			if (quartos.get(i).get(6) == "1") {
				System.out.print("Quarto: "+(i+1)+" - Nome: "+ quartos.get(i).get(0)+".");
			}
			System.out.println();
		}		
	}
	public static void main(String[] args) {
		int online = 1;
		Scanner teclado = new Scanner(System.in);
		while (online == 1) {
			System.out.println("Informe a função desejada: ");
			System.out.println("1 - Configurar clientes");
			System.out.println("2 - Configurar quartos");
			System.out.println("3 - Verificar quartos disponíveis");
			System.out.println("4 - Check-in/Check-out");
			System.out.println("5 - Encerrar programa");
			String opt = teclado.nextLine();
			if (opt.equals("1")) {
				System.out.println("Informe a função desejada: ");
				System.out.println("1 - Cadastrar Cliente");
				System.out.println("2 - Listar Clientes");
				System.out.println("3 - Editar Clientes");
				System.out.println("4 - Excluir Clientes");
				String func = teclado.nextLine();
				if (func.equals("2")) {
					listCliente();	
				}else if (func.equals("1")) {
					  System.out.println("Informe o nome:");
					  String nome = teclado.nextLine();
					  System.out.println("Informe a data de nascimento:");
					  String data = teclado.nextLine();
					  System.out.println("Informe o e-mail:");
					  String email = teclado.nextLine();
					  System.out.println("Informe o telefone:");
					  String telefone = teclado.nextLine();
					  System.out.println("Informe a cidade:");
					  String cidade = teclado.nextLine();
					  System.out.println("Informe o UF:");
					  String uf = teclado.nextLine();
					  System.out.println("Informe se fuma:");
					  String fuma = teclado.nextLine();
					  cadCliente(nome, data, email, telefone, cidade, uf, fuma);
				}else if (func.equals("3")) {
					System.out.println("Qual cliente você deseja editar?");
					listCliente();
					int a = teclado.nextInt();
					System.out.println("Qual informação você quer editar?");
					System.out.println("1 - Nome");
					System.out.println("2 - Data");
					System.out.println("3 - E-mail");
					System.out.println("4 - Telefone");
					System.out.println("5 - Cidade");
					System.out.println("6 - UF");
					System.out.println("7 - Fumante");
					int b = teclado.nextInt();
					editCliente(a, b);
				}else if (func.equals("4")) {
					System.out.println("Qual cliente você deseja excluir?");
					listCliente();
					int a = teclado.nextInt();
					clientes.remove(a-1);
				}else {
					System.out.println("Digite um número válido.");
				}
			}else if (opt.equals("2")){
				System.out.println("Informe a função desejada: ");
				System.out.println("1 - Cadastrar Quartos");
				System.out.println("2 - Listar Quartos");
				System.out.println("3 - Editar Quartos");
				System.out.println("4 - Excluir Quartos");
				String func = teclado.nextLine();
				if (func.equals("2")) {
					listQuartos();	
				}else if (func.equals("1")) {
					  teclado.nextLine();
					  System.out.println("Informe o nome:");
					  String nome = teclado.nextLine();
					  System.out.println("Informe a posição:");
					  String pos = teclado.nextLine();
					  System.out.println("Fumante?");
					  String fumante = teclado.nextLine();
					  System.out.println("Informe o valor:");
					  String valor = teclado.nextLine();
					  System.out.println("Informe a quantidade de quartos:");
					  String qntquartos = teclado.nextLine();
					  System.out.println("Informe a quantidade de pessoas:");
					  String qntpessoas = teclado.nextLine();
					  cadQuartos(nome, pos, fumante, valor, qntquartos, qntpessoas);
				}else if (func.equals("3")) {
					System.out.println("Qual quarto você deseja editar?");
					listQuartos();
					int a = teclado.nextInt();
					System.out.println("Qual informação você quer editar?");
					System.out.println("1 - Nome");
					System.out.println("2 - Posição");
					System.out.println("3 - Fumante");
					System.out.println("4 - Valor");
					System.out.println("5 - Quantidade de Quartos");
					System.out.println("6 - Quantidade de Pessoas");
					int b = teclado.nextInt();
					editQuartos(a, b);
				}else if (func.equals("4")) {
					System.out.println("Qual quarto você deseja excluir?");
					listQuartos();
					int a = teclado.nextInt();
					quartos.remove(a-1);
				}else {
					System.out.println("Digite um número válido.");
				}
			}else if (opt.equals("3")){
				listAvailable();
			}else if (opt.equals("4")){
				System.out.println("Informe a função desejada: ");
				System.out.println("1 - Check-in");
				System.out.println("2 - Check-out");
				String func = teclado.nextLine();
				if (func.equals("1")) {
					System.out.println("Qual quarto será ocupado?");
					listAvailable();
					int a = teclado.nextInt();
					quartos.get(a-1).set(6, "1");
					System.out.println("Qual cliente estará ocupando o quarto?");
					listCliente();
					String b = teclado.next();
					quartos.get(a-1).set(7, b);
					System.out.println("------------------------------------------");
					System.out.println("             Check-in realizado           ");
				}else if (func.equals("2")){
					System.out.println("Qual quarto será desocupado?");
					listUnavailable();
					int a = teclado.nextInt();
					quartos.get(a-1).set(6, "0");
					quartos.get(a-1).remove(7);
					System.out.println("------------------------------------------");
					System.out.println("             Check-out realizado           ");
				}else {
					System.out.println("Digite um número válido.");
				}
			}else if (opt.equals("5")){
				online = 0;
			}else {
				System.out.println("Digite um número válido.");
			}
		}
	}
}
