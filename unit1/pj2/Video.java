package unit1.pj2;

public class Video {
    String title;
    boolean[] flag = new boolean[10];
    int[] userRating = new int[10];

    void beingCheckOut(int i){
        if(flag[i]){
            flag[i]=false;
        }
    }
    void beingReturned(int j){
        if (!flag[j]){
            flag[j]=true;
        }
    }
    void receiveARating (int n,int no){
        userRating[n]=no;
    }

}
