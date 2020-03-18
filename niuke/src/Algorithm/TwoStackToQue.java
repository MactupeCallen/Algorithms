package Algorithm;

import java.util.Stack;

/**
 *@Auther:Mactupe
 *@Date:2020/3/18-11:54
 *@Description:用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */

//                 --————————————————    ————————————————————--
//        push()       stack1        ｜ ｜       stack2           pop()
//                 --————————————————    ————————————————————--
public class TwoStackToQue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public static void main(String[] args) {
        //初始化
        TwoStackToQue t = new TwoStackToQue();
        System.out.print("stack1中的元素为 ");
        for (int i = 1; i < 11; i++){
            t.stack1.push(i);
            System.out.print(" " + i);
        }
        System.out.println("");
        System.out.print("stack2中的元素为 ");
        for (int j = 21; j < 31; j++){
            t.stack2.push(j);
            System.out.print(" " + j);
        }


        System.out.println("");
        int index = 82;
        System.out.println("插入元素为" + index);
        t.stack1.push(index);

        System.out.println("取出元素为" + t.pop());

        outPutResult(t.stack1, t.stack2);
    }

    public static void outPutResult(Stack<Integer> stackOut1, Stack<Integer> stackOut2){
        System.out.print("stack1中的元素为 ");
        Stack<Integer> stackTemp = stackOut1;
        int stack1OverPush = stackOut1.size();
        Stack<Integer> stackOut = new Stack<Integer>();
        for (int i = 0; i < stack1OverPush; i++){
            int stack1Pop = stackTemp.pop();
            System.out.print(stack1Pop + " ");
            stackOut.push(stack1Pop);
        }
        stackOut.clear();
        stackTemp.clear();
        System.out.println("");

        System.out.print("stack2中的元素为 ");
        stackTemp = stackOut2;
        int stack2OverPush = stackOut2.size();
        for (int j = 0; j < stack2OverPush; j++){
            int stack2Pop = stackTemp.pop();
            System.out.print(stack2Pop + " ");
            stackOut.push(stack2Pop);
        }
    }

    public void push(int node) {
        stack1.push(node);
    }

    //将stack1中的最底层元素转移到satck2中的最底层元素，将satck2的其他元素放置在转移元素之上。
    public int pop() {
        //将stack1和stack2都反转存储在两个新的stack中
        Stack<Integer> stackTemp1 = new Stack<Integer>();
        int stack1Size = stack1.size();
        int stack2Size = stack2.size();
        for (int i = 0; i < stack1Size; i++) {
            stackTemp1.push(stack1.pop());
        }
        Stack<Integer> stackTemp2 = new Stack<Integer>();
        for (int j = 0; j < stack2Size; j++){
            stackTemp2.push(stack2.pop());
        }

        //将原有的stack1，2都清空
        stack1.clear();
        stack2.clear();

        //将stack1中的最底层元素（stacklTemp1的最顶层元素） 转移到stack2的最底层元素
        stackTemp2.push(stackTemp1.pop());
        //将剩余的元素反转存入之前的stack1，2中。
        int stack1TempSize = stackTemp1.size();
        int stack2TempSize = stackTemp2.size();
        for (int m = 0; m< stack1TempSize; m++){
            stack1.push(stackTemp1.pop());
        }
        for (int k = 0; k < stack2TempSize; k++){
            stack2.push(stackTemp2.pop());
        }
        return stack2.pop();
    }
}
