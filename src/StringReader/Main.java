public class Main {

    public static void main(String[] args) throws InterruptedException {

        String line1 = "was the mass murder of almost 2,800 men and boys in the city of Kragujevac in the German-occupi" +
                "ed territory of Serbia by German soldiers during World War II. Coming in reprisal for insurgent attacks that killed 10 German " +
                "soldiers in the Gornji Milanovac district, it followed";

        String line2 = "a punitive German operation in which 492 males were shot and four villages were burned down. The vic" +
                "tims included Serbs, Jews, Romani people, Muslims, Macedonians, an" +
                "d Slovenes. The massacre exacerbated tensions between the two guerrilla movements, the communist-led";

        String line3 = "Germans would only result in more Serb civilian deaths. Several senior" +
                " German military officials were tried and convicted during and after the Nuremberg Trials for their involvement in the repri" +
                "sal shootings. The massacre has been the subject of several poems and feature films.";


        Threads tread1 = new Threads(line1);
        Threads tread2 = new Threads(line2);
        Threads tread3 = new Threads(line3);
        SetS set = new SetS();

        tread1.start();
        tread2.start();
        tread3.start();

        Thread.sleep(2000);

        System.out.println(set.getSet().size());

    }
}
