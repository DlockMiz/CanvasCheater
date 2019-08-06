package com.canvas.cheater.models.assignment_models;

public class LockInfo {
    private String lock_at;
    private boolean can_view;
    private String asset_string;

    public String getLock_at() {
        return lock_at;
    }

    public void setLock_at(String lock_at) {
        this.lock_at = lock_at;
    }

    public boolean isCan_view() {
        return can_view;
    }

    public void setCan_view(boolean can_view) {
        this.can_view = can_view;
    }

    public String getAsset_string() {
        return asset_string;
    }

    public void setAsset_string(String asset_string) {
        this.asset_string = asset_string;
    }
}
