package com.example.smertxx.zadacha;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Game1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);
    }
    public void ppp(View view)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
    public void sendMail1(View view)
    {
        Intent mailIntent = new Intent(Intent.ACTION_SENDTO);

        mailIntent.setType("text/html");
        mailIntent.setData(Uri.parse("mailto:"));
        String[] e = new String[] {""};
        mailIntent.putExtra(Intent.EXTRA_EMAIL, e);
        mailIntent.putExtra(Intent.EXTRA_SUBJECT, "Рецепт вкусной пиццы");
        mailIntent.putExtra(Intent.EXTRA_TEXT, "ОСНОВНЫЕ ИНГРИДИЕНТЫ:\n" +
                "перцовая паста: 1 ст. л.\n" +
                "оливковое масло: 1 ст. л.\n" +
                "перец болгарский зеленый: 1 шт.\n" +
                "помидоры черри: 2 шт.\n" +
                "сыр: 6 кусков\n" +
                "моцарелла: 25 г\n" +
                "маслины без косточек: 3 шт.\n" +
                "сосиски: 1 шт.\n" +
                "хлеб серый: 3 куска");
        if (mailIntent.resolveActivity(getPackageManager())!= null){
            startActivity(mailIntent);
        }
    }
}
