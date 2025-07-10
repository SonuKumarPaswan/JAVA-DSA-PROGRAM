#include<iostream>
 using namespace std;
  int reverseArray(int num[], int n){
    int start=0;
    int end=n-1;
    while(start<=end ){
        // int temp=num[start];
        //  num[start]=num[end];
        //   num[end]=temp;
        swap(num[start] , num[end]);
        start++;
        end--;
    }
    return 0;
  }
  int printArray(int num[] , int n){
     for(int i=0; i<n; i++){
        cout<<num[i]<<" ";

     }
     cout << endl;
     return 0;
  }


  int main(){
    int arr[6]= {1,2,3,4,5,6};
    reverseArray(arr , 6);
    printArray(arr , 6);
    return 0;
  }