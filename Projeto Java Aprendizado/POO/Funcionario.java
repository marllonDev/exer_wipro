package POO;

public class Funcionario {

	private int id;
	private int idade;
	private String nome;
	private String cargo;
	private double salario;
	private String sobrenome;
	
	private Cargo cargo2;

	public Funcionario() {
		// Código do construtor
	}
	
	
	public Funcionario(int id, int idade, String nome, String cargo, double salario, String sobrenome, Cargo cargo2) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
		this.sobrenome = sobrenome;
		this.cargo2 = cargo2;
	}


	// O método getter(pegar) retorna o valor do atributo.
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	

	public Cargo getCargo2() {
		return cargo2;
	}


	public void setCargo2(Cargo cargo2) {
		this.cargo2 = cargo2;
	}


	public double salarioComBonus(Cargo cargo2) {
		return cargo2.getRegra().calcula(this);
		
	}
	
	public void imprimirNomeCliente() {
		// Código do método

		System.out.println(this.getNome() + " " + this.getSobrenome());

	}

}
