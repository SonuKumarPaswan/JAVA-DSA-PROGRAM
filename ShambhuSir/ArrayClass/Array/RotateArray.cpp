#include<iostream>
 using namespace std;
 void rotateArray(int num[] , int n ,int k){
    int temp[n];
    for(int i=0; i<n; i++){
        temp[(i+k)%n]=num[i];
    }
    num = temp;
     cout << " "<< num << endl;
 }
  int main(){
   
    int s;
    cout << "Enter the number "<<endl;
    cin >>s;
     int arr[5]={2,3,4,5,6};
     rotateArray(arr , 5 , s);
   return  0;
  }