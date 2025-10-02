package com.example.molodejrf.presentation.fragment.start

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.molodejrf.R

class StarInformationFragment : Fragment() {
    private lateinit var dots: List<View>
    private lateinit var infText: Array<String>
    private lateinit var infHeading: Array<String>
    private lateinit var tvHeading: TextView
    private lateinit var tvContent: TextView
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
        tvContent = view.findViewById(R.id.captionText)
        tvHeading = view.findViewById(R.id.headingText)
        infText = resources.getStringArray(R.array.inf_text)
        infHeading = resources.getStringArray(R.array.inf_heading)
        setActiveDot(0)
    }

    fun setActiveDot(position: Int) {
        if (position in 0..3) {
            dots.forEachIndexed { index, dot ->
                val background = if (index == position) activeDot else inactiveDot
                dot.setBackgroundResource(background)
            }
            
        }
    }

    fun setActiveContent(position: Int) {
        if (position in infHeading.indices && position in infText.indices) {
            // Обновляем заголовок и текст
            tvHeading.text = infHeading[position]
            tvContent.text = infText[position]
            // Обновляем точки
            setActiveDot(position)
        }
    }

    fun setupWithViewPager(viewPager: ViewPager2) {
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                setActiveDot(position)
            }
        })
        setActiveContent(viewPager.currentItem)
    }
}