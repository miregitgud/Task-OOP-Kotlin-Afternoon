package id.infinitelearning.KotlinSubmission.exercise3

fun main() {

    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */

    // Buat di bawah sini

    var nilai = 30
    var hasil = ""


    if (nilai in 90..100) {
        hasil = "Selamat! Anda mendapatkan nilai A."
    } else if (nilai in 80..89) {
        hasil = "Anda mendapatkan nilai B."
    } else if (nilai in 70..79) {
        hasil = "Anda mendapatkan nilai C."
    } else if (nilai in 60..69) {
        hasil = "Anda mendapatkan nilai D."
    } else if (nilai in 0 .. 60) {
        hasil = "Anda mendapatkan nilai E."
    } else {
        hasil = "Nilai tidak valid."
    }

    println("$hasil")

}