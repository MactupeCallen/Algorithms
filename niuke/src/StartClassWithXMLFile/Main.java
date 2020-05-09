package StartClassWithXMLFile;

import StartClassWithXMLFile.LoadClass;
public class Main {
    /**
     * 实现通过解析xml文件中的class路径来加载类   
     * @param args
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        LoadClass.printFruit("a","b", "Apple");
    }
}
