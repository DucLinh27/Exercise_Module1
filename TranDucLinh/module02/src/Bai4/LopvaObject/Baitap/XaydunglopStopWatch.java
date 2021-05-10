package Bai4.LopvaObject.Baitap;

public class XaydunglopStopWatch {
    private int startTime;
    private int endTime;

    public XaydunglopStopWatch() {
    }

    public XaydunglopStopWatch(int startTime) {
        this.startTime = startTime;
    }

    public int getStartTime() {

        return startTime;
    }

    public void setStartTime(int startTime) {

        this.startTime = startTime;
    }

    public int getEndTime() {

        return endTime;
    }

    public void setEndTime(int endTime) {

        this.endTime = endTime;
    }
    public int start(){
        System.out.println(java.time.LocalTime.now());
        return this.getStartTime();
    }
    public int stop(){
        return this.getEndTime();
    }
    public int getElapsedTime(){
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        XaydunglopStopWatch watch = new XaydunglopStopWatch();
        watch.getStartTime();
        watch.getEndTime();
        watch.start();
        watch.stop();
        watch.getElapsedTime();
        System.out.println(watch.start() + watch.stop() + watch.getElapsedTime() +" "+ "milisecond");
        System.out.println(java.time.Clock.systemUTC().instant());
    }

}
