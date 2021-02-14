package knigh4ttk.application.miwokapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    WordAdapter itemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ArrayList<Word> wordsList = new ArrayList<>();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        wordsList = populateData(wordsList);

        itemsAdapter = new WordAdapter(this, wordsList);
        ListView listView = (ListView) findViewById(R.id.rootViewColors);

        listView.setAdapter(itemsAdapter);
    }

    public ArrayList<Word> populateData(ArrayList<Word> wordsList) {
        int numberListSize = 8;

        for (int i = 0; i < numberListSize; i++) {
            Word w = new Word();
            w.englishWord = getEngWord(i);
            w.miwokWord = getMiwokWord(i);
            w.image = getMiwokNumbersImageList(i);
            w.play = getMediaPlayList(i);
            wordsList.add(w);
        }
        return wordsList;
    }

    public String getMiwokWord(int numberName) {
        switch (numberName) {
            case 0:
                return getString(R.string.MiwokRed);
            case 1:
                return getString(R.string.Miwokgreen);
            case 2:
                return getString(R.string.Miwokbrown);
            case 3:
                return getString(R.string.Miwokgray);
            case 4:
                return getString(R.string.Miwokblack);
            case 5:
                return getString(R.string.Miwokwhite);
            case 6:
                return getString(R.string.MiwokdustyYellow);
            case 7:
                return getString(R.string.MiwokmustardYellow);
            default:
        }
        return null;
    }

    public int getMiwokNumbersImageList(int numberName) {
        switch (numberName) {
            case 0:
                return R.drawable.color_red;
            case 1:
                return R.drawable.color_green;
            case 2:
                return R.drawable.color_brown;
            case 3:
                return R.drawable.color_gray;
            case 4:
                return R.drawable.color_black;
            case 5:
                return R.drawable.color_white;
            case 6:
                return R.drawable.color_dusty_yellow;
            case 7:
                return R.drawable.color_mustard_yellow;
            default:
        }
        return 0;
    }

    public int getMediaPlayList(int numberName) {
        switch (numberName) {
            case 0:
                return R.raw.color_red;
            case 1:
                return R.raw.color_green;
            case 2:
                return R.raw.color_brown;
            case 3:
                return R.raw.color_gray;
            case 4:
                return R.raw.color_black;
            case 5:
                return R.raw.color_white;
            case 6:
                return R.raw.color_dusty_yellow;
            case 7:
                return R.raw.color_mustard_yellow;
            default:
                return 0;
        }
    }

    public String getEngWord(int numberName) {
        switch (numberName) {
            case 0:
                return getString(R.string.EngRed);
            case 1:
                return getString(R.string.Enggreen);
            case 2:
                return getString(R.string.Engbrown);
            case 3:
                return getString(R.string.Enggray);
            case 4:
                return getString(R.string.Engblack);
            case 5:
                return getString(R.string.Engwhite);
            case 6:
                return getString(R.string.EngdustyYellow);
            case 7:
                return getString(R.string.EngmustardYellow);
            default:
        }
        return null;
    }

    @Override
    protected void onStop() {
        super.onStop();
        itemsAdapter.releaseMediaPlayer();
    }
}


