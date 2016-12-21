package com.example.csaper6.collegeapp.Presenter;

/**
 * Created by csaper6 on 12/15/16.
 */
    import android.app.Activity;
    import android.content.Intent;
    import android.os.Bundle;

    import com.example.csaper6.collegeapp.R;

/**
     * Created by vamsikrishna on 12-Feb-15.
     */
    public class Splash extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            // TODO Auto-generated method stub
            super.onCreate(savedInstanceState);
            setContentView(R.layout.splash);

            Thread timerThread = new Thread(){
                public void run(){
                    try{
                        sleep(3000);
                    }
                    catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    finally{
                        Intent intent = new Intent(Splash.this,LoginActivity.class);
                        startActivity(intent);
                    }
                }
            };
            timerThread.start();
        }

        @Override
        protected void onPause() {
            // TODO Auto-generated method stub
            super.onPause();
            finish();
        }

    }

