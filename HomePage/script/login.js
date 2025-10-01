// Ambil elemen-elemen penting dari DOM
const wrapper = document.querySelector('.wrapper');
const loginLink = document.querySelector('.login-link');
const registerLink = document.querySelector('.register');
const loginForm = document.getElementById('loginForm');
const registerForm = document.getElementById('registerForm');

// Kredensial default untuk login (hardcoded)
const DEFAULT_USERNAME = 'admin';
const DEFAULT_PASSWORD = '12345';

// === Toggle antar form ===
// Saat klik "Sign-Up", tambahkan kelas 'active' → tampilkan form register
registerLink.onclick = () => {
    // Hapus pesan error login jika ada
    const oldError = loginForm.querySelector('.error-msg');
    if (oldError) oldError.remove();

    // Tampilkan form register
    wrapper.classList.add('active');
};

// Saat klik "Login", hapus kelas 'active' → kembali ke form login
loginLink.onclick = () => {
    wrapper.classList.remove('active');
};

// === Handle Login ===
loginForm.addEventListener('submit', function (e) {
    e.preventDefault(); // Cegah reload halaman

    // Ambil nilai input
    const username = document.getElementById('username').value.trim();
    const password = document.getElementById('password').value;

    // Hapus pesan error lama jika ada
    const oldError = loginForm.querySelector('.error-msg');
    if (oldError) oldError.remove();

    // Cek kredensial
    if (username === DEFAULT_USERNAME && password === DEFAULT_PASSWORD) {
        // Jika benar, arahkan ke halaman utama
        window.location.href = 'index.html';
    } else {
        // Jika salah, tampilkan pesan error
        const errorMsg = document.createElement('div');
        errorMsg.className = 'error-msg';
        errorMsg.textContent = 'Username atau password salah!';

        // Sisipkan pesan error di atas link "Sign-Up"
        const loregLink = loginForm.querySelector('.loreg-link');
        if (loregLink) {
            loginForm.insertBefore(errorMsg, loregLink);
        }

        // Animasi muncul perlahan
        setTimeout(() => {
            errorMsg.style.opacity = '1';
        }, 10);
    }
});

// === Handle Register ===
registerForm.addEventListener('submit', function (e) {
    e.preventDefault();

    // Ambil nilai input
    const regUsername = registerForm.querySelector('input[type="text"]').value.trim();
    const regEmail = registerForm.querySelector('input[type="email"]').value.trim();
    const regPassword = registerForm.querySelector('input[type="password"]').value.trim();

    // Validasi sederhana: pastikan tidak kosong
    if (!regUsername || !regEmail || !regPassword) {
        alert('Semua kolom harus diisi!');
        return;
    }

    // Tampilkan notifikasi sukses
    alert('Selamat datang! Akun berhasil dibuat.');

    // Kembali ke form login
    wrapper.classList.remove('active');

    // Reset form register
    registerForm.reset();
});