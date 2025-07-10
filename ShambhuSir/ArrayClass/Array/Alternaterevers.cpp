#include <iostream>
using namespace std;
void reversArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        if (i + 1 < n)
        {
             swap(arr[i] ,arr[i+1]);
         
        }
        cout <<arr[i];  
    }
}
// void printArray(int arr[], int n)
// {
//     for (int i = 0; i < n; i++)
//     {
//         cout << arr[i] << " ";
//     }
//     cout << endl;
// }
int main()
{
    int arr[8] = {1,2,3,4,5,6,7,8};
    reversArray(arr, 8);
    // printArray(arr, 8);
   
 
}