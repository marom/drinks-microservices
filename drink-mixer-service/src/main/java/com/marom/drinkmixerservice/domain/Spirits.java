package com.marom.drinkmixerservice.domain;

import java.util.List;

public class Spirits {

    private List<Spirit> spirits;

    public Spirits() {
    }

    public Spirits(List<Spirit> spirits) {
        this.spirits = spirits;
    }

    public List<Spirit> getSpirits() {
        return spirits;
    }

    public void setSpirits(List<Spirit> spirits) {
        this.spirits = spirits;
    }
}
