class hewan {
    warna
    keahlian
    constructor(nama) {
        this.nama = nama
    }
    
    set newColor(color) {
        this.warna = color
    }

    set newSkill(skill) {
        this.keahlian = skill
    }

get detail() {
    return `halo nama saya ${this.nama}, saya berwarna ${this.warna}, dan saya suka ${this.keahlian}.`
}

}

const kucing = new hewan('jaja')
kucing.newColor = 'oren'
kucing.newSkill = 'mengeong'
console.log(kucing.detail)