package com.example.android2homework1

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android2homework1.databinding.ItmeBinding

class CarAdapter(private val onItemClick: (cars: Car) -> Unit) :
    RecyclerView.Adapter<CarAdapter.CarViewHolder>() {

    private var cars = mutableListOf<Car>()

    fun setCarsList(car: MutableList<Car>) {
        cars.clear()
        cars = car
        notifyDataSetChanged()
    }

    inner class CarViewHolder(private val binding: ItmeBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {
                onItemClick(cars[adapterPosition])
            }
        }

        fun onBind(car: Car) = with(binding) {
            ivImage.setImageResource(car.carImage)
            tvName1.text = car.name
            tvName2.text = car.wheel.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val binding = ItmeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CarViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.onBind(cars[position])
    }

    override fun getItemCount(): Int = cars.size
}