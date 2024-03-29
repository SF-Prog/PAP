package interfaces;

import java.util.Date;

public interface IControladorCrearPaqueteDeEspectaculos {
	public void solicitarDatos(String nombre, String descripcion, Date fechainicio,  Date fechaFin, int descuento);
	public boolean exiteEspectaculo(String nombre);
	public void ingresaEspectaculo(String nombre, String descripcion, Date fechainicio,  Date fechaFin, int descuento,Date fechaAlta);
	public void ModificarEspectaculo(String nombre, String descripcion,Date fechainicio,  Date fechaFin, int descuento,Date fechaAlta);
}
