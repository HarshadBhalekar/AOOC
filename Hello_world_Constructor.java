
class Hello_World {

    private Hello_World() {
        System.out.println(" Hello!! World!!");
    }

    public void Dance() {
        System.out.println("Lets Dance!!");
    }

    public static Hello_World getInstance() {
        return new Hello_World(); // Object creation inside a method
    }
}

public class Hello_world_Constructor {

    public static void main(String[] args) {

        Hello_World.getInstance();

    }
}
