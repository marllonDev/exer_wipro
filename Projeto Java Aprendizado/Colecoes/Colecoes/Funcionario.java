package Colecoes.Colecoes;

import java.util.Objects;

public class Funcionario {

	private int id;
	private int idade;
	public String nome;
	private String cargo;
	private double salario;
	private String sobrenome;

	public Funcionario(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Funcionario(int id, int idade, String nome, String cargo, double salario, String sobrenome) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
		this.sobrenome = sobrenome;
	}


	public String getNome() {
		return nome;
	}

//	jonathan.setNome("Jonathan")
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

	public void imprimirNomeCliente() {
		// C�digo do m�todo

		System.out.println(this.getNome() + " " + this.getSobrenome());

	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", sobrenome=" + sobrenome + "]";
	}

}
