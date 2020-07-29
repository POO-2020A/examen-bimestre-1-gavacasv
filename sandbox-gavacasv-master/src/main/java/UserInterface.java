import java.util.Scanner;
public class UserInterface {
    private Scanner scan;
    private Plane avion;

    public UserInterface(Scanner scan) {
        this.scan = scan;
    }
    public void start(){
        int columnas=0;
        int filas=0;
        do{
        System.out.println("Ingrese la cantidad de filas(hasta 20):");
        filas= Integer.valueOf(scan.nextLine());
        System.out.println("Ingrese la cantidad de columnas(hasta 8):");
        columnas= Integer.valueOf(scan.nextLine());    
        }while(columnas>8 && filas>20
                ||columnas<0 && filas<0);
        avion=new Plane(filas,columnas);
        boolean sale = false;
        while(!sale){
            System.out.println("¿Que desea hacer? "
                    + "\n1.Ingresar Pasajero"
                    + "\n2. Consultar asiento"
                    + "\n3.Consultar pasajero"
                    + "\n0.Salir");
            int opcion =Integer.valueOf(scan.nextLine());
            switch(opcion){
                case 1:
                    System.out.println("Ingresar un pasajero");
                    System.out.print("Ingresar el nombre del pasajero: ");
                    String nombre = scan.nextLine();
                    System.out.print("Ingresar el apellido del pasajero: ");
                    String apellido = scan.nextLine();
                    Passenger pasajero =new Passenger(nombre,apellido);
                    int c;
                    int fila;
                    String columna;
                    do{
                        System.out.print("Ingrese la fila del asiento: ");
                         fila= Integer.valueOf(scan.nextLine());
                        System.out.print("Ingrese la columna del asiento: ");
                        columna = scan.nextLine();   
                        c= avion.aLet(columna);
                    }while(c>columnas && fila>filas
                            |c<0 && fila<0);
                    
                    Seat asiento=new Seat(fila,columna);
                    if(avion.isFree(asiento)){
                        System.out.print("!Pasajero ingresado¡");
                        asiento.setPassenger(pasajero);
                        avion.add(asiento);
                    }
                    else{
                        System.out.print("!Pasajero no ingresado¡");
                    }
                        
                    System.out.println(avion.toString());
  
                    break;
                case 2:
                    System.out.println("Consulta de asiento");
                    do{
                        System.out.print("Ingrese la fila del asiento: ");
                         fila= Integer.valueOf(scan.nextLine());
                        System.out.print("Ingrese la columna del asiento: ");
                        columna = scan.nextLine();   
                        c= avion.aLet(columna);
                    }while(c>columnas && fila>filas
                            |c<0 && fila<0);

                     asiento=new Seat(fila,columna);
                     if(avion.puestoF(asiento)){
                         
                     }
                     //existencia
                    break;
                case 3:
                    System.out.print("Ingresar el nombre y apellido: ");
                    String fullnombre = scan.nextLine();
                    
                    break;
                case 0:
                    sale=true;
                    break;
            }
            
        }
        
        
        
    }
    
    
}
