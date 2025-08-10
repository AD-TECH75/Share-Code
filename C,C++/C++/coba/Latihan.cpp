#include <iostream>
using namespace std;

int main() {
    char nama[20], web_Address[30];
    int usia;

    printf("inputkan nama: ");
    scanf("%s", &nama);

    printf("Inputkan alamat web: ");
    scanf("%s", &web_Address);

    printf("Inputkan usia: ");
    scanf("%i", &usia);

    printf("\n------------------------------\n");
    printf("jadi nama anda: %s\n", nama);
    printf("alamat email anda: %s\n", web_Address);
    printf("dan usia anda: %i\n", usia);
    return 0;
}
