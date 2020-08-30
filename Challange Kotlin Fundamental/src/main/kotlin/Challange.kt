import java.awt.SystemColor.menu
import java.util.*
public var input = Scanner(System.`in`);
fun main() {


    print("Nama : ")
    val nama: String? = input.nextLine()

    if (nama.isNullOrEmpty()) {
        println("KOLOM INI WAJIB DIISI")
        main()
    }
    print("Kelas : ")
    val kelas: String = input.nextLine()
    print("No Absen: ")
    val Absen = input.nextInt()
    println("------------------------------")
    menu()
}
fun menu(){
    println ("Pilihlah Bangun Dibawah Ini : ")
    println("1. Kerucut\n2. Tabung\n ")
    print("Pilih Bangun : ")
    val pill:Int? = input.nextInt()
    when (pill) {
        1 -> kerucut()
        2 -> tabung()
        else -> {
            println("Point is not available")
            menu()
        }
    }
}
fun kerucut() {
    println("------------------------------");
    println("VOLUME KERUCUT")
    println("------------------------------");
    print("Masukan tinggi kerucut : ");
    val tinggi: Double = input.nextDouble();
    print("Masukan jari-jari kerucut : ");
    val jari: Double = input.nextDouble();

    val v: Double = (0.33333) * Math.PI * (jari * jari) * tinggi;

    print("Volume kerucut : ");
    System.out.printf("%.2f", v);
    println()
    println("------------------------------");
    menu()

}
fun tabung() {
    println("------------------------------");
    println("VOLUME TABUNG")
    println("------------------------------");
    print("Masukan tinggi tabung : ");
    var tinggi: Double? = null
    tinggi = input.nextDouble();
    print("Masukan jari-jari tabung : ");
    var jari: Double? = null
    jari = input.nextDouble();
    val v = Math.PI * jari * jari * tinggi;

    print("Volume tabung : ")
    System.out.printf("%.2f", v);
    println()



}