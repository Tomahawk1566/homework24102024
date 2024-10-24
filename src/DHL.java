public class DHL implements PostService {
    public String infoName(){
        return "с помощью DHL";
    }

    @Override
    public void sendMail() {
        System.out.println("Пишу письмо");
        System.out.println("Иду на почту");
        System.out.println("Клею марку");
        System.out.println("Отправляю письмо по указаному адресу");
    }
}
