package com.company.projectmanagementdata.view.grand;

import com.company.projectmanagementdata.entity.Grand;
import com.company.projectmanagementdata.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "grands", layout = MainView.class)
@ViewController(id = "Grand.list")
@ViewDescriptor(path = "grand-list-view.xml")
@LookupComponent("grandsDataGrid")
@DialogMode(width = "64em")
public class GrandListView extends StandardListView<Grand> {
}