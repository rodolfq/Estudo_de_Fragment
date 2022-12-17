package com.rquintanilha.tutorial.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.rquintanilha.tutorial.fragment.fragment.FragmentExample
import com.rquintanilha.tutorial.fragment.fragment.FragmentExample2
import com.rquintanilha.tutorial.fragment.fragment.FragmentExample3
import com.rquintanilha.tutorial.fragment.fragment.Person

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            callFragmentExample()
        }

        setupUi()

    }

    private fun setupUi() {

        findViewById<Button>(R.id.btnFragment1).setOnClickListener {
            callFragmentExample()
        }

        findViewById<Button>(R.id.btnFragment2).setOnClickListener {
            callFragmentExample2()
        }

        findViewById<Button>(R.id.btnFragment3).setOnClickListener {
            callFragmentExample3()
        }

    }

    private fun callFragmentExample2() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<FragmentExample2>(R.id.fragment_container_view)
        }

    }

    private fun callFragmentExample() {

        val bundle = bundleOf(
            "USER_AGE" to 25,
            "USER_NAME" to "Rodolfo Quintanilha"
        )

        val bundleWithObject = bundleOf(
            "PERSON" to Person("Rodolfo", 25)
        )

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<FragmentExample>(R.id.fragment_container_view, args = bundleWithObject)
        }
    }

    private fun callFragmentExample3() {
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<FragmentExample3>(R.id.fragment_container_view)
        }
    }
}
