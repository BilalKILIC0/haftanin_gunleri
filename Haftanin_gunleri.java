/*
Adım 1: Başla
Adım 2: Kullanıcıdan 1 ile 7 arasında bir değer al
Adım 4: Eğer girilen == 1 e pazartesi yazdır
Adım 5: Eğer girilen == 2 salı yazdır
Adım 6: Eğer girilen == 3 se çarşamba yazdır 
Adım 7: Eğer girilen == 4 perşembe yazdır
Adım 8: Eğer girilen == 5 ise cuma yazdır
Adım 9: Eğer girilen == 6 ise cumartesi yazdır 
Adım 10 Değilse pazar yazdır
Adım 11: Bitir
*/
package haftanin_gunleri;
import java.util.Scanner;


public class Haftanin_gunleri {

    // 1 Ve 7 arasında bir tam sayı girilecek,bu tam sayıya göre haftanın ilgili gününü yazdıran program.
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("1 ile 7 Arasında Bir Tam Sayı Giriniz :");
        int girilen = input.nextInt();
        
        if (girilen == 1){
            System.out.println("Pazartesi .");
        }
        else if (girilen == 2) {
            System.out.println("Salı .");
        }
        else if (girilen == 3) {
            System.out.println("Çarşamba .");
        }
        else if (girilen == 4) {
            System.out.println("Perşembe .");
        }
        else if (girilen == 5) {
            System.out.println("Cuma .");
        }
        else if (girilen == 6) {
            System.out.println("Cumartesi .");
        }
        else {
            System.out.println("Pazar .");
        }
        
    }
    
}
