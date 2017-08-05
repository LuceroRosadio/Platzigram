package com.platzi.platzigram.login.presenter;

/**
 * Created by Lucero on 26/06/2017.
 */

public interface LoginPresenter {

    void signIn(String username, String passwsord); //interactor
    void loginSuccess();
    void loginError(String error);
}
