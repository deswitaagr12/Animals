package hewan;


class Anjing extends Hewan implements Ikarnivora {
    @Override
    public void jenis(){

        System.out.println("Jenis   : Karnivora ");
    }

    @Override
    public void getinfo(){
        System.out.println("Makanan : Daging ");
    }
    @Override
    public void bersuara(){
        System.out.println("Suara   : guk guk..");
    }

}




