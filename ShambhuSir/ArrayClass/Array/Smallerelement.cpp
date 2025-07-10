//find the "Kth" element in an Array 
#include<iostream>
 using namespace std;
 int smallerElement(int nums[], int n, int k){
      for(int i=0; i<n-1; i++){
        for(int j=i+1; j<n; j++){
            if(nums[i]>nums[j]){
                swap(nums[i] ,nums[j]);
            }
        }
      }
    
    return nums[k-1];
 }
 int largestElement(int num[], int n, int largest)
 {
    for(int i=0; i<n-1; i++){
        for(int j=i+1; j<n; j++){
            if(num[i]>num[j]){
                swap(num[i] ,num[j]);
            }
        }
      }
   
    return  num[n-largest];
 }
  int main(){
    int k;
    cout << "Enter the smaller Index " <<endl;
    cin>> k;
    int largest;
    cout<< "Enter the largest Index "<< endl;
    cin>>largest;
     int arr[6]={7,10,4,3,20,15};
     int smaller=smallerElement(arr ,6 ,k);
     cout<<"Smaller element of Array "<< smaller <<endl;
     int largests=largestElement(arr, 6 ,largest);
      cout<<"Largest element of Array "<< largests ;
     return 0;
  }