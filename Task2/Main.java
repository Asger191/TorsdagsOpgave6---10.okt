package Task2;

public class Main {
    public static void main(String[] args) {

        Cafe asgersCafe = new Cafe();

        asgersCafe.loadMenuData();


        for(String s : asgersCafe.getCoffeeMenu()){
            System.out.println(s);
        }
    }

}
