[![](https://jitpack.io/v/sam38124/JzArticle.svg)](https://jitpack.io/#sam38124/JzArticle)
[![Platform](https://img.shields.io/badge/平台-%20Android%20-brightgreen.svg)](https://github.com/sam38124)
[![characteristic](https://img.shields.io/badge/特點-%20輕量級%20%7C%20簡單易用%20%20%7C%20穩定%20-brightgreen.svg)](https://github.com/sam38124)
# JzArticle
一套非常簡易使用的文本顯示框，能夠自動判斷圖片網址顯示圖片，以及youtube影片連結的判斷
## 目錄
* [如何導入到專案](#Import)
* [快速使用](#Use)
* [關於我](#About)

<a name="Import"></a>
## 如何導入到項目
> 支持jcenter。 <br/>

### jcenter導入方式
在app專案包的build.gradle中添加
```kotlin
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

在需要用到這個庫的module中的build.gradle中的dependencies中加入
```kotlin
dependencies {
implementation 'com.github.sam38124: JzArticle:1.0'
}
```
<a name="Use"></a>
## 如何使用
#### 1.宣告JzArticle
```kotlin
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
//影片點擊監聽
            }

            override fun clickImageView(url: String) {
//圖片點擊監聽
            }
        })
```
#### 2.在要顯示的文本框的位置建立一個Framelayout並且進行替換
```kotlin
 val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frage, article, "test")
            .commitAllowingStateLoss()
```
<a name="About"></a>
### 關於我
橙的電子android and ios developer

*line:sam38124

*gmail:sam38124@gmail.com
