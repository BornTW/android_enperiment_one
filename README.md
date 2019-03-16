## android_enperiment_one
验证Activity的生命周期

当第一次运行程序时，在LogCat中观察输出日志，可以发现程序启动后依次调用了onCreate()、onStart()、onResume()。当调用了onResume()方法之后程序不再向下进行，这时应用程序处于运行状态，等待与用户进行交互。截图： 

![](https://github.com/BornTW/android_enperiment_one/blob/master/images/QQ20190316191835.png)  

单机模拟器的“返回”按钮，可以看到程序退出，同时LogCat中有新的日志输出.当调用了onDestory()方法后，Activity被销毁清理内存，截图：
![](https://github.com/BornTW/android_enperiment_one/blob/master/images/QQ20190316191835.png)  



