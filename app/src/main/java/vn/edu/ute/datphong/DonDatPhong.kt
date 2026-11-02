package vn.edu.ute.datphong


import java.io.Serializable
data class DonDatPhong(
    val hoTen: String,
    val sdt: String,
    val email: String,
    val maLoaiPhong: String,
    val ngayNhan: String,
    val soDem: Int,
    val soKhach: Int,
    val ghiChu: String = ""
) : Serializable {
    fun tomTat(): String = "$hoTen - $maLoaiPhong - $ngayNhan - $soDem dem"
}