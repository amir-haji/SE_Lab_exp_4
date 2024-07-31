# SE_Lab_exp_4

بخش اول)

ابتدا پروژه را ایجاد میکنیم

![](image.png)

![](image-1.png)

سپس dependancyهای مورد نیاز را اضافه میکنیم:

![](image-2.png)

و اجرای تست maven:

![](image-3.png)

که بدون ارور انجام میشود:

![](image-4.png)

ملزومات پروژه با موفقیت راه اندازی میشود

![](image-5.png)

افزودن پکیج resources

![](image-6.png)

سپس پیکر بندی پروژه را انجام میدهیم:

![](image-7.png)

حال خطوط کد را وارد میکنیم:

![](image-8.png)

ترجمه و افزودن به mystepdef 

![](image-9.png)

ساخت کلاس calculator

![](image-10.png)

مجددا maven test را با موفقیت اجرا میکنیم:

![](image-11.png)

همانطور که مشاهده میکنیم تست های cxalculator.feature با موفقیت پاس شدند:

![](image-12.png)

افزودن کلاس RunnerTest:

![](image-13.png)

اجرای RunnerTest:

![](image-14.png)

حال scenario outline را اضافه میکنیم:

![](image-15.png)

این بار با اجرای RunnerTest به ارور بر میخوریم:

![](image-16.png)

که علت آن عدد منفی در examples است.
از آن جایی که regex مربوطه در mystepdef علامت منفی پیش بینی نشده این اشکال بوجود میآید.
برای رفع این خطا باید دو نوع regex دریگر برای حالت هایی که عدد اول یا عدد دوم منفی باشند اضافه کنیم:

![](image-17.png)

حال تمام تست ها با موفقیت پاس میشوند:

![](image-18.png)


بخش دوم)
