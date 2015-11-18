package com.zsergei.unifiedstateexam.view.activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.zsergei.unifiedstateexam.R;
import com.zsergei.unifiedstateexam.view.LearningView;
import com.zsergei.unifiedstateexam.view.fragment.TextInputFragment;
import com.zsergei.unifiedstateexam.view.fragment.TextTheoryFragment;

public class LearningActivity extends BaseActivity implements LearningView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learning_activity);

        replaceFragment(R.id.learning_container_for_fragments, new TextInputFragment());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_learning, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void showTheoryScreen(String text) {
        replaceFragment(R.id.learning_container_for_fragments, new TextTheoryFragment());
    }
}
