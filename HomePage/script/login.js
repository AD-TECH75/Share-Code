const wrapper = document.querySelector('.wrapper');
const login = document.querySelector('.login-link');
const register = document.querySelector('.register');

register.onclick = () => {
    wrapper.classList.add('active');
}

login.onclick = () => {
    wrapper.classList.remove('active');
}