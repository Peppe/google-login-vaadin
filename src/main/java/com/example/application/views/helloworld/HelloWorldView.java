package com.example.application.views.helloworld;

import com.example.application.views.main.MainView;

import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@Route(value = "hello", layout = MainView.class)
@RouteAlias(value = "", layout = MainView.class)
@PageTitle("Hello World")
public class HelloWorldView extends VerticalLayout {

    public HelloWorldView() {
        GoogleLogin googleLogin = new GoogleLogin();
        add(googleLogin);
        googleLogin.setLoggedInListener(token ->
                add(new Paragraph("User logged in token logged in: " + token)));
    }

}
