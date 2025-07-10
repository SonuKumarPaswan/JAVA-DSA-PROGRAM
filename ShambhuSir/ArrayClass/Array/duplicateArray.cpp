// duplicate Array
#include <iostream>
using namespace std;
int duplicateArray(int nums[], int n)
{
    for (int i = 0; i < n; i++)
    {
        int num = nums[i];
        for (int j = i + 1; j < n; j++)
        {
            if (num == nums[j])
            {
                cout <<num<< " ";
            }
        }
    }
    return 0;
}
int main()
{
    int nums[13] = {2, 4, 2, 4, 5,3,6,7,98,7,6,4,3,};
    duplicateArray(nums, 13);
}
