public class Usuario {
  public static void main(String[] args) throws Exception {
    SmartTv smartTv = new SmartTv();

    System.out.println(smartTv.ligada);
    System.out.println(smartTv.canal);
    System.out.println(smartTv.volume);

    smartTv.ligar();

    System.out.println(smartTv.ligada);

    smartTv.mudarCanal(508);
    System.out.println(smartTv.canal);

    smartTv.aumentarVolume();
    System.out.println(smartTv.volume);


  }
  
}
