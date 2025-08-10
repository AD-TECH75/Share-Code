// server.js
const express = require('express');
const path = require('path');
const fs = require('fs');
const multer = require('multer');
const bodyParser = require('body-parser');
const app = express();

const upload = multer({ dest: 'uploads/' });

app.use(express.static('public'));
app.use(bodyParser.urlencoded({ extended: true }));

// Simulate users and files for demo purposes
const users = {
    admin: { password: 'admin', role: 'admin' },
    user: { password: 'user', role: 'user' },
};

const files = [];

app.post('/login', (req, res) => {
    const { username, password } = req.body;
    if (users[username] && users[username].password === password) {
        res.redirect(`/dashboard/${users[username].role}`);
    } else {
        res.status(401).send('Invalid username or password');
    }
});

app.get('/dashboard/:role', (req, res) => {
    const { role } = req.params;
    if (role === 'admin') {
        res.sendFile(path.join(__dirname, 'public', 'admin.html'));
    } else if (role === 'user') {
        res.sendFile(path.join(__dirname, 'public', 'user.html'));
    } else {
        res.status(404).send('Not Found');
    }
});

app.post('/upload', upload.single('file'), (req, res) => {
    const file = req.file;
    files.push(file.filename);
    res.redirect('/dashboard/admin');
});

app.post('/upload-url', (req, res) => {
    const { url } = req.body;
    const fileName = path.basename(url);
    files.push(fileName);
    res.redirect('/dashboard/admin');
});

app.get('/files', (req, res) => {
    res.json(files);
});

app.get('/files/:filename', (req, res) => {
    const { filename } = req.params;
    const filePath = path.join(__dirname, 'uploads', filename);
    res.sendFile(filePath);
});

app.listen(3000, () => {
    console.log('Server running on http://localhost:3000');
});
