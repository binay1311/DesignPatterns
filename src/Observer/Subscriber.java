package Observer;

public class Subscriber {
    String name;
    Channel channel = new Channel();

    public Subscriber(String name){
        this.name = name;
    }

    public void update(){
        System.out.println("Hey " + name + ", Video uploaded : " + channel.title);
    }

    public void subscribeChannel(Channel ch){
        channel = ch;
    }
}
