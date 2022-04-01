package com.hw5;

public class Main
{

    public static void main(String[] args)
    {

///// Задача 1;
        int[] numA = new int[3];
        for (int index = 0; index < numA.length; index++)
        {
            numA[index] = index + 1;
        }
        for (int index = 0; index < numA.length; index++)
        {
            if (index == numA.length - 1)
            {
                System.out.println(numA[index]);
                break;
            }
        System.out.print(numA[index] + " ");


        }
    }
}