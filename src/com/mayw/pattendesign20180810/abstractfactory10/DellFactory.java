package com.mayw.pattendesign20180810.abstractfactory10;

public class DellFactory extends PcFactory {
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
