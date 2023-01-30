package Giris;
import java.util.Scanner;
public class ucvedortilebolunebilensayilarinort {
    public static void main(String[] args) {
        int i,k,toplam=0,a=0,ort=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı Değeri Giriniz:");
        k= inp.nextInt();
        for(i=1; i<=k ; i++){
            if(i%3==0 && i%4==0){
                toplam+=i;
                a++;
            }
        }
        ort=toplam/a;
        System.out.println("ort:"+ort);
    }
}
