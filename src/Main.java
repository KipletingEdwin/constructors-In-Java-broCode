//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //   constructor =  special method that is called when an object is instantiated  (created)

        Human human1 = new Human("Edwin", 29, 60);
        Human human2 = new Human("James", 43, 65);



        human2.eat();
        human2.drink();


        human1.eat();
        human1.drink();



    }
}