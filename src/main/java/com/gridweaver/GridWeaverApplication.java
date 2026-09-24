package com.gridweaver;

import com.gridweaver.model.MicrogridState;
import com.gridweaver.service.MicrogridStateService;

public class GridWeaverApplication {

    public static void main(String[] args) {

        MicrogridState state = new MicrogridState(
                230.0,
                50.0,
                1200.0,
                85.0,
                true
        );

        MicrogridStateService service = new MicrogridStateService();

        service.processState(state);
    }
}