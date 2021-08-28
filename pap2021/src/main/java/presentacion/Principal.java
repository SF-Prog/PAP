package presentacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import datatypes.DtArtista;
import datatypes.DtEspectador;
import datatypes.DtPlataforma;
import datatypes.DtUsuario;
import interfaces.Fabrica;
import interfaces.IControladorAltaDePlataforma;
import interfaces.IControladorAltaDeUsuario;

public class Principal {

	static void menu() {
		System.out.println("\n"
				/* REQUERIMIENTOS MINIMOS*/
				+ "1.  Alta de Usuario \n"
				+ "2. Alta de Espetaculo\n"
				+ "3. Consulta de Espetaculo\n"
				+ "4. Alta de Funci�n de Espetaculo \n"
				+ "5. Consulta de funci�n de Espetaculo\n"
				+ "6. Alta de Plataforma\n"
				/* REQUERIMIENTOS NO MINIMOS*/
				+ "7. Consulta de Usuario\n"
				+ "8. Modificar Datos de Usuario\n"
				+ "9. Crear Paquete de Espetaculos\n"
				+ "10. Agregar Espetaculo a Paquete de\r\n"
				+ "Espetaculos\n"
				+ "11. Consulta de Paquete de Espetaculos\n"
				+ "12. Registro a funci�n de Espetaculo\n"
				/* OPCIONES DE FUNCIONAMIENTO*/
				+ "13. Salir\n"
				+ "14. OPCI�N: ");	
		
	}
	
	
	 public static Date ParseFecha(String fecha){
      // FUNCION AUXILIAR PARA CONVERTIR STRING FECHA A DATE FECHA
		 SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
    }
	
	static void	AltaDeUsuario() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nickname: ");
		String nickname = null;
		nickname=entrada.nextLine(); 
		
		System.out.println("Nombre: ");
		String nombre = null;
		nombre=entrada.nextLine();
		
		System.out.println("Apellido: ");
		String apellido = null;
		apellido=entrada.nextLine();
		
		System.out.println("email: ");
		String email = null;
		email=entrada.nextLine();
		
		System.out.println("fechaNac (dd/MM/yyyy): ");
		String fechaNac = null;
		fechaNac=entrada.nextLine();
		
		Date fecha = ParseFecha(fechaNac);
		
		boolean salida = true;
		DtUsuario dtUsuario=null;
		// VARTIABLE PARA DETERMINAR EL TIPO DE USUARIO
		int tipo = 0;
		
		String descGeneral = null;
		String biografia = null;
		String link = null;
		
		while(salida){
			System.out.print("Tipo de Usuario:\n (1)Artista \n(2) Especatdor\nOPCION: ");
			tipo = 0;
			tipo=entrada.nextInt();
			
			if(tipo == 1){
				System.out.println("Descripcion General: ");
				descGeneral=entrada.nextLine();
				
				System.out.println("Biografia: ");
				biografia=entrada.nextLine();
				
				System.out.println("Link: ");
				link=entrada.nextLine();
				
				dtUsuario = new DtUsuario(nickname,nombre,apellido,email,fecha);
				
				//dtUsuario = new DtArtista(nickname,nombre,apellido,email,fecha,descGeneral,biografia,link);
				//dtUsuario = new DtUsuario
				salida = false;
			}else if(tipo == 2){
		
				dtUsuario = new DtEspectador(nickname,nombre,apellido,email,fecha);
				salida = false;
			}else{
				System.out.print("Opcion Incorrecta");
			}
			
		}
		salida = true;
		while(salida){
			System.out.print("Deseas Confirmar el alta de usuario? (si)/(no) \nOPCION:  ");
			String respuesta = null;
			respuesta=entrada.nextLine();
			
			if(respuesta=="si"){
		    	Fabrica f = Fabrica.getInstancia();
		    	IControladorAltaDeUsuario icadu = f.getIControladorAltaDeUsuario();
		    	if(tipo == 1){
		    		icadu.ingresaUsuarioArtista(dtUsuario,descGeneral,biografia,link);
		    	}else{
		    		icadu.ingresaUsuarioEspectador(dtUsuario);
		    	}
		    	
				salida = false;
			}else if(respuesta=="no"){
				
				salida = false;
			}else {
				System.out.print("Opcion Incorrecta");
			}
		}
		
