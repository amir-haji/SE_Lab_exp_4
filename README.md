# SE_Lab_exp_4
# آزمایشگاه مهندسی نرم‌افزار - آزمایش چهارم -  BDD    
اعضای گروه:
امیرحسین حاجی محمد رضایی - ۹۹۱۰۹۲۵۲
علی رازقندی - ۹۹۱۰۹۲۹۶
سید‌رضا قمقام - ۹۹۱۷۰۵۴۲


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

حال scenario outline را اضافه میکنیم:

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-15.png)

این بار با اجرای RunnerTest به ارور بر میخوریم:

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-16.png)

که علت آن عدد منفی در examples است.
از آن جایی که regex مربوطه در mystepdef علامت منفی پیش بینی نشده این اشکال بوجود میآید.
برای رفع این خطا باید دو نوع regex دریگر برای حالت هایی که عدد اول یا عدد دوم منفی باشند اضافه کنیم:

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-17.png)

حال تمام تست ها با موفقیت پاس میشوند:

![](https://github.com/amir-haji/SE_Lab_exp_4/blob/main/screenshots/image-18.png)


بخش دوم)
