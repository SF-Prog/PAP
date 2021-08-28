package presentacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import datatypes.DtUsuario;
import interfaces.Fabrica;
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
		Fabrica f = Fabrica.getInstancia();
    	IControladorAltaDeUsuario icadu = f.getIControladorAltaDeUsuario();
		Scanner entrada = new Scanner(System.in);
		boolean cierroCU= false;
		boolean existe= false;
		boolean salir = false;
		
		String nickname = null;
		while(!existe && !salir){
			System.out.println("Nickname: ");
			nickname=entrada.nextLine(); 
			if(!icadu.buscarNickname(nickname)){
				existe = true;
				salir = true;

			}else{
				boolean intento = false;
				while(!intento){
					System.out.println("El nickname ya existe desa ingresar otro si o no: \n");
					String respuesta = null;
					respuesta=entrada.nextLine();
					if(respuesta.equals("no")){
						salir = true;
						intento= true;
						cierroCU= true;
					}else if(!respuesta.equals("si")){
						System.out.println("opcion incorrecta");
					}else{
						intento= true;
					}
				}
			}
		}
		
		String email = null;
		if(!cierroCU){
			existe= false;
			salir = false;
			while(!existe && !salir){
				System.out.println("Email: ");
				email=entrada.nextLine(); 
				if(!icadu.buscarEmail(email)){
					existe = true;
					salir = true;
				}else{
					boolean intento = false;
					while(!intento){
						System.out.println("El email ya existe desa ingresar otro si o no: \n");
						String respuesta = null;
						respuesta=entrada.nextLine();
						if(respuesta.equals("no")){
							salir = true;
							intento= true;
							cierroCU= true;
						}else if(!respuesta.equals("si")){
							System.out.println("opcion incorrecta");
						}else{
							intento= true;
						}
					}
				}
			}
		}
		
		
		if(!cierroCU) {
			
			System.out.println("Nombre: ");
			String nombre = null;
			nombre=entrada.nextLine();
			
			System.out.println("Apellido: ");
			String apellido = null;
			apellido=entrada.nextLine();
		
			
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
			
					dtUsuario = new DtUsuario(nickname,nombre,apellido,email,fecha);
					salida = false;
				}else{
					System.out.print("Opcion Incorrecta");
				}
				
			}
			salida = true;
			while(salida){
				System.out.flush();
				System.out.print("Deseas Confirmar el alta de usuario? (si)/(no) \nOPCION:  ");
				String respuesta = null;
				respuesta=entrada.nextLine();
				
				if(respuesta.equals("si")){
			    	
			    	if(tipo == 1){
			    		icadu.ingresaUsuarioArtista(dtUsuario,descGeneral,biografia,link);
			    	}else{
			    		icadu.ingresaUsuarioEspectador(dtUsuario);
			    	}
			    	
					salida = false;
				}else if(respuesta.equals("no")){
					
					salida = false;
				}else {
					System.out.print("Opcion Incorrecta");
				}
				
			}
		}//CIERRO EL CASO DE USO
		entrada.close();	
	}// FIN DE ALTA USUARIO
	
	static void	AltaDeEspetaculo(){}
	static void	ConsultaDeEspetaculo(){}
	static void	AltadeFuncionDeEspetaculo(){}
	static void	ConsultaDeFuncionDeEspetaculo(){}
	static void	AltaDePlataforma(){}
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
