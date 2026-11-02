package vn.edu.ute.datphong.helper

import vn.edu.ute.datphong.data.DuLieuMau
import vn.edu.ute.datphong.model.LoaiPhong

object DatPhongHelper {
    fun timLoaiPhong(ma:String): LoaiPhong? {
        return DuLieuMau.dsLoaiPhong.find { it.ma.equals(ma.trim(), ignoreCase = true) }
    }
}
fun hopLeSoKhach(loai: LoaiPhong, soKhach: Int): Boolean {
    return soKhach in 1..(loai.sucChua + 2)
}
