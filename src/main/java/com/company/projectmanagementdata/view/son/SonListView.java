package com.company.projectmanagementdata.view.son;

import com.company.projectmanagementdata.entity.Son;
import com.company.projectmanagementdata.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "sons", layout = MainView.class)
@ViewController(id = "Son.list")
@ViewDescriptor(path = "son-list-view.xml")
@LookupComponent("sonsDataGrid")
@DialogMode(width = "64em")
public class SonListView extends StandardListView<Son> {
}