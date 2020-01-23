import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList <Techniques>techniques = new ArrayList<>();
        for (int i=0; i<100;i++){
            if (i<50){
                techniques.add(new Notebook(500*i+10, "Dell"));
            } else
                techniques.add(new Computer(1000*i+10, "Asus", 7.5));
            System.out.println(techniques.get(i));
        }

        int pcSum = 0;
        int nbSum = 0;
        for (int i=0;i<techniques.size();i++){
            if(techniques.get(i) instanceof Notebook){
                nbSum=+techniques.get(i).getPrice();
            }
            if(techniques.get(i) instanceof Computer){
                pcSum=+techniques.get(i).getPrice();
            }
        }
        System.out.println("Sum of Notebooks is " + nbSum);
        System.out.println("Sum of PC's is: " + pcSum);

        int discountSum=0;
        int discount = 20;
        for (int i=0; i<techniques.size();i++){
            if (techniques.get(i) instanceof Notebook){
                discountSum+=((Notebook)techniques.get(i)).getDiscount(discount);
            }
        }
        System.out.println("Discount is " + discount+ "%\n" +"Sum with Discount: " + discountSum);

        Notebook search = new Notebook(1010, "Dell");
        if (techniques.contains(search)){
            int searchIndex = techniques.indexOf(search);
            System.out.println(techniques.get(searchIndex));
        } else
        System.out.println("No such PC");


        ArrayList<Techniques>newPCs=new ArrayList<>(techniques);
        boolean isSorted = false;
        Techniques buffer;
        while (!isSorted){
            isSorted = true;
            for(int i=0;i<newPCs.size()-1;i++){
                if(newPCs.get(i).getPrice()<newPCs.get(i+1).getPrice()){
                    isSorted = false;
                    buffer = newPCs.get(i);
                    newPCs.set(i,newPCs.get(i+1));
                    newPCs.set(i+1, buffer);
                }
            }
        }
        System.out.println(newPCs);

    }
}
