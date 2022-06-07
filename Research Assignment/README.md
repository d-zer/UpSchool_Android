# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)
- [Araştırma Projesi 3 - Font family XML](#3)
- [Araştırma Projesi 4 - Property Animation](#4)
- [Öğrenci Cevapları](#x)


## <a name="1"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?



## <a name="2"></a> Araştırma Projesi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?
- Nasıl kullanılmalıdır ?
- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 

## <a name="3"></a> Araştırma Projesi 3

- Font family dosyası nasıl oluşturulup kullanıyoruz?
- Neden belirttiğiniz şekilde kullanımı tercih ediyoruz?

P.S. [Bu linkten](https://developer.android.com/guide/topics/ui/look-and-feel/fonts-in-xml ) faydalanarak font family projenizde deneyebilirsiniz.

## <a name="4"></a> Araştırma Projesi 4

- Property Animation ile ilgili olarak objectAnimator ile animator arasındaki farkı kısaca açıklayınız

P.S. [Bu linkten](https://developer.android.com/guide/topics/resources/animation-resource#Property) faydalanabilirsiniz.

# Cevaplar:

## <a name="1"></a> Araştırma Projesi 1

Kotlin dilinde nullsafe'liğin sağlanabilmesi için, default olarak değer atamadan geçmeme zorunluluğu bulunmaktadır. Bu durumdan kurtulmak için optional tanım yapılabilir ya da lateinit kullanarak, tanımlanılan anda değil de class içerisinde herhangi bir yerde değeri init edebiliriz. 

```
class MyActivity: AppCompatActivity() {
    // null degil, ancak init edilmemis (baslatılmamıs)
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        // ...
        // init edildigi (baslatıldıgı) yer
        recyclerView = findViewById(R.id.recycler_view)
    }
}
```

## <a name="2"></a> Araştırma Projesi 2

Namespace, spesifik attribute'ların koleksiyonunu içerir. XML namespace'leri ise, eleman adlandırmalarının çakışmasının engellemek için kullanılan bir yöntemdir. Android'de kullanımı yaygın olan üç namespace vardır: android, tools ve app

*android* ve *tools*, sistem tarafından kapsüllenir. *app*'teki attribute'lar kullanıcı-tanımlıdır.

Ayrıca, aşağıda belirtilen her kod satırının *xmlns:* ile başlamasının sebebi, bir namespace tanımlamaya başlayacağımızı bildirmektir.

1. android 
    ```
    xmlns:android="http://schemas.android.com/apk/res/android"
    ```
    Root elemanın koduna yazdığımız namespace'deki attribute'lara başvurmayı sağlar. Namespace'e isim verir. Değeri ise URI olması sebebiyle değeri sabittir.
    
2. tools
    ```
    xmlns:tools="http://schemas.android.com/tools"
    ```
    + Sadece geliştime durumunda çalışır. Geliştiricilere yardımcı olan araçtır. App paketlendiği vakit, tüm tool attribute'ları atılır.
    + Activity Layout etkisini görebilmek için *tools:context=".MainActivity"* sağlanır. Bu sayede, Activity içinde ayarlanan teman, geliştirme aşamasında Layout içindeki etkisini görebiliriz.
    + Activity'e fragment yüklediğimizde, test aşamasında Layout preview window'unda göstermeyi sağlar. *tools:layout=@layout/fragmentlayoutname* ile main layout'ta fragment layout'unun önizlenmesi sağlanılır.
3. app (custom namespace)
    ```
    xmlns:app="http://schemas.android.com/apk/res-auto"
    ```
    Yukarıdali kod ile namespace attribute'u özelleştirilir. Kullanıcı-tanımlı değerlerin atanması sağlanarak, özelleştirilmiş çalışma yapılması sağlanılır.
    
Tools attribute'un kullanımına dair örnek: 
```
tools:layout_gravity = "center"
```
Bu kod sayesinde, seçili elemanı merkezde gösterebiliriz.
## <a name="3"></a> Araştırma Projesi 3

Android görünümünde iken res klasöründe yeni "Android Resource Directory" oluşturulur. Ardından, çıkan sekmede "Resource type" ı "font" olarak işaretleyip klasör oluşturulur.

Android görünümünden Project görünümüne geçerek font klasörü seçilir. İndirmiş olduğunuz font-family dosyasını, font klasörü üzerine sürükleriz. Bu sayede Android Studio'a font-family'i aktarmış oluruz.

Seçili activity dosyasına
```
android:fontFamily = "@font/fontName"
```
yazarak, elemana font-family'i uygulamış oluruz.

Bu şekilde kullanma sebeplerim:
+ Tek bir dosya altında toplayarak, düzenli depolama yapısı kurulabildi.
+ Yerelde kullanılabilirlik sağlanılarak, erişim engelleri ile karşılaşma sorununu aza indirmiş oluruz.
+ Android Studio'nun sağladığı font-family'leri dışında bir alanda bir font-family kullanılarak, tasarımın geliştirici tarafından memnuniyeti sağlanmış olur.

Not: Font-family'nin indirildiği klasördeki dosya isimlerini snake case olarak isimlendirmek gerekir. Yapılmazsa Android Studio hata verir, çünkü sadece küçük harfleri okuyabilir.

## <a name="4"></a> Araştırma Projesi 4

1. objectAnimator
   + Belirli bir süre boyunce bir nesnenin belirli bir özelliğini canlandırır. 
   + *attribute:propertyName* ve *android:valueTo* belirtilmesi zorunludur.
   
2. animator
   + Belirli bir süre boyunca bir animasyon gerçekleştirir. 
   + *android:valueTo* ve *android:valueFrom* belirtilmesi zorunludur. 

![](https://miro.medium.com/max/700/1*LvlhRTG59e2oN8gloPovvg.png)
