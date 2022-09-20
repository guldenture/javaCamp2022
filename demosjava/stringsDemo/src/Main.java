import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	String mesaj="      Bugün hava çok güzel.       ";
   /* System.out.println(mesaj);
    System.out.println("Eleman sayısı:"+mesaj.length());
    System.out.println("5.eleman:"+mesaj.charAt(4));
    System.out.println(mesaj.concat("Yaşasın!"));
    System.out.println(mesaj.startsWith("A"));//A harfi ile başlarsa true döndürür.
    System.out.println(mesaj.endsWith("."));//cümle . ile bitiyorsa true döndürür.
    char[] karakterler=new char[5];
    mesaj.getChars(0,5,karakterler,0);
    System.out.println(karakterler);
    System.out.println(mesaj.indexOf('a'));//ilk a harfi kaçıncı eleman onu bulmaya yarar.
    System.out.println(mesaj.lastIndexOf('a'));//son a harfi kaçıncı eleman onu bulur.
*/
    String yeniMesaj=mesaj.replace(' ','-');
    System.out.println(yeniMesaj);
    System.out.println(mesaj.substring(2));//cumleyi 2.indexten sonra yazmaya başlar.
    System.out.println(mesaj.substring(2,5));//2.indexten 4.indexe kadar olan harfleri alır.

     for(String kelime :mesaj.split(" "))   {
         System.out.println(kelime);
     }

        System.out.println(mesaj.toLowerCase()); //Bütün harflerini küçük harfe çevirir.
        System.out.println(mesaj.toUpperCase());//Bütün harflerini büyük harfe çevirir.
        System.out.println(mesaj.trim());//cümlenin sonundaki ve başındaki boşlukları atabiliyoruz.


    }
}
