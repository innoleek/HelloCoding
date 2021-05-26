package com.example.hellocoding

import android.content.Intent
import android.icu.lang.UCharacter
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_search.*

class SearchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        clickButton.setOnClickListener {
            val emailList = createItemList()
            recyclerview.layoutManager = LinearLayoutManager(this)
            recyclerview.adapter = RecyclerViewAdapter(emailList)
        }
    }

    fun createItemList(): List<Email> {
        val emailList = listOf(
            Email(
                subject = "이번 주말에 바베큐 파티",
                body = "꼭 와주세요.",
                from = "이경민",
                time = "10:30AM"
            ),
            Email(
                subject = "화요일날 과외수업 예정",
                body = "과외 꼭 참석해주세요",
                from = "이지현",
                time = "10:50AM"
            ),
            Email(
                subject = "수요일날 과외수업 예정",
                body = "과외 와요",
                from = "이영화",
                time = "10:55AM"
            )
        )

        return emailList
    }
}

data class Email(
    val subject: String,
    val body: String,
    val from: String,
    val time: String
)