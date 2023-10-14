package equipamentos.Multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{

  public void imprimir(){
    System.out.println("Imprimindo na Multi");
  }
  public void digitalizar(){
    System.out.println("Digitalizando na Multi");
  }
  public void copiar() {
    System.out.println("Copiando na Multi");
  }
  
}