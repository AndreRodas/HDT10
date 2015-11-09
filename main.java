/**
*Universidad del Valle de Guatemala
*Algoritmos y Estructura de Datos
*Seccion: 10
*Andre Rodas - carnet 14395
*Yosemite Melendez - carnet: 14413
*08/11/2015
*Hoja de Trabajo 10
**/


import java.io.*;
import java.util.Scanner;



/**
* Esta clase main, utilizada para ejecutar el programa
* mediante la linea de comamndos
*
**/

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
 
        String[] listaCity;			//un arreglo para la lista de ciudades
        Graph grafo = new Graph();	//nuevo grao
        
        try{
        	// Se abre el archivo grafo.txt donde est�n las ciudades
			BufferedReader file = new BufferedReader(new FileReader("grafo.txt"));
            String tempLine;
            int i = 0;
            while ((tempLine = file.readLine()) != null)   {
               
            	listaCity = tempLine.split(" ");
            	
            	// Dice la cantidad de ciudades que existen
                if(i == 0){
                    System.out.println("Existen " + listaCity.length + " ciudades :");
                    for (String TempCity : listaCity) {
                        System.out.print(TempCity + ", ");
                        grafo.addVertex(TempCity);
                    }
                    //Myestra las rutas que se pueden tomar
                    System.out.println("");
                    System.out.println("-------------------------------Rutas-------------------------------");
                    i++;   
                }
                else if(listaCity.length == 3){
                    grafo.addEdge(listaCity[0], listaCity[1], Double.parseDouble(listaCity[2]));
                    System.out.println("(" + String.valueOf(i)+"):\t ["+listaCity[0]+"] ---> ["+listaCity[1]+"] \t\t Dist: "+listaCity[2]);
                    i++;
                }  
            }
            file.close();
			
        }catch (Exception e){
            System.err.println("ERROR EN PROGRAMA: " + e.getMessage());
        }

        int opcion = 1;
        
        while(opcion!=4){
            grafo.crearMatriz();
            grafo.algoritmoFloyd();
            
            //Menu de opciones que se pueden seleccionar
            System.out.println("1. Conocer la ruta m�s corta entre dos ciudades\n" + "2. Centro del grafo\n" + "3. Realizar modificaciones en las rutas\n" + "4. Salir");     
            System.out.println("Ingrese la opcion que desea: ");
            Scanner input = new Scanner(System.in);
			opcion = Integer.parseInt(input.nextLine());
            
			//Opci�n que selecciona el usuario
            switch(opcion){
                case 1:
                          
                	System.out.println("Ingrese la ciudad de origen:");
                    String principio = input.nextLine();
                    
                    System.out.println("Ingrese la ciudad de destino:");
                    String fin = input.nextLine();
                     
                    double peso = grafo.getdistancia(principio, fin);
                    
                    //Mensaje de ruta que no existe
                    if(peso == -1)
                        System.out.println("No existe ruta entre las ciudades o ha ingresado una ciudad no existente");
                    else
                    	System.out.println("La distancia entre las ciudades es de: " + peso);
                    break;
                    
                    
                case 2:
                	System.out.println(grafo.getCenter());
                    break;
                   
                case 3:
                    
                    
                    int opcion2 = 0;
                    
               
                    while(opcion2!=3){
                       //Se puede crear una interrupci�n entre ciudades
                    	System.out.println("1. Crear interrupcion entre dos ciudades\n" + "2. Crear conexi�n entre dos ciudades\n" + "3. Salir");          
                        
                    	System.out.println("Ingrese la opcion que desea:");
                    	opcion2 = Integer.parseInt(input.nextLine());
                        switch(opcion2){
                            case 1:                 
                                System.out.println("Ciudad de origen: ");
                                String origen  = input.nextLine();
                                
                                System.out.println("Ciudad de destino: ");
                                String destino  = input.nextLine();
                                
                                if(!grafo.removeEdge(origen, destino)){
                                	System.out.println("No se pudo crear la interrupcion exitosamente");
                                }else{
                                	System.out.println("Se creo la interrupcion exitosamente");
                                }
                               
                                break;
                            case 2: //Crear conexion 
                            	
                            	System.out.println("Ciudad de origen: ");
                                String origen2  = input.nextLine();
                                
                                System.out.println("Ciudad de destino: ");
                                String destino2  = input.nextLine();   
                                
                                System.out.println("Distancia entre ambas ciudades: ");
                                peso  = Double.parseDouble(input.nextLine());         
                                
                                try {
                                    grafo.addEdge(origen2, destino2, peso);                                    
                                    System.out.println("Se creo la conexion exitosamente");
                                } catch (Exception ex) {                                    
                                	System.out.println("No se pudo crear la conexion exitosamente");
                                }
                                break;
                            case 3: //Salir
                                break;
                            default:            
                            	System.out.println("Ha ingresado una opcion incorrecta");
                        }
                    }
                    
                    grafo.imprimirMatriz();
                    
                    break;
                    
                case 4:
                    System.out.println("Programa terminado");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }
    
}