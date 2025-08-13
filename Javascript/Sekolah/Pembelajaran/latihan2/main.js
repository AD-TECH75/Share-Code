let text = document.getElementById("text");
let tambah = document.getElementById("tambah");
let kurang = document.getElementById("kurang");

let angka = 0;
text.textContent = angka

function tombol(pencet) {
	if (pencet == "tambah") {
		angka++;
	} else {
		angka--;
	}

	if (angka > 0) {
		kurang.style.display = "inline-block";
	} else {
		kurang.style.display = "none";
	}

	text.textContent = angka;
}
