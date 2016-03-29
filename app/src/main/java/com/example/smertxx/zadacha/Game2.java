package com.example.smertxx.zadacha;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Game2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);
    }
    public void ppp(View view)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void sendMail2(View view)
    {
        Intent mailIntent = new Intent(Intent.ACTION_SENDTO);

        mailIntent.setType("text/html");
        mailIntent.setData(Uri.parse("mailto:"));
        String[] e = new String[] {""};
        mailIntent.putExtra(Intent.EXTRA_EMAIL, e);
        mailIntent.putExtra(Intent.EXTRA_SUBJECT, "Рецепт вкусной пиццы");
        mailIntent.putExtra(Intent.EXTRA_TEXT, "ОСНОВНЫЕ ИНГРИДИЕНТЫ:\n" +
                "яйца куриные: 2 шт.\n" +
                "приправы: ½ ч. л.\n" +
                "хлеб: 5 кусков\n" +
                "\n" +
                "НАЧИНКА:\n" +
                "колбаса копченая: 50 г\n" +
                "лук красный: ½ шт.\n" +
                "перец болгарский: ½ шт.\n" +
                "сыр: 1 горсть ");
        if (mailIntent.resolveActivity(getPackageManager())!= null){
            startActivity(mailIntent);
        }
    }
}
