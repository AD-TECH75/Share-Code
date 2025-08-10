#include <iostream>
#include <string>
using namespace std;

struct pekerjaan {
    string nama, pekerjaan, email;
};

pekerjaan data[] = {
    {"eka", "programmer", "eka@gmail.com"},
    {"putra", "petani", "putra@gmail.com"},
    {"putri", "dokter", "putri@gmail.com"}
};

void dataDiri() {
    for (int i = 0; i < 3 ; i++){
        cout << "nama: " << data[i].nama << ", email: " << data[i].email << endl;
    }
}

int main() {
    dataDiri();
}