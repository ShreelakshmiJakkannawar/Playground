#include<iostream>
using namespace std;
int gcd(int a,int b)
{
  if(b!=0)
    return gcd(b,a%b);
  else
    return a;
}
int main()
{
  //Type your code here.
  int a,b;
  cin>>a;
  cin>>b;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
}