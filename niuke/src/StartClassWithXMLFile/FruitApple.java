package StartClassWithXMLFile;

@FruitType("Apple")
public class FruitApple implements Fruit{
    @Override
    public void eat(String frontMsg, String endMsg) {
        System.out.println(frontMsg + "  Apple  " + endMsg);
    }
}
