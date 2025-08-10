const nama = "Akaza";
let usia = 10;

let biodata = document.getElementById("biodata");
console.log(biodata);

function generatebiodata() {
    let generasi;

    if(usia > 13 && usia < 20 ) {
        //INI ADALAH KONDISI PERTAMA
        generasi = "generasi remaja";
    }
    else if (usia > 20 && usia < 50) {
        // INI ADALAH KONDISI KEDUA
        generasi = "generasi dewasa";
    }
    else if (usia >= 50 ) {
        // INI ADALAH KONDISI KETIGA
        generasi = "generasi tua";
    }
    else if (usia > 3 && usia < 12) {
        // INI ADALAH  KONDISI KEEMPAT
        generasi = "generasi anak-anak"
    }
    else {
        //INI ADALAH JIKA KONDISI TIDAK TERPENUHI
        generasi = "generasi bayi"
    }

    return biodata.innerHTML = generasi;

}

console.log(nama);
console.log(usia);

generatebiodata();