//WAP to revers Array 
#include<iostream>
using namespace std;
void reverse(int arr[] , int n){
    int start=0;
    int end =n-1;
    while(start <= end){
        swap(arr[start] , arr[end]);
         start++;
         end--;
    }
    }
    void printArray(int arr[] ,int n)
    {
        for(int i=0; i<n; i++){
            cout << arr[i] <<" ";
        }
    
    cout <<endl;
    }
int main(){
    int crr[6]={3,2,4,5,6,7};
    int brr[5]={1,2,3,4,5};
    reverse(crr,6);
    reverse(brr,5);

    printArray(crr , 6);
    printArray(brr , 5);
    return 0;

}