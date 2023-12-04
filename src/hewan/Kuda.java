package hewan;


class Kuda extends Hewan implements IHerbi {
    @Override
    public void jenis(){

        System.out.println("Jenis   : Herbivora ");
    }



    @Override
    public void getinfo(){
        System.out.println("Makanan : Tumbuhan ");
    }
    @Override
    public void bersuara(){
        System.out.println("Suara   : Ihoo..");
    }

}