		entrada.close();	
	}// FIN DE ALTA USUARIO
	
	static void	AltaDeEspectaculo() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Plataforma: ");
		String plataforma = null;
		plataforma=entrada.nextLine();

		System.out.println("Artista: ");
		String artista = null;
		artista=entrada.nextLine();

		System.out.println("Nombre: ");
		String nombre = null;
		nombre=entrada.nextLine();

		System.out.println("Descripcion: ");
		String descripcion = null;
		descripcion=entrada.nextLine();

		System.out.println("Duracion: ");
		int duracion = null;
		duracion=entrada.nextLine();

		System.out.println("Espectadores minimos: ");
		int especMinimos = null;
		especMinimos=entrada.nextLine();

		System.out.println("Espectadores maximos: ");
		int especMaximos = null;
		especMaximos=entrada.nextLine();

		System.out.println("URL asociada: ");
		string url = null;
		url=entrada.nextLine();

		System.out.println("Costo: ");
		float costo = null;
		costo=Float.parseFloat(entrada.nextLine());

		System.out.println("Fecha de alta (dd/MM/yyyy): ");
		string fechaAlta = null;
		fechaAlta=entrada.nextLine();

		Date fecha = ParseFecha(fechaAlta);
	}// FIN DE ALTA ESPECTACULO
	
	static void	ConsultaDeEspetaculo(){}
	static void	AltadeFuncionDeEspetaculo(){}
	static void	ConsultaDeFuncionDeEspetaculo(){}
	static void	AltaDePlataforma(){
		Scanner entrada = new Scanner(System.in);
		boolean nombreDePlataformaValido = false;
		Fabrica f = Fabrica.getInstancia();
		IControladorAltaDePlataforma icap = f.getIControladorAltaDePlataforma();
		String nombre = null;
		String descripcion = null;
		String URL = null;
		String deseaCancelar = null;
		
		do {
			System.out.println("Nombre: ");
			nombre = entrada.nextLine();
			
			System.out.println("Descripcion: ");
			descripcion = entrada.nextLine();
			
			System.out.println("URL: ");
			URL = entrada.nextLine();

			nombreDePlataformaValido = icap.existePlataforma(nombre);

			if(!nombreDePlataformaValido) {
				System.out.println("El nombre de plataforma ya existe\n\n");
				System.out.println("Desea Cancelar esta operacion? (s/n)");
				deseaCancelar = entrada.nextLine();
				if(deseaCancelar.equals("s")) {
					nombreDePlataformaValido = true;
				};
			};
		} while(!nombreDePlataformaValido);

		if(deseaCancelar.equals("n") || deseaCancelar.equals(null)) {
			DtPlataforma dtPlataforma = new DtPlataforma(nombre, descripcion, URL);
			icap.ingresaPlataforma(dtPlataforma);
		};

		entrada.close();
	};
	/* REQUERIMIENTOS NO MINIMOS*/
	static void	ConsultaDeUsuario(){}
	static void	 ModificarDatosDeUsuario(){}
	static void	CrearPaqueteDeEspetaculos(){}
	static void	AgregarEspetaculoAPaqueteDeEspetaculos(){}
	static void ConsultaDePaqueteDeEspetaculos(){}
	static void RegistroAfuncionDeEspetaculo(){}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		menu();
		int opcion = Integer.parseInt(entrada.nextLine());
		while(opcion!=13) {
			switch (opcion) {
			/* REQUERIMIENTOS MINIMOS*/
		  		case 1:
		  			AltaDeUsuario();
		  			break;
		  		case 2:
		  			AltaDeEspetaculo();
		  			break;
		  		case 3:
		  			ConsultaDeEspetaculo();
		  			break;
		  		case 4:
		  			AltadeFuncionDeEspetaculo();
		  			break;
		  		case 5:
		  			ConsultaDeFuncionDeEspetaculo();
		  			break;
		  		case 6:
		  			AltaDePlataforma();
		  			break;
		  		/* REQUERIMIENTOS NO MINIMOS*/
		  		case 7:
		  			ConsultaDeUsuario();
		  			break;
		  		case 8:
		  			 ModificarDatosDeUsuario();
		  			break;
		  		case 9:
		  			CrearPaqueteDeEspetaculos();
		  			break;
		  		case 10:
		  			AgregarEspetaculoAPaqueteDeEspetaculos();
		  			break;
		  		case 11:
		  			ConsultaDePaqueteDeEspetaculos();
		  			break;
		  		case 12:
		  			RegistroAfuncionDeEspetaculo();
		  			break;
			}
			menu();
			if(entrada.hasNextLine()) {
				opcion = Integer.parseInt(entrada.nextLine());
			}
		}
		entrada.close();
	}
	
	
}
