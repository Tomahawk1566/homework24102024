public class Email implements PostService {
    public String infoName(){
    return "через емейл";
    }

    @Override
    public void sendMail() {
        System.out.println("Открываю браузер");
        System.out.println("Пишу письмо");
        System.out.println("Отправляю по указаному емейлу");
    }
}
