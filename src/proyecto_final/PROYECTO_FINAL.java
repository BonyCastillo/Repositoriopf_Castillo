
package proyecto_final;

import java.util.Scanner;
public class PROYECTO_FINAL {

    public static void main(String[] args) {
        // TODO code application logic here
        //Declarar variables
    int vt1, vt2, vt3;
    double sm, pt, c;
    String vendedor;
    Scanner lectura=new Scanner(System.in);
    //entrada de datos
    System.out.print("Nombre del vendedor: ");
    vendedor=lectura.next();
    System.out.print("Sueldo mensual: ");
    sm=lectura.nextDouble();
    System.out.print("Venta del vendedor 1: ");
    vt1=lectura.nextInt();
    System.out.print("Venta del vendedor 2: ");
    vt2=lectura.nextInt();
    System.out.print("Venta del vendedor 3: ");
    vt3=lectura.nextInt();
    //proceso
    c=(vt1+vt2+vt3)*0.10;
    pt=sm+c;
    //salida
    System.out.println("La comisión de la venta es       :"+c);
    System.out.println("El sueldo mensual del vendedor es:"+pt);
    }
    
}
