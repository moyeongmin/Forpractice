package com.example.forpractice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.ramotion.circlemenu.CircleMenuView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nextbtn = findViewById(R.id.button);
//        var items = document.querySelectorAll('.circle a');
//
//        for(var i = 0, l = items.length; i < l; i++) {
//            items[i].style.left = (50 - 35*Math.cos(-0.5 * Math.PI - 2*(1/l)*i*Math.PI)).toFixed(4) + "%";
//
//            items[i].style.top = (50 + 35*Math.sin(-0.5 * Math.PI - 2*(1/l)*i*Math.PI)).toFixed(4) + "%";
//        }
//
//        document.querySelector('.menu-button').onclick = function(e) {
//            e.preventDefault(); document.querySelector('.circle').classList.toggle('open');
//        }
        final CircleMenuView menu = findViewById(R.id.circle_menu);
        menu.setEventListener(new CircleMenuView.EventListener(){
            @Override
            public void onMenuOpenAnimationStart(@NonNull CircleMenuView view) {
                Log.d("D","onMenuOpenAnimationStart");
            }

            @Override
            public void onMenuOpenAnimationEnd(@NonNull CircleMenuView view) {
                Log.d("D","onMenuOpenAnimationEnd");
            }

            @Override
            public void onMenuCloseAnimationStart(@NonNull CircleMenuView view) {
                Log.d("D","onMenuCloseAnimationStart");
            }

            @Override
            public void onMenuCloseAnimationEnd(@NonNull CircleMenuView view) {
                Log.d("D","onMenuCloseAnimationEnd");
            }

            @Override
            public void onButtonClickAnimationStart(@NonNull CircleMenuView view, int index) {
                Log.d("D","onButtonClickAnimationStart|index : "+index);
            }

            @Override
            public void onButtonClickAnimationEnd(@NonNull CircleMenuView view, int index) {
                Log.d("D","onButtonClickAnimationEnd|index : "+index);
            }

            @Override
            public boolean onButtonLongClick(@NonNull CircleMenuView view, int buttonIndex) {
                Log.d("D","onButtonLongClick|index : "+buttonIndex );
                return false;
            }

            @Override
            public void onButtonLongClickAnimationStart(@NonNull CircleMenuView view, int buttonIndex) {
                Log.d("D","onButtonLongClickAnimationStart|index : "+buttonIndex );
            }

            @Override
            public void onButtonLongClickAnimationEnd(@NonNull CircleMenuView view, int buttonIndex) {
                Log.d("D","onButtonLongClickAnimationEnd|index : "+buttonIndex );
            }
        });



        nextbtn.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,secondactivity.class);
                startActivity(i);
                //10.23 14:45 test1
                //18:23 test2
                //19:07 test3

            }
        });
}
}