let btn = document.getElementById("btn");
let lampu = document.getElementById("lampu");

function ganti() {
	const img = document.getElementById("lampu");
	const status = img.dataset.status;

	if (status === "off") {
		img.src = "assets/image/lampuon.gif";
		img.dataset.status = "on";
	} else {
		img.src = "assets/image/lampuoff.gif";
		img.dataset.status = "off";
	}
}

let makan = 20;
let minum = "30";

console.log(minum+makan)
