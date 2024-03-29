import java.util.Random;

public class Martian {
    public String name;
    public static int count;
    private Random rand = new Random();


    public Martian(){
        getRandomName();
        count++;
    }

    public String getRandomName(){
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char letter = letters.charAt(rand.nextInt(letters.length()));
        int number = rand.nextInt(90) + 10;
        this.name = Character.toString(letter) + Integer.toString(number);

        return name;
    }

    public void doSomething(){
        if(count < 5){
            System.out.println(name +" is hiding");
        }else {
            System.out.println("ATTACK");
        }
    }
    public static Martian[] invade(int martians){
        Martian[] invaders = new Martian[martians];

        for (int i = 0; i < invaders.length; i++){
            Martian newMartian = new Martian();
            invaders[i] = newMartian;
        }
        return invaders;
    }
    public static Martian[] invade(){
        Random rand = new Random();
        int num = rand.nextInt(9) + 2;
        Martian[] invaders = new Martian[num];

        for (int i = 0; i < num; i++){
            Martian newMartian = new Martian();
            invaders[i] = newMartian;
            invaders[i].doSomething();
        }
        return invaders;
    }

    @Override
    public String toString(){
        return name + "\\" + count;
    }

}
