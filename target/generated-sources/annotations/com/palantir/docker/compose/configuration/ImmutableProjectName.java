package com.palantir.docker.compose.configuration;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link ProjectName}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableProjectName.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableProjectName.of()}.
 */
@SuppressWarnings("all")
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "ProjectName"})
@Immutable
final class ImmutableProjectName extends ProjectName {
  private final String projectName;

  private ImmutableProjectName(String projectName) {
    this.projectName = Preconditions.checkNotNull(projectName, "projectName");
  }

  private ImmutableProjectName(ImmutableProjectName original, String projectName) {
    this.projectName = projectName;
  }

  /**
   * @return The value of the {@code projectName} attribute
   */
  @Override
  protected String projectName() {
    return projectName;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ProjectName#projectName() projectName} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for projectName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProjectName withProjectName(String value) {
    if (this.projectName.equals(value)) return this;
    return validate(new ImmutableProjectName(this, Preconditions.checkNotNull(value, "projectName")));
  }

  /**
   * This instance is equal to all instances of {@code ImmutableProjectName} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableProjectName
        && equalTo((ImmutableProjectName) another);
  }

  private boolean equalTo(ImmutableProjectName another) {
    return projectName.equals(another.projectName);
  }

  /**
   * Computes a hash code from attributes: {@code projectName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + projectName.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ProjectName...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("ProjectName")
        .add("projectName", projectName)
        .toString();
  }

  /**
   * Construct a new immutable {@code ProjectName} instance.
   * @param projectName The value for the {@code projectName} attribute
   * @return An immutable ProjectName instance
   */
  public static ImmutableProjectName of(String projectName) {
    return validate(new ImmutableProjectName(projectName));
  }

  private static ImmutableProjectName validate(ImmutableProjectName instance) {
    instance.validate();
    return instance;
  }

  /**
   * Creates an immutable copy of a {@link ProjectName} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ProjectName instance
   */
  public static ImmutableProjectName copyOf(ProjectName instance) {
    if (instance instanceof ImmutableProjectName) {
      return (ImmutableProjectName) instance;
    }
    return ImmutableProjectName.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableProjectName ImmutableProjectName}.
   * @return A new ImmutableProjectName builder
   */
  public static ImmutableProjectName.Builder builder() {
    return new ImmutableProjectName.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableProjectName ImmutableProjectName}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  static final class Builder {
    private static final long INIT_BIT_PROJECT_NAME = 0x1L;
    private long initBits = 0x1;

    private @Nullable String projectName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code ProjectName} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(ProjectName instance) {
      Preconditions.checkNotNull(instance, "instance");
      projectName(instance.projectName());
      return this;
    }

    /**
     * Initializes the value for the {@link ProjectName#projectName() projectName} attribute.
     * @param projectName The value for projectName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder projectName(String projectName) {
      this.projectName = Preconditions.checkNotNull(projectName, "projectName");
      initBits &= ~INIT_BIT_PROJECT_NAME;
      return this;
    }

    /**
     * Builds a new {@link ImmutableProjectName ImmutableProjectName}.
     * @return An immutable instance of ProjectName
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableProjectName build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return ImmutableProjectName.validate(new ImmutableProjectName(null, projectName));
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_PROJECT_NAME) != 0) attributes.add("projectName");
      return "Cannot build ProjectName, some of required attributes are not set " + attributes;
    }
  }
}
