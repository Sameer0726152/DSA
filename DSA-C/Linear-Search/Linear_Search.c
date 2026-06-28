#include<stdio.h>
#include<stdbool.h>
int main()
{
int target = 2;
bool found = false;
int arr[] = {1, 4, 7, 3, 9, 5, 2, 8};
int len = sizeof(arr) / sizeof(arr[0]);
for(int i = 0; i < len; i++)
{
    if(target == arr[i])
    {
        printf("Target found at index: %d\n", i);
        found = true;
    }
}
if(found == false)
{
printf("Element not in array\n");
}
getchar();
return 0;
}