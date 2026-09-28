package com.example.studentinfo_2415053122203

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.studentinfo_2415053122203.databinding.ActivityMainBinding
import com.example.studentinfo_2415053122203.model.StudentInfo
import com.example.studentinfo_2415053122203.utils.toPassStatus

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val student = StudentInfo(
            id = "2415053122203",
            name = "Hà Phước Bình",
            className = "Kỹ thuật phần mềm",
            age = 20,
            score = 8.5
        )

        with(binding) {
            tvId.text = "Mã sinh viên: ${student.id}"
            tvName.text = "Họ tên: ${student.name}"
            tvClass.text = "Lớp: ${student.className}"
            tvAge.text = "Tuổi: ${student.age}"
            tvScore.text = "Điểm: ${student.score}"
            tvStatus.text = "Trạng thái: ${student.score.toPassStatus()}"
        }
    }
}