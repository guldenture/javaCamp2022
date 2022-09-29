public class Main {

    public static void main(String[] args) {
      String mesaj ="Bugün hava çok güzel.";
      String yeniMesaj =sehirVer();
      System.out.println(yeniMesaj);
      int sayi=topla(5,7);//2 parametre istemiş topla fonksiyonu bizde onun için iki tane parametre göndermeliyiz.
      System.out.println(sayi);
      int toplam =topla2(2,3,4,5,6,7,8,9);
      System.out.println(toplam);
    }
    //void operasyon

    //void olan bir operasytonları değişkenlere atayamayız.
    //String yeniMesaj=ekle(); gibi bir şey yazamayız hata verir.
    //String yeniMesaj=topla(); gibi bir şeyde yazamayız çünkü bizden string değer istiyor fakat biz int değer atıyoruz.
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void güncelle(){
            System.out.println("Güncellendi");
    }

    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;  //bitir ve sayi1+sayi2 nin toplamını  döndür demek ;
    }

    //istediğimiz kadar sayi toplatmak isterseniz istersek
    public static int topla2(int... sayilar){
     int toplam=0;
     for(int sayi:sayilar){
         toplam += sayi;
     }
     return toplam;
    }

    public static String sehirVer(){
        return "Ankara";
    }
}

