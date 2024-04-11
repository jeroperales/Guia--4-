public class Ecomision extends Personal{

    private double salarioMinimo;
    private int cantClientes;
    private double precioCliente;

    public Ecomision(String dni, String nombre, String apellido, Integer anioIngreso, int cantClientes, double precioCliente) {
        super(dni, nombre, apellido, anioIngreso);
        setCantClientes(cantClientes);
        setPrecioCliente(precioCliente);
        salarioFinal = obtenerSalario();
    }

    @Override
    public void imprimir() {
        System.out.println("NOMBRE: " + this.nombre);
        System.out.println("APELLIDO: " + this.apellido);
        System.out.println("DNI: " + this.dni);
        System.out.println("ANIO INGRESO: " + this.anioIngreso);
        System.out.println("CLIENTES: " + this.cantClientes);
        System.out.println("SALARIO FINAL: " + this.salarioFinal);
        System.out.println("\n");
    }

    @Override
    public double obtenerSalario() {

        double salario;
        salario = this.cantClientes * this.precioCliente;
        if(salario < 750.00)
        {
            salario = 750;

        }

        return salario;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public int getCantClientes() {
        return cantClientes;
    }

    public void setCantClientes(int cantClientes) {
        this.cantClientes = cantClientes;
    }

    public double getPrecioCliente() {
        return precioCliente;
    }

    public void setPrecioCliente(double precioCliente) {
        this.precioCliente = precioCliente;
    }

}
