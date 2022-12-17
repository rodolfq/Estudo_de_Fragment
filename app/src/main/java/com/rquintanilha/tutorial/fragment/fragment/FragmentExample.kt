package com.rquintanilha.tutorial.fragment.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rquintanilha.tutorial.fragment.R

class FragmentExample : Fragment(R.layout.fragment_example){


//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        super.onCreateView(inflater, container, savedInstanceState)
//
//        return inflater.inflate(R.layout.fragment_example, container, false)
//    }

    companion object {
        const val TAG = "uuid.FragmentExample"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val person = requireArguments().getSerializable("PERSON") as Person

        val userAge = requireArguments().getInt("USER_AGE")
        val userName = requireArguments().getString("USER_NAME")


        Log.i(TAG, "onCreate $userAge - $userName")
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}