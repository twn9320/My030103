package com.example.yvtc.my030103;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v){
        Intent it =new Intent();
        it.setAction("myaction.a123");
        startActivity(it);
    }
    public void click2(View v){
        EditText ed=(EditText)findViewById(R.id.editText);
        String str = ed.getText().toString();
        Intent it =new Intent(MainActivity.this,ThirdActivity.class);
        it.putExtra("msg",str);  //給定msg為鍵值  接收端要取得鍵值
        startActivity(it);
    }
}
