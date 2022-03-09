package com.example.a13_recyclerviewone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a13_recyclerviewone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    var persons = ArrayList<Person>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       var p1 =  Person("Morteza Jahanbakhsh","Mortezajahan@gmail.com")
       var p2 =  Person("Morteza Jahanbakhsh","Mortezajahan@gmail.com")
       var p3 =  Person("Morteza Jahanbakhsh","Mortezajahan@gmail.com")
       var p4 =  Person("Morteza Jahanbakhsh","Mortezajahan@gmail.com")
       var p5 =  Person("Morteza Jahanbakhsh","Mortezajahan@gmail.com")
       var p6 =  Person("Morteza Jahanbakhsh","Mortezajahan@gmail.com")
       var p7 =  Person("Morteza Jahanbakhsh","Mortezajahan@gmail.com")
       var p8 =  Person("Morteza Jahanbakhsh","Mortezajahan@gmail.com")
       var p9 =  Person("Morteza Jahanbakhsh","Mortezajahan@gmail.com")
       var p10 = Person("Morteza Jahanbakhsh","Mortezajahan@gmail.com")

        persons.add(p1)
        persons.add(p2)
        persons.add(p3)
        persons.add(p4)
        persons.add(p5)
        persons.add(p6)
        persons.add(p7)
        persons.add(p8)
        persons.add(p9)
        persons.add(p10)


        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = MyAdapter(persons)

    }
}