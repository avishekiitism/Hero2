package com.example.hero;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Animation topanim, bottomanim;
    ImageView image;
    TextView slogon,logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        getWindow ( ).setFlags ( WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView ( R.layout.activity_main );
        topanim= AnimationUtils.loadAnimation (this, R.anim.top_animation );
        bottomanim= AnimationUtils.loadAnimation ( this, R.anim.bottom_animation );
        image=findViewById ( R.id.imageview );
        logo=findViewById ( R.id.textView );
        slogon=findViewById ( R.id.textView2 );

        image.setAnimation ( topanim );
        logo.setAnimation ( bottomanim );
        slogon.setAnimation ( bottomanim );

        new Handler ().postDelayed ( new Runnable () {
            @Override
            public void run() {
                Intent intent=new Intent (MainActivity.this, Login.class);
                startActivity ( intent );
                finish ();
            }
        },3000 );
    }
}