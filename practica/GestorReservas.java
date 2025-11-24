public class GestorReservas {
     public Reserva[] reservas;
     private int contador;
     
     public GestorReservas(int capacidad){
         reservas = new Reserva[capacidad];
         contador = 0;
     }
        public void agregarReserva(Reserva reserva){
            if(contador < reservas.length){
                reservas[contador] = reserva;
                contador++;
            }
            
        }
        public Reserva[] getReservas(){
            return reservas;
        }
}
