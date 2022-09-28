# AndroidMasterCamp
 AndroidMasterCamp

# 封装Okhttp
1.配置依赖  implementation("com.squareup.okhttp3:okhttp:4.10.0")
2.网络请求需要设置权限:权限的位置在application上方
    <uses-permission android:name="android.permission.INTERNET"/> // 允许应用程序打开网络Socket的权限
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/> // 允许应用程序获取网络状态信息的权限
3.应用程序设置Http访问:Android9.0的机器上，默认不支持http的访问，所有网络访问必须使用https。
    android:usesCleartextTraffic="true"
4.get请求: 
    OkHttpClient ->  生成一个OkHttpClient
    Request -> 生成一个Request
    url/get/build -> 配置Request
    newCall -> 发起请求
    execute/enqueue -> 同步请求/异步请求 
    callBack -> // 返回
    response.body().string() //返回数据获取

