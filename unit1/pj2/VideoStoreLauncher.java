package unit1.pj2;
import java.util.Arrays;
public class VideoStoreLauncher {
    public static void main(String args[]){
        VideoStore o=new VideoStore();
        Arrays.fill(o.flag, true);
        o.addVideo("The Matrix");
        o.addVideo("Godfather II");
        o.addVideo("Star War Episode IV: A New Hope");
        o.receiveRating(0, 4);
        o.receiveRating(1, 3);
        o.receiveRating(2, 5);
        o.checkOut("The Matrix");
        o.checkOut("Godfather II");
        o.checkOut("Star War Episode IV: A New Hope");
        o.returnVideo("The Matrix");
        o.returnVideo("Godfather II");
        o.returnVideo("Star War Episode IV: A New Hope");
        o.checkOut("Godfather II");
        System.out.println("*************************************************************************");
        System.out.println("Javed Ali      18BCS6705");
        System.out.println("Videos"+"                           ");
        System.out.println("------");
        o.listInventory();
        System.out.println("*************************************************************************");


    }
}
