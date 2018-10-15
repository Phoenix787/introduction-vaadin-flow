package com.example.introductionvaadinflow;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("form-buttons-bar")
@HtmlImport("src/form-buttons-bar.html")
public class FormButtonsBar extends PolymerTemplate<TemplateModel> {

    @Id("save")
    private Button saveBtn;

    @Id("cancel")
    private Button cancelBtn;

    @Id("delete")
    private Button deleteBtn;

    public FormButtonsBar() {
        saveBtn.addClickListener(e -> Notification.show("Clicked save button", 5000, Notification.Position.MIDDLE));
    }
}
