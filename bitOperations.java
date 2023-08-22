public class Main {
    static int getIthBit(int n,int i){
        int bitMask=1<<i;
        if((n & bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return n | bitMask;
    }
    static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return bitMask & n;
    }
    static int clearIBits(int n,int i){
        for(int j=0;j<i;j++){
            n=(~(1<<j))&n;
        }
        return n;
    }
    static int clearRangeBits(int n,int i,int j){
        for(int k=i;k<j;k++){
            n=(~(1<<k))&n;
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10,2));
        System.out.println(setIthBit(10,2));
        System.out.println(clearIthBit(10,1));
        System.out.println(clearIBits(15,2));
        System.out.println(clearRangeBits(10,2,4));
    }
}
