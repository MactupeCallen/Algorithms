package StartClassWithXMLFile;

@FruitType("Orange")
public class FruitOrange implements Fruit{
    @Override
    public void eat(String frontMsg, String endMsg) {
        System.out.println(frontMsg + "  Orange  " + endMsg);
    }
}
