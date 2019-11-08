package com.hjs.ex_20191108;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 액티비티가 호출되면 가장먼저 실행되는 메서드가 onCreate()
        Log.i("MY","--onCreate()--");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MY","--onDestroy()--");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MY","--onPause()--");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this, "앱 재시작됨!!", Toast.LENGTH_SHORT).show();
        Log.i("MY","--onRestart()--");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MY","--onResume()--");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MY","--onStart()--");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MY","--onStop()--");
    }

    // 앱을 실행하면..
    // onCreate() -> 첫 실행시 딱 한번만 호출되는 메서드
    // onStart()
    // onResume()

    // 홈 버튼으로 앱을 빠져나가면..
    // onPause()
    // onStop()

    // 다시 앱을 복귀하면..
    // onRestart()
    // onStart()
    // onResume()

    // 뒤로가기 버튼으로 앱을 완전히 종료하면..
    // onPause()
    // onStop()
    // onDestroy() -> 앱이 완전히 종료되었을때 딱 한번 호출되는 메서드
}
