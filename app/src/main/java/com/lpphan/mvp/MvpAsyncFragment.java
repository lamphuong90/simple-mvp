package com.lpphan.mvp;

import com.lpphan.mvp.presenter.BaseLoadingPresenter;
import com.lpphan.mvp.view.MvpLoadingView;

/**
 * Created by lamphuong on 14/12/2015.
 */
public abstract class MvpAsyncFragment<M,V extends MvpLoadingView<M>,P extends BaseLoadingPresenter<M,V>> extends MvpFragment<V,P> {
}
