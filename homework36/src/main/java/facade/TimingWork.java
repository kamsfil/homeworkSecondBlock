package facade;

public class TimingWork {
    private boolean timing;

    public boolean isTiming() {
        return timing;
    }

    public void workStart (){
        System.out.println("Human working...");
        timing = true;
    }

    public void workStop (){
        System.out.println("Human is relax...");
        timing = false;
    }

}
