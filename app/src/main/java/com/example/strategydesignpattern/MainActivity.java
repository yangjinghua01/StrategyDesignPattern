package com.example.strategydesignpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

import java.util.Timer;

import timber.log.Timber;

/**
 *策略模式定义了一系列算法，并将每一个算法封装起来，而且是他们之间可以互相切换
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = null;
//        imageView.setTranslationY();
        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView,"scaleY",0f,1f,2f);
        animator.setInterpolator(new DecelerateInterpolator());
        animator.setDuration(4000).start();
        Timber.d(String.format("hello,%s,%s","firstName","laseName"));
    }

private static class DebugTree extends Timber.Tree{
    @Override
    protected void log(int priority, String tag, String message, Throwable t) {
        Log.e(tag, message );
    }
}

    private static class CrashReportingTree extends Timber.Tree{
        @Override
        protected void log(int priority, String tag, String message, Throwable t) {
            if (priority== Log.VERBOSE||priority==Log.DEBUG){
                return;
            }
            FakeCrashLibrary.log(priority,tag,message);
            if (t!=null){
                if (priority==Log.ERROR){
                    FakeCrashLibrary.logError(t);
                }else if (priority == Log.WARN){
                    FakeCrashLibrary.logWarning(t);
                }
            }
        }
    }

}