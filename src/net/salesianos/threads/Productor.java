package net.salesianos.threads;

import java.util.Random;

public class Productor extends Thread {
    Random random = new Random();
    private String vegetables[] = new String[]{"lettuce", "cabbage", "onion", "spinach", "potato", "celery", "asparagus", "radish", "broccoli", "artichoke", "tomato", "cucumber", "eggplant", "carrot", "green bean"};
    private int MAXTIMEGROWTH = 5;
    
    public int growth() {
        int growthTime = random.nextInt(MAXTIMEGROWTH) + 1;
        return growthTime;
    }

    public String randomVegetable() {
        int position = random.nextInt(15) + 1;
        return vegetables[position];
    }

    
}