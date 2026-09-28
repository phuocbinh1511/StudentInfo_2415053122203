package com.example.studentinfo_2415053122203.utils

// Hàm mở rộng cho kiểu Double để trả về trạng thái học tập
fun Double.toPassStatus(): String {
    return if (this >= 5.0) "Đạt" else "Chưa đạt"
}