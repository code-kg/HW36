public class Computer extends Techniques{

    private Double diagonal;

    public Computer(Integer price, String model, Double diagonal) {
        super(price, model);
        this.diagonal = diagonal;
    }

    public Double getDiagonal() {
        return diagonal;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj instanceof Computer) {
            if(((Computer)obj).getPrice().equals(this.getPrice()) &&
                    ((Computer)obj).getModel().equals(this.getModel()) &&
                    ((Computer)obj).getDiagonal().equals(this.getDiagonal())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
