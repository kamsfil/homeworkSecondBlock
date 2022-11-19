package builder;

public class Main {

    public static void main(String[] args) {

        Human human = new Human.Builder()
                .name("Sasha")
                .build();

        System.out.println(human);

    }



}
