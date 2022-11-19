package prototype;

public class ControlNewObject {
    public static void main(String[] args) {

        Human originalHunan = new Human("Sasha",11,"Vasilenko");
        System.out.println(originalHunan);

        Human copyHuman = (Human) originalHunan.copy();
        System.out.println(copyHuman);

    }
}
