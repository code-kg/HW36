public class Notebook extends Techniques {
    public Notebook(Integer price, String model) {
        super(price, model);
    }

    public Integer getDiscount(Integer discount){
        return getPrice()-getPrice()*(discount/100);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj instanceof Notebook) {
            if(((Notebook)obj).getPrice().equals(this.getPrice()) &&
                    ((Notebook)obj).getModel().equals(this.getModel())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
