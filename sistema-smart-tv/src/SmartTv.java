public class SmartTv {
    // parâmetros iniciais que definimos para nossa SmartTV
    boolean ligada = false; 
    int canal = 1;
    int volume = 25;

    // Criamos um método para inserir diretamente o canal desejado 
    // com um parâmetro que pergunta qual canal vamos inserir
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
    // Criamos o método para mudar o canal mais um ou menos um
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }   


    // Criamos um método para o volume da Tv
    public void aumentarVolume(){
        volume++; // é o mesmo que volume = volume + 1
    }
    public void diminuirVolume(){
        volume--; // é o mesmo que volume = volume - 1
    }   


    // Criamos os métodos que manipulam os estados da nossa Tv
    public void ligar(){
        ligada = true;

    }
    public void desligar(){
        ligada = false;
    }
}
