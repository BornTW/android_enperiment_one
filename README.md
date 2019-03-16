## android_enperiment_one
验证Activity的生命周期

当第一次运行程序时，在logcat中观察输出日志，可以发现程序启动后依次调用了onCreate()、onStart()、onResume()。当调用了onResume()方法之后程序不再向下进行，这时应用程序处于运行状态，等待与用户进行交互。截图： 

![](https://github.com/BornTW/android_enperiment_one/blob/master/images/QQ20190316191835.pngg)  


