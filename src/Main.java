import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sıcaklık;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sıcaklık Değerini Giriniz: ");
        sıcaklık =inp.nextInt();

        if(sıcaklık < 5){
            System.out.println("Kayak yapmanızı tavsiye ederim");
        }
        else if(sıcaklık >=5  &&  sıcaklık <= 25) {
            if (sıcaklık <= 15)
                System.out.println("Sinemaya gitmenizi tavsiye ederim");
            if (sıcaklık >= 10) {
                System.out.println("Pikniz yapmanızı tavsiye ederim");
            }
        }
        else if (sıcaklık >= 25  && sıcaklık < 35){
            System.out.println("Yüzme yapmanızı tavsiye ederim");
        }
        else {
            System.out.println("Evde Kalmanızı tavsiye ederim");
        }

    }
}