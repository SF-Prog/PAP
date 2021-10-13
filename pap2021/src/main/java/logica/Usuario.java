package logica;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import datatypes.DtUsuario;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Usuario {
	@Id
	private String nickName;
	private String nombre;
	private String apellido;
	private String email;
	private Date fechaNac;
	private String password;
	private String image;

	@JoinColumn(nullable = false)
	@ManyToMany
	private List<Usuario> seguidores = new ArrayList<>();

	@ManyToMany(mappedBy = "seguidores")
	private List<Usuario> seguidos = new ArrayList<>();
	
	public Usuario() {
		super();
	}

	public Usuario(String nickName, String nombre, String apellido, String email, Date fecha, String password, String image) {
		super();
		this.setNickName(nickName);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEmail(email);
		this.setFechaNac(fecha);
		this.setPassword(password);
		this.setImage(image);
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public DtUsuario getDtUsuario() {
		DtUsuario res = new DtUsuario(this.getNickName(), this.getNombre(), this.getApellido(), this.getEmail(), this.getFechaNac(), this.getPassword(), this.getImage());
		return res;
	}
	
	public List<Usuario> getUsuariosSeguidos() {
		return seguidos;
	}
	
	public void setUsuariosSeguidos(List<Usuario> usuarios) {
		this.seguidos = usuarios;
	}

	public void seguir(Usuario usuario) throws IOException {
		if (!seguidores.add(usuario)) {
			throw new IOException("Ya se encuentra siguiendo a " + usuario.getNickName());
		}
	}

	public void dejarDeSeguir(Usuario usuario) throws IOException {
		if (!seguidores.remove(usuario)) {
			throw new IOException("No sigue a " + usuario.getNickName() + ", imposible dejar de seguir");
		}
	}	
}
