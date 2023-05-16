package br.com.arq.entity;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class Users implements Serializable {

	private static final long serialVersionUID = 4919937187176204853L;
	@Id
	private String id;
	private String nome;
	@Indexed(unique = true)
	private String email;
	private String senha;
	private String status;

	public Users() {

	}

	public Users(String id, String nome, String email, String senha, 
                 String status) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", nome=" + nome + ", email=" 
            + email + ", senha=" + senha + ", status=" + status + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}