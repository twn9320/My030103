package com.example.yvtc.my030103;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int REQUEST_CODE_FOR_NAME =321;  //設定requestCode
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v) {
        Intent it = new Intent();
        it.setAction("myaction.a123");
        startActivity(it);
    }

    public void click2(View v) {
        EditText ed = (EditText) findViewById(R.id.editText);
        String str = ed.getText().toString();
        Intent it = new Intent(MainActivity.this, ThirdActivity.class);
        // it.putExtra("msg",str);  //給定msg為鍵值  接收端要取得鍵值
        Bundle b = new Bundle();  //Bundle 用在要傳遞資料大 或者有許多資料來源
        b.putString("msg", str);
        it.putExtras(b);
        startActivity(it);
    }

    public void click3(View v) {
        Intent it = new Intent(MainActivity.this, FourthActivity.class);
        startActivityForResult(it,REQUEST_CODE_FOR_NAME);  //requestCode =321
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {  //requestCode用來檢查是哪個按鈕  resultCode檢查有沒有按按鈕
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_CODE_FOR_NAME){
            if(resultCode==RESULT_OK) {
                TextView tv5 = (TextView) findViewById(R.id.textView5);
                tv5.setText(data.getStringExtra("ans"));
            }
        }
    }
}
