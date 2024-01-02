package com.udla.productos.views.nuevoproducto;

import com.udla.productos.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Nuevo Producto")
@Route(value = "nuevo-producto", layout = MainLayout.class)
@Uses(Icon.class)
public class NuevoProductoView extends Composite<VerticalLayout> {

    public NuevoProductoView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        TextField textField5 = new TextField();
        TextField textField6 = new TextField();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        textField.setLabel("Codigo");
        textField.setWidth("min-content");
        textField2.setLabel("Nombre");
        textField2.setWidth("min-content");
        layoutRow2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.setHeight("min-content");
        textField3.setLabel("Precio Unitario");
        textField3.setWidth("min-content");
        textField4.setLabel("Cantidad");
        textField4.setWidth("min-content");
        layoutRow3.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.setHeight("min-content");
        textField5.setLabel("Peso");
        textField5.setWidth("min-content");
        textField6.setLabel("Fecha Caducidad");
        textField6.setWidth("min-content");
        layoutRow4.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow4);
        layoutRow4.addClassName(Gap.MEDIUM);
        layoutRow4.setWidth("100%");
        layoutRow4.setHeight("min-content");
        buttonPrimary.setText("Guardar");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Cancelar");
        buttonSecondary.setWidth("min-content");
        getContent().add(layoutRow);
        layoutRow.add(textField);
        layoutRow.add(textField2);
        getContent().add(layoutRow2);
        layoutRow2.add(textField3);
        layoutRow2.add(textField4);
        getContent().add(layoutRow3);
        layoutRow3.add(textField5);
        layoutRow3.add(textField6);
        getContent().add(layoutRow4);
        layoutRow4.add(buttonPrimary);
        layoutRow4.add(buttonSecondary);
    }
}
