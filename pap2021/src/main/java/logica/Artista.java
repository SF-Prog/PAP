package logica;

public class Artista {
	private String descGeneral;
	private String biografia;
	private String link;
	
	public Artista() {
		super();
	}

	public Artista(String descGeneral, String biografia, String link) {
		super();
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
