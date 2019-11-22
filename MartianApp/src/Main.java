import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        test();

        System.out.println("count: " + Martian.count);
        Martian[] invaders = Martian.invade(13);
        for (int i = 0; i < invaders.length; i++){
            System.out.println(invaders[i]);
        }
        Martian[] unknownInvaders = Martian.invade();
        for (Martian el: unknownInvaders) {
            el.doSomething();

        }


    }

    private static void test() {
        Martian martianOne = new Martian();
        Martian martianTwo = new Martian();
        Martian martianThree = new Martian();
        System.out.println(martianOne.getRandomName());

        Martian[] martian = {martianOne, martianTwo, martianThree};

        for (int i = 0; i < martian.length; i++){
            martian[i].doSomething();
        }
    }

}
