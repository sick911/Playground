//C++ Program
//Maximum number of handshakes
#include<iostream>
using namespace std;
//main program
int main()
{
	int p;
	//user input
	cin>>p;
	//find maximum number of handshakes using formula
	int max=p*(p-1)/2;
	//printing output
	cout<<max;
	return 0;
}