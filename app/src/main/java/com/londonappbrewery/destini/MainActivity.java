package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
private Button mbuttontop;
private Button mbuttonbottom;
private TextView mstorytextview;
private int mstoryindex=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
mstorytextview=findViewById(R.id.storyTextView);
mbuttontop=(Button)findViewById(R.id.buttontop);
mbuttonbottom=(Button)findViewById(R.id.buttonbottom);
        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
mbuttontop.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
if (mstoryindex==1 || mstoryindex==2){
    mstorytextview.setText(R.string.T3_Story);
    mbuttontop.setText(R.string.T3_Ans1);
    mbuttonbottom.setText(R.string.T3_Ans2);
    mstoryindex=3;
} else if (mstoryindex==3){
mstorytextview.setText(R.string.T6_End);
    mbuttontop.setVisibility(View.GONE);
    mbuttonbottom.setVisibility(View.GONE);
}
    }
});
        {

        }


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
mbuttonbottom.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if (mstoryindex==1) {
            mstorytextview.setText(R.string.T2_Story);
            mbuttontop.setText(R.string.T2_Ans1);
            mbuttonbottom.setText(R.string.T2_Ans2);
            mstoryindex=2;
        } else if(mstoryindex==2){
            mstorytextview.setText(R.string.T4_End);
            mbuttontop.setVisibility(View.GONE);
            mbuttonbottom.setVisibility(View.GONE);
        } else if (mstoryindex==3){
            mstorytextview.setText(R.string.T5_End);
            mbuttontop.setVisibility(View.GONE);
            mbuttonbottom.setVisibility(View.GONE);
        }




    }
});

    }
}
