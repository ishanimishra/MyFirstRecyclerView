package com.example.myfirstrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movies = listOf(
            Movie(1, "", true, "UA", 75, 2300, "Captain Marvel", "English", "3D"),
            Movie(1, "", true, "UA", 75, 2300, "Captain Marvel", "English", "3D"),
            Movie(1, "", false, "UA", 75, 2300, "Captain Marvel", "English", "3D"),
            Movie(1, "", true, "UA", 75, 2300, "Captain Marvel", "English", "3D"),
            Movie(1, "", true, "UA", 75, 2300, "Captain Marvel", "English", "3D"),
            Movie(1, "", true, "UA", 75, 2300, "Captain Marvel", "English", "3D"),
            Movie(1, "", true, "UA", 75, 2300, "Captain Marvel", "English", "3D"),
            Movie(1, "", true, "UA", 75, 2300, "Captain Marvel", "English", "3D")
        )
        //how wil the list be displayed? vertical, therefore
        recyclerViewMovies.layoutManager = LinearLayoutManager(this)
        recyclerViewMovies.adapter = MoviesAdapter(movies)
    }
}
