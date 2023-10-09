public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 21;
        if (age > 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний ");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он несовершеннолетний ");
        }
        //Задача2
        int t = 12;
        if (t < 5) {
            System.out.println("На улице " + t + " градусов,  нужно надеть шапку");
        } else {
            System.out.println("На улице " + t + " градусов, можно идти без шапки");
        }
        //Задача 3
        int s = 61;
        if (s > 60) {
            System.out.println("Если скорость " + s + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + s + ", то можно ездить спокойно ");
        }
        //Задача 4
        int userAge = 25;
        if (userAge <= 2 || 6 >= userAge){
            System.out.println("Если возраст человека равен " + userAge + " , то ему нужно ходить в детский сад ");
        }else if (userAge <= 7 || 17 >= userAge) {
            System.out.println("Если возраст человека равен " + userAge + " , то ему нужно ходить в школу ");
        }else if (userAge <= 18 || 24 >= userAge){
            System.out.println("Если возраст человека равен " + userAge + " , то ему нужно ходить в университет ");
        }else if (userAge > 24){
            System.out.println("Если возраст человека равен " + userAge + " , то ему нужно ходить на работу ");
        }
        //Задача 5
    }
}