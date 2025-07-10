#include<iostream>
 using namespace std;
   
   int getMax(int num[] ,int n){
    int max = INT16_MIN;
    for(int i=0; i<n; i++){
        if(num[i]>max){ 
        max = num[i];
        }
    }
    return max;
   }
 int main(){
    int size;
    cin >> size;
    int num[1000];
    for (int i=0; i<size; i++){
        cin >>num[i];

    }
    cout << "Maximum value "<< getMax(num,size) << endl;
    // cout << "Mininum value " << getMin(num , size ) << endl;
 }