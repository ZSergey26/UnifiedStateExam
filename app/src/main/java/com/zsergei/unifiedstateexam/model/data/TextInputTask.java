package com.zsergei.unifiedstateexam.model.data;

import com.zsergei.unifiedstateexam.view.LearningView;

/**
 * Created by Sergei Zarochentsev on 27.11.2015.
 */
public class TextInputTask implements Task {
    private LearningView view;
    @Override
    public void learn(LearningView view) {
        this.view = view;
        view.showTextInputTaskScreen("text");
    }
}
