#include<iostream>
#include<stdio.h>

int main()
{
    int row0[4] = { 1,2,3,4 };
    int row1[2] = { 5,6 };
    int* jagged[2] = { row0,row1 };
    int k=0;
    int Size[] = { 4,2 };
    for (int i = 0; i < 2; i++)
    {
        int* ptr = jagged[i];
        for (int j = 0; j < Size[k]; j++)
        {
            printf("%d\n",*ptr);
            ptr++;
        }
        
        k++;
        jagged[i]++;
    }
    return 0;
}