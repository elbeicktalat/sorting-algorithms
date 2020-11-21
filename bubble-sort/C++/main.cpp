#include <iostream>

using namespace std;
#define N 3

int main() {
	
	int nums[N];
	
	cout<<"Enter sum numbers:\n";
	for(int i = 0; i < N; i++)
		cin>>nums[i];
		
	for(int i =0 , size = N; i < size -1; i++)
		for(int j = 0; j < size -1 -i; j++)
			if(nums[j] > nums[j+1]){
				int temp = nums[j];
				nums[j] = nums[j+1];
				nums[j+1] = temp;
			}
			
	cout<<"Array sorted with buuble sort:\n";
	for(int i = 0; i < N; i++)
		cout<<" "<<nums[i];
	
	return 0;
}
