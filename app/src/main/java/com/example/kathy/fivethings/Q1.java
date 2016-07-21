package com.example.kathy.fivethings;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.AlertDialog;

public class Q1 extends AppCompatActivity {

    ImageView failImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        failImage = (ImageView) findViewById(R.id.oops);
        failImage.setAlpha(0.0f);
        failImage.setVisibility(View.GONE);

        failImage.setOnClickListener(resumeAnswer);
    }

    public void judgeOne (View view)
    {
        TextView QuestionName = (TextView) findViewById(R.id.question);
        String ques = QuestionName.getText().toString();
        Log.d("Name", ques);

        switch (ques)
        {
            case "Which is NOT a trash can at Disneyland?" : {
                ImageView im1 = (ImageView) findViewById(R.id.ans1);
                ImageView im2 = (ImageView) findViewById(R.id.ans2);
                ImageView im3 = (ImageView) findViewById(R.id.ans3);
                ImageView im4 = (ImageView) findViewById(R.id.ans4);
                im1.setImageResource(R.drawable.food1);
                im2.setImageResource(R.drawable.food2);
                im3.setImageResource(R.drawable.food3);
                im4.setImageResource(R.drawable.food4);
                QuestionName.setText("What is NOT sold at Disneyland?");
                break;
            }
            default:
            {
                failImage.animate()
                        .alpha(1.0f)
                        .setDuration(2000)
                        .setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationStart(Animator animation) {
                                super.onAnimationStart(animation);
                                failImage.setVisibility(View.VISIBLE);
                            }
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                super.onAnimationEnd(animation);
                            }
                        });
                break;
            }
        }
    }

    public void judgeTwo (View view)
    {
        TextView QuestionName = (TextView) findViewById(R.id.question);
        String ques = QuestionName.getText().toString();
        Log.d("Name", ques);

        switch (ques)
        {
            case "How much is the opening ticket?" : {
                ImageView im1 = (ImageView) findViewById(R.id.ans1);
                ImageView im2 = (ImageView) findViewById(R.id.ans2);
                ImageView im3 = (ImageView) findViewById(R.id.ans3);
                ImageView im4 = (ImageView) findViewById(R.id.ans4);
                im1.setImageResource(R.drawable.can1);
                im2.setImageResource(R.drawable.can2);
                im3.setImageResource(R.drawable.can3);
                im4.setImageResource(R.drawable.can4);
                QuestionName.setText("Which is NOT a trash can at Disneyland?");
                break;
            }

            case "When is Disneyland's opening day?" : {
                ImageView im1 = (ImageView) findViewById(R.id.ans1);
                ImageView im2 = (ImageView) findViewById(R.id.ans2);
                ImageView im3 = (ImageView) findViewById(R.id.ans3);
                ImageView im4 = (ImageView) findViewById(R.id.ans4);
                im1.setImageResource(R.drawable.price1);
                im2.setImageResource(R.drawable.price2);
                im3.setImageResource(R.drawable.price3);
                im4.setImageResource(R.drawable.price4);
                QuestionName.setText("How much is the opening ticket?");
                break;
            }
            default:
            {
                failImage.animate()
                        .alpha(1.0f)
                        .setDuration(2000)
                        .setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationStart(Animator animation) {
                                super.onAnimationStart(animation);
                                failImage.setVisibility(View.VISIBLE);
                            }
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                super.onAnimationEnd(animation);
                            }
                        });
                break;
            }
        }
    }

    public void judgeThree (View view)
    {
        TextView QuestionName = (TextView) findViewById(R.id.question);
        String ques = QuestionName.getText().toString();
        Log.d("Name", ques);

        switch (ques)
        {
            default:
            {
                failImage.animate()
                        .alpha(1.0f)
                        .setDuration(2000)
                        .setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationStart(Animator animation) {
                                super.onAnimationStart(animation);
                                failImage.setVisibility(View.VISIBLE);
                            }
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                super.onAnimationEnd(animation);
                            }
                        });
                break;
            }
        }
    }

    public void judgeFour (View view)
    {
        TextView QuestionName = (TextView) findViewById(R.id.question);
        String ques = QuestionName.getText().toString();
        Log.d("Name", ques);

        switch (ques)
        {
            case "Where is Disneyland?" : {
                ImageView im1 = (ImageView) findViewById(R.id.ans1);
                ImageView im2 = (ImageView) findViewById(R.id.ans2);
                ImageView im3 = (ImageView) findViewById(R.id.ans3);
                ImageView im4 = (ImageView) findViewById(R.id.ans4);
                im1.setImageResource(R.drawable.year1);
                im2.setImageResource(R.drawable.year2);
                im3.setImageResource(R.drawable.year3);
                im4.setImageResource(R.drawable.year4);
                QuestionName.setText("When is Disneyland's opening day?");
                break;
            }

            case "What is NOT sold at Disneyland?" : {
                onBackPressed();
                break;
            }
            default:
            {
                failImage.animate()
                        .alpha(1.0f)
                        .setDuration(2000)
                        .setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationStart(Animator animation) {
                                super.onAnimationStart(animation);
                                failImage.setVisibility(View.VISIBLE);
                            }
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                super.onAnimationEnd(animation);
                            }
                        });
                break;
            }
        }
    }

    public View.OnClickListener resumeAnswer = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            failImage.setAlpha(0.0f);
            failImage.setVisibility(View.GONE);
        }
    };

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("Closing App")
                .setMessage("End of Game.\nClosing App.")
                .setPositiveButton("OK", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }

                })
                .show();
    }

}
