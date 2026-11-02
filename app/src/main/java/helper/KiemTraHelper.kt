package vn.edu.ute.datphong.helper

object KiemTraHelper {
    fun kiemTraHoTen(hoTen: String): Boolean {
        val regex = Regex("^[\\p{L}]+( [\\p{L}]+)+$")
        return regex.matches(hoTen.trim())
    }
    fun kiemTraSdt (sdt: String): Boolean {
        val regex = Regex("")
    }
}