import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        Empleado2 e2 = new Empleado2();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del primer Empleado: ");
        String Pnombre = sc.nextLine();
        System.out.println("Ingrese el nombre del segundo Empleado: ");
        String Pnombre2 = sc.nextLine();
        System.out.println("Ingrese el apellido del primer Empleado: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese el apellido del segundo Empleado: ");
        String apellido2 = sc.nextLine();
        System.out.println("Ingrese el salario mensual del primer Empleado");
        double salarioMensual = sc.nextDouble();
        System.out.println("Ingrese el salario mensual del segundo Empleado");
        double salarioMensual2 = sc.nextDouble();

        e1.setPnombre(Pnombre);
        e1.setApellido(apellido);
        e1.setSalarioMensual(salarioMensual);
        e2.setPnombre2(Pnombre2);
        e2.setApellido2(apellido2);
        e2.setSalarioMensual2(salarioMensual2);

        if(salarioMensual<0){
            e1.setSalarioMensual(0);
            System.out.println("El nombre del empleado uno es: " +e1.getPnombre());
            System.out.println("El nombre del Apellido uno es: " +e1.getApellido());
            System.out.println("El salario anual del empleado uno es: " +e1.salarioAnual());
            System.out.println("El salario anueal con aumento del 10% es: " +e1.salarioFinal());
        }else{
            System.out.println("El nombre del empleado uno es: " +e1.getPnombre());
            System.out.println("El nombre del Apellido uno es: " +e1.getApellido());
            System.out.println("El salario anual del empleado uno es: " +e1.salarioAnual());
            System.out.println("El salario anueal con aumento del 10% es: " +e1.salarioFinal());
        }

        if(salarioMensual2<0){
            e2.setSalarioMensual2(0);
            System.out.println("El nombre del empleado uno es: " +e2.getPnombre2());
            System.out.println("El nombre del Apellido uno es: " +e2.getApellido2());
            System.out.println("El salario anual del empleado uno es: " +e2.salarioAnual2());
            System.out.println("El salario anueal con aumento del 10% es: " +e2.salarioFinal2());

        }else{
            System.out.println("El nombre del empleado uno es: " +e2.getPnombre2());
            System.out.println("El nombre del Apellido uno es: " +e2.getApellido2());
            System.out.println("El salario anual del empleado uno es: " +e2.salarioAnual2());
            System.out.println("El salario anueal con aumento del 10% es: " +e2.salarioFinal2());
        }






    }

}