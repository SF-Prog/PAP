package logica;

import java.io.Serializable;
import java.util.Objects;




//NO ES UNA ENTIDAD, DEBE IMPLEMENTAR SERIALIZABLE
public class IdEspectadorPaquete implements Serializable{
	
	private static final long serialVersionUID = 1L;


	private String espectador;
	private String paquetes;
	
	public IdEspectadorPaquete() {
		super();
	}
	public String getEspectador() {
		return espectador;
	}
	public void setEspectador(String espectador) {
		this.espectador = espectador;
	}
	public String getPaquetes() {
		return paquetes;
	}
	public void setPaquetes(String paquetes) {
		this.paquetes = paquetes;
	}
	@Override
	public int hashCode() {
		return Objects.hash(espectador, paquetes);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IdEspectadorPaquete other = (IdEspectadorPaquete) obj;
		return Objects.equals(espectador, other.espectador) && Objects.equals(paquetes, other.paquetes);
	}
	
	
	
	
	
	
}