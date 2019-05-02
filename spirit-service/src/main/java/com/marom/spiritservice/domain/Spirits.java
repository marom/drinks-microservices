package com.marom.spiritservice.domain;

import java.util.List;

public class Spirits {

    private List<Spirit> spirits;

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
