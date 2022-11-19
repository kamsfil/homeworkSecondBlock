package facade;

public class Worker {

    public void activityNow (TimingWork timingWork){
        if(timingWork.isTiming()){
            System.out.println("Worker to work tirelessly...");
        } else {
            System.out.println("Worker lounging...");
        }
    }
}