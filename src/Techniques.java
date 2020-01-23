public class Techniques {

    private Integer price;
    private String model;

    public Techniques(Integer price, String model) {
        this.price = price;
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Techniques{" +
                "price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
}
