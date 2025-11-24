public class Main {
    public static void main(String[] args) {
        GestorReservas gestor = new GestorReservas(4);

        Reserva sala1 = new SalaTradicional("T001", "Harry Potter y el prisionero de azkaban", 10000, 132);
        Reserva sala2 = new SalaTradicional("T002", "Five Nights at Freddys 2", 6000, 100);
        Reserva sala3d1 = new Sala3D("D001", "El Sorprendente Hombre-Araña 2", 7000, 25000);
        Reserva sala3d2 = new Sala3D("D002", "Scream 7", 8000, 3300);

        gestor.agregarReserva(sala1);
        gestor.agregarReserva(sala2);
        gestor.agregarReserva(sala3d1);
        gestor.agregarReserva(sala3d2);

        double total = 0;

        for (int i = 0; i < gestor.getReservas().length; i++) {
            Reserva reserva = gestor.getReservas()[i];
            System.out.println(reserva.obtenerDetalles());

            if (reserva instanceof Sala3D) {
                total += reserva.getCostoBase() + ((Sala3D) reserva).getValorLentes();
            } else {
                total += reserva.getCostoBase();
            }
        }

        System.out.println("Total: " + total);
    }
}