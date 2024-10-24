/*
Предположим, ваша программа предоставляет пользователю возможность отослать письмо одним из 3 возможных способов:
 DHL, E-PostService, Owl. Вам необходимо реализовать один общий метод отправки почты,
 который в качестве параметра получает способ отправки почты. Реализация каждого из способов,
 должна быть выполнена отдельным методом (каждый метод может просто выводить на экран соответствующее сообщения, например,
 в случае DHL, что то типа: «кладу письмо в конверт, клею марку, иду на  почту»). Выбор способа отправки определяется пользователем,
  например через Scanner


 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PostService[] postServices ={
                new DHL(),
                new Email(),
                new Owl()
        };
        System.out.println("Выберите как отправить почту ");
        for (int i = 0; i < postServices.length; i++) {
            System.out.println(i + " " + postServices[i].infoName());
        }
        int select = scanner.nextInt();
        PostService selectGetter = postServices[select];


        selectGetter.sendMail();



    }
}