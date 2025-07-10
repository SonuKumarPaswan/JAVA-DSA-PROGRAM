// Revers Array 
#include<iostream>
using namespace std;
   void reverseArray(int num[], int n){
        int start=0;
        int end=n-1;
          while(start < end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
          }
   }
   void printArray(int nums[], int n){
    for(int i=0; i<n; i++){
        cout << nums[i] <<" ";

    }
    cout << endl;
   }
 int main(){
    int arr[5]={2,3,4,5,6};
    reverseArray(arr,5);
     cout << "Revers Array"<< endl;
    printArray(arr , 5);
   
    return 0;

 }