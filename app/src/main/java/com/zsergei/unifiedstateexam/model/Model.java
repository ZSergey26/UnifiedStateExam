package com.zsergei.unifiedstateexam.model;

import com.zsergei.unifiedstateexam.model.data.Task;
import com.zsergei.unifiedstateexam.model.data.TheoryLearnTask;
import com.zsergei.unifiedstateexam.presenter.IPresenter;
import com.zsergei.unifiedstateexam.presenter.Presenter;

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

    }

    @Override
    public void continueLearning() {
        restoreState();
        presenter.setCurrentTask(lastTask);
    }

    Task lastTask;
    private void restoreState() {
        lastTask = new TheoryLearnTask();
    }
}
