package com.zsergei.unifiedstateexam.model;

import com.zsergei.unifiedstateexam.model.data.AudioExerciseTask;
import com.zsergei.unifiedstateexam.model.data.Task;
import com.zsergei.unifiedstateexam.model.data.TextInputTask;
import com.zsergei.unifiedstateexam.model.data.TheoryLearnTask;
import com.zsergei.unifiedstateexam.presenter.IPresenter;
import com.zsergei.unifiedstateexam.presenter.Presenter;

import java.util.ArrayList;

/**
 * Created by Sergei Zarochentsev on 18.11.2015.
 */
public class Model implements IModel {

    IPresenter presenter;

    public Model(Presenter pres) {
        presenter = pres;
    }


    @Override
    public void getNext() {
        if (lastTaskNumber >= tasks.size() - 1) {
            return;
        }
        lastTask = tasks.get(++lastTaskNumber);
        presenter.setCurrentTask(lastTask);
    }

    @Override
    public void continueLearning() {
        restoreState();
        presenter.setCurrentTask(lastTask);
    }

    Task lastTask;
    ArrayList<Task> tasks;
    int lastTaskNumber = 0;

    private void restoreState() {
        tasks = new ArrayList<>();
        tasks.add(new TheoryLearnTask());
        tasks.add(new TextInputTask());
        tasks.add(new AudioExerciseTask());
        tasks.add(new TextInputTask());
        tasks.add(new TheoryLearnTask());
        tasks.add(new TextInputTask());

        lastTask = tasks.get(lastTaskNumber);

    }
}
