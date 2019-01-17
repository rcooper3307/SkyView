package com.company;

public class SkyView
{
    double[][] view;
    public SkyView(int intRows, int intColumns, double[] scanned)
    {
         view = new double[intRows][intColumns];
         int viewInt = 0;
        for (int i = 0; i < intRows; i++)
        {
                for (int j = 0; j < intColumns; j++)
                {
                    if (i % 2 == 0)
                    {
                        view[i][j] = scanned[viewInt];
                    }
                    else
                        {
                            view[i][intColumns - j - 1] = scanned[viewInt];
                        }
                        viewInt++;
                }
        }
    }
    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double sum = 0;
        double count = 0;
        for (int i = startRow; i <= endRow; i++)
        {
            for(int j = startCol; j <= endCol; j++)
            {
                sum = sum + view[i][j];
                count = count + 1;
            }
        }
        return sum/count;
    }
    public String toString()
    {
        String temp = "";
        for(int i = 0; i < view.length; i++)
        {
            for(int  j = 0; j < view[i].length; j++)
            {
                temp = temp + view[i][j] + " ";
            }
            temp = temp + "\n";
        }
        return temp;
    }

}
