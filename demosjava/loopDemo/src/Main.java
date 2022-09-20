public class Main {

    public static void main(String[] args) {
        //for döngüsü
        int i;
        for( i=1;i<=10;i++){
        System.out.println(i);
        }
        System.out.println("for döngüsü bitti");

        //Döngüyü iki iki arttırır.
        for( i=1;i<=10;i+=2){
            System.out.println(i);
        }
        System.out.println("for döngüsü bitti");
        i=2;
        //while döngüsü
        while(i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("while döngüsü bitti");

        //do-while dönüsü
        int j=1;
        do{
            System.out.println(j);
            j+=2;
        } while(j<10);
        System.out.println("do-while döngüsü bitti");

    }
}
