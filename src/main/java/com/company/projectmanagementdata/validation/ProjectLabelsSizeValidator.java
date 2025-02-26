package com.company.projectmanagementdata.validation;

import com.company.projectmanagementdata.datatype.ProjectLabels;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class ProjectLabelsSizeValidator implements ConstraintValidator<ProjectLabelsSize, ProjectLabels> {

    private int min;
    private int max;

    @Override
    public void initialize(ProjectLabelsSize constraintAnnotation) {
        min = constraintAnnotation.min();
        max = constraintAnnotation.max();

    }

    @Override
    public boolean isValid(ProjectLabels projectLabels, ConstraintValidatorContext constraintValidatorContext) {
        if(projectLabels == null) {
            return false;
        }

        List<String> labels = projectLabels.getLabels();

        return labels.size() >= min && labels.size() <= max;
    }
}
