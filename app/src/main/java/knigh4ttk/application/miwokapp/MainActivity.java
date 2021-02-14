package knigh4ttk.application.miwokapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView) findViewById(R.id.numbers);
        TextView famMem = (TextView) findViewById(R.id.famMem);
        TextView colors = (TextView) findViewById(R.id.colors);
        TextView phrases = (TextView) findViewById(R.id.phrases);
        TextView[] idList = {numbers, famMem, colors, phrases};
        final Class[] activity = new Class[]{NumbersActivity.class, FamilyActivity.class, ColorsActivity.class, PhrasesActivity.class};

        for (int i = 0; i < idList.length; i++) {
            final int finalI = i;
            idList[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, activity[finalI]);
                    startActivity(intent);
                }
            });
        }
    }
}