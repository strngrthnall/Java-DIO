package edu.marcos.segundaaula;
public class MinhaClasse {
  public static void main(String[] args) {
		String primeiroNome = "Marcos";
		String segundoNome = "Vinicius";

		String nomeColpleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(nomeColpleto);
  }
	public static String nomeCompleto(String primeiroNome, String segundoNome){
		return primeiroNome.concat(" " + segundoNome);
	}
}