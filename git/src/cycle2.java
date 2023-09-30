public class cycle2 {
    public static void main(String[] args) {
        for(int i =10;i<100;i++ ){
            int x = i*i;
            int num = x;
            int ost = 0;
            int nov = 0;
            while(num!=0){
                ost = num % 10;
                nov = nov*10 + ost;
                num = num / 10;
            }
            if(x==nov){
                System.out.println(i);
            }
        }
    }
}
