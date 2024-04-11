public class Easalariado extends Personal {

    private double sueldoBase;
    private Integer porcAdicional;

    public Easalariado(String dni, String nombre, String apellido, Integer anioIngreso, double sueldoBase) {
        super(dni, nombre, apellido, anioIngreso);
        setSueldoBase(sueldoBase);
        salarioFinal = obtenerSalario();
    }

    @Override
    public void imprimir() {
        System.out.println("NOMBRE: " + this.nombre);
        System.out.println("APELLIDO: " + this.apellido);
        System.out.println("DNI: " + this.dni);
        System.out.println("ANIO INGRESO: " + this.anioIngreso);
        System.out.println("ANTIGUEDAD: " + this.antiguedad() + "(" + porcAdicional + "%)");
        System.out.println("SALARIO FINAL: " + this.salarioFinal);
        System.out.println("SUELDO BASE: " + this.sueldoBase);
        System.out.println("\n");
    }

    @Override
    public double obtenerSalario() {
        this.setPorcAdicional();
        double salario;
        setSueldoBase(sueldoBase);
        salario = this.sueldoBase + (this.sueldoBase * this.porcAdicional / 100);

        return salario;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public Integer getPorcAdicional() {
        return porcAdicional;
    }

    public void setPorcAdicional() {
        this.porcAdicional = 0;
        if (this.antiguedad() == 2 && this.antiguedad() == 3) {
            this.porcAdicional = 5;
        } else if (this.antiguedad() >= 4 && this.antiguedad() <= 7) {
            this.porcAdicional = 10;
        } else if (this.antiguedad() > 7 && this.antiguedad() < 16) {
            this.porcAdicional = 15;
        } else if (this.antiguedad() > 15) {
            this.porcAdicional = 20;
        }
    }



}
