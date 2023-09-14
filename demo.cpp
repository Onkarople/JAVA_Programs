#include<iostream>

using namespace std;

int main()
{
    int size=0;
    int iCnt=0;

    int Arr[size];


    cout<<"enter thse selemnts\n";
    cin>>size;

    int *ptr = new int[size];


    cout<<"Enter elements \n";
    for(iCnt=0;iCnt<size;iCnt++)
    {
        cin>>Arr[iCnt];
    }

    cout<<"elements are";
    for(iCnt=0;iCnt<size;iCnt++)
    {
        cout<<Arr[iCnt];
    }


    return 0;




    }
