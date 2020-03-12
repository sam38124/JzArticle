package com.example.jzarticle

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.facebook.drawee.backends.pipeline.Fresco
import kotlinx.android.synthetic.main.fragment_show_po.view.*

class JzArticle(val title:String,val post:String,val click:click) :Fragment(){
    var type=ArrayList<String>()
    var po=ArrayList<String>()
    var adapter=Ad_PostReader(type,po,click)

     fun viewInit() {
         Fresco.initialize(activity!!.applicationContext)
        rootview.re.layoutManager= LinearLayoutManager(activity)
         rootview.re.adapter=adapter
        var allpo=post
        po.clear()
        type.clear()
        type.add("po")
        po.add(title)
        for (s in Util_Tool.url(allpo)) {
            if(s.contains("jpg")||s.contains("png")||s.contains("firebase")){
                type.add("po")
                po.add(allpo.substring(0,allpo.indexOf(s)))
                allpo=allpo.substring(allpo.indexOf(s)+s.length)
                type.add("image")
                po.add(s)
            }
            if(s.contains("https://youtu.be/")||s.contains("https://www.youtube.com/")){
                type.add("po")
                po.add(allpo.substring(0,allpo.indexOf(s)))
                allpo=allpo.substring(allpo.indexOf(s)+s.length)
                type.add("video")
                po.add(s)
            }
        }
         type.add("po")
         po.add(allpo)
        adapter.notifyDataSetChanged()
    }
    var refresh = false
    lateinit var rootview: View
    var handler = Handler()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("rootfrag", "create${this}")
        if (::rootview.isInitialized && !refresh) {
            return rootview
        }
        rootview = inflater.inflate(R.layout.fragment_show_po, container, false)
        viewInit()

        return rootview
    }

}