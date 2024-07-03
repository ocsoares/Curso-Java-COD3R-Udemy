package inheritance.challenge;

public class MainChallenge {
    public static void main(String[] args) {
        Fusca anyFusca = new Fusca();

        System.out.println("Fusca name: " + anyFusca.getName());
        System.out.println("Fusca brand: " + anyFusca.getBrand());

        String printCurrentSpeedText = "Velocidade ATUAL: ";

        System.out.println(printCurrentSpeedText + anyFusca.getCurrentSpeed());

        anyFusca.accelerate();
        System.out.println(printCurrentSpeedText + anyFusca.getCurrentSpeed());

        anyFusca.brakeSlowly();
        System.out.println(printCurrentSpeedText + anyFusca.getCurrentSpeed());

        anyFusca.fullyBrake();
        System.out.println(printCurrentSpeedText + anyFusca.getCurrentSpeed());

        // VAI dar ERRO, pq tá na velocidade 0 !
//        anyFusca.brakeSlowly();
//        System.out.println(printCurrentSpeedText + anyFusca.getCurrentSpeed());

        System.out.println("\n");

        var ferrariDaytona = new FerrariDaytona();

        System.out.println("ferrariDaytona name: " + ferrariDaytona.getName());
        System.out.println("ferrariDaytona brand: " + ferrariDaytona.getBrand());

        System.out.println(printCurrentSpeedText + ferrariDaytona.getCurrentSpeed());

        ferrariDaytona.accelerate();
        System.out.println(printCurrentSpeedText + ferrariDaytona.getCurrentSpeed());

        ferrariDaytona.brakeSlowly();
        System.out.println(printCurrentSpeedText + ferrariDaytona.getCurrentSpeed());

        ferrariDaytona.fullyBrake();
        System.out.println(printCurrentSpeedText + ferrariDaytona.getCurrentSpeed());

        // VAI dar ERRO, pq tá na velocidade 0 !
//        ferrariDaytona.brakeSlowly();
//        System.out.println(printCurrentSpeedText + ferrariDaytona.getCurrentSpeed());
    }
}
