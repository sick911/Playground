#include<iostream>
int main()
{
  int a, dollar,cents,d1,rem,total,a1,b ,b1;
  std::cin>>a>>a1>>b>>b1;
  dollar= a+b;
  cents = a1+b1;
  rem= cents%100;
  d1=cents/100;
  total= int(dollar+d1);
  std::cout<<total<<"\n"<<rem;
}