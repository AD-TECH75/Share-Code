// user.js
document.addEventListener('DOMContentLoaded', function() {
    fetch('/files')
        .then(response => response.json())
        .then(files => {
            const fileList = document.getElementById('fileList');
            files.forEach(file => {
                const li = document.createElement('li');
                li.innerHTML = `<a href="/files/${file}" target="_blank">${file}</a>`;
                fileList.appendChild(li);
            });
        });
});
