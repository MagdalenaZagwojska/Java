public class StudentTest {
    public static void main(String[] args) {
        HomeworkStudent adam = new HomeworkStudent();
        adam.name = "Adam";
        adam.surname = "Nowak";
        adam.email = "ad@gmail.com";
        adam.index = 545444;
        adam.nick = 111;

        HomeworkStudent kasia = new HomeworkStudent();
        kasia.name = "Kasia";
        kasia.surname = "Kowalska";
        kasia.email = "ka@gmail.com";
        kasia.index = 321321;
        kasia.nick = 222;

        HomeworkStudent basia = new HomeworkStudent();
        basia.name = "Basia";
        basia.surname = "Zebra";
        basia.email = "ba@gmail.com";
        basia.nick = 333;
        basia.index = 54654;

HomeworkStudent[] students = new HomeworkStudent[3];
        students[0] = adam;
        students[1] = kasia;
        students[2] = basia;

        for (int i =0; i< students.length; i++) {
            students[i].info();
            students[i].giveEmail();
            students[i].giveIndex();
            students[i].giveLogin();
        }

    }

    }
