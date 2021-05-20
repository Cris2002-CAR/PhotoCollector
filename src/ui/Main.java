package ui;

import java.util.Scanner;


import model.PhotoCollector;

public class Main {
	
	private PhotoCollector collector;
	private Scanner sc;
	
	
	public Main() {
		collector= new PhotoCollector();
		sc= new Scanner(System.in);
	}
	public static void main(String [] args) {
		
		System.out.println("Iniciando la aplicación");
		
		Main ppal= new Main();
		
		int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
		
	}
	
	public int showMenu() {
		int option=0;

		System.out.println(
				"Menu principal, seleccione una opcion\n" +
				"(1) Para crear, editar o eliminar un album \n" +
				"(2) Para mostrar la informacion de los albums en la coleccion \n"+
				"(3) Para agregar una foto a un album\n"+
				"(4) Para editar una foto\n" +  
				"(0) Para salir"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			showMenuAlbum() ;
			break;
		case 2:
			collector.showAlbums();
			break;
	
		case 3:
			addPhotoInAlbum();
			break;

		case 4:
			editPhotoInAlbum();
			break;
		
		default:
			System.out.println("Error, opción no válida");
		
		}
	}

	private void editPhotoInAlbum() {
		
			
	}
	private void addPhotoInAlbum() {
		
		
	}

	private void showMenuAlbum() {
		int option=0;
		System.out.println(
				"Menu Album\n" +
				"(1) Para crear un album\n" +
				"(2) Para editar un album\n"+
				"(3) Para eliminar un album\n"+
				"(0) Para volver"
				);
		option= sc.nextInt();
		sc.nextLine();
		
		switch(option) {

		case 0:
			showMenu();	
		case 1:
			createAlbum();
			break;
		case 2:
			editAlbum();
			break;
		case 3: 
			deleteAlbum();
			break;
		
		}
		
	}
	private void deleteAlbum(){

		System.out.println("Eliminar un album:\n");

		System.out.print("Ingrese el nombre del album que desea eliminar: ");
		String tit = sc.nextLine();
		if(collector.findAlbum(tit)){
			collector.deleteAlbum(tit);
			System.out.println("El album "+tit+" ha sido eliminado exitosamente");
		}
		else{
			System.out.println("El album ingresado no existe");
		}

		
	}
	private void editAlbum() {

		System.out.println("Editar un album:\n");
		System.out.print("Ingrese el nombre del album que deseea editar: ");
		String tit = sc.nextLine();

		if(collector.findAlbum(tit)){

			System.out.print("Actualize el numero de paginas del album: ");
			int numPages = sc.nextInt();
			sc.nextLine();

			System.out.print("Actualize la cantidad de fotos del album: ");
			int numPics = sc.nextInt();
			sc.nextLine();

			System.out.print("Actualize el tipo de album (DIGITAL, ANALOGIC): ");
			String type = sc.nextLine();
			type = type.toUpperCase();

			collector.editAlbum(tit, numPages, numPics, type);

			System.out.println("El album "+tit+" ha sido actualizado");
		}
		else{

			System.out.println("El album ingresado no existe");
		}

	}

	private void createAlbum() {
		if(collector.hasAlbums()) {
			String tit, type;
			int numPages, numPics;
			System.out.println("Digite los datos del album a crear ");
			System.out.print("Titulo del album: ");
			tit = sc.nextLine();
			
			if(!collector.findAlbum(tit)) {
				System.out.print("Numero de paginas del album: ");
				numPages = sc.nextInt();
				sc.nextLine();
				System.out.print("Cantidad de fotos por pagina del album: ");
				numPics = sc.nextInt();
				sc.nextLine();
				System.out.print("Tipo del album (DIGITAL, ANALOGIC): ");
				type = sc.nextLine();
				type= type.toUpperCase();
				
				collector.addAlbum(tit, numPages, numPics, type);
				
				System.out.println("El album \""+ tit +"\" ha sido creado con exito\n");
				
			}else {
				System.out.println("Ya existe en la coleccion un album con título "+ tit);
			}
		}else {
			System.out.println("No puede crearse el album porque se llego al limite\n");
		}
		
	}

	


}
