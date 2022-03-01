
class estudiante{}

public class Main 
{

    public AsignarNombre(String nuevoNombre) {
        estudiante.nombre = nuevoNombre; 
    }
    
    public AsignarEstado(String nuevoEstado) {
        estudiante.estado = nuevoEstado; 
    }
    
    public static void estudiante(String[] args) 
    {
        estudiante e1 = new estudiante(System.in);
        e1.nombre = "Maria";
        e1.calificacion = "80";
        e1.NumCtl = "123";
        e1.materia = "Ciencias";
        e1.estado = "Aprobado";
    }

    
    public static void main(String[] args) 
    {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) 
        {
            System.out.println("1. Capturar alumnos ");
            System.out.println("2. Mostrar alumnos");
            System.out.println("3. Salir");

            try 
            {
                System.out.println("Escoge una opcion: ");
                opcion = sn.nextInt();
                switch (opcion) {
                    case 1:
                        {
                            estudiante e1 = new estudiante(System.in);
                            
                            estudiante(args  ) ;
                            
                                System.out.println("Ingrese el nombre del estudiante: ");
                                e1.nombre = sn.nextInt();
                            
                            System.out.println("Ingrese la calificacion: ");
                            e1.calificacion = sn.nextInt();
                            
                            System.out.println("Ingrese el numero de matricula: ");
                            e1.NumCtl = sn.nextInt();

                            System.out.println("Ingrese la materia: ");
                            e1.materia = sn.nextInt();

                            if(e1.calificacion<60)
                            {
                                e1.estado = "Reprobado";
                            }
                            else
                            {
                                e1.estado = "Aprobado";
                            }
                        
                        break; }
                    case 2:
                            System.out.println("Nombre del estudiante: " + e1.nombre);
                            System.out.println("Calificacion: " + e1.calificacion);
                            System.out.println("Numero de control: " + e1.NumCtl);
                            System.out.println("Materia: " + e1.materia);
                            System.out.println("Estado: " + e1.estado); 

                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        break;
                   
                } }
                    catch (InputMismatchException e) 
                    {
                    sn.next();
                    }
                
            }
        
    }}

