const question = document.getElementById("question")
const answer = document.getElementById("answer")
const loaders = document.getElementById("loaders")
const container = document.getElementsByClassName("container")

let init = 0

const botSay = (data) => {
    return [
        "Halo perkenalkan nama saya Akabot, siapa nama kamu?",
        `halo ${data?.name}, berapa usia kamu?`,
        `ohh ${data?.age}, hobi kamu apa?`,
        `wow sama dong, hobi aku juga suka ${data?.hoby}, btw berapa teman kamu?`,
        `ohhh ${data?.friend}, ya udah kalo gitu, udahan dulu ya!`,
    ]
}

question.innerHTML = botSay()[0]

let userData = []

function botStart() {
    if (answer.value.length < 1) {return alert ("silahkan isi jawabannya dulu")}
    init++
    if (init === 1) {
        botDelay({ name: answer.value })
    } else if (init === 2) {
        botDelay({ age: answer.value })
    } else if (init === 3) {
        botDelay({ hoby: answer.value })
    } else if (init === 4) {
        botDelay({ friend: answer.value })
    } else if (init === 5) {
        finishing()
    } else {
        end()
    }
}

function botDelay(answerUser) {
    loaders.style.display = "block"
    container[0].style.filter = "blur(8px)"
    setTimeout(() => {
        question.innerHTML = botSay(answerUser)[init]
        loaders.style.display = "none"
        container[0].style.filter = "none"
    }, [1000])
    userData.push(answer.value)
    answer.value = ""
}

function finishing() {
    question.innerHTML = `thank you ya ${userData[0]} udah main ke akabot, lain kali kita main ${userData[2]}`
    answer.value = "Siap thanks juga!"
}

function end() {
    alert(`TERIMA KASIH ${userData[0]} sudah berkunjung, anda akan kembali ke halaman utama`)
    window.location.reload()
}