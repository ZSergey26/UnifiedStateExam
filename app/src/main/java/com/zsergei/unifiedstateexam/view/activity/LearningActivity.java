package com.zsergei.unifiedstateexam.view.activity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.zsergei.unifiedstateexam.R;
import com.zsergei.unifiedstateexam.presenter.IPresenter;
import com.zsergei.unifiedstateexam.presenter.Presenter;
import com.zsergei.unifiedstateexam.view.LearningView;
import com.zsergei.unifiedstateexam.view.fragment.AudioFragment;
import com.zsergei.unifiedstateexam.view.fragment.TextInputFragment;
import com.zsergei.unifiedstateexam.view.fragment.TextTheoryFragment;

import java.io.IOException;

public class LearningActivity extends BaseActivity implements LearningView {

    private IPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learning_activity);

        presenter = new Presenter(this);
        presenter.continueLearning();
        //showTheoryScreen("Theory");
    }


    @Override
    public void showTheoryScreen(String text) {
        replaceFragment(R.id.learning_container_for_fragments, new TextTheoryFragment());
    }

    @Override
    public void showTextInputTaskScreen(String text) {
        replaceFragment(R.id.learning_container_for_fragments, new TextInputFragment());
    }

    @Override
    public void showAudioScreen(String s) {
        replaceFragment(R.id.learning_container_for_fragments, new AudioFragment());
    }

    public void theoryLearningComplete(View view) {
        presenter.next();
    }

    public void playAudio(View view) {
        String url = "http://cs611629v4.vk.me/u136978050/audios/bb2b0a607087.mp3?extra=j-rbyLoPXqVSAB8MFKjPSdcwiRfkp2iXTODiIxNxuDXIU63ABzEKnB7puZyUn6cBPKACvpMAziAvXBI0jBCZRZcxmNfhvNaFDRg";
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer.setDataSource(url);
            mediaPlayer.prepareAsync();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
            }
        });

    }
}
