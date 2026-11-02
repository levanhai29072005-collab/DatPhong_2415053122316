package vn.edu.ute.datphong.data

import vn.edu.ute.datphong.LoaiPhong

object DuLieuMau {
    val dsLoaiPhong: List<LoaiPhong> = listOf(
        LoaiPhong("P316", "Phòng Standard", 400000L, 2),
        LoaiPhong("P102", "Phòng Superior", 700000L, 3),
        LoaiPhong("P203", "Phòng Deluxe", 1200000L, 4),
        LoaiPhong("P304", "Phòng VIP Suite", 2000000L, 5)
    )
}