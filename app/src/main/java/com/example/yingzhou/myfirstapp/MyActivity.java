package com.example.yingzhou.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;

public class MyActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = ".MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

    }


    /** Called when the user taps the Send button */
    public void login(View view) {
        Intent intent = new Intent(this, FirstPageActivity.class);
     //   EditText editText = (EditText) findViewById(R.id.editText);
     //   String message = editText.getText().toString();
     //   intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
//    public void order(View v){
//        try{
//            AssetManager am = getAssets();
//            InputStream is = am.open("client.xls");
//            Workbook wb = Workbook.getWorkbook(is);
//            Sheet s= wb.getSheet(0);
//            int row = s.getRows();
//            int col = s.getColumns();
//            String xx = "";
//            for(int i = 0; i< row ; i++){
//                for(int c = 0; c< col ; c++){
//                    Cell z = s.getCell(c,i);
//                    xx = xx+z.getContents();
//                }
//                xx = xx + "\n";
//
//            }
//            display(xx);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public void display(String value){
//        TextView x = (TextView) findViewById(R.id.textView);
//        x.setText(value);
//    }
}
