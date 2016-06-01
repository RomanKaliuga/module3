package nightglyuk.gojavaonline.MusicStore;


public class Instrument {
    private String Name = new String();
    private String Brand = new String();
    private int Price;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getPrice() {

        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
