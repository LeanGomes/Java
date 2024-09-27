package ProjetoSmartTv;

public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal: "+smartTv.canal);
        System.out.println("Volume: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("TV Ligada?" + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("TV Ligada?" + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume +1 :" + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume - 5 :" + smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);
        
        smartTv.mudarCanal(15);
        System.out.println("Novo Canal: " + smartTv.canal);
        
    }
}
