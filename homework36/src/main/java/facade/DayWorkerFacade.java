package facade;

public class DayWorkerFacade {
    Day day = new Day();
    TimingWork timingWork = new TimingWork();
    Worker worker = new Worker();

    public void statusDay(){
        day.thisDay();
        timingWork.workStart();
        worker.activityNow(timingWork);
    }
}
