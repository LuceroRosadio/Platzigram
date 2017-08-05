package com.platzi.platzigram.login.view;

/**
 * Created by Lucero on 26/06/2017.
 */

public interface LoginView {

    void goCreateAccount();
    void goHome();

    void enableInputs();
    void disableInputs();

    void showProgressBar();
    void hideProgressBar();

    void loginError(String error);
}
