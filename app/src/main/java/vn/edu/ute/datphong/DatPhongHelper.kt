package vn.edu.ute.datphong.helper

import vn.edu.ute.datphong.data.DuLieuMau
import vn.edu.ute.datphong.model.LoaiPhong

object DatPhongHelper {
    fun timLoaiPhong(ma:String): LoaiPhong? {
        return DuLieuMau.dsLoaiPhong.find { it.ma.equals(ma.trim(), ignoreCase = true) }
    }

fun hopLeSoKhach(loai: LoaiPhong, soKhach: Int): Boolean {
    return soKhach in 1..(loai.sucChua + 2)
}
fun tinhTienPhong_2415053122316(loai: LoaiPhong, soDem: Int, soKhach: Int): Long {
    if (soDem < 1 || !hopLeSoKhach(loai, soKhach)) return 0L
    val tienPhongGoc = loai.giaMotDem * soDem
    val tienPhong = if (soDem >= 4) tienPhongGoc * 90 / 100 else tienPhongGoc
    val soKhachVuot = if (soKhach > Loai.sucChua) soKhach - loai.sucChua else 0
    val PhuThu = soKhachVuot.toLong()*150000L* soDem
    return TienPhong + 
}