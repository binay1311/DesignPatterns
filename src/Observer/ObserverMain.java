package Observer;

public class ObserverMain {
    public static void main(String args[]){
        Channel beerbiceps = new Channel();
        Subscriber s1 = new Subscriber("a");
        Subscriber s2 = new Subscriber("b");
        Subscriber s3 = new Subscriber("c");

        beerbiceps.subscribe(s1);
        beerbiceps.subscribe(s2);
        beerbiceps.subscribe(s3);

        s1.subscribeChannel(beerbiceps);
        s2.subscribeChannel(beerbiceps);
        s3.subscribeChannel(beerbiceps);

        beerbiceps.upload("First Podcast");
    }
}
