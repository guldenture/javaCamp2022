public class Main {

    public static void main(String[] args) {
	char harf='B';
    switch (harf){
        case'A':
        case'E':
        case'I':
        case'O':
        case'U':
            System.out.println("Kalın sesli harf");
            break;
        default:
            System.out.println("İnce sesli harftir");
    }

    }
}
