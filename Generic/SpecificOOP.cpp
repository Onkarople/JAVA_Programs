#include<iostream>
using namespace std;


class Arithematic
{ 
    public:
       int no1,no2;


       Arithematic(int a,int b)
       {
           no1=a;
           no2=b;
       }

       int Additon()
       {
           int ans=0;
           ans=no1+no2;
           return ans;
       }

       int Substraction()
       {
           int ans=0;
           ans=no1-no2;
           return ans;
       }


};

int main()
{
    int Ret=0;
    Arithematic obj(10,11);
    

    Ret=obj.Additon();

    cout<<"Addition is :"<<Ret<<"\n";



    return 0;
}