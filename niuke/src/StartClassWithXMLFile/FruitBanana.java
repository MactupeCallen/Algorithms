package StartClassWithXMLFile;

@FruitType("Banana")
public class FruitBanana implements Fruit{
    @Override
    public void eat(String frontMsg, String endMsg) {
        System.out.println(frontMsg + "  Banana  " + endMsg);
    }
}
