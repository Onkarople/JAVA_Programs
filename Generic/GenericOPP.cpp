#include<iostream>
using namespace std;

template <class T>

class Arithematic
{ 
    public:
       T no1,no2;


       Arithematic(T a,T b)
       {
           no1=a;
           no2=b;
       }

       T Additon()
       {
           T ans;
           ans=no1+no2;
           return ans;
       }

       T Substraction()
       {
           T ans;
           ans=no1-no2;
           return ans;
       }


};

int main()
{
    int Ret=0;
    Arithematic<int> iobj(10,11);
    Ret=iobj.Additon();
    cout<<"Addition is :"<<Ret<<"\n";

     Arithematic <double> dobj(10.9,11.5);
     double dret=dobj.Additon();
     cout<<"Addition is :"<<dret<<"\n";

    return 0;
}