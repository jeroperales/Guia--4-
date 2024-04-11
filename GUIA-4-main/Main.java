public class Main {
    public static void main(String[] args) {

        Easalariado empleadoJavi = new Easalariado("569587A", "Javier", "Gomez", 2008, 1250.00);
        Easalariado empleadoMaria = new Easalariado("896325D", "Maria", "Nuñez", 2013, 1155.00);

        Ecomision empleadoEva = new Ecomision("695235B", "Eva", "Nieto", 2010,179,8.10);
        Ecomision empleadoJose = new Ecomision("741258C", "Jose", "Ruiz", 2012,81,7.90);

        empleadoEva.obtenerSalario();
        empleadoJavi.imprimir();
        empleadoMaria.imprimir();
        empleadoEva.imprimir();
        empleadoJose.imprimir();

    }
}