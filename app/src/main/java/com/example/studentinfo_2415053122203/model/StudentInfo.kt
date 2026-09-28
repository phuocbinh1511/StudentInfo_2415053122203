package com.example.studentinfo_2415053122203.model


data class StudentInfo(
    val id: String,         // Mã sinh viên
    val name: String,       // Họ tên
    val className: String,  // Lớp
    val age: Int,           // Tuổi
    val score: Double       // Điểm
)