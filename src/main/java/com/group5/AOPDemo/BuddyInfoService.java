package com.group5.AOPDemo;

import com.group5.AOPDemo.BuddyInfo;

public class BuddyInfoService {

    private BuddyInfo buddy;

    public BuddyInfo getBuddyInfo(){
        return this.buddy;
    }

    public void setBuddyInfo(BuddyInfo buddy){
        this.buddy = buddy;
    }
}