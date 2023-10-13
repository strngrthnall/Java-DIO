public class SistemaIbge {
  public static void main(String[] args) {
    for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
      System.out.println(e.getSigla() + " - " + e.getNome());
    }
    EstadoBrasileiro eb = EstadoBrasileiro.RIO_JANEIRO;
    System.out.println(eb.getNome() + " - " + eb.getSigla() + " - " + eb.getIbge());
  }
}
