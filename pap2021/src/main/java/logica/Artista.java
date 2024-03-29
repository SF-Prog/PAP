package logica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
@DiscriminatorValue("Artista")
public class Artista extends Usuario{
	private String descGeneral;
	private String biografia;
	private String link;
	
	/*@OneToMany(cascade = CascadeType.ALL)
	private List<Espectaculo> espectaculos = new ArrayList<>();*/
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Funcion> funciones = new ArrayList<>();
	
	public Artista() {
		super();
	}

	public Artista(String nickName, String nombre, String apellido, String email, Date fechaNac, String password, String image, String descGeneral, String biografia, String link) {
		super(nickName, nombre, apellido, email, fechaNac, password, image);
		this.setDescGeneral(descGeneral);
		this.setBiografia(biografia);
		this.setLink(link);
	}

	public String getDescGeneral() {
		return descGeneral;
	}

	public void setDescGeneral(String descGeneral) {
		this.descGeneral = descGeneral;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public List<Funcion> getFunciones() {
		return funciones;
	}

	public void setFunciones(List<Funcion> funciones) {
		this.funciones = funciones;
	}
	
	public void agregarFuncion(Funcion funcion){
		this.funciones.add(funcion);
	}	
	
	/*public List<Espectaculo> getEspectaculos() {
		return espectaculos;
	}

	public void setEspectaculos(List<Espectaculo> espectaculos) {
		this.espectaculos = espectaculos;
	}*/
}
