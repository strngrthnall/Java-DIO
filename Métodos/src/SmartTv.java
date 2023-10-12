public class SmartTv {
  boolean ligada = false;
  int canal = 504;
  int volume = 10;

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

  public void mudarCanal(int canalDesejdo) {
    canal = canalDesejdo;
  }

  public void subirCanal () {
    canal++;
  }

  public void diminuirCanal() {
    canal--;
  }

  public void aumentarVolume() {
    volume++;
  }


  public void diminuirVolume() {
    volume--;
  }

}
