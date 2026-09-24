package com.gridweaver.service;

import com.gridweaver.model.MicrogridState;

public class MicrogridStateService {

    public void processState(MicrogridState state) {
        System.out.println("Processing Microgrid State...");
        System.out.println(state);
    }
}