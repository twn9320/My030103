package com.example.yvtc.my030103;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }
    public void clickOK(View v){
        EditText ed2 = (EditText)findViewById(R.id.editText2);
        Intent it = new Intent();
        it.putExtra("ans",ed2.getText().toString());
        setResult(RESULT_OK,it);
        finish();
    }
}
