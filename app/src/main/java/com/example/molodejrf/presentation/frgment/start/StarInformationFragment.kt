package com.example.molodejrf.presentation.frgment.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.molodejrf.R

class StarInformationFragment : Fragment() {
    private lateinit var dots: List<View>
    private val activeDot = R.drawable.dot_active
    private val inactiveDot = R.drawable.dot_inactive

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start_information, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dots = listOf(
            view.findViewById(R.id.dot1),
            view.findViewById(R.id.dot2),
            view.findViewById(R.id.dot3),
            view.findViewById(R.id.dot4)
        )

        setActiveDot(1)
    }

    fun setActiveDot(position: Int) {
        if (position in 0..3) {
            dots.forEachIndexed { index, dot ->
                val background = if (index == position) activeDot else inactiveDot
                dot.setBackgroundResource(background)
            }
            
        }
    }

    fun setupWithViewPager(viewPager: ViewPager2) {
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                setActiveDot(position)
            }
        })
    }
}