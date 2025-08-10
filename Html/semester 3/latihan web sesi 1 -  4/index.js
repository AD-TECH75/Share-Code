const express = require('express')
const app = express()
const port = 7529
const bodyParser = require(`body-parser`)
const db = require('./connection')

// ROUTES UTAMA DENGAN METHOD GET

app.use(bodyParser.json())

app.get('/', (req, res) => {
  db.query("SELECT * FORM mahasiswa", (error, result) => {
    // hasil data dari mysql
    console.log(result)

  })
  res.send('UTAMA')
})

app.get('/hello', (req, res) => {
  console.log({ urlParams: req.query })
  res.send('Hello World!')
})

app.post('/login', (req, res) => {
  console.log({ RequestFromOutside: req.body })
  res.send(`LOGIN BERHASIL!`)
})

app.put(`/username`, (req, res) => {
  console.log({ updateData: req.body })
  res.send(`UPDATE BERHASIL!`)
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})