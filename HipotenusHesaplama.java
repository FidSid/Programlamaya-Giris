import javax.utill.Scanner;
public class Hipotenus{
      public static void main(String args[]){
            double birinciKenar, ikinciKenar; //kullanıcının gireceği değerleri tutacak değişkenler tanımlandı
            Scanner giris = new Scanner(System.in); //Console ekranından veri okumak için Scanner sınıfından nesne tanımlandı
            System.out.println("Birinci kenar:"); //Kullanıcıdan istenilen verinin bilgisi ekrana bastırıldı
            birinciKenar = giris.nextDouble(); //Kullanıcının Console ekranından girdiği veri birinciKenar adlı değişkene atandı
            System.out.println("İkinci kenar:"); //Kullanıcıdan istenilen verinin bilgisi ekrana bastırıldı
            ikinciKenar = giris.nextDouble(); //Kullanıcının Console ekranından girdiği veri ikinciKenar adlı değişkene atandı
            System.out.println("Hipotenüs:" + Math.sqrt(birinciKenar * birinciKenar + ikinciKenar * ikinciKenar));/* Math sınıfının 
            sqrt fonksiyonu parametre olarak double türünde değişken alıp karekökünü hesaplayan fonksiyondur. Bu fonksiyon aracılığıyla
            Hipotenüs hesaplanıp Console ekranına bastırılmıştır.*/
      }
}
