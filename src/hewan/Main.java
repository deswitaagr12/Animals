package hewan;


public class Main {
    public static void main(String[] args) {
        Beruang bear = new Beruang();

        System.out.println("Hewan   : Beruang" );
        bear.jenis();
        bear.getinfo();
        bear.bersuara();
        System.out.println("\n" );

        Kucing meong = new Kucing();
        System.out.println("Hewan   : Kucing" );
        meong.jenis();
        meong.getinfo();
        meong.bersuara();
        System.out.println("\n" );

        Anjing guk = new Anjing();
        System.out.println("Hewan   : Anjing" );
        guk.jenis();
        guk.getinfo();
        guk.bersuara();
        System.out.println("\n" );


        Kuda iho = new Kuda();
        System.out.println("Hewan   : Kuda" );
        iho.jenis();
        iho.getinfo();
        iho.bersuara();




    }


}