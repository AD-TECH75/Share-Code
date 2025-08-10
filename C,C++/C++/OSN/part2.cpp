#include <iostream>
using namespace std;

int main()
{
    cout << "es";
    int a=12,b=23,c=45,d=78,x;

    if (a > b)
    {
        if (a > c)
        {
            if (d > a)
            {
                x = d * d;
                cout << "x = d * d;";
            }
            else
            {
                x = a * a;
                cout << "x = a * a;";
            }
        }
        else
        {
            if (d > c)
            {
                x = d * d;
               cout << "x = d * d;";
            }
            else
            {
                x = c * c;
                cout << "x = c * c;";
            }
        }
    }
    else
    {
        if (b > c)
        {
            if (d > b)
            {
                x = d * d;
                cout << "x = d * d;";
            }
            else
            {
                x = b * b;
                cout << "x = b * b;";
            }
        }
        else
        {
            if (d > c)
            {
                x = d * d;
                cout << "x = d X d;222";

            }
            else
            {
                x = c * c;
                cout << "c X C" ;
            }
        }
    }
}