package datatypes;

import java.util.Date;

public class DtEspectador extends DtUsuario  {
	public DtEspectador() {
		super();
	}

	public DtEspectador(String nickName, String nombre, String apellido, String email, Date fecha) {
		super(nickName, nombre, apellido, email, fecha);
	}
}
