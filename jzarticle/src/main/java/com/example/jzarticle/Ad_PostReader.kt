package com.example.jzarticle


import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.marginTop
import androidx.recyclerview.widget.RecyclerView
import com.orange.jzchi.jzframework.tool.UnicodeUtil.unicodeToString
import kotlinx.android.synthetic.main.show_po.view.*

import java.util.ArrayList

interface click{
    fun clickVideo(url:String)
    fun clickImageView(url:String)
}
class Ad_PostReader(private val type:ArrayList<String>, private val po:ArrayList<String>,val click:click)
    : RecyclerView.Adapter<Ad_PostReader.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.show_po, parent, false)
        Log.e("contex", "" + (parent.context))
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = type.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.mView.por.visibility=View.GONE
        holder.mView.imr.visibility=View.GONE
        holder.mView.youtube.visibility=View.GONE
        when(type[position]){
            "image"->{
                holder.mView.image.setImageURI(po[position])
                holder.mView.imr.visibility=View.VISIBLE
                holder.mView.image.setOnClickListener {
                    click.clickImageView(po[position])
                }
            }
            "po"->{
                holder.mView.po.text=unicodeToString(po[position])
                holder.mView.por.visibility=View.VISIBLE
                if(position==0){
                    holder.mView.po.textSize=21F
                    holder.mView.po.setLineSpacing(0F,1F)
                }else{
                    holder.mView.po.textSize=14F
                    holder.mView.po.setLineSpacing(0F,1.5F)
                }
            }
            "video"->{
                holder.mView.youtube.visibility=View.VISIBLE
                var link = po[position]
                if (link.contains("https://www.youtube.com/watch?v=")) {
                    link = link.replace("https://www.youtube.com/watch?v=", "")
                } else {
                    link = link.replace("https://youtu.be/", "")
                }
                val img = "https://img.youtube.com/vi/xxxxxxx/hqdefault.jpg".replace("xxxxxxx", link)
                holder.mView.vdim.setImageURI(img)
                holder.mView.vdim.setOnClickListener {
                    click.clickVideo(link)
                }
            }
        }
    }
    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        var obj: Any? = null

        override fun toString(): String {
            return super.toString() + " ''"
        }
    }
}