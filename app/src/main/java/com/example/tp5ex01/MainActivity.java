package com.example.tp5ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Mail(View view){
        String to="friendmail@gmail.com";
        String message="Hi,how are you!\n\nThis is my test email";
        String sub="test";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL,new String[]{ to});
        email.putExtra(Intent.EXTRA_SUBJECT,sub);
        email.putExtra(Intent.EXTRA_TEXT,message);
        email.setType("message/rfc822");
        startActivity(email);
    }
    public void Google(View view){
        String ulr="https://google.fr";
        Intent gg=new Intent(Intent.ACTION_VIEW, Uri.parse(ulr));
        startActivity(gg);
    }
    public void Mes(View view){
        Intent sendIntent = new Intent(Intent.ACTION_VIEW);
        sendIntent.putExtra("address"  , new String("0411518747"));
        sendIntent.putExtra("sms_body", "Bonjour ENPO!");
        sendIntent.setType("vnd.android-dir/mms-sms");
        startActivity(sendIntent);
    }
}