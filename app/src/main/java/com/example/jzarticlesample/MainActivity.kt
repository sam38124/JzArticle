package com.example.jzarticlesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jzarticle.JzArticle
import com.example.jzarticle.click

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var article= JzArticle("中職》地基打穩 蘇緯達熱身賽轟出神數據","《範例貼文，請勿參與》\n" +
                "    https://firebasestorage.googleapis.com/v0/b/tsport-228902.appspot.com/o/images%2Ffb1662627190550319%2F1587881908301?alt=media&token=91094e43-cc6a-4afa-855d-cbf653c16d04\n" +
                "    你還不知道什麼是跑酷嗎?\n" +
                "    就在周五，快點一起來玩! \n" +
                "    集合地點:逢甲大學\n" +
                "    跑酷不再是你想像中的電影危險特技，\n" +
                "    我們會帶你如何讓跑酷融入你的生活，還有更了解自己的體能狀態。\n" +
                "    \n" +
                "    非常歡迎有興趣的新手們一起來體驗喔。\n" +
                "    \n" +
                "    活動內容：\n" +
                "    1.認識彼此-了解跑酷是什麼\n" +
                "    2.入門訓練-新手教學(40min-1H)\n" +
                "    3.自由訓練&交朋友時間-分享中部各地跑酷同好訓練方法、心得等\n" +
                "    \n" +
                "    活動費用：免費\n" +
                "    \n" +
                "    ※請記得詳閱以下規定喔!\n" +
                "    \n" +
                "    連絡方式: samplemail@gmail.com\n" +
                "    ===============================================\n" +
                "    免責聲明與規定：\n" +
                "    1. 請各位攜帶健保卡、飲用水、毛巾、替換衣物與雨具，並穿著合適的運動服與運動鞋\n" +
                "    2. 請務必尊重行人、場地，並以禮讓老弱婦孺為優先\n" +
                "    3. 參與練習請遵守規則，循序漸進，以確定是自己能力範圍以內的動作進行練習，執意不聽勸告者，請為自己的行為負擔其責任，本團隊不負任何法律與道德責任\n" +
                "    4. 練習結束或更換場地時，請恢復環境清潔，並帶走自行攜帶或造成的垃圾\n" +
                "    5. 出席視同已詳閱並同意以上各點內容", object :click{
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
