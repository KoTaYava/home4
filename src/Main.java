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
        int aktAge = 14;
        if (aktAge <= 5){
            System.out.println("Если возраст ребенка равен " + aktAge + " , то ему нельзя кататься на аттракционе");
        } else if (aktAge < 5 || aktAge > 14 ) {
            System.out.println("Если возраст ребенка равен " + aktAge + " , то ему можно кататься с сопровождением взрослого");
        }else if (aktAge >= 14){
            System.out.println("Если возраст ребенка равен " + aktAge + " , то ему можно кататься без сопровождения взрослого");
        }
        //Задача 6
        int human = 63;
        if (human <= 60){
            System.out.println("В вагоне есть " + (60-human) + " сидяих места и 42 стоячих");
        } else if (human > 60 && human <102) {
            System.out.println("В вагоне заокончились сидячие места и осталось "+ (102- human) + " стоячих мест "  );
        }else {
            System.out.println("Вагон полностью забит");
        }
        //Задача 7
        int one = 1;
        int two = 2;
        int three = 3 ;
        if (one > two){
            System.out.println("Наибольшее число " + one);
        } else if (two > three) {
            System.out.println("Наибольшее число " + two);}
        else  {
            System.out.println("three");// так логичнее, но я не уверен
        }

    }
}