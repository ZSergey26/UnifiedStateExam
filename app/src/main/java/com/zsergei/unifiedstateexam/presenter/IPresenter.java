package com.zsergei.unifiedstateexam.presenter;

import com.zsergei.unifiedstateexam.model.data.Task;

/**
 * Created by Sergei Zarochentsev on 27.11.2015.
 */
public interface IPresenter {
    void next();

    void continueLearning();

    void setCurrentTask(Task task);
}
