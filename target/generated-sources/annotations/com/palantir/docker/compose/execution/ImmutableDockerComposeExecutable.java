package com.palantir.docker.compose.execution;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.palantir.docker.compose.configuration.DockerComposeFiles;
import com.palantir.docker.compose.configuration.ProjectName;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

/**
 * Immutable implementation of {@link DockerComposeExecutable}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDockerComposeExecutable.builder()}.
 * Use the static factory method to create immutable instances:
 * {@code ImmutableDockerComposeExecutable.of()}.
 */
@SuppressWarnings("all")
@ParametersAreNonnullByDefault
@Generated({"Immutables.generator", "DockerComposeExecutable"})
@Immutable
public final class ImmutableDockerComposeExecutable
    extends DockerComposeExecutable {
  private final DockerComposeFiles dockerComposeFiles;
  private final DockerConfiguration dockerConfiguration;
  private final ProjectName projectName;
  private final String dockerComposePath;

  private ImmutableDockerComposeExecutable(
      DockerComposeFiles dockerComposeFiles,
      DockerConfiguration dockerConfiguration) {
    this.dockerComposeFiles = Preconditions.checkNotNull(dockerComposeFiles, "dockerComposeFiles");
    this.dockerConfiguration = Preconditions.checkNotNull(dockerConfiguration, "dockerConfiguration");
    this.projectName = initShim.projectName();
    this.dockerComposePath = initShim.dockerComposePath();
    this.initShim = null;
  }

  private ImmutableDockerComposeExecutable(ImmutableDockerComposeExecutable.Builder builder) {
    this.dockerComposeFiles = builder.dockerComposeFiles;
    this.dockerConfiguration = builder.dockerConfiguration;
    if (builder.projectName != null) {
      initShim.projectName(builder.projectName);
    }
    this.projectName = initShim.projectName();
    this.dockerComposePath = initShim.dockerComposePath();
    this.initShim = null;
  }

  private ImmutableDockerComposeExecutable(
      DockerComposeFiles dockerComposeFiles,
      DockerConfiguration dockerConfiguration,
      ProjectName projectName) {
    this.dockerComposeFiles = dockerComposeFiles;
    this.dockerConfiguration = dockerConfiguration;
    this.projectName = projectName;
    initShim.projectName(projectName);
    this.dockerComposePath = initShim.dockerComposePath();
    this.initShim = null;
  }

  private static final int STAGE_INITIALIZING = -1;
  private static final int STAGE_UNINITIALIZED = 0;
  private static final int STAGE_INITIALIZED = 1;
  private volatile InitShim initShim = new InitShim();

  private final class InitShim {
    private ProjectName projectName;
    private byte projectNameStage;

    ProjectName projectName() {
      if (projectNameStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (projectNameStage == STAGE_UNINITIALIZED) {
        projectNameStage = STAGE_INITIALIZING;
        this.projectName = Preconditions.checkNotNull(ImmutableDockerComposeExecutable.super.projectName(), "projectName");
        projectNameStage = STAGE_INITIALIZED;
      }
      return projectName;
    }

    ProjectName projectName(ProjectName value) {
      this.projectName = value;
      projectNameStage = STAGE_INITIALIZED;
      return value;
    }
    private String dockerComposePath;
    private byte dockerComposePathStage;

    String dockerComposePath() {
      if (dockerComposePathStage == STAGE_INITIALIZING) throw new IllegalStateException(formatInitCycleMessage());
      if (dockerComposePathStage == STAGE_UNINITIALIZED) {
        dockerComposePathStage = STAGE_INITIALIZING;
        this.dockerComposePath = Preconditions.checkNotNull(ImmutableDockerComposeExecutable.super.dockerComposePath(), "dockerComposePath");
        dockerComposePathStage = STAGE_INITIALIZED;
      }
      return dockerComposePath;
    }

    private String formatInitCycleMessage() {
      ArrayList<String> attributes = Lists.newArrayList();
      if (projectNameStage == STAGE_INITIALIZING) attributes.add("projectName");
      if (dockerComposePathStage == STAGE_INITIALIZING) attributes.add("dockerComposePath");
      return "Cannot build DockerComposeExecutable, attribute initializers form cycle" + attributes;
    }
  }

  /**
   * @return The value of the {@code dockerComposeFiles} attribute
   */
  @Override
  protected DockerComposeFiles dockerComposeFiles() {
    return dockerComposeFiles;
  }

  /**
   * @return The value of the {@code dockerConfiguration} attribute
   */
  @Override
  protected DockerConfiguration dockerConfiguration() {
    return dockerConfiguration;
  }

  /**
   * @return The value of the {@code projectName} attribute
   */
  @Override
  public ProjectName projectName() {
    return initShim != null
        ? initShim.projectName()
        : projectName;
  }

  /**
   * @return The computed-at-construction value of the {@code dockerComposePath} attribute
   */
  @Override
  protected String dockerComposePath() {
    return initShim != null
        ? initShim.dockerComposePath()
        : dockerComposePath;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DockerComposeExecutable#dockerComposeFiles() dockerComposeFiles} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dockerComposeFiles
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDockerComposeExecutable withDockerComposeFiles(DockerComposeFiles value) {
    if (this.dockerComposeFiles == value) return this;
    return new ImmutableDockerComposeExecutable(
        Preconditions.checkNotNull(value, "dockerComposeFiles"),
        this.dockerConfiguration,
        this.projectName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DockerComposeExecutable#dockerConfiguration() dockerConfiguration} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for dockerConfiguration
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDockerComposeExecutable withDockerConfiguration(DockerConfiguration value) {
    if (this.dockerConfiguration == value) return this;
    return new ImmutableDockerComposeExecutable(
        this.dockerComposeFiles,
        Preconditions.checkNotNull(value, "dockerConfiguration"),
        this.projectName);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DockerComposeExecutable#projectName() projectName} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for projectName
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDockerComposeExecutable withProjectName(ProjectName value) {
    if (this.projectName == value) return this;
    return new ImmutableDockerComposeExecutable(
        this.dockerComposeFiles,
        this.dockerConfiguration,
        Preconditions.checkNotNull(value, "projectName"));
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDockerComposeExecutable} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDockerComposeExecutable
        && equalTo((ImmutableDockerComposeExecutable) another);
  }

  private boolean equalTo(ImmutableDockerComposeExecutable another) {
    return dockerComposeFiles.equals(another.dockerComposeFiles)
        && dockerConfiguration.equals(another.dockerConfiguration)
        && projectName.equals(another.projectName)
        && dockerComposePath.equals(another.dockerComposePath);
  }

  /**
   * Computes a hash code from attributes: {@code dockerComposeFiles}, {@code dockerConfiguration}, {@code projectName}, {@code dockerComposePath}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 31;
    h = h * 17 + dockerComposeFiles.hashCode();
    h = h * 17 + dockerConfiguration.hashCode();
    h = h * 17 + projectName.hashCode();
    h = h * 17 + dockerComposePath.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code DockerComposeExecutable...} with all non-generated
   * and non-auxiliary attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return MoreObjects.toStringHelper("DockerComposeExecutable")
        .add("dockerComposeFiles", dockerComposeFiles)
        .add("dockerConfiguration", dockerConfiguration)
        .add("projectName", projectName)
        .add("dockerComposePath", dockerComposePath)
        .toString();
  }

  /**
   * Construct a new immutable {@code DockerComposeExecutable} instance.
   * @param dockerComposeFiles The value for the {@code dockerComposeFiles} attribute
   * @param dockerConfiguration The value for the {@code dockerConfiguration} attribute
   * @return An immutable DockerComposeExecutable instance
   */
  public static ImmutableDockerComposeExecutable of(DockerComposeFiles dockerComposeFiles, DockerConfiguration dockerConfiguration) {
    return new ImmutableDockerComposeExecutable(dockerComposeFiles, dockerConfiguration);
  }

  /**
   * Creates an immutable copy of a {@link DockerComposeExecutable} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DockerComposeExecutable instance
   */
  public static ImmutableDockerComposeExecutable copyOf(DockerComposeExecutable instance) {
    if (instance instanceof ImmutableDockerComposeExecutable) {
      return (ImmutableDockerComposeExecutable) instance;
    }
    return ImmutableDockerComposeExecutable.builder()
        .from(instance)
        .build();
  }

  /**
   * Creates a builder for {@link ImmutableDockerComposeExecutable ImmutableDockerComposeExecutable}.
   * @return A new ImmutableDockerComposeExecutable builder
   */
  public static ImmutableDockerComposeExecutable.Builder builder() {
    return new ImmutableDockerComposeExecutable.Builder();
  }

  /**
   * Builds instances of type {@link ImmutableDockerComposeExecutable ImmutableDockerComposeExecutable}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @NotThreadSafe
  public static final class Builder {
    private static final long INIT_BIT_DOCKER_COMPOSE_FILES = 0x1L;
    private static final long INIT_BIT_DOCKER_CONFIGURATION = 0x2L;
    private long initBits = 0x3;

    private @Nullable DockerComposeFiles dockerComposeFiles;
    private @Nullable DockerConfiguration dockerConfiguration;
    private @Nullable ProjectName projectName;

    private Builder() {
    }

    /**
     * Fill a builder with attribute values from the provided {@code DockerComposeExecutable} instance.
     * Regular attribute values will be replaced with those from the given instance.
     * Absent optional values will not replace present values.
     * @param instance The instance from which to copy values
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder from(DockerComposeExecutable instance) {
      Preconditions.checkNotNull(instance, "instance");
      dockerComposeFiles(instance.dockerComposeFiles());
      dockerConfiguration(instance.dockerConfiguration());
      projectName(instance.projectName());
      return this;
    }

    /**
     * Initializes the value for the {@link DockerComposeExecutable#dockerComposeFiles() dockerComposeFiles} attribute.
     * @param dockerComposeFiles The value for dockerComposeFiles 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder dockerComposeFiles(DockerComposeFiles dockerComposeFiles) {
      this.dockerComposeFiles = Preconditions.checkNotNull(dockerComposeFiles, "dockerComposeFiles");
      initBits &= ~INIT_BIT_DOCKER_COMPOSE_FILES;
      return this;
    }

    /**
     * Initializes the value for the {@link DockerComposeExecutable#dockerConfiguration() dockerConfiguration} attribute.
     * @param dockerConfiguration The value for dockerConfiguration 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder dockerConfiguration(DockerConfiguration dockerConfiguration) {
      this.dockerConfiguration = Preconditions.checkNotNull(dockerConfiguration, "dockerConfiguration");
      initBits &= ~INIT_BIT_DOCKER_CONFIGURATION;
      return this;
    }

    /**
     * Initializes the value for the {@link DockerComposeExecutable#projectName() projectName} attribute.
     * <p><em>If not set, this attribute will have a default value as returned by the initializer of {@link DockerComposeExecutable#projectName() projectName}.</em>
     * @param projectName The value for projectName 
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder projectName(ProjectName projectName) {
      this.projectName = Preconditions.checkNotNull(projectName, "projectName");
      return this;
    }

    /**
     * Builds a new {@link ImmutableDockerComposeExecutable ImmutableDockerComposeExecutable}.
     * @return An immutable instance of DockerComposeExecutable
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImmutableDockerComposeExecutable build() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
      return new ImmutableDockerComposeExecutable(this);
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = Lists.newArrayList();
      if ((initBits & INIT_BIT_DOCKER_COMPOSE_FILES) != 0) attributes.add("dockerComposeFiles");
      if ((initBits & INIT_BIT_DOCKER_CONFIGURATION) != 0) attributes.add("dockerConfiguration");
      return "Cannot build DockerComposeExecutable, some of required attributes are not set " + attributes;
    }
  }
}
