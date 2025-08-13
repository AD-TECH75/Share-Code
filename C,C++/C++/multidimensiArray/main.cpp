#include <iostream>
using namespace std;

int main() {
    string data[2][2] = {
        {"yesa", "mojoagung"},
        {"aisha", "kedung Lumpang"}
    };
    
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            cout << data[i][j] << " ";
        }
        cout << endl ;
    }
}