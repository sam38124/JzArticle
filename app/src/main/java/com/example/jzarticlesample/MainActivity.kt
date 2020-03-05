package com.example.jzarticlesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jzarticle.JzArticle
import com.example.jzarticle.click

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var article= JzArticle("中職》地基打穩 蘇緯達熱身賽轟出神數據","https://img.ltn.com.tw/Upload/sports/page/800/2020/03/04/phpbUjDst.jpg\n" +
                "中信兄弟蘇緯達擊出全壘打。（記者黃志源攝）\n" +
                "〔記者龔乃玠／台南報導〕中信兄弟蘇緯達今對統一獅2打數2安打，包括1發全壘打，熱身賽3戰4轟11打點冠居聯盟，他說今年地基打得穩，在打擊時看球時間更長，可以辨別直球和變化球，是熱身賽好手感的原因。\n" +
                "蘇緯達表示，不用擔心春訓打太好，就是每天日復一日做訓練，把自己準備好，結果就放在一邊，如果把結果論放太重，反而會更綁手綁腳。\n" +
                "他也提到，今年在春訓越來越多人會一起揮棒特訓，「以前都是練習或比賽完就沒有後續練習，今年蠻多的，大家一起練習，針對自己不足的地方做訓練，成果蠻不錯的。」\n" +
                "蘇緯達目前11打席中，有6支安打，另有2保送和3次三振，把球打進場內形成安打機率竟是100%，攻擊指數更是突破天際的2.727。\n" +
                "https://img.ltn.com.tw/Upload/sports/page/800/2020/03/04/phpUr1zF7.jpg\n" +
                "中信兄弟蘇緯達擊出全壘打。（記者黃志源攝）\n" +
                "https://img.ltn.com.tw/Upload/sports/page/800/2020/03/04/phpIme2il.jpg\n" +
                "中信兄弟蘇緯達擊出陽春全壘打。（記者黃志源攝）", object :click{
            override fun clickVideo(url: String) {

            }

            override fun clickImageView(url: String) {

            }
        })
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frage, article, "test")
            .commitAllowingStateLoss()
    }
}
