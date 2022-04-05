package com.company;

import sun.security.util.Length;

public class Box
{
       double length;
       double width;
       double height;

    public Box(double length, double width, double height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double getLength()
    {
        return length;
    }
    public double getHeight()
    {
        return height;
    }
    public double getWidth()
    {
        return width;
    }
    public double getVolume()
    {
        return this.length * this.height * this.width;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }
    public String toString()
    {
        return "Length:"+ this.length + " Width:" + this.width + " Height: " + this.height;
    }
}
