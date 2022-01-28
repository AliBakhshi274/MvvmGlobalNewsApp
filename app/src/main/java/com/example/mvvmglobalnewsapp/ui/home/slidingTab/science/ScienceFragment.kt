package com.example.mvvmglobalnewsapp.ui.home.slidingTab.science

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mvvmglobalnewsapp.R
import com.example.mvvmglobalnewsapp.ui.MainActivity
import com.example.mvvmglobalnewsapp.ui.MainViewModel


class ScienceFragment : Fragment() {

    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainViewModel = (activity as MainActivity).viewModel

    }

}