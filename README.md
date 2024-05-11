1. Uygulama çalıştığında ilk olarak “boole.txt” adındaki dosyayı okumalıdır. “boole.txt” dosyasında 4-değişkenli
ve çarpımların toplamı şeklindeki bir boole fonksiyonu yer almaktadır. Ödevle birlikte örnek bir dosya
sisteme yüklenecektir. Kendinizin de formata uygun farklı dosyalar oluşturup uygulamanızı test etmenizde
yarar vardır.
2. Ödevle birlikte sisteme yüklenecek olan örnek dosyayı açıp inceleyerek formatı öğrenebilirsiniz. Boole
fonksiyonunu oluşturan her bir bileşen birbirinden boşluk karakteri ile ayrılmıştır. Çarpım terimlerini
oluşturan literaller (normal veya tümleyen formdaki) bitişik yazılmaktadır. Ayrıca, örnek bir dosyanın ekran
görüntüsü aşağıda yer almaktadır.
3. Fonksiyonun ve ikili değişkenlerin isimleri tek karakterlidir fakat fonksiyon ve değişken isimleri değişebilir.
Yani uygulamanız bunu destekleyecek şekilde dinamik olmalıdır.
4. Program şu üç şeyi ekrana çıktı olarak vermelidir:
a. Dosyadaki boole fonksiyonuna karşılık gelen doğruluk tablosu
b. Boole fonksiyonunun minterimlerin toplamı şeklindeki ifadesi (Hem kısa hem de açık şekilde)
c. Boole fonksiyonunun maksterimlerin çarpımı şeklindeki ifadesi (Hem kısa hem de açık şekilde)
(Örnek bir ekran görüntüsü aşağıda verilmiştir. İnceleyiniz.)
5. Projenizi yaparken nesneye yönelik programlama tekniğini göz önünde bulundurunuz. Dolayısıyla, projenizde
belirli sayıda ve uygun şekilde sınıflar ve metotlar tanımlanmalıdır.
Örnek bir ekran görüntüsü aşağıda verilmiştir:
boole.txt dosyası okundu.
doğruluk tablosu:
A B C D F
0 0 0 0 0
0 0 0 1 0
0 0 1 0 0
0 0 1 1 1
0 1 0 0 1
0 1 0 1 0
0 1 1 0 0
0 1 1 1 1
1 0 0 0 1
1 0 0 1 1
1 0 1 0 1
1 0 1 1 1
1 1 0 0 1
1 1 0 1 1
1 1 1 0 1
1 1 1 1 1
Fonksiyon İfadeleri:
F = A’B’CD + A’BC’D’ + A’BCD + AB’C’D’ + AB’C’D + AB’CD’ + AB’CD + ABC’D’ + ABC’D + ABCD’ + ABCD
F = Σ(3, 4, 7, 8, 9, 10, 11, 12, 13, 14, 15)
F = (A + B + C + D).(A + B + C + D’).(A + B + C’ + D).(A + B’ + C + D’).(A + B’ + C’ + D)
F = ∏(0, 1, 2, 5, 6)

Örnek bir boole.txt noktası ekte verilmiştir
