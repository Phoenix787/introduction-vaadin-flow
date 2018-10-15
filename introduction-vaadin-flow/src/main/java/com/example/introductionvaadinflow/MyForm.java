package com.example.introductionvaadinflow;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.polymertemplate.TemplateParser;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.templatemodel.TemplateModel;

@Tag("my-form")
@HtmlImport("src/my-form.html")
public class MyForm extends PolymerTemplate<MyForm.FormModel> {

    @Id("name")
    private TextField name;

    @Id("email")
    private TextField email;

    @Id("submit")
    private Button submit;

    @Id("buttons")
    private FormButtonsBar buttonsBar;

    public MyForm() {
        submit.addClickListener(buttonEvent->{
            String text = name.getValue() + " " + email.getValue();
            Notification.show(text, 3000, Notification.Position.BOTTOM_START);
        });
    }

    public interface FormModel extends TemplateModel{

    }
}
