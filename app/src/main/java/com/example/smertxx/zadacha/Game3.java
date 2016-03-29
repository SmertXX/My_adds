package com.example.smertxx.zadacha;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Game3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game3);
    }
    public void ppp(View view)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void sendMail3(View view)
    {
        Intent mailIntent = new Intent(Intent.ACTION_SENDTO);

        mailIntent.setType("text/html");
        mailIntent.setData(Uri.parse("mailto:"));
        String[] e = new String[] {""};
        mailIntent.putExtra(Intent.EXTRA_EMAIL, e);
        mailIntent.putExtra(Intent.EXTRA_SUBJECT, "Рецепт вкусной пиццы");
        mailIntent.putExtra(Intent.EXTRA_TEXT, "ОСНОВНЫЕ ИНГРИДИЕНТЫ:\n" +
                "цукини: 1 шт.\n" +
                "лук красный: 1 шт.\n" +
                "сыр российский: 60 г\n" +
                "перец сладкий красный: ½ шт.\n" +
                "перец сладкий желтый: ½ шт.\n" +
                "масло оливковое: 20 мл\n" +
                "томатная паста: 20 г\n" +
                "уксус бальзамический: 5 мл\n" +
                "перец черный молотый: 5 г\n" +
                "соль морская: 5 г\n" +
                "мука пшеничная: 160 г\n" +
                "масло сливочное: 100 г\n" +
                "яйцо: 1 шт.");
        if (mailIntent.resolveActivity(getPackageManager())!= null){
            startActivity(mailIntent);
        }
    }
}
