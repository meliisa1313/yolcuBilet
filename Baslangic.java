package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {

        // Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        // Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        // Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını
        // hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
        //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

        int yas,select;
        double km,toplamFiyat;
        String yolculukTipi;
        Scanner input=new Scanner(System.in);
        System.out.println("kac km gittiniz");
        km=input.nextDouble();
        System.out.println("yasiniz nedir");
        yas=input.nextInt();
        System.out.println("yolculugunuz tek yon mu yoksa gidis donus mu \n 1-gidis \n 2- gidis donus");
        yolculukTipi=input.nextLine();
        select=input.nextInt();
        if((yas<0)||(km<0)||((select!=1)&&(select!=2))){
            System.out.println("Hatalı Veri Girdiniz !");
        }
        else {
            if (select == 1)
            {
                toplamFiyat = km * 0.1;
                System.out.println("toplam fiyat:" + toplamFiyat);
            } else {
                toplamFiyat = (km * 0.1) * 2;
                System.out.println("gidis donus ucak bileti fiyatiniz:" + toplamFiyat);

            }
            if((yas<12)&&(select==1)){
                toplamFiyat=toplamFiyat/2;
                System.out.println("tek yon sadece gidis olan ucak biletinizin fiyati indiriminiz sadece 12 yas:"+toplamFiyat);

            }
            else if (yas<12)
            {
                toplamFiyat=((toplamFiyat/2)*20)/100;
                System.out.println("cift yonlu indirimli ucak biletiniz indiriminiz hem 12 yas hemde gidis donus"+toplamFiyat);
            }
            //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
            if(((12<yas)&&(yas<24))&&(select==1)){
                toplamFiyat=toplamFiyat*0.1;
                System.out.println("//Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır."+toplamFiyat);

            }
            else if((12<yas)&&(yas<24)){
                toplamFiyat=((toplamFiyat*0.1)*20)/100;
                System.out.println("/Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır ve gidis donus"+toplamFiyat);
            }
            //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
            if ((yas>65)&&(select==1)){
                toplamFiyat=toplamFiyat*0.3;
                System.out.println("indirimli 65 yas tek yonlu biletiniz"+toplamFiyat);
            }
            else if ((yas>65)){
                toplamFiyat=((toplamFiyat*0.3)*20)/100;
                System.out.println("2 kere indirim aldiginiz biletiniz"+toplamFiyat);
            }




             }


    }
}


