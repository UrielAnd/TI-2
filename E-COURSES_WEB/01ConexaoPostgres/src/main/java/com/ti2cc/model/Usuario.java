package com.ti2cc.model;

public class Usuario {
	private int codigo;
	private String email;
	private String senha;
	private char sexo;
	
	public Usuario() {
		this.codigo = -1;
		this.email = "";
		this.senha = "";
		this.sexo = '*';
	}
	
	public Usuario(int codigo, String email, String senha, char sexo) {
		this.codigo = codigo;
		this.email = email;
		this.senha = senha;
		this.sexo = sexo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Usuario [codigo=" + codigo + ", email=" + email + ", senha=" + senha + ", sexo=" + sexo + "]";
	}
}

