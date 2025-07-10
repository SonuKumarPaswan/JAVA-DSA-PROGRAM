//Given an array. Consist of only 0s,1s and 2  sort without using alo
#include<iostream>
 using namespace std;
 int sortingArray(int num[], int n){
    for(int i=0;i<n; i++){
        for(int j=i+1; j<n; j++){
            if(num[i]>num[j]){
                swap(num[i] , num[j]);
            }
        }
         cout <<" "<< num[i];
    }
    
    return 0;
 }
  int main (){
    int arr[5]={0,4,1,0,1};
   sortingArray(arr,5);
  
    return 0;
  }