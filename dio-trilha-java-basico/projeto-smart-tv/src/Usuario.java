public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada:" + smartTv.ligada);
        System.out.println("Volume atual:" + smartTv.volume);
        System.out.println("Canal atual:" + smartTv.canal);
        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada:" + smartTv.ligada);
        smartTv.aumentarCanal();
        System.out.println("Canal atual:" + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal atual:" + smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println("Canal atual:" + smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("Canal atual:" + smartTv.canal);
        smartTv.mudarCanal(50);
        System.out.println("Canal atual:" + smartTv.canal);
        smartTv.aumentarVolume();
        System.out.println("Volume atual:" + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Volume atual:" + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume atual:" + smartTv.volume);
        smartTv.desligar();
        System.out.println("Tv ligada:" + smartTv.ligada);
        


    }
}
