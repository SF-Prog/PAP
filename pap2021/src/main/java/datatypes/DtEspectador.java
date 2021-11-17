package datatypes;

import java.util.Date;

public class DtEspectador extends DtUsuario  {
	public DtEspectador(String nickName, String nombre, String apellido, String email, Date fecha, String password, String image) {
		super(nickName, nombre, apellido, email, fecha, password, image);
	}
}
