package hewan;

class Beruang extends Hewan implements Ikarnivora, IHerbi {
    @Override
    public void jenis() {

        System.out.println("Jenis   : Karnivora + Herbivora");
    }


    @Override
    public void getinfo() {
        System.out.println("Makanan : Daging + Tumbuhan");
    }

    @Override
    public void bersuara() {
        System.out.println("Suara   : graauw..");
    }

}
