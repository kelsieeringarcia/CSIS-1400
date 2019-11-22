public class Main {

    public static void main(String[] args) {
        test();
        Martian[] invaders = Martian.invade(13);
        Martian[] invaders2 = Martian.invade();
        int unknowninvaders = invaders2.length;


        for (int i = 0; i < invaders.length; i++){
            System.out.println(invaders[i]);
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
