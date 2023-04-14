public class Empleado2 {

    private String Pnombre2;
    private String apellido2;

    private double salarioMensual2;

    //setter


    public void setPnombre2(String pnombre2) {
        Pnombre2 = pnombre2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setSalarioMensual2(double salarioMensual2) {
        this.salarioMensual2 = salarioMensual2;
    }

    //Getter


    public String getPnombre2() {
        return Pnombre2;
    }

    public String getApellido2() {
        return apellido2;
    }

    public double getSalarioMensual2() {
        return salarioMensual2;
    }

    public double salarioAnual2(){
        return salarioMensual2*12;
    }

    public double salarioMaster2(){
        return salarioAnual2()*0.10;
    }

    public double salarioFinal2(){
        return salarioAnual2()+salarioMaster2();
    }
}
