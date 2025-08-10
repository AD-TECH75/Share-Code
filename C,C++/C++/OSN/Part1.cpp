#include <iostream>
using namespace std;

int main () {
    int a,b,c,d,x;
    cin >> a >> b >> c >> d;
    cout << a << b << c << d << endl;

    a = a + a;
    cout << a << endl;
    b = a + b;
    cout << b << endl;
    c = a + b + c;
    cout << c << endl;
    d = a + b + c + d;
    cout << d << endl;
    x = a + b + c + d;
    cout << x;

}