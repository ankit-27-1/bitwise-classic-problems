public class Main{
    static int setBits(int n){
        int count=0;
        while(n!=0){
            int bitMask=1<<0;
            n=n>>1;
            if((n & bitMask)==1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(setBits(10));
    }
}
