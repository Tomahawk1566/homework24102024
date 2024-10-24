public class Owl implements PostService {
    public String infoName(){
        return "совой";
    }

    @Override
    public void sendMail() {
        System.out.println("Пишу письмо");
        System.out.println("Кладу в конверт");
        System.out.println("Цепляю письмо на лапку сове");
        System.out.println("Отпускаю сову в полет");
    }
}
