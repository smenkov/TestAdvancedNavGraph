package com.freezoneapp.testadvancednavgraph.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.freezoneapp.testadvancednavgraph.R

class HomeSeqFragment1 : Fragment() {


    private lateinit var viewModel: HomeSeqFragment1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.home_seq_fragment1_fragment, container, false)
        findNavController().navigate(R.id.action_seq_home_to_seq_home2)
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeSeqFragment1ViewModel::class.java)


    }
}