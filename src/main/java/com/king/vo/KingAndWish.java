package com.king.vo;

/**
 * Created by  bin
 * Time： 2017/11/12.
 */
public class KingAndWish {
    String kingName;
    String wish;

    public String getKingName() {
        return kingName;
    }

    public String getWish() {
        return wish;
    }

    public void setKingName(String kingName) {
        this.kingName = kingName;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public KingAndWish(String kingName, String wish) {
        this.kingName = kingName;
        this.wish = wish;
    }
}
