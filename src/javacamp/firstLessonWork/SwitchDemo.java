package firstLessonWork;

public class SwitchDemo {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A':

                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;

            case 'D':
                System.out.println("Fena değil : Geçtiniz");
                break;

            case 'F':
                System.out.println("Hay aksi! Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");

        }
    }
}
