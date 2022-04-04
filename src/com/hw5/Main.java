package com.hw5;

import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {

///// Задача 1.1 & 3 & 4;
        int[] numA = new int[3];
        for (int index = 0; index < numA.length; index++)
        {
            numA[index] = index + 1;
            while (numA[index] % 2 != 0)
            {
                numA[index]++;
            }

                    if (index == numA.length - 1)
                    {
                        System.out.println(numA[index]);
                        break;
                    }
                System.out.print(numA[index] + ", ");
                }
                for (int index = numA.length - 1; index >= 0; index--)
                {
                    if ( index == 0)
                    {
                        System.out.println(numA[index]);
                        break;
                    }
                System.out.print(numA[index] + ", ");
                }


 ///// Задача 1.2 & 3;
        float [] numB = {1.57f, 7.654f, 9.986f};
                for ( int index = 0; index < numB.length; index++)
                {   if ( index == numB.length - 1)
                        {
                            System.out.println(numB[index] + " ");
                            break;
                        }
                System.out.print(numB[index] + ", ");
                }


                for (int index = numB.length - 1; index >= 0; index--)
                {
                    if ( index == 0)
                    {
                        System.out.println(numB[index]);
                        break;
                    }
                System.out.print(numB[index] + ", ");
                }





///// Задача 1.3 & 3;
        float[] numC = new float[15];
                for (int index = 0; index < numC.length; index++)
                {
                    numC[index] = (float) (Math.random()* 10 );
                    if ( index == numC.length -1 )
                    {
                        System.out.println(numC[index]+ " ");
                        break;
                    }
                System.out.print(numC[index] + ", ");
                }
                for (int index = numC.length - 1; index >= 0; index--)
                {
                    if ( index == 0)
                    {
                        System.out.println(numC[index]);
                        break;
                    }
                System.out.print(numC[index] + ", ");
                }

///// Задача 2;

        System.out.println(Arrays.toString(numA));
        System.out.println(Arrays.toString(numB));
        System.out.println(Arrays.toString(numC));










    }
}