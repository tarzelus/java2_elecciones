import com.zubiri.elecciones.*;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.*;




public class Eleccionest {

	public static void main (String args[]) throws IOException{

		Scanner sc = new Scanner(System.in);

		//-------------------------------------------habitante------------------------------------------------	
		
		/*String DNI, nombre, apellido, denuevo;
		int edad;
		
		Habitante habitante = new Habitante();

		System.out.print("\n-------------introduce los datos del habitante------------------");	

		//herramientas para escribir en el fichero
		try 
		{
				
			String ruta = "/home/zubiri/Proyectosjava/java2_elecciones/censo.txt";
 
			FileWriter fw = new FileWriter(ruta , true);
			BufferedWriter bw = new BufferedWriter(fw);
		
			


		

		//pregunta por primera vez para escribir el nombre del habitante y pregunta para agregar un nombre mas a la lista
		do{
		
		//comprueba que el DNI inglresado tiene el numero de caracteres que tiene que tener un DNI		
			do{
				System.out.print("\ningresa el numero del DNI con letra (8 numeros y 1 letra): ");
				DNI = sc.next();
				habitante.setDni(DNI);
			} while (DNI.length() >9 || DNI.length() < 9);
			
			bw.write(DNI + ",");

			System.out.print("\ningresa el Nombre del habitante: ");
			nombre = sc.next();
			habitante.setNombre(nombre);
			bw.write(nombre + ",");
			
			System.out.print("\ningresa el apellido del hahbitante: ");
			apellido = sc.next();
			habitante.setApellido(apellido);
			bw.write(apellido + ",");

			System.out.print("\ningresa la fecha de nacimiento del habitante: ");
			edad = sc.nextInt();
			habitante.setEdad(edad);
			bw.write(edad + "\n");

			bw.close();
			System.out.print("\nquieres insertar otro habitante? (si/no)");
			denuevo = sc.next();
		

		}while (denuevo.equalsIgnoreCase("si"));

		

			
        	}
		 catch (FileNotFoundException e) 
		{
           		 System.out.println(e.getMessage());
        	}


		























		
		//-------------------------------------------Inmueble------------------------------------------------	


		String direccion, provincia, localidad, fecha_construc;
		int cod_postal;

		Inmueble inmueble = new Inmueble();

		System.out.print("\n-------------Datos del inmueble------------------");	


		System.out.print("\ningresa la dirección del inmueble: ");
		direccion = sc.nextLine();
		inmueble.setDireccion(direccion);

		System.out.print("\ningresa el nombre de la provivncia del inmueble: ");
		provincia = sc.next();
		inmueble.setProvincia(provincia);

		System.out.print("\ningresa la localidad del inmueble: ");
		localidad = sc.next();
		inmueble.setLocalidad(localidad);

		System.out.print("\nIngresa el  codigo postal del inmueble:  ");
		cod_postal = sc.nextInt();
		inmueble.setCod_postal(cod_postal);

		System.out.print("\nIngresa la fecha de construccion del inmueble ");
		fecha_construc = sc.next();
		inmueble.setFecha_construc(fecha_construc);

		//-------------------------------------------Espacio Publico------------------------------------------------

		String direccione, tipo, localidade;

		EspacioPublico espaciopublico = new EspacioPublico();
		
		System.out.print("\n-------------Espacio publico------------------");

		System.out.print("\ningresa el tipo de espacio publico ");
		tipo = sc.next();
		espaciopublico.setTipo(tipo);

	
		System.out.print("\ningresa la localidad del espacio publico: ");
		localidade = sc.next();
		espaciopublico.setLocalidad(localidad);	
	
		System.out.print("\ningresa la direccion del espacio publico ");
		direccione = sc.next();
		espaciopublico.setDireccion(direccione);




		//-----------------------------------------Ayuntamiento---------------------------------------------
		

 		String localidada,alcalde,govierno,cod_postala;		
 		int populacion,censo;
		double extension;
		 
		Ayuntamiento ayuntamiento = new Ayuntamiento();

		System.out.print("\n-------------Ayuntamiento------------------");

		System.out.print("\ningresa la localidad del ayuntamiento: ");
		localidada = sc.next();
		ayuntamiento.setLocalidad(localidada);	
	
		System.out.print("\ningresa el nombre del alcalde: ");
		alcalde = sc.next();
		ayuntamiento.setAlcalde(alcalde);

		System.out.print("\ningresa el partido del alcalde: ");
		govierno = sc.next();
		ayuntamiento.setGovierno(govierno);

		System.out.print("\ningresa el codigo postal que abarcarca el ayuntamiento: ");
		cod_postala = sc.next();
		ayuntamiento.setGovierno(cod_postala);

		System.out.print("\nIngresa la extensio de los terrenos del ayuntamientos: ");
		extension = sc.nextDouble();
		ayuntamiento.setExtension(extension);

		System.out.print("\ningresa la populacion de la ciudad:  ");
		populacion = sc.nextInt();
		ayuntamiento.setPopulacion(populacion);

		System.out.print("\ningresa la censo de la ciudad:  ");
		censo = sc.nextInt();
		ayuntamiento.setCenso(censo);

		*/
		//-----------------------------------------partidos---------------------------------------------


		//lectura del fichero listadosPartidos.txt y guardarlos en un arraylist para imprimirlos


		System.out.print("\n----------------------------Lista de partidos-----------------------------------\n");
	


		String nombrefichero = "listadosPartidos.txt";
		String ruta ="/home/zubiri/Proyectosjava/java2_elecciones";
				ArrayList<Partido> partidos = new ArrayList<Partido>();


		int i = 0;

			
		//lectura del fichero	
			File archivo = new File(ruta, nombrefichero);
			FileReader leer = new FileReader (archivo);
			BufferedReader bf = new BufferedReader(leer);
			String salida = bf.readLine();
 

			int num = 0;


			do
			{
				// se le da valor a la variable de salida de tipo string de la linea que lee
				
				//Coje el valor de string que tiene la linea completa y lo divide en diferentes secciones
				String [] cortarString = salida.split(",");	
			
				//se le da valor a cada tributo del partido
				Partido part = new Partido(); 
				part.setNombre(cortarString[0]);
				part.setLider(cortarString[1]);
				part.setIdeologia(cortarString[2]);
				part.setCant_militantes(Integer.parseInt(cortarString[3]));
				part.setPrevias_elecciones(Integer.parseInt(cortarString[4]));
			
				//el valor que se le ha dado a cada atributo se lo pasa al objeto de tipo arraylist de partido
				partidos.add(part);

						

			} while ((salida = bf.readLine()) != null);

     


			for(int d=0; d<partidos.size(); d++)
        	{
            	System.out.println("  ----------------------\n");
            		System.out.println(" nombre: "+partidos.get(d).getNombre() );
            		System.out.println(" \nlider: "+partidos.get(d).getLider());
            		System.out.println(" \nideologia: "+ partidos.get(d).getIdeologia());
            		System.out.println(" \nCantidad de militantes: "+ partidos.get(d).getCant_militantes());
            		System.out.println(" \nCantidad de militantes: "+ partidos.get(d).getPrevias_elecciones());
        	}	
			

	
						
			
		



	



      	
			

		

		//-------------------------------------impresion de los datos----------------------------------------
/*
		System.out.print("\n-------------Estos son los datos del habitante------------------");	

		
			System.out.println("\nEl Numero del DNI es: " + habitante.correcto());
			System.out.println("\nEl nombre Del habitante es : " + habitante.getNombre());
			System.out.println("\nEl apellido del habitante: " + habitante.getApellido());
			System.out.println("\nla edad del habitante es: " + habitante.getEdad());

		
		System.out.print("\n-------------Estos son los datos del habitante------------------");	

			System.out.println("\nLa direccion del inmueble: " + inmueble.getDireccion());
			System.out.println("\nProvincia del inmueble : " + inmueble.getProvincia());
			System.out.println("\nLocalidad del inmueble: " + inmueble.getLocalidad());
			System.out.println("\nCódigo postal del inmueble: " + inmueble.getCod_postal());
			System.out.println("\nFecha de construcción del inmueble: " + inmueble.getFecha_construc());

		System.out.print("\n-------------Estos son los datos del espacio publico------------------");	

			System.out.println("\nEste es el tipo de espacio publico que es: " + espaciopublico.getTipo());
			System.out.println("\nLocalidad del espacio publico: " + espaciopublico.getLocalidad());
			System.out.println("\nLa direccion del espacio publico: " + espaciopublico.getDireccion());
*/
	
	
			



	}

}
