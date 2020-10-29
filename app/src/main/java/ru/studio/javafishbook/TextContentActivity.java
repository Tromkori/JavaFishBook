package ru.studio.javafishbook;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TextContentActivity extends AppCompatActivity {
    private TextView text_content;
    private Typeface face1;
    private int category=0;
    private int position=0;
    private int []fish_array = {R.string.fish_som,R.string.fish_burbot,R.string.fish_pike,R.string.fish_crucian};
    private int []rigging_array={R.string.rigging_float,R.string.rigging_spinning,R.string.rigging_feeder,R.string.rigging_feeder_lite};
    private int []bait_array = {R.string.bait_semolina,R.string.bait_bread,R.string.bait_worm,R.string.bait_aparis};
    private int []plant_food_array={R.string.Bait_for_riding_fish,R.string.White_fish_bait,
            R.string.Special_bait_for_bream,R.string.Special_bait_for_carp,};
    private int []tip_array={R.string.Fisheries_basins,R.string.Terms_of_spawning,};
    private int []fishing_stories_array={R.string.Fishing_in_autumn,R.string.How_to_cook};

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_content);
        init();
    }

    private void reciveIntent(){
        Intent i = getIntent();
        if (i!= null){
            category = i.getIntExtra("category",0);
            position = i.getIntExtra("position",0);
        }
        switch (category){
            case 0:
                text_content.setText(fish_array[position]);
                break;
            case 1:
                text_content.setText(rigging_array[position]);
                break;
            case 2:
                text_content.setText(bait_array[position]);
                break;
            case 3:
                text_content.setText(plant_food_array[position]);
                break;
            case 4:
                text_content.setText(fishing_stories_array[position]);
                break;
            case 5:
                text_content.setText(tip_array[position]);
                break;
        }
    }

    private void init(){
        text_content = findViewById(R.id.text_main_content);
        reciveIntent();
        face1 = Typeface.createFromAsset(this.getAssets(),"fonts/PlayfairDisplay-Italic-VariableFont_wght.ttf");
        text_content.setTypeface(face1);
    }
}
