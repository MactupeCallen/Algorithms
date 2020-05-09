package StartClassWithXMLFile;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.NodeType;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashMap;

public class LoadClass {

    public static final HashMap<String, Class<?>> TypesMap = new HashMap<String, Class<?>>();

    /**
     * 初始化类时。加载xml文件，读取文件中的类classMap，然后根据子类的注解，选择相应的子类加载。
     */
    static {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(LoadClass.class.getResourceAsStream("LoadXML.xml"));
            NodeList nodeList = document.getElementsByTagName("classMap");
            for (int i=0; i<nodeList.getLength(); i++){
                Node node = nodeList.item(i);
                String nodeContent = getNodeContent(node);
                System.out.println(nodeContent);
                getClasses(nodeContent);
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        
    }

    /**
     * 得到xml文件中Node节点的文字信息
     * @param node
     * @return Node节点的文字信息
     */
    private static String  getNodeContent(Node node) {
        String returnString = null;
        NodeList nodeListChildrens = node.getChildNodes();
        for (int j=0; j<nodeListChildrens.getLength(); j++){
            Node nodeChild = nodeListChildrens.item(j);
            if (nodeChild.getNodeType() == Node.TEXT_NODE){
                return nodeChild.getNodeValue();
            }
        }
        return null;
    }

    public static void getClasses(String nodeContent) throws ClassNotFoundException {
        Class<?> className = Class.forName(nodeContent);
        if (className.isAnnotation() || className.isInterface() || !isInstanceClass(className, Fruit.class)){
            return;
        }
        FruitType fruitType = className.getAnnotation(FruitType.class);
        if (fruitType != null){
            for(String childType : fruitType.value()){
                TypesMap.put(childType, className);
            }
        }
    }

    /**
     * 判断cls类是否为interClass接口继承类
     * @param1 cls
     * @param2 interClass
     * @return boolean
     */
    public static boolean isInstanceClass(Class<?> cls, Class<?> interClass){
        for (Class<?> inClass : cls.getInterfaces()){
            if (inClass == interClass){
                return true;
            }
        }
        return false;
    }

    public static void printFruit(String frontMsg, String endString, String fruitType) throws IllegalAccessException, InstantiationException {
        System.out.println(frontMsg + "**sadfasdfasdf**" + endString);
        Fruit fruit = null;
        fruit = (Fruit)TypesMap.get(fruitType).newInstance();
        fruit.eat(frontMsg, endString);
    }
}
