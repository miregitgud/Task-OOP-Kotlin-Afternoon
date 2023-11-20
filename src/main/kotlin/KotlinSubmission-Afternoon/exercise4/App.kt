package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    val arrayAngka = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    try {
        val nilai = arrayAngka[15]
        println("Nilai pada indeks 15: $nilai")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Terjadi kesalahan input indeks, indeks yang kamu masukkan adalah: ${e.message}. " +
                "Indeks array angka yang ada hanya sampai 9. Silahkan lakukan input ulang.")
    }

}
