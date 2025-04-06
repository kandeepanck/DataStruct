package test;

import implementaion.StackLL;

public class StackLLrun {
    public static void main(String[] args) {

        implementaion.StackLL stack = new StackLL();
        stack.Push(10);

        System.out.println("top :"+stack.Top());
        System.out.println("size 1:" + stack.Size());
        stack.Push(0);
        System.out.println("top :"+stack.Top());

        stack.Push(5);
        System.out.println("size 2:" + stack.Size());
        System.out.println("top :"+stack.Top());
        stack.Pop();

        System.out.println("top :"+stack.Top());
        System.out.println("size 3:" + stack.Size());

    }
}
