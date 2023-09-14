package com.example.simplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

var listView:ListView=findViewById(R.id.listview)

        //ADAPTER
        var adapter=MyAdapter(this,generateData())

        listView?.adapter=adapter

        adapter.notifyDataSetChanged()



    }
    //DATA SOURCE

    fun generateData():ArrayList<CountryModel>{
        var countriesList=ArrayList<CountryModel>()

        var country1:CountryModel= CountryModel(
            "India",
            "5",
            R.drawable.india
        )
        var country2:CountryModel=CountryModel(
            "Brazil",
            "2",
            R.drawable.brazil
        )
        var country3:CountryModel=CountryModel(
            "Argentina",
            "3",
            R.drawable.argentina
        )
        var country4:CountryModel=CountryModel(
            "Germany",
            "4",
            R.drawable.germany
        )
        var country5:CountryModel=CountryModel(
            "Japan",
            "0",
            R.drawable.japan
        )
        var country6:CountryModel=CountryModel(
            "Portugal",
            "1",
            R.drawable.portugal
        )
        var country7:CountryModel=CountryModel(
            "Spain",
            "2",
            R.drawable.spain
        )
        var country8:CountryModel=CountryModel(
            "Uruguay",
            "4",
            R.drawable.uruguay
        )
        countriesList.add(country1)
        countriesList.add(country2)
        countriesList.add(country3)
        countriesList.add(country4)
        countriesList.add(country5)
        countriesList.add(country6)
        countriesList.add(country7)
        countriesList.add(country8)

        return countriesList
    }

}