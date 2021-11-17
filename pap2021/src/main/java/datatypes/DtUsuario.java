package datatypes;

import java.util.Date;

public class DtUsuario {
	protected String nickName;
	protected String nombre;
	protected String apellido;
	protected String email;
	protected Date fechaNac;
	protected String password;
	protected String image;

	public DtUsuario(String nickName, String nombre, String apellido, String email, Date fecha, String password, String image) {
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
}
