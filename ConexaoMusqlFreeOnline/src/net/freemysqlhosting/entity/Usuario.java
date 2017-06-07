package net.freemysqlhosting.entity;

public class Usuario {

	private Integer id;
	private String nome;
	private Integer idCargo;
	private Integer idSub;

	public Usuario(String nome, Integer cargo) {
		this.nome = nome;
		this.idCargo = idCargo;
	}

	public Usuario(String nome, Integer idCargo, Integer idSub) {
		this.nome = nome;
		this.idCargo = idCargo;
		this.idSub = idSub;
	}

	public Usuario(Integer id, String nome, Integer cargo, Integer idCargo, Integer idSub) {
		this.id = id;
		this.nome = nome;
		this.idCargo = idCargo;
		this.idSub = idSub;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(Integer idCargo) {
		this.idCargo = idCargo;
	}

	public Integer getIdSub() {
		return idSub;
	}

	public void setIdSub(Integer idSub) {
		this.idSub = idSub;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return this.nome;
	}
}
