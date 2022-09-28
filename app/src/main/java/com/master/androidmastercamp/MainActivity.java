package com.master.androidmastercamp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button getbth = findViewById(R.id.getbtn);
        getbth.setOnClickListener(v -> getHttpRequest());

        Button postBtn = findViewById(R.id.postbtn);
        postBtn.setOnClickListener(v -> postHttpRequest());

    }

    private final OkHttpClient client = new OkHttpClient();

    private void getHttpRequest() {
        // 生成一个request
        Request request = new Request.Builder() // 实例化Request
                .url("https://dog.ceo/api/breeds/image/random") // 请求的url
                .get() // get方法
                .build(); // 构造函数

        // 生成一个request
        // newCall 发起请求
        // enqueue 异步请求
        client.newCall(request).enqueue(new Callback() {
            // 请求失败
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                System.out.println(e.toString());
            }

            // 请求成功
            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                int code = response.code();
                if (code == 200) {
                    System.out.println(response.body().string());
                }
            }
        });
    }

    private void postHttpRequest() {

    }

}