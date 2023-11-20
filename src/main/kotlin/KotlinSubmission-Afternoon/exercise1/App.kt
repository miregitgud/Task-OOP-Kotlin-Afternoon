package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {

    val namaDepan:String = "Ayyash"
    val namaBelakang:String = "Muhammad Jibril"
    val umur:Number = 20
    val status:Boolean = false

    val statusPrint:String = if (status) {
        "Taken"
    } else {
        "Single"
    }

    println("Perkenalkan! Nama saya adalah $namaDepan $namaBelakang. Saat ini saya berumur " +
            "$umur dan berstatus $statusPrint. ")

}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {

    var members = ""

    for (member in groupMember) {
        members += "$member, "
    }

    println("Kami dari merge Massive $groupId yang terdiri dari $members dari sesi $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {

    val namaMember = listOf("Ayyash Muhammad Jibril", "Muhammad Revanza", "Syarifah Cahyati"
    , "Muhamad Adib Minanurohman", "William Deoscar Sengiyu", "Fathurahman Al Hakim"
    , "Masykur Albanin", "Rachmat Mulandani", "Arsy Putri Salsabila", "Susi Susanti")

    val namaDiri = namaMember[0]

    return listOf(namaDiri)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Ka Jovian", "Ka Imam")
    val countOfGroup = arrayOf<String>("Ayyash Muhammad Jibril", "Muhammad Revanza", "Syarifah Cahyati"
        , "Muhamad Adib Minanurohman", "William Deoscar Sengiyu", "Fathurahman Al Hakim"
        , "Masykur Albanin", "Rachmat Mulandani", "Arsy Putri Salsabila", "Susi Susanti")

    val hitungTotal = mentor.size + countOfGroup.size

    return hitungTotal
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Beta+", listOf("Ayyash Muhammad Jibril", "Muhammad Revanza", "Syarifah Cahyati"
        , "Muhamad Adib Minanurohman", "William Deoscar Sengiyu", "Fathurahman Al Hakim"
        , "Masykur Albanin", "Rachmat Mulandani", "Arsy Putri Salsabila", "Susi Susanti"), "Afternoon")

}