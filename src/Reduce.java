public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int counter=0;
        while(i>0){
            if(i%2==0){
                i=i/2;
            }
            else if(i%2!=0) {
                i = i - 1;
            }
            counter +=1;
        }
        System.out.println(counter);
    }
}
