package com.lpphan.mvp.view;

/**
 * Created by lamphuong on 14/12/2015.
 */
public interface MvpLoadingView<M> extends MvpView{
    void showLoading();
    void showError(Throwable throwable, boolean pullToRefresh);
    void showContent(M model, boolean pullToRefresh);
}
