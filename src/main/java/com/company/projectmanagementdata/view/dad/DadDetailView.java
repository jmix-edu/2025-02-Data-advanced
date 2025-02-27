package com.company.projectmanagementdata.view.dad;

import com.company.projectmanagementdata.entity.Dad;
import com.company.projectmanagementdata.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "dads/:id", layout = MainView.class)
@ViewController(id = "Dad.detail")
@ViewDescriptor(path = "dad-detail-view.xml")
@EditedEntityContainer("dadDc")
public class DadDetailView extends StandardDetailView<Dad> {
}