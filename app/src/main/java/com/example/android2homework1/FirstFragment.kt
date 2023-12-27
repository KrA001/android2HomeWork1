package com.example.android2homework1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.android2homework1.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding: FragmentFirstBinding get() = _binding!!
    private val carAdapter = CarAdapter(this::onClick)

    private fun onClick(car: Car) = with(binding) {
        Hand.setData(car)
        findNavController().navigate(R.id.action_firstFragment2_to_detailFragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        connectRecyclerView()
    }

    private fun connectRecyclerView() {
        binding.rvFirstFragment.adapter = carAdapter
        carAdapter.setCarsList(
            mutableListOf(
                Car(R.drawable.bmw1, "Bmw", 4),
                Car(R.drawable.mrs1, "Мерседес", 4),
                Car(R.drawable.bmw2, "Bmw", 4),
                Car(R.drawable.mrs2, "Мерседес", 4),
                Car(R.drawable.bmw1, "Bmw", 4),
                Car(R.drawable.mrs1, "Мерседес", 4),
            )
        )
    }
}