package Algorithm;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("sdfasdfasdf","");
        map.put("shf","fsdfsad");
        System.out.println(map.toString());

        double a = 11.26;
        int b = 2;

    }

    public static double pow(double base, int exponent){
        if (0 == base){
            return 0;
        }
        if (0 == exponent){
            return 1;
        }
        return  Math.pow(base,exponent);
    }
}

