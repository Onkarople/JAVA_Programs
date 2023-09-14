#include<iostream>
using namespace std;

template <class T>
T Addition(T No1,T No2)
{
    T Ans=0;
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

    
    double d1 =17.8;
    double d2 =19.5;
    double dRet=0.0;

    dRet=Addition(d1,d2);

    cout<<"Addition is :"<<dRet<<"\n";



    return 0;
}