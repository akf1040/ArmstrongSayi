public class Main {
    public static void main(String[] args) {

        int basamak;
        int birler;
        int onlar;
        int yüzler;
        
        int toplam;

        for(int i=100;i<=5000;i++){
            basamak=i;

            birler=basamak % 10;
            basamak/=10;

            onlar=basamak % 10;
            basamak/=10;
            
            yüzler=basamak % 10;
            basamak/= 10;


            toplam=(birler*birler*birler)+(onlar*onlar*onlar)+(yüzler*yüzler*yüzler);

            if(toplam==i){
                System.out.println(  i + ": bir armstrong sayıdır");
            }
        }


    }
}