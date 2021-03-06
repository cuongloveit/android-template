package vn.tiki.viewholders.compiler;

import com.squareup.javapoet.ClassName;

class ViewHolderInfo {

  private final boolean hasBindMethod;
  private final boolean hasBindViewMethod;
  private final boolean hasUnBindMethod;
  private final Id layout;
  private final ClassName modelType;
  private final Id[] onClick;
  private final ClassName targetType;

  ViewHolderInfo(
      final ClassName targetType,
      final Id layout,
      final Id[] onClick,
      final ClassName modelType,
      final boolean hasBindMethod,
      final boolean hasUnBindMethod,
      final boolean hasBindViewMethod) {
    this.layout = layout;
    this.onClick = onClick;
    this.modelType = modelType;
    this.hasBindMethod = hasBindMethod;
    this.hasUnBindMethod = hasUnBindMethod;
    this.hasBindViewMethod = hasBindViewMethod;
    this.targetType = targetType;
  }

  Id getLayout() {
    return layout;
  }

  ClassName getModelType() {
    return modelType;
  }

  Id[] getOnClick() {
    return onClick;
  }

  ClassName getTargetType() {
    return targetType;
  }

  boolean hasBindMethod() {
    return hasBindMethod;
  }

  boolean hasBindViewMethod() {
    return hasBindViewMethod;
  }

  boolean hasUnBindMethod() {
    return hasUnBindMethod;
  }
}
