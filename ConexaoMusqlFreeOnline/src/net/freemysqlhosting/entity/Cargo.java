package net.freemysqlhosting.entity;

public class Cargo {

	private Integer id;
	private String cargo;

	public Cargo(String cargo) {
		this.cargo = cargo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
