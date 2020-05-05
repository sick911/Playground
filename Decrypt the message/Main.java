#include <iostream> 
using namespace std; 

int main()
{
	int n1,n2,n3,i=1,sum=0;
	cin>>n1>>n2;
  n3=n1+n2;
	while(i<n3)
	{
		if(n3%i==0)
			sum=sum+i;
		i++; 
	}

	if(sum==n3)
		cout << "They can read the message\n"; 
	else
		cout << "They can't read the message\n";

	return 0;
}