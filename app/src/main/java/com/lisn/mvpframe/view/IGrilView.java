package com.lisn.mvpframe.view;



import com.lisn.mvpframe.bean.Girl;

import java.util.List;



public interface IGrilView {
    /**
     * UI业务逻辑   加载进度条
     */
    void showLoading();

    void showGrils(List<Girl> grils);
}
