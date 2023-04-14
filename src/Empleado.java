public class Empleado {
    private String Pnombre;
    private String apellido;

    private double salarioMensual;

    //setter


    public void setPnombre(String pnombre) {
        Pnombre = pnombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    //Getter


    public String getPnombre() {
        return Pnombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public double salarioAnual(){
        return salarioMensual*12;
    }

    public double salarioMaster(){
        return salarioAnual()*0.10;
    }

    public double salarioFinal(){
        return salarioAnual()+salarioMaster();
    }
}
