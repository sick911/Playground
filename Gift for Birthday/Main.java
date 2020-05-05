#include<iostream>
using namespace std;
int main()
{
  int year;
  std::cin>>year;
  if(0==year%4)
    std::cout<<year<<" is a leap year";
  else
    std::cout<<year<<" is not a leap year";
  //Type your code here.
}