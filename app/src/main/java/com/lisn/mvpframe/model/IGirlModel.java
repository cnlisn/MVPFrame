package com.lisn.mvpframe.model;


import com.lisn.mvpframe.bean.Girl;

import java.util.List;

/**
 * 监听数据返回
 */

public interface IGirlModel {
    void loadGirl(GirlOnLoadlitener girlOnLoadlitener);
    interface  GirlOnLoadlitener
    {
        void  onComplete(List<Girl> girls);
    }
}
