package com.example.smertxx.zadacha;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Game4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game4);
    }
    public void ppp(View view)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void sendMail4(View view)
    {
        Intent mailIntent = new Intent(Intent.ACTION_SENDTO);

        mailIntent.setType("text/html");
        mailIntent.setData(Uri.parse("mailto:"));
        String[] e = new String[] {""};
        mailIntent.putExtra(Intent.EXTRA_EMAIL, e);
        mailIntent.putExtra(Intent.EXTRA_SUBJECT, "Рецепт вкусной пиццы");
        mailIntent.putExtra(Intent.EXTRA_TEXT, "ОСНОВНЫЕ ИНГРИДИЕНТЫ:\n" +
                "кетчуп томатный: 4 ст. л.\n" +
                "чеснок: 1 ч. л.\n" +
                "майонез: 4 ст. л.\n" +
                "сыр: по вкусу\n" +
                "паприка красная молотая: по вкусу\n" +
                "перец черный молотый: по вкусу\n" +
                "лук красный: по вкусу\n" +
                "колбаса вареная: 200 гр.\n" +
                "помидоры: 1 шт.\n" +
                "мука: по вкусу\n" +
                "тесто дрожжевое: 250 гр.");
        if (mailIntent.resolveActivity(getPackageManager())!= null){
            startActivity(mailIntent);
        }
    }
}
