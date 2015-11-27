package com.zsergei.unifiedstateexam.view.activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.zsergei.unifiedstateexam.R;
import com.zsergei.unifiedstateexam.presenter.IPresenter;
import com.zsergei.unifiedstateexam.presenter.Presenter;
import com.zsergei.unifiedstateexam.view.LearningView;
import com.zsergei.unifiedstateexam.view.fragment.TextInputFragment;
import com.zsergei.unifiedstateexam.view.fragment.TextTheoryFragment;

public class LearningActivity extends BaseActivity implements LearningView {

    private IPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learning_activity);

        presenter = new Presenter(this);
        //showTheoryScreen("Theory");
    }


    @Override
    public void showTheoryScreen(String text) {
        replaceFragment(R.id.learning_container_for_fragments, new TextTheoryFragment());
    }

    public void theoryLearningComplete(View view) {
        showToast("ВЫПЬЕМ ЗА ЛЮБОВЬ");
    }
}
