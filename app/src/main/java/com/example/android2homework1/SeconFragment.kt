package com.example.android2homework1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android2homework1.databinding.FragmentSeconBinding

class SeconFragment : Fragment() {

    private var _binding: FragmentSeconBinding? = null
    private val binding: FragmentSeconBinding get() = _binding!!
    private val carAdapter = CarAdapter(this::onClick)

    private fun onClick(car: Car) {

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSeconBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        connectRecycleView()
    }

    private fun connectRecycleView() {
        binding.rvSecondFragment.adapter = carAdapter
        carAdapter.setCarsList(
            mutableListOf(
                Car(R.drawable.mrs1, "мерседес", 4),
                Car(R.drawable.mrs2, "мерседес", 4),
                Car(R.drawable.mrs1, "мерседес", 4),
                Car(R.drawable.mrs2, "мерседес", 4),
                Car(R.drawable.mrs1, "мерседес", 4),
                Car(R.drawable.mrs2, "мерседес", 4),

            )
        )
    }
}