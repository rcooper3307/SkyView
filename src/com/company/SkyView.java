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
        for (int i = startRow; i <= endRow; i++)
        {
            for(int j = startCol; j <= endCol; j++)
            {
                sum = sum + view[i][j];
            }
        }


    }

}
