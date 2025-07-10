//Find minimun and maximum Value in an Array 
#include<iostream>
 using namespace std;
 void displayArray(int num[], int n){
    int max,min;
    for(int i=0; i<n; i++){
        max=num[i];
        min=num[i];
        if(num[i]< max){
            max=num[i];
        }
        if(num[i] < min){
          min=num[i];
    }
 }
    cout << "Maximun value of Array"<< max << endl;
    cout << "Minimum value of Array"<< min<< endl;
 }


  int main(){
    int num[6]={3,4,5,6,2,8};
    displayArray(num,6);
    
    return 0;
  }