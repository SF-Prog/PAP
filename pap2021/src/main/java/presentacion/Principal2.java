package presentacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import datatypes.DtUsuario;
import datatypes.DtArtista;
import datatypes.DtEspectaculo;
import datatypes.DtFuncion;
import datatypes.DtPaquete;
import datatypes.DtPlataforma;
import interfaces.Fabrica;
import interfaces.IControladorAltaDeEspectaculo;
import interfaces.IControladorAltaDeFuncionDeEspectaculo;
import interfaces.IControladorAltaDeUsuario;
import interfaces.IControladorConsultaDeEspectaculo;
import interfaces.IControladorConsultaDeFuncionDeEspectaculo;
import interfaces.IControladorAltaDePlataforma;

public class Principal2 {

	static void menu() {
		System.out.println("\n"
				/* REQUERIMIENTOS MINIMOS*/
				+ "1.  Alta de Usuario \n"
				+ "2. Alta de Espetaculo\n"
				+ "3. Consulta de Espetaculo\n"
				+ "4. Alta de Función de Espetaculo \n"
				+ "5. Consulta de función de Espetaculo\n"
				+ "6. Alta de Plataforma\n"
				/* REQUERIMIENTOS NO MINIMOS*/
				+ "7. Consulta de Usuario\n"
				+ "8. Modificar Datos de Usuario\n"
				+ "9. Crear Paquete de Espetaculos\n"
				+ "10. Agregar Espetaculo a Paquete de\r\n"
				+ "Espetaculos\n"
				+ "11. Consulta de Paquete de Espetaculos\n"
				+ "12. Registro a función de Espetaculo\n"
				/* OPCIONES DE FUNCIONAMIENTO*/
				+ "13. Salir\n"
				+ "14. OPCION: ");		
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

 public static Date ParseHora(String hora){
      // FUNCION AUXILIAR PARA CONVERTIR STRING FECHA A DATE FECHA
		 SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
        Date horaDate = null;
        try {
            horaDate = formato.parse(hora);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return horaDate;
  }	
 
 public static Date Parsehora(String hora){
     // FUNCION AUXILIAR PARA CONVERTIR STRING FECHA A DATE FECHA
		 SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
       Date fechaHora = null;
       try {
    	   fechaHora = formato.parse(hora);
       } 
       catch (ParseException ex) 
       {
           System.out.println(ex);
       }
       return fechaHora;
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
			if(!icadu.buscarUsuarioPorNickname(nickname)){
				// SI NO EXISTE BUSCARNICKNAME() RETORNA NULL
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
				if(!icadu.buscarUsuarioPorEmail(email)){
					// SI NO EXISTE BUSCAREMAIL() RETORNA NULL
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
		
		
		if(!cierroCU) 
		{			
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
	
	static void	ConsultaDeEspetaculo(){
		Fabrica f = Fabrica.getInstancia();
		IControladorConsultaDeEspectaculo iccde = f.getIControladorConsultaDeEspectaculo();
		boolean salir = false;
		while(!salir){
			// LISTO LAS PLATAFORMAS ///
			ArrayList<DtPlataforma> dtPlataformas = iccde.listarPlataformas();
			for(DtPlataforma dtp: dtPlataformas) {
				System.out.print("- "+dtp.getNombre()+"\n");		
			}
			// FIN DE LISTADO LAS PLATAFORMAS ///
			
			// SELECCIONO LA PLATAFORMA ///
			System.out.print("Seleccione una plataforma por su nombre:\n");
			Scanner entradaPla = new Scanner(System.in);
			String plataforma = null;
			plataforma=entradaPla.nextLine(); 
			entradaPla.close();
			
			DtPlataforma plataformaSeleccionada = iccde.seleccionaPlataforma(plataforma);

			// FIN SELECCIONO LA PLATAFORMA ///
			
			
			
			// LISTO LAS ESPECTACULOS ///
			ArrayList<DtEspectaculo> dtEspectaculos = iccde.listarEspectaculos();
			for(DtEspectaculo dte: dtEspectaculos) {
				System.out.print("- "+dte.getNombre()+"\n");		
			}
			// FIN DE LISTADO LAS ESPECTACULOS ///
			
			// SELECCIONO LA ESPECTACULO ///
			System.out.print("Seleccione una especatulo por su nombre:\n");
			Scanner entradaEsp = new Scanner(System.in);
			String especatculo = null;
			especatculo=entradaEsp.nextLine(); 
			entradaEsp.close();
			
			DtEspectaculo especatculoSeleccionada =  iccde.seleccionaEspectaculo(especatculo);
			
			// FIN SELECCIONO LA ESPECTACULO ///
			//DETALLE DE ESPETACULO//
			System.out.print("Espectaculo Seleccionado:\n"+especatculoSeleccionada);
			// FIN DETALLE DE ESPETACULO//
			
			// LISTO LAS FUNCIONES ///
			System.out.print("\nFUNCIONES ASOCIADAS AL ESPECTACULO SELECCIONADO: \n");
			ArrayList<DtFuncion> dtFunciones = iccde.listarFunciones();
			for(DtFuncion dtf: dtFunciones) {
				System.out.print("- "+dtf.getNombre()+"\n");		
			}
			// FIN DE LISTADO LAS FUNCIONES ///


			
			
			boolean repiteFuncion = false;
			while(!repiteFuncion) {
				
				System.out.print("\n QUIERE DETALLAR ALGUNA FUNCION?: (si)/(no) \n");
				Scanner entradaRepetir = new Scanner(System.in);
				String rRepetir = null;
				rRepetir=entradaEsp.nextLine(); 
				entradaRepetir.close();
				
				if(rRepetir.equals("si")){
					System.out.print("\n INGRESE NOMBRE FUNCION: \n");
					Scanner entradaFuncion = new Scanner(System.in);
					String funcion = null;
					funcion=entradaFuncion.nextLine(); 
					entradaFuncion.close();
					
					DtFuncion funcionSeleccionada = iccde.seleccionaFuncion(funcion);
				}else if(rRepetir.equals("no")){
					repiteFuncion = true;
				}else{
					System.out.print("\n OPCION INCORRECTA \n");
				}
				
			}
			
			
			// LISTO LAS PAQUETE ///
			System.out.print("\nPAQUETES ASOCIADAS AL ESPECTACULO SELECCIONADO: \n");
			ArrayList<DtPaquete> dtPaquetes = iccde.listarPaquetes();
			for(DtPaquete dtp: dtPaquetes) {
				System.out.print("- "+dtp.getNombre()+"\n");		
			}
			// FIN DE LISTADO LAS PAQUETE ///
			boolean repitePaquete = false;
			while(!repitePaquete) {
				
				System.out.print("\n QUIERE DETALLAR ALGUNA FUNCION?: (si)/(no) \n");
				Scanner entradaRepetir = new Scanner(System.in);
				String rRepetir = null;
				rRepetir=entradaEsp.nextLine(); 
				entradaRepetir.close();
				
				if(rRepetir.equals("si")){
					
					System.out.print("\n INGRESE NOMBRE PAQUETE: \n");
					Scanner entradaPaquete = new Scanner(System.in);
					String paquete = null;
					paquete=entradaPaquete.nextLine(); 
					entradaPaquete.close();
					

					 DtPaquete paqueteSeleccionado =  iccde.seleccionaPaquete(paquete);
					
					
				}else if(rRepetir.equals("no")){
					repitePaquete = true;
				}else{
					System.out.print("\n OPCION INCORRECTA \n");
				}
				
			}
			
			
			
			salir = true;// SALGO DE LA REITERACION
		}
		
	}
	static void	ConsultaDeFuncionDeEspetaculo(){
		Fabrica f = Fabrica.getInstancia();
		IControladorConsultaDeFuncionDeEspectaculo iccdfe = f.getIControladorConsultaDeFuncionDeEspectaculo();
		boolean salir = false;
		while(!salir){
			// LISTO LAS PLATAFORMAS ///
			ArrayList<DtPlataforma> dtPlataformas = iccdfe.listarPlataformas();
			for(DtPlataforma dtp: dtPlataformas) {
				System.out.print("- "+dtp.getNombre()+"\n");		
			}
			// FIN DE LISTADO LAS PLATAFORMAS ///
			
			// SELECCIONO LA PLATAFORMA ///
			System.out.print("Seleccione una plataforma por su nombre:\n");
			Scanner entradaPla = new Scanner(System.in);
			String plataforma = null;
			plataforma=entradaPla.nextLine(); 
			entradaPla.close();
			
			DtPlataforma plataformaSeleccionada = iccdfe.seleccionaPlataforma(plataforma);

			// FIN SELECCIONO LA PLATAFORMA ///
			
			
			
			// LISTO LAS ESPECTACULOS ///
			ArrayList<DtEspectaculo> dtEspectaculos = iccdfe.listarEspectaculos();
			for(DtEspectaculo dte: dtEspectaculos) {
				System.out.print("- "+dte.getNombre()+"\n");		
			}
			// FIN DE LISTADO LAS ESPECTACULOS ///
			
			// SELECCIONO LA ESPECTACULO ///
			System.out.print("Seleccione una especatulo por su nombre:\n");
			Scanner entradaEsp = new Scanner(System.in);
			String especatculo = null;
			especatculo=entradaEsp.nextLine(); 
			entradaEsp.close();
			
			DtEspectaculo especatculoSeleccionada =  iccdfe.seleccionaEspectaculo(especatculo);
			
			// FIN SELECCIONO LA ESPECTACULO ///
			//DETALLE DE ESPETACULO//
			System.out.print("Espectaculo Seleccionado:\n"+especatculoSeleccionada);
			// FIN DETALLE DE ESPETACULO//
			
			// LISTO LAS FUNCIONES ///
			System.out.print("\nFUNCIONES ASOCIADAS AL ESPECTACULO SELECCIONADO: \n");
			ArrayList<DtFuncion> dtFunciones = iccdfe.listarFunciones();
			for(DtFuncion dtf: dtFunciones) {
				System.out.print("- "+dtf.getNombre()+"\n");		
			}
			// FIN DE LISTADO LAS FUNCIONES ///


			
			
			boolean repiteFuncion = false;
			while(!repiteFuncion) {
				
				System.out.print("\n QUIERE DETALLAR ALGUNA FUNCION?: (si)/(no) \n");
				Scanner entradaRepetir = new Scanner(System.in);
				String rRepetir = null;
				rRepetir=entradaEsp.nextLine(); 
				entradaRepetir.close();
				
				if(rRepetir.equals("si")){
					System.out.print("\n INGRESE NOMBRE FUNCION: \n");
					Scanner entradaFuncion = new Scanner(System.in);
					String funcion = null;
					funcion=entradaFuncion.nextLine(); 
					entradaFuncion.close();
					
					DtFuncion funcionSeleccionada = iccdfe.seleccionaFuncion(funcion);
				}else if(rRepetir.equals("no")){
					repiteFuncion = true;
				}else{
					System.out.print("\n OPCION INCORRECTA \n");
				}
				
			}			
			salir = true;// SALGO DE LA REITERACION
		}
	}
	static void	AltadeFuncionDeEspetaculo(){
		Scanner entrada = new Scanner(System.in);
		String nombrePlataforma = null;
		String nombreEspectaculo = null;
		String nombreFuncion = null;
		String fecha = null;
		String hora = null;
		String fechaReg = null;
		String nickNameArtista = null;
		String respuestaAgregarArtistas = null;
		boolean usuarioDeseeAgregarMasArtistas = true;
		List<DtArtista> artistasIngresadosEnElSistema = null;
		List<DtArtista> artistasEnFuncion = new ArrayList<DtArtista>();

		Fabrica f = Fabrica.getInstancia();
		IControladorAltaDeFuncionDeEspectaculo icafe = f.getIControladorAltaDeFuncionDeEspectaculo(); 
		
		System.out.println("Ingrese nombre de la Plataforma \n");
		nombrePlataforma=entrada.nextLine();
		
		List<DtEspectaculo> listDtEspectaculos = icafe.seleccionaPlataforma(nombrePlataforma);

		for(DtEspectaculo dte: listDtEspectaculos) {
			dte.toString();
		}
		System.out.println("\n\nIngrese nombre del Espectaculo \n");
		nombreEspectaculo=entrada.nextLine();
		
		icafe.seleccionaEspectaculo(nombreEspectaculo);

		System.out.println("Nombre de Funcion: ");
		nombreFuncion=entrada.nextLine();
		
		System.out.println("Fecha de alta (dd/MM/yyyy): ");
		fecha=entrada.nextLine();

		Date fechaAlta = ParseFecha(fecha);

		System.out.println("Fecha de alta (HH:mm:ss): ");
		hora=entrada.nextLine();

		Date horaInicio = ParseFecha(hora);

		System.out.println("Fecha de alta (dd/MM/yyyy): ");
		fechaReg=entrada.nextLine();

		Date fechaRegistro = ParseFecha(fechaReg);
		DtFuncion dtFuncion = new DtFuncion(nombreFuncion, fechaAlta, horaInicio, fechaRegistro);
		
		artistasIngresadosEnElSistema = icafe.listarArtistas();

		
		do {
			for(DtArtista dtArtista : artistasIngresadosEnElSistema){
				System.out.println("---- ARTISTA ----\n\n");
				dtArtista.toString();
			};
			System.out.println("\n\nIngrese el nickname de aquel artista que quiera asociar a la funcion");
			nickNameArtista=entrada.nextLine();
			for(DtArtista dtArtista : artistasIngresadosEnElSistema){
				if(nickNameArtista.equals(dtArtista.getNickName())){
					artistasEnFuncion.add(dtArtista);
				};
			};
			System.out.println("\nDesea seguir agregando Artistas? (s/n)");
			respuestaAgregarArtistas=entrada.nextLine();
			if(respuestaAgregarArtistas.equals("n")){
				usuarioDeseeAgregarMasArtistas = false;
			};
		} while(usuarioDeseeAgregarMasArtistas);

		icafe.ingresaFuncion(dtFuncion, artistasEnFuncion);
		entrada.close();
	}
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
			//icap.ingresaPlataforma(dtPlataforma);
		};

		entrada.close();
	};
	/* REQUERIMIENTOS NO MINIMOS*/
	static void	ConsultaDeUsuario(){}
	static void	 ModificarDatosDeUsuario(){}
	static void	CrearPaqueteDeEspetaculos(){
		Fabrica f = Fabrica.getInstancia();
		IControladorConsultaDeEspectaculo iccde = f.getIControladorConsultaDeEspectaculo();
		boolean salir = false;
		while(!salir){
			// LISTO LAS PLATAFORMAS ///
			ArrayList<DtPlataforma> dtPlataformas = iccde.listarPlataformas();
			for(DtPlataforma dtp: dtPlataformas) {
				System.out.print("- "+dtp.getNombre()+"\n");		
			}
			// FIN DE LISTADO LAS PLATAFORMAS ///
			
			// SELECCIONO LA PLATAFORMA ///
			System.out.print("Seleccione una plataforma por su nombre:\n");
			Scanner entradaPla = new Scanner(System.in);
			String plataforma = null;
			plataforma=entradaPla.nextLine(); 
			entradaPla.close();
			
			DtPlataforma plataformaSeleccionada = iccde.seleccionaPlataforma(plataforma);

			// FIN SELECCIONO LA PLATAFORMA ///
			
			
			
			// LISTO LAS ESPECTACULOS ///
			ArrayList<DtEspectaculo> dtEspectaculos = iccde.listarEspectaculos();
			for(DtEspectaculo dte: dtEspectaculos) {
				System.out.print("- "+dte.getNombre()+"\n");		
			}
			// FIN DE LISTADO LAS ESPECTACULOS ///
			
			// SELECCIONO LA ESPECTACULO ///
			System.out.print("Seleccione una especatulo por su nombre:\n");
			Scanner entradaEsp = new Scanner(System.in);
			String especatculo = null;
			especatculo=entradaEsp.nextLine(); 
			entradaEsp.close();
			
			DtEspectaculo especatculoSeleccionada =  iccde.seleccionaEspectaculo(especatculo);
			
			// FIN SELECCIONO LA ESPECTACULO ///
			//DETALLE DE ESPETACULO//
			System.out.print("Espectaculo Seleccionado:\n"+especatculoSeleccionada);
			// FIN DETALLE DE ESPETACULO//
				
			// LISTO LAS ESPECTACULOS ///
			System.out.print("\n PAQUETE ASOCIADAS AL ESPECTACULO SELECCIONADO: \n");
			ArrayList<DtPaquete> dtPaquetes = iccde.listarPaquetes();
			for(DtPaquete dtp: dtPaquetes) {
				System.out.print("- "+dtp.getNombre()+"\n");		
			}
			// FIN DE LISTADO LAS ESPECTACULOS ///
			boolean repitePaquete = false;
			while(!repitePaquete) {
				
				System.out.print("\n QUIERE DETALLAR ALGUNA FUNCION?: (si)/(no) \n");
				Scanner entradaRepetir = new Scanner(System.in);
				String rRepetir = null;
				rRepetir=entradaEsp.nextLine(); 
				entradaRepetir.close();
				
				if(rRepetir.equals("si")){
					
					System.out.print("\n INGRESE NOMBRE PAQUETE: \n");
					Scanner entradaPaquete = new Scanner(System.in);
					String paquete = null;
					paquete=entradaPaquete.nextLine(); 
					entradaPaquete.close();
					

					 DtPaquete paqueteSeleccionado =  iccde.seleccionaPaquete(paquete);
					
					
				}else if(rRepetir.equals("no")){
					repitePaquete = true;
				}else{
					System.out.print("\n OPCION INCORRECTA \n");
				}
				
			}
			
			
			
			salir = true;// SALGO DE LA REITERACION
		}
	}
	static void	AgregarEspetaculoAPaqueteDeEspetaculos(){}
	static void ConsultaDePaqueteDeEspetaculos(){
		/*Fabrica f = Fabrica.getInstancia();
		IControladorConsultaDePaqueteDeEspetaculos iccd = f.getIControladorConsultaDePaqueteDeEspetaculos();
		
		// LISTO LAS PAQUETE ///
		System.out.print("\nPAQUETES ASOCIADAS AL ESPECTACULO SELECCIONADO: \n");
		ArrayList<DtPaquete> dtPaquetes = iccde.listarPaquetes();
		for(DtPaquete dtp: dtPaquetes) {
			System.out.print("- "+dtp.getNombre()+"\n");		
		}
		// FIN DE LISTADO LAS PAQUETE ///
		boolean repitePaquete = false;
		while(!repitePaquete) {
			
			System.out.print("\n QUIERE DETALLAR ALGUNA FUNCION?: (si)/(no) \n");
			Scanner entradaRepetir = new Scanner(System.in);
			String rRepetir = null;
			rRepetir=entradaEsp.nextLine(); 
			entradaRepetir.close();
			
			if(rRepetir.equals("si")){
				
				System.out.print("\n INGRESE NOMBRE PAQUETE: \n");
				Scanner entradaPaquete = new Scanner(System.in);
				String paquete = null;
				paquete=entradaPaquete.nextLine(); 
				entradaPaquete.close();
				

				 DtPaquete paqueteSeleccionado =  iccde.seleccionaPaquere(paquete);
				
				
			}else if(rRepetir.equals("no")){
				repitePaquete = true;
			}else{
				System.out.print("\n OPCION INCORRECTA \n");
			}
			
		}*/
					
	}
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
		  			//AltaDeEspectaculo();
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
			//System.out.print(opcion+"\n");
			opcion = 0;
			
			entrada.close();
			entrada = new Scanner(System.in);
			opcion = Integer.parseInt(entrada.nextLine());
			/*if(entrada.hasNextLine()) {
				opcion = Integer.parseInt(entrada.nextLine());
			}*/
		}
		entrada.close();
	}	
}
