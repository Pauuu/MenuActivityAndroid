package com.example.pau.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


//cambiar herencia a QuizActivity
public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ListView menuList = (ListView) findViewById(R.id.ListView_Menu);

        String[] items = { getResources().getString(R.string.play),
                getResources().getString(R.string.help),
                getResources().getString(R.string.scores),
                getResources().getString(R.string.settings)
        };

        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, R.layout.menu_item, items);
       // CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), items);
        menuList.setAdapter(adapt);


       // menuList.setAdapter(adapt);
        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View itemClicked,
                                    int position, long id) {
                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString();
                if (strText.equalsIgnoreCase(getResources().getString(
                        R.string.play))) {
                    // Launch the Game Activity
                    startActivity(new Intent(MenuActivity.this,
                            GamePlayActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(
                        R.string.help))) {
                    // Launch the Help Activity
                    startActivity(new Intent(MenuActivity.this,
                            HelpActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(
                        R.string.settings))) {
                    // Launch the Settings Activity
                    startActivity(new Intent(MenuActivity.this,
                            SettingsActivity.class));
                } else if (strText.equalsIgnoreCase(getResources().getString(
                        R.string.scores))) {
                    // Launch the Scores Activity
                    startActivity(new Intent(MenuActivity.this,
                            ScoresActivity.class));
                }
            }
        });

        /*
        SharedPreferences settings = getSharedPreferences(GAME_PREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor prefEditor = settings.edit();
        prefEditor.putString("Nombre usr test", "El cocou");
        prefEditor.putInt("Edad", 22);
        prefEditor.commit();
        */
    }
}
