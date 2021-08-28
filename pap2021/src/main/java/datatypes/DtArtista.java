package datatypes;



public class DtArtista extends DtUsuario {
	
	private String descGeneral;
	private String biografia;
	private String link;

	
	
	
	public DtArtista() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DtArtista(String nickName, String nombre, String apellido, String email, String fechaNac,String descGeneral, String biografia, String link ) {
		super(nickName, nombre, apellido, email, fechaNac);
		this.descGeneral = descGeneral;
		this.biografia = biografia;
		this.link = link;

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


	
}
