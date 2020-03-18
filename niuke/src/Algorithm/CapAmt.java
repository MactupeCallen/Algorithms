package Algorithm;

import java.util.HashMap;

public class CapAmt {

    public static void main(String[] args) {
//        String amtString = capsAmt("5532222");
////		String amString = capsAmt("22210000");
//        System.out.println(amtString);
//		System.out.println(amString);
        HashMap<String,String> result = partAmt("5502267072");
        System.out.println(result);
        System.out.println("总金额为：" + result.get("亿") + "亿" + result.get("千万") + "千"
                + result.get("百万") + "百" + result.get("十万") + "十" + result.get("万") + "万"
                + result.get("千") + "千" + result.get("百") + "百" + result.get("十") + "十"+ result.get("个") + "元");
    }

    public static String capsAmt(String amt){
        if("".equals(amt)||amt==null){
            return "";
        }
        double n=Double.valueOf(amt);
        String fraction[] = {"角", "分"};
        String digit[] = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String unit[][] = {{"元", "万", "亿"}, {"", "拾", "佰", "仟"}};
        String head = n < 0 ? "负" : "";
        n = Math.abs(n);
        String s = "";
        for (int i = 0; i < fraction.length; i++) {
            s += (digit[(int) (Math.floor(n * 10 * Math.pow(10, i)) % 10)] + fraction[i]).replaceAll("(零.)+", "");
        }
        if (s.length() < 1) {
            s = "整";
        }
        System.out.println("fsda   " + s);
        int integerPart = (int) Math.floor(n);
        for (int i = 0; i < unit[0].length && integerPart > 0; i++) {
            String p = "";
            for (int j = 0; j < unit[1].length && n > 0; j++) {
                p = digit[integerPart % 10] + unit[1][j] + p;
                integerPart = integerPart / 10;
            }
            s = p.replaceAll("(零.)*零$", "").replaceAll("^$", "零") + unit[0][i] + s;
        }
        return head + s.replaceAll("(零.)*零元", "元").replaceFirst("(零.)+", "").replaceAll("(零.)+", "零").replaceAll("^整$", "零元整");
    }

    /**
     * 将输入字段通过单位分隔开，输出为一个map
     */
    public static HashMap<String, String> partAmt(String amt){
        HashMap<String, String> returnMap = new HashMap<String, String>();
        //非空判断
        if ("".equals(amt)||amt==null) {
            return returnMap;
        }
        //定义备选汉字
        String digit[] = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        //将输入字符串反转
        char amtChar[] = amt.toCharArray();
        String amtString[] = new String[amtChar.length];
        for(int i = 0;i < amtChar.length; i++){
            amtString[i] = String.valueOf(amtChar[amtChar.length - i-1]);
        }
        //将字符结果对应值输入map中
        returnMap.put("个",amtString.length > 1 ? digit[new Integer(amtString[0])] : "");
        returnMap.put("十",amtString.length > 2 ? digit[new Integer(amtString[1])] : "");
        returnMap.put("百",amtString.length > 3 ? digit[new Integer(amtString[2])] : "");
        returnMap.put("千",amtString.length > 4 ? digit[new Integer(amtString[3])] : "");
        returnMap.put("万",amtString.length > 5 ? digit[new Integer(amtString[4])] : "");
        returnMap.put("十万",amtString.length > 6 ? digit[new Integer(amtString[5])] : "");
        returnMap.put("百万",amtString.length > 7 ? digit[new Integer(amtString[6])] : "");
        returnMap.put("千万",amtString.length > 8 ? digit[new Integer(amtString[7])] : "");
        returnMap.put("亿",amtString.length > 9 ? digit[new Integer(amtString[8])] : "");
        return returnMap;
    }
}


//sdjflkasjdf
   