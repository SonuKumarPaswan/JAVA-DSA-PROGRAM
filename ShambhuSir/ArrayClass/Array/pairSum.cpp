//Pair sum 
#include<iostream>
using namespace std;
int pairSum(int num[],int n,int key){
    int no=key;
    for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            int element =num[i]+num[j];
            if(element==no)
            {
                return element;
            }
           
            }
        }
    }
  

 int main(){
    int num[8]= {1,3,5,6,7,8,9,11};
    int key=7;
    pairSum(num , 8);
 
 }