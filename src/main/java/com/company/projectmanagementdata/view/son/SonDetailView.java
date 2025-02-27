package com.company.projectmanagementdata.view.son;

import com.company.projectmanagementdata.entity.Son;
import com.company.projectmanagementdata.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "sons/:id", layout = MainView.class)
@ViewController(id = "Son.detail")
@ViewDescriptor(path = "son-detail-view.xml")
@EditedEntityContainer("sonDc")
public class SonDetailView extends StandardDetailView<Son> {
}