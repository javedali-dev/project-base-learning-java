package unit1.pj2;

public class VideoStore extends Video{
    Video video =new Video();
    String[] videos = new String[10];
    int[] rate =new int[10];
    int i=0;

    void addVideo(String title){
        videos[i++] = title;
    }

    void checkOut(String nm){
        int j,index=0;
        for(j=0;j<3;j++)
        {
            if(videos[j].equals(nm))
            {
                index=j;
            }
        }
        beingCheckOut(index);
    }

    void returnVideo(String nm)
    {
        int j,index=0;
        for(j=0;j<3;j++)
        {
            if(videos[j].equals(nm))
            {
                index=j;
            }
        }
        beingReturned(index);
    }
    void receiveRating(int n, int no )
    {
        rate[n]=no;
        receiveARating(n,no);
    }
    void listInventory(){
        int i;

        for(i=0;i<3;i++)
        {

            if(flag[i]){

                System.out.println(videos[i]+"                ");
                   }
        }

    }
}
