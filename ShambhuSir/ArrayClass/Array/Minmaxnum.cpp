#include<iostream>
  using namespace std;
   int minMaxnum(int arr[] , int n){
    for(int i=0; i<n-1; i++){
        for(int j=i+1; j<n; j++){
            if(arr[i]>arr[j]){
               swap(arr[i] , arr[j]);
            }
        }
    }
    return 0;
   }
   int printArray(int arr[], int n){
    int s=0; 
    int e=n-1;
    cout <<"Mininum element of Array "<< arr[s] <<endl;
    cout <<"Maximum element of Array "<< arr[e] <<endl;
    return 0;
   }
   int main(){
     int arr[5]={3,12,5,1,23};
     minMaxnum(arr , 5);
     printArray(arr ,5);
     return 0;

   }