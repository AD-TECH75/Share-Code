function hitung(operasi) {
	const a = parseFloat(document.getElementById("nilai1").value);
	const b = parseFloat(document.getElementById("nilai2").value);
	const hasilInput = document.getElementById("hasil");

	if (isNaN(a) || isNaN(b)) {
		hasilInput.value = "Error: Masukkan angka!";
		return;
	}

	let hasil;

	switch (operasi) {
		case "+":
			hasil = a + b;
			break;
		case "-":
			hasil = a - b;
			break;
		case "*":
			hasil = a * b;
			break;
		case "/":
			if (b === 0 || a === 0) {
				hasilInput.value = "Error: Tidak bisa dibagi 0";
				return;
			}
			hasil = a / b;
			break;
		default:
			hasilInput.value = "Operasi tidak dikenal";
			return;
	}

	hasilInput.value = hasil;
}


