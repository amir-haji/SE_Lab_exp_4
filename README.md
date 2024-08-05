# SE_Lab_exp_4
# آزمایشگاه مهندسی نرم‌افزار - آزمایش چهارم 
اعضای گروه:
امیرحسین حاجی محمد رضایی - ۹۹۱۰۹۲۵۲
علی رازقندی - ۹۹۱۰۹۲۹۶
سید‌رضا قمقام - ۹۹۱۷۰۵۴۲

# BDD

بخش اول)

ابتدا پروژه را ایجاد میکنیم

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image.png)

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-1.png)

سپس dependancyهای مورد نیاز را اضافه میکنیم:

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-2.png)

و اجرای تست maven:

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-3.png)

که بدون ارور انجام میشود:

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-4.png)

ملزومات پروژه با موفقیت راه اندازی میشود

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-5.png)

افزودن پکیج resources

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-6.png)

سپس پیکر بندی پروژه را انجام میدهیم:

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-7.png)

حال خطوط کد را وارد میکنیم:

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-8.png)

ترجمه و افزودن به mystepdef 

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-9.png)

ساخت کلاس calculator

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-10.png)

مجددا maven test را با موفقیت اجرا میکنیم:

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-11.png)

همانطور که مشاهده میکنیم تست های cxalculator.feature با موفقیت پاس شدند:

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-12.png)

افزودن کلاس RunnerTest:

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-13.png)

اجرای RunnerTest:

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-14.png)

بخش دوم)

 scenario outline را اضافه میکنیم:

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-15.png)

این بار با اجرای RunnerTest به ارور بر میخوریم:

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-16.png)

که علت آن عدد منفی در examples است.
از آن جایی که regex مربوطه در mystepdef علامت منفی پیش بینی نشده این اشکال بوجود میآید.
برای رفع این خطا باید دو نوع regex دریگر برای حالت هایی که عدد اول یا عدد دوم منفی باشند اضافه کنیم:

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-17.png)

حال تمام تست ها با موفقیت پاس میشوند:

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-18.png)


بخش سوم)

ابتدا سناریو تست را مینویسیم:

![](image.png)

سپس سناریو ها را به مموارد تست تبدیل میکنیم:

![](image-1.png)

و در انتها کد برنامه را مینویسیم:

![](image-2.png)

حال نتیجه اجرای تست ها را میبینیم:

![](image-3.png)



# Profiling

## Part 1

در ابتدا طبق راهنمایی در متن آزمایش، yourkit را نصب می‌کنم و سپس از آن برای پروفایل کردن برنامه javacup استفاده می‌کنم که نتایج آن به در پروفایل به صورت زیر خواهند بود:

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/Profiling/ProfilingTest%20part%20screenshots/1.PNG)

و نتایج پروفایل از لحاظ بار بر cpu، مقدار حافظه مصرفی و زمان مصرفی در پروفایل به صورت زیر نمایش داده می‌شوند:

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/Profiling/ProfilingTest%20part%20screenshots/2.PNG)
![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/Profiling/ProfilingTest%20part%20screenshots/3.PNG)
![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/Profiling/ProfilingTest%20part%20screenshots/4.PNG)

که همانطور که از خطای ایجاد‌شده در برنامه و نتایج در پروفایل مشخص است، مشکل از خط ۳۰‌ام در برنامه است که در آنجا سعی می‌کنم مقدار زیادی عدد را به ArrayList اضافه کند که با اضافه‌کردن‌های متعدد و با طولانی شدن لیست، هم حافظه خیلی بالا می‌رود و هم در لیست‌های طولانی زمان بیشتری برای اضافه کردن عنصر جدید مصرف می‌شود.

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/Profiling/ProfilingTest%20part%20screenshots/5.PNG)

حال برای رفع این مشکل، تابع temp را با همان منطق به صورتی دیگر با استفاده از آرایه دو بعدی ایجاد می‌کنیم. نکته این است که در این حالت از قبل مقدار حافظه موردنیاز به برنامه تخصیص پیدا می‌کند و دیگر در ادامه برنامه نیاز به تخصیص مقدار حافظه جدید برای مقدار‌های جلوتر نیست.

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/Profiling/ProfilingTest%20part%20screenshots/6.PNG)

حال دوباره با جای‌گذاری تابع correct_temp به جای temp در بخش main برنامه، دوباره از ابتدا عمل profiling را انجام می‌دهیم.

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/Profiling/ProfilingTest%20part%20screenshots/7.PNG)
![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/Profiling/ProfilingTest%20part%20screenshots/8.PNG)
![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/Profiling/ProfilingTest%20part%20screenshots/9.PNG)
![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/Profiling/ProfilingTest%20part%20screenshots/10.PNG)

حال همانطور که از نتایج بالا مشخص است، در این حالت دیگر برنامه به‌غیر از ابتدای شروع کار آن که نیاز به تخصیص مقداری حافظه دارد، دیگر در ادامه دچار بار زیاد زمان و حافظه مصرفی نخواهد شد و کارکرد آن نسبت به حالت قبلی بهبود می‌یابد.





## Part 2
در ابتدا یک برنامه که تعداد کلمات را در یک فایل متنی شمارش میکند مینویسیم.
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class WordCounter {

    public static void main(String[] args) {
        String filePath = "Profiling/ProfilingTest/src/dummy.txt";
        try {
            List<WordCount> wordCounts = countWords(filePath);
            System.out.println("Word count completed. Unique words: " + wordCounts.size());
            for (WordCount wc : wordCounts) {
                System.out.println(wc.word + ": " + wc.count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<WordCount> countWords(String filePath) throws IOException {
        List<WordCount> wordCounts = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            try {
                // to sleep 10 seconds
                Thread.sleep(10);
            } catch (InterruptedException e) {
                continue;
            }
            for (String word : words) {
                word = word.toLowerCase();
                boolean found = false;
                for (WordCount wc : wordCounts) {

                    if (wc.word.equals(word)) {
                        wc.count++;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    wordCounts.add(new WordCount(word, 1));
                }
            }
        }

        reader.close();
        return wordCounts;
    }

    static class WordCount {
        String word;
        int count;

        WordCount(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
}
```

حال اجرای برنامه را رصد میکنیم.
![img.png](img.png)
![img_1.png](img_1.png)
![img_2.png](img_2.png)

حال برنامه را در نحوه شمارش بهبود میدهیم.
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WordCountOptimized {

    public static void main(String[] args) {
        String filePath = "large_text_file.txt";
        try {
            HashMap<String, Integer> wordCounts = countWords(filePath);
            System.out.println("Word count completed. Unique words: " + wordCounts.size());
            wordCounts.forEach((word, count) -> System.out.println(word + ": " + count));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static HashMap<String, Integer> countWords(String filePath) throws IOException {
        HashMap<String, Integer> wordCounts = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            try {
                // to sleep 10 seconds
                Thread.sleep(10);
            } catch (InterruptedException e) {
                continue;
            }
            for (String word : words) {
                word = word.toLowerCase();
                wordCounts.merge(word, 1, Integer::sum);
            }
        }

        reader.close();
        return wordCounts;
    }
}
```

حال برنامه بهینه شده را رصد میکنیم.

![img_3.png](img_3.png)
![img_4.png](img_4.png)
![img_5.png](img_5.png)

در کد بهینه بجای استفاده از لیست از هش مپ استفاده کردیم و همانطور که در عکس های سوم هر پروفایلینگ مشخص است مدت زمان اجرا ۱ ثانیه بهبود داشته است و همچنین مقدار استفاده از حافظه ۱ مگ بایت کمتر شده است.
