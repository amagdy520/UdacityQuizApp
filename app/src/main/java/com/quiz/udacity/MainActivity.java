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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


import com.github.jlmd.animatedcircleloadingview.AnimatedCircleLoadingView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Ahmed Magdy on 1/15/2018.
 */

public class MainActivity extends AppCompatActivity {


    private MyCountDownTimer myCountDownTimer;

    private AnimatedCircleLoadingView  animatedCircleLoadingView;

    private CardView cardView;

    private FloatingActionButton mStart, mFinishAnswer, mFinishCheckAnswer;

    private TextView mUsernameInput, mText, mScore , mPoints, mTextPoint ,mSkip,mQuestion,textCounter;

    private TextInputLayout mUsernameInputLayout;

    private LinearLayout linearLayout;

    private final int GALLERY_REQUEST=1;

    private Uri mImageUri = null;

    private CircleImageView mSelectImage,mSelectImage2;

    private int mScoreGet,mPoint;

    private TranslateAnimation anim1,anim2,anim3,anim4;

    private Button ans1,ans2,ans3,ans4;

    private Questions mQuestions = new Questions();

    private String mAnswer;

    private RadioButton mRadio1,mRadio2;

    private RadioGroup mRadioGroup;

    private EditText editText;

    private CheckBox mCheck1,mCheck2,mCheck3,mCheck4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewDefinition();

        mUsernameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                validateUsernameLength();
            }
        });

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
                            mScore.setText(String.valueOf(mScoreGet)+"/10");
                            getQuestion(mScoreGet);
                        }
                    },1000);
                }
                else
                {
                    animatedCircleLoadingView.stopFailure();
                    ans1.setBackgroundResource(R.drawable.answer_wrong);
                    mScoreGet++;
                    Toast.makeText(MainActivity.this,"Right Answer IS: "+mAnswer,Toast.LENGTH_SHORT).show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ans1.setBackgroundResource(R.drawable.answer_button);
                            animatedCircleLoadingView.resetLoading();
                            mScore.setText(String.valueOf(mScoreGet)+"/10");
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
                            mScore.setText(String.valueOf(mScoreGet)+"/10");
                            getQuestion(mScoreGet);
                        }
                    },1000);
                }
                else
                {
                    animatedCircleLoadingView.stopFailure();
                    ans2.setBackgroundResource(R.drawable.answer_wrong);
                    mScoreGet++;
                    Toast.makeText(MainActivity.this,"Right Answer IS: "+mAnswer,Toast.LENGTH_SHORT).show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ans2.setBackgroundResource(R.drawable.answer_button);
                            animatedCircleLoadingView.resetLoading();
                            mScore.setText(String.valueOf(mScoreGet)+"/10");
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
                            mScore.setText(String.valueOf(mScoreGet)+"/10");
                            getQuestion(mScoreGet);
                        }
                    },1000);
                }
                else
                {
                    animatedCircleLoadingView.stopFailure();
                    ans3.setBackgroundResource(R.drawable.answer_wrong);
                    mScoreGet++;
                    Toast.makeText(MainActivity.this,"Right Answer IS: "+mAnswer,Toast.LENGTH_SHORT).show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ans3.setBackgroundResource(R.drawable.answer_button);
                            animatedCircleLoadingView.resetLoading();
                            mScore.setText(String.valueOf(mScoreGet)+"/10");
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
                            mScore.setText(String.valueOf(mScoreGet)+"/10");
                            getQuestion(mScoreGet);
                        }
                    },1000);
                }
                else
                {
                    animatedCircleLoadingView.stopFailure();
                    ans4.setBackgroundResource(R.drawable.answer_wrong);
                    mScoreGet++;
                    Toast.makeText(MainActivity.this,"Right Answer IS: "+mAnswer,Toast.LENGTH_SHORT).show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            ans4.setBackgroundResource(R.drawable.answer_button);
                            animatedCircleLoadingView.resetLoading();
                            mScore.setText(String.valueOf(mScoreGet)+"/10");
                            getQuestion(mScoreGet);
                        }
                    },1000);
                }
            }
        });
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int selectId = mRadioGroup.getCheckedRadioButtonId();
                switch (selectId){
                    case R.id.answer1_true:
                        if(mRadio1.getText()== mAnswer){
                            animatedCircleLoadingView.stopOk();
                            mRadio1.setBackgroundResource(R.drawable.answer_right);
                            mPoint+=10;
                            mPoints.setText(String.valueOf(mPoint));
                            mScoreGet++;
                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    animatedCircleLoadingView.resetLoading();
                                    mScore.setText(String.valueOf(mScoreGet)+"/10");
                                    getQuestion(mScoreGet);
                                }
                            },1000);
                        }else{
                            animatedCircleLoadingView.stopFailure();
                            mRadio1.setBackgroundResource(R.drawable.answer_wrong);
                            mScoreGet++;
                            Toast.makeText(MainActivity.this,"Right Answer IS: "+mAnswer,Toast.LENGTH_SHORT).show();
                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    animatedCircleLoadingView.resetLoading();
                                    mScore.setText(String.valueOf(mScoreGet)+"/10");
                                    getQuestion(mScoreGet);
                                }
                            },1000);
                        }
                        break;
                    case R.id.answer2_false:
                        if(mRadio2.getText()== mAnswer){
                            animatedCircleLoadingView.stopOk();
                            mRadio2.setBackgroundResource(R.drawable.answer_right);
                            mPoint+=10;
                            mPoints.setText(String.valueOf(mPoint));
                            mScoreGet++;
                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    animatedCircleLoadingView.resetLoading();
                                    mScore.setText(String.valueOf(mScoreGet)+"/10");
                                    getQuestion(mScoreGet);
                                }
                            },1000);
                        }else{
                            animatedCircleLoadingView.stopFailure();
                            mRadio2.setBackgroundResource(R.drawable.answer_wrong);
                            mScoreGet++;
                            Toast.makeText(MainActivity.this,"Right Answer IS: "+mAnswer,Toast.LENGTH_SHORT).show();
                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    animatedCircleLoadingView.resetLoading();
                                    mScore.setText(String.valueOf(mScoreGet)+"/10");
                                    getQuestion(mScoreGet);
                                }
                            },1000);
                        }
                        break;
                }
            }
        });
        mFinishAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ch = editText.getText().toString().trim();
                if(ch.equalsIgnoreCase(mAnswer)){
                    animatedCircleLoadingView.stopOk();
                    editText.setBackgroundResource(R.drawable.answer_right);
                    mPoint+=10;
                    mPoints.setText(String.valueOf(mPoint));
                    mScoreGet++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            animatedCircleLoadingView.resetLoading();
                            mScore.setText(String.valueOf(mScoreGet)+"/10");
                            getQuestion(mScoreGet);
                        }
                    },1000);
                }else{
                    animatedCircleLoadingView.stopFailure();
                    editText.setBackgroundResource(R.drawable.answer_wrong);
                    mScoreGet++;
                    Toast.makeText(MainActivity.this,"Right Answer IS: "+mAnswer,Toast.LENGTH_SHORT).show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            animatedCircleLoadingView.resetLoading();
                            mScore.setText(String.valueOf(mScoreGet)+"/10");
                            getQuestion(mScoreGet);
                        }
                    },1000);
                }
            }
        });
        mFinishCheckAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mCheck1.isChecked()&&!mCheck2.isChecked()&&mCheck3.isChecked()&&mCheck4.isChecked()){
                    mCheck1.setBackgroundResource(R.drawable.answer_right);
                    mCheck2.setBackgroundResource(R.drawable.answer_wrong);
                    mCheck3.setBackgroundResource(R.drawable.answer_right);
                    mCheck4.setBackgroundResource(R.drawable.answer_right);
                    animatedCircleLoadingView.stopOk();
                    mPoint+=10;
                    mPoints.setText(String.valueOf(mPoint));
                    mScoreGet++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            animatedCircleLoadingView.resetLoading();
                            mScore.setText(String.valueOf(mScoreGet)+"/10");
                            getQuestion(mScoreGet);
                        }
                    },1000);
                }else{
                    mCheck1.setBackgroundResource(R.drawable.answer_right);
                    mCheck2.setBackgroundResource(R.drawable.answer_wrong);
                    mCheck3.setBackgroundResource(R.drawable.answer_right);
                    mCheck4.setBackgroundResource(R.drawable.answer_right);
                    animatedCircleLoadingView.stopFailure();
                    mScoreGet++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            animatedCircleLoadingView.resetLoading();
                            mScore.setText(String.valueOf(mScoreGet)+"/10");
                            getQuestion(mScoreGet);
                        }
                    },1000);
                }
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
        mRadio1 = (RadioButton) findViewById(R.id.answer1_true);
        mRadio2 = (RadioButton) findViewById(R.id.answer2_false);
        mRadioGroup = (RadioGroup) findViewById(R.id.radio_group);
        mFinishAnswer = (FloatingActionButton)findViewById(R.id.finish_answer);
        editText = (EditText)findViewById(R.id.answer_text);
        mCheck1 = (CheckBox)findViewById(R.id.check1);
        mCheck2 = (CheckBox)findViewById(R.id.check2);
        mCheck3 = (CheckBox)findViewById(R.id.check3);
        mCheck4 = (CheckBox)findViewById(R.id.check4);
        mFinishCheckAnswer = (FloatingActionButton) findViewById(R.id.finish_answer_check);
        mScoreGet=1;
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
        if (validateUsernameLength()){
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
                    mScore.setText(String.valueOf(mScoreGet)+"/10");
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
        if(a<=7 ) {
            mQuestion.setText(mQuestions.getQuestion(a));
            ans1.setText(mQuestions.getChoice1(a));
            ans2.setText(mQuestions.getChoice2(a));
            ans3.setText(mQuestions.getChoice3(a));
            ans4.setText(mQuestions.getChoice4(a));
            mAnswer = mQuestions.getCorrectAnswer(a);
        }else if(a==8){
            mQuestion.setText(mQuestions.getQuestion(a));
            ans1.setVisibility(View.INVISIBLE);
            ans2.setVisibility(View.INVISIBLE);
            ans3.setVisibility(View.INVISIBLE);
            ans4.setVisibility(View.INVISIBLE);
            mRadio1.setText(mQuestions.getChoice1(a));
            mRadio2.setText(mQuestions.getChoice2(a));
            mRadio1.setAnimation(anim1);
            mRadio1.setVisibility(View.VISIBLE);
            mRadio2.setAnimation(anim2);
            mRadio2.setVisibility(View.VISIBLE);
            mAnswer = mQuestions.getCorrectAnswer(a);
        }else if(a==9){
            mQuestion.setText(mQuestions.getQuestion(a));
            ans1.setVisibility(View.INVISIBLE);
            ans2.setVisibility(View.INVISIBLE);
            ans3.setVisibility(View.INVISIBLE);
            ans4.setVisibility(View.INVISIBLE);
            mRadio1.setVisibility(View.INVISIBLE);
            mRadio2.setVisibility(View.INVISIBLE);
            editText.setAnimation(anim1);
            editText.setVisibility(View.VISIBLE);
            mFinishAnswer.setAnimation(anim2);
            mFinishAnswer.setVisibility(View.VISIBLE);
            mAnswer = mQuestions.getCorrectAnswer(a);
        }else if(a==10){
            mQuestion.setText(mQuestions.getQuestion(a));
            ans1.setVisibility(View.INVISIBLE);
            ans2.setVisibility(View.INVISIBLE);
            ans3.setVisibility(View.INVISIBLE);
            ans4.setVisibility(View.INVISIBLE);
            mRadio1.setVisibility(View.INVISIBLE);
            mRadio2.setVisibility(View.INVISIBLE);
            editText.setVisibility(View.INVISIBLE);
            mFinishAnswer.setVisibility(View.INVISIBLE);
            mCheck1.setVisibility(View.VISIBLE);
            mCheck2.setVisibility(View.VISIBLE);
            mCheck3.setVisibility(View.VISIBLE);
            mCheck4.setVisibility(View.VISIBLE);
            mFinishCheckAnswer.setVisibility(View.VISIBLE);
            mCheck1.setText(mQuestions.getChoice1(a));
            mCheck2.setText(mQuestions.getChoice2(a));
            mCheck3.setText(mQuestions.getChoice3(a));
            mCheck4.setText(mQuestions.getChoice4(a));
            mAnswer = mQuestions.getWrongAnswerMultiple();
        }else{
            gameOver();
        }
    }
    public void gameOver(){
        mScoreGet = 10;
        mScore.setText(String.valueOf(mScoreGet)+"/10");
        Toast.makeText(this,"Your Score Is: "+mPoint+" Points.",Toast.LENGTH_SHORT).show();
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
        mScore.setText(String.valueOf(mScoreGet)+"/10");
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
