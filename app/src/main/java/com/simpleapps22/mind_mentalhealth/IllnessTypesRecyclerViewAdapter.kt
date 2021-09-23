package com.simpleapps22.mind_mentalhealth

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.simpleapps22.mind_mentalhealth.placeholder.PlaceholderContent.PlaceholderItem
import com.simpleapps22.mind_mentalhealth.databinding.FragmentIllnessBinding

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
class IllnessTypesRecyclerViewAdapter(
    private val values: List<PlaceholderItem>
) : RecyclerView.Adapter<IllnessTypesRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            FragmentIllnessBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = values[position]
        holder.idView.text = item.id
    }

    override fun getItemCount(): Int = values.size

    inner class ViewHolder(binding: FragmentIllnessBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val idView: TextView = binding.illnessType

        override fun toString(): String {
            return super.toString() + " '" + "'"
        }
    }

}