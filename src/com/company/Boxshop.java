package com.company;

public class Boxshop
{
    public static void main(String[] args)
    {
        Box b1 = new Box(3,5,6);
        Box b2 = new Box(4.5,7.6,56);
        Box b3 = new Box(6,3,5);
        String str = b1.toString();
        System.out.println(str);

        double box_length = b1.getLength();
        System.out.println("The length of b1 is:");
    }
}
