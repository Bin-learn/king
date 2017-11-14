package com.king.pojo;

public class KingAngle {
    private String king;

    private String angle;

    private String wish;

    public KingAngle(String king, String angle, String wish) {
        this.king = king;
        this.angle = angle;
        this.wish = wish;
    }

    public KingAngle() {
        super();
    }

    public String getKing() {
        return king;
    }

    public void setKing(String king) {
        this.king = king == null ? null : king.trim();
    }

    public String getAngle() {
        return angle;
    }

    public void setAngle(String angle) {
        this.angle = angle == null ? null : angle.trim();
    }

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish == null ? null : wish.trim();
    }
}