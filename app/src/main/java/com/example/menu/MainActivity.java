package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        TextView headerView = findViewById(R.id.selectedMenuItem);
        switch (id) {
            case R.id.camera:
                headerView.setText("ДЕЙСТВИЕ МЕНЮ 'КАМЕРА'");
                return true;

            case R.id.call:
                headerView.setText("ДЕЙСТВИЕ МЕНЮ 'ВЫЗОВ'");
                return true;

            case R.id.video:
                headerView.setText("ДЕЙСТВИЕ МЕНЮ 'ВИДЕО'");
                return true;

            case R.id.email:
                headerView.setText("ДЕЙСТВИЕ МЕНЮ 'ПОЧТА'");
                return true;

            case R.id.add:
                headerView.setText("ДЕЙСТВИЕ МЕНЮ 'ДОБАВИТЬ'");
                return true;

            case R.id.copy:
                headerView.setText("ДЕЙСТВИЕ МЕНЮ 'СКОПИРОВАТЬ'");
                return true;

            case R.id.paste:
                headerView.setText("ДЕЙСТВИЕ МЕНЮ 'ВСТАВИТЬ'");
                return true;

            case R.id.help:
                headerView.setText("ДЕЙСТВИЕ МЕНЮ 'ПОМОЩЬ'");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}