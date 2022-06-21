package com.example.pclhealthcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottomsheetlayout.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switch_room_availability.textOff="ft"
        switch_room_availability.textOn="cm"
        window.decorView.apply {
    systemUiVisibility= View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
}
 toolbar.setOnClickListener {
            finish()
        }
        val posts:ArrayList<String> = ArrayList()
        for (i in 150..200){
            posts.add("$i")
        }
        recyclerview.layoutManager=LinearLayoutManager(this, RecyclerView.HORIZONTAL,false)
        recyclerview.adapter=adapter(posts)
        chip5.setOnClickListener {
            val dialog=BottomSheetDialog(this)
            val view=layoutInflater.inflate(R.layout.bottomsheetlayout,null)
            dialog.setContentView(view)
            dialog.show()

        }

    }

}
