// A classe Usuário será como o controle remoto da SmartTV
public class Usuario {
    public static void main(String[] args) throws Exception {
        // Chamamos nossa Classe "SmartTv" e criamos uma nova Classe com o nome:
        // "smartTv"
        SmartTv smartTv = new SmartTv();
        
        // Diminuímos o volume da Tv três vezes:
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        // Depois aumentamos um volume:
        smartTv.aumentarVolume();

        // Chamamos o método para mudar o canal inserido
        smartTv.mudarCanal(13);
        // Para aumentar e diminuir o canal em mais ou menos 1
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        
        // Imprimimos o resultado do volume atual:
        System.out.println("Volume atual: " + smartTv.volume);

        // Imprimindo o estado atual da nossa Tv 
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        // Chamando os métodos que criamos dentro da Classe "SmartTv"
        smartTv.ligar ();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
    }
}
