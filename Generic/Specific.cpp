#include<iostream>
using namespace std;


int Addition(int No1,int No2)
{
    int Ans=0;
    Ans=No1+No2;
    return Ans;
}

float Addition(float No1,float No2)
{
    float Ans=0;
    Ans=No1+No2;
    return Ans;
}

int main()
{
    int iValue1=10;
    int iValue2=11;
    int iRet=0;

    iRet=Addition(iValue1,iValue2);

    cout<<"Addition is :"<<iRet<<"\n";

    float iValue3=10.8;
    float iValue4=11.5;
    float fRet=0.0;

    fRet=Addition(iValue3,iValue4);

    cout<<"Addition is :"<<fRet<<"\n";



    return 0;
}