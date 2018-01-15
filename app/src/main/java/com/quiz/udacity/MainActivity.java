package com.quiz.udacity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.github.jlmd.animatedcircleloadingview.AnimatedCircleLoadingView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Ahmed Magdy on 1/15/2018.
 */

public class MainActivity extends AppCompatActivity {
    private MyCountDownTimer myCountDownTimer;
    private AnimatedCircleLoadingView  animatedCircleLoadingView;
    private CardView cardView;
    private FloatingActionButton mStart;
    private TextView mUsernameInput, mText, mScore , mPoints, mTextPoint ,mSkip,mQuestion,textCounter;
    private TextInputLayout mUsernameInputLayout;
    private LinearLayout linearLayout;
    private final int GALLERY_REQUEST=1;
    private Uri mImageUri = null;
    private CircleImageView mSelectImage,mSelectImage2;
    private int mScoreGet = 0,mPoint = 0;
    private TranslateAnimation anim1,anim2,anim3,anim4;
    private Button ans1,ans2,ans3,ans4;
    private Questions mQuestions = new Questions();
    private String mAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewDefinition();
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans1.getText() == mAnswer){
                    animatedCircleLoadingView.stopOk();
                    ans1.setBackgroundResource(R.drawable.answer_right);
                    mPoint+=10;
                    mPoints.setText(String.valueOf(mPoint));
                    mScoreGet++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ans1.setBackgroundResource(R.drawable.answer_button);
                            animatedCircleLoadingView.resetLoading();
                            mScore.setText(String.valueOf(mScoreGet)+"/9");
                            getQuestion(mScoreGet);
                        }
                    },1000);
                }
                else
                {
                    animatedCircleLoadingView.stopFailure();
                    ans1.setBackgroundResource(R.drawable.answer_wrong);
                    mScoreGet++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ans1.setBackgroundResource(R.drawable.answer_button);
                            animatedCircleLoadingView.resetLoading();
                            mScore.setText(String.valueOf(mScoreGet)+"/9");
                            getQuestion(mScoreGet);
                        }
                    },1000);
                }
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans2.getText() == mAnswer){
                    animatedCircleLoadingView.stopOk();
                    ans2.setBackgroundResource(R.drawable.answer_right);
                    mPoint+=10;
                    mPoints.setText(String.valueOf(mPoint));
                    mScoreGet++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ans2.setBackgroundResource(R.drawable.answer_button);
                            animatedCircleLoadingView.resetLoading();
                            mScore.setText(String.valueOf(mScoreGet)+"/9");
                            getQuestion(mScoreGet);
                        }
                    },1000);
                }
                else
                {
                    animatedCircleLoadingView.stopFailure();
                    ans2.setBackgroundResource(R.drawable.answer_wrong);
                    mScoreGet++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ans2.setBackgroundResource(R.drawable.answer_button);
                            animatedCircleLoadingView.resetLoading();
                            mScore.setText(String.valueOf(mScoreGet)+"/9");
                            getQuestion(mScoreGet);
                        }
                    },1000);
                }
            }
        });
        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans3.getText() == mAnswer){
                    animatedCircleLoadingView.stopOk();
                    ans3.setBackgroundResource(R.drawable.answer_right);
                    mPoint+=10;
                    mPoints.setText(String.valueOf(mPoint));
                    mScoreGet++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ans3.setBackgroundResource(R.drawable.answer_button);
                            animatedCircleLoadingView.resetLoading();
                            mScore.setText(String.valueOf(mScoreGet)+"/9");
                            getQuestion(mScoreGet);
                        }
                    },1000);
                }
                else
                {
                    animatedCircleLoadingView.stopFailure();
                    ans3.setBackgroundResource(R.drawable.answer_wrong);
                    mScoreGet++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ans3.setBackgroundResource(R.drawable.answer_button);
                            animatedCircleLoadingView.resetLoading();
                            mScore.setText(String.valueOf(mScoreGet)+"/9");
                            getQuestion(mScoreGet);
                        }
                    },1000);
                }
            }
        });
        ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ans4.getText() == mAnswer){
                    animatedCircleLoadingView.stopOk();
                    ans4.setBackgroundResource(R.drawable.answer_right);
                    mPoint+=10;
                    mPoints.setText(String.valueOf(mPoint));
                    mScoreGet++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ans4.setBackgroundResource(R.drawable.answer_button);
                            animatedCircleLoadingView.resetLoading();
                            mScore.setText(String.valueOf(mScoreGet)+"/9");
                            getQuestion(mScoreGet);
                        }
                    },1000);
                }
                else
                {
                    animatedCircleLoadingView.stopFailure();
                    ans4.setBackgroundResource(R.drawable.answer_wrong);
                    mScoreGet++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ans4.setBackgroundResource(R.drawable.answer_button);
                            animatedCircleLoadingView.resetLoading();
                            mScore.setText(String.valueOf(mScoreGet)+"/9");
                            getQuestion(mScoreGet);
                        }
                    },1000);
                }
            }
        });
        mUsernameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                validateUsernameDuplicate();
                validateUsernameLength();
            }
        });
    }
    public void viewDefinition(){
        mUsernameInput = (TextView) findViewById(R.id.input_username);
        mUsernameInputLayout = (TextInputLayout) findViewById(R.id.input_username_layout);
        mQuestion = (TextView)findViewById(R.id.question);
        ans1 = (Button)findViewById(R.id.answer1);
        ans2 = (Button)findViewById(R.id.answer2);
        ans3 = (Button)findViewById(R.id.answer3);
        ans4 = (Button)findViewById(R.id.answer4);
        cardView = (CardView)findViewById(R.id.container);
        mStart = (FloatingActionButton)findViewById(R.id.start_quiz);
        linearLayout = (LinearLayout)findViewById(R.id.welcome);
        mSelectImage = (CircleImageView) findViewById(R.id.profile_image);
        mSelectImage2 = (CircleImageView) findViewById(R.id.profile_image2);
        mText = (TextView)findViewById(R.id.user);
        mScore = (TextView)findViewById(R.id.score);
        mPoints = (TextView) findViewById(R.id.points);
        mTextPoint = (TextView)findViewById(R.id.txt_points);
        mSkip = (TextView)findViewById(R.id.skip);
        textCounter = (TextView)findViewById(R.id.counter);
        animatedCircleLoadingView = (AnimatedCircleLoadingView) findViewById(R.id.circle_loading_view);
        anim1 = new TranslateAnimation(-1000f, 0f, 0f, 0f);
        anim1.setDuration(1000);
        anim2 = new TranslateAnimation(-1000f, 0f, 0f, 0f);
        anim2.setDuration(2000);
        anim3 = new TranslateAnimation(-1000f, 0f, 0f, 0f);
        anim3.setDuration(3000);
        anim4 = new TranslateAnimation(-1000f, 0f, 0f, 0f);
        anim4.setDuration(4000);
        animatedCircleLoadingView.setPercent(10);
        myCountDownTimer = new MyCountDownTimer(60*1000, 1000);
    }
    private boolean validateUsernameDuplicate() {
        boolean isValid = true;
        return isValid;
    }
    private boolean validateUsernameLength() {
        boolean isValid;
        String username = mUsernameInput.getText().toString().trim();
        if (username.length() == 0) {
            mUsernameInput.setError(getString(R.string.empty_username));
            mUsernameInputLayout.setErrorEnabled(true);
            isValid = false;
        } else if (username.length() > 20) {
            mUsernameInput.setError(getString(R.string.too_long_username));
            mUsernameInputLayout.setErrorEnabled(true);
            isValid = false;
        } else {
            mUsernameInputLayout.setErrorEnabled(false);
            isValid = true;
        }
        return isValid;
    }
    public void animateView(View view){
        if (validateUsernameDuplicate() && validateUsernameLength()){
            cardView.animate()
                    .translationY(0)
                    .alpha(0.0f)
                    .setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animation) {
                            super.onAnimationEnd(animation);
                            cardView.setVisibility(View.GONE);
                        }
                    });
            mStart.animate()
                    .translationY(200)
                    .alpha(0.0f)
                    .setListener(null);
            linearLayout.animate()
                    .translationY(-500)
                    .alpha(0.0f)
                    .setListener(null);
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mSelectImage2.setVisibility(View.VISIBLE);
                    mText.setText(mUsernameInput.getText().toString());
                    mScore.setText(String.valueOf(mScoreGet)+"/9");
                    mSkip.setVisibility(View.VISIBLE);
                    mPoints.setVisibility(View.VISIBLE);
                    mTextPoint.setVisibility(View.VISIBLE);
                    textCounter.setVisibility(View.VISIBLE);
                    mQuestion.setVisibility(View.VISIBLE);
                    ans1.setAnimation(anim1);
                    ans1.setVisibility(View.VISIBLE);
                    ans2.setAnimation(anim2);
                    ans2.setVisibility(View.VISIBLE);
                    ans3.setAnimation(anim3);
                    ans3.setVisibility(View.VISIBLE);
                    ans4.setAnimation(anim4);
                    ans4.setVisibility(View.VISIBLE);
                    getQuestion(mScoreGet);
                }
            }, 500);

            animatedCircleLoadingView.startDeterminate();
            myCountDownTimer.start();
        }
    }
    public void getQuestion(int a){
        if(a<=9 ) {
            mQuestion.setText(mQuestions.getQuestion(a));
            ans1.setText(mQuestions.getChoice1(a));
            ans2.setText(mQuestions.getChoice2(a));
            ans3.setText(mQuestions.getChoice3(a));
            ans4.setText(mQuestions.getChoice4(a));
            mAnswer = mQuestions.getCorrectAnswer(a);
        }else if(a>9){
            gameOver();
        }
    }
    public void gameOver(){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Game Over Your Score Is: "+mPoint+" Points.")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                            }
                        })
                .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                            }
                        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    public void skipQuestion(View view){
        mScoreGet++;
        getQuestion(mScoreGet);
        mScore.setText(String.valueOf(mScoreGet)+"/9");
    }
    public void chooseImage(View view){
        Intent galleryIntent = new Intent(Intent.ACTION_GET_CONTENT);
        galleryIntent.setType("image/*");
        startActivityForResult(galleryIntent,GALLERY_REQUEST);
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == GALLERY_REQUEST && resultCode == RESULT_OK) {
            mImageUri = data.getData();
            mSelectImage.setImageURI(mImageUri);
            mSelectImage2.setImageURI(mImageUri);
        }
    }
    public class MyCountDownTimer extends CountDownTimer {

        public MyCountDownTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            int progress = (int) (millisUntilFinished/1000);
            textCounter.setText("00:"+String.valueOf(progress));
        }

        @Override
        public void onFinish() {
            gameOver();
        }

    }
}
