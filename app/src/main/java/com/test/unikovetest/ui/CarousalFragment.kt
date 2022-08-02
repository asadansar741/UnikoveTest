package com.test.unikovetest.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.test.unikovetest.R

class CarousalFragment : Fragment() {

    private val imageList = mutableListOf<SlideModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }

        createDummyData()
    }

    private fun createDummyData() {

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

//        imageList.add(SlideModel("https://bit.ly/2YoJ77H", "The animal population decreased by 58 percent in 42 years."))
//        imageList.add(SlideModel("https://bit.ly/2BteuF2", "Elephants and tigers may become extinct."))
//        imageList.add(SlideModel("https://bit.ly/3fLJf72", "And people do that."))
        imageList.add(SlideModel("https://bit.ly/2YoJ77H", "", ScaleTypes.FIT))
        imageList.add(SlideModel("https://bit.ly/2BteuF2", "",ScaleTypes.FIT))
        imageList.add(SlideModel("https://bit.ly/3fLJf72", "",ScaleTypes.FIT))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_carosal, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageSlider = view.findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)

        imageSlider.setItemClickListener(object : ItemClickListener {
            override fun onItemSelected(position: Int) {
                Toast.makeText(requireContext(), "$position clicked", Toast.LENGTH_SHORT).show()
            }
        })
    }

}