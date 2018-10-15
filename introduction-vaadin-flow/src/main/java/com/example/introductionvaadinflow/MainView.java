package com.example.introductionvaadinflow;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@Route("")
@Theme(Lumo.class)
public class MainView extends VerticalLayout {

    public MainView() {

        MyForm myForm = new MyForm();
        add(myForm);

    }
}
