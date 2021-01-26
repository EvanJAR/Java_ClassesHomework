public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }

    public int drink(){
        return this.volume - 10;
    }

    public int empty(){
        return 0;
    }

    public int refill(){
        if (this.volume < 100){
            this.volume = 100;
        }
        return this.volume;
    }
}
