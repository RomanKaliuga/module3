package nightglyuk.gojavaonline.Flowers;


import java.util.List;

public abstract class Bouquet {
    List<Flower> Flowers;

    public List<Flower> getFlowers() {
        return Flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        Flowers = flowers;
    }

    Flower addedFlower = new Flower();

    public void addFlower(Flower addedFlower){
        addedFlower.setName("some Flower name");
        addedFlower.setColor("Flower color");
        addedFlower.setPrice(addedFlower.getPrice());
    }

    public abstract int countPrice();
}
