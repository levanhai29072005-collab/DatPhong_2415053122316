package vn.edu.ute.datphong

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import vn.edu.ute.datphong.data.DuLieuMau
import vn.edu.ute.datphong.helper.DatPhongHelper

class DatPhongActivity : AppCompatActivity() {
    private var loaiPhongHienTai: LoaiPhong = DuLieuMau.dsLoaiPhong[0]
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dat_phong)
        val txtLoaiPhong = findViewById<TextView>(R.id.txtLoaiPhong)
        val txtTamTinh = findViewById<TextView>(R.id.txtTamTinh)
        val tilHoTen = findViewById<TextInputLayout>(R.id.tilHoTen)
        val edtHoTen = findViewById<TextInputEditText>(R.id.edtHoTen)
        val tilSdt = findViewById<TextInputLayout>(R.id.tilSdt)
        val edtSdt = findViewById<TextInputEditText>(R.id.edtSdt)
        val tilEmail = findViewById<TextInputLayout>(R.id.tilEmail)
        val edtEmail = findViewById<TextInputEditText>(R.id.edtEmail)
        val tilNgayNhan = findViewById<TextInputLayout>(R.id.tilNgayNhan)
        val edtNgayNhan = findViewById<TextInputEditText>(R.id.edtNgayNhan)
        val tilSoDem = findViewById<TextInputLayout>(R.id.tilSoDem)
        val edtSoDem = findViewById<TextInputEditText>(R.id.edtSoDem)
        val tilSoKhach = findViewById<TextInputLayout>(R.id.tilSoKhach)
        val edtSoKhach = findViewById<TextInputEditText>(R.id.edtSoKhach)
        val btnDatPhong = findViewById<MaterialButton>(R.id.btnDatPhong)
        txtLoaiPhong.text = "${loaiPhongHienTai.ten} - ${loaiPhongHienTai.giaMotDem} đ/đêm"
        fun capNhatTamTinh() {
            val dem = edtSoDem.text.toString().trim().toIntOrNull() ?: 0
            val khach = edtSoKhach.text.toString().trim().toIntOrNull() ?: 0
            val tien = DatPhongHelper.tinhTienPhong_2415053122316(loaiPhongHienTai, dem, khach)
            txtTamTinh.text = "Tạm tính: $tien"
        }
        edtSoDem.doAfterTextChanged { capNhatTamTinh() }
        edtSoKhach.doAfterTextChanged { capNhatTamTinh() }
    }
}