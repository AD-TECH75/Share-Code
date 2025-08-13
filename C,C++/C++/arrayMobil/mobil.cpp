#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector <string> cars = {"bmw", "mazda", "toyota", "lexus", "volvo", "tesla", "ferrari", "honda", "subaru", "lamborghini"};
    cars.push_back("gwm");

    cout << "berikut adalah nama mobil yang cukup terkenal" << endl;

    // for i
    for (int i = 0; i < 10; i++) {
        cout << "mobil ke " << i + 1 << " adalah " << cars[i] << endl;
    }

    // foreach
    for (string mobil : cars) {
        cout << mobil << endl;
    }
}
