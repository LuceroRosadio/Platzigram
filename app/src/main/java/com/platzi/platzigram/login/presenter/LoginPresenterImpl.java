package com.platzi.platzigram.login.presenter;

import com.platzi.platzigram.login.interactor.LoginInteractor;
import com.platzi.platzigram.login.interactor.LoginInteractorImpl;
import com.platzi.platzigram.login.view.LoginView;

/**
 * Created by Lucero on 26/06/2017.
 */

public class LoginPresenterImpl implements LoginPresenter {

    private LoginView loginView;
    private LoginInteractor interactor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        interactor = new LoginInteractorImpl(this);
    }

    @Override
    public void signIn(String username, String passwsord) {
        loginView.disableInputs();
        loginView.showProgressBar();

        interactor.signIn(username, passwsord);
    }

    @Override
    public void loginSuccess() {
        loginView.goHome();

        loginView.hideProgressBar();
    }

    @Override
    public void loginError(String error) {
        loginView.enableInputs();
        loginView.hideProgressBar();
        loginView.loginError(error);
    }
}
