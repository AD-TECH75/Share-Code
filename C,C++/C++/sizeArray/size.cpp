#include <iostream>
using namespace std;

int main()
{
    int number[] = {8,100,4,3,70,45,33};
    int i;
    int lenght = sizeof(number) / sizeof(number[0]);
    int min = number[0];

    for (int i = 0; i < lenght; i++)
    {
        if (min > number[i])
        {
            min = number[i];
        }
    }

    cout << min;
}