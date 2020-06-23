#include<iostream>
using namespace std;

int sum(int n)
{
  int sm=0;
  
  while(n!=0)
  {
    sm=sm+n%10;
    n=n/10;
  }
  if(sm>0&&sm<10)
    return sm;
  else
  	return sum(sm);
}
int main()
{
  int n;
  cin>>n;
  cout<<sum(n);
}
