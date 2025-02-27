package com.company.projectmanagementdata.view.grand;

import com.company.projectmanagementdata.entity.Grand;
import com.company.projectmanagementdata.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "grands/:id", layout = MainView.class)
@ViewController(id = "Grand.detail")
@ViewDescriptor(path = "grand-detail-view.xml")
@EditedEntityContainer("grandDc")
public class GrandDetailView extends StandardDetailView<Grand> {
}