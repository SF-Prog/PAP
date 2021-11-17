package datatypes;

import java.util.Date;

public class DtArtista extends DtUsuario {
	private String descGeneral;
	private String biografia;
	private String link;
	
	public DtArtista(String nickName, String nombre, String apellido, String email, Date fecha, String password, String image, String descGeneral, String biografia,String link ){
		super(nickName, nombre, apellido, email, fecha, password, image);
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

	@Override
	public String toString() {
		String retorno =  "\nNickname: " + this.getNickName() + "\nNombre: " +  this.getNombre() + "\nApellido: " + this.getApellido() + "\nEmail: " + this.getEmail() + "\nEspectadores Maximo: " + this.getFechaNac().toString()+ "\n Descripcion General: " + this.getDescGeneral() + "\nBiografia: " + this.getBiografia() + "\nLink: " + this.getLink();
		return retorno;
	}
}
