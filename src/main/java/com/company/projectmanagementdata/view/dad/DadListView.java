package com.company.projectmanagementdata.view.dad;

import com.company.projectmanagementdata.entity.Dad;
import com.company.projectmanagementdata.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "dads", layout = MainView.class)
@ViewController(id = "Dad.list")
@ViewDescriptor(path = "dad-list-view.xml")
@LookupComponent("dadsDataGrid")
@DialogMode(width = "64em")
public class DadListView extends StandardListView<Dad> {
}