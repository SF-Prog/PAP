package logica;

import java.util.Date;

import datatypes.DtUsuario;

public class Usuario {
	private String nickName;
	private String nombre;
	private String apellido;
	private String email;
	private Date fechaNac;
	
	public Usuario() {
		super();
	}

	public Usuario(String nickName, String nombre, String apellido, String email, Date fechaNac2) {
		super();
		this.nickName = nickName;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.fechaNac = fechaNac2;
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
	
	public DtUsuario getDtUsuario()
	{
		DtUsuario res = new DtUsuario(this.getNickName(), this.getNombre(), this.getApellido(), this.getEmail(), this.getFechaNac());
		return res;
	}	
}
