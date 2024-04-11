public abstract class Personal {
    public String dni;
    public String nombre;
    public String apellido;
    public Integer anioIngreso;

    public double salarioFinal;

    public Personal(String dni, String nombre, String apellido, Integer anioIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(Integer anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public abstract void imprimir();

    public int antiguedad(){
        int antiguedad;
        antiguedad  = (2024 - this.anioIngreso);
        return antiguedad;
    }

    public abstract double obtenerSalario();
}
