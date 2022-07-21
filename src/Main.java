import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.


        /*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların
         ortalamasını hesaplayan programı yazınız.
         */

        int sayi;
        int sayac = 0;
        double toplam = 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("0'dan gireceginiz sayiya kadar 3'e ve 4'e bolunen sayilarin ortalamasi hesaplanacaktir.");
        System.out.println("Sayiyi giriniz = ");

        sayi = inp.nextInt();

        if(sayi<0){
            System.out.println("Girilen sayi gecersizdir.");
            return;
        }

        for(int i=0; i<=sayi; i++){
            if(i % 3 == 0 && i % 4 == 0){
                toplam = toplam + i;
                sayac++;
                i++;
            }else{
                i++;
            }
        }

        System.out.println("3'e ve 4'e bolunen sayilarin ortalamasi = "+ toplam/sayac);








    }
}
