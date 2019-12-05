package com.example.konekdatabase

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fakultas_list.view.*

class RVAAdapterFakultas(private val context: Context, private val arrayList: ArrayList<Fakultas>) : RecyclerView.Adapter<RVAAdapterFakultas.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(
            LayoutInflater.from(parent.context).inflate(R.layout.fakultas_list, parent, false)
        )
    }

    override fun getItemCount(): Int = arrayList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {

        holder.view.label_kodefakultas.text = arrayList?.get(position).kode_fakultas
        holder.view.label_namafakultas.text = "Nama Fakultas: " + arrayList?.get(position)?.nama_fakultas

    }


    class Holder(val view: View) : RecyclerView.ViewHolder(view)
}


