package com.company.projectmanagementdata.view.task;

import com.company.projectmanagementdata.entity.Project;
import com.company.projectmanagementdata.entity.Task;
import com.company.projectmanagementdata.view.main.MainView;
import com.vaadin.flow.component.combobox.dataview.ComboBoxLazyDataView;
import com.vaadin.flow.component.combobox.dataview.ComboBoxListDataView;
import com.vaadin.flow.data.provider.ListDataProvider;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.combobox.JmixComboBox;
import io.jmix.flowui.view.*;

import java.util.ArrayList;

@Route(value = "tasks/:id", layout = MainView.class)
@ViewController(id = "Task_.detail")
@ViewDescriptor(path = "task-detail-view.xml")
@EditedEntityContainer("taskDc")
public class TaskDetailView extends StandardDetailView<Task> {
    
    @ViewComponent
    private JmixComboBox<String> labelField;
    
    private ComboBoxListDataView<String> labelsDataView;

    @Subscribe
    public void onInit(final InitEvent event) {
        labelsDataView = labelField.setItems(new ListDataProvider<>(new ArrayList<>()));
    }

    @Subscribe
    public void onBeforeShow(final BeforeShowEvent event) {
        Project project = getEditedEntity().getProject();
        if (project != null && project.getProjectLabels() != null) {
            labelsDataView.addItems(project.getProjectLabels().getLabels());
        }
    }


    
}